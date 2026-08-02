package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class KnotEventMapper {
    private static final java.util.Map<java.lang.String, java.lang.String> CASE_INSENSITIVE_EVENT_MAPPING;
    private static final java.util.Map<java.lang.String, java.lang.String> EVENT_SPECIAL_MAPPING;
    private static final java.util.Set<java.lang.String> EXCLUDED_KEYS = new java.util.HashSet<java.lang.String>() { // from class: com.knotapi.knot.models.KnotEventMapper.1
        {
            add("event");
            add("task_id");
            add("taskID");
            add("taskId");
            add("metaData");
            add("environment");
            add("merchant");
            add("product");
            add("merchantId");
        }
    };

    static {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<java.lang.String, java.lang.String>() { // from class: com.knotapi.knot.models.KnotEventMapper.2
            {
                put("onTryAgain", "USER_SELECTED_TRY_AGAIN");
                put("onErrorViewContinue", "ERROR_VIEW_CONTINUE");
                put("authentication_otp_timeout", "OTP_TIMEOUT");
                put("click_event", "ON_CLICK");
            }
        };
        EVENT_SPECIAL_MAPPING = hashMap;
        CASE_INSENSITIVE_EVENT_MAPPING = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashMap.entrySet()) {
            CASE_INSENSITIVE_EVENT_MAPPING.put(entry.getKey().toLowerCase(), entry.getValue());
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Object> extractMetaData(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.Boolean findSendCard;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (jSONObject.has("metaData")) {
                java.lang.Object obj = jSONObject.get("metaData");
                if (obj instanceof org.json.JSONObject) {
                    hashMap.putAll(jsonToMap((org.json.JSONObject) obj));
                }
            }
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (!EXCLUDED_KEYS.contains(next)) {
                    java.lang.Object obj2 = jSONObject.get(next);
                    if (obj2 instanceof org.json.JSONObject) {
                        obj2 = jsonToMap((org.json.JSONObject) obj2);
                    } else if (obj2 instanceof org.json.JSONArray) {
                        obj2 = jsonToList((org.json.JSONArray) obj2);
                    }
                    hashMap.put(next, obj2);
                }
            }
            if (str.equalsIgnoreCase("AUTHENTICATED") && (findSendCard = findSendCard(hashMap)) != null) {
                hashMap.put("sendCard", findSendCard);
            }
            return hashMap;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "KnotEventMapper.extractMetaData");
            return hashMap;
        }
    }

    private static java.lang.Boolean findSendCard(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Boolean findSendCardInList;
        java.lang.Boolean findSendCard;
        if (map == null) {
            return null;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((key.equals("send_card") || key.equals("sendCard")) && (value instanceof java.lang.Boolean)) {
                return (java.lang.Boolean) value;
            }
            if ((value instanceof java.util.Map) && (findSendCard = findSendCard((java.util.Map) value)) != null) {
                return findSendCard;
            }
            if ((value instanceof java.util.List) && (findSendCardInList = findSendCardInList((java.util.List) value)) != null) {
                return findSendCardInList;
            }
        }
        return null;
    }

    private static java.lang.Boolean findSendCardInList(java.util.List<java.lang.Object> list) {
        java.lang.Boolean findSendCardInList;
        if (list == null) {
            return null;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.Map) {
                java.lang.Boolean findSendCard = findSendCard((java.util.Map) obj);
                if (findSendCard != null) {
                    return findSendCard;
                }
            } else if ((obj instanceof java.util.List) && (findSendCardInList = findSendCardInList((java.util.List) obj)) != null) {
                return findSendCardInList;
            }
        }
        return null;
    }

    public static com.knotapi.knot.models.KnotEvent fromJson(org.json.JSONObject jSONObject) {
        try {
            com.knotapi.knot.models.KnotEvent knotEvent = new com.knotapi.knot.models.KnotEvent();
            if (!jSONObject.has("event")) {
                throw new org.json.JSONException("Event name is missing from the JSON payload");
            }
            java.lang.String mapEventName = mapEventName(jSONObject.getString("event"));
            knotEvent.setEvent(mapEventName);
            knotEvent.setEnvironment(com.knotapi.knot.models.Environment.valueOf(jSONObject.getString("environment")));
            java.lang.String optString = jSONObject.optString("product", jSONObject.optString("session_type", jSONObject.optString("sessionType", "")));
            if (!optString.isEmpty()) {
                knotEvent.setProduct(com.knotapi.knot.Knot.Product.valueOf(optString));
            }
            extractMerchantInfo(jSONObject, knotEvent);
            knotEvent.setTaskId(jSONObject.optString("task_id", jSONObject.optString("taskID", jSONObject.optString("taskId", ""))));
            knotEvent.setMetaData(extractMetaData(jSONObject, mapEventName));
            return knotEvent;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "KnotEventMapper.fromJson");
            return null;
        }
    }

    private static java.util.List<java.lang.Object> jsonToList(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                java.lang.Object obj = jSONArray.get(i);
                if (obj instanceof org.json.JSONObject) {
                    obj = jsonToMap((org.json.JSONObject) obj);
                } else if (obj instanceof org.json.JSONArray) {
                    obj = jsonToList((org.json.JSONArray) obj);
                }
                arrayList.add(obj);
            } catch (java.lang.Exception e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "KnotEventMapper.jsonToList");
                return arrayList;
            }
        }
        return arrayList;
    }

    private static java.util.Map<java.lang.String, java.lang.Object> jsonToMap(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject != null) {
            try {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    try {
                        java.lang.Object obj = jSONObject.get(next);
                        if (obj instanceof org.json.JSONObject) {
                            obj = jsonToMap((org.json.JSONObject) obj);
                        } else if (obj instanceof org.json.JSONArray) {
                            obj = jsonToList((org.json.JSONArray) obj);
                        }
                        hashMap.put(next, obj);
                    } catch (org.json.JSONException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("KnotEventMapper.jsonToMap: ");
                        sb.append(next);
                        com.knotapi.knot.services.ErrorReporter.report(e, sb.toString());
                    }
                }
            } catch (java.lang.Exception e2) {
                com.knotapi.knot.services.ErrorReporter.report(e2, "KnotEventMapper.jsonToMap");
            }
        }
        return hashMap;
    }

    private static java.lang.String mapEventName(java.lang.String str) {
        if (str.contains("_login_x_button")) {
            return "EXIT_BUTTON_SELECTED";
        }
        if (str.contains("_login_cancel_button")) {
            return "CANCEL_BUTTON_SELECTED";
        }
        java.lang.String str2 = EVENT_SPECIAL_MAPPING.get(str);
        if (str2 == null) {
            str2 = CASE_INSENSITIVE_EVENT_MAPPING.get(str.toLowerCase());
        }
        return str2 != null ? str2 : str.replaceAll("([a-z])([A-Z])", "$1_$2").replace("-", "_").replaceAll("\\s+", "_").replaceAll("[^A-Za-z0-9_]", "").toUpperCase();
    }

    private static void extractMerchantInfo(org.json.JSONObject jSONObject, com.knotapi.knot.models.KnotEvent knotEvent) {
        try {
            java.lang.String str = "";
            if (jSONObject.has("merchant")) {
                java.lang.Object obj = jSONObject.get("merchant");
                if (obj instanceof org.json.JSONObject) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                    java.lang.String optString = jSONObject2.has("name") ? jSONObject2.optString("name", "") : "";
                    if (jSONObject2.has("id")) {
                        knotEvent.setMerchantId(jSONObject2.optString("id", ""));
                    }
                    str = optString;
                } else if (obj instanceof java.lang.String) {
                    str = (java.lang.String) obj;
                }
            }
            knotEvent.setMerchantName(str);
            if (jSONObject.has("merchantId") && knotEvent.getMerchantId().isEmpty()) {
                knotEvent.setMerchantId(jSONObject.getString("merchantId"));
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "KnotEventMapper.extractMerchantInfo");
        }
    }
}
