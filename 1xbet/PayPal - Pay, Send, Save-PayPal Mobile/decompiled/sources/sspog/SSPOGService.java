package sspog;

/* loaded from: classes18.dex */
public class SSPOGService extends my.com.softspace.common.util.SimpleActivityLifecycleCallback {
    private static final java.lang.String EXTRA_HSM_CLIENT_ID = "ss-clientId";
    private static sspog.SSPOGService INSTANCE = null;
    private static final java.lang.String TAG = "SSPOGService";
    private static boolean init = false;
    static boolean isLoad = false;
    private static long jobRefreshInterval;
    private static long jobRefreshMinInterval;
    private static long pinpad;
    private final android.content.Context applicationContext;
    private final my.com.softspace.auditlog.service.intf.AuditLogger auditLogger;
    private android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>> backgroundAttestPair;
    private java.util.HashMap<java.lang.String, java.lang.String> extras;
    private final java.util.concurrent.ExecutorService internalThreadPool;
    private final sspog.SSPOGProvider provider;
    private java.lang.String rootClassName;
    private final java.security.SecureRandom secureRandom;
    private final sspog.SSPOGProperties sspogProperties;
    private java.util.List<sspog.SSPOGSuggestedAction> suggestedAction;
    private static final byte[] $$d = {40, com.google.common.base.Ascii.VT, -89, -76, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = 22;
    private static final byte[] $$a = {83, -73, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -24, -15, 2, 6, 5, 4, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 203;
    private long attestTime = 0;
    private long startAttestTime = 0;
    private java.lang.String serviceAppName = "";
    private java.lang.String serviceAppVersion = "";
    private java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, byte[]>>> pinCVMResponse = new java.util.concurrent.atomic.AtomicReference<>(null);
    private boolean isDebuggingCheck = false;
    private boolean isEmulatorCheck = false;
    private boolean isHookCheck = false;
    private boolean isRootCheck = false;
    private boolean isSecureData = true;
    private java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>>> runningAttestation = new java.util.concurrent.atomic.AtomicReference<>(null);
    private boolean isCinit = false;
    private final my.com.softspace.common.SensorEntropy sensorEntropy = new my.com.softspace.common.SensorEntropy();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface KeyloadingMode {
        public static final int ATTESTATION = 1;
        public static final int PAYMENT_KEYLOADER = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SolutionMode {
        public static final int CPOC = 2;
        public static final int SPOC = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        byte b;
        int i2 = s3 + 4;
        ?? r5 = 122 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[21 - s2];
        ?? r6 = 20 - s2;
        if (bArr == null) {
            byte b2 = r5;
            byte b3 = r6;
            int i3 = 0;
            i2++;
            ?? r52 = (b3 + b2) - 5;
            i = i3;
            b = r52;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            b3 = b;
            i2++;
            ?? r522 = (b3 + b2) - 5;
            i = i3;
            b = r522;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r6) {
            }
        } else {
            i = 0;
            b = r5;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r6) {
            }
        }
    }

    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i = 103 - (b * 4);
        byte[] bArr = $$d;
        int i2 = (b2 * 3) + 4;
        int i3 = b3 * 2;
        byte[] bArr2 = new byte[35 - i3];
        int i4 = 34 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = (i4 + (-i)) - 3;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i = (i + (-bArr[i2])) - 3;
            i2++;
            i5 = i6;
        }
    }

    static /* synthetic */ sspog.SCRPAdapter lambda$init$0(sspog.SCRPAdapter sCRPAdapter) {
        return sCRPAdapter;
    }

    int setRandomSeed(byte[] bArr) {
        return 0;
    }

    static {
        loadLibrary();
        init = false;
        pinpad = 0L;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [boolean, int] */
    static void loadLibrary() {
        synchronized (sspog.SSPOGService.class) {
            if (!isLoad) {
                byte b = (byte) 0;
                byte[] bArr = $$a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(b, (byte) (-bArr[4]), b, objArr);
                java.lang.String str = (java.lang.String) objArr[0];
                java.lang.ClassLoader classLoader = sspog.SSPOGService.class.getClassLoader();
                try {
                    java.lang.Object[] objArr2 = {-1395598504};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.view.View.combineMeasuredStates(0, 0) + 349, 9 - android.view.MotionEvent.axisFromString(""), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    try {
                        java.lang.Object[] objArr3 = {str, classLoader, false, 1380604882, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1380604882};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                        if (Camera2StreamConfigurationMap2 == null) {
                            char red = (char) (android.graphics.Color.red(0) + 45285);
                            int longPressTimeout = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                            int indexOf = android.text.TextUtils.indexOf("", "") + 3;
                            byte b2 = $$d[14];
                            byte b3 = b2;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr4);
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(red, longPressTimeout, indexOf, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 103 - android.os.Process.getGidForName(""), 32 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                        if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                            java.lang.Object[] objArr6 = {r7, new int[]{r14}, new int[]{r12}, new int[1]};
                            int i = ((int[]) objArr5[3])[0];
                            int i2 = ((int[]) objArr5[2])[0];
                            int i3 = ((int[]) objArr5[1])[0];
                            java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                            int startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
                            int i4 = i + (-2073906784) + (((~((-111392353) | startUptimeMillis)) | 102892608) * 104) + ((~((~startUptimeMillis) | 918011488)) * (-104)) + ((startUptimeMillis | 909511744) * 104);
                            int i5 = (i4 << 13) ^ i4;
                            int i6 = i5 ^ (i5 >>> 17);
                            ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                            try {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                a((byte) (-bArr[11]), bArr[8], bArr[7], objArr7);
                                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                a((byte) (-bArr[11]), b, bArr[102], objArr8);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                a((byte) (-bArr[11]), bArr[7], bArr[18], objArr9);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                a((byte) (-bArr[99]), bArr[21], (byte) 56, objArr10);
                                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                a((byte) (-bArr[11]), bArr[6], (byte) ($$b & 373), objArr11);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                byte b4 = (byte) (-bArr[99]);
                                byte b5 = (byte) (bArr[42] - 1);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b4, b5, (byte) (b5 | 72), objArr12);
                                java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(sspog.SSPOGService.class, new java.lang.Object[0]);
                                if (android.os.Build.VERSION.SDK_INT <= 24) {
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    a((byte) 14, bArr[58], (byte) 92, objArr13);
                                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(invoke, str, invoke2);
                                } else {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    a((byte) 14, bArr[23], (byte) 102, objArr14);
                                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                                    declaredMethod2.setAccessible(true);
                                    declaredMethod2.invoke(invoke, invoke2, str);
                                }
                                int i7 = ((int[]) objArr6[3])[0];
                                int i8 = i7 * i7;
                                int i9 = -(766309564 * i7);
                                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                                int i11 = -(i7 * (-347134520));
                                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                                int i13 = (i12 ^ 1034405124) + ((1034405124 & i12) << 1);
                                int i14 = i13 >> 23;
                                int i15 = (((i14 | (-1023)) << 1) - (i14 ^ (-1023))) / 512;
                                int i16 = ((i15 | 1) << 1) - (i15 ^ 1);
                                int i17 = (i13 & i16) + (i16 | i13);
                                int i18 = ((i13 >> 18) - 32767) / 16384;
                                int i19 = -(i17 ^ (((i18 | 1) << 1) - (i18 ^ 1)));
                                int i20 = ((i19 | 1) << 1) - (i19 ^ 1);
                                int i21 = ((i20 >> 29) - 15) / 8;
                                isLoad = 958 / (((-((((i21 | 1) << 1) - (i21 ^ 1)) + 1)) & i20) * 958);
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
                                for (java.lang.String str2 : strArr2) {
                                    arrayList.add(str2);
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
            }
        }
    }

    public void setRecoverableAction(java.util.List<sspog.SSPOGSuggestedAction> list) {
        synchronized (this) {
            this.suggestedAction = list;
        }
    }

    private SSPOGService(android.content.Context context, sspog.SSPOGProperties sSPOGProperties, my.com.softspace.auditlog.service.intf.AuditLogger auditLogger, sspog.SSPOGProvider sSPOGProvider, java.security.SecureRandom secureRandom, java.util.concurrent.ExecutorService executorService) {
        this.applicationContext = context;
        this.sspogProperties = sSPOGProperties;
        this.auditLogger = auditLogger;
        this.provider = sSPOGProvider;
        this.secureRandom = secureRandom;
        this.internalThreadPool = executorService;
    }

    private static my.com.softspace.auditlog.service.intf.AuditLogger provideAuditLogger(android.content.Context context) {
        return my.com.softspace.auditlog.service.AuditLoggerFactory.getLogger(context, null);
    }

    public static boolean hasPermission(android.content.Context context) {
        return (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) && (getInstance().getMode() == null || getInstance().getMode().length <= 1 || getInstance().getMode()[1] != 1 || (android.os.Build.VERSION.SDK_INT < 31 ? androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH") == 0 : !(androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") != 0 || androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") != 0)));
    }

    public static boolean hasGrantPermission(int[] iArr) {
        return iArr != null && iArr.length > 0 && iArr[0] == 0;
    }

    public static java.lang.String[] getEssentialPermissions() {
        if (getInstance().getMode() != null && getInstance().getMode().length > 1 && getInstance().getMode()[1] == 1) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                return new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
            }
            return new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH"};
        }
        return new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    public static boolean requestPermissionIfRequired(android.app.Activity activity, int i) {
        if (hasPermission(activity)) {
            return true;
        }
        activity.requestPermissions(getEssentialPermissions(), i);
        return false;
    }

    public static sspog.SSPOGService init(android.content.Context context, sspog.SSPOGProperties sSPOGProperties, java.security.SecureRandom secureRandom) {
        return init(context, sSPOGProperties, new my.com.softspace.sspog.SSPOGDummyScrpAdapter(), secureRandom, java.util.concurrent.Executors.newCachedThreadPool());
    }

    public static sspog.SSPOGService init(android.content.Context context, sspog.SSPOGProperties sSPOGProperties, final sspog.SCRPAdapter sCRPAdapter, java.security.SecureRandom secureRandom, java.util.concurrent.ExecutorService executorService) {
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(sSPOGProperties);
        if (sSPOGProperties.isEnableAttestation().booleanValue() && android.text.TextUtils.isEmpty(sSPOGProperties.getPlayProjectNumber())) {
            throw new java.lang.NullPointerException("Play Project Number cannot be null");
        }
        if (init) {
            return INSTANCE;
        }
        final android.content.Context context2 = (android.content.Context) new java.lang.ref.WeakReference(context).get();
        if (sSPOGProperties.isEnableAttestation().booleanValue()) {
            sspog.SimpleLogger.init(true);
            my.com.softspace.common.http.RestServiceFactory.init(sSPOGProperties, secureRandom);
            my.com.softspace.auditlog.service.AuditLogService.init(context2);
        }
        sspog.SSPOGProvider sSPOGProvider = new sspog.SSPOGProvider() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda6
            @Override // sspog.SSPOGProvider
            public final sspog.SCRPAdapter scrp() {
                return sspog.SSPOGService.lambda$init$0(sspog.SCRPAdapter.this);
            }
        };
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(sSPOGProperties.isEnableAttestation());
        sb.append(sSPOGProperties.getStrictHttp());
        sb.append(sSPOGProperties.getHost());
        sb.append(sSPOGProperties.getCertificatePinning());
        sb.append(sSPOGProperties.getRefreshInterval());
        if (!sspog.SSPOG.unlock(context2, sSPOGProperties.getAccesskey(), sSPOGProperties.getSecretkey(), sb.toString())) {
            sspog.SimpleLogger.e(">>>", "properties.getAccesskey() = %s, properties.getSecretkey() = %s", sSPOGProperties.getAccesskey(), sSPOGProperties.getSecretkey());
            throw new java.lang.IllegalArgumentException("unlock fail");
        }
        sspog.SSPOGService sSPOGService = new sspog.SSPOGService(context2, sSPOGProperties, provideAuditLogger(context2), sSPOGProvider, secureRandom, executorService);
        INSTANCE = sSPOGService;
        byte[] mode = sSPOGService.getMode();
        if (mode != null && mode.length >= 7 && mode[6] == 2 && (android.text.TextUtils.isEmpty(INSTANCE.sspogProperties.getKeyLoadingHost()) || android.text.TextUtils.isEmpty(INSTANCE.sspogProperties.getKeyLoadingCACert()) || android.text.TextUtils.isEmpty(INSTANCE.sspogProperties.getKeyLoadingHostCertPinning()))) {
            INSTANCE = null;
            throw new java.lang.NullPointerException("Keyloading config cannot be empty");
        }
        if (!init) {
            androidx.view.ProcessLifecycleOwner.get().getLifecycleRegistry().addObserver(new androidx.view.LifecycleEventObserver() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda7
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    sspog.SSPOGService.lambda$init$1(context2, lifecycleOwner, event);
                }
            });
            if (sSPOGProperties.isEnableAttestation().booleanValue()) {
                if (context2 instanceof android.app.Application) {
                    ((android.app.Application) context2).registerActivityLifecycleCallbacks(INSTANCE);
                } else {
                    ((android.app.Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(INSTANCE);
                }
            }
        }
        init = true;
        return INSTANCE;
    }

    /* renamed from: sspog.SSPOGService$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static /* synthetic */ void lambda$init$1(android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        int i = sspog.SSPOGService.AnonymousClass2.Camera2StreamConfigurationMap[event.ordinal()];
        if (i == 1) {
            INSTANCE.onForeground(context);
        } else {
            if (i != 2) {
                return;
            }
            INSTANCE.onBackground(context);
        }
    }

    public static sspog.SSPOGService getInstance() {
        if (!init) {
            throw new java.lang.IllegalStateException();
        }
        return INSTANCE;
    }

    public void start(android.content.Context context, boolean z) {
        sspog.SSPOGJobService.start(context.getApplicationContext(), z, jobRefreshMinInterval, jobRefreshInterval);
    }

    public android.content.Context getApplicationContext() {
        return this.applicationContext;
    }

    public void stop(android.content.Context context) {
        sspog.SSPOGJobService.stop(context);
    }

    public my.com.softspace.auditlog.service.intf.AuditLogger getAuditLogger() {
        return this.auditLogger;
    }

    int uploadPayloadTo(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            if (this.isCinit) {
                return sspog.SSPOG.up(context, this.provider, str, str2);
            }
            return sspog.SSPOGError.RST_GENERAL_ERROR.getCode();
        }
    }

    public void attest(android.content.Context context, java.util.function.BiFunction<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>, java.lang.Void> biFunction, boolean z) {
        attest(context, new java.util.HashMap<>(), biFunction, z);
    }

    public void attest(final android.content.Context context, java.util.HashMap<java.lang.String, java.lang.String> hashMap, final java.util.function.BiFunction<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>, java.lang.Void> biFunction, boolean z) {
        sspog.SimpleLogger.d(TAG, "SSPOGService attest", new java.lang.Object[0]);
        this.attestTime = 0L;
        this.startAttestTime = java.lang.System.currentTimeMillis();
        sspog.SSPOGProperties sSPOGProperties = this.sspogProperties;
        if (sSPOGProperties != null && sSPOGProperties.getClientID() != null && !this.sspogProperties.getClientID().isEmpty()) {
            hashMap.put(EXTRA_HSM_CLIENT_ID, this.sspogProperties.getClientID());
        }
        if (z || checkifShouldPerformAttestation(context)) {
            java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attestMandatory = attestMandatory(context);
            if (attestMandatory.isDone()) {
                attestMandatory.thenAccept(new java.util.function.Consumer() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda16
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        sspog.SSPOGService.this.lambda$attest$3(context, biFunction, (android.util.Pair) obj);
                    }
                }).exceptionally(new java.util.function.Function() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        java.lang.Void lambda$attest$4;
                        lambda$attest$4 = sspog.SSPOGService.this.lambda$attest$4((java.lang.Throwable) obj);
                        return lambda$attest$4;
                    }
                });
                return;
            } else {
                attest(context, hashMap, my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER.getOrdinal()).thenAccept(new java.util.function.Consumer() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        sspog.SSPOGService.this.lambda$attest$6(context, biFunction, (android.util.Pair) obj);
                    }
                }).exceptionally(new java.util.function.Function() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda3
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        java.lang.Void lambda$attest$7;
                        lambda$attest$7 = sspog.SSPOGService.this.lambda$attest$7((java.lang.Throwable) obj);
                        return lambda$attest$7;
                    }
                });
                return;
            }
        }
        if (biFunction != null) {
            java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attestMandatory2 = attestMandatory(context);
            if (attestMandatory2.isDone()) {
                attestMandatory2.thenAccept(new java.util.function.Consumer() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda4
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        sspog.SSPOGService.this.lambda$attest$9(context, biFunction, (android.util.Pair) obj);
                    }
                }).exceptionally(new java.util.function.Function() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda5
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        java.lang.Void lambda$attest$10;
                        lambda$attest$10 = sspog.SSPOGService.this.lambda$attest$10((java.lang.Throwable) obj);
                        return lambda$attest$10;
                    }
                });
                return;
            }
            android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>> pair = this.backgroundAttestPair;
            if (pair == null) {
                this.attestTime = java.lang.System.currentTimeMillis() - this.startAttestTime;
                attest(context, hashMap, biFunction, true);
            } else {
                this.attestTime = java.lang.System.currentTimeMillis() - this.startAttestTime;
                attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, ((java.lang.Integer) pair.first).intValue(), java.lang.String.format("Attestation from background completed with return: %d", pair.first), null);
                biFunction.apply((java.lang.Integer) pair.first, (java.util.List) pair.second);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attest$3(android.content.Context context, final java.util.function.BiFunction biFunction, final android.util.Pair pair) {
        this.attestTime = java.lang.System.currentTimeMillis() - this.startAttestTime;
        attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, ((java.lang.Integer) pair.first).intValue(), formatMandatoryAttestRetForAuditLogging((java.util.List) pair.second), null);
        new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                biFunction.apply((java.lang.Integer) r1.first, (java.util.List) pair.second);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void lambda$attest$4(java.lang.Throwable th) {
        if (sspog.SimpleLogger.checkLogEnabled()) {
            sspog.SimpleLogger.e(TAG, (th.getMessage() == null || th.getMessage().length() <= 0) ? "" : th.getMessage(), th);
        }
        attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, sspog.SSPOGError.RST_GENERAL_ERROR.getCode(), java.lang.String.format("Enforced attestation, exception with error: %s", (th.getMessage() == null || th.getMessage().length() <= 0) ? "EMPTY" : th.getMessage()), th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attest$6(android.content.Context context, final java.util.function.BiFunction biFunction, final android.util.Pair pair) {
        this.attestTime = java.lang.System.currentTimeMillis() - this.startAttestTime;
        android.os.Handler handler = new android.os.Handler(context.getMainLooper());
        if (biFunction != null) {
            attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, ((java.lang.Integer) pair.first).intValue(), java.lang.String.format("Attestation enforced completed with return: %d", pair.first), null);
            handler.post(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    biFunction.apply((java.lang.Integer) r1.first, (java.util.List) pair.second);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void lambda$attest$7(java.lang.Throwable th) {
        if (sspog.SimpleLogger.checkLogEnabled()) {
            sspog.SimpleLogger.e(TAG, (th.getMessage() == null || th.getMessage().length() <= 0) ? "" : th.getMessage(), th);
        }
        attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, sspog.SSPOGError.RST_GENERAL_ERROR.getCode(), java.lang.String.format("Enforced attestation, exception with error: %s", (th.getMessage() == null || th.getMessage().length() <= 0) ? "EMPTY" : th.getMessage()), th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attest$9(android.content.Context context, final java.util.function.BiFunction biFunction, final android.util.Pair pair) {
        this.attestTime = java.lang.System.currentTimeMillis() - this.startAttestTime;
        attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, ((java.lang.Integer) pair.first).intValue(), formatMandatoryAttestRetForAuditLogging((java.util.List) pair.second), null);
        new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                biFunction.apply((java.lang.Integer) r1.first, (java.util.List) pair.second);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void lambda$attest$10(java.lang.Throwable th) {
        if (sspog.SimpleLogger.checkLogEnabled()) {
            sspog.SimpleLogger.e(TAG, (th.getMessage() == null || th.getMessage().length() <= 0) ? "" : th.getMessage(), th);
        }
        attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER, sspog.SSPOGError.RST_GENERAL_ERROR.getCode(), java.lang.String.format("Enforced attestation, exception with error: %s", (th.getMessage() == null || th.getMessage().length() <= 0) ? "EMPTY" : th.getMessage()), th);
        return null;
    }

    @java.lang.Deprecated
    public java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attest(android.content.Context context) {
        return attest(context, new java.util.HashMap<>(), my.com.softspace.auditlog.service.intf.AuditLogger.Originator.USER.getOrdinal());
    }

    private java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attestMandatory(android.content.Context context) {
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> completableFuture = new java.util.concurrent.CompletableFuture<>();
        sspog.SSPOGSuggestedAction sSPOGSuggestedAction = null;
        if (!hasPermission(context)) {
            completableFuture.complete(new android.util.Pair<>(java.lang.Integer.valueOf(sspog.SSPOGError.RST_NO_PERMISSION.getCode()), null));
            return completableFuture;
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return completableFuture;
        }
        int i = android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0);
        int i2 = android.provider.Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0);
        int code = sspog.SSPOGError.RST_POG_ATTEST_COTS_FAIL.getCode();
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        boolean z = this.isRootCheck;
        if (z || this.isDebuggingCheck || this.isEmulatorCheck || this.isHookCheck) {
            if (z) {
                code = sspog.SSPOGError.RST_POG_IS_ROOTED_ERROR.getCode();
                sSPOGSuggestedAction = new sspog.SSPOGSuggestedAction(null, false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_IS_ROOTED_MESSAGE), code, null, null);
                arrayList.add(sSPOGSuggestedAction);
            }
            if (this.isDebuggingCheck) {
                code = sspog.SSPOGError.RST_POG_IS_DEBUGGING_ERROR.getCode();
                sSPOGSuggestedAction = new sspog.SSPOGSuggestedAction(null, false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_IS_DEBUGGING_MESSAGE), code, null, null);
                arrayList.add(sSPOGSuggestedAction);
            }
            if (this.isEmulatorCheck) {
                int code2 = sspog.SSPOGError.RST_POG_IS_EMULATOR_ERROR.getCode();
                sspog.SSPOGSuggestedAction sSPOGSuggestedAction2 = new sspog.SSPOGSuggestedAction(null, false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_IS_EMULATOR_MESSAGE), code2, null, null);
                arrayList.add(sSPOGSuggestedAction2);
                code = code2;
                sSPOGSuggestedAction = sSPOGSuggestedAction2;
            }
            if (this.isHookCheck) {
                code = sspog.SSPOGError.RST_POG_IS_HOOKED_ERROR.getCode();
                sSPOGSuggestedAction = new sspog.SSPOGSuggestedAction(null, false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_IS_HOOKED_MESSAGE), code, null, null);
                arrayList.add(sSPOGSuggestedAction);
            }
        }
        if (i == 1) {
            code = sspog.SSPOGError.RST_POG_IS_DEVELOPER_OPTION_ENABLED.getCode();
            sSPOGSuggestedAction = new sspog.SSPOGSuggestedAction("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_DISABLE_DEVELOPER_OPTION_MESSAGE), code, null, null);
            arrayList.add(sSPOGSuggestedAction);
        }
        if (i2 == 1) {
            code = sspog.SSPOGError.RST_POG_IS_ADB_ENABLED.getCode();
            sSPOGSuggestedAction = new sspog.SSPOGSuggestedAction("android.settings.DEVICE_INFO_SETTINGS", false, context.getString(my.com.softspace.sspog.R.string.ATTESTATION_DISABLE_ADB_MESSAGE), code, null, null);
            arrayList.add(sSPOGSuggestedAction);
        }
        if (sSPOGSuggestedAction != null) {
            completableFuture.complete(new android.util.Pair<>(java.lang.Integer.valueOf(code), arrayList));
        }
        return completableFuture;
    }

    java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attest(final android.content.Context context, final java.util.HashMap<java.lang.String, java.lang.String> hashMap, final int i) {
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> completableFuture = this.runningAttestation.get();
        if (completableFuture != null) {
            return completableFuture;
        }
        synchronized (this.runningAttestation) {
            java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> completableFuture2 = this.runningAttestation.get();
            if (completableFuture2 != null) {
                return completableFuture2;
            }
            boolean z = this.isCinit;
            cinitIfRequired(context);
            final java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>>> attestMandatory = attestMandatory(context);
            if (attestMandatory.isDone()) {
                return attestMandatory;
            }
            if (!z) {
                startAttestJobService(context, true);
            }
            this.runningAttestation.set(attestMandatory);
            this.internalThreadPool.submit(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    sspog.SSPOGService.this.lambda$attest$11(hashMap, context, i, attestMandatory);
                }
            });
            return attestMandatory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attest$11(java.util.HashMap hashMap, android.content.Context context, int i, java.util.concurrent.CompletableFuture completableFuture) {
        java.lang.String str;
        if (hashMap != null && hashMap.size() > 0) {
            str = new org.json.JSONObject(hashMap).toString();
        } else {
            str = "";
        }
        int performAttestSync = performAttestSync(context, str, i);
        java.util.List<sspog.SSPOGSuggestedAction> list = this.suggestedAction;
        if (list == null) {
            list = null;
        }
        this.suggestedAction = null;
        if (list != null) {
            if (!list.isEmpty() && list.get(0).getErrorCode() != 0) {
                performAttestSync = list.get(0).getErrorCode();
            }
            sspog.SSPOG.rt();
        }
        this.runningAttestation.set(null);
        this.backgroundAttestPair = new android.util.Pair<>(java.lang.Integer.valueOf(performAttestSync), list);
        completableFuture.complete(new android.util.Pair(java.lang.Integer.valueOf(performAttestSync), list));
    }

    public int login(android.content.Context context, java.lang.String str) {
        my.com.softspace.auditlog.service.intf.AuditLogger auditLogger = this.auditLogger;
        if (auditLogger != null) {
            auditLogger.setUserUuid(str);
        }
        boolean z = this.isCinit;
        cinitIfRequired(context);
        if (!z) {
            startAttestJobService(context, false);
        }
        return sspog.SSPOG.li(context, this.provider, str);
    }

    public void logout(android.content.Context context) {
        my.com.softspace.auditlog.service.intf.AuditLogger auditLogger = this.auditLogger;
        if (auditLogger != null) {
            auditLogger.setUserUuid(null);
        }
        boolean z = this.isCinit;
        cinitIfRequired(context);
        if (!z) {
            startAttestJobService(context, false);
        }
        sspog.SSPOG.lo(context, this.provider);
    }

    public int confirmResetProvision(android.content.Context context, java.lang.String str) {
        return sspog.SSPOG.rp(context, this.provider, str);
    }

    public byte[] getMode() {
        byte[] decode;
        sspog.SSPOGProperties sSPOGProperties = this.sspogProperties;
        if (sSPOGProperties == null || android.text.TextUtils.isEmpty(sSPOGProperties.getAccesskey()) || (decode = android.util.Base64.decode(this.sspogProperties.getAccesskey(), 0)) == null || decode.length <= 32) {
            return null;
        }
        return java.util.Arrays.copyOfRange(decode, 32, decode.length);
    }

    public sspog.SSPOGServiceStatus getLastServiceStatus() {
        java.lang.String[] ls = sspog.SSPOG.ls();
        if (ls == null || ls.length == 0) {
            return new sspog.SSPOGServiceStatus("-1", null);
        }
        if (ls.length == 1) {
            return new sspog.SSPOGServiceStatus(ls[0], null);
        }
        return new sspog.SSPOGServiceStatus(ls[0], ls[1]);
    }

    public boolean getLastAttestStatus() {
        return sspog.SSPOG.lc();
    }

    public java.lang.String getServiceAppName() {
        return this.serviceAppName;
    }

    public java.lang.String getServiceAppVersion() {
        return this.serviceAppVersion;
    }

    public int generateRandom(java.lang.String str, long j) {
        sspog.SSPOG.g(str, j);
        return 0;
    }

    public java.lang.Object[] getPaymentCACert() {
        java.lang.String keyLoadingCACert = this.sspogProperties.getKeyLoadingCACert();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (keyLoadingCACert == null || keyLoadingCACert.isEmpty()) {
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_POG_INVALID_CA_CERTIFICATE.getCode()));
        } else {
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_OK.getCode()));
            arrayList.add(keyLoadingCACert);
        }
        return arrayList.toArray();
    }

    public int resetScrpID() {
        return sspog.SSPOG.rs();
    }

    public int resetAttestationCache() {
        return sspog.SSPOG.rt();
    }

    public my.com.softspace.sspog.SSPOGInstanceInfo getInstanceInfo() {
        my.com.softspace.sspog.SSPOGInstanceInfo sSPOGInstanceInfo = new my.com.softspace.sspog.SSPOGInstanceInfo();
        java.lang.Object[] gi = sspog.SSPOG.gi();
        if (gi != null && gi.length >= 2) {
            sSPOGInstanceInfo.setDeviceId((java.lang.String) gi[0]);
            sSPOGInstanceInfo.setInstanceId((java.lang.String) gi[1]);
            if (((java.lang.Long) gi[2]).longValue() != 0) {
                sSPOGInstanceInfo.setSessionId((java.lang.Long) gi[2]);
            }
            sSPOGInstanceInfo.setToken((java.lang.String) gi[3]);
            sSPOGInstanceInfo.setTokenSignature((java.lang.String) gi[4]);
            if (((java.lang.Long) gi[5]).longValue() != 0) {
                sSPOGInstanceInfo.setAttestId((java.lang.Long) gi[5]);
                return sSPOGInstanceInfo;
            }
            sSPOGInstanceInfo.setAttestId(0L);
        }
        return sSPOGInstanceInfo;
    }

    public sspog.SCRPInfo getScrpInfo() {
        if (this.provider.scrp() == null) {
            throw new java.lang.RuntimeException("SSPOGService hasn't been initialized prior to using it");
        }
        return this.provider.scrp().b();
    }

    public java.lang.Object[] cryptoOperation(android.content.Context context, boolean z, byte[] bArr, boolean z2) {
        if (!this.isCinit) {
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_NOT_INIT.getCode())};
        }
        java.lang.Object[] eo = sspog.SSPOG.eo(context, this.provider, z, bArr, z2);
        return (eo == null || eo.length < 3) ? new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_INVALID_STATE.getCode())} : eo;
    }

    public java.lang.Object[] hmacSHA256(android.content.Context context, byte[] bArr) {
        if (!this.isCinit) {
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_NOT_INIT.getCode())};
        }
        java.lang.Object[] ho = sspog.SSPOG.ho(context, this.provider, bArr);
        return (ho == null || ho.length < 3) ? new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_INVALID_STATE.getCode())} : ho;
    }

    public java.lang.Object[] cmac(android.content.Context context, byte[] bArr) {
        if (!this.isCinit) {
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_NOT_INIT.getCode())};
        }
        java.lang.Object[] co = sspog.SSPOG.co(context, this.provider, bArr);
        return (co == null || co.length < 3) ? new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_INVALID_STATE.getCode())} : co;
    }

    public java.lang.String getCurrentTOTP(android.content.Context context) {
        java.lang.Object[] gt;
        if (!this.isCinit || (gt = sspog.SSPOG.gt(context, this.provider, new java.util.Date().getTime())) == null || gt.length < 2 || ((java.lang.Integer) gt[0]).intValue() != sspog.SSPOGError.RST_OK.getCode()) {
            return null;
        }
        return (java.lang.String) gt[1];
    }

    public java.lang.String getVerifyTOTPURL() {
        if (!init) {
            return null;
        }
        my.com.softspace.sspog.SSPOGInstanceInfo instanceInfo = getInstanceInfo();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getSspogProperties().getHost());
        sb.append("/verify?did=");
        sb.append(instanceInfo.getDeviceId());
        sb.append("&iid=");
        sb.append(instanceInfo.getInstanceId());
        return sb.toString();
    }

    int setServiceAppInfo(java.lang.String str, java.lang.String str2) {
        this.serviceAppName = str;
        this.serviceAppVersion = str2;
        return 0;
    }

    byte[] getRandomSeed() {
        return this.provider.scrp().s();
    }

    java.security.SecureRandom getSecureRandom() {
        return this.secureRandom;
    }

    public sspog.SSPOGProperties getSspogProperties() {
        return this.sspogProperties;
    }

    public long getLatestAttestationTimeTaken() {
        return this.attestTime;
    }

    private void cinitIfRequired(android.content.Context context) {
        byte[] mode = getMode();
        byte b = 0;
        boolean z = mode != null && mode.length > 1 && (mode[1] & 2) == 2;
        this.isSecureData = (mode == null || mode.length <= 2 || mode[2] == 0) ? false : true;
        java.lang.String format = (mode == null || mode.length <= 1) ? java.lang.String.format("%02x", 1) : java.lang.String.format("%02x", java.lang.Byte.valueOf(mode[1]));
        boolean z2 = mode != null && mode.length >= 7 && mode[6] == 2;
        if (mode != null && mode.length > 9) {
            b = mode[9];
        }
        byte b2 = b;
        sspog.SSPOGProperties sSPOGProperties = this.sspogProperties;
        java.lang.String clientID = (sSPOGProperties == null || sSPOGProperties.getClientID() == null || this.sspogProperties.getClientID().length() <= 0) ? "" : this.sspogProperties.getClientID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1070300|");
        sb.append(this.sspogProperties.getHost());
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(this.sspogProperties.getKeyLoadingHost());
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(format);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(clientID);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        java.lang.String obj = sb.toString();
        if (this.isCinit) {
            return;
        }
        sspog.SSPOG.cinit(context, this.provider, z, z2, obj, 3, this.sspogProperties.getRefreshInterval(), b2);
        this.isCinit = true;
    }

    private void startAttestJobService(android.content.Context context, boolean z) {
        synchronized (this) {
            if (!this.isCinit) {
                cinitIfRequired(context);
            }
            jobRefreshInterval = this.sspogProperties.getRefreshInterval();
            jobRefreshMinInterval = this.sspogProperties.getMinimumRefreshInterval();
            if (checkifShouldPerformAttestation(context)) {
                if (z) {
                    start(context, false);
                } else {
                    start(context, true);
                }
            }
        }
    }

    @java.lang.Deprecated
    private int performAttestSync(android.content.Context context) {
        int a2;
        synchronized (this) {
            a2 = sspog.SSPOG.a(context, this.provider);
        }
        return a2;
    }

    private int performAttestSync(android.content.Context context, java.lang.String str, int i) {
        int ae;
        synchronized (this) {
            ae = sspog.SSPOG.ae(context, str, this.provider, i);
        }
        return ae;
    }

    private byte[] sha256(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    private void attestedAuditLogging(my.com.softspace.auditlog.service.intf.AuditLogger.Originator originator, int i, java.lang.String str, java.lang.Throwable th) {
        getAuditLogger().auditLogging("API_CALL", java.lang.String.valueOf(getInstanceInfo().getAttestId()), i, originator, str, th);
    }

    private java.lang.String formatMandatoryAttestRetForAuditLogging(java.util.List<sspog.SSPOGSuggestedAction> list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (list == null || list.size() <= 0) {
            obj = "UNDEFINED";
            obj2 = obj;
        } else {
            java.lang.Object obj3 = "false";
            java.lang.Object obj4 = obj3;
            for (sspog.SSPOGSuggestedAction sSPOGSuggestedAction : list) {
                if (sSPOGSuggestedAction.getIntent() != null) {
                    if (sSPOGSuggestedAction.getIntent().equals("android.settings.APPLICATION_DEVELOPMENT_SETTINGS")) {
                        obj4 = "true";
                    }
                    if (sSPOGSuggestedAction.getIntent().equals("android.settings.DEVICE_INFO_SETTINGS")) {
                        obj3 = "true";
                    }
                }
            }
            obj2 = obj3;
            obj = obj4;
        }
        return java.lang.String.format("Attestation failed with dasho check: {\"isRootDetected\": \"%s\",\"isDebuggingDetected\": \"%s\",\"isEmulatorDetected\": \"%s\",\"isHookDetected\": \"%s\",\"isDeveloperOptionEnabled\": \"%s\",\"isAdbEnabled\": \"%s\"}", this.isRootCheck ? "true" : "false", this.isDebuggingCheck ? "true" : "false", this.isEmulatorCheck ? "true" : "false", this.isHookCheck ? "true" : "false", obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: immediateInitFailLogging, reason: merged with bridge method [inline-methods] */
    public void lambda$immediateInitFailLogging$12(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        my.com.softspace.sspog.SSPOGInstanceInfo sSPOGInstanceInfo;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.internalThreadPool.submit(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    sspog.SSPOGService.this.lambda$immediateInitFailLogging$12(z, z2, z3, z4, z5, z6);
                }
            });
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("2.");
        sb.append(android.provider.Settings.Secure.getString(this.applicationContext.getContentResolver(), a.b.l));
        my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder initFileLogItemBuilder = new my.com.softspace.auditlog.vo.InitFailLogItem.InitFileLogItemBuilder(sb.toString(), this.applicationContext.getPackageName(), "ANDROID", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        my.com.softspace.auditlog.service.intf.AuditLogger auditLogger = null;
        try {
            sSPOGInstanceInfo = getInstanceInfo();
        } catch (java.lang.Exception unused) {
            sspog.SimpleLogger.e(TAG, "Failed to get instanceinfo", new java.lang.Object[0]);
            sSPOGInstanceInfo = null;
        }
        if (sSPOGInstanceInfo != null && !android.text.TextUtils.isEmpty(sSPOGInstanceInfo.getInstanceId())) {
            initFileLogItemBuilder.setInstanceId(sSPOGInstanceInfo.getInstanceId());
        }
        initFileLogItemBuilder.setAdbEnabled(z5).setDeveloperOptionEnabled(z6).setRootDetected(z).setDebuggingDetected(z2).setEmulatorDetected(z3).setHookDetected(z4);
        try {
            auditLogger = getAuditLogger();
        } catch (java.lang.Exception unused2) {
            sspog.SimpleLogger.e(TAG, "Failed to get instanceinfo", new java.lang.Object[0]);
        }
        if (auditLogger != null && !android.text.TextUtils.isEmpty(auditLogger.getUserUuid())) {
            initFileLogItemBuilder.setUserId(auditLogger.getUserUuid());
        }
        org.json.JSONObject prepareJSONObject = initFileLogItemBuilder.build().prepareJSONObject();
        if (prepareJSONObject != null) {
            java.lang.String jSONObject = prepareJSONObject.toString();
            if (android.text.TextUtils.isEmpty(jSONObject)) {
                return;
            }
            sspog.SimpleLogger.d(TAG, "request result: %d", httpRequest(1, "POST", "/at/initfail", jSONObject)[0]);
        }
    }

    java.lang.Object[] httpRequest(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            my.com.softspace.common.http.HttpRequest httpRequest = new my.com.softspace.common.http.HttpRequest(str2);
            switch (str.hashCode()) {
                case 70454:
                    if (str.equals("GET")) {
                        httpRequest.setMethod(my.com.softspace.common.http.HttpRequest.HttpMethod.GET);
                        break;
                    }
                    break;
                case 79599:
                    if (str.equals(com.datadog.android.internal.network.HttpSpec.Method.PUT)) {
                        httpRequest.setMethod(my.com.softspace.common.http.HttpRequest.HttpMethod.PUT);
                        break;
                    }
                    break;
                case 2461856:
                    if (str.equals("POST")) {
                        httpRequest.setMethod(my.com.softspace.common.http.HttpRequest.HttpMethod.POST);
                        break;
                    }
                    break;
                case 2012838315:
                    if (str.equals(com.datadog.android.internal.network.HttpSpec.Method.DELETE)) {
                        httpRequest.setMethod(my.com.softspace.common.http.HttpRequest.HttpMethod.DELETE);
                        break;
                    }
                    break;
            }
            httpRequest.setBody(str3);
            my.com.softspace.common.http.HttpResponse request = my.com.softspace.common.http.RestServiceFactory.restService().request(i, httpRequest);
            if (request.getContent() == null || request.getContent().length() <= 0) {
                return new java.lang.Object[]{java.lang.Integer.valueOf(request.getCode())};
            }
            return new java.lang.Object[]{java.lang.Integer.valueOf(request.getCode()), request.getContent()};
        } catch (java.lang.Exception unused) {
            return new java.lang.Object[]{408};
        }
    }

    java.lang.Object[] auditLogging(java.lang.String str, int i, int i2, java.lang.String str2) {
        return auditLogging("", str, i, i2, str2);
    }

    java.lang.Object[] auditLogging(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
        java.lang.String str4 = str2 == null ? null : str2;
        java.lang.String str5 = str3 == null ? null : str3;
        if (str == null) {
            str = "";
        }
        getInstance().getAuditLogger().auditLogging(str4, str, i, my.com.softspace.auditlog.service.intf.AuditLogger.Originator.valueOfInt(i2), str5);
        return new java.lang.Object[]{sspog.SSPOGError.RST_OK};
    }

    java.lang.Object[] attestTransactionLogging(long j, java.lang.String str) {
        try {
            getInstance().auditLogger.attestTransactionLogging(java.lang.Long.valueOf(j), str, java.lang.Long.valueOf(new java.util.Date().getTime()));
            return new java.lang.Object[]{sspog.SSPOGError.RST_OK};
        } catch (java.lang.IllegalArgumentException unused) {
            return new java.lang.Object[]{sspog.SSPOGError.RST_INVALID_ARGUMENT};
        } catch (java.lang.Exception unused2) {
            return new java.lang.Object[]{sspog.SSPOGError.RST_GENERAL_ERROR};
        }
    }

    java.lang.Object[] performCOTSAttestation(android.content.Context context, boolean z, byte[] bArr, boolean z2) {
        if (!hasPermission(context)) {
            sspog.SimpleLogger.e(TAG, "cots attestation : no permission", new java.lang.Object[0]);
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_NO_PERMISSION.getCode())};
        }
        sspog.SimpleLogger.d(TAG, "cots attestation : start", new java.lang.Object[0]);
        boolean z3 = (context.getApplicationInfo().flags & 2) != 0;
        return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_OK.getCode()), my.com.softspace.sspog.attest.AttestInfo.getPayload(context, z3, z, bArr, z2)};
    }

    java.lang.Object[] performAttestationCheckPackage(android.content.Context context, java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (context == null) {
            arrayList.add(-1);
            return arrayList.toArray();
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList.add(-1);
            return arrayList.toArray();
        }
        for (java.lang.String str : strArr) {
            if (android.text.TextUtils.isEmpty(str)) {
                arrayList.add(-1);
            }
            arrayList.add(java.lang.Integer.valueOf(isPackageInstalled(str, context) ? 1 : 0));
        }
        return arrayList.toArray();
    }

    java.lang.Object[] performAttestationCheckPackage(android.content.Context context, final java.lang.String str) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (context == null) {
            arrayList.add(-1);
            return arrayList.toArray();
        }
        if (str == null || str.isEmpty()) {
            arrayList.add(-1);
            return arrayList.toArray();
        }
        final java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        final android.content.pm.PackageManager packageManager = context.getPackageManager();
        packageManager.getInstalledApplications(128).forEach(new java.util.function.Consumer() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda15
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                sspog.SSPOGService.lambda$performAttestationCheckPackage$13(packageManager, str, stringBuffer, arrayList, (android.content.pm.ApplicationInfo) obj);
            }
        });
        if (!arrayList.isEmpty()) {
            return arrayList.toArray();
        }
        arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_OK.getCode()));
        arrayList.add(stringBuffer.toString());
        return arrayList.toArray();
    }

    static /* synthetic */ void lambda$performAttestationCheckPackage$13(android.content.pm.PackageManager packageManager, java.lang.String str, java.lang.StringBuffer stringBuffer, java.util.List list, android.content.pm.ApplicationInfo applicationInfo) {
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 4096);
            java.lang.String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (java.lang.String str2 : strArr) {
                    if (str2.equals(str)) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(packageInfo.packageName);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception while getting app permissions: ");
            sb.append((e.getMessage() == null || e.getMessage().length() <= 0) ? "" : e.getMessage());
            sspog.SimpleLogger.e(TAG, sb.toString(), e);
            list.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_GENERAL_ERROR.getCode()));
        }
    }

    java.lang.Object[] performPlayIntegrityAttestation(android.content.Context context, java.lang.String str) {
        sspog.SimpleLogger.d(TAG, "Starting Play Integrity Attestation service", new java.lang.Object[0]);
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(str);
        if (str.length() < 16) {
            sspog.SimpleLogger.e(TAG, "Nonce bytes less than 16 characters", new java.lang.Object[0]);
            throw new java.lang.IllegalArgumentException("nonce should be larger than 16 characters");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        sspog.SSPOGProperties sspogProperties = getInstance().getSspogProperties();
        if (sspogProperties == null) {
            sspog.SimpleLogger.e(TAG, "Properties file is not initialized", new java.lang.Object[0]);
            throw new java.lang.NullPointerException("Properties file is not initialized");
        }
        long parseLong = java.lang.Long.parseLong(sspogProperties.getPlayProjectNumber());
        long connectTimeout = sspogProperties.getConnectTimeout();
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            sspog.SimpleLogger.e(TAG, "Google play service is not available, with error returns: %d", java.lang.Integer.valueOf(isGooglePlayServicesAvailable));
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_GOOGLE_PLAY_SERVICE_ERROR.getCode()));
            return arrayList.toArray();
        }
        com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken = com.google.android.play.core.integrity.IntegrityManagerFactory.create(context).requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest.builder().setCloudProjectNumber(parseLong).setNonce(str).build());
        try {
            sspog.SimpleLogger.d(TAG, "Waiting for integrity attestation service with timeout: %d", java.lang.Long.valueOf(connectTimeout));
            com.google.android.play.core.integrity.IntegrityTokenResponse integrityTokenResponse = (com.google.android.play.core.integrity.IntegrityTokenResponse) com.google.android.gms.tasks.Tasks.await(requestIntegrityToken, connectTimeout, java.util.concurrent.TimeUnit.MILLISECONDS);
            sspog.SimpleLogger.d(TAG, "Integrity attestation returns result", new java.lang.Object[0]);
            if (requestIntegrityToken.isSuccessful()) {
                sspog.SimpleLogger.d(TAG, "Response is successful", new java.lang.Object[0]);
                if (integrityTokenResponse != null && !android.text.TextUtils.isEmpty(integrityTokenResponse.token())) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Integrity attestation token: ");
                    sb.append(integrityTokenResponse.token());
                    sspog.SimpleLogger.d(TAG, sb.toString(), new java.lang.Object[0]);
                    arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_OK.getCode()));
                    arrayList.add(integrityTokenResponse.token());
                }
                sspog.SimpleLogger.e(TAG, new java.lang.NullPointerException("Empty response on successful attestation (Shouldn't be happening)"), "Empty response on successful attestation (Shouldn't be happening)", new java.lang.Object[0]);
                arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
            } else {
                sspog.SimpleLogger.e(TAG, "An error occured while communicating with PlayIntegrityAPI", new java.lang.Object[0]);
                java.lang.Exception exception = requestIntegrityToken.getException();
                if (exception == null) {
                    sspog.SimpleLogger.e(TAG, "Double KO, error with null exception (Shouldn't be happening)", new java.lang.Object[0]);
                    arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
                } else if (exception instanceof com.google.android.gms.common.api.ApiException) {
                    sspog.SimpleLogger.e(TAG, exception, "Error with ApiException status code: %s", java.lang.Integer.valueOf(((com.google.android.gms.common.api.ApiException) exception).getStatusCode()));
                    arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
                }
            }
            sspog.SimpleLogger.d(TAG, "Returning response", new java.lang.Object[0]);
            return arrayList.toArray();
        } catch (java.lang.InterruptedException e) {
            sspog.SimpleLogger.e(TAG, e, "Exception happens while performing Safetynet Attestation", new java.lang.Object[0]);
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
            return arrayList.toArray();
        } catch (java.util.concurrent.ExecutionException e2) {
            sspog.SimpleLogger.e(TAG, e2, "Exception happens while performing Safetynet Attestation", new java.lang.Object[0]);
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
            return arrayList.toArray();
        } catch (java.util.concurrent.TimeoutException e3) {
            sspog.SimpleLogger.e(TAG, e3, "Timeout waiting for Safetynet Response.", new java.lang.Object[0]);
            arrayList.add(java.lang.Integer.valueOf(sspog.SSPOGError.RST_SAFETYNET_ERROR.getCode()));
            return arrayList.toArray();
        }
    }

    java.lang.Object[] performIsolatedProcessCheck(android.content.Context context) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(2);
        sspog.SimpleLogger.i(TAG, "[IsolatedProcessCheck] Starting Isolated Process Service", new java.lang.Object[0]);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) sspog.internal.SSPOGIsolatedService.class);
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) sspog.internal.SSPOGIsolatedNativeService.class);
        boolean z = true;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = new java.util.concurrent.atomic.AtomicBoolean(true);
        try {
            android.content.ServiceConnection serviceConnection = new android.content.ServiceConnection() { // from class: sspog.SSPOGService.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(android.content.ComponentName componentName) {
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                    java.lang.String str = "";
                    try {
                        sspog.SimpleLogger.i(sspog.SSPOGService.TAG, "[IsolatedProcessCheck] %s Service bound", componentName.getShortClassName() != null ? componentName.getShortClassName() : "");
                        if (componentName.getClassName().equals(sspog.internal.SSPOGIsolatedService.class.getName())) {
                            boolean isMagiskDetected = sspog.internal.IIsolatedVerifyingProcess.Stub.asInterface(iBinder).isMagiskDetected();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Is magisk detected in remote service: ");
                            sb.append(isMagiskDetected);
                            sspog.SimpleLogger.d(sspog.SSPOGService.TAG, sb.toString(), new java.lang.Object[0]);
                            atomicBoolean3.set(isMagiskDetected);
                            countDownLatch.countDown();
                            return;
                        }
                        if (componentName.getClassName().equals(sspog.internal.SSPOGIsolatedNativeService.class.getName())) {
                            boolean isMagiskNativelyDetected = sspog.internal.IIsolatedNativeVerifyingProcess.Stub.asInterface(iBinder).isMagiskNativelyDetected();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Is magisk detected in remote service (native): ");
                            sb2.append(isMagiskNativelyDetected);
                            sspog.SimpleLogger.d(sspog.SSPOGService.TAG, sb2.toString(), new java.lang.Object[0]);
                            atomicBoolean2.set(isMagiskNativelyDetected);
                            countDownLatch.countDown();
                        }
                    } catch (java.lang.Exception e) {
                        if (e.getMessage() != null && e.getMessage().length() > 0) {
                            str = e.getMessage();
                        }
                        sspog.SimpleLogger.e(sspog.SSPOGService.TAG, str, e);
                    }
                }
            };
            context.getApplicationContext().bindService(intent, serviceConnection, 1);
            context.getApplicationContext().bindService(intent2, serviceConnection, 1);
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e(TAG, (e.getLocalizedMessage() == null || e.getLocalizedMessage().length() <= 0) ? "" : e.getLocalizedMessage(), e);
        }
        try {
            countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (!atomicBoolean3.get() && !atomicBoolean2.get()) {
                z = false;
            }
            atomicBoolean.set(z);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[IsolatedProcessCheck] has Isolated Process detected blacklisted process: ");
            sb.append(atomicBoolean.get());
            sspog.SimpleLogger.d(TAG, sb.toString(), new java.lang.Object[0]);
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_OK.getCode()), java.lang.Boolean.valueOf(atomicBoolean.get())};
        } catch (java.lang.InterruptedException unused) {
            sspog.SimpleLogger.e(TAG, "[IsolatedProcessCheck] Isolated Process Service binding failed due to timeout", new java.lang.Object[0]);
            return new java.lang.Object[]{java.lang.Integer.valueOf(sspog.SSPOGError.RST_GENERAL_ERROR.getCode())};
        }
    }

    int cacheRecoverableAction(sspog.SSPOGSuggestedAction[] sSPOGSuggestedActionArr) {
        if (sSPOGSuggestedActionArr != null && sSPOGSuggestedActionArr.length > 0) {
            this.suggestedAction = java.util.Arrays.asList(sSPOGSuggestedActionArr);
            return 0;
        }
        this.suggestedAction = null;
        return 0;
    }

    private boolean isPackageInstalled(java.lang.String str, android.content.Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean checkifShouldPerformAttestation(android.content.Context context) {
        my.com.softspace.sspog.SSPOGInstanceInfo instanceInfo = getInstanceInfo();
        if ((getInstance().getMode() != null && getInstance().getMode().length > 1 && getInstance().getMode()[1] == 2 && this.isSecureData && sspog.SSPOG.ke(context, this.provider)) || android.text.TextUtils.isEmpty(instanceInfo.getToken()) || android.text.TextUtils.isEmpty(instanceInfo.getTokenSignature())) {
            sspog.SimpleLogger.d(TAG, "sspogInstanceInfo token || tokenSignature is null or empty", new java.lang.Object[0]);
            return true;
        }
        sspog.SimpleLogger.d(TAG, "sspogInstanceInfo pass", new java.lang.Object[0]);
        return false;
    }

    static void createPinPad(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long j = pinpad;
        if (j != 0) {
            sspog.SSPOG.pf(j);
        }
        pinpad = sspog.SSPOG.p(bArr, bArr2, bArr3);
    }

    static void createPinPad(android.widget.ImageView[] imageViewArr, byte[] bArr, java.util.function.Function<java.lang.Byte, android.graphics.Bitmap> function) {
        createPinPad(imageViewArr, bArr, function, false);
    }

    static void createPinPad(android.widget.ImageView[] imageViewArr, byte[] bArr, java.util.function.Function<java.lang.Byte, android.graphics.Bitmap> function, boolean z) {
        long j = pinpad;
        if (j != 0) {
            sspog.SSPOG.pf(j);
        }
        pinpad = sspog.SSPOG.pa(imageViewArr, bArr, function, z);
    }

    static void pushPin(byte b) {
        sspog.SSPOG.pe(pinpad, b);
    }

    public static byte[] confirmPin() {
        byte[] pc = sspog.SSPOG.pc(pinpad);
        long j = pinpad;
        if (j != 0) {
            sspog.SSPOG.pf(j);
        }
        pinpad = 0L;
        return pc;
    }

    public void confirmPinSDK() {
        byte[] pc = sspog.SSPOG.pc(pinpad);
        long j = pinpad;
        if (j != 0) {
            sspog.SSPOG.pf(j);
        }
        pinpad = 0L;
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, byte[]>> andSet = this.pinCVMResponse.getAndSet(null);
        if (andSet != null) {
            andSet.complete(android.util.Pair.create(0, pc));
        }
    }

    public void cancelPinSDK() {
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, byte[]>> andSet = this.pinCVMResponse.getAndSet(null);
        if (andSet != null) {
            andSet.complete(android.util.Pair.create(1, null));
        }
    }

    public void responseToScrpPIN(final int i, final byte[] bArr) {
        this.internalThreadPool.submit(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                sspog.SSPOGService.this.lambda$responseToScrpPIN$14(i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$responseToScrpPIN$14(int i, byte[] bArr) {
        this.provider.scrp().b(i, bArr);
    }

    static void popPin() {
        sspog.SSPOG.pd(pinpad);
    }

    static int pinLength() {
        return sspog.SSPOG.pl(pinpad);
    }

    public byte[] enterPIN(final android.app.Activity activity, my.com.softspace.pinpad.PinpadParam pinpadParam) {
        java.lang.Runnable runnable;
        android.util.Pair<java.lang.Integer, byte[]> pair;
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, byte[]>> completableFuture = new java.util.concurrent.CompletableFuture<>();
        java.util.concurrent.CompletableFuture<android.util.Pair<java.lang.Integer, byte[]>> andSet = this.pinCVMResponse.getAndSet(completableFuture);
        if (andSet != null) {
            andSet.completeExceptionally(new java.lang.InterruptedException());
        }
        final my.com.softspace.pinpad.PinpadView pinpadView = new my.com.softspace.pinpad.PinpadView(activity, pinpadParam);
        activity.runOnUiThread(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                sspog.SSPOGService.this.lambda$enterPIN$15(activity, pinpadView);
            }
        });
        try {
            try {
                pair = completableFuture.get(pinpadParam.getTimeout(), java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                runnable = new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        sspog.SSPOGService.this.lambda$enterPIN$16(pinpadView, activity);
                    }
                };
            }
            if (((java.lang.Integer) pair.first).intValue() == 0) {
                return (byte[]) pair.second;
            }
            runnable = new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    sspog.SSPOGService.this.lambda$enterPIN$16(pinpadView, activity);
                }
            };
            activity.runOnUiThread(runnable);
            return null;
        } finally {
            activity.runOnUiThread(new java.lang.Runnable() { // from class: sspog.SSPOGService$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    sspog.SSPOGService.this.lambda$enterPIN$16(pinpadView, activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enterPIN$15(android.app.Activity activity, my.com.softspace.pinpad.PinpadView pinpadView) {
        setScreenSecureFlagOn(activity, true);
        activity.addContentView(pinpadView, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enterPIN$16(my.com.softspace.pinpad.PinpadView pinpadView, android.app.Activity activity) {
        ((android.view.ViewGroup) pinpadView.getParent()).removeView(pinpadView);
        setScreenSecureFlagOn(activity, false);
    }

    public void onForeground(android.content.Context context) {
        sspog.SimpleLogger.i(TAG, "onForeground", new java.lang.Object[0]);
        this.sensorEntropy.start(context);
        if (this.isCinit && checkifShouldPerformAttestation(context)) {
            start(context, true);
        }
        if (init && this.sspogProperties.isEnableSSPOGAppLifecycleService() != null && this.sspogProperties.isEnableSSPOGAppLifecycleService().booleanValue()) {
            sspog.internal.SSPOGAppLifecycleService.startAppLifecycleService(context, this.sspogProperties.getAppIcon(), this.sspogProperties.foregroundServiceTitle(), this.sspogProperties.foregroundServiceContent());
        }
    }

    public void onBackground(android.content.Context context) {
        sspog.SimpleLogger.i(TAG, "onBackground", new java.lang.Object[0]);
        setRandomSeed(null);
        this.sensorEntropy.stop(context);
        if (getLastAttestStatus()) {
            return;
        }
        sspog.SimpleLogger.i(TAG, "onBackground - reset status", new java.lang.Object[0]);
        resetAttestationCache();
    }

    @Override // my.com.softspace.common.util.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        super.onActivityStarted(activity);
        if (this.rootClassName == null) {
            this.rootClassName = activity.getLocalClassName();
        }
    }

    @Override // my.com.softspace.common.util.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        super.onActivityResumed(activity);
    }

    @Override // my.com.softspace.common.util.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        super.onActivityStopped(activity);
    }

    @Override // my.com.softspace.common.util.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        super.onActivityDestroyed(activity);
        if (activity.getLocalClassName().equals(this.rootClassName)) {
            if (this.sspogProperties.isEnableSSPOGAppLifecycleService() == null || !this.sspogProperties.isEnableSSPOGAppLifecycleService().booleanValue()) {
                getInstance().stop(activity);
            }
        }
    }

    private void setScreenSecureFlagOn(android.app.Activity activity, boolean z) {
        if (z) {
            activity.getWindow().setFlags(8192, 8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }
}
