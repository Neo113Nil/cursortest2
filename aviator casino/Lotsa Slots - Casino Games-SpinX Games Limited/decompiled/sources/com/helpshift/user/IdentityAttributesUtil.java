package com.helpshift.user;

/* loaded from: classes5.dex */
public class IdentityAttributesUtil {
    public static final int MAX_ENTRIES_IDENTITY = 100;
    public static final int MAX_LENGTH_IN_MAP_ATTRIBUTE = 100000;
    public static final int MAX_LENGTH_PER_KEY = 1000;
    public static final int MAX_LENGTH_PER_VALUE = 10000;
    public static final int MAX_UNSYNC_STORAGE_LIMIT = 1000;
    private static final java.lang.String TAG = "IdentityAttributesManager";
    private static final java.lang.String ATTRIBUTE_APP_VERSION = "app_version";
    private static final java.lang.String ATTRIBUTE_SDK_VERSION = "sdk_version";
    private static final java.lang.String ATTRIBUTE_OS_VERSION = "os_version";
    private static final java.lang.String ATTRIBUTE_DEVICE_MODEL = "device_model";
    public static final java.lang.String ATTRIBUTE_PUSH_TOKEN = "push_token";
    public static final java.util.List<java.lang.String> sdkCollectibleAttributeKeys = new java.util.ArrayList(java.util.Arrays.asList(ATTRIBUTE_APP_VERSION, ATTRIBUTE_SDK_VERSION, ATTRIBUTE_OS_VERSION, ATTRIBUTE_DEVICE_MODEL, ATTRIBUTE_PUSH_TOKEN));

    private IdentityAttributesUtil() {
    }

