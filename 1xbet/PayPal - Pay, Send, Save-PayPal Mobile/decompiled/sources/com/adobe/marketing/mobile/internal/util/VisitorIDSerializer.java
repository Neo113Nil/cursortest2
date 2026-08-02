package com.adobe.marketing.mobile.internal.util;

/* loaded from: classes7.dex */
public class VisitorIDSerializer {
    public static java.util.Map<java.lang.String, java.lang.Object> convertVisitorId(com.adobe.marketing.mobile.VisitorID visitorID) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ID", visitorID.getId());
        hashMap.put("ID_ORIGIN", visitorID.getIdOrigin());
        hashMap.put("ID_TYPE", visitorID.getIdType());
        hashMap.put("STATE", java.lang.Integer.valueOf(visitorID.getAuthenticationState().getValue()));
        return hashMap;
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> convertVisitorIds(java.util.List<com.adobe.marketing.mobile.VisitorID> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.adobe.marketing.mobile.VisitorID visitorID : list) {
            if (visitorID != null) {
                arrayList.add(convertVisitorId(visitorID));
            }
        }
        return arrayList;
    }

    public static java.util.List<com.adobe.marketing.mobile.VisitorID> convertToVisitorIds(java.util.List<java.util.Map> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map map : list) {
            if (map != null) {
                arrayList.add(new com.adobe.marketing.mobile.VisitorID(java.lang.String.valueOf(map.get("ID_ORIGIN")), java.lang.String.valueOf(map.get("ID_TYPE")), java.lang.String.valueOf(map.get("ID")), com.adobe.marketing.mobile.VisitorID.AuthenticationState.fromInteger(java.lang.Integer.parseInt(java.lang.String.valueOf(map.get("STATE"))))));
            }
        }
        return arrayList;
    }
}
