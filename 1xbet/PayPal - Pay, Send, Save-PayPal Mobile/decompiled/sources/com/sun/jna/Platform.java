package com.sun.jna;

/* loaded from: classes5.dex */
public final class Platform {
    public static final int AIX = 7;
    public static final int ANDROID = 8;
    public static final java.lang.String ARCH;
    public static final java.lang.String C_LIBRARY_NAME;
    public static final int DRAGONFLYBSD = 12;
    public static final int FREEBSD = 4;
    public static final int GNU = 9;
    public static final boolean HAS_AWT;
    public static final boolean HAS_BUFFERS;
    public static final boolean HAS_DLL_CALLBACKS;
    public static final boolean HAS_JAWT;
    public static final int KFREEBSD = 10;
    public static final int LINUX = 1;
    public static final int MAC = 0;
    public static final java.lang.String MATH_LIBRARY_NAME;
    public static final int NETBSD = 11;
    public static final int OPENBSD = 5;
    public static final java.lang.String RESOURCE_PREFIX;
    public static final boolean RO_FIELDS;
    public static final int SOLARIS = 3;
    public static final int UNSPECIFIED = -1;
    public static final int WINDOWS = 2;
    public static final int WINDOWSCE = 6;
    private static final int getHighSpeedVideoFpsRanges;

