package util.h.xy.aj;

/* loaded from: classes5.dex */
public final class b implements com.thalesgroup.gemalto.securelog.internal.aa {
    private static int Camera2StreamConfigurationMap = 0;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static boolean getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static char[] getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private util.h.xy.aj.ra getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private com.sun.jna.Pointer getOutputStallDurationlomOqCM;
    private java.util.HashMap<java.lang.String, util.h.xy.aj.b.mb> isOutputSupportedFor;
    private com.thalesgroup.gemalto.securelog.SecureLogConfig unwrapAs;

    static final class mb {
        com.sun.jna.Pointer getHighSpeedVideoFpsRanges;

        private mb() {
        }

        /* synthetic */ mb(byte b) {
            this();
        }
    }

    public b(com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig) {
        java.lang.IllegalArgumentException illegalArgumentException;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(true, new int[]{0, 3, 0, 2}, "\u0000\u0001\u0001", objArr);
        this.getOutputMinFrameDurationlomOqCM = ((java.lang.String) objArr[0]).intern();
        this.isOutputSupportedFor = new java.util.HashMap<>();
        if (secureLogConfig == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{3, 23, 0, 11}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", objArr2);
            illegalArgumentException = new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        } else {
            android.content.Context context = secureLogConfig.getContext();
            java.io.File logDir = secureLogConfig.getLogDir();
            int i = getInputFormats + 105;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (logDir != null && !logDir.getName().endsWith(this.getOutputMinFrameDurationlomOqCM)) {
                java.lang.String parent = logDir.getParent();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(logDir.getName());
                sb.append(this.getOutputMinFrameDurationlomOqCM);
                java.io.File file = new java.io.File(parent, sb.toString());
                getOutputFormats = (getInputFormats + 79) % 128;
                logDir = file;
            }
            secureLogConfig = new com.thalesgroup.gemalto.securelog.SecureLogConfig.Builder(context).fileID(secureLogConfig.getFileID()).publicKey(secureLogConfig.getModulus(), secureLogConfig.getExponents()).rollingFileMaxCount(secureLogConfig.getRollingFileMaxCount()).rollingFileMaxSizeInKB(secureLogConfig.getRollingFileMaxSize()).directory(logDir).level(secureLogConfig.getLogLevel()).build();
            getOutputFormats = (getInputFormats + 37) % 128;
            java.io.File logDir2 = secureLogConfig.getLogDir();
            if (logDir2 == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{26, 22, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr3);
                illegalArgumentException = new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            } else if (!logDir2.exists() && !logDir2.mkdirs()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{48, 27, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000", objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                sb2.append(logDir2.getAbsolutePath());
                illegalArgumentException = new java.lang.IllegalArgumentException(sb2.toString());
            } else if (secureLogConfig.getLogLevel() == null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{75, 21, 90, 13}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", objArr5);
                illegalArgumentException = new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
            } else {
                illegalArgumentException = null;
            }
        }
        if (illegalArgumentException != null) {
            throw illegalArgumentException;
        }
        this.unwrapAs = secureLogConfig;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 41;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24958(util.h.xy.aj.ra raVar) {
        int i = getInputFormats;
        int i2 = i + 89;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputSizes = raVar;
            getOutputFormats = (i + 9) % 128;
        } else {
            this.getOutputSizes = raVar;
            throw null;
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (getInputSizeshNQ4ISI) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        if (r8.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027f  */
    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.io.File logDir;
        int rollingFileMaxCount;
        int rollingFileMaxSize;
        java.lang.String str7;
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String string;
        java.lang.String str10;
        if (!android.text.TextUtils.isEmpty(str)) {
            int i = getOutputFormats + 109;
            getInputFormats = i % 128;
            if (i % 2 != 0 ? str.length() <= 10 : str.length() <= 99) {
                if (this.getOutputStallDurationlomOqCM != null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("똭窀⼲펹萝䣊絪⇠튒蜔䮺簭⃛프駺䩳缚⎬푫飘䵈熼≬휟鮍䰼炦╖\ue985驻仩玚␠\ue8e8鵔䇄牾⛩\uebde", android.view.View.MeasureSpec.getMode(0) + 52369, objArr);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                }
                this.getOutputSizes.mo24952();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.unwrapAs.getFileID());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{126, 1, 22, 0}, "\u0001", objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(str);
                java.lang.String obj = sb.toString();
                this.getOutputSizeshNQ4ISI = obj;
                com.sun.jna.Pointer mo24955 = this.getOutputSizes.mo24955((com.sun.jna.Pointer) null, obj);
                this.getOutputStallDurationlomOqCM = mo24955;
                if (mo24955 == null) {
                    getOutputFormats = (getInputFormats + 55) % 128;
                    return;
                }
                android.content.Context context = this.unwrapAs.getContext();
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(127 - (android.os.Process.myTid() >> 22), "\u0083\u008b\u0086\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.view.View.MeasureSpec.getSize(0) + 127, "\u0090\u008f\u008e\u008d\u008c", objArr4);
                    java.lang.String str11 = (java.lang.String) cls.getField((java.lang.String) objArr4[0]).get(null);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "\u0083\u008b\u0086\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(127 - android.graphics.Color.red(0), "\u0097\u008f\u0097\u0093\u0096\u0095\u0091\u0094\u0093\u0092\u0091\u008c", objArr6);
                    java.lang.String str12 = (java.lang.String) cls2.getField((java.lang.String) objArr6[0]).get(null);
                    java.lang.String str13 = android.os.Build.VERSION.RELEASE;
                    try {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str12);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{96, 1, 50, 0}, "\u0001", objArr7);
                        sb2.append(((java.lang.String) objArr7[0]).intern());
                        sb2.append(str11);
                        str7 = sb2.toString();
                        try {
                            applicationInfo = context.getApplicationInfo();
                        } catch (java.lang.Exception unused) {
                            str6 = str7;
                            str2 = null;
                            str3 = null;
                            str4 = str3;
                            str5 = str13;
                            this.getOutputSizes.mo24956(this.getOutputStallDurationlomOqCM, str2, str3, str4, str5, str6);
                            logDir = this.unwrapAs.getLogDir();
                            if (logDir != null) {
                            }
                            rollingFileMaxCount = this.unwrapAs.getRollingFileMaxCount();
                            if (rollingFileMaxCount > 0) {
                            }
                            rollingFileMaxSize = this.unwrapAs.getRollingFileMaxSize();
                            if (rollingFileMaxSize > 0) {
                            }
                            setLevel(this.unwrapAs.getLogLevel());
                            return;
                        }
                    } catch (java.lang.Exception unused2) {
                        str7 = null;
                    }
                    try {
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u0099\u009b\u009a\u0099\u0082\u0085\u0095\u0087\u0099\u0082\u009a\u0099\u0082\u0085\u0098\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr8);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u0084\u009a\u009c\u0081\u0082\u0081\u008c\u009a\u009c\u0081\u009e\u0098\u0081\u009d\u0099\u009a\u009c", objArr9);
                        android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) cls3.getMethod((java.lang.String) objArr9[0], null).invoke(context, null);
                        if (applicationInfo == null || packageManager == null) {
                            str8 = null;
                            str9 = null;
                        } else {
                            int i2 = applicationInfo.labelRes;
                            if (i2 == 0) {
                                getInputFormats = (getOutputFormats + 65) % 128;
                                if (applicationInfo.nonLocalizedLabel != null) {
                                    int i3 = getOutputFormats + 71;
                                    getInputFormats = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        str10 = applicationInfo.nonLocalizedLabel.toString();
                                        try {
                                            throw new java.lang.ArithmeticException();
                                        } catch (java.lang.Exception unused3) {
                                            str2 = str10;
                                            str6 = str7;
                                            str3 = null;
                                            str4 = str3;
                                            str5 = str13;
                                            this.getOutputSizes.mo24956(this.getOutputStallDurationlomOqCM, str2, str3, str4, str5, str6);
                                            logDir = this.unwrapAs.getLogDir();
                                            if (logDir != null) {
                                            }
                                            rollingFileMaxCount = this.unwrapAs.getRollingFileMaxCount();
                                            if (rollingFileMaxCount > 0) {
                                            }
                                            rollingFileMaxSize = this.unwrapAs.getRollingFileMaxSize();
                                            if (rollingFileMaxSize > 0) {
                                            }
                                            setLevel(this.unwrapAs.getLogLevel());
                                            return;
                                        }
                                    }
                                    string = applicationInfo.nonLocalizedLabel.toString();
                                } else {
                                    string = null;
                                }
                            } else {
                                string = context.getString(i2);
                            }
                            if (string != null) {
                                getInputFormats = (getOutputFormats + 95) % 128;
                                try {
                                } catch (java.lang.Exception unused4) {
                                    str10 = string;
                                    str2 = str10;
                                    str6 = str7;
                                    str3 = null;
                                    str4 = str3;
                                    str5 = str13;
                                    this.getOutputSizes.mo24956(this.getOutputStallDurationlomOqCM, str2, str3, str4, str5, str6);
                                    logDir = this.unwrapAs.getLogDir();
                                    if (logDir != null) {
                                    }
                                    rollingFileMaxCount = this.unwrapAs.getRollingFileMaxCount();
                                    if (rollingFileMaxCount > 0) {
                                    }
                                    rollingFileMaxSize = this.unwrapAs.getRollingFileMaxSize();
                                    if (rollingFileMaxSize > 0) {
                                    }
                                    setLevel(this.unwrapAs.getLogLevel());
                                    return;
                                }
                            }
                            java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                            try {
                                try {
                                    if (loadLabel != null) {
                                        str9 = loadLabel.toString();
                                        java.lang.Object[] objArr10 = {context.getPackageName(), 0};
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(127 - android.view.KeyEvent.keyCodeFromString(""), "\u0084\u009a\u009c\u0081\u0082\u0081\u008c\u009a\u009c\u0081\u009e\u0098\u0081\u009d\u0087 \u009f\u0087\u0099\u0082\u009a\u0099\u0082\u0085\u0098\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr11);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(android.graphics.Color.red(0) + 127, "\u0085¢\u0082¡\u009a\u009c\u0081\u009e\u0098\u0081\u009d\u0099\u009a\u009c", objArr12);
                                        str8 = ((android.content.pm.PackageInfo) cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(packageManager, objArr10)).versionName;
                                    }
                                    java.lang.Object[] objArr102 = {context.getPackageName(), 0};
                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(127 - android.view.KeyEvent.keyCodeFromString(""), "\u0084\u009a\u009c\u0081\u0082\u0081\u008c\u009a\u009c\u0081\u009e\u0098\u0081\u009d\u0087 \u009f\u0087\u0099\u0082\u009a\u0099\u0082\u0085\u0098\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr112);
                                    java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr112[0]);
                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(android.graphics.Color.red(0) + 127, "\u0085¢\u0082¡\u009a\u009c\u0081\u009e\u0098\u0081\u009d\u0099\u009a\u009c", objArr122);
                                    str8 = ((android.content.pm.PackageInfo) cls42.getMethod((java.lang.String) objArr122[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(packageManager, objArr102)).versionName;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused5) {
                                str8 = null;
                            } catch (java.lang.Exception unused6) {
                                str10 = str9;
                                str2 = str10;
                                str6 = str7;
                                str3 = null;
                                str4 = str3;
                                str5 = str13;
                                this.getOutputSizes.mo24956(this.getOutputStallDurationlomOqCM, str2, str3, str4, str5, str6);
                                logDir = this.unwrapAs.getLogDir();
                                if (logDir != null) {
                                }
                                rollingFileMaxCount = this.unwrapAs.getRollingFileMaxCount();
                                if (rollingFileMaxCount > 0) {
                                }
                                rollingFileMaxSize = this.unwrapAs.getRollingFileMaxSize();
                                if (rollingFileMaxSize > 0) {
                                }
                                setLevel(this.unwrapAs.getLogLevel());
                                return;
                            }
                            str9 = string;
                        }
                        getOutputFormats = (getInputFormats + 57) % 128;
                        try {
                            try {
                                str3 = str8;
                                str6 = str7;
                                str2 = str9;
                                str4 = java.lang.String.valueOf(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue());
                            } catch (java.lang.Exception unused7) {
                                str3 = str8;
                                str6 = str7;
                                str2 = str9;
                                str4 = null;
                            }
                            str5 = str13;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (java.lang.Exception unused8) {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                this.getOutputSizes.mo24956(this.getOutputStallDurationlomOqCM, str2, str3, str4, str5, str6);
                logDir = this.unwrapAs.getLogDir();
                if (logDir != null) {
                    this.getOutputSizes.mo24957(this.getOutputStallDurationlomOqCM, logDir.getAbsolutePath());
                }
                rollingFileMaxCount = this.unwrapAs.getRollingFileMaxCount();
                if (rollingFileMaxCount > 0) {
                    int i4 = getInputFormats + 19;
                    getOutputFormats = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.getOutputSizes.mo24953(this.getOutputStallDurationlomOqCM, rollingFileMaxCount);
                        throw null;
                    }
                    this.getOutputSizes.mo24953(this.getOutputStallDurationlomOqCM, rollingFileMaxCount);
                }
                rollingFileMaxSize = this.unwrapAs.getRollingFileMaxSize();
                if (rollingFileMaxSize > 0) {
                    this.getOutputSizes.mo24948(this.getOutputStallDurationlomOqCM, rollingFileMaxSize);
                }
                setLevel(this.unwrapAs.getLogLevel());
                return;
            }
        }
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{97, 29, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr13);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr13[0]).intern());
    }

    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    public final void a2(int i, java.lang.String str) {
        getInputFormats = (getOutputFormats + 81) % 128;
        byte b = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{127, 36, 47, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (this.isOutputSupportedFor.get(str) == null) {
            util.h.xy.aj.b.mb mbVar = new util.h.xy.aj.b.mb(b);
            mbVar.getHighSpeedVideoFpsRanges = null;
            this.isOutputSupportedFor.put(str, mbVar);
            return;
        }
        getOutputFormats = (getInputFormats + 15) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 83) % 128;
        Camera2StreamConfigurationMap = (i + 79) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 27) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            loop2: while (true) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    int i8 = Camera2StreamConfigurationMap + 65;
                    getHighSpeedVideoFpsRangesFor = i8 % 128;
                    if (i8 % 2 == 0) {
                        break;
                    }
                    cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                    maVar.f2631++;
                }
                cArr6[maVar.f2631] = cArr3[maVar.f2631 + i3];
                int i9 = maVar.f2631;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    public final void m(java.lang.String str, com.thalesgroup.gemalto.securelog.SecureLogLevel secureLogLevel, java.lang.String str2, java.lang.String str3) {
        util.h.xy.aj.b.mb mbVar;
        synchronized (this) {
            if (android.text.TextUtils.isEmpty(str)) {
                getOutputFormats = (getInputFormats + 43) % 128;
                return;
            }
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                if (this.getOutputStallDurationlomOqCM == null) {
                    return;
                }
                int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(secureLogLevel);
                if (this.getOutputStallDuration == 0) {
                    getOutputFormats = (getInputFormats + 83) % 128;
                    this.getOutputStallDuration = Camera2StreamConfigurationMap(this.unwrapAs.getLogLevel());
                }
                if (Camera2StreamConfigurationMap2 >= 0) {
                    int i = getInputFormats + 77;
                    getOutputFormats = i % 128;
                    if (i % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (Camera2StreamConfigurationMap2 <= this.getOutputStallDuration && (mbVar = this.isOutputSupportedFor.get(str)) != null) {
                        if (mbVar.getHighSpeedVideoFpsRanges == null) {
                            util.h.xy.aj.ra raVar = this.getOutputSizes;
                            com.sun.jna.Pointer mo24949 = raVar.mo24949(this.getOutputStallDurationlomOqCM, str, null, null, 2, raVar.mo24950());
                            if (mo24949 != null) {
                                mbVar.getHighSpeedVideoFpsRanges = mo24949;
                            }
                        }
                        this.getOutputSizes.mo24954(mbVar.getHighSpeedVideoFpsRanges, Camera2StreamConfigurationMap2, str2, str3);
                    }
                }
            }
        }
    }

    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    public final java.lang.Object b1() {
        int i = getOutputFormats + 41;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return this.getOutputStallDurationlomOqCM;
        }
        throw null;
    }

    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    public final byte[] b2() {
        int i = (getInputFormats + 99) % 128;
        getOutputFormats = i;
        byte[] bArr = new byte[0];
        int i2 = i + 37;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.thalesgroup.gemalto.securelog.internal.aa
    public final byte[] b3() {
        int i = getOutputFormats;
        getInputFormats = (i + 29) % 128;
        byte[] bArr = new byte[0];
        getInputFormats = (i + 71) % 128;
        return bArr;
    }

    @Override // com.thalesgroup.gemalto.securelog.SecureLog
    public final void setLevel(com.thalesgroup.gemalto.securelog.SecureLogLevel secureLogLevel) {
        int i = getInputFormats + 37;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(secureLogLevel);
            this.getOutputStallDuration = Camera2StreamConfigurationMap2;
            this.getOutputSizes.mo24951(this.getOutputStallDurationlomOqCM, Camera2StreamConfigurationMap2, 5);
        } else {
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(secureLogLevel);
            this.getOutputStallDuration = Camera2StreamConfigurationMap3;
            this.getOutputSizes.mo24951(this.getOutputStallDurationlomOqCM, Camera2StreamConfigurationMap3, 2);
        }
    }

