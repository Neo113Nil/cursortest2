package com.sun.jna;

/* loaded from: classes5.dex */
public class NativeLibrary implements java.io.Closeable {
    private static final java.util.logging.Level Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.String, java.lang.ref.Reference<com.sun.jna.NativeLibrary>> getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static final com.sun.jna.SymbolProvider getHighSpeedVideoFpsRangesFor;
    private static final java.util.LinkedHashSet<java.lang.String> getInputFormats;
    private static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getOutputFormats;
    private final com.sun.jna.internal.Cleaner.Cleanable getHighSpeedVideoSizesFor;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;
    private volatile long getOutputMinFrameDurationlomOqCM;
    private final java.util.Map<java.lang.String, ?> getOutputSizes;
    private final java.lang.String getOutputSizeshNQ4ISI;
    private final java.lang.String getOutputStallDuration;
    private final java.util.Map<java.lang.String, com.sun.jna.Function> getOutputStallDurationlomOqCM;
    private final com.sun.jna.SymbolProvider isOutputSupportedForhNQ4ISI;
    private static final byte[] $$d = {2, -20, 10, -99, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    private static final byte[] $$a = {com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, Byte.MAX_VALUE, -76, -9, 0, 0, -10, -15, -2, 10, -24, com.google.common.base.Ascii.FF, -10, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
    private static final int $$b = 28;
    private static final java.util.logging.Logger getHighSpeedVideoSizes = java.util.logging.Logger.getLogger(com.sun.jna.NativeLibrary.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 111 - s2;
        int i5 = i + 103;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[21 - s];
        int i6 = 20 - s;
        if (bArr == null) {
            int i7 = i6;
            i3 = i4;
            i2 = 0;
            i3++;
            i4 = (i4 + (-i7)) - 5;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i3++;
            i4 = (i4 + (-i7)) - 5;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = i5;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = s * 3;
        int i6 = (i * 3) + 103;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[35 - i5];
        int i7 = 34 - i5;
        if (bArr == null) {
            i3 = i4;
            int i8 = i7;
            i2 = 0;
            i4 = (i4 + (-i8)) - 3;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i8 = bArr[i3];
            i4 = (i4 + (-i8)) - 3;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        }
    }

    static {
        java.lang.String obj;
        java.lang.String str;
        Camera2StreamConfigurationMap = com.sun.jna.Native.DEBUG_LOAD ? java.util.logging.Level.INFO : java.util.logging.Level.FINE;
        getHighSpeedVideoFpsRangesFor = new com.sun.jna.SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j, java.lang.String str2, com.sun.jna.SymbolProvider symbolProvider) {
                return com.sun.jna.Native.findSymbol(j, str2);
            }
        };
        getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        getOutputFormats = new java.util.concurrent.ConcurrentHashMap();
        getInputFormats = new java.util.LinkedHashSet<>();
        if (com.sun.jna.Native.POINTER_SIZE == 0) {
            throw new java.lang.Error("Native library not initialized");
        }
        getHighSpeedVideoFpsRanges = null;
        try {
            getHighSpeedVideoFpsRanges = java.lang.Throwable.class.getMethod("addSuppressed", java.lang.Throwable.class);
        } catch (java.lang.NoSuchMethodException unused) {
        } catch (java.lang.SecurityException e) {
            java.util.logging.Logger.getLogger(com.sun.jna.NativeLibrary.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to initialize 'addSuppressed' method", (java.lang.Throwable) e);
        }
        byte[] bArr = $$a;
        byte b = bArr[10];
        byte b2 = bArr[29];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, (byte) (b2 | 104), objArr);
        java.lang.String webStartLibraryPath = com.sun.jna.Native.getWebStartLibraryPath((java.lang.String) objArr[0]);
        if (webStartLibraryPath != null) {
            getInputFormats.add(webStartLibraryPath);
        }
        if (java.lang.System.getProperty("jna.platform.library.path") == null && !com.sun.jna.Platform.isWindows()) {
            if (com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.isSolaris() || com.sun.jna.Platform.isFreeBSD() || com.sun.jna.Platform.iskFreeBSD()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.sun.jna.Platform.isSolaris() ? androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR : "");
                sb.append(com.sun.jna.Native.POINTER_SIZE * 8);
                obj = sb.toString();
            } else {
                obj = "";
            }
            java.lang.String[] strArr = {"/usr/lib".concat(java.lang.String.valueOf(obj)), "/lib".concat(java.lang.String.valueOf(obj)), "/usr/lib", "/lib"};
            if (com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.iskFreeBSD() || com.sun.jna.Platform.isGNU()) {
                java.lang.String str2 = com.sun.jna.Platform.ARCH;
                if (com.sun.jna.Platform.iskFreeBSD()) {
                    str = "-kfreebsd";
                } else {
                    str = com.sun.jna.Platform.isGNU() ? "" : "-linux";
                }
                java.lang.String str3 = "-gnu";
                if (com.sun.jna.Platform.isIntel()) {
                    str2 = com.sun.jna.Platform.is64Bit() ? "x86_64" : "i386";
                } else if (com.sun.jna.Platform.isPPC()) {
                    str2 = com.sun.jna.Platform.is64Bit() ? "powerpc64" : "powerpc";
                } else if (com.sun.jna.Platform.isARM()) {
                    str2 = "arm";
                    str3 = "-gnueabi";
                } else if (com.sun.jna.Platform.ARCH.equals("mips64el")) {
                    str3 = "-gnuabi64";
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                sb2.append(str3);
                java.lang.String obj2 = sb2.toString();
                strArr = new java.lang.String[]{"/usr/lib/".concat(java.lang.String.valueOf(obj2)), "/lib/".concat(java.lang.String.valueOf(obj2)), "/usr/lib".concat(java.lang.String.valueOf(obj)), "/lib".concat(java.lang.String.valueOf(obj)), "/usr/lib", "/lib"};
            }
            if (com.sun.jna.Platform.isLinux()) {
                java.util.ArrayList<java.lang.String> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                for (int length = strArr.length - 1; length >= 0; length--) {
                    int indexOf = highSpeedVideoFpsRangesFor.indexOf(strArr[length]);
                    if (indexOf != -1) {
                        highSpeedVideoFpsRangesFor.remove(indexOf);
                    }
                    highSpeedVideoFpsRangesFor.add(0, strArr[length]);
                }
                strArr = (java.lang.String[]) highSpeedVideoFpsRangesFor.toArray(new java.lang.String[0]);
            }
            java.lang.String str4 = "";
            java.lang.String str5 = str4;
            for (int i = 0; i < strArr.length; i++) {
                java.io.File file = new java.io.File(strArr[i]);
                if (file.exists() && file.isDirectory()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(str4);
                    sb3.append(str5);
                    sb3.append(strArr[i]);
                    str4 = sb3.toString();
                    str5 = java.io.File.pathSeparator;
                }
            }
            if (!"".equals(str4)) {
                java.lang.System.setProperty("jna.platform.library.path", str4);
            }
        }
        getInputFormats.addAll(Camera2StreamConfigurationMap("jna.platform.library.path"));
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(i);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(str2);
        return sb.toString();
    }

    private NativeLibrary(java.lang.String str, java.lang.String str2, long j, java.util.Map<java.lang.String, ?> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.getOutputStallDurationlomOqCM = hashMap;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes("---");
        int indexOf = highSpeedVideoSizes.indexOf("---");
        if (indexOf > 0 && str.startsWith(highSpeedVideoSizes.substring(0, indexOf))) {
            str = str.substring(indexOf);
        }
        int indexOf2 = str.indexOf(highSpeedVideoSizes.substring(indexOf + 3));
        str = indexOf2 != -1 ? str.substring(0, indexOf2) : str;
        this.getOutputSizeshNQ4ISI = str;
        this.getOutputStallDuration = str2;
        this.getOutputMinFrameDurationlomOqCM = j;
        this.getHighSpeedVideoSizesFor = com.sun.jna.internal.Cleaner.getCleaner().register(this, new com.sun.jna.NativeLibrary.NativeLibraryDisposer(j));
        java.lang.Object obj = map.get(com.sun.jna.Library.OPTION_CALLING_CONVENTION);
        int intValue = obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : 0;
        this.getOutputMinFrameDuration = intValue;
        this.getOutputSizes = map;
        com.sun.jna.SymbolProvider symbolProvider = (com.sun.jna.SymbolProvider) map.get(com.sun.jna.Library.OPTION_SYMBOL_PROVIDER);
        if (symbolProvider == null) {
            this.isOutputSupportedForhNQ4ISI = getHighSpeedVideoFpsRangesFor;
        } else {
            this.isOutputSupportedForhNQ4ISI = symbolProvider;
        }
        java.lang.String str3 = (java.lang.String) map.get(com.sun.jna.Library.OPTION_STRING_ENCODING);
        str3 = str3 == null ? com.sun.jna.Native.getDefaultStringEncoding() : str3;
        this.getInputSizeshNQ4ISI = str3;
        if (com.sun.jna.Platform.isWindows() && "kernel32".equals(str.toLowerCase())) {
            synchronized (hashMap) {
                hashMap.put(getHighSpeedVideoSizes("GetLastError", intValue, str3), new com.sun.jna.Function(this, "GetLastError", str3) { // from class: com.sun.jna.NativeLibrary.2
                    @Override // com.sun.jna.Function
                    final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr, java.lang.Class<?> cls, boolean z, int i) {
                        return java.lang.Integer.valueOf(com.sun.jna.Native.getLastError());
                    }

                    @Override // com.sun.jna.Function
                    final java.lang.Object Camera2StreamConfigurationMap(java.lang.reflect.Method method, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls, java.lang.Object[] objArr, java.util.Map<java.lang.String, ?> map2) {
                        return java.lang.Integer.valueOf(com.sun.jna.Native.getLastError());
                    }
                });
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x052a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.sun.jna.NativeLibrary getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.util.Map<java.lang.String, ?> map) {
        long j;
        ?? r23;
        byte[] bArr;
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        int i;
        java.lang.Class<?> cls3;
        java.lang.Object invoke;
        java.util.logging.Logger logger = getHighSpeedVideoSizes;
        java.util.logging.Level level = Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Looking for library '");
        sb.append(str);
        sb.append("'");
        logger.log(level, sb.toString());
        java.util.ArrayList<java.lang.Throwable> arrayList = new java.util.ArrayList();
        boolean isAbsolute = new java.io.File(str).isAbsolute();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.Object obj = map.get(com.sun.jna.Library.OPTION_OPEN_FLAGS);
        int intValue = obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : -1;
        java.util.List<java.lang.String> list = getOutputFormats.get(str);
        if (list != null) {
            synchronized (list) {
                linkedHashSet.addAll(list);
            }
        }
        java.lang.String webStartLibraryPath = com.sun.jna.Native.getWebStartLibraryPath(str);
        if (webStartLibraryPath != null) {
            logger.log(level, "Adding web start path ".concat(java.lang.String.valueOf(webStartLibraryPath)));
            linkedHashSet.add(webStartLibraryPath);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Adding paths from jna.library.path: ");
        sb2.append(java.lang.System.getProperty("jna.library.path"));
        logger.log(level, sb2.toString());
        linkedHashSet.addAll(Camera2StreamConfigurationMap("jna.library.path"));
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, linkedHashSet);
        try {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Trying ");
            sb3.append(highSpeedVideoFpsRangesFor);
            logger.log(level, sb3.toString());
            j = com.sun.jna.Native.open(highSpeedVideoFpsRangesFor, intValue);
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.util.logging.Logger logger2 = getHighSpeedVideoSizes;
            java.util.logging.Level level2 = Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Loading failed with message: ");
            sb4.append(e.getMessage());
            logger2.log(level2, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Adding system paths: ");
            java.util.LinkedHashSet<java.lang.String> linkedHashSet2 = getInputFormats;
            sb5.append(linkedHashSet2);
            logger2.log(level2, sb5.toString());
            arrayList.add(e);
            linkedHashSet.addAll(linkedHashSet2);
            j = 0;
        }
        if (j == 0) {
            try {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, linkedHashSet);
                java.util.logging.Logger logger3 = getHighSpeedVideoSizes;
                java.util.logging.Level level3 = Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Trying ");
                sb6.append(highSpeedVideoFpsRangesFor);
                logger3.log(level3, sb6.toString());
                j = com.sun.jna.Native.open(highSpeedVideoFpsRangesFor, intValue);
                if (j == 0) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Failed to load library '");
                    sb7.append(str);
                    sb7.append("'");
                    throw new java.lang.UnsatisfiedLinkError(sb7.toString());
                }
            } catch (java.lang.UnsatisfiedLinkError e2) {
                java.util.logging.Logger logger4 = getHighSpeedVideoSizes;
                java.util.logging.Level level4 = Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Loading failed with message: ");
                sb8.append(e2.getMessage());
                logger4.log(level4, sb8.toString());
                arrayList.add(e2);
                if (com.sun.jna.Platform.isAndroid()) {
                    try {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Preload (via System.loadLibrary) ");
                        sb9.append(str);
                        logger4.log(level4, sb9.toString());
                        java.lang.ClassLoader classLoader = com.sun.jna.NativeLibrary.class.getClassLoader();
                        try {
                            try {
                                java.lang.Object[] objArr = {-1395598504};
                                java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                                if (Camera2StreamConfigurationMap2 == null) {
                                    Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 349 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                try {
                                    java.lang.Object[] objArr2 = {str, classLoader, false, -395237219, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr), -395237219};
                                    java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                                    if (Camera2StreamConfigurationMap3 == null) {
                                        char red = (char) (android.graphics.Color.red(0) + 45285);
                                        r23 = (-16777058) - android.graphics.Color.rgb(0, 0, 0);
                                        int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3;
                                        byte[] bArr2 = $$d;
                                        byte b = bArr2[4];
                                        byte b2 = bArr2[14];
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        b(b, b2, b2, objArr3);
                                        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(red, r23, jumpTapTimeout, 1475857042, false, (java.lang.String) objArr3[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.graphics.Color.green(0)), 104 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 33 - android.view.View.MeasureSpec.getSize(0)), java.lang.Integer.TYPE});
                                    }
                                    java.lang.Object[] objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr2);
                                    if (((int[]) objArr4[2])[0] == ((int[]) objArr4[1])[0]) {
                                        java.lang.Object[] objArr5 = {r0, new int[]{r19}, new int[]{r15}, new int[1]};
                                        int i2 = ((int[]) objArr4[3])[0];
                                        int i3 = ((int[]) objArr4[2])[0];
                                        int i4 = ((int[]) objArr4[1])[0];
                                        java.lang.String[] strArr = (java.lang.String[]) objArr4[0];
                                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                                        int i5 = i2 + 917223468 + (((-131906) | (~uptimeMillis)) * (-490)) + (((~(uptimeMillis | (-278279002))) | 278147096) * 490) + 1185923120;
                                        int i6 = (i5 << 13) ^ i5;
                                        int i7 = i6 ^ (i6 >>> 17);
                                        ((int[]) objArr5[3])[0] = i7 ^ (i7 << 5);
                                        try {
                                            bArr = $$a;
                                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                                            a(bArr[14], bArr[29], (byte) 97, objArr6);
                                            cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            a(bArr[5], bArr[29], (byte) 81, objArr7);
                                            cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                                            byte b3 = (byte) (-bArr[43]);
                                            byte b4 = bArr[29];
                                            i = $$b;
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            a(b3, b4, (byte) (i | 33), objArr8);
                                            cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            a((byte) (-bArr[26]), bArr[5], bArr[17], objArr9);
                                            invoke = cls.getMethod((java.lang.String) objArr9[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                                        } catch (java.lang.reflect.InvocationTargetException e3) {
                                            e = e3;
                                        }
                                        try {
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            a(bArr[19], bArr[29], (byte) 37, objArr10);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            a((byte) (i >>> 2), bArr[5], (byte) (-bArr[42]), objArr11);
                                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr11[0], new java.lang.Class[0]).invoke(com.sun.jna.NativeLibrary.class, new java.lang.Object[0]);
                                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                byte b5 = bArr[10];
                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                a(b5, (byte) (-bArr[43]), b5, objArr12);
                                                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr12[0], cls3, cls2);
                                                declaredMethod.setAccessible(true);
                                                declaredMethod.invoke(invoke, str, invoke2);
                                            } else {
                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                a(bArr[46], (byte) (-bArr[43]), bArr[5], objArr13);
                                                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                                                declaredMethod2.setAccessible(true);
                                                declaredMethod2.invoke(invoke, invoke2, str);
                                            }
                                            j = com.sun.jna.Native.open(highSpeedVideoFpsRangesFor, intValue);
                                        } catch (java.lang.reflect.InvocationTargetException e4) {
                                            e = e4;
                                            java.lang.Throwable cause = e.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw e;
                                        }
                                    } else {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        java.lang.String[] strArr2 = (java.lang.String[]) objArr4[0];
                                        if (strArr2 != null) {
                                            for (java.lang.String str2 : strArr2) {
                                                arrayList2.add(str2);
                                            }
                                        }
                                        throw new java.lang.NullPointerException();
                                    }
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause3 = th2.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th2;
                            }
                        } catch (java.lang.UnsatisfiedLinkError e5) {
                            e = e5;
                            java.util.logging.Logger logger5 = getHighSpeedVideoSizes;
                            java.util.logging.Level level5 = Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Loading failed with message: ");
                            sb10.append(e.getMessage());
                            logger5.log(level5, sb10.toString());
                            arrayList.add(e);
                            j = r23;
                            if (j == 0) {
                                try {
                                    java.io.File extractFromResourcePath = com.sun.jna.Native.extractFromResourcePath(str, (java.lang.ClassLoader) map.get(com.sun.jna.Library.OPTION_CLASSLOADER));
                                    if (extractFromResourcePath != null) {
                                        try {
                                            j = com.sun.jna.Native.open(extractFromResourcePath.getAbsolutePath(), intValue);
                                            highSpeedVideoFpsRangesFor = extractFromResourcePath.getAbsolutePath();
                                            if (com.sun.jna.Native.getHighSpeedVideoFpsRanges(extractFromResourcePath)) {
                                                com.sun.jna.Native.Camera2StreamConfigurationMap(extractFromResourcePath);
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            if (com.sun.jna.Native.getHighSpeedVideoFpsRanges(extractFromResourcePath)) {
                                                com.sun.jna.Native.Camera2StreamConfigurationMap(extractFromResourcePath);
                                            }
                                            throw th3;
                                        }
                                    }
                                } catch (java.io.IOException e6) {
                                    java.util.logging.Logger logger6 = getHighSpeedVideoSizes;
                                    java.util.logging.Level level6 = Camera2StreamConfigurationMap;
                                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Loading failed with message: ");
                                    sb11.append(e6.getMessage());
                                    logger6.log(level6, sb11.toString());
                                    arrayList.add(e6);
                                }
                            }
                            if (j == 0) {
                                java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Unable to load library '");
                                sb12.append(str);
                                sb12.append("':");
                                for (java.lang.Throwable th4 : arrayList) {
                                    sb12.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                                    sb12.append(th4.getMessage());
                                }
                                java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError(sb12.toString());
                                for (java.lang.Throwable th5 : arrayList) {
                                    java.lang.reflect.Method method = getHighSpeedVideoFpsRanges;
                                    if (method != null) {
                                        try {
                                            method.invoke(unsatisfiedLinkError, th5);
                                        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e7) {
                                            throw new java.lang.RuntimeException("Failed to call addSuppressedMethod", e7);
                                        }
                                    }
                                }
                                throw unsatisfiedLinkError;
                            }
                            java.lang.String str3 = highSpeedVideoFpsRangesFor;
                            java.util.logging.Logger logger7 = getHighSpeedVideoSizes;
                            java.util.logging.Level level7 = Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Found library '");
                            sb13.append(str);
                            sb13.append("' at ");
                            sb13.append(str3);
                            logger7.log(level7, sb13.toString());
                            return new com.sun.jna.NativeLibrary(str, str3, j, map);
                        }
                    } catch (java.lang.UnsatisfiedLinkError e8) {
                        e = e8;
                        r23 = j;
                    }
                } else {
                    r23 = j;
                    if (com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.isFreeBSD()) {
                        logger4.log(level4, "Looking for version variants");
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(str, linkedHashSet);
                        if (highSpeedVideoFpsRangesFor != null) {
                            logger4.log(level4, "Trying ".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor)));
                            try {
                                j = com.sun.jna.Native.open(highSpeedVideoFpsRangesFor, intValue);
                            } catch (java.lang.UnsatisfiedLinkError e9) {
                                java.util.logging.Logger logger8 = getHighSpeedVideoSizes;
                                java.util.logging.Level level8 = Camera2StreamConfigurationMap;
                                java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Loading failed with message: ");
                                sb14.append(e9.getMessage());
                                logger8.log(level8, sb14.toString());
                                arrayList.add(e9);
                                j = r23;
                                if (j == 0) {
                                }
                                if (j == 0) {
                                }
                                java.lang.String str32 = highSpeedVideoFpsRangesFor;
                                java.util.logging.Logger logger72 = getHighSpeedVideoSizes;
                                java.util.logging.Level level72 = Camera2StreamConfigurationMap;
                                java.lang.StringBuilder sb132 = new java.lang.StringBuilder("Found library '");
                                sb132.append(str);
                                sb132.append("' at ");
                                sb132.append(str32);
                                logger72.log(level72, sb132.toString());
                                return new com.sun.jna.NativeLibrary(str, str32, j, map);
                            }
                        }
                        j = r23;
                    } else if (com.sun.jna.Platform.isMac() && !str.endsWith(".dylib")) {
                        for (java.lang.String str4 : getHighSpeedVideoSizesFor(str)) {
                            try {
                                java.util.logging.Logger logger9 = getHighSpeedVideoSizes;
                                java.util.logging.Level level9 = Camera2StreamConfigurationMap;
                                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                                sb15.append("Trying ");
                                sb15.append(str4);
                                logger9.log(level9, sb15.toString());
                                j = com.sun.jna.Native.open(str4, intValue);
                                break;
                            } catch (java.lang.UnsatisfiedLinkError e10) {
                                java.util.logging.Logger logger10 = getHighSpeedVideoSizes;
                                java.util.logging.Level level10 = Camera2StreamConfigurationMap;
                                java.lang.StringBuilder sb16 = new java.lang.StringBuilder("Loading failed with message: ");
                                sb16.append(e10.getMessage());
                                logger10.log(level10, sb16.toString());
                                arrayList.add(e10);
                            }
                        }
                        j = r23;
                    } else {
                        if (com.sun.jna.Platform.isWindows() && !isAbsolute) {
                            logger4.log(level4, "Looking for lib- prefix");
                            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor("lib".concat(java.lang.String.valueOf(str)), linkedHashSet);
                            if (highSpeedVideoFpsRangesFor != null) {
                                logger4.log(level4, "Trying ".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor)));
                                try {
                                    j = com.sun.jna.Native.open(highSpeedVideoFpsRangesFor, intValue);
                                } catch (java.lang.UnsatisfiedLinkError e11) {
                                    java.util.logging.Logger logger11 = getHighSpeedVideoSizes;
                                    java.util.logging.Level level11 = Camera2StreamConfigurationMap;
                                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder("Loading failed with message: ");
                                    sb17.append(e11.getMessage());
                                    logger11.log(level11, sb17.toString());
                                    arrayList.add(e11);
                                    j = r23;
                                    if (j == 0) {
                                    }
                                    if (j == 0) {
                                    }
                                    java.lang.String str322 = highSpeedVideoFpsRangesFor;
                                    java.util.logging.Logger logger722 = getHighSpeedVideoSizes;
                                    java.util.logging.Level level722 = Camera2StreamConfigurationMap;
                                    java.lang.StringBuilder sb1322 = new java.lang.StringBuilder("Found library '");
                                    sb1322.append(str);
                                    sb1322.append("' at ");
                                    sb1322.append(str322);
                                    logger722.log(level722, sb1322.toString());
                                    return new com.sun.jna.NativeLibrary(str, str322, j, map);
                                }
                            }
                        }
                        j = r23;
                    }
                }
                if (j == 0) {
                }
                if (j == 0) {
                }
            }
        }
        java.lang.String str3222 = highSpeedVideoFpsRangesFor;
        java.util.logging.Logger logger7222 = getHighSpeedVideoSizes;
        java.util.logging.Level level7222 = Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb13222 = new java.lang.StringBuilder("Found library '");
        sb13222.append(str);
        sb13222.append("' at ");
        sb13222.append(str3222);
        logger7222.log(level7222, sb13222.toString());
        return new com.sun.jna.NativeLibrary(str, str3222, j, map);
    }

    private static java.lang.String[] getHighSpeedVideoSizesFor(java.lang.String str) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.io.File file = new java.io.File(str);
        if (file.isAbsolute()) {
            if (str.contains(".framework")) {
                if (file.exists()) {
                    return new java.lang.String[]{file.getAbsolutePath()};
                }
                linkedHashSet.add(file.getAbsolutePath());
            } else {
                java.io.File parentFile = file.getParentFile();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(file.getName());
                sb.append(".framework");
                java.io.File file2 = new java.io.File(new java.io.File(parentFile, sb.toString()), file.getName());
                if (file2.exists()) {
                    return new java.lang.String[]{file2.getAbsolutePath()};
                }
                linkedHashSet.add(file2.getAbsolutePath());
            }
        } else {
            java.lang.String[] strArr = {java.lang.System.getProperty("user.home"), "", "/System"};
            if (!str.contains(".framework")) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(".framework/");
                sb2.append(str);
                str = sb2.toString();
            }
            for (int i = 0; i < 3; i++) {
                java.lang.String str2 = strArr[i];
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str2);
                sb3.append("/Library/Frameworks/");
                sb3.append(str);
                java.io.File file3 = new java.io.File(sb3.toString());
                if (file3.exists()) {
                    return new java.lang.String[]{file3.getAbsolutePath()};
                }
                linkedHashSet.add(file3.getAbsolutePath());
            }
        }
        return (java.lang.String[]) linkedHashSet.toArray(new java.lang.String[0]);
    }

    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String str) {
        return getInstance(str, (java.util.Map<java.lang.String, ?>) java.util.Collections.emptyMap());
    }

    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String str, java.lang.ClassLoader classLoader) {
        return getInstance(str, (java.util.Map<java.lang.String, ?>) java.util.Collections.singletonMap(com.sun.jna.Library.OPTION_CLASSLOADER, classLoader));
    }

    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String str, java.util.Map<java.lang.String, ?> map) {
        com.sun.jna.NativeLibrary nativeLibrary;
        com.sun.jna.NativeLibrary highResolutionOutputSizeshNQ4ISI;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        if (hashMap.get(com.sun.jna.Library.OPTION_CALLING_CONVENTION) == null) {
            hashMap.put(com.sun.jna.Library.OPTION_CALLING_CONVENTION, 0);
        }
        if ((com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.isFreeBSD() || com.sun.jna.Platform.isAIX()) && com.sun.jna.Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        java.util.Map<java.lang.String, java.lang.ref.Reference<com.sun.jna.NativeLibrary>> map2 = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(hashMap);
            java.lang.ref.Reference<com.sun.jna.NativeLibrary> reference = map2.get(sb.toString());
            nativeLibrary = reference != null ? reference.get() : null;
            if (nativeLibrary == null) {
                if (str != null) {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, hashMap);
                } else {
                    java.lang.Object obj = hashMap.get(com.sun.jna.Library.OPTION_OPEN_FLAGS);
                    highResolutionOutputSizeshNQ4ISI = new com.sun.jna.NativeLibrary("<process>", null, com.sun.jna.Native.open(null, obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : -1), hashMap);
                }
                nativeLibrary = highResolutionOutputSizeshNQ4ISI;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(nativeLibrary);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(nativeLibrary.getName());
                sb2.append(hashMap);
                map2.put(sb2.toString(), weakReference);
                java.io.File file = nativeLibrary.getFile();
                if (file != null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(file.getAbsolutePath());
                    sb3.append(hashMap);
                    map2.put(sb3.toString(), weakReference);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(file.getName());
                    sb4.append(hashMap);
                    map2.put(sb4.toString(), weakReference);
                }
            }
        }
        return nativeLibrary;
    }

    public static final com.sun.jna.NativeLibrary getProcess() {
        com.sun.jna.NativeLibrary nativeLibrary;
        synchronized (com.sun.jna.NativeLibrary.class) {
            nativeLibrary = getInstance(null);
        }
        return nativeLibrary;
    }

    public static final com.sun.jna.NativeLibrary getProcess(java.util.Map<java.lang.String, ?> map) {
        com.sun.jna.NativeLibrary nativeLibrary;
        synchronized (com.sun.jna.NativeLibrary.class) {
            nativeLibrary = getInstance((java.lang.String) null, map);
        }
        return nativeLibrary;
    }

    public static final void addSearchPath(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = getOutputFormats;
        java.util.List<java.lang.String> list = map.get(str);
        if (list == null) {
            list = java.util.Collections.synchronizedList(new java.util.ArrayList());
            map.put(str, list);
        }
        list.add(str2);
    }

    public com.sun.jna.Function getFunction(java.lang.String str) {
        return getFunction(str, this.getOutputMinFrameDuration);
    }

    final com.sun.jna.Function getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.reflect.Method method) {
        com.sun.jna.FunctionMapper functionMapper = (com.sun.jna.FunctionMapper) this.getOutputSizes.get(com.sun.jna.Library.OPTION_FUNCTION_MAPPER);
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        java.lang.String property = java.lang.System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i = this.getOutputMinFrameDuration;
        for (java.lang.Class<?> cls : method.getExceptionTypes()) {
            if (com.sun.jna.LastErrorException.class.isAssignableFrom(cls)) {
                i |= 64;
            }
        }
        return getFunction(str, i);
    }

    public com.sun.jna.Function getFunction(java.lang.String str, int i) {
        return getFunction(str, i, this.getInputSizeshNQ4ISI);
    }

    public com.sun.jna.Function getFunction(java.lang.String str, int i, java.lang.String str2) {
        com.sun.jna.Function function;
        if (str == null) {
            throw new java.lang.NullPointerException("Function name may not be null");
        }
        synchronized (this.getOutputStallDurationlomOqCM) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str, i, str2);
            function = this.getOutputStallDurationlomOqCM.get(highSpeedVideoSizes);
            if (function == null) {
                function = new com.sun.jna.Function(this, str, i, str2);
                this.getOutputStallDurationlomOqCM.put(highSpeedVideoSizes, function);
            }
        }
        return function;
    }

    public java.util.Map<java.lang.String, ?> getOptions() {
        return this.getOutputSizes;
    }

    public com.sun.jna.Pointer getGlobalVariableAddress(java.lang.String str) {
        try {
            return new com.sun.jna.Pointer(getHighSpeedVideoFpsRangesFor(str));
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error looking up '");
            sb.append(str);
            sb.append("': ");
            sb.append(e.getMessage());
            throw new java.lang.UnsatisfiedLinkError(sb.toString());
        }
    }

    final long getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (this.getOutputMinFrameDurationlomOqCM == 0) {
            throw new java.lang.UnsatisfiedLinkError("Library has been unloaded");
        }
        return this.isOutputSupportedForhNQ4ISI.getSymbolAddress(this.getOutputMinFrameDurationlomOqCM, str, getHighSpeedVideoFpsRangesFor);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Native Library <");
        sb.append(this.getOutputStallDuration);
        sb.append("@");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(">");
        return sb.toString();
    }

    public java.lang.String getName() {
        return this.getOutputSizeshNQ4ISI;
    }

    public java.io.File getFile() {
        if (this.getOutputStallDuration == null) {
            return null;
        }
        return new java.io.File(this.getOutputStallDuration);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.LinkedHashSet linkedHashSet;
        java.util.Map<java.lang.String, java.lang.ref.Reference<com.sun.jna.NativeLibrary>> map = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map) {
            linkedHashSet = new java.util.LinkedHashSet(map.values());
        }
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            com.sun.jna.NativeLibrary nativeLibrary = (com.sun.jna.NativeLibrary) ((java.lang.ref.Reference) it.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Map<java.lang.String, java.lang.ref.Reference<com.sun.jna.NativeLibrary>> map = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map) {
            for (java.util.Map.Entry<java.lang.String, java.lang.ref.Reference<com.sun.jna.NativeLibrary>> entry : map.entrySet()) {
                if (entry.getValue().get() == this) {
                    hashSet.add(entry.getKey());
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI.remove((java.lang.String) it.next());
            }
        }
        synchronized (this) {
            if (this.getOutputMinFrameDurationlomOqCM != 0) {
                this.getOutputMinFrameDurationlomOqCM = 0L;
                this.getHighSpeedVideoSizesFor.clean();
            }
        }
    }

    @java.lang.Deprecated
    public void dispose() {
        close();
    }

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String property = java.lang.System.getProperty(str, "");
        if ("".equals(property)) {
            return java.util.Collections.emptyList();
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(property, java.io.File.pathSeparator);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            if (!"".equals(nextToken)) {
                arrayList.add(nextToken);
            }
        }
        return arrayList;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.util.Collection<java.lang.String> collection) {
        if (new java.io.File(str).isAbsolute()) {
            return str;
        }
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        for (java.lang.String str2 : collection) {
            java.io.File file = new java.io.File(str2, highSpeedVideoSizes);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (com.sun.jna.Platform.isMac() && highSpeedVideoSizes.endsWith(".dylib")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(highSpeedVideoSizes.substring(0, highSpeedVideoSizes.lastIndexOf(".dylib")));
                sb.append(".jnilib");
                java.io.File file2 = new java.io.File(str2, sb.toString());
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
        }
        return highSpeedVideoSizes;
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        if (com.sun.jna.Platform.isMac()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            java.lang.String mapLibraryName = java.lang.System.mapLibraryName(str);
            if (!mapLibraryName.endsWith(".jnilib")) {
                return mapLibraryName;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(mapLibraryName.substring(0, mapLibraryName.lastIndexOf(".jnilib")));
            sb.append(".dylib");
            return sb.toString();
        }
        if (com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.isFreeBSD()) {
            if (getHighResolutionOutputSizeshNQ4ISI(str) || str.endsWith(".so")) {
                return str;
            }
        } else if (com.sun.jna.Platform.isAIX()) {
            if (getHighResolutionOutputSizeshNQ4ISI(str) || str.endsWith(".so") || str.startsWith("lib") || str.endsWith(".a")) {
                return str;
            }
        } else if (com.sun.jna.Platform.isWindows() && (str.endsWith(".drv") || str.endsWith(".dll") || str.endsWith(".ocx"))) {
            return str;
        }
        java.lang.String mapLibraryName2 = java.lang.System.mapLibraryName(str);
        return (com.sun.jna.Platform.isAIX() && mapLibraryName2.endsWith(".so")) ? mapLibraryName2.replaceAll(".so$", ".a") : mapLibraryName2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int lastIndexOf;
        int i;
        if (!str.startsWith("lib") || (lastIndexOf = str.lastIndexOf(".so.")) == -1 || (i = lastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i = lastIndexOf + 4; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!java.lang.Character.isDigit(charAt) && charAt != '.') {
                return false;
            }
        }
        return true;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(final java.lang.String str, java.util.Collection<java.lang.String> collection) {
        java.io.File file = new java.io.File(str);
        if (file.isAbsolute()) {
            collection = java.util.Arrays.asList(file.getParent());
        }
        java.io.FilenameFilter filenameFilter = new java.io.FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file2, java.lang.String str2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lib");
                sb.append(str);
                sb.append(".so");
                if (!str2.startsWith(sb.toString())) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(".so");
                    if (!str2.startsWith(sb2.toString()) || !str.startsWith("lib")) {
                        return false;
                    }
                }
                return com.sun.jna.NativeLibrary.getHighResolutionOutputSizeshNQ4ISI(str2);
            }
        };
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator<java.lang.String> it = collection.iterator();
        while (it.hasNext()) {
            java.io.File[] listFiles = new java.io.File(it.next()).listFiles(filenameFilter);
            if (listFiles != null && listFiles.length > 0) {
                linkedList.addAll(java.util.Arrays.asList(listFiles));
            }
        }
        java.util.Iterator it2 = linkedList.iterator();
        double d = -1.0d;
        java.lang.String str2 = null;
        while (it2.hasNext()) {
            java.lang.String absolutePath = ((java.io.File) it2.next()).getAbsolutePath();
            double outputFormats = getOutputFormats(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (outputFormats > d) {
                str2 = absolutePath;
                d = outputFormats;
            }
        }
        return str2;
    }

    private static double getOutputFormats(java.lang.String str) {
        java.lang.String str2;
        int indexOf = str.indexOf(".");
        double d = 1.0d;
        double d2 = 0.0d;
        while (str != null) {
            if (indexOf != -1) {
                java.lang.String substring = str.substring(0, indexOf);
                java.lang.String substring2 = str.substring(indexOf + 1);
                indexOf = substring2.indexOf(".");
                str2 = substring2;
                str = substring;
            } else {
                str2 = null;
            }
            try {
                d2 += java.lang.Integer.parseInt(str) / d;
                d *= 100.0d;
                str = str2;
            } catch (java.lang.NumberFormatException unused) {
                return 0.0d;
            }
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r2.waitFor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r2 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRangesFor() {
        java.lang.Process process;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.io.BufferedReader bufferedReader = null;
        try {
            process = java.lang.Runtime.getRuntime().exec("/sbin/ldconfig -p");
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            int indexOf = readLine.indexOf(" => ");
                            int lastIndexOf = readLine.lastIndexOf(47);
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf < lastIndexOf) {
                                java.lang.String substring = readLine.substring(indexOf + 4, lastIndexOf);
                                if (!arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } else {
                            try {
                                break;
                            } catch (java.io.IOException unused) {
                            }
                        }
                    } catch (java.lang.Exception unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (process != null) {
                            try {
                                process.waitFor();
                                throw th;
                            } catch (java.lang.InterruptedException unused5) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (java.lang.Exception unused6) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception unused7) {
            process = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            process = null;
        }
        return arrayList;
    }

    static final class NativeLibraryDisposer implements java.lang.Runnable {
        private long getHighSpeedVideoFpsRanges;

        public NativeLibraryDisposer(long j) {
            this.getHighSpeedVideoFpsRanges = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                long j = this.getHighSpeedVideoFpsRanges;
                if (j != 0) {
                    try {
                        com.sun.jna.Native.close(j);
                        this.getHighSpeedVideoFpsRanges = 0L;
                    } catch (java.lang.Throwable th) {
                        this.getHighSpeedVideoFpsRanges = 0L;
                        throw th;
                    }
                }
            }
        }
    }
}
