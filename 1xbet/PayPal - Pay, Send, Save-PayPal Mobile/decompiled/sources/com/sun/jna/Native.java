package com.sun.jna;

/* loaded from: classes5.dex */
public final class Native implements com.sun.jna.Version {
    public static final int BOOL_SIZE;
    static java.lang.String Camera2StreamConfigurationMap;
    public static final boolean DEBUG_JNA_LOAD;
    public static final boolean DEBUG_LOAD;
    public static final java.nio.charset.Charset DEFAULT_CHARSET;
    public static final java.lang.String DEFAULT_ENCODING;
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    public static final int WCHAR_SIZE;
    private static com.sun.jna.Callback.UncaughtExceptionHandler callbackExceptionHandler;
    private static final java.util.logging.Level getHighResolutionOutputSizeshNQ4ISI;
    private static final com.sun.jna.Callback.UncaughtExceptionHandler getHighSpeedVideoFpsRanges;
    static final int getHighSpeedVideoFpsRangesFor;
    static final int getHighSpeedVideoSizes;
    private static final java.lang.Object getHighSpeedVideoSizesFor;
    private static final java.util.Map<java.lang.Class<?>, java.lang.ref.Reference<?>> getInputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.Thread, com.sun.jna.Pointer> getOutputFormats;
    private static final java.lang.ThreadLocal<com.sun.jna.Memory> getOutputMinFrameDuration;
    private static final java.util.Map<java.lang.Class<?>, long[]> getOutputMinFrameDurationlomOqCM;
    private static final java.util.Map<java.lang.Class<?>, com.sun.jna.NativeLibrary> getOutputSizes;
    private static final java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.Object>> getOutputSizeshNQ4ISI;
    private static final byte[] $$d = {91, -57, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
    private static final int $$e = 241;
    private static final byte[] $$a = {46, 102, 8, -90, -9, 0, 0, -10, -15, -2, 10, -24, com.google.common.base.Ascii.FF, -10, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.RS, -40, 9, -8, 8, -24, 6, -18, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, -40, 9, -8, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
    private static final int $$b = 49;
    private static final java.util.logging.Logger getInputFormats = java.util.logging.Logger.getLogger(com.sun.jna.Native.class.getName());

    /* loaded from: classes16.dex */
    public interface ffi_callback {
        void invoke(long j, long j2, long j3);
    }

    private static native long _getDirectBufferPointer(java.nio.Buffer buffer);

    private static native long _getPointer(long j);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = s2 + 100;
        byte[] bArr = $$a;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i + 6];
        int i5 = i + 5;
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = i7 + (-i4);
            i4 = i6 + 1;
            i3 = i9 - 5;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3;
            i6 = i4;
            i4 = bArr[i4];
            i8 = i2 + 1;
            i7 = i10;
            int i92 = i7 + (-i4);
            i4 = i6 + 1;
            i3 = i92 - 5;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b * 3);
        byte[] bArr = $$d;
        int i3 = 103 - (s * 3);
        int i4 = b2 * 2;
        byte[] bArr2 = new byte[35 - i4];
        int i5 = 34 - i4;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i2;
            int i9 = (i6 + i2) - 3;
            i = i7;
            int i10 = i8;
            i3 = i9;
            i2 = i10;
            int i11 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i3;
            i8 = i11;
            i2 = bArr[i11];
            i7 = i + 1;
            i6 = i12;
            int i92 = (i6 + i2) - 3;
            i = i7;
            int i102 = i8;
            i3 = i92;
            i2 = i102;
            int i112 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i1122 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    static native void close(long j);

    static native synchronized long createNativeCallback(com.sun.jna.Callback callback, java.lang.reflect.Method method, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls, int i, int i2, java.lang.String str);

    public static native void ffi_call(long j, long j2, long j3, long j4);

    public static native void ffi_free_closure(long j);

    public static native long ffi_prep_cif(int i, int i2, long j, long j2);

    public static native long ffi_prep_closure(long j, com.sun.jna.Native.ffi_callback ffi_callbackVar);

    static native long findSymbol(long j, java.lang.String str);

    public static native void free(long j);

    static native synchronized void freeNativeCallback(long j);

    private static native java.lang.String getAPIChecksum();

    static native byte getByte(com.sun.jna.Pointer pointer, long j, long j2);

    static native char getChar(com.sun.jna.Pointer pointer, long j, long j2);

    static native java.nio.ByteBuffer getDirectByteBuffer(com.sun.jna.Pointer pointer, long j, long j2, long j3);

    static native double getDouble(com.sun.jna.Pointer pointer, long j, long j2);

    static native float getFloat(com.sun.jna.Pointer pointer, long j, long j2);

    static native int getInt(com.sun.jna.Pointer pointer, long j, long j2);

    public static native int getLastError();

    static native long getLong(com.sun.jna.Pointer pointer, long j, long j2);

    private static native java.lang.String getNativeVersion();

    static native short getShort(com.sun.jna.Pointer pointer, long j, long j2);

    static native byte[] getStringBytes(com.sun.jna.Pointer pointer, long j, long j2);

    static native java.lang.String getWideString(com.sun.jna.Pointer pointer, long j, long j2);

    static native long getWindowHandle0(java.awt.Component component);

    static native long indexOf(com.sun.jna.Pointer pointer, long j, long j2, byte b);

    private static native void initIDs();

    static native int initialize_ffi_type(long j);

