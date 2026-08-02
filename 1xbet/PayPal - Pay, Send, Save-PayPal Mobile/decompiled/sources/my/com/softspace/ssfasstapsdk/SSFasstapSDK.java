package my.com.softspace.ssfasstapsdk;

/* loaded from: classes17.dex */
public final class SSFasstapSDK extends my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback {
    private static final java.lang.String TAG = "SSFasstapSDK";
    private static boolean init = false;
    private static boolean isNfcListening = false;
    private static my.com.softspace.ssfasstapsdk.SSFasstapSDK mInstance;
    private static java.util.function.BiFunction<android.nfc.NfcAdapter, android.nfc.Tag, java.lang.Void> nfcCallback;
    private my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration config;
    private my.com.softspace.ssfasstapsdk.FasstapSDKInfo info;
    private java.lang.Integer mode;
    private my.com.softspace.ssfasstapsdk.pog.AttestationPOG pog;
    private my.com.softspace.ssfasstapsdk.transaction.Transaction transaction;
    private static final java.util.concurrent.ScheduledExecutorService nfcRetryExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    private static java.util.concurrent.ScheduledFuture<?> nfcRetryTask = null;
    private static final android.content.BroadcastReceiver nfcAdapterReceiver = new android.content.BroadcastReceiver() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent.getAction().equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
                if (intExtra == 1) {
                    my.com.softspace.ssfasstapsdk.SSFasstapSDK.getInstance();
                    my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighResolutionOutputSizeshNQ4ISI();
                } else if (intExtra == 3 && (context instanceof android.app.Activity)) {
                    my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighSpeedVideoFpsRangesFor((android.app.Activity) context, true);
                }
            }
        }
    };
    private boolean isDukptSupported = false;
    private java.lang.ref.WeakReference<android.content.Context> context = null;
    private final java.lang.Object syncLock = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CardScheme {
        public static final int ALL = 4095;
        public static final int AMEX = 16;
        public static final int CUP = 32;
        public static final int DISCOVER = 128;
        public static final int EFTPOS = 1024;
        public static final int JCB = 8;
        public static final int JCBDC = 512;
        public static final int MADA = 256;
        public static final int MASTER = 4;
        public static final int MCCS = 1;
        public static final int NETS = 2048;
        public static final int UNKNOWN = 0;
        public static final int VCCS = 64;
        public static final int VISA = 2;
    }

    public final void onBackground(android.content.Context context) {
    }

    public interface EncryptionModel {
        default java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return new java.lang.Object[]{0, bArr2};
        }

        default java.lang.Object[] hmacSHA256(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[32]};
        }

        default java.lang.Object[] cmac(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[16]};
        }
    }

    private SSFasstapSDK() {
    }

    public static my.com.softspace.ssfasstapsdk.SSFasstapSDK getInstance() {
        if (!init) {
            throw new java.lang.IllegalStateException();
        }
        return mInstance;
    }

    public static my.com.softspace.ssfasstapsdk.SSFasstapSDK init(android.content.Context context, my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration fasstapSDKConfiguration) {
        return init(context, fasstapSDKConfiguration, new my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK.1
        });
    }

    public static my.com.softspace.ssfasstapsdk.SSFasstapSDK init(android.content.Context context, my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration fasstapSDKConfiguration, final my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel encryptionModel) {
        final android.content.Context context2 = (android.content.Context) new java.lang.ref.WeakReference(context).get();
        if (context2 == null || fasstapSDKConfiguration == null || encryptionModel == null) {
            throw new java.lang.IllegalArgumentException("Parameters must not be null");
        }
        my.com.softspace.ssfasstapsdk.SSFasstapSDK sSFasstapSDK = new my.com.softspace.ssfasstapsdk.SSFasstapSDK();
        mInstance = sSFasstapSDK;
        sSFasstapSDK.config = fasstapSDKConfiguration;
        if (fasstapSDKConfiguration.getEnableAttestation().booleanValue()) {
            mInstance.pog = new my.com.softspace.ssfasstapsdk.internal.pog.StandardPOGHandler(context2, fasstapSDKConfiguration.getPogConfiguration(), fasstapSDKConfiguration.getSecureRandom());
        }
        byte[] mode = getMode(fasstapSDKConfiguration);
        my.com.softspace.reader.TEEReaderEngine.init(fasstapSDKConfiguration.getSecureRandom(), fasstapSDKConfiguration.getIsProductionMode().booleanValue(), new my.com.softspace.reader.TEEReaderEngine.EncryptionModel() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK.3
            @Override // my.com.softspace.reader.TEEReaderEngine.EncryptionModel
            public java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
                return my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel.this.cipherOperation(z, bArr, z2);
            }

            @Override // my.com.softspace.reader.TEEReaderEngine.EncryptionModel
            public java.lang.Object[] hmacSHA256(byte[] bArr) {
                return my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel.this.hmacSHA256(bArr);
            }

            @Override // my.com.softspace.reader.TEEReaderEngine.EncryptionModel
            public java.lang.Object[] cmac(byte[] bArr) {
                return my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel.this.cmac(bArr);
            }
        }, fasstapSDKConfiguration.getEnableAttestation().booleanValue() && (mode == null || mode.length < 3 || mode[2] != 0), new my.com.softspace.ssfasstapsdk.internal.FasstapSDKLogger(false), new my.com.softspace.reader.TEEReaderEngine.NFCProvider() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK.2
            @Override // my.com.softspace.reader.TEEReaderEngine.NFCProvider
            public void enableListening(android.content.Context context3, java.util.function.BiFunction<android.nfc.NfcAdapter, android.nfc.Tag, java.lang.Void> biFunction) {
                if (context3 instanceof android.app.Activity) {
                    my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighSpeedVideoFpsRangesFor((android.app.Activity) context3, false);
                }
                my.com.softspace.ssfasstapsdk.SSFasstapSDK.nfcCallback = biFunction;
                sspog.SimpleLogger.d(my.com.softspace.ssfasstapsdk.SSFasstapSDK.TAG, "enableListening", new java.lang.Object[0]);
            }

            @Override // my.com.softspace.reader.TEEReaderEngine.NFCProvider
            public void disableListening() {
                my.com.softspace.ssfasstapsdk.SSFasstapSDK.nfcCallback = null;
                sspog.SimpleLogger.d(my.com.softspace.ssfasstapsdk.SSFasstapSDK.TAG, "disableListening", new java.lang.Object[0]);
            }
        });
        byte[] mode2 = getMode(fasstapSDKConfiguration);
        if (mode2 == null || mode2.length <= 0) {
            throw new java.lang.IllegalArgumentException("Invalid access key.");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < mode2.length; i++) {
            if (i == 0 || i == 3 || i == 4 || i == 5) {
                allocate.put(mode2[i]);
            }
        }
        int i2 = allocate.getInt(0);
        if (i2 <= 0 || i2 > 16383) {
            throw new java.lang.IllegalArgumentException("Invalid access key.");
        }
        mInstance.mode = java.lang.Integer.valueOf(i2);
        mInstance.transaction = new my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler(i2);
        my.com.softspace.ssfasstapsdk.SSFasstapSDK sSFasstapSDK2 = mInstance;
        sSFasstapSDK2.info = my.com.softspace.ssfasstapsdk.FasstapSDKInfo.getHighSpeedVideoFpsRangesFor(context2, sSFasstapSDK2.pog);
        if (!init) {
            androidx.view.ProcessLifecycleOwner.get().getLifecycle().addObserver(new androidx.view.LifecycleEventObserver() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK$$ExternalSyntheticLambda0
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    my.com.softspace.ssfasstapsdk.SSFasstapSDK.Camera2StreamConfigurationMap(context2, event);
                }
            });
            if (context2 instanceof android.app.Application) {
                ((android.app.Application) context2).registerActivityLifecycleCallbacks(mInstance);
            } else {
                ((android.app.Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(mInstance);
            }
        }
        init = true;
        return mInstance;
    }

    /* renamed from: my.com.softspace.ssfasstapsdk.SSFasstapSDK$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(android.content.Context context, androidx.lifecycle.Lifecycle.Event event) {
        int i = my.com.softspace.ssfasstapsdk.SSFasstapSDK.AnonymousClass5.getHighResolutionOutputSizeshNQ4ISI[event.ordinal()];
        if (i == 1) {
            mInstance.onForeground(context);
        } else if (i == 2) {
            mInstance.onBackground(context);
        } else {
            if (i != 3) {
                return;
            }
            nfcRetryExecutor.shutdown();
        }
    }

    public final my.com.softspace.ssfasstapsdk.transaction.Transaction getTransaction() {
        return this.transaction;
    }

    public final my.com.softspace.ssfasstapsdk.pog.AttestationPOG getAttestationPog() {
        return this.pog;
    }

    public final my.com.softspace.ssfasstapsdk.FasstapSDKInfo getFasstapSDKInfo(android.content.Context context) {
        my.com.softspace.ssfasstapsdk.FasstapSDKInfo fasstapSDKInfo = this.info;
        if (fasstapSDKInfo != null) {
            return fasstapSDKInfo;
        }
        if (context == null || !hasRequiredPermission(context)) {
            return null;
        }
        my.com.softspace.ssfasstapsdk.FasstapSDKInfo highSpeedVideoFpsRangesFor = my.com.softspace.ssfasstapsdk.FasstapSDKInfo.getHighSpeedVideoFpsRangesFor(context, this.pog);
        this.info = highSpeedVideoFpsRangesFor;
        return highSpeedVideoFpsRangesFor;
    }

    public final boolean isDukptSupported() {
        return this.isDukptSupported;
    }

    public final int getCardSchemeSupported() {
        int i = (this.mode.intValue() & 6) == 6 ? 2 : 0;
        if ((this.mode.intValue() & 24) == 24) {
            i |= 4;
        }
        if ((this.mode.intValue() & 1) == 1) {
            i |= 1;
        }
        if ((this.mode.intValue() & 32) == 32) {
            i |= 8;
        }
        if ((this.mode.intValue() & 64) == 64) {
            i |= 16;
        }
        if ((this.mode.intValue() & 128) == 128) {
            i |= 32;
        }
        if ((this.mode.intValue() & 256) == 256) {
            i |= 64;
        }
        if ((this.mode.intValue() & 512) == 512) {
            i |= 128;
        }
        if ((this.mode.intValue() & 1024) == 1024) {
            i |= 256;
        }
        if ((this.mode.intValue() & 2048) == 2048) {
            i |= 512;
        }
        if ((this.mode.intValue() & 4096) == 4096) {
            i |= 1024;
        }
        return (this.mode.intValue() & 8192) == 8192 ? i | 2048 : i;
    }

    public static boolean hasRequiredPermission(android.content.Context context) {
        return !mInstance.config.getEnableAttestation().booleanValue() || sspog.SSPOGService.hasPermission(context);
    }

    public static boolean hasGrantPermission(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean requestPermissionIfRequired(android.app.Activity activity, int i) {
        if (!mInstance.config.getEnableAttestation().booleanValue()) {
            return true;
        }
        java.util.List asList = java.util.Arrays.asList(sspog.SSPOGService.getEssentialPermissions());
        if (hasRequiredPermission(activity)) {
            return true;
        }
        activity.requestPermissions((java.lang.String[]) asList.stream().toArray(new java.util.function.IntFunction() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK$$ExternalSyntheticLambda3
            @Override // java.util.function.IntFunction
            public final java.lang.Object apply(int i2) {
                return my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighSpeedVideoSizes(i2);
            }
        }), i);
        return false;
    }

    static /* synthetic */ java.lang.String[] getHighSpeedVideoSizes(int i) {
        return new java.lang.String[i];
    }

    public static boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragment, int i) {
        if (!mInstance.config.getEnableAttestation().booleanValue()) {
            return true;
        }
        java.util.List asList = java.util.Arrays.asList(sspog.SSPOGService.getEssentialPermissions());
        if (hasRequiredPermission(fragment.getContext())) {
            return true;
        }
        fragment.requestPermissions((java.lang.String[]) asList.stream().toArray(new java.util.function.IntFunction() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK$$ExternalSyntheticLambda4
            @Override // java.util.function.IntFunction
            public final java.lang.Object apply(int i2) {
                return my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighSpeedVideoFpsRangesFor(i2);
            }
        }), i);
        return false;
    }

    static /* synthetic */ java.lang.String[] getHighSpeedVideoFpsRangesFor(int i) {
        return new java.lang.String[i];
    }

    public static boolean isRunningOnRemoteProcess(android.content.Context context) {
        return sspog.SSPOGUtil.isRunningOnSubProcess(context);
    }

    public static byte[] getMode(my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration fasstapSDKConfiguration) {
        byte[] decode;
        if (fasstapSDKConfiguration.getPogConfiguration() == null || android.text.TextUtils.isEmpty(fasstapSDKConfiguration.getPogConfiguration().getAccesskey()) || (decode = android.util.Base64.decode(fasstapSDKConfiguration.getPogConfiguration().getAccesskey(), 0)) == null || decode.length <= 32) {
            return null;
        }
        return java.util.Arrays.copyOfRange(decode, 32, decode.length);
    }

    private static java.lang.Boolean getHighSpeedVideoFpsRanges(final android.nfc.NfcAdapter nfcAdapter, android.app.Activity activity, int i) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (activity.isDestroyed() || nfcAdapter == null) {
            isNfcListening = false;
            return null;
        }
        if (nfcAdapter.isEnabled()) {
            sspog.SimpleLogger.i(TAG, "Start listening NFC", new java.lang.Object[0]);
            try {
                nfcAdapter.enableReaderMode(activity, new android.nfc.NfcAdapter.ReaderCallback() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK$$ExternalSyntheticLambda1
                    @Override // android.nfc.NfcAdapter.ReaderCallback
                    public final void onTagDiscovered(android.nfc.Tag tag) {
                        my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighResolutionOutputSizeshNQ4ISI(nfcAdapter, tag);
                    }
                }, i, null);
                isNfcListening = true;
                return java.lang.Boolean.TRUE;
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("setNfcReaderModeCallback :: ");
                sb.append(e.getMessage());
                sspog.SimpleLogger.e(TAG, sb.toString(), new java.lang.Object[0]);
                return bool;
            }
        }
        isNfcListening = false;
        return bool;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(android.nfc.NfcAdapter nfcAdapter, android.nfc.Tag tag) {
        java.util.function.BiFunction<android.nfc.NfcAdapter, android.nfc.Tag, java.lang.Void> biFunction = nfcCallback;
        if (biFunction != null) {
            biFunction.apply(nfcAdapter, tag);
        } else {
            nfcAdapter.ignore(tag, 1000, null, null);
            sspog.SimpleLogger.i(TAG, "NFC detected, ignore tag...", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRangesFor(final android.app.Activity activity, boolean z) {
        synchronized (my.com.softspace.ssfasstapsdk.SSFasstapSDK.class) {
            final android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(activity);
            final int i = (z ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE : 259) | 128;
            if (java.lang.Boolean.FALSE.equals(getHighSpeedVideoFpsRanges(defaultAdapter, activity, i))) {
                sspog.SimpleLogger.i(TAG, "NFC not available, retrying in 1 second", new java.lang.Object[0]);
                java.util.concurrent.ScheduledFuture<?> scheduledFuture = nfcRetryTask;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    return;
                }
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = nfcRetryExecutor;
                if (!scheduledExecutorService.isShutdown()) {
                    nfcRetryTask = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: my.com.softspace.ssfasstapsdk.SSFasstapSDK$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            my.com.softspace.ssfasstapsdk.SSFasstapSDK.getHighResolutionOutputSizeshNQ4ISI(defaultAdapter, activity, i);
                        }
                    }, 1L, java.util.concurrent.TimeUnit.SECONDS);
                } else {
                    getInstance();
                    getHighResolutionOutputSizeshNQ4ISI();
                    synchronized (getInstance().syncLock) {
                        nfcRetryTask = null;
                    }
                }
            }
        }
    }

    public final void onForeground(android.content.Context context) {
        boolean z = context instanceof android.app.Activity;
        if (z) {
            if (z) {
                onActivityResumed((android.app.Activity) context);
                return;
            }
            throw new java.lang.IllegalArgumentException("Context must be activity context");
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        super.onActivityStarted(activity);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onActivityStarted = ");
        sb.append(activity.getLocalClassName());
        sspog.SimpleLogger.i(TAG, sb.toString(), new java.lang.Object[0]);
    }

    @Override // my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        super.onActivityResumed(activity);
        this.context = new java.lang.ref.WeakReference<>(activity);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onActivityResumed = ");
        sb.append(activity.getLocalClassName());
        sspog.SimpleLogger.i(TAG, sb.toString(), new java.lang.Object[0]);
        getHighSpeedVideoFpsRangesFor((android.app.Activity) this.context.get(), true);
        try {
            this.context.get().registerReceiver(nfcAdapterReceiver, new android.content.IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onActivityPaused = ");
        sb.append(activity.getLocalClassName());
        sspog.SimpleLogger.i(TAG, sb.toString(), new java.lang.Object[0]);
        super.onActivityPaused(activity);
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.context;
        if (weakReference != null) {
            try {
                weakReference.get().unregisterReceiver(nfcAdapterReceiver);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        super.onActivityStopped(activity);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onActivityStopped = ");
        sb.append(activity.getLocalClassName());
        sspog.SimpleLogger.i(TAG, sb.toString(), new java.lang.Object[0]);
        synchronized (my.com.softspace.ssfasstapsdk.SSFasstapSDK.class) {
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null && defaultAdapter.isEnabled() && !activity.isDestroyed()) {
                sspog.SimpleLogger.i(TAG, "Stop listening NFC", new java.lang.Object[0]);
                isNfcListening = false;
                defaultAdapter.disableReaderMode(activity);
            }
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.common.SimpleActivityLifecycleCallback, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        super.onActivityDestroyed(activity);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onActivityDestroyed = ");
        sb.append(activity.getLocalClassName());
        sspog.SimpleLogger.i(TAG, sb.toString(), new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighResolutionOutputSizeshNQ4ISI() {
        if (getInstance().getTransaction() == null || !(getInstance().getTransaction() instanceof my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler)) {
            return;
        }
        my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler standardSSTransactionHandler = (my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler) getInstance().getTransaction();
        if (standardSSTransactionHandler.getTransactionCallback() != null) {
            standardSSTransactionHandler.getTransactionCallback().onCardEvent(-1);
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(android.nfc.NfcAdapter nfcAdapter, android.app.Activity activity, int i) {
        java.lang.Boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(nfcAdapter, activity, i);
        if (highSpeedVideoFpsRanges == null || java.lang.Boolean.FALSE.equals(highSpeedVideoFpsRanges)) {
            getInstance();
            getHighResolutionOutputSizeshNQ4ISI();
        }
        synchronized (getInstance().syncLock) {
            nfcRetryTask = null;
        }
    }
}
