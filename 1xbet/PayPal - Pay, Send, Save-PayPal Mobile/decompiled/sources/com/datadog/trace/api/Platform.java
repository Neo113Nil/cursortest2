package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class Platform {
    private static final com.datadog.trace.api.Platform.Version getHighSpeedVideoSizes = Camera2StreamConfigurationMap(java.lang.System.getProperty("java.version"));
    private static final com.datadog.trace.api.Platform.JvmRuntime getHighSpeedVideoFpsRanges = new com.datadog.trace.api.Platform.JvmRuntime();

    /* loaded from: classes8.dex */
    public enum GC {
        SERIAL("marksweep"),
        PARALLEL("ps"),
        CMS("concurrentmarksweep"),
        G1("g1"),
        SHENANDOAH("shenandoah"),
        Z("z"),
        UNKNOWN("");

        private final java.lang.String getHighSpeedVideoSizes;

        GC(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }
    }

    private static com.datadog.trace.api.Platform.Version Camera2StreamConfigurationMap(java.lang.String str) {
        int i;
        int i2;
        int indexOf = str.indexOf(45);
        int i3 = 0;
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = str.length();
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    if (charAt != '.' && charAt != '_' && charAt != '+') {
                        throw new java.lang.NumberFormatException();
                    }
                    arrayList.add(java.lang.Integer.valueOf(i4));
                    i4 = 0;
                } else {
                    i4 = (i4 * 10) + (charAt - '0');
                }
            }
            arrayList.add(java.lang.Integer.valueOf(i4));
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            try {
                if (intValue == 1) {
                    intValue = ((java.lang.Integer) arrayList.get(1)).intValue();
                    i2 = ((java.lang.Integer) arrayList.get(2)).intValue();
                    try {
                        i3 = ((java.lang.Integer) arrayList.get(3)).intValue();
                    } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
                    }
                } else {
                    int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue();
                    try {
                        i3 = ((java.lang.Integer) arrayList.get(2)).intValue();
                    } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused2) {
                    }
                    i2 = intValue2;
                }
                int i6 = i3;
                i3 = intValue;
                i = i6;
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused3) {
                i2 = i3;
                i3 = intValue;
                i = i2;
            }
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused4) {
            i = 0;
            i2 = 0;
        }
        return new com.datadog.trace.api.Platform.Version(i3, i2, i);
    }

    static final class Version {
        public final int Camera2StreamConfigurationMap;
        public final int getHighSpeedVideoFpsRangesFor;
        public final int getHighSpeedVideoSizes;

        static boolean getHighSpeedVideoFpsRanges(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i > i4) {
                return true;
            }
            if (i != i4 || i2 <= i5) {
                return i == i4 && i2 == i5 && i3 >= i6;
            }
            return true;
        }

        public Version(int i, int i2, int i3) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = i3;
        }
    }

    static final class JvmRuntime {
        public final java.lang.String Camera2StreamConfigurationMap;
        public final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        public final java.lang.String getHighSpeedVideoFpsRanges;
        public final java.lang.String getHighSpeedVideoFpsRangesFor;
        public final java.lang.String getHighSpeedVideoSizes;

        public JvmRuntime() {
            this(java.lang.System.getProperty("java.version"), java.lang.System.getProperty("java.runtime.version"), java.lang.System.getProperty("java.runtime.name"), java.lang.System.getProperty("java.vm.vendor"), java.lang.System.getProperty("java.vendor.version"));
        }

        private JvmRuntime(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.getHighSpeedVideoSizes = str3 == null ? "" : str3;
            this.Camera2StreamConfigurationMap = str4 == null ? "" : str4;
            str = str == null ? "" : str;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = str5 == null ? "" : str5;
            str2 = (str.isEmpty() || str2 == null) ? str : str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str.length() + 1 < str2.length() ? str2.substring(str.length() + 1) : "";
        }
    }

    public static boolean isJavaVersion(int i) {
        return getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor == i;
    }

    public static boolean isJavaVersion(int i, int i2) {
        com.datadog.trace.api.Platform.Version version = getHighSpeedVideoSizes;
        return version.getHighSpeedVideoFpsRangesFor == i && version.getHighSpeedVideoSizes == i2;
    }

    public static boolean isJavaVersion(int i, int i2, int i3) {
        com.datadog.trace.api.Platform.Version version = getHighSpeedVideoSizes;
        return version.getHighSpeedVideoFpsRangesFor == i && version.getHighSpeedVideoSizes == i2 && version.Camera2StreamConfigurationMap == i3;
    }

    public static boolean isJavaVersionAtLeast(int i) {
        return isJavaVersionAtLeast(i, 0, 0);
    }

    public static boolean isJavaVersionAtLeast(int i, int i2) {
        return isJavaVersionAtLeast(i, i2, 0);
    }

    public static boolean isJavaVersionAtLeast(int i, int i2, int i3) {
        com.datadog.trace.api.Platform.Version version = getHighSpeedVideoSizes;
        return com.datadog.trace.api.Platform.Version.getHighSpeedVideoFpsRanges(version.getHighSpeedVideoFpsRangesFor, version.getHighSpeedVideoSizes, version.Camera2StreamConfigurationMap, i, i2, i3);
    }

    public static boolean isJavaVersionBetween(int i, int i2) {
        return isJavaVersionBetween(i, 0, i2, 0);
    }

    public static boolean isJavaVersionBetween(int i, int i2, int i3, int i4) {
        return isJavaVersionBetween(i, i2, 0, i3, i4, 0);
    }

    public static boolean isJavaVersionBetween(int i, int i2, int i3, int i4, int i5, int i6) {
        com.datadog.trace.api.Platform.Version version = getHighSpeedVideoSizes;
        return com.datadog.trace.api.Platform.Version.getHighSpeedVideoFpsRanges(i4, i5, i6, i, i2, i3) && com.datadog.trace.api.Platform.Version.getHighSpeedVideoFpsRanges(version.getHighSpeedVideoFpsRangesFor, version.getHighSpeedVideoSizes, version.Camera2StreamConfigurationMap, i, i2, i3) && !com.datadog.trace.api.Platform.Version.getHighSpeedVideoFpsRanges(version.getHighSpeedVideoFpsRangesFor, version.getHighSpeedVideoSizes, version.Camera2StreamConfigurationMap, i4, i5, i6);
    }

    public static boolean isOracleJDK8() {
        if (!isJavaVersion(8)) {
            return false;
        }
        com.datadog.trace.api.Platform.JvmRuntime jvmRuntime = getHighSpeedVideoFpsRanges;
        return jvmRuntime.Camera2StreamConfigurationMap.contains("Oracle") && !jvmRuntime.getHighSpeedVideoSizes.contains("OpenJDK");
    }

    public static boolean isJ9() {
        return java.lang.System.getProperty("java.vm.name").contains("J9");
    }

    public static boolean isIbm8() {
        return isJavaVersion(8) && getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.contains("IBM");
    }

    public static boolean isGraalVM() {
        return getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.toLowerCase(java.util.Locale.US).contains("graalvm");
    }

    public static java.lang.String getLangVersion() {
        return java.lang.String.valueOf(getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor);
    }

    public static java.lang.String getRuntimeVendor() {
        return getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
    }

    public static java.lang.String getRuntimeVersion() {
        return getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
    }

    public static java.lang.String getRuntimePatches() {
        return getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
    }
}
