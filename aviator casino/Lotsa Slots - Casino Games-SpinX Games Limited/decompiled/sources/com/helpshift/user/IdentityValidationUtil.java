package com.helpshift.user;

/* loaded from: classes5.dex */
public class IdentityValidationUtil {
    private static final java.lang.String TAG = "IdentityValidationUtils";

    private IdentityValidationUtil() {
    }

    static void addUserIdentities(com.helpshift.user.BaseUser baseUser, com.helpshift.platform.Device device, java.lang.String str, com.helpshift.chat.HSEventProxy hSEventProxy) {
        if ((baseUser instanceof com.helpshift.user.AnonymousUserWithIdentity) || !(baseUser instanceof com.helpshift.user.UserWithIdentity)) {
            com.helpshift.log.HSLogger.d(TAG, "API call not allowed for user type other than Identity user");
            return;
        }
        if (!com.helpshift.util.Utils.isJWTValid(str, device)) {
            com.helpshift.log.HSLogger.d(TAG, "Bad identity token.Can't add user identities");
            hSEventProxy.sendEvent("identityTokenInvalid", null);
            return;
        }
        com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) baseUser;
        if (com.helpshift.util.Utils.getSignatureFromJwtToken(str).equals(userWithIdentity.getSignature())) {
            com.helpshift.log.HSLogger.d(TAG, "Skipping call since current user has same identities");
            return;
        }
        org.json.JSONObject jsonObjectFromJwt = com.helpshift.util.Utils.getJsonObjectFromJwt(device, str);
        if (com.helpshift.util.JsonUtils.isEmpty(jsonObjectFromJwt)) {
            com.helpshift.log.HSLogger.d(TAG, "Empty json object in token");
            hSEventProxy.sendEvent("identityTokenInvalid", null);
            return;
        }
        if (jsonObjectFromJwt.optLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_IAT, 0L) == 0) {
            com.helpshift.log.HSLogger.d(TAG, "iat is mandatory in token");
            hSEventProxy.sendEvent("iatIsMandatory", null);
        } else if (userWithIdentity.getUnSyncIdentitiesList().size() > 1000) {
            com.helpshift.log.HSLogger.d(TAG, "UnSync storage limit for identities exceeded");
        } else if (!validateAddIdentitiesData(jsonObjectFromJwt, hSEventProxy)) {
            com.helpshift.log.HSLogger.d(TAG, "Invalid Data.Failing addUserIdentities call");
        } else {
            userWithIdentity.addUnSyncIdentities(str);
        }
    }

    private static boolean validateAddIdentitiesData(org.json.JSONObject jSONObject, com.helpshift.chat.HSEventProxy hSEventProxy) {
        java.util.List<com.helpshift.user.InternalIdentity> identitiesFromTokenJsonObject = getIdentitiesFromTokenJsonObject(jSONObject);
        if (com.helpshift.util.Utils.isEmpty(identitiesFromTokenJsonObject)) {
            com.helpshift.log.HSLogger.d(TAG, "Identity data is empty or invalid");
            hSEventProxy.sendEvent("identityTokenInvalid", null);
            return false;
        }
        if (identitiesFromTokenJsonObject.size() > 100) {
            com.helpshift.log.HSLogger.d(TAG, "Identity data exceeds limit");
            hSEventProxy.sendEvent(com.helpshift.HelpshiftEvent.IDENTITY_DATA_LIMIT_EXCEEDED, null);
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(validateIdentityList(identitiesFromTokenJsonObject));
        if (arrayList.isEmpty()) {
            return true;
        }
        com.helpshift.log.HSLogger.d(TAG, "Identity data contains invalid data");
        com.helpshift.user.IdentityAttributesUtil.sendUserIdentityAttributeFailureEvent(com.helpshift.HelpshiftEvent.IDENTITY_DATA_INVALID, arrayList, hSEventProxy);
        return false;
    }

    private static java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> validateIdentityList(java.util.List<com.helpshift.user.InternalIdentity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.helpshift.user.InternalIdentity internalIdentity = list.get(i);
            java.lang.String validateIdentity = validateIdentity(internalIdentity);
            if (!com.helpshift.util.Utils.isEmpty(validateIdentity)) {
                arrayList.add(com.helpshift.util.ValuePair.from(internalIdentity.identityKey, validateIdentity));
            }
        }
        return arrayList;
    }

    private static java.lang.String validateIdentity(com.helpshift.user.InternalIdentity internalIdentity) {
        if (com.helpshift.util.Utils.isEmpty(internalIdentity.identityKey) || com.helpshift.util.Utils.isEmpty(internalIdentity.identityValue)) {
            return com.helpshift.user.error.InvalidDataErrorReason.EMPTY_DATA;
        }
        if (internalIdentity.identityKey.length() > 1000) {
            return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_KEY_LENGTH_LIMIT;
        }
        if (internalIdentity.identityValue.length() > 10000) {
            return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_VALUE_LENGTH_LIMIT;
        }
        return validateIdentityMetaDataMap(internalIdentity.metaData);
    }

    private static java.lang.String validateIdentityMetaDataMap(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.size() > 100) {
            return com.helpshift.user.error.InvalidDataErrorReason.META_DATA_EXCEEDED_COUNT_LIMIT;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String value = entry.getValue();
            java.lang.String key = entry.getKey();
            if (com.helpshift.util.Utils.isEmpty(key) || value == null) {
                return com.helpshift.user.error.InvalidDataErrorReason.METADATA_EMPTY_KEY_OR_VALUE;
            }
            if (key.length() > 1000) {
                return com.helpshift.user.error.InvalidDataErrorReason.META_DATA_EXCEEDED_KEY_LENGTH_LIMIT;
            }
            if (value.length() > 10000) {
                return com.helpshift.user.error.InvalidDataErrorReason.META_DATA_EXCEEDED_VALUE_LENGTH_LIMIT;
            }
        }
        return "";
    }

    static com.helpshift.util.ValuePair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validateIdentitiesForLogin(java.util.List<com.helpshift.user.InternalIdentity> list, boolean z) {
        if (list == null) {
            com.helpshift.log.HSLogger.d(TAG, "Identity data is empty or contains null entries");
            return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.IDENTITIES_DATA_INVALID, null);
        }
        if (list.size() > 100) {
            com.helpshift.log.HSLogger.d(TAG, "Identity data exceeded limit");
            return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.IDENTITIES_SIZE_LIMIT_EXCEEDED, null);
        }
        java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> validateIdentityList = validateIdentityList(list);
        if (!validateIdentityList.isEmpty()) {
            return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.IDENTITIES_DATA_INVALID, getErrorMapFromValuePair(validateIdentityList));
        }
        if (list.isEmpty() || z || isUidOrEmailPresent(list)) {
            return null;
        }
        return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.UID_OR_EMAIL_IS_MANDATORY, null);
    }

    private static java.util.Map<java.lang.String, java.lang.String> getErrorMapFromValuePair(java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.helpshift.util.ValuePair<java.lang.String, java.lang.String> valuePair : list) {
            hashMap.put(valuePair.first, valuePair.second);
        }
        return hashMap;
    }

    static com.helpshift.util.ValuePair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validateLoginConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        map.remove(null);
        map.remove("");
        if (map.size() > 100) {
            com.helpshift.log.HSLogger.d(TAG, "Login Config exceeded limit");
            return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.LOGIN_CONFIG_SIZE_LIMIT_EXCEEDED, null);
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            if (value == null) {
                arrayList.add(com.helpshift.util.ValuePair.from(key, com.helpshift.user.error.InvalidDataErrorReason.EMPTY_DATA));
            } else if (key.length() > 1000) {
                arrayList.add(com.helpshift.util.ValuePair.from(key, com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_KEY_LENGTH_LIMIT));
            } else if (!(value instanceof java.lang.Number) && !(value instanceof java.lang.Boolean) && !(value instanceof java.lang.String)) {
                arrayList.add(com.helpshift.util.ValuePair.from(key, com.helpshift.user.error.InvalidDataErrorReason.INVALID_VALUE_TYPE));
            } else if ((value instanceof java.lang.String) && ((java.lang.String) value).length() > 10000) {
                arrayList.add(com.helpshift.util.ValuePair.from(key, com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_VALUE_LENGTH_LIMIT));
            }
        }
        if (com.helpshift.util.Utils.isEmpty(arrayList)) {
            return null;
        }
        return com.helpshift.util.ValuePair.from(com.helpshift.user.error.UserLoginFailureReason.LOGIN_CONFIG_INVALID, getErrorMapFromValuePair(arrayList));
    }

    private static boolean isUidOrEmailPresent(java.util.List<com.helpshift.user.InternalIdentity> list) {
        return list.isEmpty() || com.helpshift.user.InternalIdentityUtils.isIdentifierPresent(list, "uid") || com.helpshift.user.InternalIdentityUtils.isIdentifierPresent(list, "email");
    }

    static java.util.List<com.helpshift.user.InternalIdentity> getIdentitiesFromTokenJsonObject(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("identities");
            return com.helpshift.util.JsonUtils.isEmpty(optJSONArray) ? arrayList : com.helpshift.user.InternalIdentityUtils.getIdentityFromJsonArrayString(optJSONArray.toString());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting identities fromm  JWT json object", e);
            return arrayList;
        }
    }

    static boolean isNewIdentityUserSame(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        boolean booleanValue = ((java.lang.Boolean) com.helpshift.util.Utils.getOrDefault(map2, com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false)).booleanValue();
        java.lang.String str = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map2, com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, "");
        java.lang.String str2 = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, "");
        java.lang.String str3 = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map2, com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, "");
        java.lang.String str4 = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, "");
        if (booleanValue != booleanValue2 || !str.equals(str2)) {
            return false;
        }
        java.util.List listFromJsonArrayString = com.helpshift.util.JsonUtils.listFromJsonArrayString(str3);
        java.util.Iterator it = com.helpshift.util.JsonUtils.listFromJsonArrayString(str4).iterator();
        while (it.hasNext()) {
            if (!listFromJsonArrayString.contains((java.lang.String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
