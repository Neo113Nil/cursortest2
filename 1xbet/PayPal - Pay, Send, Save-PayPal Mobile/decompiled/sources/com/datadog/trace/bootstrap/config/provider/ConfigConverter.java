package com.datadog.trace.bootstrap.config.provider;

/* loaded from: classes3.dex */
final class ConfigConverter {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.bootstrap.config.provider.ConfigConverter.class);

    ConfigConverter() {
    }

    static <T> T getHighSpeedVideoSizes(java.lang.String str, java.lang.Class<T> cls) {
        java.util.Objects.requireNonNull(cls, "tClass is marked non-null but is null");
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            if (cls == java.lang.Boolean.class) {
                return (T) java.lang.Boolean.valueOf(str);
            }
            if (cls == java.lang.Integer.class) {
                return (T) java.lang.Integer.valueOf(str);
            }
            if (cls == java.lang.Long.class) {
                return (T) java.lang.Long.valueOf(str);
            }
            if (cls == java.lang.Double.class) {
                return (T) java.lang.Double.valueOf(str);
            }
            if (cls == java.lang.Float.class) {
                return (T) java.lang.Float.valueOf(str);
            }
            return null;
        } catch (java.lang.NumberFormatException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoFpsRanges.debug("Can't parse: ", th);
            throw new java.lang.NumberFormatException(th.toString());
        }
    }

    static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, ",");
    }

    static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = com.datadog.trace.util.Strings.trim(str);
        if (trim.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.lang.String[] split = trim.split(str2, -1);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(split));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #0 {all -> 0x010c, blocks: (B:10:0x001a, B:12:0x0020, B:14:0x0026, B:15:0x0035, B:20:0x0048, B:27:0x0088, B:32:0x0098, B:34:0x00a2, B:38:0x00ad, B:39:0x00c6, B:40:0x00e4, B:42:0x00ea, B:46:0x00c7, B:48:0x00d1, B:50:0x00ee, B:51:0x0107, B:55:0x0062, B:60:0x006e, B:61:0x0084, B:63:0x0058), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        int indexOf;
        java.lang.String obj;
        java.lang.String trim = com.datadog.trace.util.Strings.trim(str);
        if (trim.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str3 == null) {
            str3 = "";
        }
        try {
            if (!str3.isEmpty() && !str3.endsWith(".")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append(".");
                str3 = sb.toString();
            }
            int length = trim.length();
            int i = trim.indexOf(44) == -1 ? 32 : 44;
            int i2 = 0;
            while (i2 < length) {
                int indexOf2 = trim.indexOf(i, i2);
                int indexOf3 = trim.indexOf(58, i2);
                if (indexOf2 == -1) {
                    indexOf2 = indexOf3;
                } else if (indexOf3 != -1) {
                    indexOf2 = java.lang.Math.min(indexOf2, indexOf3);
                }
                if (indexOf2 == -1) {
                    indexOf2 = length;
                } else if (indexOf2 == indexOf3) {
                    indexOf = trim.indexOf(i, indexOf2 + 1);
                    if (indexOf3 == i2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Illegal empty key at position ");
                        sb2.append(i2);
                        throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException(sb2.toString());
                    }
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    if (i2 == indexOf) {
                        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trim, i2, indexOf2, z);
                        if (highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                            continue;
                        } else {
                            if (indexOf2 == indexOf3) {
                                obj = getHighResolutionOutputSizeshNQ4ISI(trim, indexOf2 + 1, indexOf, false);
                                if (!obj.isEmpty() && !java.lang.Character.isLetter(obj.charAt(0))) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append("Illegal tag starting with non letter for key '");
                                    sb3.append(highResolutionOutputSizeshNQ4ISI);
                                    sb3.append("'");
                                    throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException(sb3.toString());
                                }
                            } else {
                                if (!java.lang.Character.isLetter(highResolutionOutputSizeshNQ4ISI.charAt(0))) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                    sb4.append("Illegal key only tag starting with non letter '");
                                    sb4.append(highResolutionOutputSizeshNQ4ISI);
                                    sb4.append("'");
                                    throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException(sb4.toString());
                                }
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                sb5.append(str3);
                                sb5.append(com.datadog.trace.util.Strings.normalizedHeaderTag(highResolutionOutputSizeshNQ4ISI));
                                obj = sb5.toString();
                            }
                            if (!obj.isEmpty()) {
                                hashMap.put(highResolutionOutputSizeshNQ4ISI, obj);
                            }
                        }
                    }
                    i2 = indexOf + 1;
                }
                indexOf = indexOf2;
                if (i2 == indexOf) {
                }
                i2 = indexOf + 1;
            }
        } catch (java.lang.Throwable th) {
            if (th instanceof com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException) {
                getHighSpeedVideoFpsRanges.warn("Invalid config for {}. {}. Must match '(key:value|key)([ ,](key:value|key))*'.", str2, th.getMessage());
            } else {
                getHighSpeedVideoFpsRanges.warn("Unexpected exception during config parsing of {}.", str2, th);
            }
            hashMap.clear();
        }
        return hashMap;
    }

    static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = com.datadog.trace.util.Strings.trim(str);
        if (trim.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        getHighSpeedVideoFpsRanges(linkedHashMap, trim, str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        return linkedHashMap;
    }

    static final class BadFormatException extends java.lang.Exception {
        public BadFormatException(java.lang.String str) {
            super(str);
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2, char c) {
        int i = 0;
        try {
            int indexOf = str.indexOf(58, 0);
            while (indexOf != -1) {
                int i2 = indexOf + 1;
                int indexOf2 = str.indexOf(58, i2);
                int indexOf3 = str.indexOf(44, i2);
                if (indexOf3 == -1) {
                    indexOf3 = str.length();
                }
                int indexOf4 = str.indexOf(32, i2);
                if (indexOf4 == -1) {
                    indexOf4 = str.length();
                }
                int i3 = indexOf3 < str.length() ? indexOf3 : indexOf4;
                while (indexOf2 != -1 && indexOf2 < i3) {
                    indexOf2 = str.indexOf(58, indexOf2 + 1);
                }
                if (indexOf2 == -1) {
                    if (indexOf3 < str.length() - 1) {
                        throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException("Non white space characters after trailing ','");
                    }
                } else if (indexOf3 >= str.length()) {
                    if (indexOf4 >= str.length()) {
                        throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException("Illegal position of split character ':'");
                    }
                    indexOf3 = indexOf4;
                }
                java.lang.String trim = str.substring(i, indexOf).trim();
                if (trim.indexOf(44) != -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Illegal ',' character in key '");
                    sb.append(trim);
                    sb.append("'");
                    throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException(sb.toString());
                }
                java.lang.String trim2 = str.substring(i2, indexOf3).trim();
                if (trim2.indexOf(32) != -1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("Illegal ' ' character in value for key '");
                    sb2.append(trim);
                    sb2.append("'");
                    throw new com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException(sb2.toString());
                }
                if (!trim.isEmpty() && !trim2.isEmpty()) {
                    map.put(trim, trim2);
                }
                i = indexOf3 + 1;
                indexOf = indexOf2;
            }
        } catch (java.lang.Throwable th) {
            if (th instanceof com.datadog.trace.bootstrap.config.provider.ConfigConverter.BadFormatException) {
                getHighSpeedVideoFpsRanges.warn("Invalid config for {}. {}. Must match 'key1{}value1,key2{}value2' or 'key1{}value1 key2{}value2'.", str2, th.getMessage(), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON));
            } else {
                getHighSpeedVideoFpsRanges.warn("Unexpected exception during config parsing of {}.", str2, th);
            }
            map.clear();
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i2 - i);
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char charAt = str.charAt(i5);
            if (z) {
                charAt = java.lang.Character.toLowerCase(charAt);
            }
            if (java.lang.Character.isWhitespace(charAt)) {
                sb.append(' ');
            } else {
                if (i3 == -1) {
                    i3 = i5;
                }
                sb.append(charAt);
                i4 = i5;
            }
        }
        if (i3 == -1) {
            return "";
        }
        return sb.substring(i3 - i, (i4 - i) + 1);
    }

    static java.util.BitSet getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) throws java.lang.NumberFormatException {
        java.lang.String replaceAll = str.replaceAll("\\s", "");
        if (!replaceAll.matches("\\d{1,3}(?:-\\d{1,3})?(?:,\\d{1,3}(?:-\\d{1,3})?)*")) {
            getHighSpeedVideoFpsRanges.warn("Invalid config for {}: '{}'. Must be formatted like '400-403,405,410-499'.", str2, replaceAll);
            throw new java.lang.NumberFormatException();
        }
        java.util.BitSet bitSet = new java.util.BitSet(java.lang.Integer.parseInt(replaceAll.substring(java.lang.Math.max(replaceAll.lastIndexOf(44), replaceAll.lastIndexOf(45)) + 1)));
        for (java.lang.String str3 : replaceAll.split(",", -1)) {
            int indexOf = str3.indexOf(45);
            if (indexOf == -1) {
                bitSet.set(java.lang.Integer.parseInt(str3));
            } else if (indexOf > 0) {
                int parseInt = java.lang.Integer.parseInt(str3.substring(0, indexOf));
                int parseInt2 = java.lang.Integer.parseInt(str3.substring(indexOf + 1));
                bitSet.set(java.lang.Math.min(parseInt, parseInt2), java.lang.Math.max(parseInt, parseInt2) + 1);
            }
        }
        return bitSet;
    }

    public static java.lang.String getHighSpeedVideoSizes(java.util.BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit >= 0) {
                int nextClearBit = bitSet.nextClearBit(nextSetBit);
                if (sb.length() > 0) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                if (nextSetBit < nextClearBit - 1) {
                    sb.append(nextSetBit);
                    sb.append('-');
                    sb.append(nextClearBit);
                } else {
                    sb.append(nextSetBit);
                }
                i = nextClearBit;
            } else {
                return sb.toString();
            }
        }
    }

    static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = com.datadog.trace.util.Strings.trim(str);
        if (trim.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges(hashMap, trim, str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        return hashMap;
    }
}
