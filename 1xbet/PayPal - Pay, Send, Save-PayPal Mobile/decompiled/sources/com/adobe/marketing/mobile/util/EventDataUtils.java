package com.adobe.marketing.mobile.util;

/* loaded from: classes3.dex */
public class EventDataUtils {
    private static final java.util.Set<java.lang.Class<?>> getHighResolutionOutputSizeshNQ4ISI;

    enum CloneMode {
        ImmutableContainer,
        MutableContainer
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighResolutionOutputSizeshNQ4ISI = hashSet;
        hashSet.add(java.lang.Boolean.class);
        hashSet.add(java.lang.Byte.class);
        hashSet.add(java.lang.Short.class);
        hashSet.add(java.lang.Integer.class);
        hashSet.add(java.lang.Long.class);
        hashSet.add(java.lang.Float.class);
        hashSet.add(java.lang.Double.class);
        hashSet.add(java.math.BigDecimal.class);
        hashSet.add(java.math.BigInteger.class);
        hashSet.add(java.lang.Character.class);
        hashSet.add(java.lang.String.class);
        hashSet.add(java.util.UUID.class);
    }

    private EventDataUtils() {
    }

    private static java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode cloneMode, int i) throws com.adobe.marketing.mobile.util.CloneFailedException {
        if (obj == null) {
            return null;
        }
        if (i > 256) {
            throw new com.adobe.marketing.mobile.util.CloneFailedException(com.adobe.marketing.mobile.util.CloneFailedException.Reason.MAX_DEPTH_REACHED);
        }
        java.lang.Class<?> cls = obj.getClass();
        if (getHighResolutionOutputSizeshNQ4ISI.contains(cls)) {
            return obj;
        }
        if (obj instanceof java.util.Map) {
            return getHighResolutionOutputSizeshNQ4ISI((java.util.Map) obj, cloneMode, i);
        }
        if (obj instanceof java.util.Collection) {
            return getHighSpeedVideoFpsRangesFor((java.util.Collection) obj, cloneMode, i);
        }
        if (obj.getClass().isArray()) {
            return getHighSpeedVideoSizes(obj, cloneMode, i);
        }
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventDataUtils", "Cannot clone object of type: %s", cls.getSimpleName());
        throw new com.adobe.marketing.mobile.util.CloneFailedException(com.adobe.marketing.mobile.util.CloneFailedException.Reason.UNSUPPORTED_TYPE);
    }

    private static java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<?, ?> map, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode cloneMode, int i) throws com.adobe.marketing.mobile.util.CloneFailedException {
        if (map == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof java.lang.String) {
                try {
                    hashMap.put(key.toString(), Camera2StreamConfigurationMap(entry.getValue(), cloneMode, i + 1));
                } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
                    if (e.getHighSpeedVideoFpsRangesFor != com.adobe.marketing.mobile.util.CloneFailedException.Reason.UNSUPPORTED_TYPE) {
                        throw e;
                    }
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventDataUtils", "cloneMap - Skipped cloning key %s due to %s", key, e.getMessage());
                }
            }
        }
        return cloneMode == com.adobe.marketing.mobile.util.EventDataUtils.CloneMode.ImmutableContainer ? java.util.Collections.unmodifiableMap(hashMap) : hashMap;
    }

    private static java.util.Collection<java.lang.Object> getHighSpeedVideoFpsRangesFor(java.util.Collection<?> collection, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode cloneMode, int i) throws com.adobe.marketing.mobile.util.CloneFailedException {
        if (collection == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Camera2StreamConfigurationMap(it.next(), cloneMode, i + 1));
            } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
                if (e.getHighSpeedVideoFpsRangesFor != com.adobe.marketing.mobile.util.CloneFailedException.Reason.UNSUPPORTED_TYPE) {
                    throw e;
                }
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventDataUtils", "cloneCollection - Skipped cloning element due to %s", e.getMessage());
            }
        }
        return cloneMode == com.adobe.marketing.mobile.util.EventDataUtils.CloneMode.ImmutableContainer ? java.util.Collections.unmodifiableList(arrayList) : arrayList;
    }

    private static java.util.Collection<java.lang.Object> getHighSpeedVideoSizes(java.lang.Object obj, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode cloneMode, int i) throws com.adobe.marketing.mobile.util.CloneFailedException {
        if (obj == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            try {
                arrayList.add(Camera2StreamConfigurationMap(java.lang.reflect.Array.get(obj, i2), cloneMode, i + 1));
            } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
                if (e.getHighSpeedVideoFpsRangesFor != com.adobe.marketing.mobile.util.CloneFailedException.Reason.UNSUPPORTED_TYPE) {
                    throw e;
                }
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventDataUtils", "cloneArray - Skipped cloning element due to %s", e.getMessage());
            }
        }
        return cloneMode == com.adobe.marketing.mobile.util.EventDataUtils.CloneMode.ImmutableContainer ? java.util.Collections.unmodifiableList(arrayList) : arrayList;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> clone(java.util.Map<java.lang.String, ?> map) throws com.adobe.marketing.mobile.util.CloneFailedException {
        return getHighResolutionOutputSizeshNQ4ISI(map, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode.MutableContainer, 0);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> immutableClone(java.util.Map<java.lang.String, ?> map) throws com.adobe.marketing.mobile.util.CloneFailedException {
        return getHighResolutionOutputSizeshNQ4ISI(map, com.adobe.marketing.mobile.util.EventDataUtils.CloneMode.ImmutableContainer, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map<java.lang.String, java.lang.Object> castFromGenericType(java.util.Map<?, ?> map) {
        if (map == 0) {
            return null;
        }
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!(((java.util.Map.Entry) it.next()).getKey() instanceof java.lang.String)) {
                return null;
            }
        }
        return map;
    }
}
