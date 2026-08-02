package com.visa.cbp;

/* loaded from: classes16.dex */
public class getName implements com.visa.cbp.sdk.reader.TapToEnroll {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static final int ArtificialStackFrames = 2;
    static com.visa.cbp.setPhoneNumber Camera2StreamConfigurationMap = null;
    private static long CoroutineDebuggingKt = 0;
    private static final byte[] _BOUNDARY;
    private static int _CREATION = 0;

    /* renamed from: a, reason: collision with root package name */
    private static android.content.Context f6677a = null;
    private static byte[] accessartificialFrame = null;
    private static android.app.Activity b = null;
    private static final byte c = 0;
    private static final int coroutineBoundary = 3;
    private static java.lang.String coroutineCreation = null;
    private static final byte[] getARTIFICIAL_FRAME_PACKAGE_NAME;
    static android.os.AsyncTask.Status getHighResolutionOutputSizeshNQ4ISI = null;
    static final java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRanges;
    static com.visa.cbp.getName getHighSpeedVideoSizes = null;
    private static int getOutputSizeshNQ4ISI = 0;
    private static char[] getValidOutputFormatsForInputhNQ4ISI = null;
    private static int isOutputSupportedFor = 0;
    private static final int isOutputSupportedForhNQ4ISI = 4;
    private static final java.lang.String kernelVersion;
    private static final byte toString = 1;
    private static int unwrapAs;
    private byte[] AMEXKernel;
    private java.security.MessageDigest AMEXKernelCallback;
    private java.security.PublicKey AMEXKernelJNI;
    private byte[] AMEXKernelProvider;
    private java.security.PublicKey AMEXKernela;
    private byte[] d;
    private final java.lang.String exchange;
    private java.security.KeyFactory free;
    private com.visa.cbp.sdk.facade.data.VisaCAKeys freeTransaction;
    byte[] getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizesFor;
    byte[] getInputFormats;
    byte[] getInputSizeshNQ4ISI;
    byte[] getOutputFormats;
    byte[] getOutputMinFrameDuration;
    byte[] getOutputMinFrameDurationlomOqCM;
    byte[] getOutputSizes;
    byte[] getOutputStallDuration;
    byte[] getOutputStallDurationlomOqCM;
    private byte[] init;
    private byte[] l;
    private final java.lang.String newContext;
    private final java.lang.String release;
    private java.security.PublicKey requestGoOnline;
    private byte[] requestPINEntry;
    private android.database.sqlite.SQLiteDatabase resetTransaction;
    private final java.lang.String rsaCipher;
    private final java.lang.String setup;
    private java.security.PublicKey sha1;
    private com.visa.cbp.setDeviceModel start;
    private com.visa.cbp.sdk.facade.RetrievePanCallback startTransaction;
    private android.os.Handler updateUI;
    private byte[] version;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(byte b2, int i, byte b3, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 106 - b2;
        int i4 = 4 - (b3 * 2);
        int i5 = i * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i3 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i4;
            i4 = bArr[i4];
            i3 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputSizeshNQ4ISI = 0;
        isOutputSupportedFor = 1;
        unwrapAs = 0;
        _CREATION = 1;
        getHighSpeedVideoFpsRanges();
        kernelVersion = "getName";
        accessartificialFrame = null;
        _BOUNDARY = new byte[]{Byte.MIN_VALUE, -88, 0, 0, 0, -125, 2};
        getARTIFICIAL_FRAME_PACKAGE_NAME = new byte[]{0, -78, 1, com.google.common.base.Ascii.FF, 0};
        getHighSpeedVideoFpsRanges = new java.util.ArrayList<>(java.util.Arrays.asList(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_VISA_A0000000031010, "A0000000980840", my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_VISA_A0000000032010, "A0000000032020", "A0000000033010", "A00000000307010001"));
        coroutineCreation = null;
        f6677a = null;
        getHighSpeedVideoSizes = null;
        Camera2StreamConfigurationMap = null;
        getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.PENDING;
        int i = unwrapAs + 43;
        _CREATION = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String ConfirmReplenishRequest() {
        int i = unwrapAs + 111;
        _CREATION = i % 128;
        java.lang.String str = coroutineCreation;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.visa.cbp.getName ReplenishAckRequest() {
        int i = _CREATION + 13;
        unwrapAs = i % 128;
        if (i % 2 == 0) {
            return getHighSpeedVideoSizes;
        }
        throw null;
    }

    public static com.visa.cbp.getName valueOf(android.content.Context context, android.app.Activity activity, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, com.visa.cbp.sdk.facade.RetrievePanCallback retrievePanCallback, android.os.Handler handler) {
        getHighSpeedVideoSizes = new com.visa.cbp.getName(context, activity, sQLiteDatabase, publicKey, retrievePanCallback, handler);
        Camera2StreamConfigurationMap = new com.visa.cbp.setPhoneNumber();
        com.visa.cbp.getName getname = getHighSpeedVideoSizes;
        int i = _CREATION + 117;
        unwrapAs = i % 128;
        if (i % 2 == 0) {
            return getname;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.visa.cbp.sdk.reader.TapToEnroll
    public void stopReader() {
        unwrapAs = (_CREATION + 57) % 128;
        getHighResolutionOutputSizeshNQ4ISI(false, b);
        getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
        this.updateUI.removeCallbacksAndMessages(null);
        if (ConfirmReplenishRequest() == null) {
            this.startTransaction.onError(0, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName));
            return;
        }
        _CREATION = (unwrapAs + 23) % 128;
        this.startTransaction.onResult(ConfirmReplenishRequest());
        unwrapAs = (_CREATION + 95) % 128;
    }

    getName(android.content.Context context, android.app.Activity activity, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, com.visa.cbp.sdk.facade.RetrievePanCallback retrievePanCallback, android.os.Handler handler) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((-16777212) - android.graphics.Color.rgb(0, 0, 0), android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (47705 - (android.os.Process.myPid() >> 22)), objArr);
        this.exchange = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.MotionEvent.axisFromString("") + 38905), objArr2);
        this.newContext = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, 8 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.os.Process.myPid() >> 22), objArr3);
        this.setup = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 39, android.graphics.ImageFormat.getBitsPerPixel(0) + 22, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr4);
        this.rsaCipher = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, 60 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""), objArr5);
        this.release = ((java.lang.String) objArr5[0]).intern();
        this.getHighSpeedVideoSizesFor = new byte[]{0, 0, 0, 0, 0, 1};
        this.getOutputMinFrameDuration = new byte[]{0, 0, 0, 0, 0, 0};
        this.getHighSpeedVideoFpsRangesFor = new byte[]{8, 64};
        this.getOutputStallDuration = new byte[]{8, 64};
        this.getInputFormats = new byte[]{2};
        this.getOutputStallDurationlomOqCM = new byte[]{35, Byte.MIN_VALUE, 0, 0};
        this.getOutputMinFrameDurationlomOqCM = new byte[]{0};
        this.getOutputSizes = new byte[]{7};
        this.getOutputFormats = new byte[]{0, 0, 0, 0};
        this.getInputSizeshNQ4ISI = new byte[]{0, 0, 0};
        this.start = null;
        this.l = null;
        this.freeTransaction = null;
        this.AMEXKernelProvider = null;
        this.version = null;
        this.d = null;
        this.AMEXKernel = null;
        this.init = null;
        f6677a = context;
        b = activity;
        this.resetTransaction = sQLiteDatabase;
        this.sha1 = publicKey;
        this.startTransaction = retrievePanCallback;
        this.updateUI = handler;
        if (sQLiteDatabase == null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setLocale);
        }
        coroutineCreation = null;
        this.start = com.visa.cbp.setDeviceModel.Camera2StreamConfigurationMap(context);
        getHighResolutionOutputSizeshNQ4ISI(true, b);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(1372 - android.text.TextUtils.getOffsetAfter("", 0), 73 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr6);
        this.freeTransaction = (com.visa.cbp.sdk.facade.data.VisaCAKeys) gson.fromJson(((java.lang.String) objArr6[0]).intern(), com.visa.cbp.sdk.facade.data.VisaCAKeys.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r5.length() <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        com.visa.cbp.getName.coroutineCreation = getHighSpeedVideoFpsRangesFor(com.visa.cbp.getName.f6677a, r4.resetTransaction, r4.sha1, r5.getBytes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r5 = com.visa.cbp.getName._CREATION + 101;
        com.visa.cbp.getName.unwrapAs = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        com.visa.cbp.getName.getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
        stopReader();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        return com.visa.cbp.getName.coroutineCreation;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        com.visa.cbp.getName.getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
        stopReader();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        com.visa.cbp.getName.getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor, r5.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.lang.String BuildConfig(android.nfc.Tag tag) {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        int i = _CREATION + 17;
        unwrapAs = i % 128;
        try {
            if (i % 2 != 0) {
                getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.RUNNING;
                this.start.getHighSpeedVideoFpsRangesFor(tag);
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(b);
                getHighResolutionOutputSizeshNQ4ISI(true, b);
            } else {
                getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.RUNNING;
                this.start.getHighSpeedVideoFpsRangesFor(tag);
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(b);
                getHighResolutionOutputSizeshNQ4ISI(false, b);
            }
            getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
            getHighResolutionOutputSizeshNQ4ISI(false, b);
            com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getLastName;
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException | java.lang.IllegalArgumentException e) {
            getHighResolutionOutputSizeshNQ4ISI = android.os.AsyncTask.Status.FINISHED;
            getHighResolutionOutputSizeshNQ4ISI(false, b);
            throw e;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z, android.app.Activity activity) throws java.lang.IllegalArgumentException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
        int i = _CREATION + 91;
        unwrapAs = i % 128;
        if (i % 2 == 0) {
            if (f6677a != null) {
                com.visa.cbp.DeviceInfo.DeviceIDType.getHighSpeedVideoFpsRanges().getHighSpeedVideoFpsRangesFor(z, android.nfc.NfcAdapter.getDefaultAdapter(f6677a), activity);
                unwrapAs = (_CREATION + 101) % 128;
            }
            if (z) {
                return;
            }
            this.start.getHighSpeedVideoFpsRangesFor();
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0261, code lost:
    
        r15 = com.visa.cbp.setDeviceCerts.getPhone;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026a, code lost:
    
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getPhone);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026b, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0231, code lost:
    
        r15 = com.visa.cbp.setDeviceCerts.getEmail;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023a, code lost:
    
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023b, code lost:
    
        r15 = com.visa.cbp.setDeviceCerts.getEmail;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0244, code lost:
    
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0245, code lost:
    
        r15 = com.visa.cbp.setDeviceCerts.getPhone;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024e, code lost:
    
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getPhone);
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity) {
        byte[] highResolutionOutputSizeshNQ4ISI;
        java.lang.String concat;
        java.lang.String highSpeedVideoSizes;
        byte[] bArr = new byte[2];
        try {
            com.visa.cbp.capitalize capitalizeVar = new com.visa.cbp.capitalize();
            capitalizeVar.getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges);
            byte[] highSpeedVideoFpsRangesFor = capitalizeVar.getHighSpeedVideoFpsRangesFor(this.start);
            this.l = highSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor);
            _CREATION = (unwrapAs + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            java.lang.String str = null;
            while (true) {
                byte[] bArr2 = this.l;
                if (bArr2 != null && bArr2.length > 2) {
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2);
                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2);
                    if (Camera2StreamConfigurationMap2 == null) {
                        break;
                    }
                    int i = _CREATION + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    unwrapAs = i % 128;
                    if (i % 2 == 0) {
                        if (Camera2StreamConfigurationMap2.length <= 2) {
                            break;
                        }
                        highResolutionOutputSizeshNQ4ISI = this.start.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                        }
                    } else {
                        if (Camera2StreamConfigurationMap2.length <= 2) {
                            break;
                        }
                        highResolutionOutputSizeshNQ4ISI = this.start.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                            com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getPhone;
                            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getPhone);
                        }
                        _CREATION = (unwrapAs + 79) % 128;
                        java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, (short) (highResolutionOutputSizeshNQ4ISI.length - 2), bArr, 0, 2);
                        if (Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr, 0, new byte[]{-112, 0}, 0, 2)) {
                            byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, capitalizeVar);
                            if (highSpeedVideoSizes2 != null) {
                                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2);
                                byte[] highResolutionOutputSizeshNQ4ISI2 = this.start.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes2);
                                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI2);
                                if (highResolutionOutputSizeshNQ4ISI2 == null) {
                                    com.visa.cbp.setDeviceCerts setdevicecerts2 = com.visa.cbp.setDeviceCerts.getEmail;
                                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
                                }
                                java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI2, (short) (highResolutionOutputSizeshNQ4ISI2.length - 2), bArr, 0, 2);
                                if (Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr, 0, new byte[]{-112, 0}, 0, 2)) {
                                    _CREATION = (unwrapAs + 35) % 128;
                                    com.visa.cbp.getHostDeviceID highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2);
                                    if (highResolutionOutputSizeshNQ4ISI3 == null) {
                                        com.visa.cbp.setDeviceCerts setdevicecerts3 = com.visa.cbp.setDeviceCerts.setLastName;
                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setLastName);
                                    }
                                    if (!getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3)) {
                                        com.visa.cbp.setDeviceCerts setdevicecerts4 = com.visa.cbp.setDeviceCerts.setEmail;
                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setEmail);
                                    }
                                    int i2 = _CREATION + 109;
                                    unwrapAs = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        concat = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3.getOutputMinFrameDuration(), 1, highResolutionOutputSizeshNQ4ISI3.getOutputMinFrameDuration().length, "").concat(";");
                                        highSpeedVideoSizes = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3.getInputSizeshNQ4ISI(), 0, highResolutionOutputSizeshNQ4ISI3.getInputSizeshNQ4ISI().length, "");
                                    } else {
                                        concat = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3.getOutputMinFrameDuration(), 0, highResolutionOutputSizeshNQ4ISI3.getOutputMinFrameDuration().length, "").concat(";");
                                        highSpeedVideoSizes = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3.getInputSizeshNQ4ISI(), 0, highResolutionOutputSizeshNQ4ISI3.getInputSizeshNQ4ISI().length, "");
                                    }
                                    str = concat.concat(highSpeedVideoSizes);
                                    this.l = null;
                                } else {
                                    if (!Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr, 0, new byte[]{105, -123}, 0, 2) && !Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr, 0, new byte[]{105, -122}, 0, 2)) {
                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
                                    }
                                    byte[] Camera2StreamConfigurationMap3 = capitalizeVar.Camera2StreamConfigurationMap();
                                    this.l = Camera2StreamConfigurationMap3;
                                    if (Camera2StreamConfigurationMap3 == null) {
                                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
                                    }
                                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap3);
                                }
                            } else {
                                com.visa.cbp.setDeviceCerts setdevicecerts5 = com.visa.cbp.setDeviceCerts.getEmail;
                                if (this.l == null) {
                                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getEmail);
                                }
                            }
                        } else {
                            byte[] Camera2StreamConfigurationMap4 = capitalizeVar.Camera2StreamConfigurationMap();
                            this.l = Camera2StreamConfigurationMap4;
                            if (Camera2StreamConfigurationMap4 == null) {
                                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getPhone);
                            }
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap4);
                            if (highResolutionOutputSizeshNQ4ISI == null || highResolutionOutputSizeshNQ4ISI.length <= 2) {
                                break;
                            }
                            byte[] highSpeedVideoSizes3 = getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, capitalizeVar);
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes3);
                            if (highSpeedVideoSizes3 == null || highSpeedVideoSizes3.length <= 2) {
                                break;
                            }
                            unwrapAs = (_CREATION + 7) % 128;
                            byte[] highResolutionOutputSizeshNQ4ISI4 = this.start.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes3);
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI4);
                            int length = highResolutionOutputSizeshNQ4ISI4.length;
                            if (highResolutionOutputSizeshNQ4ISI4 == null || highResolutionOutputSizeshNQ4ISI4.length <= 2) {
                                break;
                            }
                            com.visa.cbp.getHostDeviceID highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI4);
                            if (highResolutionOutputSizeshNQ4ISI5 == null) {
                                com.visa.cbp.setDeviceCerts setdevicecerts6 = com.visa.cbp.setDeviceCerts.setLastName;
                                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setLastName);
                            }
                            int i3 = _CREATION + 81;
                            unwrapAs = i3 % 128;
                            if (i3 % 2 != 0) {
                                getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5);
                                throw new java.lang.NullPointerException();
                            }
                            if (!getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5)) {
                                com.visa.cbp.setDeviceCerts setdevicecerts7 = com.visa.cbp.setDeviceCerts.setEmail;
                                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setEmail);
                            }
                            str = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI5.getOutputMinFrameDuration(), 0, highResolutionOutputSizeshNQ4ISI5.getOutputMinFrameDuration().length, "").concat(";").concat(Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI5.getInputSizeshNQ4ISI(), 0, highResolutionOutputSizeshNQ4ISI5.getInputSizeshNQ4ISI().length, ""));
                        }
                    }
                } else {
                    break;
                }
            }
        } catch (java.io.IOException e) {
            e = e;
            com.visa.cbp.setDeviceCerts setdevicecerts8 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (java.security.InvalidKeyException e2) {
            e = e2;
            com.visa.cbp.setDeviceCerts setdevicecerts82 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (java.security.NoSuchAlgorithmException e3) {
            e = e3;
            com.visa.cbp.setDeviceCerts setdevicecerts822 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (java.security.spec.InvalidKeySpecException e4) {
            e = e4;
            com.visa.cbp.setDeviceCerts setdevicecerts8222 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (javax.crypto.BadPaddingException e5) {
            e = e5;
            com.visa.cbp.setDeviceCerts setdevicecerts82222 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (javax.crypto.IllegalBlockSizeException e6) {
            e = e6;
            com.visa.cbp.setDeviceCerts setdevicecerts822222 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        } catch (javax.crypto.NoSuchPaddingException e7) {
            e = e7;
            com.visa.cbp.setDeviceCerts setdevicecerts8222222 = com.visa.cbp.setDeviceCerts.getLastName;
            e.getMessage();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLastName);
        }
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        int i = unwrapAs + 103;
        _CREATION = i % 128;
        if (i % 2 != 0) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length + 6];
            java.lang.System.arraycopy(com.visa.cbp.capitalize.getHighSpeedVideoSizes, 0, bArr2, 0, 4);
            bArr2[4] = (byte) bArr.length;
            java.lang.System.arraycopy(bArr, 0, bArr2, 5, (short) bArr.length);
            bArr2[length + 5] = 0;
            int i2 = _CREATION;
            unwrapAs = (i2 + 25) % 128;
            int i3 = i2 + 3;
            unwrapAs = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
        int length2 = bArr.length;
        throw new java.lang.ArithmeticException();
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr, com.visa.cbp.capitalize capitalizeVar) {
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes;
        byte[] bArr2;
        int i;
        int i2;
        int i3;
        short s;
        short s2;
        short highSpeedVideoFpsRangesFor;
        int i4;
        short highSpeedVideoFpsRangesFor2;
        com.visa.cbp.getPhoneNumber getphonenumber = new com.visa.cbp.getPhoneNumber(bArr, (short) 0, (short) (bArr.length - 2));
        if (getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI) == null || (highSpeedVideoSizes = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges)) == null) {
            return null;
        }
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
        com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap2 = getphonenumber.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName._CREATION, 1);
        if (Camera2StreamConfigurationMap2 == null) {
            unwrapAs = (_CREATION + 41) % 128;
            return null;
        }
        com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap(com.visa.cbp.setDeviceName.getOutputMinFrameDurationlomOqCM, 1);
        if (Camera2StreamConfigurationMap3 == null || Camera2StreamConfigurationMap3.getHighResolutionOutputSizeshNQ4ISI == 0) {
            this.l = capitalizeVar.Camera2StreamConfigurationMap();
            return null;
        }
        byte[] highSpeedVideoFpsRangesFor3 = Camera2StreamConfigurationMap3.getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor3, 0, highSpeedVideoFpsRangesFor3.length, "");
        if (!Camera2StreamConfigurationMap.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor3, 0, highSpeedVideoFpsRangesFor3.length, "").contains(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F66_TERMINAL_TRANSACTION_QUALIFIERS_TTQ)) {
            this.l = capitalizeVar.Camera2StreamConfigurationMap();
            return null;
        }
        java.lang.String format = new java.text.SimpleDateFormat(com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, java.util.Locale.US).format(new java.util.Date());
        int length = format.length() / 2;
        byte[] bArr3 = new byte[length];
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(format, bArr3, (short) 0, length);
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(bArr3, (short) 0, this.getInputSizeshNQ4ISI, (short) 0, (short) length);
        int length2 = highSpeedVideoFpsRangesFor3.length;
        char c2 = 255;
        accessartificialFrame = new byte[255];
        int i5 = 0;
        short s3 = 0;
        while (i5 < length2) {
            short s4 = (short) (highSpeedVideoFpsRangesFor3[i5] & c2);
            if (s4 == 95) {
                i = i5 + 2;
                short s5 = (short) highSpeedVideoFpsRangesFor3[i5 + 1];
                int i6 = highSpeedVideoFpsRangesFor3[i];
                if (s5 == 42) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration, i6, s3, true);
                } else if (s5 == 54) {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getInputFormats, i6, s3, true);
                } else {
                    if (highSpeedVideoFpsRangesFor3.length < i6) {
                        unwrapAs = (_CREATION + 97) % 128;
                        int length3 = highSpeedVideoFpsRangesFor3.length;
                        i2 = highSpeedVideoFpsRangesFor3.length;
                        i3 = i6 - length3;
                    } else {
                        i2 = i6;
                        i3 = 0;
                    }
                    int i7 = 0;
                    while (i7 < i2 + i3) {
                        int i8 = _CREATION + 1;
                        unwrapAs = i8 % 128;
                        if (i8 % 2 != 0) {
                            s2 = (short) (s3 - 1);
                            accessartificialFrame[s3] = 0;
                            i7 += 49;
                        } else {
                            s2 = (short) (s3 + 1);
                            accessartificialFrame[s3] = 0;
                            i7++;
                        }
                        s3 = s2;
                    }
                    s = s3;
                    i5 += 3;
                    s3 = s;
                }
                s3 = highSpeedVideoFpsRangesFor;
                i5 = i + 1;
            } else if (s4 != 149) {
                if (s4 == 154) {
                    i = i5 + 1;
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr3, highSpeedVideoFpsRangesFor3[i], s3, true);
                } else if (s4 == 156) {
                    i = i5 + 1;
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDurationlomOqCM, highSpeedVideoFpsRangesFor3[i], s3, false);
                } else if (s4 != 159) {
                    i = i5 + 1;
                    short s6 = highSpeedVideoFpsRangesFor3[i];
                    int i9 = i5 + 2;
                    char c3 = highSpeedVideoFpsRangesFor3[i9];
                    if (s4 == 191) {
                        _CREATION = (unwrapAs + 45) % 128;
                        highSpeedVideoFpsRangesFor = (short) (s3 + highSpeedVideoFpsRangesFor3[i5 + 3]);
                        i = i9;
                    } else {
                        highSpeedVideoFpsRangesFor = (short) (s3 + s6);
                    }
                } else {
                    int i10 = i5 + 2;
                    short s7 = (short) highSpeedVideoFpsRangesFor3[i5 + 1];
                    int i11 = highSpeedVideoFpsRangesFor3[i10];
                    if (s7 == 2) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, i11, s3, false);
                    } else if (s7 == 3) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDuration, i11, s3, false);
                    } else if (s7 == 6) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.l, i11, s3, false);
                    } else if (s7 == 26) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, i11, s3, true);
                    } else if (s7 == 55) {
                        byte[] Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(java.lang.Long.toHexString(java.util.Calendar.getInstance().getTimeInMillis() / 1000));
                        this.getOutputFormats = Camera2StreamConfigurationMap4;
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap4);
                        byte[] bArr4 = this.getOutputFormats;
                        int length4 = bArr4.length;
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr4, i11, s3, false);
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getOutputFormats);
                    } else if (s7 == 57) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getOutputSizes, i11, s3, false);
                    } else if (s7 == 78) {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(new byte[i11], i11, s3, false);
                    } else if (s7 != 102) {
                        s = (short) (s3 + i11);
                        i5 += 3;
                        s3 = s;
                    } else {
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getOutputStallDurationlomOqCM, i11, s3, false);
                    }
                    highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
                    i = i10;
                }
                s3 = highSpeedVideoFpsRangesFor;
                i5 = i + 1;
            } else {
                int i12 = highSpeedVideoFpsRangesFor3[i5 + 1];
                if (highSpeedVideoFpsRangesFor3.length < i12) {
                    i4 = i12 - highSpeedVideoFpsRangesFor3.length;
                    i12 = highSpeedVideoFpsRangesFor3.length;
                } else {
                    i4 = 0;
                }
                int i13 = 0;
                while (i13 < i12 + i4) {
                    _CREATION = (unwrapAs + 57) % 128;
                    accessartificialFrame[s3] = 0;
                    i13++;
                    s3 = (short) (s3 + 1);
                }
                i5 += 2;
            }
            c2 = 255;
        }
        if (s3 >= 128) {
            int i14 = _CREATION + 115;
            unwrapAs = i14 % 128;
            bArr2 = new byte[i14 % 2 != 0 ? (s3 >>> _BOUNDARY.length) * 3 : _BOUNDARY.length + s3 + 2];
        } else {
            bArr2 = new byte[_BOUNDARY.length + s3 + 1];
        }
        byte[] bArr5 = _BOUNDARY;
        java.lang.System.arraycopy(bArr5, 0, bArr2, 0, (short) bArr5.length);
        if (s3 >= 128) {
            bArr2[4] = (byte) (s3 + 3);
            bArr2[6] = -127;
            bArr2[7] = (byte) s3;
            java.lang.System.arraycopy(accessartificialFrame, 0, bArr2, 8, s3);
        } else {
            bArr2[4] = (byte) (s3 + 2);
            bArr2[6] = (byte) s3;
            java.lang.System.arraycopy(accessartificialFrame, 0, bArr2, 7, s3);
        }
        bArr2[bArr2.length - 1] = 0;
        byte[] bArr6 = new byte[bArr2.length];
        java.lang.System.arraycopy(bArr2, 0, bArr6, 0, (short) bArr2.length);
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr6);
        int i15 = _CREATION + 27;
        unwrapAs = i15 % 128;
        if (i15 % 2 == 0) {
            return bArr6;
        }
        throw null;
    }

    private short getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, short s, boolean z) {
        int i2;
        int i3 = (_CREATION + 13) % 128;
        unwrapAs = i3;
        int i4 = 0;
        if (bArr.length < i) {
            i2 = i - bArr.length;
            i = bArr.length;
        } else {
            i2 = 0;
        }
        if (z) {
            _CREATION = (i3 + 11) % 128;
            s = (short) (s + i2);
            if (i < bArr.length) {
                i4 = bArr.length - i;
                i++;
            }
        }
        while (i4 < i) {
            _CREATION = (unwrapAs + 21) % 128;
            accessartificialFrame[s] = bArr[i4];
            i4++;
            s = (short) (s + 1);
        }
        return !z ? (short) (s + i2) : s;
    }

    private com.visa.cbp.getHostDeviceID getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.io.IOException {
        byte[] highResolutionOutputSizeshNQ4ISI;
        byte[] bArr2 = new byte[2];
        com.visa.cbp.getHostDeviceID gethostdeviceid = new com.visa.cbp.getHostDeviceID();
        int i = 0;
        com.visa.cbp.getPhoneNumber getphonenumber = new com.visa.cbp.getPhoneNumber(bArr, (short) 0, (short) (bArr.length - 2));
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getInputFormats);
        if (highSpeedVideoSizes != null) {
            gethostdeviceid.getHighSpeedVideoSizesFor(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes2 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.coroutineBoundary);
        byte[] highSpeedVideoFpsRangesFor = highSpeedVideoSizes2 != null ? highSpeedVideoSizes2.getHighSpeedVideoFpsRangesFor() : null;
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes3 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getOutputSizes);
        if (highSpeedVideoSizes3 != null) {
            gethostdeviceid.getOutputSizeshNQ4ISI(highSpeedVideoSizes3.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes4 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.toString);
        if (highSpeedVideoSizes4 != null) {
            gethostdeviceid.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes4.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes5 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.toString);
        if (highSpeedVideoSizes5 != null) {
            gethostdeviceid.getOutputStallDurationlomOqCM(highSpeedVideoSizes5.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes6 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.ArtificialStackFrames);
        if (highSpeedVideoSizes6 != null) {
            int i2 = _CREATION + 5;
            unwrapAs = i2 % 128;
            if (i2 % 2 != 0) {
                gethostdeviceid.getHighSpeedVideoSizes(highSpeedVideoSizes6.getHighSpeedVideoFpsRangesFor());
                throw null;
            }
            gethostdeviceid.getHighSpeedVideoSizes(highSpeedVideoSizes6.getHighSpeedVideoFpsRangesFor());
        }
        if (highSpeedVideoFpsRangesFor != null) {
            int i3 = unwrapAs + 65;
            _CREATION = i3 % 128;
            if (i3 % 2 == 0) {
                int length = highSpeedVideoFpsRangesFor.length;
                throw null;
            }
            if (highSpeedVideoFpsRangesFor.length > 0) {
                int i4 = 0;
                while (i4 < highSpeedVideoFpsRangesFor.length) {
                    int i5 = _CREATION;
                    unwrapAs = (i5 + 21) % 128;
                    byte b2 = highSpeedVideoFpsRangesFor[i4];
                    byte b3 = (byte) (b2 | 4);
                    byte b4 = highSpeedVideoFpsRangesFor[i4 + 1];
                    if (b2 == 0) {
                        break;
                    }
                    unwrapAs = (i5 + 41) % 128;
                    if (b2 == -8) {
                        break;
                    }
                    int i6 = i5 + 15;
                    unwrapAs = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    if (b4 == 0) {
                        break;
                    }
                    int i7 = i4 + 2;
                    if (b4 > highSpeedVideoFpsRangesFor[i7]) {
                        break;
                    }
                    byte b5 = b4;
                    while (b5 <= highSpeedVideoFpsRangesFor[i7]) {
                        byte[] bArr3 = getARTIFICIAL_FRAME_PACKAGE_NAME;
                        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length);
                        copyOf[2] = b5;
                        copyOf[3] = b3;
                        if (copyOf != null && (highResolutionOutputSizeshNQ4ISI = this.start.getHighResolutionOutputSizeshNQ4ISI(copyOf)) != null) {
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                            java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, (short) (highResolutionOutputSizeshNQ4ISI.length - 2), bArr2, i, 2);
                            byte b6 = b5;
                            if (Camera2StreamConfigurationMap.getHighSpeedVideoSizes(bArr2, 0, new byte[]{-112, 0}, 0, 2)) {
                                getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, gethostdeviceid);
                                int i8 = _CREATION + 1;
                                unwrapAs = i8 % 128;
                                b5 = (byte) (i8 % 2 != 0 ? b6 % 1 : b6 + 1);
                                i = 0;
                            } else {
                                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                            }
                        }
                        return null;
                    }
                    i4 += 4;
                    i = 0;
                }
            }
        }
        int i9 = unwrapAs + 3;
        _CREATION = i9 % 128;
        if (i9 % 2 != 0) {
            return gethostdeviceid;
        }
        throw null;
    }

    private com.visa.cbp.getHostDeviceID getHighSpeedVideoSizes(byte[] bArr, com.visa.cbp.getHostDeviceID gethostdeviceid) {
        com.visa.cbp.getPhoneNumber getphonenumber = new com.visa.cbp.getPhoneNumber(bArr, (short) 0, (short) (bArr.length - 2));
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes = getphonenumber.getHighSpeedVideoSizes((short) 90);
        if (highSpeedVideoSizes != null) {
            gethostdeviceid.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes2 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.CoroutineDebuggingKt);
        if (highSpeedVideoSizes2 != null) {
            unwrapAs = (_CREATION + 91) % 128;
            gethostdeviceid.getOutputFormats(highSpeedVideoSizes2.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes3 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI);
        if (highSpeedVideoSizes3 != null) {
            gethostdeviceid.Camera2StreamConfigurationMap(highSpeedVideoSizes3.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes4 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap);
        if (highSpeedVideoSizes4 != null) {
            _CREATION = (unwrapAs + 73) % 128;
            gethostdeviceid.getHighSpeedVideoFpsRanges(highSpeedVideoSizes4.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes5 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM);
        if (highSpeedVideoSizes5 != null) {
            int i = unwrapAs + 65;
            _CREATION = i % 128;
            if (i % 2 == 0) {
                gethostdeviceid.getInputSizeshNQ4ISI(highSpeedVideoSizes5.getHighSpeedVideoFpsRangesFor());
                throw null;
            }
            gethostdeviceid.getInputSizeshNQ4ISI(highSpeedVideoSizes5.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes6 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getOutputStallDuration);
        if (highSpeedVideoSizes6 != null) {
            int i2 = unwrapAs + 93;
            _CREATION = i2 % 128;
            if (i2 % 2 == 0) {
                gethostdeviceid.getInputFormats(highSpeedVideoSizes6.getHighSpeedVideoFpsRangesFor());
                throw null;
            }
            gethostdeviceid.getInputFormats(highSpeedVideoSizes6.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes7 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.accessartificialFrame);
        if (highSpeedVideoSizes7 != null) {
            gethostdeviceid.getOutputMinFrameDuration(highSpeedVideoSizes7.getHighSpeedVideoFpsRangesFor());
            int length = gethostdeviceid.getOutputFormats().length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(gethostdeviceid.getOutputFormats());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes8 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.getInputFormats);
        if (highSpeedVideoSizes8 != null) {
            gethostdeviceid.getHighSpeedVideoSizesFor(highSpeedVideoSizes8.getHighSpeedVideoFpsRangesFor());
        }
        com.visa.cbp.getPhoneNumber highSpeedVideoSizes9 = getphonenumber.getHighSpeedVideoSizes(com.visa.cbp.setDeviceName.ArtificialStackFrames);
        if (highSpeedVideoSizes9 != null) {
            gethostdeviceid.getHighSpeedVideoSizes(highSpeedVideoSizes9.getHighSpeedVideoFpsRangesFor());
            int length2 = gethostdeviceid.getHighSpeedVideoSizes().length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(gethostdeviceid.getHighSpeedVideoSizes());
        }
        return gethostdeviceid;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getHostDeviceID gethostdeviceid) throws javax.crypto.BadPaddingException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        java.lang.String trim = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(gethostdeviceid.Camera2StreamConfigurationMap()).trim();
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(gethostdeviceid.Camera2StreamConfigurationMap()).trim());
        if (Camera2StreamConfigurationMap2 != null) {
            _CREATION = (unwrapAs + 89) % 128;
            try {
                if (Camera2StreamConfigurationMap2.length() > 0 && trim != null && trim.length() > 0 && getHighSpeedVideoFpsRanges(gethostdeviceid.getInputFormats(), Camera2StreamConfigurationMap2, gethostdeviceid.getInputSizeshNQ4ISI())) {
                    getHighSpeedVideoFpsRanges(gethostdeviceid.getHighResolutionOutputSizeshNQ4ISI());
                    if (getHighResolutionOutputSizeshNQ4ISI(gethostdeviceid.getHighSpeedVideoFpsRanges(), gethostdeviceid.getInputSizeshNQ4ISI())) {
                        int i = _CREATION + 81;
                        unwrapAs = i % 128;
                        if (i % 2 == 0) {
                            getHighSpeedVideoFpsRangesFor(gethostdeviceid.getOutputFormats());
                            if (!Camera2StreamConfigurationMap(gethostdeviceid.getHighSpeedVideoSizesFor(), gethostdeviceid.getHighSpeedVideoSizes())) {
                                return false;
                            }
                            unwrapAs = (_CREATION + 63) % 128;
                            return true;
                        }
                        getHighSpeedVideoFpsRangesFor(gethostdeviceid.getOutputFormats());
                        Camera2StreamConfigurationMap(gethostdeviceid.getHighSpeedVideoSizesFor(), gethostdeviceid.getHighSpeedVideoSizes());
                        throw null;
                    }
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
                throw e;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r7 >= r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoFpsRanges(byte[] bArr, java.lang.String str, byte[] bArr2) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException {
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(str);
        byte[] bArr3 = {3};
        if (bArr == null) {
            return false;
        }
        int length = bArr.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr);
        int length2 = Camera2StreamConfigurationMap2.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2);
        if (bArr.length != Camera2StreamConfigurationMap2.length) {
            _CREATION = (unwrapAs + 31) % 128;
            return false;
        }
        try {
            java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
            this.free = keyFactory;
            this.requestGoOnline = keyFactory.generatePublic(new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(1, Camera2StreamConfigurationMap2), new java.math.BigInteger(1, bArr3)));
            _CREATION = (unwrapAs + 19) % 128;
            try {
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/None/NoPadding");
                int i = 2;
                cipher.init(2, this.requestGoOnline);
                byte[] doFinal = cipher.doFinal(bArr);
                this.AMEXKernelProvider = doFinal;
                int length3 = doFinal.length;
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(doFinal);
                byte[] bArr4 = this.AMEXKernelProvider;
                if (bArr4[bArr4.length - 1] == -68) {
                    int i2 = (_CREATION + 73) % 128;
                    unwrapAs = i2;
                    if (bArr4[0] == 106 && bArr4[1] == 2) {
                        if (bArr4[11] != 1) {
                            _CREATION = (i2 + 23) % 128;
                            return false;
                        }
                        if (bArr2 != null) {
                            int length4 = bArr2.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr2);
                        }
                        while (i < 6) {
                            byte b2 = bArr2[i - 2];
                            byte b3 = this.AMEXKernelProvider[i];
                            if (b2 != b3 && (b3 != -1 || i < 5)) {
                                return false;
                            }
                            i++;
                            _CREATION = (unwrapAs + 45) % 128;
                        }
                        byte[] bArr5 = this.getInputSizeshNQ4ISI;
                        int length5 = bArr5.length;
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr5);
                        short highSpeedVideoFpsRanges = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((short) (this.getInputSizeshNQ4ISI[0] & 255));
                        short highSpeedVideoFpsRanges2 = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((short) (this.AMEXKernelProvider[7] & 255));
                        byte[] bArr6 = this.AMEXKernelProvider;
                        byte b4 = bArr6[6];
                        byte b5 = this.getInputSizeshNQ4ISI[1];
                        if (highSpeedVideoFpsRanges2 >= highSpeedVideoFpsRanges) {
                            if (highSpeedVideoFpsRanges2 == highSpeedVideoFpsRanges) {
                                unwrapAs = (_CREATION + 111) % 128;
                            }
                            if (bArr6[12] == 1) {
                                return true;
                            }
                            unwrapAs = (_CREATION + 21) % 128;
                            return false;
                        }
                    }
                }
                return false;
            } catch (java.security.InvalidKeyException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
                e.getMessage();
                throw e;
            }
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e2) {
            e2.getMessage();
            throw e2;
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        _CREATION = (unwrapAs + 29) % 128;
        byte[] bArr2 = this.AMEXKernelProvider;
        int length = bArr2.length;
        int i = bArr2[13] & 255;
        byte[] bArr3 = new byte[i];
        this.version = bArr3;
        if (bArr != null && bArr.length > 0) {
            int length2 = bArr.length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr);
            int length3 = bArr.length;
            short s = (short) (length - 36);
            Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.AMEXKernelProvider, (short) 15, this.version, (short) 0, s);
            byte[] bArr4 = this.version;
            int length4 = bArr4.length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr4);
            Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(bArr, (short) 0, this.version, s, (short) length3);
            byte[] bArr5 = this.version;
            int length5 = bArr5.length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr5);
            return;
        }
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(bArr2, (short) 15, bArr3, (short) 0, (short) i);
        byte[] bArr6 = this.version;
        int length6 = bArr6.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr6);
        int i2 = unwrapAs + 5;
        _CREATION = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r10[r10.length] == 38) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r10 = r5 + 31;
        com.visa.cbp.getName.unwrapAs = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if ((r10 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r9.d[0] != 50) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r10 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r10[1] != 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r10[17] == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        com.visa.cbp.getName.unwrapAs = (r5 + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r5 = r5 + 107;
        com.visa.cbp.getName.unwrapAs = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if ((r5 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        r10 = r11.length;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r10 = r11.length;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r10 = 0;
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (r10 >= 10) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r5 = com.visa.cbp.getName.unwrapAs;
        r6 = r5 + 87;
        com.visa.cbp.getName._CREATION = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if ((r6 % 2) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r10 >= r11.length) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (r11[r10] != r9.d[r1]) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        com.visa.cbp.getName._CREATION = (r5 + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r10 < r11.length) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r9.d[r1] == (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        r1 = r1 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r10 = r11.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        r10 = com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((short) (r9.getInputSizeshNQ4ISI[0] & 255));
        r11 = com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((short) (r9.d[13] & 255));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r11 < r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        if (r11 != r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
    
        com.visa.cbp.getName._CREATION = (com.visa.cbp.getName.unwrapAs + 71) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        if (r9.d[12] < r9.getInputSizeshNQ4ISI[1]) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        if (r9.d[18] == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009d, code lost:
    
        if (r9.d[0] != 106) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0083, code lost:
    
        if (r10[r10.length - 1] == (-68)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException {
        byte[] bArr3 = {3};
        if (bArr != null) {
            int length = bArr.length;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr);
            if (bArr.length != this.version.length) {
                return false;
            }
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                this.free = keyFactory;
                this.AMEXKernela = keyFactory.generatePublic(new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(1, this.version), new java.math.BigInteger(1, bArr3)));
                try {
                    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/None/NoPadding");
                    cipher.init(2, this.AMEXKernela);
                    byte[] doFinal = cipher.doFinal(bArr);
                    this.d = doFinal;
                    int length2 = doFinal.length;
                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(doFinal);
                    int i = unwrapAs + 17;
                    int i2 = i % 128;
                    _CREATION = i2;
                    if (i % 2 == 0) {
                        byte[] bArr4 = this.d;
                    } else {
                        byte[] bArr5 = this.d;
                    }
                    return false;
                } catch (java.security.InvalidKeyException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
                    e.getMessage();
                    throw e;
                }
            } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e2) {
                e2.getMessage();
                throw e2;
            }
        }
        int i3 = _CREATION + 19;
        int i4 = i3 % 128;
        unwrapAs = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 69;
        _CREATION = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        com.visa.cbp.getName._CREATION = (r1 + 13) % 128;
        r0 = r14.length;
        r1 = r14.length;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(r14);
        r11 = (short) r2;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(r13.d, 21, r13.AMEXKernel, 0, r11);
        r1 = r13.version.length;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(r13.AMEXKernel);
        com.visa.cbp.getName.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(r14, 0, r13.AMEXKernel, r11, (short) r0);
        r14 = r13.AMEXKernel;
        r0 = r14.length;
        com.visa.cbp.getName.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r14 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r14 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r14.length <= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int length;
        int i;
        int i2 = _CREATION + 69;
        int i3 = i2 % 128;
        unwrapAs = i3;
        if (i2 % 2 != 0) {
            byte[] bArr2 = this.d;
            length = (bArr2.length * 62) >> 42;
            i = bArr2[102] ^ 1392;
            this.AMEXKernel = new byte[i];
        } else {
            byte[] bArr3 = this.d;
            length = bArr3.length - 42;
            i = bArr3[19] & 255;
            this.AMEXKernel = new byte[i];
        }
        byte[] bArr4 = this.d;
        int length2 = bArr4.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr4);
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.d, (short) 21, this.AMEXKernel, (short) 0, (short) i);
        byte[] bArr5 = this.AMEXKernel;
        int length3 = bArr5.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r12 == (-107)) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException {
        byte[] bArr3;
        byte[] bArr4 = {3};
        if (bArr == null) {
            unwrapAs = (_CREATION + 103) % 128;
            return false;
        }
        int length = bArr.length;
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr);
        if (bArr.length != this.AMEXKernel.length) {
            return false;
        }
        try {
            java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
            this.free = keyFactory;
            this.AMEXKernelJNI = keyFactory.generatePublic(new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(1, this.AMEXKernel), new java.math.BigInteger(1, bArr4)));
            try {
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/None/NoPadding");
                cipher.init(2, this.AMEXKernelJNI);
                byte[] doFinal = cipher.doFinal(bArr);
                this.init = doFinal;
                int length2 = doFinal.length;
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(doFinal);
                byte[] bArr5 = this.init;
                if (bArr5[bArr5.length - 1] == -68) {
                    int i = unwrapAs + 61;
                    int i2 = i % 128;
                    _CREATION = i2;
                    if (i % 2 != 0 ? bArr5[0] == 106 : bArr5[0] == 37) {
                        byte b2 = bArr5[1];
                        if (b2 != 5) {
                            unwrapAs = (i2 + 33) % 128;
                        }
                        int length3 = bArr5.length;
                        int length4 = bArr5.length - 22;
                        byte[] bArr6 = new byte[length4];
                        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(bArr5, (short) 1, bArr6, (short) 0, (short) (bArr5.length - 22));
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr6);
                        if (bArr2 != null) {
                            int length5 = bArr2.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr2);
                            byte[] bArr7 = this.getOutputFormats;
                            int length6 = bArr7.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr7);
                            byte[] bArr8 = this.getHighSpeedVideoSizesFor;
                            int length7 = bArr8.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr8);
                            byte[] bArr9 = this.getOutputStallDuration;
                            int length8 = bArr9.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr9);
                            byte[] bArr10 = this.getOutputFormats;
                            bArr3 = new byte[bArr10.length + this.getHighSpeedVideoSizesFor.length + this.getOutputStallDuration.length + bArr2.length];
                            java.lang.System.arraycopy(bArr10, 0, bArr3, 0, bArr10.length);
                            int length9 = this.getOutputFormats.length;
                            byte[] bArr11 = this.getHighSpeedVideoSizesFor;
                            java.lang.System.arraycopy(bArr11, 0, bArr3, length9, bArr11.length);
                            int length10 = length9 + this.getHighSpeedVideoSizesFor.length;
                            byte[] bArr12 = this.getOutputStallDuration;
                            java.lang.System.arraycopy(bArr12, 0, bArr3, length10, bArr12.length);
                            java.lang.System.arraycopy(bArr2, 0, bArr3, length10 + this.getOutputStallDuration.length, bArr2.length);
                        } else {
                            byte[] bArr13 = this.getOutputFormats;
                            bArr3 = new byte[bArr13.length];
                            java.lang.System.arraycopy(bArr13, 0, bArr3, 0, bArr13.length);
                        }
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr3);
                        byte[] bArr14 = new byte[bArr3.length + length4];
                        java.lang.System.arraycopy(bArr6, 0, bArr14, 0, length4);
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr14);
                        java.lang.System.arraycopy(bArr3, 0, bArr14, (short) length4, bArr3.length);
                        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr14);
                        try {
                            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA");
                            this.AMEXKernelCallback = messageDigest;
                            messageDigest.update(bArr14);
                            byte[] digest = this.AMEXKernelCallback.digest();
                            this.requestPINEntry = digest;
                            int length11 = digest.length;
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(digest);
                            int i3 = _CREATION;
                            unwrapAs = (i3 + 49) % 128;
                            unwrapAs = (i3 + 17) % 128;
                            byte[] bArr15 = new byte[20];
                            Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.init, (short) (r4.length - 21), bArr15, (short) 0, (short) 20);
                            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr15);
                            return Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.requestPINEntry, 0, bArr15, 0, 20);
                        } catch (java.security.NoSuchAlgorithmException e) {
                            e.getMessage();
                            throw e;
                        }
                    }
                }
                return false;
            } catch (java.security.InvalidKeyException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e2) {
                e2.getMessage();
                throw e2;
            }
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e3) {
            e3.getMessage();
            throw e3;
        }
    }

    private java.lang.String getHighSpeedVideoSizes() {
        unwrapAs = (_CREATION + 31) % 128;
        java.lang.String replace = java.util.UUID.randomUUID().toString().replace("-", "");
        unwrapAs = (_CREATION + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return replace;
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context context, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, byte[] bArr) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        java.security.PublicKey publicKey2;
        java.lang.String obj;
        java.lang.String obj2;
        byte[] BuildConfig;
        com.visa.cbp.getHeight getheight = new com.visa.cbp.getHeight();
        try {
            java.security.KeyPair values = getheight.values();
            publicKey2 = values.getPublic();
            java.security.PrivateKey privateKey = values.getPrivate();
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int red = android.graphics.Color.red(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(4 - red, android.view.MotionEvent.axisFromString("") + 1, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47657), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(highSpeedVideoSizes);
            obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int axisFromString = android.view.MotionEvent.axisFromString("");
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(axisFromString + 5, (scrollBarSize >> 8) + 4, (char) (38904 - android.view.KeyEvent.keyCodeFromString("")), objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(highSpeedVideoSizes);
            obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int myTid = android.os.Process.myTid();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((myTid >> 22) + 13, 8 - android.view.View.MeasureSpec.getMode(0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr3);
            sb3.append(((java.lang.String) objArr3[0]).intern());
            sb3.append(obj);
            sb3.append(" (");
            int myPid = android.os.Process.myPid();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((myPid >> 22) + 39, 21 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4);
            sb3.append(((java.lang.String) objArr4[0]).intern());
            sb3.append(obj2);
            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((scrollBarFadeDuration >> 16) + 14, android.view.View.MeasureSpec.getMode(0) + 60, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr5);
            sb3.append(((java.lang.String) objArr5[0]).intern());
            sb3.append(");");
            sQLiteDatabase.execSQL(sb3.toString());
            BuildConfig = getheight.BuildConfig(context, bArr, publicKey, privateKey);
        } catch (java.security.NoSuchAlgorithmException unused) {
        }
        if (BuildConfig == null) {
            unwrapAs = (_CREATION + 71) % 128;
            return null;
        }
        com.visa.cbp.external.common.Base64.encode(BuildConfig);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(obj2, new java.lang.String(com.visa.cbp.external.common.Base64.encode(BuildConfig)));
        sQLiteDatabase.insert(obj, null, contentValues);
        com.visa.cbp.external.common.Base64.encode(BuildConfig);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        sb4.append("-");
        sb4.append(obj2);
        sb4.append("-");
        java.lang.String str = new java.lang.String(com.visa.cbp.external.common.Base64.encode(sb4.toString().concat(getheight.valueOf(publicKey2.getEncoded(), 0, publicKey2.getEncoded().length, "")).getBytes()));
        unwrapAs = (_CREATION + 117) % 128;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, short[] sArr, short s, short s2) {
        short highSpeedVideoFpsRangesFor;
        char c2 = 1;
        short s3 = (short) (sArr[0] + sArr[1]);
        int i = 2;
        short[] sArr2 = new short[2];
        if (s < 3) {
            return false;
        }
        sArr[1] = 0;
        boolean z = false;
        while (z != c2) {
            int i2 = unwrapAs + 71;
            int i3 = i2 % 128;
            _CREATION = i3;
            if (i2 % i == 0) {
                throw null;
            }
            if (s3 >= s) {
                return z;
            }
            int i4 = i3 + 19;
            unwrapAs = i4 % 128;
            if (i4 % i != 0) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, s3, sArr2);
                short s4 = sArr2[c2];
                if (s4 != -24807 && s4 != -24776 && s4 != -24757 && s4 != 111 && s4 != 132 && s4 != 148 && s4 != 165 && s4 != -24762 && s4 != -24761 && s4 != 143 && s4 != 144) {
                    s3 = (short) (((short) (s3 + highSpeedVideoFpsRangesFor)) + sArr2[1]);
                    _CREATION = (unwrapAs + 41) % 128;
                    c2 = 1;
                    i = 2;
                }
                short s5 = (short) (s3 + highSpeedVideoFpsRangesFor);
                if (s2 != sArr2[0]) {
                    sArr[0] = s5;
                    c2 = 1;
                    sArr[1] = sArr2[1];
                    z = true;
                } else {
                    c2 = 1;
                }
                i = 2;
                s3 = (short) (s5 + sArr2[c2]);
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, s3, sArr2);
                short s6 = sArr2[0];
                if (s6 != -24807 && s6 != -24776 && s6 != -24757 && s6 != 111 && s6 != 132 && s6 != 148 && s6 != 165 && s6 != -24762 && s6 != -24761 && s6 != 143 && s6 != 144) {
                    s3 = (short) (((short) (s3 + highSpeedVideoFpsRangesFor)) + sArr2[1]);
                    _CREATION = (unwrapAs + 41) % 128;
                    c2 = 1;
                    i = 2;
                }
                short s52 = (short) (s3 + highSpeedVideoFpsRangesFor);
                if (s2 != sArr2[0]) {
                }
                i = 2;
                s3 = (short) (s52 + sArr2[c2]);
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r5 < 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private short getHighSpeedVideoFpsRangesFor(byte[] bArr, short s, short[] sArr) {
        short s2;
        short s3;
        short s4;
        short s5;
        char c2;
        try {
            if ((bArr[s] & com.google.common.base.Ascii.US) == 31) {
                s3 = s;
                do {
                    s3 = (short) (s3 + 1);
                    try {
                    } catch (java.lang.Exception unused) {
                        s2 = s3;
                    }
                } while ((bArr[s3] & 128) == 128);
            } else {
                s3 = s;
            }
            short s6 = (short) (s3 + 1);
            short s7 = (short) (s6 - s);
            if (s7 == 1) {
                int i = _CREATION + 3;
                unwrapAs = i % 128;
                if (i % 2 != 0) {
                    sArr[0] = (short) (bArr[s] & 22105);
                } else {
                    sArr[0] = (short) (bArr[s] & 255);
                }
            } else if (s7 == 2) {
                sArr[0] = (short) ((((short) (bArr[s] & 255)) << 8) + ((short) (bArr[(short) (s + 1)] & 255)));
            }
            sArr[1] = 0;
            byte b2 = bArr[s6];
            if ((b2 & Byte.MIN_VALUE) != 0) {
                int i2 = b2 & Byte.MAX_VALUE;
                while (true) {
                    short s8 = (short) i2;
                    if (s8 <= 0) {
                        break;
                    }
                    int i3 = unwrapAs + 43;
                    _CREATION = i3 % 128;
                    if (i3 % 2 == 0) {
                        s6 = s6;
                        s4 = bArr[s6];
                        s5 = sArr[0];
                        c2 = 0;
                        if (s4 < 0) {
                            s4 = (short) (s4 + com.visa.cbp.getEncExpo.initializeViewTreeOwners);
                        }
                        sArr[c2] = (short) (s5 + s4);
                        if (s8 > 1) {
                            sArr[1] = (short) (sArr[1] << 8);
                        }
                        i2 = s8 - 1;
                    } else {
                        s6 = (short) (s6 + 1);
                        s4 = bArr[s6];
                        s5 = sArr[1];
                        c2 = 1;
                    }
                }
            } else {
                int i4 = unwrapAs + 59;
                _CREATION = i4 % 128;
                if (i4 % 2 == 0) {
                    sArr[1] = b2;
                } else {
                    sArr[1] = b2;
                }
            }
            s2 = (short) (s6 + 1);
        } catch (java.lang.Exception unused2) {
            s2 = s;
        }
        short s9 = (short) (s2 - s);
        int i5 = _CREATION + 29;
        unwrapAs = i5 % 128;
        if (i5 % 2 == 0) {
            return s9;
        }
        throw null;
    }

    private java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        unwrapAs = (_CREATION + 89) % 128;
        int size = this.freeTransaction.getKeys().size();
        for (int i = 0; i < size; i++) {
            _CREATION = (unwrapAs + 19) % 128;
            if (this.freeTransaction.getKeys().get(i).getIndex().compareToIgnoreCase(str) == 0) {
                int i2 = unwrapAs + 95;
                _CREATION = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.freeTransaction.getKeys().get(i).getModulus();
                }
                this.freeTransaction.getKeys().get(i).getModulus();
                throw null;
            }
        }
        int i3 = unwrapAs + 125;
        _CREATION = i3 % 128;
        if (i3 % 2 != 0) {
            return "";
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c2, java.lang.Object[] objArr) {
        com.visa.cbp.ReplenishRequest replenishRequest = new com.visa.cbp.ReplenishRequest();
        long[] jArr = new long[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        getOutputSizeshNQ4ISI = (isOutputSupportedFor + 63) % 128;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            int i3 = isOutputSupportedFor + 107;
            getOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = replenishRequest.ConfirmReplenishRequest;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getValidOutputFormatsForInputhNQ4ISI[i2 + replenishRequest.ConfirmReplenishRequest])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 960, android.view.View.MeasureSpec.getSize(0) + 20);
                        byte b2 = (byte) ($$b & 1);
                        byte b3 = (byte) (b2 - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
                    }
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(CoroutineDebuggingKt), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 257 - android.text.TextUtils.getOffsetBefore("", 0), 24 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                            byte b4 = (byte) ($$b & 10);
                            byte b5 = (byte) (b4 - 2);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(b4, b5, b5, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj2);
                        }
                        jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                        try {
                            java.lang.Object[] objArr6 = {replenishRequest, replenishRequest};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44626), 1565 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 18 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) 0, 0, (byte) 0, objArr7);
                                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } else {
                int i5 = replenishRequest.ConfirmReplenishRequest;
                try {
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(getValidOutputFormatsForInputhNQ4ISI[i2 + replenishRequest.ConfirmReplenishRequest])};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getCapsMode("", 0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 959, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20);
                        byte b6 = (byte) ($$b & 1);
                        byte b7 = (byte) (b6 - 1);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(b6, b7, b7, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj4);
                    }
                    try {
                        java.lang.Object[] objArr10 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(CoroutineDebuggingKt), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                        if (obj5 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 257, 25 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                            byte b8 = (byte) ($$b & 10);
                            byte b9 = (byte) (b8 - 2);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(b8, b9, b9, objArr11);
                            obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj5);
                        }
                        jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr10)).longValue();
                        try {
                            java.lang.Object[] objArr12 = {replenishRequest, replenishRequest};
                            java.lang.Object obj6 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                            if (obj6 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.KeyEvent.normalizeMetaState(0) + 44626), 1566 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 20 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) 0, 0, (byte) 0, objArr13);
                                obj6 = cls6.getMethod((java.lang.String) objArr13[0], java.lang.Object.class, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj6);
                            }
                            ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause6 = th6.getCause();
                    if (cause6 == null) {
                        throw th6;
                    }
                    throw cause6;
                }
            }
            isOutputSupportedFor = (getOutputSizeshNQ4ISI + 57) % 128;
        }
        char[] cArr = new char[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            getOutputSizeshNQ4ISI = (isOutputSupportedFor + 67) % 128;
            cArr[replenishRequest.ConfirmReplenishRequest] = (char) jArr[replenishRequest.ConfirmReplenishRequest];
            try {
                java.lang.Object[] objArr14 = {replenishRequest, replenishRequest};
                java.lang.Object obj7 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                if (obj7 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (44627 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", "", 0, 0) + 1566, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) 0, 0, (byte) 0, objArr15);
                    obj7 = cls7.getMethod((java.lang.String) objArr15[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr14);
            } catch (java.lang.Throwable th7) {
                java.lang.Throwable cause7 = th7.getCause();
                if (cause7 == null) {
                    throw th7;
                }
                throw cause7;
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[1446];
        java.nio.ByteBuffer.wrap("\u0016;\u0003Ø=©WO;\u008d.t\u0010\bzî¬U¹\u0091\u0087ùí(û\u0016Áz.è4\u0091\u0002ÿh)v\b\\t©ê¬\u0016¹ª\u0087Øíiû\u000bÁq.¼4\u0080\u0002ùh.v\u0016\\1©º·\u0095\u009dùë ñ\u0007ßa$µ2Ù\u0018ùf*L\u0001Z5§¯\u008d\u008e\u009bàá.Ï\u0013Õy\"£\b\u008f\u0016ó|.J\u0019PG½¶\u008bÓ\u0091\u0088¬\u0016¹\u0097\u0087ùí1û\u0016Á?.¦4\u008a\u0002êhkv\n\\d©¦·\u008b¬M¹é\u0087¾í\"û\u0007Áf.»4Ç\u0002¤hkv?\\j©À·Ç\u009d°ëmñFß1$¥2\u0097\u0018öf*L\u0000Z7§ô\u008dÛ\u009b¶áxÏHÕ5\"ì\b÷\u0016¶|cJ\\P\t½à\u008b\u0092\u0091Çÿ!Å\u000bÓG8±\u0006\u0082l\u0088z}@P®\u000f»ÿ\u0081Êï\u009aõ\u0018Ã4)\u001a6î\u001c³j\u009bpm^M¤\u0010±â\u009fÀåäómÙO'\u0011\få\u001aº`áNnT<¢\u001d\u008fï\u0095»ã\u0090Éd×:=b\n\u0094\u0010µ~ãD\u0016R?¸\n\u0085ç\u0093¸ù\u008bÇl-9;y\u0000ån¹tûBe¨4¶\b\u0083îéÆ÷úÝ(+C1\u0006\u001eÚdÁrÿXX¦F\u008c\u0007\u0099®çÁÍ\u0086ÛX!7\u000f\u0007\u0014©bÚH\u0082VY¼(\u008a\u0004\u0097×ý®Ë\u0087ÑP?\"\u0005q\u0012¤x©F\u0085¬!ºY\u0087ðí û§Á\u000e/U5]\u0002\u0088hÒv§\\sª\"°#\u009d\u008bëÞñ§ßx%I3'\u0018øf»L×Z\n ?\u008eR\u009bùá¸ÏÓÕ\u0001#L\t/\u0016ò|¾JëPt¾K\u0084\u001c\u0091òÿÍÅéÓ\u00079I\u0007nl\u0084zÉ@ì®q´@\u0082\u001cï\u009dõ°Ã\u0097)\u001e7C\u001dljïp±^å¤\u001f²D\u0098\u0019åïóÂÙ\u0092'd\r?\u001bd`\u0099NÌT\u009c¢\u001c\u00883\u0096gãæÉ½×\u0094=e\u000b:\u0011\u001e~êDÏR\u008b¸a\u0086Nì\u000bùãÇÌ-ú;d\u0001Co\u0002t\u0096BÆ¨\u008b¶c\u009c0ê\u000b÷ÛÝÇ+ý1]\u001f2e{rªX±¦õ\u008cR\u009a>àuÍÚÛÂ!\u0082\u000fX\u0015\\c\u000bH¬V¯¼÷\u008aX\u0090Yþ\u0001ËÔÑ\u00ad?\u0083\u0005V\u0013-ypFÒ¬¬ºq\u0080Zî*û\u008cÁ¤/¯5}\u0003%iRvó\\Õª£°\u000b\u009eWä&ñ\u008dß¿%¡3x\u0019Mg-L\u0088ZË Ò\u008eq\u0094IâRÏ\u0082Õ¹#¥\t\u0000\u0017I}jJðP¼¾\u0091\u0084q\u0092GøhÅ\u0086Ó°9\u0099\u0007wmF{i@\u0084®Ç´\u0098\u0082\u001cèDönÃê)¶7\u009e\u001dlkBqb^ï¤±²\u0096\u0098jæ3Ì\u0011Ùä'¸\ræ\u001bhaMOcTë¢½\u0088\u0093\u0096iü?Êc×\u0093=¹\u000bâ\u0011d\u007f9E\u0000Ræ¸º\u0086ýìaú7À\n-\u0092;±\u0001\u008bonu1C\u0005¨î¶³\u009c\u008cê(ð;Þz+Ú1Á\u001fýe]s2Yw¦Ü\u008c·\u009a\u0080àUÎ6Ô\u0006!Ú\u000f¯\u0015ñc*I(Wq¼¯\u008aÝ\u0090\u008cþ%Ä+Ò\u0000?¥\u0005Ü\u0013òyWG*¬\u0088º¦\u0080§î\rôVÂ./\u008a5Ö\u0003¥i}w$])ª\u008b°Ä\u009e\u0099ä1òUØ2%´3ò\u0019µgnM[[4 ã\u008e\u0093\u0094ùâ$È\u0018Ön#á\tÆ\u0017\u0089}`KFQ\u001c¾ç\u0084Ò\u0092¡ødÆQ,\n9ç\u0007ÒmÀ{)A\u0017¯Y´µ\u0082\u0087èÜözÜO*\u000e7ù\u001dµkâq\u001e_E¥b²ì\u0098Äæ\u0090ÌlÚ; g\r\u009a\u001b¾a\u0091OjUM£\u0017\u0088\u0097\u0096²ü\u0094ÊeÐL>d\u000b\u0097\u0011½\u007fÿE\u0011S8¹y\u0086ãìÈú\u008dÀf.B4y\u0001\u0092o´u\u0085C\u0010©E·y\u009cªê´ð\u008dÞZ$D2\u007f\u001fÓeÁs÷YZ§1\u008d\u0002\u009a¯àÃÎõÔZ\"_\bp\u0015×cÚIôWV½Y\u008bw\u0090×þ¢ÄõÒ\"8[\u0006\u0000\u0013¢yÞG|\u00adZ»(\u0080øî ôÛÂ\u000f(Q6&\u0003ói¥wÓ]~«_±$\u009eÿä¼ò£Ø}&I\f&\u0019þgÈMÐ[r¡N\u008f/\u0094ôâÌÈ×Öt<E\n\u001f\u0017\u0086}ÉKìQ\u0006¿<\u0085h\u0092ðøÀÆî,\u0005:6\u0000\u0014m\u0083{ÆA\u009e¯\u001aµF\u0083\u0019èèöÌÜ\u0099*b0A\u001ebkêq´_ã¥\u001b³A\u0099fæ\u0099Ì±Ú\u0094 \u0019\u000eI\u0014\u0014a\u009aO¾Uç£\u0013\u0089:\u0097\u0013üáÊ½Ð\u0091>b\u0004I\u0012}\u007fàEÌS\u008d¹d\u0087Jí\túæÀ±.\u00884\u0011\u00026h\u000eu\u0090C²©\u008d·\\\u009d4ë|ðÝÞ½$ÿ2R\u00186fusÙY¿§ò\u008d.\u009b0á\u0003Î®ÔÝ\"ô\b[\u0016*|\u0001I«Wª½\u0083\u008bV\u0091,ÿrÄÒÒß8õ\u0006Zl*yýGÚ\u00ad¯»\u007f\u0081]ï_ôûÂ×(Ó6y\u001cQjVw\u008f]Ó«¦±x\u009fJå%òúØ¾&Ö\f{\u001aH`PMô[Í¡Ô\u008fw\u0095NãPÈöÖÍ<\u009f\nr\u0010:~iKðQÇ¿í\u0085w\u00930ùlÆ\u0084,Å:\u009e\u0000\u007fnKtiA\u009a¯Åµí\u0083néB÷\u0019Üî*Ì0å\u001eldBrc_ä¥´³å\u0099\u001aç>Í\u001aÚí °\u000eç\u0014hbIH\u001cUã£Î\u0089\u0093\u0097\u0012ýHË\u0017Ðá>¸\u0004ø\u0012fx>F\u000eS\u0094¹Ì\u0087\u008cígû1Á\u000b.î4±\u0002\u0089hev2\\\r©¬·Ã\u009d\u008bë^ñ7ß}$Ú2½\u0018÷f]L0Z\u0001§«\u008dµ\u009b\u0082á.Ï*Õp\"Ú\b¯\u0016\u0086|]J-P\u0004½Ñ\u008bª\u0091óÿ&Å[Ó\u00018Ð\u0006®l\rzQ@]\u00adð»Ö\u0081Úï\u000eõTÃ&(ú6Ò\u001c¢j\tpQ^ «ü±Ê\u009f§å{ó<Ù'&÷\fÌ\u001aÖ`\u0004N9T ¡ò\u008fÅ\u0095¡ãrÉ8×j<\u0081\n¹\u0010\u0098~\u0000DOR\u0012¿÷\u0085·\u0093\u009bùpÇA-l:\u0084\u0000²n\u009etnB7¨jµì\u0083Ãé\u009a÷\u0018ÝB+`0ã\u001eÀd\u0096rdXF¦\u001a³è\u0099ºçæÍjÛ1!g\u000e\u009a\u0014ÊbæH\u0013V8¼f\u0089â\u0097ºýãË\u0011Ñ;?\b\u0004\u0091\u0012ÊxýF\u0017¬Jºz\u0087\u0092íÀû\u008bÁf/75\u000b\u0002æh·v\u008a\\]ª5°\u0007\u009d®ëÁñ\u0088ßY%B3t\u0018©f³L\u0085Z_ B\u008e\u0006\u009b¯áØÏ\u0081ÕV#+\t\u0007\u0016×|\u00adJ\u0081PR¾*\u0084v\u0091¡ÿ®ÅðÓW9-\u0006ðlÐz¨@\t®!´X\u0081\u008eïÐõ¢Ã~)&7\"\u001c\u0089j p¡^\r¤<²!\u009fÿåÍó¡Ù\b'C\r,\u001aõ`ÊN¡Tu¢J\u0088W\u0095ñãÊÉì×r=9\u000bk\u0010ó~ÏD\u009cRf¸{\u0086W\u0093ëùÐÇÖ-L;S\u0001\fnùtÒB\u008d¨1¶\u001b\u009cJé¾÷\u008cÝ\u0083+`1W\u001f\u0002dårÏX\u0081¦p\u008c\u0003\u009a\u0002çÿÍ¨Û\u0085!~\u000f)\u0015Ib¾HîVÒ¼<\u008ax\u0090UýñË¶Ñ\u0099?p\u0005J\u0013\rx\u0090F¿¬\u0082ºa\u00806î\nûâÁÃ/ø5`\u00032i}vÙ\\´ª\u0088°Z\u009eGä\u0006ñØß²%\u00863/\u00190gqLØZ· \u0084\u008e]\u0094*â\u000bÏÝÕ¯#ô\t^\u0017/}\u0006JÙP£¾ò\u0084!\u0092.ø\u0006ÅÛÓ¯9{\u0007ZmYz\u0089@¡®¬´s\u0082Tè&õûÃ¢)Ó7\b\u001d'kVpô^Á¤«²\r\u0098KæVóúÙ½'¦\rx\u001b;aTNóT¿¢Ò\u0088\u0006\u0096Hü\u001fÉõ×È=\u009a\u000b\u0007\u0011N\u007f\u001bD\u0080RÅ¸\u0098\u0086\u0001ì4ú\u001dÇó-µ;\u009e\u0001no@u\u001dBà¨Í¶\u009c\u009ckê2ð\u0013Ýì+Î1\u0093\u001fdeOs\u0013X\u009a¦±\u008c\u0093\u009a\u001dà8ÎcÛè!²\u000f\u0096\u0015icOI\u0015Vä¼½\u008aâ\u0090jþ9Ä\u000eÑ\u0097?Ì\u0005\u008c\u0013ay6G\u000f¬çº´\u0080\u008eî\u0014ôDÂ\b/\u00935¶\u0003ÿi(w;]\u000fªÑ°·\u009eüä_ò0Ø\u0005%Ý3³\u0019\u0081g,M6[\u0000 Õ\u008e\u00ad\u0094öâ\\È,Ö\u0002#Ø\t\u00ad\u0017\u0081}PK(Q\u0004¾Ò\u0084©\u0092\u0081øWÆ]Óð9 \u0007§m\u007f{$A'®ý´Õ\u0082Õè\u000bö_ÜT)\u00897ß\u001d¥k\bq@_\"¤\u0089²È\u0098¦æxÌ>Ú-'\u0083\rÉ\u001bÔauOOUP¢\u0081\u0088Ì\u0096\u0090üuÊIÐ\u001e=\u0087\u000bº\u0011ê\u007fpE5S\u001c¸\u0085\u0086³ì\u009eú\u0004À7.m;\u009d\u0001°oìu`CL©\u001f¶é\u009cÆêãðmÞC$\u00101ë\u001fÎeåsdYO§c\u008cï\u009a¼à\u0095ÎlÔ=\"g\u000fä\u0015ÌcæIhWH½`\u008aà\u0090µþ\u0081Ä\u0010ÒL8\u000b\u0005\u0094\u0013Ìy\u0088Gm\u00ad8»\b\u0080\u0096î¸ô\u008aÂ\u0010(56}\u0003Þiºw\u008a]+«F±\t\u009eÜä½òóØ+&>\f\t\u0019«g·M\u0084[\\¡ \u008f\u0007\u0094Ùâ®È\u0087Ö]<_\n\u0002\u0017Ö}ÛK\u0086QX¿X\u0085t\u0092Ûø¯Æ{,V:-\u0007þmÖ{ÚA}¯Vµ'\u0082\u0088è¢ö¨Üx*$0U\u001d\u008akÎq¥_\r¥@³W\u0098÷æÃÌ¥Ú\u0002 J\u000eV\u001bóa»O¡U{£H\u0089\u0010\u0096\u0081üËÊîÐv>:\u0004\u0013\u0011\u0081\u007fÃE\u009aSr¹D\u0087\u001fìÿúÆÀ\u0099.\u001d4C\u0002\u0016oéuÇC\u0096©j·M\u009d\u0019êïðÃÞ\u0097$\u001f2B\u0018\u0014e\u009dsÌY\u0091§k\u008dL\u009bcàèÎ¼Ôâ\"c\b2\u0016ec\u0095I¹W\u0095½`\u008bJ\u0091\nþáÄ\u00adÒ²8u\u0006slfyÞGü".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1446);
        getValidOutputFormatsForInputhNQ4ISI = cArr;
        CoroutineDebuggingKt = 2294444355797891555L;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        $$a = new byte[]{123, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -4, -117};
        $$b = 247;
    }
}
