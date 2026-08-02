package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class MethodFilterConfigParser {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.api.MethodFilterConfigParser.class);

    private static java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, java.lang.String str2) {
        getHighSpeedVideoFpsRanges.warn("Invalid trace method config {} in part '{}'. Must match 'package.Class$Name[method1,method2];?' or 'package.Class$Name[*];?'. Config string: '{}'", str, str2.substring(i, i2).trim(), str2);
        return java.util.Collections.emptyMap();
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '*' || charAt == '[' || charAt == ']' || charAt == ',') {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        r0 = getHighResolutionOutputSizeshNQ4ISI("with illegal class name", r2, r6, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        r0 = getHighResolutionOutputSizeshNQ4ISI("does not contain a ']'", r2, r6, r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.lang.String, java.util.Set<java.lang.String>> parse(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> hashMap = new java.util.HashMap<>();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int indexOf = str.indexOf(59, i2);
            int length = indexOf == -1 ? str.length() : indexOf;
            if (length > i2) {
                int indexOf2 = str.indexOf(91, i);
                if (indexOf2 != -1) {
                    if (indexOf2 >= length) {
                        hashMap = getHighResolutionOutputSizeshNQ4ISI("with incomplete method definition", i, length, str);
                        break;
                    }
                    int indexOf3 = str.indexOf(93, indexOf2);
                    if (indexOf3 != -1 && indexOf3 <= length) {
                        if (indexOf3 < length && !str.substring(indexOf3 + 1, length).trim().isEmpty()) {
                            hashMap = getHighResolutionOutputSizeshNQ4ISI("with extra characters after ']'", i, length, str);
                            break;
                        }
                        java.lang.String trim = str.substring(i, indexOf2).trim();
                        if (!trim.isEmpty() && !getHighSpeedVideoSizes(trim)) {
                            java.util.Set<java.lang.String> set = hashMap.get(trim);
                            if (set == null) {
                                set = new java.util.HashSet<>();
                                hashMap.put(trim, set);
                            }
                            int i3 = indexOf2 + 1;
                            int i4 = 0;
                            int i5 = 0;
                            boolean z = false;
                            while (i3 < indexOf3) {
                                int indexOf4 = str.indexOf(44, i3);
                                if (indexOf4 == -1 || indexOf4 >= indexOf3) {
                                    indexOf4 = indexOf3;
                                }
                                java.lang.String trim2 = str.substring(i3, indexOf4).trim();
                                if (!trim2.equals("*") && getHighSpeedVideoSizes(trim2)) {
                                    hashMap = getHighResolutionOutputSizeshNQ4ISI("with illegal method name", i, length, str);
                                } else {
                                    if (!trim2.isEmpty()) {
                                        i4++;
                                        if (i5 > 0) {
                                            hashMap = getHighResolutionOutputSizeshNQ4ISI("with method name and emtpy method name", i, length, str);
                                        } else {
                                            z |= trim2.indexOf(42) != -1;
                                            if (z && i4 > 1) {
                                                hashMap = getHighResolutionOutputSizeshNQ4ISI("with both method name and '*'", i, length, str);
                                            } else {
                                                set.add(trim2);
                                            }
                                        }
                                        indexOf = -1;
                                        break;
                                    }
                                    i5++;
                                    if (i5 > 1) {
                                        hashMap = getHighResolutionOutputSizeshNQ4ISI("with multiple emtpy method names", i, length, str);
                                    }
                                    i3 = indexOf4 + 1;
                                }
                                i4++;
                                indexOf = -1;
                                break;
                            }
                            if (i4 == 0) {
                                hashMap = getHighResolutionOutputSizeshNQ4ISI("with empty method definition", i, length, str);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (!str.substring(i).trim().isEmpty()) {
                    hashMap = getHighResolutionOutputSizeshNQ4ISI("with incomplete definition", i, length, str);
                }
            }
            i = indexOf + 1;
            if (i == 0) {
                break;
            }
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }
}
