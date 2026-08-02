package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class MessagingUtils {
    static boolean Camera2StreamConfigurationMap(java.util.Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.adobe.marketing.mobile.messaging.MessagingUtils$1, reason: invalid class name */
    class AnonymousClass1<T> extends java.util.ArrayList<T> {
        final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        AnonymousClass1(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
            add(obj);
        }
    }

    static <T> java.util.List<T> getHighSpeedVideoFpsRangesFor(T t) {
        return new com.adobe.marketing.mobile.messaging.MessagingUtils.AnonymousClass1(t);
    }

    public static java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface surface, com.adobe.marketing.mobile.messaging.Proposition proposition, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map) {
        if (proposition == null || map == null) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        java.util.List list = (java.util.List) hashMap.get(surface);
        java.util.List anonymousClass1 = list != null ? list : new com.adobe.marketing.mobile.messaging.MessagingUtils.AnonymousClass1(proposition);
        if (list != null) {
            anonymousClass1.add(proposition);
        }
        hashMap.put(surface, anonymousClass1);
        return hashMap;
    }

    public static com.adobe.marketing.mobile.messaging.Surface scopeToSurface(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        return com.adobe.marketing.mobile.messaging.Surface.Camera2StreamConfigurationMap(str);
    }

    public static com.adobe.marketing.mobile.Message getMessageForPresentable(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> presentable) {
        if (presentable == null) {
            return null;
        }
        com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI();
        return com.adobe.marketing.mobile.messaging.PresentableMessageMapper.getHighResolutionOutputSizeshNQ4ISI(presentable.getPresentation().getId());
    }

    public static java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> updatePropositionMapForSurface(com.adobe.marketing.mobile.messaging.Surface surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition> list, java.util.Map<com.adobe.marketing.mobile.messaging.Surface, java.util.List<com.adobe.marketing.mobile.messaging.Proposition>> map) {
        if (list == null || list.isEmpty() || map == null) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        java.util.List list2 = (java.util.List) hashMap.get(surface);
        java.util.List arrayList = list2 != null ? list2 : new java.util.ArrayList(list);
        if (list2 != null) {
            for (com.adobe.marketing.mobile.messaging.Proposition proposition : list) {
                if (arrayList.contains(proposition)) {
                    arrayList.set(arrayList.indexOf(proposition), proposition);
                } else {
                    arrayList.add(proposition);
                }
            }
        }
        hashMap.put(surface, arrayList);
        return hashMap;
    }
}