    static {
        boolean z;
        java.lang.String str;
        java.lang.String property = java.lang.System.getProperty("os.name");
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(java.lang.System.getProperty("java.vm.name").toLowerCase())) {
                getHighSpeedVideoFpsRanges = 8;
                java.lang.System.setProperty("jna.nounpack", "true");
            } else {
                getHighSpeedVideoFpsRanges = 1;
            }
        } else if (property.startsWith("AIX")) {
            getHighSpeedVideoFpsRanges = 7;
        } else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            getHighSpeedVideoFpsRanges = 0;
        } else if (property.startsWith("Windows CE")) {
            getHighSpeedVideoFpsRanges = 6;
        } else if (property.startsWith("Windows")) {
            getHighSpeedVideoFpsRanges = 2;
        } else if (property.startsWith("Solaris") || property.startsWith("SunOS")) {
            getHighSpeedVideoFpsRanges = 3;
        } else if (property.startsWith("FreeBSD")) {
            getHighSpeedVideoFpsRanges = 4;
        } else if (property.startsWith("OpenBSD")) {
            getHighSpeedVideoFpsRanges = 5;
        } else if (property.equalsIgnoreCase("gnu")) {
            getHighSpeedVideoFpsRanges = 9;
        } else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
            getHighSpeedVideoFpsRanges = 10;
        } else if (property.equalsIgnoreCase("netbsd")) {
            getHighSpeedVideoFpsRanges = 11;
        } else if (property.equalsIgnoreCase("dragonflybsd")) {
            getHighSpeedVideoFpsRanges = 12;
        } else {
            getHighSpeedVideoFpsRanges = -1;
        }
        try {
            java.lang.Class.forName("java.nio.Buffer");
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z = false;
        }
        int i = getHighSpeedVideoFpsRanges;
        boolean z2 = (i == 6 || i == 8 || i == 7) ? false : true;
        HAS_AWT = z2;
        HAS_JAWT = z2 && i != 0;
        HAS_BUFFERS = z;
        RO_FIELDS = i != 6;
        java.lang.String str2 = "msvcrt";
        if (i == 2) {
            str = "msvcrt";
        } else {
            str = i == 6 ? "coredll" : "c";
        }
        C_LIBRARY_NAME = str;
        if (i != 2) {
            str2 = i == 6 ? "coredll" : "m";
        }
        MATH_LIBRARY_NAME = str2;
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(java.lang.System.getProperty("os.arch"), i);
        ARCH = highResolutionOutputSizeshNQ4ISI;
        HAS_DLL_CALLBACKS = i == 2 && !highResolutionOutputSizeshNQ4ISI.startsWith("aarch");
        java.lang.String property2 = java.lang.System.getProperty("jna.prefix");
        if (property2 == null) {
            int oSType = getOSType();
            java.lang.String property3 = java.lang.System.getProperty("os.arch");
            java.lang.String property4 = java.lang.System.getProperty("os.name");
            java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(property3, oSType);
            switch (oSType) {
                case 0:
                    property2 = "darwin-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 1:
                    property2 = "linux-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 2:
                    property2 = "win32-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 3:
                    property2 = "sunos-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 4:
                    property2 = "freebsd-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 5:
                    property2 = "openbsd-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 6:
                    property2 = "w32ce-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 7:
                case 9:
                default:
                    java.lang.String lowerCase = property4.toLowerCase();
                    int indexOf = lowerCase.indexOf(" ");
                    if (indexOf != -1) {
                        lowerCase = lowerCase.substring(0, indexOf);
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(lowerCase);
                    sb.append("-");
                    sb.append(highResolutionOutputSizeshNQ4ISI2);
                    property2 = sb.toString();
                    break;
                case 8:
                    if (highResolutionOutputSizeshNQ4ISI2.startsWith("arm")) {
                        highResolutionOutputSizeshNQ4ISI2 = "arm";
                    }
                    property2 = "android-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 10:
                    property2 = "kfreebsd-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 11:
                    property2 = "netbsd-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
                case 12:
                    property2 = "dragonflybsd-".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2));
                    break;
            }
        }
        RESOURCE_PREFIX = property2;
    }

    private Platform() {
    }

    public static final int getOSType() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final boolean isMac() {
        return getHighSpeedVideoFpsRanges == 0;
    }

    public static final boolean isAndroid() {
        return getHighSpeedVideoFpsRanges == 8;
    }

    public static final boolean isLinux() {
        return getHighSpeedVideoFpsRanges == 1;
    }

    public static final boolean isAIX() {
        return getHighSpeedVideoFpsRanges == 7;
    }

    public static final boolean isWindowsCE() {
        return getHighSpeedVideoFpsRanges == 6;
    }

    public static final boolean isWindows() {
        int i = getHighSpeedVideoFpsRanges;
        return i == 2 || i == 6;
    }

    public static final boolean isSolaris() {
        return getHighSpeedVideoFpsRanges == 3;
    }

    public static final boolean isDragonFlyBSD() {
        return getHighSpeedVideoFpsRanges == 12;
    }

    public static final boolean isFreeBSD() {
        return getHighSpeedVideoFpsRanges == 4;
    }

    public static final boolean isOpenBSD() {
        return getHighSpeedVideoFpsRanges == 5;
    }

    public static final boolean isNetBSD() {
        return getHighSpeedVideoFpsRanges == 11;
    }

    public static final boolean isGNU() {
        return getHighSpeedVideoFpsRanges == 9;
    }

    public static final boolean iskFreeBSD() {
        return getHighSpeedVideoFpsRanges == 10;
    }

    public static final boolean isX11() {
        return (isWindows() || isMac()) ? false : true;
    }

    public static final boolean hasRuntimeExec() {
        return (isWindowsCE() && "J9".equals(java.lang.System.getProperty("java.vm.name"))) ? false : true;
    }

    public static final boolean is64Bit() {
        java.lang.String property = java.lang.System.getProperty("sun.arch.data.model", java.lang.System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        java.lang.String str = ARCH;
        return "x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "loongarch64".equals(str) || "amd64".equals(str) || "aarch64".equals(str) || com.sun.jna.Native.POINTER_SIZE == 8;
    }

    public static final boolean isIntel() {
        return ARCH.startsWith("x86");
    }

    public static final boolean isPPC() {
        return ARCH.startsWith("ppc");
    }

    public static final boolean isARM() {
        java.lang.String str = ARCH;
        return str.startsWith("arm") || str.startsWith("aarch");
    }

    public static final boolean isSPARC() {
        return ARCH.startsWith("sparc");
    }

    public static final boolean isMIPS() {
        java.lang.String str = ARCH;
        return str.equals("mips") || str.equals("mips64") || str.equals("mipsel") || str.equals("mips64el");
    }

    public static final boolean isLoongArch() {
        return ARCH.startsWith("loongarch");
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) {
        java.lang.String trim = str.toLowerCase().trim();
        if ("powerpc".equals(trim)) {
            trim = "ppc";
        } else if ("powerpc64".equals(trim)) {
            trim = "ppc64";
        } else if ("i386".equals(trim) || "i686".equals(trim)) {
            trim = "x86";
        } else if ("x86_64".equals(trim) || "amd64".equals(trim)) {
            trim = "x86-64";
        } else if ("zarch_64".equals(trim)) {
            trim = "s390x";
        }
        if ("ppc64".equals(trim) && "little".equals(java.lang.System.getProperty("sun.cpu.endian"))) {
            trim = "ppc64le";
        }
        return ("arm".equals(trim) && i == 1 && Camera2StreamConfigurationMap()) ? "armel" : trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2.getHighSpeedVideoFpsRanges == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean Camera2StreamConfigurationMap() {
        boolean z = false;
        try {
            java.io.File file = new java.io.File("/proc/self/exe");
            if (file.exists()) {
                com.sun.jna.ELFAnalyser highSpeedVideoFpsRanges = com.sun.jna.ELFAnalyser.getHighSpeedVideoFpsRanges(file.getCanonicalPath());
                if (!highSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
                }
                z = true;
                return !z;
            }
        } catch (java.io.IOException e) {
            java.util.logging.Logger.getLogger(com.sun.jna.Platform.class.getName()).log(java.util.logging.Level.INFO, "Failed to read '/proc/self/exe' or the target binary.", (java.lang.Throwable) e);
        } catch (java.lang.SecurityException e2) {
            java.util.logging.Logger.getLogger(com.sun.jna.Platform.class.getName()).log(java.util.logging.Level.INFO, "SecurityException while analysing '/proc/self/exe' or the target binary.", (java.lang.Throwable) e2);
        }
        return false;
    }
}