    public static void updateMasterAttributes(com.helpshift.user.BaseUser baseUser, java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.chat.HSEventProxy hSEventProxy) {
        if (!(baseUser instanceof com.helpshift.user.UserWithIdentity)) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update master attributes. Invalid user type");
            return;
        }
        com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) baseUser;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.remove("");
        hashMap.remove(null);
        castPrimitiveValuesToString(hashMap);
        com.helpshift.util.Utils.removeNullValues(hashMap);
        if (hashMap.isEmpty()) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update master attributes. Received empty data");
            return;
        }
        if (hashMap.size() > 100) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update master attributes. Received max entries");
            hSEventProxy.sendEvent(com.helpshift.HelpshiftEvent.MASTER_ATTRIBUTES_LIMIT_EXCEEDED, null);
            return;
        }
        java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> validateMasterOrAppAttributes = validateMasterOrAppAttributes(hashMap);
        if (validateMasterOrAppAttributes.size() > 0) {
            sendUserIdentityAttributeFailureEvent(com.helpshift.HelpshiftEvent.MASTER_ATTRIBUTES_VALIDATION_FAILED, validateMasterOrAppAttributes, hSEventProxy);
        } else if (userWithIdentity.getUnsyncedMasterAttributes().size() > 1000) {
            com.helpshift.log.HSLogger.d(TAG, "UnSync storage limit for master attributes exceeded");
        } else {
            userWithIdentity.addUnsyncedMasterAttributes(hashMap);
        }
    }

    public static void updateAppAttributes(com.helpshift.user.BaseUser baseUser, java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.chat.HSEventProxy hSEventProxy) {
        if (!(baseUser instanceof com.helpshift.user.UserWithIdentity)) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update app attributes. Invalid user type");
            return;
        }
        com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) baseUser;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.remove("");
        hashMap.remove(null);
        castPrimitiveValuesToString(hashMap);
        com.helpshift.util.Utils.removeNullValues(hashMap);
        if (hashMap.isEmpty()) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update app attributes. Received empty data");
            return;
        }
        if (hashMap.size() > 100) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update app attributes. Received max entries");
            hSEventProxy.sendEvent(com.helpshift.HelpshiftEvent.APP_ATTRIBUTES_LIMIT_EXCEEDED, null);
            return;
        }
        java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> validateMasterOrAppAttributes = validateMasterOrAppAttributes(hashMap);
        if (validateMasterOrAppAttributes.size() > 0) {
            com.helpshift.log.HSLogger.d(TAG, "Can't update app attributes. Validation failed");
            sendUserIdentityAttributeFailureEvent(com.helpshift.HelpshiftEvent.APP_ATTRIBUTES_VALIDATION_FAILED, validateMasterOrAppAttributes, hSEventProxy);
        } else {
            if (userWithIdentity.getUnsyncAppAttributes().size() > 1000) {
                com.helpshift.log.HSLogger.d(TAG, "UnSync storage limit for app attributes exceeded");
                return;
            }
            userWithIdentity.removeExistingAppAttributes(hashMap, sdkCollectibleAttributeKeys);
            if (hashMap.isEmpty()) {
                return;
            }
            userWithIdentity.addUnsyncedAppAttributes(hashMap);
        }
    }

    static java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> validateMasterOrAppAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        cleanDataMap(map);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (key.length() > 1000) {
                arrayList.add(com.helpshift.util.ValuePair.from(key, com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_KEY_LENGTH_LIMIT));
            } else {
                java.lang.String validateValueByType = validateValueByType(value);
                if (com.helpshift.util.Utils.isNotEmpty(validateValueByType)) {
                    arrayList.add(com.helpshift.util.ValuePair.from(key, validateValueByType));
                }
            }
        }
        return arrayList;
    }

    private static void cleanDataMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        map.remove("");
        map.remove(null);
    }

    private static java.lang.String validateValueByType(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return validateStringValue((java.lang.String) obj);
        }
        if (obj instanceof java.util.List) {
            return validateListInAttributes(obj);
        }
        if (obj instanceof java.util.Map) {
            return validateMapInAttributes(obj);
        }
        return null;
    }

    private static java.lang.String validateStringValue(java.lang.String str) {
        if (str.length() > 10000) {
            return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_VALUE_LENGTH_LIMIT;
        }
        return null;
    }

    static void castPrimitiveValuesToString(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.util.Utils.isEmpty(map)) {
            return;
        }
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof java.util.Map) {
                        for (java.util.Map.Entry entry2 : ((java.util.Map) value).entrySet()) {
                            entry2.setValue(java.lang.String.valueOf(entry2.getValue()));
                        }
                    } else if (!(value instanceof java.util.List)) {
                        entry.setValue(java.lang.String.valueOf(value));
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error transforming map values to a string.", e);
        }
    }

    private static java.lang.String validateMapInAttributes(java.lang.Object obj) {
        try {
            java.util.Map map = (java.util.Map) obj;
            if (map.size() > 100) {
                return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_COUNT_LIMIT;
            }
            map.remove("");
            map.remove(null);
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (str.length() > 1000) {
                    return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_KEY_LENGTH_LIMIT;
                }
                if ((value instanceof java.lang.String) && ((java.lang.String) value).length() > 100000) {
                    return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_VALUE_LENGTH_LIMIT;
                }
                if (!(value instanceof java.lang.String) && !(value instanceof java.lang.Boolean) && !(value instanceof java.lang.Number)) {
                    return com.helpshift.user.error.InvalidDataErrorReason.INVALID_VALUE_TYPE;
                }
            }
            return "";
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Incorrect type of Map in attributes", e);
            return com.helpshift.user.error.InvalidDataErrorReason.INVALID_VALUE_TYPE;
        }
    }

    private static java.lang.String validateListInAttributes(java.lang.Object obj) {
        try {
            java.util.List list = (java.util.List) obj;
            if (list.size() > 100) {
                return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_COUNT_LIMIT;
            }
            list.removeAll(java.util.Arrays.asList("", null));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).length() > 10000) {
                    return com.helpshift.user.error.InvalidDataErrorReason.EXCEEDED_VALUE_LENGTH_LIMIT;
                }
            }
            return "";
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Incorrect type of List in attributes", e);
            return com.helpshift.user.error.InvalidDataErrorReason.INVALID_VALUE_TYPE;
        }
    }

    public static void sendUserIdentityAttributeFailureEvent(java.lang.String str, java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> list, com.helpshift.chat.HSEventProxy hSEventProxy) {
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        if (com.helpshift.util.Utils.isEmpty(list)) {
            list = new java.util.ArrayList<>();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.helpshift.util.ValuePair<java.lang.String, java.lang.String> valuePair : list) {
            hashMap.put(valuePair.first, valuePair.second);
        }
        hSEventProxy.sendEvent(str, hashMap);
    }

    static java.util.List<com.helpshift.util.ValuePair<java.lang.String, java.lang.String>> getValuePairsFromArray(org.json.JSONArray jSONArray, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.helpshift.util.JsonUtils.isEmpty(jSONArray)) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(com.helpshift.util.ValuePair.from(jSONArray.getString(i), str));
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error converting json array to list of valuepairs", e);
            }
        }
        return arrayList;
    }

    public static void collectAndStoreSDKCollectibleAttributes(com.helpshift.user.BaseUser baseUser, com.helpshift.platform.Device device, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.chat.HSEventProxy hSEventProxy) {
        if (baseUser instanceof com.helpshift.user.UserWithIdentity) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ATTRIBUTE_APP_VERSION, device.getAppVersion());
            hashMap.put(ATTRIBUTE_SDK_VERSION, device.getSDKVersion());
            hashMap.put(ATTRIBUTE_OS_VERSION, device.getOSVersion());
            hashMap.put(ATTRIBUTE_DEVICE_MODEL, device.getDeviceModel());
            if (com.helpshift.util.Utils.isNotEmpty(hSPersistentStorage.getCurrentPushToken())) {
                hashMap.put(ATTRIBUTE_PUSH_TOKEN, hSPersistentStorage.getCurrentPushToken());
            }
            updateAppAttributes(baseUser, hashMap, hSEventProxy);
        }
    }
}