    @Override // com.thalesgroup.gemalto.securelog.SecureLog
    public final java.util.List<java.io.File> getFiles() {
        java.util.List<java.io.File> list;
        synchronized (this) {
            java.io.File file = new java.io.File(this.unwrapAs.getLogDir().getAbsolutePath());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("똧饁\ue883㯷ଲ娣", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12107, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.getOutputSizeshNQ4ISI);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{163, 11, 0, 8}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            final java.util.regex.Pattern compile = java.util.regex.Pattern.compile(sb.toString());
            java.io.File[] listFiles = file.listFiles(new java.io.FilenameFilter() { // from class: util.h.xy.aj.b.1
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoSizes;

                @Override // java.io.FilenameFilter
                public final boolean accept(java.io.File file2, java.lang.String str) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 95) % 128;
                    boolean matches = compile.matcher(str).matches();
                    int i = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = (((i | 91) << 1) - (i ^ 91)) % 128;
                    return matches;
                }
            });
            if (listFiles != null) {
                getInputFormats = (getOutputFormats + 69) % 128;
                if (listFiles.length != 0) {
                    list = java.util.Arrays.asList(listFiles);
                    int i = getOutputFormats + 117;
                    getInputFormats = i % 128;
                    int i2 = i % 2;
                }
            }
            list = null;
        }
        return list;
    }

    @Override // com.thalesgroup.gemalto.securelog.SecureLog
    public final void deleteFiles() {
        synchronized (this) {
            getInputFormats = (getOutputFormats + 87) % 128;
            java.util.List<java.io.File> files = getFiles();
            java.util.List<java.io.File> highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (files != null) {
                int i = getOutputFormats + 117;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    files.iterator();
                    throw new java.lang.ArithmeticException();
                }
                java.util.Iterator<java.io.File> it = files.iterator();
                while (it.hasNext()) {
                    it.next().delete();
                }
            }
            if (highSpeedVideoSizes != null && !highSpeedVideoSizes.isEmpty()) {
                java.util.Iterator<java.io.File> it2 = highSpeedVideoSizes.iterator();
                while (it2.hasNext()) {
                    int i2 = getOutputFormats + 11;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        it2.next().delete();
                        throw null;
                    }
                    it2.next().delete();
                }
            }
        }
    }

    private java.util.List<java.io.File> getHighSpeedVideoSizes() {
        java.lang.String str;
        synchronized (this) {
            java.lang.String absolutePath = this.unwrapAs.getLogDir().getAbsolutePath();
            java.util.List<java.io.File> list = null;
            if (absolutePath.endsWith(this.getOutputMinFrameDurationlomOqCM)) {
                int i = getInputFormats + 77;
                getOutputFormats = i % 128;
                str = i % 2 != 0 ? absolutePath.substring(1, absolutePath.length() % this.getOutputMinFrameDurationlomOqCM.length()) : absolutePath.substring(0, absolutePath.length() - this.getOutputMinFrameDurationlomOqCM.length());
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{174, 16, 97, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", objArr);
                final java.util.regex.Pattern compile = java.util.regex.Pattern.compile(((java.lang.String) objArr[0]).intern());
                java.io.File[] listFiles = file.listFiles(new java.io.FilenameFilter() { // from class: util.h.xy.aj.b.5
                    private static int Camera2StreamConfigurationMap = 0;
                    private static int getHighSpeedVideoFpsRanges = 1;

                    @Override // java.io.FilenameFilter
                    public final boolean accept(java.io.File file2, java.lang.String str2) {
                        int i2 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = ((i2 ^ 67) + ((i2 & 67) << 1)) % 128;
                        boolean matches = compile.matcher(str2).matches();
                        int i3 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = ((i3 & 51) + (i3 | 51)) % 128;
                        return matches;
                    }
                });
                if (listFiles != null) {
                    getInputFormats = (getOutputFormats + 15) % 128;
                    if (listFiles.length != 0) {
                        list = java.util.Arrays.asList(listFiles);
                    }
                }
            }
            int i2 = getInputFormats + 59;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return list;
            }
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: util.h.xy.aj.b$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.thalesgroup.gemalto.securelog.SecureLogLevel.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.thalesgroup.gemalto.securelog.SecureLogLevel.OFF.ordinal()] = 1;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.FATAL.ordinal()] = 2;
                int i = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (((i | 21) << 1) - (i ^ 21)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.ERROR.ordinal()] = 3;
                int i2 = Camera2StreamConfigurationMap;
                int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.INFO.ordinal()] = 5;
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                int i6 = (i5 ^ 79) + ((i5 & 79) << 1);
                Camera2StreamConfigurationMap = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.ALL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.thalesgroup.gemalto.securelog.SecureLogLevel.DEBUG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int i8 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i8 ^ 87) + ((i8 & 87) << 1)) % 128;
        }
    }

    private static int Camera2StreamConfigurationMap(com.thalesgroup.gemalto.securelog.SecureLogLevel secureLogLevel) {
        getOutputFormats = (getInputFormats + 9) % 128;
        if (secureLogLevel == null) {
            return -1;
        }
        switch (util.h.xy.aj.b.AnonymousClass2.getHighSpeedVideoFpsRangesFor[secureLogLevel.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                int i = getInputFormats + 77;
                getOutputFormats = i % 128;
                int i2 = i % 2;
                return 4;
            case 5:
                return 6;
            case 6:
            case 7:
                return 7;
            default:
                return -1;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = new char[]{64354, 64337, 64367, 64349, 64336, 64362, 64401, 64348, 64397, 64350, 64343, 64374, 64368, 64399, 64398, 64375, 64386, 64369, 64382, 64393, 64396, 64383, 64381, 64364, 64351, 64366, 64347, 64360, 64371, 64340, 64339, 64342, 64394, 64361};
        getHighSpeedVideoSizesFor = -1074857021;
        getHighResolutionOutputSizeshNQ4ISI = true;
        getInputSizeshNQ4ISI = true;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes = new char[]{42342, 42252, 42354, 42346, 42284, 42263, 42268, 42302, 42271, 42266, 42284, 42285, 42289, 42267, 42351, 42244, 42291, 42295, 42298, 42293, 42270, 42268, 42303, 42298, 42266, 42266, 42317, 42267, 42289, 42285, 42284, 42266, 42260, 42291, 42265, 42257, 42280, 42285, 42284, 42294, 42297, 42294, 42288, 42299, 42271, 42270, 42294, 42240, 42317, 42352, 42251, 42294, 42297, 42293, 42288, 42295, 42270, 42266, 42284, 42263, 42271, 42289, 42291, 42288, 42281, 42262, 42263, 42284, 42291, 42266, 42271, 42293, 42285, 42287, 42244, 42302, 42493, 42435, 42389, 42494, 42492, 42389, 42390, 42489, 42494, 42395, 42395, 42489, 42445, 42474, 42392, 42432, 42493, 42399, 42394, 42394, 42261, 42361, 42246, 42287, 42294, 42299, 42295, 42299, 42271, 42261, 42290, 42284, 42286, 42288, 42298, 42285, 42257, 42262, 42294, 42299, 42285, 42288, 42271, 42267, 42293, 42292, 42295, 42288, 42291, 42265, 42364, 42337, 42455, 42434, 42495, 42436, 42443, 42442, 42446, 42459, 42280, 42300, 42285, 42444, 42443, 42283, 42283, 42432, 42493, 42276, 42285, 42447, 42284, 42283, 42493, 42434, 42438, 42280, 42283, 42434, 42277, 42284, 42437, 42432, 42492, 42488, 42273, 42312, 42356, 42271, 42264, 42256, 42288, 42294, 42264, 42357, 42359, 42358, 42271, 42491, 42385, 42387, 42483, 42491, 42494, 42455, 42448, 42449, 42454, 42486, 42385, 42387, 42381, 42388};
        getHighSpeedVideoFpsRanges = 8186702366219601378L;
    }
}
