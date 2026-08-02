package com.adobe.marketing.mobile.util;

/* loaded from: classes3.dex */
public class DataReader {
    private DataReader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls, java.lang.Object obj) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (obj == 0) {
            return null;
        }
        try {
            if (!java.lang.Number.class.isAssignableFrom(cls) || !(obj instanceof java.lang.Number)) {
                return (java.lang.String.class.equals(cls) && (obj instanceof java.lang.String)) ? obj : cls.cast(obj);
            }
            java.lang.Number number = (java.lang.Number) obj;
            if (!java.lang.Double.class.equals(cls)) {
                if (java.lang.Float.class.equals(cls)) {
                    if (number instanceof java.lang.Double) {
                        double doubleValue = number.doubleValue();
                        if (doubleValue >= 1.401298464324817E-45d && doubleValue <= 3.4028234663852886E38d) {
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value overflows type ");
                        sb.append(cls);
                        throw new com.adobe.marketing.mobile.util.DataReaderException(sb.toString());
                    }
                } else if (java.lang.Long.class.equals(cls)) {
                    if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                        double doubleValue2 = number.doubleValue();
                        if (doubleValue2 >= -9.223372036854776E18d && doubleValue2 <= 9.223372036854776E18d) {
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Value overflows type ");
                        sb2.append(cls);
                        throw new com.adobe.marketing.mobile.util.DataReaderException(sb2.toString());
                    }
                } else {
                    if (java.lang.Integer.class.equals(cls)) {
                        if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                            double doubleValue3 = number.doubleValue();
                            if (doubleValue3 >= -2.147483648E9d && doubleValue3 <= 2.147483647E9d) {
                            }
                            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Value overflows type ");
                            sb22.append(cls);
                            throw new com.adobe.marketing.mobile.util.DataReaderException(sb22.toString());
                        }
                        long longValue = number.longValue();
                        if (longValue >= androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask && longValue <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                        }
                        java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Value overflows type ");
                        sb222.append(cls);
                        throw new com.adobe.marketing.mobile.util.DataReaderException(sb222.toString());
                    }
                    if (java.lang.Short.class.equals(cls)) {
                        if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                            double doubleValue4 = number.doubleValue();
                            if (doubleValue4 >= -32768.0d && doubleValue4 <= 32767.0d) {
                            }
                            java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Value overflows type ");
                            sb2222.append(cls);
                            throw new com.adobe.marketing.mobile.util.DataReaderException(sb2222.toString());
                        }
                        long longValue2 = number.longValue();
                        if (longValue2 >= -32768 && longValue2 <= 32767) {
                        }
                        java.lang.StringBuilder sb22222 = new java.lang.StringBuilder("Value overflows type ");
                        sb22222.append(cls);
                        throw new com.adobe.marketing.mobile.util.DataReaderException(sb22222.toString());
                    }
                    if (java.lang.Byte.class.equals(cls)) {
                        if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                            double doubleValue5 = number.doubleValue();
                            if (doubleValue5 >= -128.0d && doubleValue5 <= 127.0d) {
                            }
                            java.lang.StringBuilder sb222222 = new java.lang.StringBuilder("Value overflows type ");
                            sb222222.append(cls);
                            throw new com.adobe.marketing.mobile.util.DataReaderException(sb222222.toString());
                        }
                        long longValue3 = number.longValue();
                        if (longValue3 >= -128 && longValue3 <= 127) {
                        }
                        java.lang.StringBuilder sb2222222 = new java.lang.StringBuilder("Value overflows type ");
                        sb2222222.append(cls);
                        throw new com.adobe.marketing.mobile.util.DataReaderException(sb2222222.toString());
                    }
                }
            }
            if (java.lang.Byte.class.equals(cls)) {
                return (T) java.lang.Byte.valueOf(number.byteValue());
            }
            if (java.lang.Short.class.equals(cls)) {
                return (T) java.lang.Short.valueOf(number.shortValue());
            }
            if (java.lang.Integer.class.equals(cls)) {
                return (T) java.lang.Integer.valueOf(number.intValue());
            }
            if (java.lang.Long.class.equals(cls)) {
                return (T) java.lang.Long.valueOf(number.longValue());
            }
            if (java.lang.Double.class.equals(cls)) {
                return (T) java.lang.Double.valueOf(number.doubleValue());
            }
            if (java.lang.Float.class.equals(cls)) {
                return (T) java.lang.Float.valueOf(number.floatValue());
            }
            return null;
        } catch (java.lang.ClassCastException e) {
            throw new com.adobe.marketing.mobile.util.DataReaderException(e);
        }
    }

    public static <T> java.util.Map<java.lang.String, T> getTypedMap(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (cls == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
        }
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof java.util.Map)) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Value is not a map");
        }
        java.util.Map<java.lang.String, T> map2 = (java.util.Map) obj;
        for (java.util.Map.Entry<java.lang.String, T> entry : map2.entrySet()) {
            if (!(entry.getKey() instanceof java.lang.String)) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map entry is not of expected type");
            }
            if (entry.getValue() != null && !cls.isInstance(entry.getValue())) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map entry is not of expected type");
            }
        }
        return map2;
    }

    public static <T> java.util.Map<java.lang.String, T> optTypedMap(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str, java.util.Map<java.lang.String, T> map2) {
        java.util.Map<java.lang.String, T> map3;
        try {
            map3 = getTypedMap(cls, map, str);
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            map3 = null;
        }
        return map3 != null ? map3 : map2;
    }

    public static <T> java.util.List<T> getTypedList(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (cls == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
        }
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof java.util.List)) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Value is not a list");
        }
        java.util.List<T> list = (java.util.List) obj;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!cls.isInstance(it.next())) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("List entry is not of expected type");
            }
        }
        return list;
    }

    public static <T> java.util.List<T> optTypedList(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str, java.util.List<T> list) {
        java.util.List<T> list2;
        try {
            list2 = getTypedList(cls, map, str);
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            list2 = null;
        }
        return list2 != null ? list2 : list;
    }

    public static <T> java.util.List<java.util.Map<java.lang.String, T>> getTypedListOfMap(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (cls == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
        }
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof java.util.List)) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Value is not a list");
        }
        java.util.List<java.util.Map<java.lang.String, T>> list = (java.util.List) obj;
        for (java.util.Map<java.lang.String, T> map2 : list) {
            if (!(map2 instanceof java.util.Map)) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("List entry is not of expected type");
            }
            for (java.util.Map.Entry<java.lang.String, T> entry : map2.entrySet()) {
                if (!(entry.getKey() instanceof java.lang.String)) {
                    throw new com.adobe.marketing.mobile.util.DataReaderException("Map entry is not of expected type");
                }
                if (entry.getValue() != null && !cls.isInstance(entry.getValue())) {
                    throw new com.adobe.marketing.mobile.util.DataReaderException("Map entry is not of expected type");
                }
            }
        }
        return list;
    }

    public static <T> java.util.List<java.util.Map<java.lang.String, T>> optTypedListOfMap(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str, java.util.List<java.util.Map<java.lang.String, T>> list) {
        java.util.List<java.util.Map<java.lang.String, T>> list2;
        try {
            list2 = getTypedListOfMap(cls, map, str);
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            list2 = null;
        }
        return list2 != null ? list2 : list;
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            java.lang.Boolean bool = (java.lang.Boolean) getHighSpeedVideoFpsRangesFor(java.lang.Boolean.class, map.get(str));
            if (bool == null) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map contains null value for key");
            }
            return bool.booleanValue();
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static boolean optBoolean(java.util.Map<java.lang.String, ?> map, java.lang.String str, boolean z) {
        return ((java.lang.Boolean) getHighSpeedVideoFpsRanges(java.lang.Boolean.class, map, str, java.lang.Boolean.valueOf(z))).booleanValue();
    }

    public static int getInt(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoFpsRangesFor(java.lang.Integer.class, map.get(str));
            if (num == null) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map contains null value for key");
            }
            return num.intValue();
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static int optInt(java.util.Map<java.lang.String, ?> map, java.lang.String str, int i) {
        return ((java.lang.Integer) getHighSpeedVideoFpsRanges(java.lang.Integer.class, map, str, java.lang.Integer.valueOf(i))).intValue();
    }

    public static long getLong(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            java.lang.Long l = (java.lang.Long) getHighSpeedVideoFpsRangesFor(java.lang.Long.class, map.get(str));
            if (l == null) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map contains null value for key");
            }
            return l.longValue();
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static long optLong(java.util.Map<java.lang.String, ?> map, java.lang.String str, long j) {
        return ((java.lang.Long) getHighSpeedVideoFpsRanges(java.lang.Long.class, map, str, java.lang.Long.valueOf(j))).longValue();
    }

    public static float getFloat(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            java.lang.Float f = (java.lang.Float) getHighSpeedVideoFpsRangesFor(java.lang.Float.class, map.get(str));
            if (f == null) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map contains null value for key");
            }
            return f.floatValue();
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static float optFloat(java.util.Map<java.lang.String, ?> map, java.lang.String str, float f) {
        return ((java.lang.Float) getHighSpeedVideoFpsRanges(java.lang.Float.class, map, str, java.lang.Float.valueOf(f))).floatValue();
    }

    public static double getDouble(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            java.lang.Double d = (java.lang.Double) getHighSpeedVideoFpsRangesFor(java.lang.Double.class, map.get(str));
            if (d == null) {
                throw new com.adobe.marketing.mobile.util.DataReaderException("Map contains null value for key");
            }
            return d.doubleValue();
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static double optDouble(java.util.Map<java.lang.String, ?> map, java.lang.String str, double d) {
        return ((java.lang.Double) getHighSpeedVideoFpsRanges(java.lang.Double.class, map, str, java.lang.Double.valueOf(d))).doubleValue();
    }

    public static java.lang.String getString(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        if (map != null && str != null) {
            return (java.lang.String) getHighSpeedVideoFpsRangesFor(java.lang.String.class, map.get(str));
        }
        throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
    }

    public static java.lang.String optString(java.util.Map<java.lang.String, ?> map, java.lang.String str, java.lang.String str2) {
        return (java.lang.String) getHighSpeedVideoFpsRanges(java.lang.String.class, map, str, str2);
    }

    public static java.util.Map<java.lang.String, java.lang.String> getStringMap(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        return getTypedMap(java.lang.String.class, map, str);
    }

    public static java.util.Map<java.lang.String, java.lang.String> optStringMap(java.util.Map<java.lang.String, ?> map, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map2) {
        return optTypedMap(java.lang.String.class, map, str, map2);
    }

    public static java.util.List<java.lang.String> getStringList(java.util.Map<java.lang.String, ?> map, java.lang.String str) throws com.adobe.marketing.mobile.util.DataReaderException {
        return getTypedList(java.lang.String.class, map, str);
    }

    public static java.util.List<java.lang.String> optStringList(java.util.Map<java.lang.String, ?> map, java.lang.String str, java.util.List<java.lang.String> list) {
        return optTypedList(java.lang.String.class, map, str, list);
    }

    private static <T> T getHighSpeedVideoFpsRanges(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map, java.lang.String str, T t) {
        java.lang.Object obj;
        try {
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            obj = null;
        }
        if (map == null || str == null) {
            throw new com.adobe.marketing.mobile.util.DataReaderException("Map or key is null");
        }
        obj = getHighSpeedVideoFpsRangesFor(cls, map.get(str));
        return obj != null ? (T) obj : t;
    }
}