    static native double invokeDouble(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    static native float invokeFloat(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    static native int invokeInt(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    static native long invokeLong(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    static native java.lang.Object invokeObject(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    static native long invokePointer(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    private static native void invokeStructure(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr, long j2, long j3);

    static native void invokeVoid(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr);

    public static native synchronized boolean isProtected();

    public static native long malloc(long j);

    static native long open(java.lang.String str, int i);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    static native void read(com.sun.jna.Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    private static native long registerMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.String str2, int[] iArr, long[] jArr, long[] jArr2, int i, long j, long j2, java.lang.reflect.Method method, long j3, int i2, boolean z, com.sun.jna.ToNativeConverter[] toNativeConverterArr, com.sun.jna.FromNativeConverter fromNativeConverter, java.lang.String str3);

    static native void setByte(com.sun.jna.Pointer pointer, long j, long j2, byte b);

    static native void setChar(com.sun.jna.Pointer pointer, long j, long j2, char c);

    private static native void setDetachState(boolean z, long j);

    static native void setDouble(com.sun.jna.Pointer pointer, long j, long j2, double d);

    static native void setFloat(com.sun.jna.Pointer pointer, long j, long j2, float f);

    static native void setInt(com.sun.jna.Pointer pointer, long j, long j2, int i);

    public static native void setLastError(int i);

    static native void setLong(com.sun.jna.Pointer pointer, long j, long j2, long j3);

    static native void setMemory(com.sun.jna.Pointer pointer, long j, long j2, long j3, byte b);

    static native void setPointer(com.sun.jna.Pointer pointer, long j, long j2, long j3);

    public static native synchronized void setProtected(boolean z);

    static native void setShort(com.sun.jna.Pointer pointer, long j, long j2, short s);

    static native void setWideString(com.sun.jna.Pointer pointer, long j, long j2, java.lang.String str);

    private static native int sizeof(int i);

    private static native void unregister(java.lang.Class<?> cls, long[] jArr);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    static native void write(com.sun.jna.Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(13:270|271|(1:5)|6|(1:8)(1:269)|9|(4:251|252|(2:254|(3:256|(2:262|263)(1:260)|261)(1:264))|266)(0)|11|(3:13|(7:16|(12:147|148|149|150|(1:152)|153|154|155|(1:157)|158|159|(13:161|162|163|164|165|166|168|169|170|171|172|(1:(3:175|176|177)(5:188|180|(1:182)|183|185))|189)(5:203|204|(3:206|(2:209|207)|210)|211|212))|18|19|(1:146)(4:21|(1:23)(1:145)|24|(15:26|27|28|29|30|(1:32)|33|34|35|36|(1:38)|39|40|41|(13:43|44|45|46|(1:(10:49|50|51|(2:106|60)|53|54|(1:56)|57|59|60)(6:109|54|(0)|57|59|60))|110|(2:112|60)|53|54|(0)|57|59|60)(5:118|119|(3:121|(2:124|122)|125)|126|127))(1:144))|143|14)|227)|228|(12:237|238|239|240|(1:242)(1:244)|243|61|(2:65|(8:68|(1:70)|71|(1:99)|91|(1:95)|96|97))|100|(1:102)(1:105)|103|104)|232|(7:234|61|(3:63|65|(9:68|(0)|71|(1:73)|99|91|(2:93|95)|96|97))|100|(0)(0)|103|104)(2:235|236))|3|(0)|6|(0)(0)|9|(0)(0)|11|(0)|228|(1:230)|237|238|239|240|(0)(0)|243|61|(0)|100|(0)(0)|103|104) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03c4, code lost:
    
        if (r5.invoke(r13, r3, r2) == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03fa, code lost:
    
        r5 = r3.substring(r3.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) + 4, r3.length() - 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03f8, code lost:
    
        if (r5.invoke(r13, r3, r2) != null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a72 A[Catch: InvocationTargetException -> 0x0ad0, UnsatisfiedLinkError -> 0x0ada, TryCatch #10 {InvocationTargetException -> 0x0ad0, blocks: (B:240:0x09ab, B:242:0x0a72, B:244:0x0a9e), top: B:239:0x09ab, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0a9e A[Catch: InvocationTargetException -> 0x0ad0, UnsatisfiedLinkError -> 0x0ada, TRY_LEAVE, TryCatch #10 {InvocationTargetException -> 0x0ad0, blocks: (B:240:0x09ab, B:242:0x0a72, B:244:0x0a9e), top: B:239:0x09ab, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0850 A[Catch: InvocationTargetException -> 0x091e, UnsatisfiedLinkError -> 0x095a, TryCatch #3 {InvocationTargetException -> 0x091e, blocks: (B:45:0x0712, B:51:0x07df, B:53:0x0838, B:54:0x084a, B:56:0x0850, B:57:0x087d, B:110:0x0808), top: B:44:0x0712, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r19v10, types: [int] */
    /* JADX WARN: Type inference failed for: r19v9, types: [int] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    static {
        java.nio.charset.Charset forName;
        java.lang.String property;
        java.lang.String str;
        java.lang.String[] split;
        java.lang.String[] split2;
        java.lang.String property2;
        int parseInt;
        int parseInt2;
        int sizeof;
        ?? r21;
        java.util.StringTokenizer stringTokenizer;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.reflect.Method declaredMethod;
        java.lang.String property3 = java.lang.System.getProperty("native.encoding");
        try {
            if (property3 != null) {
                try {
                    forName = java.nio.charset.Charset.forName(property3);
                } catch (java.lang.Exception e) {
                    java.util.logging.Logger logger = getInputFormats;
                    java.util.logging.Level level = java.util.logging.Level.WARNING;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get charset for native.encoding value : '");
                    sb.append(property3);
                    sb.append("'");
                    logger.log(level, sb.toString(), (java.lang.Throwable) e);
                }
                if (forName == null) {
                    forName = java.nio.charset.Charset.defaultCharset();
                }
                DEFAULT_CHARSET = forName;
                DEFAULT_ENCODING = forName.name();
                DEBUG_LOAD = java.lang.Boolean.getBoolean("jna.debug_load");
                boolean z = java.lang.Boolean.getBoolean("jna.debug_load.jna");
                DEBUG_JNA_LOAD = z;
                getHighResolutionOutputSizeshNQ4ISI = !z ? java.util.logging.Level.INFO : java.util.logging.Level.FINE;
                Camera2StreamConfigurationMap = null;
                getOutputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                getInputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                com.sun.jna.Callback.UncaughtExceptionHandler uncaughtExceptionHandler = new com.sun.jna.Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
                    @Override // com.sun.jna.Callback.UncaughtExceptionHandler
                    public void uncaughtException(com.sun.jna.Callback callback, java.lang.Throwable th) {
                        java.util.logging.Logger logger2 = com.sun.jna.Native.getInputFormats;
                        java.util.logging.Level level2 = java.util.logging.Level.WARNING;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JNA: Callback ");
                        sb2.append(callback);
                        sb2.append(" threw the following exception");
                        logger2.log(level2, sb2.toString(), th);
                    }
                };
                getHighSpeedVideoFpsRanges = uncaughtExceptionHandler;
                callbackExceptionHandler = uncaughtExceptionHandler;
                int i = 0;
                if (!java.lang.Boolean.getBoolean("jna.nounpack")) {
                    try {
                        java.io.File[] listFiles = getHighSpeedVideoFpsRangesFor().listFiles(new java.io.FilenameFilter() { // from class: com.sun.jna.Native.5
                            @Override // java.io.FilenameFilter
                            public boolean accept(java.io.File file, java.lang.String str5) {
                                return str5.endsWith(".x") && str5.startsWith("jna");
                            }
                        });
                        int i2 = 0;
                        while (listFiles != null) {
                            if (i2 >= listFiles.length) {
                                break;
                            }
                            java.io.File file = listFiles[i2];
                            java.lang.String name2 = file.getName();
                            java.io.File file2 = new java.io.File(file.getParentFile(), name2.substring(0, name2.length() - 2));
                            if (!file2.exists() || file2.delete()) {
                                file.delete();
                            }
                            i2++;
                        }
                    } catch (java.io.IOException e2) {
                        getInputFormats.log(java.util.logging.Level.WARNING, "JNA Warning: IOException removing temporary files", (java.lang.Throwable) e2);
                    }
                }
                char c = 5;
                int i3 = 1;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(r2[5], (byte) (-$$a[43]), r2[19], objArr);
                java.lang.String property4 = java.lang.System.getProperty("jna.boot.library.name", (java.lang.String) objArr[0]);
                property = java.lang.System.getProperty("jna.boot.library.path");
                if (property != null) {
                    java.util.StringTokenizer stringTokenizer2 = new java.util.StringTokenizer(property, java.io.File.pathSeparator);
                    while (stringTokenizer2.hasMoreTokens()) {
                        java.io.File file3 = new java.io.File(new java.io.File(stringTokenizer2.nextToken()), java.lang.System.mapLibraryName(property4).replace(".dylib", ".jnilib"));
                        java.lang.String absolutePath = file3.getAbsolutePath();
                        java.util.logging.Logger logger2 = getInputFormats;
                        java.util.logging.Level level2 = getHighResolutionOutputSizeshNQ4ISI;
                        logger2.log(level2, "Looking in {0}", absolutePath);
                        if (file3.exists()) {
                            try {
                                logger2.log(level2, "Trying {0}", absolutePath);
                                java.lang.System.setProperty("jnidispatch.path", absolutePath);
                                java.lang.ClassLoader classLoader = com.sun.jna.Native.class.getClassLoader();
                                try {
                                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                                    objArr2[i] = -1395598504;
                                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                                    stringTokenizer = stringTokenizer;
                                    r21 = r21;
                                    if (Camera2StreamConfigurationMap2 == null) {
                                        char indexOf = (char) android.text.TextUtils.indexOf("", "", i);
                                        int i4 = (android.widget.ExpandableListView.getPackedPositionForChild(i, i) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i, i) == 0L ? 0 : -1)) + 350;
                                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L) + 11;
                                        r21 = 778736581;
                                        java.lang.Class[] clsArr = new java.lang.Class[i3];
                                        clsArr[i] = java.lang.Integer.TYPE;
                                        ?? r19 = i4;
                                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf, r19, packedPositionChild, 778736581, false, null, clsArr);
                                        stringTokenizer = r19;
                                    }
                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2);
                                    try {
                                        try {
                                            java.lang.Object[] objArr3 = new java.lang.Object[6];
                                            objArr3[c] = 950636936;
                                            objArr3[4] = newInstance;
                                            objArr3[3] = 950636936;
                                            objArr3[2] = java.lang.Boolean.valueOf((boolean) i3);
                                            objArr3[i3] = classLoader;
                                            objArr3[i] = absolutePath;
                                            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                                            stringTokenizer = stringTokenizer;
                                            r21 = r21;
                                            if (Camera2StreamConfigurationMap3 == null) {
                                                char myPid = (char) (45285 - (android.os.Process.myPid() >> 22));
                                                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                                                int bitsPerPixel = 2 - android.graphics.ImageFormat.getBitsPerPixel(i);
                                                r21 = 1475857042;
                                                byte b = $$d[14];
                                                byte b2 = b;
                                                java.lang.Object[] objArr4 = new java.lang.Object[i3];
                                                b(b, b2, b2, objArr4);
                                                java.lang.String str5 = (java.lang.String) objArr4[i];
                                                java.lang.Class[] clsArr2 = new java.lang.Class[6];
                                                clsArr2[i] = java.lang.String.class;
                                                clsArr2[i3] = java.lang.ClassLoader.class;
                                                clsArr2[2] = java.lang.Boolean.TYPE;
                                                clsArr2[3] = java.lang.Integer.TYPE;
                                                clsArr2[4] = (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.os.Process.getGidForName("") + 15772), 104 - android.view.View.MeasureSpec.getMode(i), 33 - android.view.View.MeasureSpec.getMode(i));
                                                clsArr2[5] = java.lang.Integer.TYPE;
                                                ?? r192 = packedPositionType;
                                                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(myPid, r192, bitsPerPixel, 1475857042, false, str5, clsArr2);
                                                stringTokenizer = r192;
                                            }
                                            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
                                            if (((int[]) objArr5[2])[i] == ((int[]) objArr5[i3])[i]) {
                                                java.lang.Object[] objArr6 = new java.lang.Object[4];
                                                int[] iArr = new int[i3];
                                                objArr6[i3] = iArr;
                                                int[] iArr2 = new int[i3];
                                                objArr6[2] = iArr2;
                                                objArr6[3] = new int[i3];
                                                int i5 = ((int[]) objArr5[3])[i];
                                                int i6 = ((int[]) objArr5[2])[i];
                                                int i7 = ((int[]) objArr5[i3])[i];
                                                java.lang.String[] strArr = (java.lang.String[]) objArr5[i];
                                                iArr2[i] = i6;
                                                iArr[i] = i7;
                                                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                int i8 = ~((-83904707) | maxMemory);
                                                int i9 = ~maxMemory;
                                                int i10 = i5 + (-811324766) + ((i8 | (~((-819527685) | i9))) * 497) + (((~(maxMemory | (-819527685))) | (~((-117471707) | i9)) | 33567000) * 497);
                                                int i11 = (i10 << 13) ^ i10;
                                                int i12 = i11 ^ (i11 >>> 17);
                                                ((int[]) objArr6[3])[i] = i12 ^ (i12 << 5);
                                                objArr6[i] = strArr;
                                                try {
                                                    byte[] bArr = $$a;
                                                    java.lang.Object[] objArr7 = new java.lang.Object[i3];
                                                    a(bArr[10], (byte) (-bArr[26]), bArr[19], objArr7);
                                                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[i]);
                                                    java.lang.Object[] objArr8 = new java.lang.Object[i3];
                                                    a((byte) (-bArr[15]), (byte) (-bArr[8]), bArr[19], objArr8);
                                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[i]);
                                                    java.lang.Object[] objArr9 = new java.lang.Object[i3];
                                                    a(bArr[i], bArr[10], bArr[19], objArr9);
                                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                                    stringTokenizer = stringTokenizer2;
                                                    try {
                                                        java.lang.Object[] objArr10 = new java.lang.Object[i3];
                                                        a((byte) ($$b | 12), bArr[14], bArr[29], objArr10);
                                                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                                                        try {
                                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                            a((byte) 70, bArr[46], bArr[19], objArr11);
                                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                            a((byte) 84, bArr[2], bArr[29], objArr12);
                                                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.sun.jna.Native.class, new java.lang.Object[0]);
                                                            if (android.os.Build.VERSION.SDK_INT <= 27) {
                                                                if (absolutePath != null) {
                                                                    byte b3 = (byte) 97;
                                                                    try {
                                                                        byte b4 = bArr[5];
                                                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                                        a(b3, b4, b4, objArr13);
                                                                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                                                        declaredMethod2.setAccessible(true);
                                                                    } catch (java.lang.Exception unused) {
                                                                    }
                                                                } else {
                                                                    java.lang.String str6 = absolutePath;
                                                                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                                        a((byte) 111, (byte) (-$$a[43]), r10[2], objArr14);
                                                                        java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls3, cls2);
                                                                        declaredMethod3.setAccessible(true);
                                                                        declaredMethod3.invoke(invoke, str6, invoke2);
                                                                    }
                                                                    byte b5 = (byte) ($$b | 72);
                                                                    byte[] bArr2 = $$a;
                                                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                                    a(b5, bArr2[19], bArr2[2], objArr15);
                                                                    java.lang.reflect.Method declaredMethod4 = cls.getDeclaredMethod((java.lang.String) objArr15[0], cls2, cls3);
                                                                    declaredMethod4.setAccessible(true);
                                                                    declaredMethod4.invoke(invoke, invoke2, str6);
                                                                    Camera2StreamConfigurationMap = absolutePath;
                                                                    int i13 = ((int[]) objArr6[3])[0];
                                                                    int i14 = i13 * i13;
                                                                    int i15 = -(136658847 * i13);
                                                                    int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                                                                    int i17 = -(i13 * 1607109693);
                                                                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                                                                    int i19 = ((i18 | 1405593924) << 1) - (1405593924 ^ i18);
                                                                    int i20 = i19 >> 19;
                                                                    int i21 = ((i20 & (-16383)) + (i20 | (-16383))) / 8192;
                                                                    int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
                                                                    int i23 = ((i19 | i22) << 1) - (i22 ^ i19);
                                                                    int i24 = i19 >> 15;
                                                                    int i25 = ((((-262143) | i24) << 1) - (i24 ^ (-262143))) / 131072;
                                                                    int i26 = -(((i25 ^ 1) + ((i25 & 1) << 1)) ^ i23);
                                                                    int i27 = (i26 & 4) + (i26 | 4);
                                                                    int i28 = i27 >> 21;
                                                                    int i29 = ((i28 & (-4095)) + (i28 | (-4095))) / 2048;
                                                                    logger2.log(level2, "30/1/Found jnidispatch at {0}".substring(1200 / (((-(((i29 ^ 1) + ((i29 & 1) << 1)) + 1)) & i27) * 60)), absolutePath);
                                                                }
                                                            }
                                                            byte[] bArr3 = $$a;
                                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                            a(bArr3[1], bArr3[14], bArr3[10], objArr16);
                                                            java.lang.reflect.Method declaredMethod5 = cls.getDeclaredMethod((java.lang.String) objArr16[0], cls3, cls2);
                                                            declaredMethod5.setAccessible(true);
                                                        } catch (java.lang.reflect.InvocationTargetException e3) {
                                                            e = e3;
                                                            java.lang.reflect.InvocationTargetException invocationTargetException = e;
                                                            java.lang.Throwable cause = invocationTargetException.getCause();
                                                            if (cause == null) {
                                                                throw invocationTargetException;
                                                            }
                                                            throw cause;
                                                        }
                                                    } catch (java.lang.UnsatisfiedLinkError unused2) {
                                                        r21 = property4;
                                                    } catch (java.lang.reflect.InvocationTargetException e4) {
                                                        e = e4;
                                                    }
                                                } catch (java.lang.reflect.InvocationTargetException e5) {
                                                    e = e5;
                                                }
                                            } else {
                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
                                                if (strArr2 != null) {
                                                    for (java.lang.String str7 : strArr2) {
                                                        arrayList.add(str7);
                                                    }
                                                }
                                                throw new java.lang.NullPointerException();
                                            }
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause2 = th.getCause();
                                            if (cause2 == null) {
                                                throw th;
                                            }
                                            throw cause2;
                                        }
                                    } catch (java.lang.UnsatisfiedLinkError unused3) {
                                    }
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause3 = th2.getCause();
                                    if (cause3 == null) {
                                        throw th2;
                                    }
                                    throw cause3;
                                }
                            } catch (java.lang.UnsatisfiedLinkError unused4) {
                            }
                        }
                        r21 = property4;
                        stringTokenizer = stringTokenizer2;
                        if (com.sun.jna.Platform.isMac()) {
                            if (absolutePath.endsWith("dylib")) {
                                str2 = "dylib";
                                str3 = "jnilib";
                            } else {
                                str3 = "dylib";
                                str2 = "jnilib";
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(absolutePath.substring(0, absolutePath.lastIndexOf(str2)));
                            sb2.append(str3);
                            java.lang.String obj = sb2.toString();
                            java.util.logging.Logger logger3 = getInputFormats;
                            java.util.logging.Level level3 = getHighResolutionOutputSizeshNQ4ISI;
                            logger3.log(level3, "Looking in {0}", obj);
                            if (new java.io.File(obj).exists()) {
                                try {
                                    logger3.log(level3, "Trying {0}", obj);
                                    java.lang.System.setProperty("jnidispatch.path", obj);
                                    java.lang.ClassLoader classLoader2 = com.sun.jna.Native.class.getClassLoader();
                                    try {
                                        java.lang.Object[] objArr17 = {-1395598504};
                                        java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                                        if (Camera2StreamConfigurationMap4 == null) {
                                            Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.graphics.Color.red(0), 350 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 10 - (android.os.Process.myTid() >> 22), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                                        }
                                        try {
                                            java.lang.Object[] objArr18 = {obj, classLoader2, true, -1828816005, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap4).newInstance(objArr17), -1828816005};
                                            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                                            if (Camera2StreamConfigurationMap5 == null) {
                                                char windowTouchSlop = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 45285);
                                                int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 159;
                                                int myPid2 = 3 - (android.os.Process.myPid() >> 22);
                                                byte b6 = $$d[14];
                                                byte b7 = b6;
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                b(b6, b7, b7, objArr19);
                                                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(windowTouchSlop, indexOf2, myPid2, 1475857042, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.view.KeyEvent.keyCodeFromString("")), 104 - android.graphics.Color.argb(0, 0, 0, 0), 34 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), java.lang.Integer.TYPE});
                                            }
                                            java.lang.Object[] objArr20 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr18);
                                            if (((int[]) objArr20[2])[0] == ((int[]) objArr20[1])[0]) {
                                                java.lang.Object[] objArr21 = {r5, new int[]{r12}, new int[]{r11}, new int[1]};
                                                int i30 = ((int[]) objArr20[3])[0];
                                                int i31 = ((int[]) objArr20[2])[0];
                                                int i32 = ((int[]) objArr20[1])[0];
                                                java.lang.String[] strArr3 = (java.lang.String[]) objArr20[0];
                                                int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                                                int i33 = ~uptimeMillis;
                                                int i34 = i30 + 1679009008 + (((~(600106518 | i33)) | 420797578) * (-328)) + ((uptimeMillis | 420797578) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(uptimeMillis | (-600106519))) | 17089538 | (~(i33 | 1003814558))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                                                int i35 = (i34 << 13) ^ i34;
                                                int i36 = i35 ^ (i35 >>> 17);
                                                ((int[]) objArr21[3])[0] = i36 ^ (i36 << 5);
                                                try {
                                                    byte[] bArr4 = $$a;
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    a(bArr4[10], (byte) (-bArr4[26]), bArr4[19], objArr22);
                                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                    a((byte) (-bArr4[15]), (byte) (-bArr4[8]), bArr4[19], objArr23);
                                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                    a(bArr4[0], bArr4[10], bArr4[19], objArr24);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    a((byte) ($$b | 12), bArr4[14], bArr4[29], objArr25);
                                                    java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr25[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                    a((byte) 70, bArr4[46], bArr4[19], objArr26);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    a((byte) 84, bArr4[2], bArr4[29], objArr27);
                                                    java.lang.Object invoke4 = cls8.getMethod((java.lang.String) objArr27[0], new java.lang.Class[0]).invoke(com.sun.jna.Native.class, new java.lang.Object[0]);
                                                    if (android.os.Build.VERSION.SDK_INT <= 27) {
                                                        if (obj != null) {
                                                            byte b8 = (byte) 97;
                                                            try {
                                                                byte b9 = bArr4[5];
                                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                a(b8, b9, b9, objArr28);
                                                                declaredMethod = cls5.getDeclaredMethod((java.lang.String) objArr28[0], cls7, cls6);
                                                                declaredMethod.setAccessible(true);
                                                            } catch (java.lang.Exception unused5) {
                                                            }
                                                            if (declaredMethod.invoke(invoke3, obj, invoke4) == null) {
                                                                Camera2StreamConfigurationMap = obj;
                                                                int i37 = ((int[]) objArr21[3])[0];
                                                                int i38 = i37 * i37;
                                                                int i39 = -(1267252260 * i37);
                                                                int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                                                                int i41 = -(i37 * 80561968);
                                                                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                                                                int i43 = ((i42 | (-1356938012)) << 1) - ((-1356938012) ^ i42);
                                                                int i44 = i43 >> 21;
                                                                int i45 = (i44 - 4095) / 2048;
                                                                int i46 = ((i45 | 1) << 1) - (i45 ^ 1);
                                                                int i47 = (i43 & i46) + (i43 | i46);
                                                                int i48 = ((i44 ^ (-4095)) + ((i44 & (-4095)) << 1)) / 2048;
                                                                int i49 = -((((i48 | 1) << 1) - (i48 ^ 1)) ^ i47);
                                                                int i50 = ((i49 | 6) << 1) - (i49 ^ 6);
                                                                int i51 = i50 >> 28;
                                                                int i52 = ((i51 & (-31)) + (i51 | (-31))) / 16;
                                                                logger3.log(level3, "24/Found jnidispatch at {0}".substring(32400 / (((-((((i52 | 1) << 1) - (i52 ^ 1)) + 1)) & i50) * 1800)), obj);
                                                                break;
                                                            }
                                                            str4 = obj.substring(obj.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) + 4, obj.length() - 3);
                                                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                a((byte) 111, (byte) (-$$a[43]), r12[2], objArr29);
                                                                java.lang.reflect.Method declaredMethod6 = cls5.getDeclaredMethod((java.lang.String) objArr29[0], cls7, cls6);
                                                                declaredMethod6.setAccessible(true);
                                                                declaredMethod6.invoke(invoke3, str4, invoke4);
                                                            }
                                                            byte b10 = (byte) ($$b | 72);
                                                            byte[] bArr5 = $$a;
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            a(b10, bArr5[19], bArr5[2], objArr30);
                                                            java.lang.reflect.Method declaredMethod7 = cls5.getDeclaredMethod((java.lang.String) objArr30[0], cls6, cls7);
                                                            declaredMethod7.setAccessible(true);
                                                            declaredMethod7.invoke(invoke3, invoke4, str4);
                                                            Camera2StreamConfigurationMap = obj;
                                                            int i372 = ((int[]) objArr21[3])[0];
                                                            int i382 = i372 * i372;
                                                            int i392 = -(1267252260 * i372);
                                                            int i402 = ((i382 | i392) << 1) - (i382 ^ i392);
                                                            int i412 = -(i372 * 80561968);
                                                            int i422 = ((i402 | i412) << 1) - (i412 ^ i402);
                                                            int i432 = ((i422 | (-1356938012)) << 1) - ((-1356938012) ^ i422);
                                                            int i442 = i432 >> 21;
                                                            int i452 = (i442 - 4095) / 2048;
                                                            int i462 = ((i452 | 1) << 1) - (i452 ^ 1);
                                                            int i472 = (i432 & i462) + (i432 | i462);
                                                            int i482 = ((i442 ^ (-4095)) + ((i442 & (-4095)) << 1)) / 2048;
                                                            int i492 = -((((i482 | 1) << 1) - (i482 ^ 1)) ^ i472);
                                                            int i502 = ((i492 | 6) << 1) - (i492 ^ 6);
                                                            int i512 = i502 >> 28;
                                                            int i522 = ((i512 & (-31)) + (i512 | (-31))) / 16;
                                                            logger3.log(level3, "24/Found jnidispatch at {0}".substring(32400 / (((-((((i522 | 1) << 1) - (i522 ^ 1)) + 1)) & i502) * 1800)), obj);
                                                            break;
                                                        }
                                                        str4 = obj;
                                                        if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                        }
                                                        byte b102 = (byte) ($$b | 72);
                                                        byte[] bArr52 = $$a;
                                                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                                                        a(b102, bArr52[19], bArr52[2], objArr302);
                                                        java.lang.reflect.Method declaredMethod72 = cls5.getDeclaredMethod((java.lang.String) objArr302[0], cls6, cls7);
                                                        declaredMethod72.setAccessible(true);
                                                        declaredMethod72.invoke(invoke3, invoke4, str4);
                                                        Camera2StreamConfigurationMap = obj;
                                                        int i3722 = ((int[]) objArr21[3])[0];
                                                        int i3822 = i3722 * i3722;
                                                        int i3922 = -(1267252260 * i3722);
                                                        int i4022 = ((i3822 | i3922) << 1) - (i3822 ^ i3922);
                                                        int i4122 = -(i3722 * 80561968);
                                                        int i4222 = ((i4022 | i4122) << 1) - (i4122 ^ i4022);
                                                        int i4322 = ((i4222 | (-1356938012)) << 1) - ((-1356938012) ^ i4222);
                                                        int i4422 = i4322 >> 21;
                                                        int i4522 = (i4422 - 4095) / 2048;
                                                        int i4622 = ((i4522 | 1) << 1) - (i4522 ^ 1);
                                                        int i4722 = (i4322 & i4622) + (i4322 | i4622);
                                                        int i4822 = ((i4422 ^ (-4095)) + ((i4422 & (-4095)) << 1)) / 2048;
                                                        int i4922 = -((((i4822 | 1) << 1) - (i4822 ^ 1)) ^ i4722);
                                                        int i5022 = ((i4922 | 6) << 1) - (i4922 ^ 6);
                                                        int i5122 = i5022 >> 28;
                                                        int i5222 = ((i5122 & (-31)) + (i5122 | (-31))) / 16;
                                                        logger3.log(level3, "24/Found jnidispatch at {0}".substring(32400 / (((-((((i5222 | 1) << 1) - (i5222 ^ 1)) + 1)) & i5022) * 1800)), obj);
                                                        break;
                                                    }
                                                    byte[] bArr6 = $$a;
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    a(bArr6[1], bArr6[14], bArr6[10], objArr31);
                                                    java.lang.reflect.Method declaredMethod8 = cls5.getDeclaredMethod((java.lang.String) objArr31[0], cls7, cls6);
                                                    declaredMethod8.setAccessible(true);
                                                    if (declaredMethod8.invoke(invoke3, obj, invoke4) == null) {
                                                        Camera2StreamConfigurationMap = obj;
                                                        int i37222 = ((int[]) objArr21[3])[0];
                                                        int i38222 = i37222 * i37222;
                                                        int i39222 = -(1267252260 * i37222);
                                                        int i40222 = ((i38222 | i39222) << 1) - (i38222 ^ i39222);
                                                        int i41222 = -(i37222 * 80561968);
                                                        int i42222 = ((i40222 | i41222) << 1) - (i41222 ^ i40222);
                                                        int i43222 = ((i42222 | (-1356938012)) << 1) - ((-1356938012) ^ i42222);
                                                        int i44222 = i43222 >> 21;
                                                        int i45222 = (i44222 - 4095) / 2048;
                                                        int i46222 = ((i45222 | 1) << 1) - (i45222 ^ 1);
                                                        int i47222 = (i43222 & i46222) + (i43222 | i46222);
                                                        int i48222 = ((i44222 ^ (-4095)) + ((i44222 & (-4095)) << 1)) / 2048;
                                                        int i49222 = -((((i48222 | 1) << 1) - (i48222 ^ 1)) ^ i47222);
                                                        int i50222 = ((i49222 | 6) << 1) - (i49222 ^ 6);
                                                        int i51222 = i50222 >> 28;
                                                        int i52222 = ((i51222 & (-31)) + (i51222 | (-31))) / 16;
                                                        logger3.log(level3, "24/Found jnidispatch at {0}".substring(32400 / (((-((((i52222 | 1) << 1) - (i52222 ^ 1)) + 1)) & i50222) * 1800)), obj);
                                                        break;
                                                    }
                                                    str4 = obj.substring(obj.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) + 4, obj.length() - 3);
                                                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                    }
                                                    byte b1022 = (byte) ($$b | 72);
                                                    byte[] bArr522 = $$a;
                                                    java.lang.Object[] objArr3022 = new java.lang.Object[1];
                                                    a(b1022, bArr522[19], bArr522[2], objArr3022);
                                                    java.lang.reflect.Method declaredMethod722 = cls5.getDeclaredMethod((java.lang.String) objArr3022[0], cls6, cls7);
                                                    declaredMethod722.setAccessible(true);
                                                    declaredMethod722.invoke(invoke3, invoke4, str4);
                                                    Camera2StreamConfigurationMap = obj;
                                                    int i372222 = ((int[]) objArr21[3])[0];
                                                    int i382222 = i372222 * i372222;
                                                    int i392222 = -(1267252260 * i372222);
                                                    int i402222 = ((i382222 | i392222) << 1) - (i382222 ^ i392222);
                                                    int i412222 = -(i372222 * 80561968);
                                                    int i422222 = ((i402222 | i412222) << 1) - (i412222 ^ i402222);
                                                    int i432222 = ((i422222 | (-1356938012)) << 1) - ((-1356938012) ^ i422222);
                                                    int i442222 = i432222 >> 21;
                                                    int i452222 = (i442222 - 4095) / 2048;
                                                    int i462222 = ((i452222 | 1) << 1) - (i452222 ^ 1);
                                                    int i472222 = (i432222 & i462222) + (i432222 | i462222);
                                                    int i482222 = ((i442222 ^ (-4095)) + ((i442222 & (-4095)) << 1)) / 2048;
                                                    int i492222 = -((((i482222 | 1) << 1) - (i482222 ^ 1)) ^ i472222);
                                                    int i502222 = ((i492222 | 6) << 1) - (i492222 ^ 6);
                                                    int i512222 = i502222 >> 28;
                                                    int i522222 = ((i512222 & (-31)) + (i512222 | (-31))) / 16;
                                                    logger3.log(level3, "24/Found jnidispatch at {0}".substring(32400 / (((-((((i522222 | 1) << 1) - (i522222 ^ 1)) + 1)) & i502222) * 1800)), obj);
                                                    break;
                                                } catch (java.lang.reflect.InvocationTargetException e6) {
                                                    java.lang.Throwable cause4 = e6.getCause();
                                                    if (cause4 == null) {
                                                        throw e6;
                                                    }
                                                    throw cause4;
                                                }
                                            }
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            java.lang.String[] strArr4 = (java.lang.String[]) objArr20[0];
                                            if (strArr4 != null) {
                                                for (java.lang.String str8 : strArr4) {
                                                    arrayList2.add(str8);
                                                }
                                            }
                                            throw new java.lang.NullPointerException();
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause5 = th3.getCause();
                                            if (cause5 == null) {
                                                throw th3;
                                            }
                                            throw cause5;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause6 = th4.getCause();
                                        if (cause6 == null) {
                                            throw th4;
                                        }
                                        throw cause6;
                                    }
                                } catch (java.lang.UnsatisfiedLinkError e7) {
                                    java.util.logging.Logger logger4 = getInputFormats;
                                    java.util.logging.Level level4 = java.util.logging.Level.WARNING;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("File found at ");
                                    sb3.append(obj);
                                    sb3.append(" but not loadable: ");
                                    sb3.append(e7.getMessage());
                                    logger4.log(level4, sb3.toString(), (java.lang.Throwable) e7);
                                }
                            } else {
                                continue;
                            }
                        }
                        stringTokenizer2 = stringTokenizer;
                        property4 = r21;
                        i = 0;
                        c = 5;
                        i3 = 1;
                    }
                }
                str = property4;
                if (java.lang.Boolean.parseBoolean(java.lang.System.getProperty("jna.nosys", "true")) || com.sun.jna.Platform.isAndroid()) {
                    java.util.logging.Logger logger5 = getInputFormats;
                    java.util.logging.Level level5 = getHighResolutionOutputSizeshNQ4ISI;
                    logger5.log(level5, "Trying (via loadLibrary) {0}", str);
                    byte[] bArr7 = $$a;
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    a(bArr7[10], (byte) (-bArr7[26]), bArr7[19], objArr32);
                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    a((byte) (-bArr7[15]), (byte) (-bArr7[8]), bArr7[19], objArr33);
                    java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    a(bArr7[0], bArr7[10], bArr7[19], objArr34);
                    java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                    int i53 = $$b;
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    a((byte) (i53 | 12), bArr7[14], bArr7[29], objArr35);
                    java.lang.Object invoke5 = cls9.getMethod((java.lang.String) objArr35[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    a((byte) 70, bArr7[46], bArr7[19], objArr36);
                    java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                    a((byte) 84, bArr7[2], bArr7[29], objArr37);
                    java.lang.Object invoke6 = cls12.getMethod((java.lang.String) objArr37[0], new java.lang.Class[0]).invoke(com.sun.jna.Native.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT > 24) {
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        a((byte) 111, (byte) (-bArr7[43]), bArr7[2], objArr38);
                        java.lang.reflect.Method declaredMethod9 = cls9.getDeclaredMethod((java.lang.String) objArr38[0], cls11, cls10);
                        declaredMethod9.setAccessible(true);
                        declaredMethod9.invoke(invoke5, str, invoke6);
                    } else {
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        a((byte) (i53 | 72), bArr7[19], bArr7[2], objArr39);
                        java.lang.reflect.Method declaredMethod10 = cls9.getDeclaredMethod((java.lang.String) objArr39[0], cls10, cls11);
                        declaredMethod10.setAccessible(true);
                        declaredMethod10.invoke(invoke5, invoke6, str);
                    }
                    logger5.log(level5, "Found jnidispatch on system path");
                    java.lang.String nativeVersion = getNativeVersion();
                    split = "7.0.4".split("\\.");
                    split2 = nativeVersion.split("\\.");
                    if (split.length >= 3 && split2.length >= 3) {
                        parseInt = java.lang.Integer.parseInt(split[0]);
                        parseInt2 = java.lang.Integer.parseInt(split2[0]);
                        int parseInt3 = java.lang.Integer.parseInt(split[1]);
                        int parseInt4 = java.lang.Integer.parseInt(split2[1]);
                        if (parseInt == parseInt2 && parseInt3 <= parseInt4) {
                            POINTER_SIZE = sizeof(0);
                            sizeof = sizeof(1);
                            LONG_SIZE = sizeof;
                            WCHAR_SIZE = sizeof(2);
                            SIZE_T_SIZE = sizeof(3);
                            BOOL_SIZE = sizeof(4);
                            LONG_DOUBLE_SIZE = sizeof(5);
                            initIDs();
                            if (java.lang.Boolean.getBoolean("jna.protected")) {
                                setProtected(true);
                            }
                            if (!com.sun.jna.Platform.isSPARC() || com.sun.jna.Platform.isWindows() || ((com.sun.jna.Platform.isLinux() && (com.sun.jna.Platform.isARM() || com.sun.jna.Platform.isPPC() || com.sun.jna.Platform.isMIPS() || com.sun.jna.Platform.isLoongArch())) || com.sun.jna.Platform.isAIX() || (com.sun.jna.Platform.isAndroid() && !com.sun.jna.Platform.isIntel()))) {
                                sizeof = 8;
                            }
                            getHighSpeedVideoSizes = sizeof;
                            if (com.sun.jna.Platform.isMac() && com.sun.jna.Platform.isPPC()) {
                                sizeof = 8;
                            }
                            getHighSpeedVideoFpsRangesFor = sizeof;
                            java.lang.System.setProperty("jna.loaded", "true");
                            getHighSpeedVideoSizesFor = new java.lang.Object() { // from class: com.sun.jna.Native.2
                                protected void finalize() throws java.lang.Throwable {
                                    com.sun.jna.Native.dispose();
                                    super.finalize();
                                }
                            };
                            getOutputMinFrameDurationlomOqCM = new java.util.WeakHashMap();
                            getOutputSizes = new java.util.WeakHashMap();
                            getOutputMinFrameDuration = new java.lang.ThreadLocal<com.sun.jna.Memory>() { // from class: com.sun.jna.Native.7
                                @Override // java.lang.ThreadLocal
                                protected /* synthetic */ com.sun.jna.Memory initialValue() {
                                    com.sun.jna.Memory memory = new com.sun.jna.Memory(4L);
                                    memory.clear();
                                    return memory;
                                }
                            };
                            getOutputFormats = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                            return;
                        }
                    }
                    java.lang.String lineSeparator = java.lang.System.lineSeparator();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(lineSeparator);
                    sb4.append(lineSeparator);
                    sb4.append("There is an incompatible JNA native library installed on this system");
                    sb4.append(lineSeparator);
                    sb4.append("Expected: 7.0.4");
                    sb4.append(lineSeparator);
                    sb4.append("Found:    ");
                    sb4.append(getNativeVersion());
                    sb4.append(lineSeparator);
                    if (Camera2StreamConfigurationMap != null) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("(at ");
                        sb5.append(Camera2StreamConfigurationMap);
                        sb5.append(")");
                        property2 = sb5.toString();
                    } else {
                        property2 = java.lang.System.getProperty("java.library.path");
                    }
                    sb4.append(property2);
                    sb4.append(".");
                    sb4.append(lineSeparator);
                    sb4.append("To resolve this issue you may do one of the following:");
                    sb4.append(lineSeparator);
                    sb4.append(" - remove or uninstall the offending library");
                    sb4.append(lineSeparator);
                    sb4.append(" - set the system property jna.nosys=true");
                    sb4.append(lineSeparator);
                    sb4.append(" - set jna.boot.library.path to include the path to the version of the ");
                    sb4.append(lineSeparator);
                    sb4.append("   jnidispatch library included with the JNA jar file you are using");
                    sb4.append(lineSeparator);
                    throw new java.lang.Error(sb4.toString());
                }
                if (!java.lang.Boolean.getBoolean("jna.noclasspath")) {
                    Camera2StreamConfigurationMap();
                    java.lang.String nativeVersion2 = getNativeVersion();
                    split = "7.0.4".split("\\.");
                    split2 = nativeVersion2.split("\\.");
                    if (split.length >= 3) {
                        parseInt = java.lang.Integer.parseInt(split[0]);
                        parseInt2 = java.lang.Integer.parseInt(split2[0]);
                        int parseInt32 = java.lang.Integer.parseInt(split[1]);
                        int parseInt42 = java.lang.Integer.parseInt(split2[1]);
                        if (parseInt == parseInt2) {
                            POINTER_SIZE = sizeof(0);
                            sizeof = sizeof(1);
                            LONG_SIZE = sizeof;
                            WCHAR_SIZE = sizeof(2);
                            SIZE_T_SIZE = sizeof(3);
                            BOOL_SIZE = sizeof(4);
                            LONG_DOUBLE_SIZE = sizeof(5);
                            initIDs();
                            if (java.lang.Boolean.getBoolean("jna.protected")) {
                            }
                            if (!com.sun.jna.Platform.isSPARC()) {
                            }
                            sizeof = 8;
                            getHighSpeedVideoSizes = sizeof;
                            if (com.sun.jna.Platform.isMac()) {
                                sizeof = 8;
                            }
                            getHighSpeedVideoFpsRangesFor = sizeof;
                            java.lang.System.setProperty("jna.loaded", "true");
                            getHighSpeedVideoSizesFor = new java.lang.Object() { // from class: com.sun.jna.Native.2
                                protected void finalize() throws java.lang.Throwable {
                                    com.sun.jna.Native.dispose();
                                    super.finalize();
                                }
                            };
                            getOutputMinFrameDurationlomOqCM = new java.util.WeakHashMap();
                            getOutputSizes = new java.util.WeakHashMap();
                            getOutputMinFrameDuration = new java.lang.ThreadLocal<com.sun.jna.Memory>() { // from class: com.sun.jna.Native.7
                                @Override // java.lang.ThreadLocal
                                protected /* synthetic */ com.sun.jna.Memory initialValue() {
                                    com.sun.jna.Memory memory = new com.sun.jna.Memory(4L);
                                    memory.clear();
                                    return memory;
                                }
                            };
                            getOutputFormats = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
                            return;
                        }
                    }
                    java.lang.String lineSeparator2 = java.lang.System.lineSeparator();
                    java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                    sb42.append(lineSeparator2);
                    sb42.append(lineSeparator2);
                    sb42.append("There is an incompatible JNA native library installed on this system");
                    sb42.append(lineSeparator2);
                    sb42.append("Expected: 7.0.4");
                    sb42.append(lineSeparator2);
                    sb42.append("Found:    ");
                    sb42.append(getNativeVersion());
                    sb42.append(lineSeparator2);
                    if (Camera2StreamConfigurationMap != null) {
                    }
                    sb42.append(property2);
                    sb42.append(".");
                    sb42.append(lineSeparator2);
                    sb42.append("To resolve this issue you may do one of the following:");
                    sb42.append(lineSeparator2);
                    sb42.append(" - remove or uninstall the offending library");
                    sb42.append(lineSeparator2);
                    sb42.append(" - set the system property jna.nosys=true");
                    sb42.append(lineSeparator2);
                    sb42.append(" - set jna.boot.library.path to include the path to the version of the ");
                    sb42.append(lineSeparator2);
                    sb42.append("   jnidispatch library included with the JNA jar file you are using");
                    sb42.append(lineSeparator2);
                    throw new java.lang.Error(sb42.toString());
                }
                throw new java.lang.UnsatisfiedLinkError("Unable to locate JNA native support library");
            }
            byte[] bArr72 = $$a;
            java.lang.Object[] objArr322 = new java.lang.Object[1];
            a(bArr72[10], (byte) (-bArr72[26]), bArr72[19], objArr322);
            java.lang.Class<?> cls92 = java.lang.Class.forName((java.lang.String) objArr322[0]);
            java.lang.Object[] objArr332 = new java.lang.Object[1];
            a((byte) (-bArr72[15]), (byte) (-bArr72[8]), bArr72[19], objArr332);
            java.lang.Class<?> cls102 = java.lang.Class.forName((java.lang.String) objArr332[0]);
            java.lang.Object[] objArr342 = new java.lang.Object[1];
            a(bArr72[0], bArr72[10], bArr72[19], objArr342);
            java.lang.Class<?> cls112 = java.lang.Class.forName((java.lang.String) objArr342[0]);
            int i532 = $$b;
            java.lang.Object[] objArr352 = new java.lang.Object[1];
            a((byte) (i532 | 12), bArr72[14], bArr72[29], objArr352);
            java.lang.Object invoke52 = cls92.getMethod((java.lang.String) objArr352[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.Object[] objArr362 = new java.lang.Object[1];
            a((byte) 70, bArr72[46], bArr72[19], objArr362);
            java.lang.Class<?> cls122 = java.lang.Class.forName((java.lang.String) objArr362[0]);
            java.lang.Object[] objArr372 = new java.lang.Object[1];
            a((byte) 84, bArr72[2], bArr72[29], objArr372);
            java.lang.Object invoke62 = cls122.getMethod((java.lang.String) objArr372[0], new java.lang.Class[0]).invoke(com.sun.jna.Native.class, new java.lang.Object[0]);
            if (android.os.Build.VERSION.SDK_INT > 24) {
            }
            logger5.log(level5, "Found jnidispatch on system path");
            java.lang.String nativeVersion22 = getNativeVersion();
            split = "7.0.4".split("\\.");
            split2 = nativeVersion22.split("\\.");
            if (split.length >= 3) {
            }
            java.lang.String lineSeparator22 = java.lang.System.lineSeparator();
            java.lang.StringBuilder sb422 = new java.lang.StringBuilder();
            sb422.append(lineSeparator22);
            sb422.append(lineSeparator22);
            sb422.append("There is an incompatible JNA native library installed on this system");
            sb422.append(lineSeparator22);
            sb422.append("Expected: 7.0.4");
            sb422.append(lineSeparator22);
            sb422.append("Found:    ");
            sb422.append(getNativeVersion());
            sb422.append(lineSeparator22);
            if (Camera2StreamConfigurationMap != null) {
            }
            sb422.append(property2);
            sb422.append(".");
            sb422.append(lineSeparator22);
            sb422.append("To resolve this issue you may do one of the following:");
            sb422.append(lineSeparator22);
            sb422.append(" - remove or uninstall the offending library");
            sb422.append(lineSeparator22);
            sb422.append(" - set the system property jna.nosys=true");
            sb422.append(lineSeparator22);
            sb422.append(" - set jna.boot.library.path to include the path to the version of the ");
            sb422.append(lineSeparator22);
            sb422.append("   jnidispatch library included with the JNA jar file you are using");
            sb422.append(lineSeparator22);
            throw new java.lang.Error(sb422.toString());
        } catch (java.lang.reflect.InvocationTargetException e8) {
            java.lang.Throwable cause7 = e8.getCause();
            if (cause7 == null) {
                throw e8;
            }
            throw cause7;
        }
        forName = null;
        if (forName == null) {
        }
        DEFAULT_CHARSET = forName;
        DEFAULT_ENCODING = forName.name();
        DEBUG_LOAD = java.lang.Boolean.getBoolean("jna.debug_load");
        boolean z2 = java.lang.Boolean.getBoolean("jna.debug_load.jna");
        DEBUG_JNA_LOAD = z2;
        getHighResolutionOutputSizeshNQ4ISI = !z2 ? java.util.logging.Level.INFO : java.util.logging.Level.FINE;
        Camera2StreamConfigurationMap = null;
        getOutputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        getInputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        com.sun.jna.Callback.UncaughtExceptionHandler uncaughtExceptionHandler2 = new com.sun.jna.Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public void uncaughtException(com.sun.jna.Callback callback, java.lang.Throwable th5) {
                java.util.logging.Logger logger22 = com.sun.jna.Native.getInputFormats;
                java.util.logging.Level level22 = java.util.logging.Level.WARNING;
                java.lang.StringBuilder sb22 = new java.lang.StringBuilder("JNA: Callback ");
                sb22.append(callback);
                sb22.append(" threw the following exception");
                logger22.log(level22, sb22.toString(), th5);
            }
        };
        getHighSpeedVideoFpsRanges = uncaughtExceptionHandler2;
        callbackExceptionHandler = uncaughtExceptionHandler2;
        int i54 = 0;
        if (!java.lang.Boolean.getBoolean("jna.nounpack")) {
        }
        char c2 = 5;
        int i310 = 1;
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        a(r2[5], (byte) (-$$a[43]), r2[19], objArr40);
        java.lang.String property42 = java.lang.System.getProperty("jna.boot.library.name", (java.lang.String) objArr40[0]);
        property = java.lang.System.getProperty("jna.boot.library.path");
        if (property != null) {
        }
        str = property42;
        if (java.lang.Boolean.parseBoolean(java.lang.System.getProperty("jna.nosys", "true"))) {
        }
        java.util.logging.Logger logger52 = getInputFormats;
        java.util.logging.Level level52 = getHighResolutionOutputSizeshNQ4ISI;
        logger52.log(level52, "Trying (via loadLibrary) {0}", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispose() {
        com.sun.jna.CallbackReference.getHighSpeedVideoFpsRanges();
        com.sun.jna.Memory.disposeAll();
        com.sun.jna.NativeLibrary.getHighResolutionOutputSizeshNQ4ISI();
        java.util.Map<java.lang.Class<?>, long[]> map = getOutputMinFrameDurationlomOqCM;
        synchronized (map) {
            for (java.util.Map.Entry<java.lang.Class<?>, long[]> entry : map.entrySet()) {
                unregister(entry.getKey(), entry.getValue());
            }
            getOutputMinFrameDurationlomOqCM.clear();
        }
        Camera2StreamConfigurationMap = null;
        java.lang.System.setProperty("jna.loaded", "false");
    }

    static boolean Camera2StreamConfigurationMap(java.io.File file) {
        if (file.delete()) {
            return true;
        }
        try {
            java.io.File parentFile = file.getParentFile();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(file.getName());
            sb.append(".x");
            new java.io.File(parentFile, sb.toString()).createNewFile();
            return false;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private Native() {
    }

    public static long getWindowID(java.awt.Window window) throws java.awt.HeadlessException {
        return com.sun.jna.Native.AWT.getHighSpeedVideoFpsRangesFor(window);
    }

    public static long getComponentID(java.awt.Component component) throws java.awt.HeadlessException {
        return com.sun.jna.Native.AWT.Camera2StreamConfigurationMap(component);
    }

    public static com.sun.jna.Pointer getWindowPointer(java.awt.Window window) throws java.awt.HeadlessException {
        return new com.sun.jna.Pointer(com.sun.jna.Native.AWT.getHighSpeedVideoFpsRangesFor(window));
    }

    public static com.sun.jna.Pointer getComponentPointer(java.awt.Component component) throws java.awt.HeadlessException {
        return new com.sun.jna.Pointer(com.sun.jna.Native.AWT.Camera2StreamConfigurationMap(component));
    }

    public static com.sun.jna.Pointer getDirectBufferPointer(java.nio.Buffer buffer) {
        long _getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (_getDirectBufferPointer == 0) {
            return null;
        }
        return new com.sun.jna.Pointer(_getDirectBufferPointer);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.nio.charset.Charset forName;
        if (str != null) {
            try {
                forName = java.nio.charset.Charset.forName(str);
            } catch (java.nio.charset.IllegalCharsetNameException | java.nio.charset.UnsupportedCharsetException e) {
                getInputFormats.log(java.util.logging.Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new java.lang.Object[]{str, e.getMessage()});
            }
            if (forName == null) {
                return forName;
            }
            java.util.logging.Logger logger = getInputFormats;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.nio.charset.Charset charset = DEFAULT_CHARSET;
            logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
            return charset;
        }
        forName = null;
        if (forName == null) {
        }
    }

    public static java.lang.String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static java.lang.String toString(byte[] bArr, java.lang.String str) {
        return toString(bArr, getHighResolutionOutputSizeshNQ4ISI(str));
    }

    public static java.lang.String toString(byte[] bArr, java.nio.charset.Charset charset) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (bArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new java.lang.String(bArr, 0, length, charset);
    }

    public static java.lang.String toString(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new java.lang.String(cArr, 0, length);
    }

    public static java.util.List<java.lang.String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static java.util.List<java.lang.String> toStringList(char[] cArr, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            if (i < i3) {
                if (cArr[i] == 0) {
                    if (i4 == i) {
                        break;
                    }
                    arrayList.add(new java.lang.String(cArr, i4, i - i4));
                    i4 = i + 1;
                }
                i++;
            } else if (i4 < i3) {
                arrayList.add(new java.lang.String(cArr, i4, i3 - i4));
            }
        }
        return arrayList;
    }

    public static <T extends com.sun.jna.Library> T load(java.lang.Class<T> cls) {
        return (T) load((java.lang.String) null, cls);
    }

    public static <T extends com.sun.jna.Library> T load(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map) {
        return (T) load(null, cls, map);
    }

    public static <T extends com.sun.jna.Library> T load(java.lang.String str, java.lang.Class<T> cls) {
        return (T) load(str, cls, java.util.Collections.emptyMap());
    }

    public static <T extends com.sun.jna.Library> T load(java.lang.String str, java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map) {
        if (!com.sun.jna.Library.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interface (");
            sb.append(cls.getSimpleName());
            sb.append(") of library=");
            sb.append(str);
            sb.append(" does not extend Library");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new com.sun.jna.Library.Handler(str, cls, map));
        Camera2StreamConfigurationMap((java.lang.Class<?>) cls, map, newProxyInstance);
        return cls.cast(newProxyInstance);
    }

    @java.lang.Deprecated
    public static <T> T loadLibrary(java.lang.Class<T> cls) {
        return (T) loadLibrary((java.lang.String) null, cls);
    }

    @java.lang.Deprecated
    public static <T> T loadLibrary(java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    @java.lang.Deprecated
    public static <T> T loadLibrary(java.lang.String str, java.lang.Class<T> cls) {
        return (T) loadLibrary(str, cls, java.util.Collections.emptyMap());
    }

    @java.lang.Deprecated
    public static <T> T loadLibrary(java.lang.String str, java.lang.Class<T> cls, java.util.Map<java.lang.String, ?> map) {
        if (!com.sun.jna.Library.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interface (");
            sb.append(cls.getSimpleName());
            sb.append(") of library=");
            sb.append(str);
            sb.append(" does not extend Library");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new com.sun.jna.Library.Handler(str, cls, map));
        Camera2StreamConfigurationMap((java.lang.Class<?>) cls, map, newProxyInstance);
        return cls.cast(newProxyInstance);
    }

    private static java.lang.Class<?> getHighSpeedVideoSizes(java.lang.Class<?> cls) {
        while (cls != null) {
            java.util.Map<java.lang.String, java.lang.Object> map = getOutputSizeshNQ4ISI.get(cls);
            if (map != null) {
                java.lang.Class<?> cls2 = (java.lang.Class) map.get("enclosing-library");
                if (cls2 != null) {
                    return cls2;
                }
            } else if (!com.sun.jna.Library.class.isAssignableFrom(cls)) {
                if (com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                    cls = com.sun.jna.CallbackReference.getHighSpeedVideoFpsRanges(cls);
                }
                java.lang.Class<?> highSpeedVideoSizes = getHighSpeedVideoSizes(cls.getDeclaringClass());
                if (highSpeedVideoSizes != null) {
                    return highSpeedVideoSizes;
                }
                cls = cls.getSuperclass();
            }
            return cls;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r6.setAccessible(true);
        com.sun.jna.Native.getInputSizeshNQ4ISI.put(r1, new java.lang.ref.WeakReference(r6.get(null)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.lang.String, java.lang.Object> getLibraryOptions(java.lang.Class<?> cls) {
        java.util.Map emptyMap;
        java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.Object>> map = getOutputSizeshNQ4ISI;
        java.util.Map<java.lang.String, java.lang.Object> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        java.lang.Class<?> highSpeedVideoSizes = getHighSpeedVideoSizes(cls);
        if (highSpeedVideoSizes == null) {
            highSpeedVideoSizes = cls;
        } else if (highSpeedVideoSizes != null && !getInputSizeshNQ4ISI.containsKey(highSpeedVideoSizes)) {
            try {
                java.lang.reflect.Field[] fields = highSpeedVideoSizes.getFields();
                int i = 0;
                while (true) {
                    if (i >= fields.length) {
                        break;
                    }
                    java.lang.reflect.Field field = fields[i];
                    if (field.getType() == highSpeedVideoSizes && java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                        break;
                    }
                    i++;
                }
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not access instance of ");
                sb.append(highSpeedVideoSizes);
                sb.append(" (");
                sb.append(e);
                sb.append(")");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.util.Map<java.lang.String, java.lang.Object> map3 = map.get(highSpeedVideoSizes);
        if (map3 != null) {
            map.put(cls, map3);
            return map3;
        }
        try {
            java.lang.reflect.Field field2 = highSpeedVideoSizes.getField("OPTIONS");
            field2.setAccessible(true);
            emptyMap = (java.util.Map) field2.get(null);
        } catch (java.lang.NoSuchFieldException unused) {
            emptyMap = java.util.Collections.emptyMap();
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("OPTIONS must be a public field of type java.util.Map (");
            sb2.append(e2);
            sb2.append("): ");
            sb2.append(highSpeedVideoSizes);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (emptyMap == null) {
            throw new java.lang.IllegalStateException("Null options field");
        }
        java.util.HashMap hashMap = new java.util.HashMap(emptyMap);
        if (!hashMap.containsKey(com.sun.jna.Library.OPTION_TYPE_MAPPER)) {
            hashMap.put(com.sun.jna.Library.OPTION_TYPE_MAPPER, getHighSpeedVideoSizes(highSpeedVideoSizes, "TYPE_MAPPER", com.sun.jna.TypeMapper.class));
        }
        if (!hashMap.containsKey(com.sun.jna.Library.OPTION_STRUCTURE_ALIGNMENT)) {
            hashMap.put(com.sun.jna.Library.OPTION_STRUCTURE_ALIGNMENT, getHighSpeedVideoSizes(highSpeedVideoSizes, "STRUCTURE_ALIGNMENT", java.lang.Integer.class));
        }
        if (!hashMap.containsKey(com.sun.jna.Library.OPTION_STRING_ENCODING)) {
            hashMap.put(com.sun.jna.Library.OPTION_STRING_ENCODING, getHighSpeedVideoSizes(highSpeedVideoSizes, "STRING_ENCODING", java.lang.String.class));
        }
        java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoSizes, hashMap, (java.lang.Object) null);
        if (cls != highSpeedVideoSizes) {
            getOutputSizeshNQ4ISI.put(cls, Camera2StreamConfigurationMap2);
        }
        return Camera2StreamConfigurationMap2;
    }

    private static java.lang.Object getHighSpeedVideoSizes(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?> cls2) {
        try {
            java.lang.reflect.Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" must be a public field of type ");
            sb.append(cls2.getName());
            sb.append(" (");
            sb.append(e);
            sb.append("): ");
            sb.append(cls);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static com.sun.jna.TypeMapper getTypeMapper(java.lang.Class<?> cls) {
        return (com.sun.jna.TypeMapper) getLibraryOptions(cls).get(com.sun.jna.Library.OPTION_TYPE_MAPPER);
    }

    public static java.lang.String getStringEncoding(java.lang.Class<?> cls) {
        java.lang.String str = (java.lang.String) getLibraryOptions(cls).get(com.sun.jna.Library.OPTION_STRING_ENCODING);
        return str != null ? str : getDefaultStringEncoding();
    }

    public static java.lang.String getDefaultStringEncoding() {
        return java.lang.System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static int getStructureAlignment(java.lang.Class<?> cls) {
        java.lang.Integer num = (java.lang.Integer) getLibraryOptions(cls).get(com.sun.jna.Library.OPTION_STRUCTURE_ALIGNMENT);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    static byte[] getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        return str.getBytes(getHighResolutionOutputSizeshNQ4ISI(str2));
    }

    public static byte[] toByteArray(java.lang.String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static byte[] toByteArray(java.lang.String str, java.lang.String str2) {
        return toByteArray(str, getHighResolutionOutputSizeshNQ4ISI(str2));
    }

    public static char[] toCharArray(java.lang.String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        java.lang.System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x02ce, code lost:
    
        if (r3.invoke(r5, r12, r6) == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0302, code lost:
    
        r12 = r12.substring(r12.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) + 4, r12.length() - 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0300, code lost:
    
        if (r3.invoke(r5, r12, r6) != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap() {
        try {
            byte[] bArr = $$a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(bArr[5], (byte) (-bArr[43]), bArr[19], objArr);
            java.lang.String replace = java.lang.System.mapLibraryName((java.lang.String) objArr[0]).replace(".dylib", ".jnilib");
            if (com.sun.jna.Platform.isAIX()) {
                replace = "libjnidispatch.a";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("/com/sun/jna/");
            sb.append(com.sun.jna.Platform.RESOURCE_PREFIX);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(replace);
            java.io.File extractFromResourcePath = extractFromResourcePath(sb.toString(), com.sun.jna.Native.class.getClassLoader());
            if (extractFromResourcePath == null && extractFromResourcePath == null) {
                throw new java.lang.UnsatisfiedLinkError("Could not find JNA native support");
            }
            java.util.logging.Logger logger = getInputFormats;
            java.util.logging.Level level = getHighResolutionOutputSizeshNQ4ISI;
            logger.log(level, "Trying {0}", extractFromResourcePath.getAbsolutePath());
            java.lang.System.setProperty("jnidispatch.path", extractFromResourcePath.getAbsolutePath());
            java.lang.String absolutePath = extractFromResourcePath.getAbsolutePath();
            java.lang.ClassLoader classLoader = com.sun.jna.Native.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap2 == null) {
                    Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 349, 11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {absolutePath, classLoader, true, 165755569, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2), 165755569};
                    java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap3 == null) {
                        char indexOf = (char) (android.text.TextUtils.indexOf("", "", 0) + 45285);
                        int blue = 158 - android.graphics.Color.blue(0);
                        int axisFromString = 2 - android.view.MotionEvent.axisFromString("");
                        byte b = $$d[14];
                        byte b2 = b;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(b, b2, b2, objArr4);
                        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf, blue, axisFromString, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), android.graphics.Color.argb(0, 0, 0, 0) + 104, 33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                        java.lang.Object[] objArr6 = {r4, new int[]{r21}, new int[]{r15}, new int[1]};
                        int i = ((int[]) objArr5[3])[0];
                        int i2 = ((int[]) objArr5[2])[0];
                        int i3 = ((int[]) objArr5[1])[0];
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i4 = i + (-1135958622) + (((-936361632) | (~(maxMemory | 898541065))) * 305) + (((~((~maxMemory) | 898541065)) | (-122363032)) * 305);
                        int i5 = (i4 << 13) ^ i4;
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a(bArr[10], (byte) (-bArr[26]), bArr[19], objArr7);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a((byte) (-bArr[15]), (byte) (-bArr[8]), bArr[19], objArr8);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            a(bArr[0], bArr[10], bArr[19], objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a((byte) ($$b | 12), bArr[14], bArr[29], objArr10);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            a((byte) 70, bArr[46], bArr[19], objArr11);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a((byte) 84, bArr[2], bArr[29], objArr12);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.sun.jna.Native.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 27) {
                                if (absolutePath != null) {
                                    byte b3 = (byte) 97;
                                    try {
                                        byte b4 = bArr[5];
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        a(b3, b4, b4, objArr13);
                                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                        declaredMethod.setAccessible(true);
                                    } catch (java.lang.Exception unused) {
                                    }
                                }
                                if (android.os.Build.VERSION.SDK_INT <= 24) {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    a((byte) 111, (byte) (-$$a[43]), r3[2], objArr14);
                                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls3, cls2);
                                    declaredMethod2.setAccessible(true);
                                    declaredMethod2.invoke(invoke, absolutePath, invoke2);
                                }
                                byte b5 = (byte) ($$b | 72);
                                byte[] bArr2 = $$a;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(b5, bArr2[19], bArr2[2], objArr15);
                                java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod((java.lang.String) objArr15[0], cls2, cls3);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(invoke, invoke2, absolutePath);
                                java.lang.String absolutePath2 = extractFromResourcePath.getAbsolutePath();
                                Camera2StreamConfigurationMap = absolutePath2;
                                int i7 = ((int[]) objArr6[3])[0];
                                int i8 = i7 * i7;
                                int i9 = -(1010981394 * i7);
                                int i10 = (i8 & i9) + (i8 | i9);
                                int i11 = -(i7 * 353270738);
                                int i12 = (((i10 | i11) << 1) - (i11 ^ i10)) - (-709708996);
                                int i13 = i12 >> 25;
                                int i14 = ((i13 & (-255)) + (i13 | (-255))) / 128;
                                int i15 = (i14 ^ 1) + ((i14 & 1) << 1);
                                int i16 = ((i12 | i15) << 1) - (i15 ^ i12);
                                int i17 = i12 >> 17;
                                int i18 = ((i17 ^ (-65535)) + ((i17 & (-65535)) << 1)) / 32768;
                                int i19 = -((((i18 | 1) << 1) - (i18 ^ 1)) ^ i16);
                                int i20 = (i19 ^ 2) + ((i19 & 2) << 1);
                                int i21 = i20 >> 23;
                                int i22 = ((i21 ^ (-1023)) + ((i21 & (-1023)) << 1)) / 512;
                                int i23 = (i22 ^ 1) + ((i22 & 1) << 1);
                                logger.log(level, "2\\20\\15\\7\\Found jnidispatch at {0}".substring(11080 / (((-(((i23 | 1) << 1) - (i23 ^ 1))) & i20) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_WRONG_ACT_CODE)), absolutePath2);
                                if (!extractFromResourcePath.getName().startsWith("jna") || java.lang.Boolean.getBoolean("jnidispatch.preserve")) {
                                    return;
                                }
                                Camera2StreamConfigurationMap(extractFromResourcePath);
                                return;
                            }
                            byte[] bArr3 = $$a;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(bArr3[1], bArr3[14], bArr3[10], objArr16);
                            java.lang.reflect.Method declaredMethod4 = cls.getDeclaredMethod((java.lang.String) objArr16[0], cls3, cls2);
                            declaredMethod4.setAccessible(true);
                        } catch (java.lang.reflect.InvocationTargetException e) {
                            java.lang.Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            throw cause;
                        }
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
                        if (strArr2 != null) {
                            for (java.lang.String str : strArr2) {
                                arrayList.add(str);
                            }
                        }
                        throw new java.lang.NullPointerException();
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause3 = th2.getCause();
                if (cause3 == null) {
                    throw th2;
                }
                throw cause3;
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.UnsatisfiedLinkError(e2.getMessage());
        }
    }

    static boolean getHighSpeedVideoFpsRanges(java.io.File file) {
        return file.getName().startsWith("jna");
    }

    public static java.io.File extractFromResourcePath(java.lang.String str) throws java.io.IOException {
        return extractFromResourcePath(str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r11.contains((java.lang.String) r5[0]) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.io.File extractFromResourcePath(java.lang.String str, java.lang.ClassLoader classLoader) throws java.io.IOException {
        java.util.logging.Level level;
        java.lang.String obj;
        java.net.URL resource;
        java.io.File file;
        java.io.FileOutputStream fileOutputStream;
        java.io.IOException e;
        java.io.File createTempFile;
        if (!DEBUG_LOAD) {
            if (DEBUG_JNA_LOAD) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(r0[5], (byte) (-$$a[43]), r0[19], objArr);
            }
            level = java.util.logging.Level.FINE;
            if (classLoader == null && (classLoader = java.lang.Thread.currentThread().getContextClassLoader()) == null) {
                classLoader = com.sun.jna.Native.class.getClassLoader();
            }
            java.util.logging.Logger logger = getInputFormats;
            logger.log(level, "Looking in classpath from {0} for {1}", new java.lang.Object[]{classLoader, str});
            java.lang.String highSpeedVideoSizes = !str.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? str : com.sun.jna.NativeLibrary.getHighSpeedVideoSizes(str);
            if (str.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.sun.jna.Platform.RESOURCE_PREFIX);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(highSpeedVideoSizes);
                obj = sb.toString();
            } else {
                obj = str;
            }
            if (obj.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                obj = obj.substring(1);
            }
            resource = classLoader.getResource(obj);
            if (resource == null) {
                if (obj.startsWith(com.sun.jna.Platform.RESOURCE_PREFIX)) {
                    if (com.sun.jna.Platform.RESOURCE_PREFIX.startsWith("darwin")) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("darwin/");
                        sb2.append(obj.substring(com.sun.jna.Platform.RESOURCE_PREFIX.length() + 1));
                        resource = classLoader.getResource(sb2.toString());
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(highSpeedVideoSizes);
                    }
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("com/sun/jna/");
                    sb3.append(com.sun.jna.Platform.RESOURCE_PREFIX);
                    sb3.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    if (obj.startsWith(sb3.toString())) {
                        if (com.sun.jna.Platform.RESOURCE_PREFIX.startsWith("com/sun/jna/darwin")) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("com/sun/jna/darwin");
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("com/sun/jna/");
                            sb5.append(com.sun.jna.Platform.RESOURCE_PREFIX);
                            sb4.append(obj.substring(sb5.toString().length() + 1));
                            resource = classLoader.getResource(sb4.toString());
                        }
                        if (resource == null) {
                            resource = classLoader.getResource(highSpeedVideoSizes);
                        }
                    }
                }
            }
            if (resource != null) {
                java.lang.String property = java.lang.System.getProperty("java.class.path");
                if (classLoader instanceof java.net.URLClassLoader) {
                    property = java.util.Arrays.asList(((java.net.URLClassLoader) classLoader).getURLs()).toString();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Native library (");
                sb6.append(obj);
                sb6.append(") not found in resource path (");
                sb6.append(property);
                sb6.append(")");
                throw new java.io.IOException(sb6.toString());
            }
            logger.log(level, "Found library resource at {0}", resource);
            if (resource.getProtocol().toLowerCase().equals("file")) {
                try {
                    file = new java.io.File(new java.net.URI(resource.toString()));
                } catch (java.net.URISyntaxException unused) {
                    file = new java.io.File(resource.getPath());
                }
                getInputFormats.log(level, "Looking in {0}", file.getAbsolutePath());
                if (file.exists()) {
                    return file;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("File URL ");
                sb7.append(resource);
                sb7.append(" could not be properly decoded");
                throw new java.io.IOException(sb7.toString());
            }
            java.io.FileOutputStream fileOutputStream2 = null;
            if (java.lang.Boolean.getBoolean("jna.nounpack")) {
                return null;
            }
            java.io.InputStream openStream = resource.openStream();
            if (openStream == null) {
                throw new java.io.IOException("Can't obtain InputStream for ".concat(java.lang.String.valueOf(obj)));
            }
            try {
                try {
                    createTempFile = java.io.File.createTempFile("jna", com.sun.jna.Platform.isWindows() ? ".dll" : null, getHighSpeedVideoFpsRangesFor());
                    if (!java.lang.Boolean.getBoolean("jnidispatch.preserve")) {
                        createTempFile.deleteOnExit();
                    }
                    logger.log(level, "Extracting library to {0}", createTempFile.getAbsolutePath());
                    fileOutputStream = new java.io.FileOutputStream(createTempFile);
                } catch (java.io.IOException e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr, 0, 1024);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
                openStream.close();
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException unused3) {
                }
                return createTempFile;
            } catch (java.io.IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append("Failed to create temporary file for ");
                sb8.append(str);
                sb8.append(" library: ");
                sb8.append(e.getMessage());
                throw new java.io.IOException(sb8.toString());
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    openStream.close();
                } catch (java.io.IOException unused4) {
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (java.io.IOException unused5) {
                        throw th;
                    }
                }
                throw th;
            }
        }
        level = java.util.logging.Level.INFO;
        if (classLoader == null) {
            classLoader = com.sun.jna.Native.class.getClassLoader();
        }
        java.util.logging.Logger logger2 = getInputFormats;
        logger2.log(level, "Looking in classpath from {0} for {1}", new java.lang.Object[]{classLoader, str});
        if (!str.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
        }
        if (str.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
        }
        if (obj.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
        }
        resource = classLoader.getResource(obj);
        if (resource == null) {
        }
        if (resource != null) {
        }
    }

    public static com.sun.jna.Library synchronizedLibrary(final com.sun.jna.Library library) {
        java.lang.Class<?> cls = library.getClass();
        if (!java.lang.reflect.Proxy.isProxyClass(cls)) {
            throw new java.lang.IllegalArgumentException("Library must be a proxy class");
        }
        java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(library);
        if (!(invocationHandler instanceof com.sun.jna.Library.Handler)) {
            throw new java.lang.IllegalArgumentException("Unrecognized proxy handler: ".concat(java.lang.String.valueOf(invocationHandler)));
        }
        final com.sun.jna.Library.Handler handler = (com.sun.jna.Library.Handler) invocationHandler;
        return (com.sun.jna.Library) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new java.lang.reflect.InvocationHandler() { // from class: com.sun.jna.Native.3
            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
                java.lang.Object invoke;
                synchronized (com.sun.jna.Library.Handler.this.getNativeLibrary()) {
                    invoke = com.sun.jna.Library.Handler.this.invoke(library, method, objArr);
                }
                return invoke;
            }
        });
    }

    public static java.lang.String getWebStartLibraryPath(java.lang.String str) {
        if (java.lang.System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) ((java.lang.reflect.Method) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.reflect.Method>() { // from class: com.sun.jna.Native.4
                @Override // java.security.PrivilegedAction
                public /* synthetic */ java.lang.reflect.Method run() {
                    return getHighResolutionOutputSizeshNQ4ISI();
                }

                private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI() {
                    try {
                        java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod("findLibrary", java.lang.String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
            })).invoke(com.sun.jna.Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new java.io.File(str2).getParent();
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    private static java.io.File getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        java.io.File file;
        java.io.File file2;
        java.io.File file3;
        java.lang.String property = java.lang.System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new java.io.File(property);
            file.mkdirs();
        } else {
            file = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"));
            if (com.sun.jna.Platform.isMac()) {
                file3 = new java.io.File(java.lang.System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (com.sun.jna.Platform.isLinux() || com.sun.jna.Platform.isSolaris() || com.sun.jna.Platform.isAIX() || com.sun.jna.Platform.isDragonFlyBSD() || com.sun.jna.Platform.isFreeBSD() || com.sun.jna.Platform.isNetBSD() || com.sun.jna.Platform.isOpenBSD() || com.sun.jna.Platform.iskFreeBSD()) {
                java.lang.String str = java.lang.System.getenv("XDG_CACHE_HOME");
                if (str == null || str.trim().isEmpty()) {
                    file2 = new java.io.File(java.lang.System.getProperty("user.home"), ".cache");
                } else {
                    file2 = new java.io.File(str);
                }
                file3 = new java.io.File(file2, "JNA/temp");
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("jna-");
                sb.append(java.lang.System.getProperty("user.name").hashCode());
                file3 = new java.io.File(file, sb.toString());
            }
            file3.mkdirs();
            if (file3.exists() && file3.canWrite()) {
                file = file3;
            }
        }
        if (!file.exists()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JNA temporary directory '");
            sb2.append(file);
            sb2.append("' does not exist");
            throw new java.io.IOException(sb2.toString());
        }
        if (file.canWrite()) {
            return file;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("JNA temporary directory '");
        sb3.append(file);
        sb3.append("' is not writable");
        throw new java.io.IOException(sb3.toString());
    }

    public static int getNativeSize(java.lang.Class<?> cls, java.lang.Object obj) {
        if (cls.isArray()) {
            int length = java.lang.reflect.Array.getLength(obj);
            if (length > 0) {
                return length * getNativeSize(cls.getComponentType(), java.lang.reflect.Array.get(obj, 0));
            }
            throw new java.lang.IllegalArgumentException("Arrays of length zero not allowed: ".concat(java.lang.String.valueOf(cls)));
        }
        if (com.sun.jna.Structure.class.isAssignableFrom(cls) && !com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
            return com.sun.jna.Structure.Camera2StreamConfigurationMap((java.lang.Class<com.sun.jna.Structure>) cls, (com.sun.jna.Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The type \"");
            sb.append(cls.getName());
            sb.append("\" is not supported: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static int getNativeSize(java.lang.Class<?> cls) {
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            cls = com.sun.jna.NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == java.lang.Boolean.TYPE || cls == java.lang.Boolean.class) {
            return 4;
        }
        if (cls == java.lang.Byte.TYPE || cls == java.lang.Byte.class) {
            return 1;
        }
        if (cls == java.lang.Short.TYPE || cls == java.lang.Short.class) {
            return 2;
        }
        if (cls == java.lang.Character.TYPE || cls == java.lang.Character.class) {
            return WCHAR_SIZE;
        }
        if (cls == java.lang.Integer.TYPE || cls == java.lang.Integer.class) {
            return 4;
        }
        if (cls == java.lang.Long.TYPE || cls == java.lang.Long.class) {
            return 8;
        }
        if (cls == java.lang.Float.TYPE || cls == java.lang.Float.class) {
            return 4;
        }
        if (cls == java.lang.Double.TYPE || cls == java.lang.Double.class) {
            return 8;
        }
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            if (com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls)) {
                return com.sun.jna.Structure.Camera2StreamConfigurationMap((java.lang.Class<? extends com.sun.jna.Structure>) cls);
            }
            return POINTER_SIZE;
        }
        if (com.sun.jna.Pointer.class.isAssignableFrom(cls) || ((com.sun.jna.Platform.HAS_BUFFERS && com.sun.jna.Native.Buffers.Camera2StreamConfigurationMap(cls)) || com.sun.jna.Callback.class.isAssignableFrom(cls) || java.lang.String.class == cls || com.sun.jna.WString.class == cls)) {
            return POINTER_SIZE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Native size for type \"");
        sb.append(cls.getName());
        sb.append("\" is unknown");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static boolean isSupportedNativeType(java.lang.Class<?> cls) {
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            return getNativeSize(cls) != 0;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    public static void setCallbackExceptionHandler(com.sun.jna.Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = getHighSpeedVideoFpsRanges;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static com.sun.jna.Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static void register(java.lang.String str) {
        register(Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges()), str);
    }

    public static void register(com.sun.jna.NativeLibrary nativeLibrary) {
        register(Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges()), nativeLibrary);
    }

    private static java.lang.Class<?> Camera2StreamConfigurationMap(java.lang.Class<?> cls) {
        for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        int lastIndexOf = cls.getName().lastIndexOf(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        if (lastIndexOf != -1) {
            try {
                return Camera2StreamConfigurationMap(java.lang.Class.forName(cls.getName().substring(0, lastIndexOf), true, cls.getClassLoader()));
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't determine class with native methods from the current context (");
        sb.append(cls);
        sb.append(")");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.lang.Class<?> getHighSpeedVideoFpsRanges() {
        java.lang.Class<?>[] classContext = new java.lang.SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public java.lang.Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext == null) {
            throw new java.lang.IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length < 4) {
            throw new java.lang.IllegalStateException("This method must be called from the static initializer of a class");
        }
        return classContext[3];
    }

    public static void setCallbackThreadInitializer(com.sun.jna.Callback callback, com.sun.jna.CallbackThreadInitializer callbackThreadInitializer) {
        com.sun.jna.CallbackReference.getHighSpeedVideoSizes(callback, callbackThreadInitializer);
    }

    public static void unregister() {
        unregister(Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges()));
    }

    public static void unregister(java.lang.Class<?> cls) {
        java.util.Map<java.lang.Class<?>, long[]> map = getOutputMinFrameDurationlomOqCM;
        synchronized (map) {
            long[] jArr = map.get(cls);
            if (jArr != null) {
                unregister(cls, jArr);
                map.remove(cls);
                getOutputSizes.remove(cls);
            }
        }
    }

    public static boolean registered(java.lang.Class<?> cls) {
        boolean containsKey;
        java.util.Map<java.lang.Class<?>, long[]> map = getOutputMinFrameDurationlomOqCM;
        synchronized (map) {
            containsKey = map.containsKey(cls);
        }
        return containsKey;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls) {
        if (cls.isArray()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(getHighSpeedVideoFpsRangesFor(cls.getComponentType()));
            return sb.toString();
        }
        if (cls.isPrimitive()) {
            if (cls == java.lang.Void.TYPE) {
                return "V";
            }
            if (cls == java.lang.Boolean.TYPE) {
                return "Z";
            }
            if (cls == java.lang.Byte.TYPE) {
                return "B";
            }
            if (cls == java.lang.Short.TYPE) {
                return "S";
            }
            if (cls == java.lang.Character.TYPE) {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA;
            }
            if (cls == java.lang.Integer.TYPE) {
                return com.visa.cbp.getEncExpo.warmup;
            }
            if (cls == java.lang.Long.TYPE) {
                return "J";
            }
            if (cls == java.lang.Float.TYPE) {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER;
            }
            if (cls == java.lang.Double.TYPE) {
                return "D";
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("L");
        java.lang.String name2 = cls.getName();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        while (true) {
            int indexOf = name2.indexOf(".");
            if (indexOf == -1) {
                sb3.append(name2);
                sb2.append(sb3.toString());
                sb2.append(";");
                return sb2.toString();
            }
            sb3.append(name2.substring(0, indexOf));
            sb3.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            name2 = name2.substring(indexOf + 1);
        }
    }

    private static int Camera2StreamConfigurationMap(java.lang.Class<?> cls, com.sun.jna.TypeMapper typeMapper, boolean z) {
        if (cls == java.lang.Void.class) {
            cls = java.lang.Void.TYPE;
        }
        if (typeMapper != null) {
            com.sun.jna.FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            com.sun.jna.ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                java.lang.Class<?> nativeType = fromNativeConverter.nativeType();
                if (nativeType == java.lang.String.class) {
                    return 24;
                }
                return nativeType == com.sun.jna.WString.class ? 25 : 23;
            }
            if (toNativeConverter != null) {
                java.lang.Class<?> nativeType2 = toNativeConverter.nativeType();
                if (nativeType2 == java.lang.String.class) {
                    return 24;
                }
                return nativeType2 == com.sun.jna.WString.class ? 25 : 23;
            }
        }
        if (com.sun.jna.Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (java.lang.String.class == cls) {
            return 2;
        }
        if (com.sun.jna.WString.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (com.sun.jna.Platform.HAS_BUFFERS && com.sun.jna.Native.Buffers.Camera2StreamConfigurationMap(cls)) {
            return 5;
        }
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            return com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls) ? 4 : 3;
        }
        if (cls.isArray()) {
            char charAt = cls.getName().charAt(1);
            if (charAt == 'F') {
                return 11;
            }
            if (charAt == 'S') {
                return 7;
            }
            if (charAt == 'Z') {
                return 13;
            }
            if (charAt == 'I') {
                return 9;
            }
            if (charAt == 'J') {
                return 10;
            }
            switch (charAt) {
                case 'B':
                    return 6;
                case 'C':
                    return 8;
                case 'D':
                    return 12;
            }
        }
        if (cls.isPrimitive()) {
            return cls == java.lang.Boolean.TYPE ? 14 : 0;
        }
        if (com.sun.jna.Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (com.sun.jna.IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (com.sun.jna.PointerType.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            java.lang.Class<?> nativeType3 = com.sun.jna.NativeMappedConverter.getInstance(cls).nativeType();
            if (nativeType3 == java.lang.String.class) {
                return 18;
            }
            return nativeType3 == com.sun.jna.WString.class ? 19 : 17;
        }
        if (com.sun.jna.JNIEnv.class == cls) {
            return 27;
        }
        return z ? 26 : -1;
    }

    public static void register(java.lang.Class<?> cls, java.lang.String str) {
        register(cls, com.sun.jna.NativeLibrary.getInstance(str, (java.util.Map<java.lang.String, ?>) java.util.Collections.singletonMap(com.sun.jna.Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void register(java.lang.Class<?> cls, com.sun.jna.NativeLibrary nativeLibrary) {
        int i;
        long j;
        com.sun.jna.FromNativeConverter fromNativeConverter;
        long j2;
        int i2;
        java.lang.String obj;
        java.lang.Class<?>[] exceptionTypes;
        int i3;
        boolean z;
        java.lang.reflect.Method method;
        java.lang.String str;
        boolean z2;
        long j3;
        long j4;
        java.lang.Class<?> cls2 = cls;
        com.sun.jna.NativeLibrary nativeLibrary2 = nativeLibrary;
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, ?> options = nativeLibrary.getOptions();
        com.sun.jna.TypeMapper typeMapper = (com.sun.jna.TypeMapper) options.get(com.sun.jna.Library.OPTION_TYPE_MAPPER);
        boolean equals = java.lang.Boolean.TRUE.equals(options.get(com.sun.jna.Library.OPTION_ALLOW_OBJECTS));
        Camera2StreamConfigurationMap(cls2, options, (java.lang.Object) null);
        for (java.lang.reflect.Method method2 : declaredMethods) {
            if ((method2.getModifiers() & 256) != 0) {
                arrayList.add(method2);
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        int i4 = 0;
        while (i4 < size) {
            java.lang.reflect.Method method3 = (java.lang.reflect.Method) arrayList.get(i4);
            java.lang.Class<?> returnType = method3.getReturnType();
            java.lang.Class<?>[] parameterTypes = method3.getParameterTypes();
            long[] jArr2 = new long[parameterTypes.length];
            long[] jArr3 = new long[parameterTypes.length];
            int[] iArr = new int[parameterTypes.length];
            com.sun.jna.ToNativeConverter[] toNativeConverterArr = new com.sun.jna.ToNativeConverter[parameterTypes.length];
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(returnType, typeMapper, equals);
            long[] jArr4 = jArr;
            if (Camera2StreamConfigurationMap2 == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(returnType);
                sb.append(" is not a supported return type (in method ");
                sb.append(method3.getName());
                sb.append(" in ");
                sb.append(cls2);
                sb.append(")");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int i5 = i4;
            try {
                try {
                    if (Camera2StreamConfigurationMap2 != 3) {
                        if (Camera2StreamConfigurationMap2 != 4) {
                            switch (Camera2StreamConfigurationMap2) {
                                default:
                                    switch (Camera2StreamConfigurationMap2) {
                                        case 21:
                                        case 22:
                                            break;
                                        case 23:
                                        case 24:
                                        case 25:
                                            com.sun.jna.FromNativeConverter fromNativeConverter2 = typeMapper.getFromNativeConverter(returnType);
                                            i = Camera2StreamConfigurationMap2;
                                            long j5 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) (returnType.isPrimitive() ? returnType : com.sun.jna.Pointer.class)).getPointer().peer;
                                            fromNativeConverter = fromNativeConverter2;
                                            j2 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) fromNativeConverter2.nativeType()).getPointer().peer;
                                            j = j5;
                                            break;
                                        case 26:
                                            break;
                                        default:
                                            i = Camera2StreamConfigurationMap2;
                                            j = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) returnType).getPointer().peer;
                                            j2 = j;
                                            fromNativeConverter = null;
                                            break;
                                    }
                                case 17:
                                case 18:
                                case 19:
                                    i = Camera2StreamConfigurationMap2;
                                    j3 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
                                    j4 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.NativeMappedConverter.getInstance(returnType).nativeType()).getPointer().peer;
                                    break;
                            }
                            java.lang.String str2 = "(";
                            int i6 = size;
                            java.util.ArrayList arrayList2 = arrayList;
                            i2 = 0;
                            while (i2 < parameterTypes.length) {
                                java.lang.Class<?> cls3 = parameterTypes[i2];
                                java.lang.Class<?>[] clsArr = parameterTypes;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(str2);
                                sb2.append(getHighSpeedVideoFpsRangesFor(cls3));
                                java.lang.String obj2 = sb2.toString();
                                int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(cls3, typeMapper, equals);
                                iArr[i2] = Camera2StreamConfigurationMap3;
                                if (Camera2StreamConfigurationMap3 == -1) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append(cls3);
                                    sb3.append(" is not a supported argument type (in method ");
                                    sb3.append(method3.getName());
                                    sb3.append(" in ");
                                    sb3.append(cls2);
                                    sb3.append(")");
                                    throw new java.lang.IllegalArgumentException(sb3.toString());
                                }
                                if (Camera2StreamConfigurationMap3 == 17 || Camera2StreamConfigurationMap3 == 18 || Camera2StreamConfigurationMap3 == 19 || Camera2StreamConfigurationMap3 == 21) {
                                    cls3 = com.sun.jna.NativeMappedConverter.getInstance(cls3).nativeType();
                                } else if (Camera2StreamConfigurationMap3 == 23 || Camera2StreamConfigurationMap3 == 24 || Camera2StreamConfigurationMap3 == 25) {
                                    toNativeConverterArr[i2] = typeMapper.getToNativeConverter(cls3);
                                }
                                if (Camera2StreamConfigurationMap3 != 0) {
                                    if (Camera2StreamConfigurationMap3 != 4) {
                                        switch (Camera2StreamConfigurationMap3) {
                                            default:
                                                switch (Camera2StreamConfigurationMap3) {
                                                    case 21:
                                                    case 22:
                                                        break;
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                        if (!cls3.isPrimitive()) {
                                                            cls3 = com.sun.jna.Pointer.class;
                                                        }
                                                        z2 = equals;
                                                        jArr3[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) cls3).getPointer().peer;
                                                        jArr2[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) toNativeConverterArr[i2].nativeType()).getPointer().peer;
                                                        break;
                                                    default:
                                                        z2 = equals;
                                                        long j6 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
                                                        jArr2[i2] = j6;
                                                        jArr3[i2] = j6;
                                                        break;
                                                }
                                            case 17:
                                            case 18:
                                            case 19:
                                                z2 = equals;
                                                jArr2[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) cls3).getPointer().peer;
                                                jArr3[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
                                                break;
                                        }
                                    }
                                    z2 = equals;
                                    jArr2[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) cls3).getPointer().peer;
                                    jArr3[i2] = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
                                } else {
                                    z2 = equals;
                                    long j7 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) cls3).getPointer().peer;
                                    jArr2[i2] = j7;
                                    jArr3[i2] = j7;
                                }
                                i2++;
                                equals = z2;
                                parameterTypes = clsArr;
                                str2 = obj2;
                            }
                            boolean z3 = equals;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            sb4.append(str2);
                            sb4.append(")");
                            java.lang.String obj3 = sb4.toString();
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append(obj3);
                            sb5.append(getHighSpeedVideoFpsRangesFor(returnType));
                            obj = sb5.toString();
                            exceptionTypes = method3.getExceptionTypes();
                            i3 = 0;
                            while (true) {
                                if (i3 >= exceptionTypes.length) {
                                    z = false;
                                } else if (com.sun.jna.LastErrorException.class.isAssignableFrom(exceptionTypes[i3])) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                            com.sun.jna.Function highSpeedVideoFpsRanges = nativeLibrary2.getHighSpeedVideoFpsRanges(method3.getName(), method3);
                            method = method3;
                            str = obj;
                            com.sun.jna.TypeMapper typeMapper2 = typeMapper;
                            jArr4[i5] = registerMethod(cls, method3.getName(), obj, iArr, jArr3, jArr2, i, j, j2, method, highSpeedVideoFpsRanges.peer, highSpeedVideoFpsRanges.getCallingConvention(), z, toNativeConverterArr, fromNativeConverter, highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
                            i4 = i5 + 1;
                            nativeLibrary2 = nativeLibrary;
                            jArr = jArr4;
                            equals = z3;
                            arrayList = arrayList2;
                            typeMapper = typeMapper2;
                            size = i6;
                            cls2 = cls;
                        } else {
                            i = Camera2StreamConfigurationMap2;
                            j3 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
                            j4 = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) returnType).getPointer().peer;
                        }
                        long j8 = j4;
                        j = j3;
                        j2 = j8;
                        fromNativeConverter = null;
                        java.lang.String str22 = "(";
                        int i62 = size;
                        java.util.ArrayList arrayList22 = arrayList;
                        i2 = 0;
                        while (i2 < parameterTypes.length) {
                        }
                        boolean z32 = equals;
                        java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                        sb42.append(str22);
                        sb42.append(")");
                        java.lang.String obj32 = sb42.toString();
                        java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                        sb52.append(obj32);
                        sb52.append(getHighSpeedVideoFpsRangesFor(returnType));
                        obj = sb52.toString();
                        exceptionTypes = method3.getExceptionTypes();
                        i3 = 0;
                        while (true) {
                            if (i3 >= exceptionTypes.length) {
                            }
                            i3++;
                        }
                        com.sun.jna.Function highSpeedVideoFpsRanges2 = nativeLibrary2.getHighSpeedVideoFpsRanges(method3.getName(), method3);
                        method = method3;
                        str = obj;
                        com.sun.jna.TypeMapper typeMapper22 = typeMapper;
                        jArr4[i5] = registerMethod(cls, method3.getName(), obj, iArr, jArr3, jArr2, i, j, j2, method, highSpeedVideoFpsRanges2.peer, highSpeedVideoFpsRanges2.getCallingConvention(), z, toNativeConverterArr, fromNativeConverter, highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges);
                        i4 = i5 + 1;
                        nativeLibrary2 = nativeLibrary;
                        jArr = jArr4;
                        equals = z32;
                        arrayList = arrayList22;
                        typeMapper = typeMapper22;
                        size = i62;
                        cls2 = cls;
                    }
                    jArr4[i5] = registerMethod(cls, method3.getName(), obj, iArr, jArr3, jArr2, i, j, j2, method, highSpeedVideoFpsRanges2.peer, highSpeedVideoFpsRanges2.getCallingConvention(), z, toNativeConverterArr, fromNativeConverter, highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges);
                    i4 = i5 + 1;
                    nativeLibrary2 = nativeLibrary;
                    jArr = jArr4;
                    equals = z32;
                    arrayList = arrayList22;
                    typeMapper = typeMapper22;
                    size = i62;
                    cls2 = cls;
                } catch (java.lang.NoSuchMethodError unused) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("No method ");
                    sb6.append(method.getName());
                    sb6.append(" with signature ");
                    sb6.append(str);
                    sb6.append(" in ");
                    sb6.append(cls);
                    throw new java.lang.UnsatisfiedLinkError(sb6.toString());
                }
                method = method3;
                str = obj;
                com.sun.jna.TypeMapper typeMapper222 = typeMapper;
            } catch (java.lang.NoSuchMethodError unused2) {
                method = method3;
                str = obj;
            }
            i = Camera2StreamConfigurationMap2;
            j = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes((java.lang.Object) com.sun.jna.Pointer.class).getPointer().peer;
            j2 = j;
            fromNativeConverter = null;
            java.lang.String str222 = "(";
            int i622 = size;
            java.util.ArrayList arrayList222 = arrayList;
            i2 = 0;
            while (i2 < parameterTypes.length) {
            }
            boolean z322 = equals;
            java.lang.StringBuilder sb422 = new java.lang.StringBuilder();
            sb422.append(str222);
            sb422.append(")");
            java.lang.String obj322 = sb422.toString();
            java.lang.StringBuilder sb522 = new java.lang.StringBuilder();
            sb522.append(obj322);
            sb522.append(getHighSpeedVideoFpsRangesFor(returnType));
            obj = sb522.toString();
            exceptionTypes = method3.getExceptionTypes();
            i3 = 0;
            while (true) {
                if (i3 >= exceptionTypes.length) {
                }
                i3++;
            }
            com.sun.jna.Function highSpeedVideoFpsRanges22 = nativeLibrary2.getHighSpeedVideoFpsRanges(method3.getName(), method3);
        }
        java.lang.Class<?> cls4 = cls2;
        long[] jArr5 = jArr;
        java.util.Map<java.lang.Class<?>, long[]> map = getOutputMinFrameDurationlomOqCM;
        synchronized (map) {
            map.put(cls4, jArr5);
            getOutputSizes.put(cls4, nativeLibrary);
        }
    }

    public static com.sun.jna.NativeLibrary getNativeLibrary(com.sun.jna.Library library) {
        if (library == null) {
            throw new java.lang.IllegalArgumentException("null passed to getNativeLibrary");
        }
        if (!java.lang.reflect.Proxy.isProxyClass(library.getClass())) {
            throw new java.lang.IllegalArgumentException("library object passed to getNativeLibrary in not a proxy");
        }
        java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(library);
        if (!(invocationHandler instanceof com.sun.jna.Library.Handler)) {
            throw new java.lang.IllegalArgumentException("Object is not a properly initialized Library interface instance");
        }
        return ((com.sun.jna.Library.Handler) invocationHandler).getNativeLibrary();
    }

    public static com.sun.jna.NativeLibrary getNativeLibrary(java.lang.Class<?> cls) {
        com.sun.jna.NativeLibrary nativeLibrary;
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("null passed to getNativeLibrary");
        }
        java.lang.Class<?> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(cls);
        synchronized (getOutputMinFrameDurationlomOqCM) {
            nativeLibrary = getOutputSizes.get(Camera2StreamConfigurationMap2);
            if (nativeLibrary == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
                sb.append(cls.getName());
                sb.append(" is not currently registered");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return nativeLibrary;
    }

    private static java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap(java.lang.Class<?> cls, java.util.Map<java.lang.String, ?> map, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.put("enclosing-library", cls);
        getOutputSizeshNQ4ISI.put(cls, hashMap);
        if (obj != null) {
            getInputSizeshNQ4ISI.put(cls, new java.lang.ref.WeakReference(obj));
        }
        if (!cls.isInterface() && com.sun.jna.Library.class.isAssignableFrom(cls)) {
            for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
                if (com.sun.jna.Library.class.isAssignableFrom(cls2)) {
                    Camera2StreamConfigurationMap(cls2, hashMap, obj);
                    return hashMap;
                }
            }
        }
        return hashMap;
    }

    private static com.sun.jna.NativeMapped fromNative(java.lang.Class<?> cls, java.lang.Object obj) {
        return (com.sun.jna.NativeMapped) com.sun.jna.NativeMappedConverter.getInstance(cls).fromNative(obj, new com.sun.jna.FromNativeContext(cls));
    }

    private static com.sun.jna.NativeMapped fromNative(java.lang.reflect.Method method, java.lang.Object obj) {
        java.lang.Class<?> returnType = method.getReturnType();
        return (com.sun.jna.NativeMapped) com.sun.jna.NativeMappedConverter.getInstance(returnType).fromNative(obj, new com.sun.jna.MethodResultContext(returnType, null, null, method));
    }

    private static java.lang.Class<?> nativeType(java.lang.Class<?> cls) {
        return com.sun.jna.NativeMappedConverter.getInstance(cls).nativeType();
    }

    private static java.lang.Object toNative(com.sun.jna.ToNativeConverter toNativeConverter, java.lang.Object obj) {
        return toNativeConverter.toNative(obj, new com.sun.jna.ToNativeContext());
    }

    private static java.lang.Object fromNative(com.sun.jna.FromNativeConverter fromNativeConverter, java.lang.Object obj, java.lang.reflect.Method method) {
        return fromNativeConverter.fromNative(obj, new com.sun.jna.MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static void main(java.lang.String[] strArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Package r3 = com.sun.jna.Native.class.getPackage();
        if (r3 == null) {
            str = "Java Native Access (JNA)";
        } else {
            str = r3.getSpecificationTitle();
        }
        java.lang.String str4 = str != null ? str : "Java Native Access (JNA)";
        if (r3 == null) {
            str2 = "5.17.0";
        } else {
            str2 = r3.getSpecificationVersion();
        }
        java.lang.String str5 = str2 != null ? str2 : "5.17.0";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str4);
        sb.append(" API Version ");
        sb.append(str5);
        java.lang.System.out.println(sb.toString());
        if (r3 == null) {
            str3 = "5.17.0 (package information missing)";
        } else {
            str3 = r3.getImplementationVersion();
        }
        java.lang.System.out.println("Version: ".concat(java.lang.String.valueOf(str3 != null ? str3 : "5.17.0 (package information missing)")));
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" Native: ");
        sb2.append(getNativeVersion());
        sb2.append(" (");
        sb2.append(getAPIChecksum());
        sb2.append(")");
        printStream.println(sb2.toString());
        java.io.PrintStream printStream2 = java.lang.System.out;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" Prefix: ");
        sb3.append(com.sun.jna.Platform.RESOURCE_PREFIX);
        printStream2.println(sb3.toString());
    }

    static com.sun.jna.Structure Camera2StreamConfigurationMap(com.sun.jna.Function function, long j, int i, java.lang.Object[] objArr, com.sun.jna.Structure structure) {
        invokeStructure(function, j, i, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    static com.sun.jna.Pointer getHighSpeedVideoFpsRanges(long j) {
        long _getPointer = _getPointer(j);
        if (_getPointer == 0) {
            return null;
        }
        return new com.sun.jna.Pointer(_getPointer);
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer pointer, long j, java.lang.String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j);
        if (str != null) {
            try {
                return new java.lang.String(stringBytes, str);
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        return new java.lang.String(stringBytes);
    }

    public static void detach(boolean z) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (z) {
            getOutputFormats.remove(currentThread);
            getOutputMinFrameDuration.get();
            setDetachState(true, 0L);
        } else {
            java.util.Map<java.lang.Thread, com.sun.jna.Pointer> map = getOutputFormats;
            if (map.containsKey(currentThread)) {
                return;
            }
            com.sun.jna.Memory memory = getOutputMinFrameDuration.get();
            map.put(currentThread, memory);
            setDetachState(false, memory.peer);
        }
    }

    static class Buffers {
        private Buffers() {
        }

        static boolean Camera2StreamConfigurationMap(java.lang.Class<?> cls) {
            return java.nio.Buffer.class.isAssignableFrom(cls);
        }
    }

    /* loaded from: classes16.dex */
    static class AWT {
        private AWT() {
        }

        static long getHighSpeedVideoFpsRangesFor(java.awt.Window window) throws java.awt.HeadlessException {
            return Camera2StreamConfigurationMap(window);
        }

        static long Camera2StreamConfigurationMap(java.lang.Object obj) throws java.awt.HeadlessException {
            if (java.awt.GraphicsEnvironment.isHeadless()) {
                throw new java.awt.HeadlessException("No native windows when headless");
            }
            java.awt.Component component = (java.awt.Component) obj;
            if (component.isLightweight()) {
                throw new java.lang.IllegalArgumentException("Component must be heavyweight");
            }
            if (!component.isDisplayable()) {
                throw new java.lang.IllegalStateException("Component must be displayable");
            }
            if (com.sun.jna.Platform.isX11() && java.lang.System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                throw new java.lang.IllegalStateException("Component must be visible");
            }
            return com.sun.jna.Native.getWindowHandle0(component);
        }
    }

    public static byte[] toByteArray(java.lang.String str, java.nio.charset.Charset charset) {
        byte[] bytes = str.getBytes(charset);
        byte[] bArr = new byte[bytes.length + 1];
        java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }
}
