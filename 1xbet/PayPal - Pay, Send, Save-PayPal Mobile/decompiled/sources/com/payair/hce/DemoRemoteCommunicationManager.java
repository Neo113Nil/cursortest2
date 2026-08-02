package com.payair.hce;

/* loaded from: classes4.dex */
public class DemoRemoteCommunicationManager implements com.payair.hce.VisaRepersoInitializer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static long AlternateContactlessPaymentDataJson = 0;
    private static final java.lang.String CARDPROFILE_DIRECTORY;
    private static final java.lang.String DEFAULT_CONTACTLESS_IMK_KEY = "***REMOVED***";
    private static final java.lang.String DEFAULT_DSRP_IMK_KEY = "***REMOVED***";
    private static final java.lang.String DEFAULT_ICC_ENCRYPTION_KEY = "***REMOVED***";
    private static final java.lang.String DEFAULT_IDN_IMK_KEY = "94C43B6B15047CCBE5407F40B5ABFB80";
    private static final java.lang.String DEMO_PREFERENCE_PIN = "DEMO_PREFERENCE_PIN";
    private static final java.lang.String DEMO_REQUEST_ID = "111";
    private static final java.lang.String DUMMY_DEK_KEY = "***REMOVED***";
    private static final java.lang.String DUMMY_KEY_SET_ID = "***REMOVED***";
    private static char[] DigitizedCardProfile = null;
    private static final java.lang.String LOCAL_ATC_STORAGE = "LOCAL_ATC_STORAGE";
    private static final java.lang.String LOCAL_SUK_FILE_STORAGE = "LOCAL_SUK_FILE_STORAGE";
    private static final java.lang.String MPSDK_ROOT_DIR;
    private static final java.lang.String SOMETHING_WENT_WRONG = "Something went wrong";
    private static final java.lang.String SUK_DIRECTORY;
    private static final java.lang.String TAG;
    private static final java.lang.String VERSION = "version";
    private static long valueOf;
    private static int values;
    private static int writeReplace;
    private com.payair.hce.gotPostData mCardManager;
    private com.payair.hce.setStatusMessage mCommunicationParametersProvider;
    final android.content.Context mContext;
    private com.payair.hce.ExpirationDate mRemoteCommunicationEventListener;
    com.payair.hce.onNewToken mRemoteManagementCrypto;
    private java.util.List<java.lang.String> mUsedCards;
    private com.payair.hce.updateRNSInformation mWalletIdentificationProvider;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 4;
        int i4 = i + 4;
        int i5 = 119 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            i5 = i6;
            int i7 = i4;
            int i8 = 0;
            i5 += -i4;
            i4 = i7;
            i2 = i8;
            int i9 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i4 = bArr[i9];
            i8 = i10;
            i5 += -i4;
            i4 = i7;
            i2 = i8;
            int i92 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(AlternateContactlessPaymentDataJson ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.keyCodeFromString(""), 1921 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, (short) 1, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 428, (char) (31610 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, (short) 0, -1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        java.lang.CharSequence charSequence;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = 2;
        int i5 = i3 % 2;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 67;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i % getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 48, 381 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (62388 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (short) 10, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        charSequence = "";
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3966 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.text.TextUtils.indexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    } else {
                        charSequence = "";
                    }
                    jArr[i7] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 34, android.text.TextUtils.indexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) ((-1) - android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 49, 381 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((byte) 0, (short) 10, -1, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3967, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i8] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 34, 212 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            i4 = 2;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 99) % 128;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 25) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myPid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        writeReplace = 1;
        writeReplace();
        valueOf();
        TAG = com.payair.hce.DemoRemoteCommunicationManager.class.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append(java.io.File.separator);
        sb.append("mpsdk-input-data");
        sb.append(java.io.File.separator);
        MPSDK_ROOT_DIR = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("card_profiles");
        sb2.append(java.io.File.separator);
        CARDPROFILE_DIRECTORY = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("suks");
        sb3.append(java.io.File.separator);
        SUK_DIRECTORY = sb3.toString();
        int i = values + 15;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public DemoRemoteCommunicationManager(android.content.Context context) {
        this.mContext = context;
    }

    public void setCardManager(com.payair.hce.gotPostData gotpostdata) {
        values = (writeReplace + 49) % 128;
        this.mCardManager = gotpostdata;
        restoreDemoCardsFromDatabase();
        int i = values + 19;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public void initialize(com.payair.hce.onNewToken onnewtoken, com.payair.hce.hashCode hashcode, com.payair.hce.ExpirationDate expirationDate, com.payair.hce.setStatusMessage setstatusmessage, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.copydefault copydefaultVar) {
        int i = (values + 109) % 128;
        writeReplace = i;
        this.mRemoteCommunicationEventListener = expirationDate;
        this.mWalletIdentificationProvider = updaternsinformation;
        this.mRemoteManagementCrypto = onnewtoken;
        this.mCommunicationParametersProvider = setstatusmessage;
        int i2 = i + 35;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public void initialize(com.payair.hce.onNewToken onnewtoken, com.payair.hce.hashCode hashcode, com.payair.hce.ExpirationDate expirationDate, com.payair.hce.setStatusMessage setstatusmessage, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.copydefault copydefaultVar, com.payair.hce.getStatusMessage getstatusmessage) {
        int i = values + 19;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            initialize(onnewtoken, hashcode, expirationDate, setstatusmessage, updaternsinformation, copydefaultVar);
        } else {
            initialize(onnewtoken, hashcode, expirationDate, setstatusmessage, updaternsinformation, copydefaultVar);
            throw new java.lang.ArithmeticException();
        }
    }

    public void register() {
        try {
            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("***REMOVED***").DigitizedCardProfile();
            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto;
            final com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, DigitizedCardProfile2}, -1613709807, 1613709820, java.lang.System.identityHashCode(settransitionalpha));
            this.mCommunicationParametersProvider.valueOf(new com.payair.hce.isAutomaticTimeEnabled() { // from class: com.payair.hce.DemoRemoteCommunicationManager.4
                private static int valueOf = 0;
                private static int writeReplace = 1;

                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                    int i4 = ~i;
                    int i5 = (i * (-419)) + (i2 * 421) + ((~(i2 | i3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + ((i2 | i4) * (-420)) + (((~(i2 | (~i3))) | (~(i4 | (~i2)))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                    if (i5 == 1) {
                        com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4 anonymousClass4 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4) objArr[0];
                        int i6 = writeReplace;
                        int i7 = (i6 & (-44)) | ((~i6) & 43);
                        int i8 = (i6 & 43) << 1;
                        valueOf = ((i7 & i8) + (i7 | i8)) % 128;
                        com.payair.hce.isSessionAvailable issessionavailable2 = issessionavailable;
                        valueOf = (((i6 & 36) + (i6 | 36)) - 1) % 128;
                        return issessionavailable2;
                    }
                    if (i5 == 2) {
                        return valueOf(objArr);
                    }
                    if (i5 == 3) {
                        return values(objArr);
                    }
                    com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4 anonymousClass42 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4) objArr[0];
                    int i9 = writeReplace;
                    valueOf = (i9 + 53) % 128;
                    com.payair.hce.isSessionAvailable issessionavailable3 = issessionavailable;
                    int i10 = ((i9 ^ 103) | (i9 & 103)) << 1;
                    int i11 = -((i9 & (-104)) | ((~i9) & 103));
                    valueOf = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                    return issessionavailable3;
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                    int i = writeReplace;
                    int i2 = (((i & (-12)) | ((~i) & 11)) - (~((i & 11) << 1))) - 1;
                    int i3 = i2 % 128;
                    valueOf = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i3 + 67;
                    writeReplace = i4 % 128;
                    if (i4 % 2 != 0) {
                        return "***REMOVED***";
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                    com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4 anonymousClass4 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass4) objArr[0];
                    int i = valueOf;
                    int i2 = ((i ^ 59) | (i & 59)) << 1;
                    int i3 = -((i & (-60)) | ((~i) & 59));
                    int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                    writeReplace = i4;
                    com.payair.hce.isSessionAvailable issessionavailable2 = issessionavailable;
                    int i5 = i4 & 41;
                    int i6 = -(-(i4 | 41));
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    valueOf = i7 % 128;
                    if (i7 % 2 == 0) {
                        return issessionavailable2;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson() {
                    return (com.payair.hce.isSessionAvailable) values(new java.lang.Object[]{this}, 1814010652, -1814010652, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable values() {
                    return (com.payair.hce.isSessionAvailable) values(new java.lang.Object[]{this}, -1457178733, 1457178734, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final com.payair.hce.isSessionAvailable valueOf() {
                    return (com.payair.hce.isSessionAvailable) values(new java.lang.Object[]{this}, -779424669, 779424672, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.isAutomaticTimeEnabled
                public final java.lang.String DigitizedCardProfile() {
                    return (java.lang.String) values(new java.lang.Object[]{this}, -535977089, 535977091, java.lang.System.identityHashCode(this));
                }
            }, "http://127.0.0.1");
            writeReplace = (values + 33) % 128;
        } catch (java.security.GeneralSecurityException unused) {
        }
    }

    public void digitize(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.payair.hce.setNextFocusDownId setnextfocusdownid, boolean z, boolean z2, boolean z3, boolean z4, android.content.Context context) {
        java.lang.String generateExpiryDate = generateExpiryDate(str2, str3);
        com.payair.hce.CardRiskManagementData writeReplace2 = new com.payair.hce.CardRiskManagementData().writeReplace(str);
        com.payair.hce.CardRiskManagementData cardRiskManagementData = (com.payair.hce.CardRiskManagementData) com.payair.hce.CardRiskManagementData.values(new java.lang.Object[]{writeReplace2, generateExpiryDate}, 358732784, -358732784, java.lang.System.identityHashCode(writeReplace2));
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2, objArr);
        com.payair.hce.CardRiskManagementData RecordsJson = cardRiskManagementData.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern()).values(str4).RecordsJson();
        if (!z4) {
            RecordsJson.AlternateContactlessPaymentDataJson();
        }
        if (setnextfocusdownid == com.payair.hce.setNextFocusDownId.AlternateContactlessPaymentDataJson) {
            com.payair.hce.CardRiskManagementData writeReplace3 = RecordsJson.writeReplace();
            RecordsJson = (com.payair.hce.CardRiskManagementData) com.payair.hce.CardRiskManagementData.values(new java.lang.Object[]{writeReplace3}, -1804161744, 1804161746, java.lang.System.identityHashCode(writeReplace3));
        } else if (setnextfocusdownid == com.payair.hce.setNextFocusDownId.values) {
            RecordsJson = RecordsJson.writeReplace();
        } else if (setnextfocusdownid == com.payair.hce.setNextFocusDownId.DigitizedCardProfile) {
            writeReplace = (values + 5) % 128;
            RecordsJson = (com.payair.hce.CardRiskManagementData) com.payair.hce.CardRiskManagementData.values(new java.lang.Object[]{RecordsJson}, -1804161744, 1804161746, java.lang.System.identityHashCode(RecordsJson));
        }
        if (z) {
            int i = values + 45;
            int i2 = i % 128;
            writeReplace = i2;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!z3) {
                values = (i2 + 113) % 128;
                RecordsJson = RecordsJson.DigitizedCardProfile();
            }
        }
        if (z2) {
            RecordsJson = RecordsJson.valueOf();
        }
        if (z3) {
            RecordsJson = RecordsJson.IccPrivateKeyCrtComponentsJson();
        }
        try {
            RecordsJson.DigitizedCardProfile(com.payair.hce.setApplicationLifeCycleData.AlternateContactlessPaymentDataJson("***REMOVED***"));
            java.lang.String SdkCoreAlternateContactlessPaymentDataImpl = RecordsJson.SdkCoreAlternateContactlessPaymentDataImpl();
            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto;
            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("***REMOVED***").DigitizedCardProfile();
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("***REMOVED***").DigitizedCardProfile();
            com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = (com.payair.hce.checkAutomaticTimeSettings) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, DigitizedCardProfile2}, -1372350044, 1372350053, java.lang.System.identityHashCode(settransitionalpha));
            com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto;
            com.payair.hce.checkForSuccess checkforsuccess = (com.payair.hce.checkForSuccess) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.valueOf(SdkCoreAlternateContactlessPaymentDataImpl.getBytes()), checkautomatictimesettings, (com.payair.hce.isSessionAvailable) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("***REMOVED***").DigitizedCardProfile()}, -1613709807, 1613709820, java.lang.System.identityHashCode(settransitionalpha2)), this.mRemoteManagementCrypto}, -1449685080, 1449685081, (int) java.lang.System.currentTimeMillis());
            byte[] digitizedCardId = checkforsuccess.getDigitizedCardId();
            if (digitizedCardId != null) {
                this.mUsedCards.add(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(digitizedCardId).substring(0, 19).replace(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, ""));
            }
            this.mRemoteCommunicationEventListener.DigitizedCardProfile(checkforsuccess, java.util.UUID.randomUUID().toString());
        } catch (android.content.res.Resources.NotFoundException | java.security.GeneralSecurityException unused) {
        }
    }

    public void requestTaskStatusUpdate(java.lang.String str) {
        int i = values + 121;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getCurrentRequestId() {
        int i = values + 41;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public java.lang.String requestReplenish(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        writeReplace = (values + 105) % 128;
        try {
            if (this.mCardManager == null) {
                this.mCardManager = ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace();
            }
            com.payair.hce.sendRequest writeReplace2 = this.mCardManager.writeReplace(str);
            this.mRemoteCommunicationEventListener.valueOf(writeReplace2.AlternateContactlessPaymentDataJson(), DEMO_REQUEST_ID, createDemoTransactionCredentials(getSukFileName(str), writeReplace2.values(), str));
            values = (writeReplace + 115) % 128;
        } catch (com.payair.hce.setSuccessful e) {
            this.mRemoteCommunicationEventListener.AlternateContactlessPaymentDataJson(str, DEMO_REQUEST_ID, "ROLLOVER_IN_PROGRESS", "Failed to create demo transaction credentials - rollover in progress", e);
        } catch (com.payair.hce.setVersion e2) {
            com.payair.hce.ExpirationDate expirationDate = this.mRemoteCommunicationEventListener;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(3 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.os.Process.myTid() >> 22) + 7278), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23, objArr);
            expirationDate.AlternateContactlessPaymentDataJson(str, DEMO_REQUEST_ID, ((java.lang.String) objArr[0]).intern(), "Failed to create demo transaction credentials", e2);
        }
        int i = values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return DEMO_REQUEST_ID;
        }
        throw new java.lang.ArithmeticException();
    }

    private void updateAtcCount(java.lang.String str, int i) {
        android.content.Context context;
        int i2;
        int i3 = values + 43;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            context = this.mContext;
            i2 = 1;
        } else {
            context = this.mContext;
            i2 = 0;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(LOCAL_ATC_STORAGE, i2).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    private int getAtcCount(java.lang.String str) {
        values = (writeReplace + 121) % 128;
        int i = this.mContext.getSharedPreferences(LOCAL_ATC_STORAGE, 0).getInt(str, 1);
        int i2 = values + 91;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return i;
        }
        throw null;
    }

    private void updateSukFileName(java.lang.String str, java.lang.String str2) {
        writeReplace = (values + 27) % 128;
        android.content.SharedPreferences.Editor edit = this.mContext.getSharedPreferences(LOCAL_SUK_FILE_STORAGE, 0).edit();
        edit.putString(str, str2);
        edit.apply();
        int i = writeReplace + 101;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private java.lang.String getSukFileName(java.lang.String str) {
        android.content.Context context;
        int i;
        int i2 = writeReplace + 125;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            context = this.mContext;
            i = 1;
        } else {
            context = this.mContext;
            i = 0;
        }
        return context.getSharedPreferences(LOCAL_SUK_FILE_STORAGE, i).getString(str, null);
    }

    public java.lang.String requestSetPin(java.lang.String str, com.payair.hce.getErrors geterrors) {
        int i = values;
        int i2 = i + 105;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 95;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return DEMO_REQUEST_ID;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String requestChangePin(java.lang.String str, com.payair.hce.getErrors geterrors) {
        int i = (values + 65) % 128;
        writeReplace = i;
        values = (i + 39) % 128;
        return DEMO_REQUEST_ID;
    }

    public java.lang.String requestSetWalletPin(com.payair.hce.getErrors geterrors) {
        int i = writeReplace + 23;
        values = i % 128;
        if (i % 2 == 0) {
            return DEMO_REQUEST_ID;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String requestChangeWalletPin(com.payair.hce.getErrors geterrors) {
        int i = writeReplace + 101;
        values = i % 128;
        if (i % 2 == 0) {
            return DEMO_REQUEST_ID;
        }
        throw null;
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public java.lang.String requestDeleteCard(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        values = (writeReplace + 91) % 128;
        this.mRemoteCommunicationEventListener.values(str, DEMO_REQUEST_ID);
        updateAtcCount(str, 1);
        updateSukFileName(str, null);
        return DEMO_REQUEST_ID;
    }

    public java.lang.String requestSystemHealth() {
        int i = writeReplace + 105;
        values = i % 128;
        if (i % 2 == 0) {
            this.mRemoteCommunicationEventListener.DigitizedCardProfile();
            values = (writeReplace + 57) % 128;
            return DEMO_REQUEST_ID;
        }
        this.mRemoteCommunicationEventListener.DigitizedCardProfile();
        throw null;
    }

    public boolean cancelPendingRequests() {
        int i = writeReplace + 41;
        values = i % 128;
        return i % 2 == 0;
    }

    public com.payair.hce.updateRNSInformation getWalletIdentificationDataProvider() {
        int i = values;
        int i2 = i + 49;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.updateRNSInformation updaternsinformation = this.mWalletIdentificationProvider;
        writeReplace = (i + 45) % 128;
        return updaternsinformation;
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public void processNotificationData(java.lang.String str) {
        values = (writeReplace + 3) % 128;
    }

    @Override // com.payair.hce.copy
    public com.payair.hce.create getRegistrationRequestData(byte[] bArr, com.payair.hce.getErrors geterrors) {
        int i = values + 13;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        values = (i2 + 97) % 128;
        return null;
    }

    public com.payair.hce.checkAutomaticTimeSettings getSetPinRequestData(com.payair.hce.getErrors geterrors) {
        int i = writeReplace;
        int i2 = i + 57;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        values = (i + 91) % 128;
        return null;
    }

    @Override // com.payair.hce.copy
    public void setRegistrationResponseData(com.payair.hce.accesssetFullInitializationDonep accesssetfullinitializationdonep, java.lang.String str) {
        int i = values + 29;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private java.lang.String generateExpiryDate(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(str);
        java.lang.String obj = sb.toString();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.clear();
        calendar.set(1, java.lang.Integer.parseInt(str2));
        calendar.set(2, java.lang.Integer.parseInt(str) - 1);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(calendar.getActualMaximum(5));
        java.lang.String obj2 = sb2.toString();
        writeReplace = (values + 87) % 128;
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.List<com.payair.hce.isNetworkError> createDemoTransactionCredentials(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.payair.hce.setVersion {
        boolean z;
        java.lang.String str4;
        java.lang.Throwable th;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        if (str == null || str.isEmpty()) {
            ((com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis())).writeReplace("Can not find the SUK file against provisioned Card", new java.lang.Object[0]);
            postToastMessageOnUi("Keys will be generated by the application.");
            writeReplace = (values + 125) % 128;
            z = true;
            str4 = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(MPSDK_ROOT_DIR);
            sb.append(SUK_DIRECTORY);
            ?? file = new java.io.File(sb.toString(), str);
            try {
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader((java.io.File) file));
                    try {
                        java.lang.String readJsonFromLocalStorage = readJsonFromLocalStorage(bufferedReader);
                        try {
                            ((com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis())).writeReplace("Provisioned Keys from ".concat(java.lang.String.valueOf(str)), new java.lang.Object[0]);
                            postToastMessageOnUi("Provisioned Keys from ".concat(java.lang.String.valueOf(str)));
                            bufferedReader.close();
                            writeReplace = (values + 27) % 128;
                            z = false;
                            str4 = readJsonFromLocalStorage;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            file = readJsonFromLocalStorage;
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        file = 0;
                    }
                } catch (java.io.IOException unused) {
                    file = 0;
                    postToastMessageOnUi("Keys will be generated by the application.");
                    ((com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis())).writeReplace("Error in reading SUK file ".concat(java.lang.String.valueOf(str)), new java.lang.Object[0]);
                    z = true;
                    str4 = file;
                    if (z) {
                    }
                }
            } catch (java.io.IOException unused2) {
                postToastMessageOnUi("Keys will be generated by the application.");
                ((com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis())).writeReplace("Error in reading SUK file ".concat(java.lang.String.valueOf(str)), new java.lang.Object[0]);
                z = true;
                str4 = file;
                if (z) {
                }
            }
        }
        if (z) {
            values = (writeReplace + 39) % 128;
            return createDemoTransactionCredentials(str2, str3, 5);
        }
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] allCmsCFormattedTransactionCredentials = getAllCmsCFormattedTransactionCredentials(str4, str2);
        if (allCmsCFormattedTransactionCredentials == null) {
            allCmsCFormattedTransactionCredentials = getAllCmsDFormattedTransactionCredentials(str4);
        }
        if (allCmsCFormattedTransactionCredentials != null) {
            int length = allCmsCFormattedTransactionCredentials.length;
            values = (writeReplace + 45) % 128;
            while (i < length) {
                int i2 = writeReplace + 9;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(createTransactionCredentialForLocalStorage(str3, allCmsCFormattedTransactionCredentials[i]));
                    i += 104;
                } else {
                    arrayList.add(createTransactionCredentialForLocalStorage(str3, allCmsCFormattedTransactionCredentials[i]));
                    i++;
                }
            }
            return arrayList;
        }
        createDemoTransactionCredentials(str2, str3, 5);
        android.content.Context context = this.mContext;
        writeReplace = (values + 79) % 128;
        try {
            java.lang.Object[] objArr = {context, "Invalid Transaction Credentials JSON.", 1};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("\uf4b7Ώ춐\uf4d6㍓벩덤\u0ef9৸뾎뙄অ\u0e80멮딤ବβ땓롎ؿX뀦뻳ſ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("뜒拈₡띿\uf7b2\udde1幚쨏䩦\udec5孩촾", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr3);
            java.lang.String str5 = (java.lang.String) objArr3[0];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("痎㡗怋疯\ue8fd蝱ỿ핗袁葖ᯟ툫迭膰ᢵ킑苋躑ᖏ\uddeb脍诰፵\udad1萋裇၏", android.view.KeyEvent.normalizeMetaState(0), objArr4);
            java.lang.Object invoke = cls.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr4[0]), java.lang.CharSequence.class, java.lang.Integer.TYPE).invoke(null, objArr);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b("\uf4b7Ώ춐\uf4d6㍓벩덤\u0ef9৸뾎뙄অ\u0e80멮딤ବβ땓롎ؿX뀦뻳ſ", android.graphics.Color.red(0), objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("誗ဟ囹諤℞꼿蝖Ჱ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
            cls2.getMethod((java.lang.String) objArr6[0], null).invoke(invoke, null);
            return arrayList;
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    private void postToastMessageOnUi(final java.lang.String str) {
        new android.os.Handler(this.mContext.getMainLooper()).post(new java.lang.Runnable() { // from class: com.payair.hce.DemoRemoteCommunicationManager.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int AlternateContactlessPaymentDataJson;
            private static int DigitizedCardProfile;
            private static short[] IccPrivateKeyCrtComponentsJson;
            private static byte[] RecordsJson;
            private static int getAid;
            private static int getProfileVersion;
            private static int valueOf;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                return DigitizedCardProfile(objArr);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
                int i3;
                byte[] bArr = $$a;
                int i4 = s * 2;
                int i5 = (i * 3) + 104;
                int i6 = 4 - (i2 * 4);
                byte[] bArr2 = new byte[1 - i4];
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = 0;
                    i5 += -i6;
                    i6 = i7 + 1;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == 0 - i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i7 = i6;
                    i6 = bArr[i6];
                    i5 += -i6;
                    i6 = i7 + 1;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == 0 - i4) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == 0 - i4) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
                long j;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27, 29 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.red(0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    int i4 = intValue == -1 ? 1 : 0;
                    if (i4 != 0) {
                        byte[] bArr = RecordsJson;
                        long j2 = 0;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i5 = 0;
                            while (i5 < length) {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.Process.myTid() >> 22), 5088 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), (char) android.graphics.Color.red(0))).getMethod("e", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                }
                                bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                i5++;
                                j2 = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = RecordsJson;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 29 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.resolveSize(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                            }
                            intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                        } else {
                            j = -4897270311952305750L;
                            intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                            if (intValue > 0) {
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (valueOf ^ j)) + i4;
                                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile), sb};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj4 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 27, android.graphics.Color.blue(0) + 2364, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                    byte b2 = (byte) ($$a[1] + 1);
                                    byte b3 = b2;
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    a(b2, b3, b3, objArr6);
                                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                byte[] bArr4 = RecordsJson;
                                if (bArr4 != null) {
                                    int length2 = bArr4.length;
                                    byte[] bArr5 = new byte[length2];
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        bArr5[i6] = (byte) (bArr4[i6] ^ (-4897270311952305750L));
                                    }
                                    bArr4 = bArr5;
                                }
                                boolean z = bArr4 != null;
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z) {
                                        byte[] bArr6 = RecordsJson;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    } else {
                                        short[] sArr = IccPrivateKeyCrtComponentsJson;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    }
                                    sb.append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    gettrack2constructiondata.DigitizedCardProfile++;
                                }
                            }
                            objArr[0] = sb.toString();
                        }
                    }
                    j = -4897270311952305750L;
                    if (intValue > 0) {
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass1 anonymousClass1 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass1) objArr[0];
                int i = getProfileVersion;
                int i2 = i & 103;
                int i3 = i | 103;
                getAid = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                android.content.Context context = com.payair.hce.DemoRemoteCommunicationManager.this.mContext;
                java.lang.String str2 = str;
                int i4 = getAid;
                int i5 = i4 + 90;
                getProfileVersion = ((~i5) + (i5 << 1)) % 128;
                int i6 = (i4 | 89) << 1;
                int i7 = -((i4 & (-90)) | ((~i4) & 89));
                getProfileVersion = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
                try {
                    java.lang.Object[] objArr2 = {context, str2, 0};
                    int i8 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                    int i9 = (i8 * (-380)) - 21391;
                    int i10 = (~i9) + (i9 << 1);
                    int i11 = ~identityHashCode;
                    int i12 = i11 & (-56);
                    int i13 = (identityHashCode & 55) | i12;
                    int i14 = identityHashCode & (-56);
                    int i15 = (i14 ^ i13) | (i14 & i13);
                    int i16 = ~i8;
                    int i17 = -(-((((~i15) & i16) | ((~i16) & i15) | (i15 & i16)) * (-381)));
                    int i18 = i10 ^ i17;
                    int i19 = ((i17 & i10) | i18) << 1;
                    int i20 = -i18;
                    int i21 = (i19 & i20) + (i19 | i20);
                    int i22 = (i16 ^ 55) | (i16 & 55);
                    int i23 = ~i22;
                    int i24 = (i22 | i23) & i23;
                    int i25 = i11 ^ (-56);
                    int i26 = (i25 ^ i12) | (i12 & i25);
                    int i27 = ~i26;
                    int i28 = (i26 | i27) & i27;
                    int i29 = ((~i28) & i24) | ((~i24) & i28);
                    int i30 = i24 & i28;
                    int i31 = (i30 ^ i29) | (i30 & i29);
                    int i32 = i16 & (-56);
                    int i33 = (i8 & 55) | i32;
                    int i34 = i8 & (-56);
                    int i35 = ~((i34 ^ i33) | (i34 & i33));
                    int i36 = i31 & i35;
                    int i37 = (((i35 | i31) & (~i36)) | i36) * 381;
                    int i38 = ((i21 | i37) << 1) - (i37 ^ i21);
                    int i39 = (~((i16 ^ (-56)) | i32)) * 381;
                    int i40 = -android.graphics.Color.blue(0);
                    int i41 = i40 & 17;
                    short s = (short) (i41 + ((i40 ^ 17) | i41));
                    int threadPriority = (android.os.Process.getThreadPriority(0) + 20) >> 6;
                    int i42 = threadPriority & 194829093;
                    int i43 = -(-((threadPriority ^ 194829093) | i42));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((i39 | i38) + (i38 & i39), s, ((i42 | i43) << 1) - (i43 ^ i42), android.widget.ExpandableListView.getPackedPositionType(0L) - 1155937013, (byte) android.text.TextUtils.indexOf("", ""), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    int i44 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int i45 = i44 & (-56);
                    int i46 = (i44 | (-56)) & (~i45);
                    int i47 = i45 << 1;
                    int i48 = -android.graphics.Color.red(0);
                    int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass1);
                    int i49 = (i48 * 165) - 9943;
                    int i50 = ~identityHashCode2;
                    int i51 = i50 & 61;
                    int i52 = (~i51) & (i50 | 61);
                    int i53 = ~((i52 & i51) | (i52 ^ i51));
                    int i54 = i48 & i53;
                    int i55 = (i53 | i48) & (~i54);
                    int i56 = -(-(((i55 ^ i54) | (i55 & i54)) * (-328)));
                    int i57 = i49 ^ i56;
                    int i58 = ((i56 & i49) | i57) << 1;
                    int i59 = -i57;
                    int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                    int i61 = -(-((i48 | identityHashCode2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                    int i62 = ((((~i61) & i60) | ((~i60) & i61)) - (~(-(-((i61 & i60) << 1))))) - 1;
                    int i63 = ~i48;
                    int i64 = ~(i63 | (-62));
                    int i65 = identityHashCode2 & (-62);
                    int i66 = (~i65) & (identityHashCode2 | (-62));
                    int i67 = (i66 ^ i65) | (i66 & i65);
                    int i68 = ~i67;
                    int i69 = (i67 | i68) & i68;
                    int i70 = ((~i64) & i69) | ((~i69) & i64);
                    int i71 = i69 & i64;
                    int i72 = (i70 ^ i71) | (i71 & i70);
                    int i73 = (i50 | identityHashCode2) & i50;
                    int i74 = (i63 & i73) | ((~i73) & i48);
                    int i75 = i73 & i48;
                    int i76 = (i74 ^ i75) | (i74 & i75);
                    int i77 = i76 ^ 61;
                    int i78 = i76 & 61;
                    int i79 = ~((i78 ^ i77) | (i78 & i77));
                    int i80 = ((~i79) & i72) | ((~i72) & i79);
                    int i81 = i72 & i79;
                    int i82 = -(-(((i81 ^ i80) | (i81 & i80)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                    short s2 = (short) (((((i62 ^ i82) | (i62 & i82)) << 1) - (~(-(((~i82) & i62) | ((~i62) & i82))))) - 1);
                    int i83 = -android.text.TextUtils.indexOf("", "", 0);
                    int identityHashCode3 = java.lang.System.identityHashCode(anonymousClass1);
                    int i84 = (i83 * (-159)) - 913057895;
                    int i85 = ~i83;
                    int i86 = i85 & 194829113;
                    int i87 = (i85 | 194829113) & (~i86);
                    int i88 = -(~(((i87 ^ i86) | (i87 & i86)) * 160));
                    int i89 = ~identityHashCode3;
                    int i90 = i89 ^ i83;
                    int i91 = i89 & i83;
                    int i92 = (i90 ^ i91) | (i91 & i90);
                    int i93 = ~i92;
                    int i94 = (i92 | i93) & i93;
                    int i95 = ~((i83 ^ 194829113) | (i83 & 194829113));
                    int i96 = i94 & i95;
                    int i97 = (((i84 & i88) + (i84 | i88)) - 1) + ((((i94 | i95) & (~i96)) | i96) * (-160));
                    int i98 = ((~i89) & (-194829114)) | (i89 & 194829113);
                    int i99 = i89 & (-194829114);
                    int i100 = ~((i99 ^ i98) | (i99 & i98));
                    int i101 = i83 & i100;
                    int i102 = (i83 | i100) & (~i101);
                    int i103 = -(-(((i102 ^ i101) | (i102 & i101)) * 160));
                    int i104 = i97 & i103;
                    int i105 = -android.text.TextUtils.indexOf("", "");
                    int identityHashCode4 = java.lang.System.identityHashCode(anonymousClass1);
                    int i106 = i105 * 530;
                    int i107 = i106 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO;
                    int i108 = (i106 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) & (~i107);
                    int i109 = -(-(i107 << 1));
                    int i110 = (i108 ^ i109) + ((i108 & i109) << 1);
                    int i111 = ~identityHashCode4;
                    int i112 = ((~i105) & i111) | ((~i111) & i105);
                    int i113 = i111 & i105;
                    int i114 = ~((i113 ^ i112) | (i113 & i112));
                    int i115 = ~(((-1155937001) & i105) | ((-1155937001) ^ i105));
                    int i116 = i114 ^ i115;
                    int i117 = i114 & i115;
                    int i118 = (((1533712798 ^ i110) + ((i110 & 1533712798) << 1)) - (~(-(-(((i117 ^ i116) | (i117 & i116)) * 529))))) - 1;
                    int i119 = (i105 ^ identityHashCode4) | (i105 & identityHashCode4);
                    int i120 = ~i119;
                    int i121 = (i119 | i120) & i120;
                    int i122 = -(-(((i121 ^ 1155937000) | (1155937000 & i121)) * 529));
                    int i123 = ((i118 ^ i122) | (i118 & i122)) << 1;
                    int i124 = -(((~i122) & i118) | ((~i118) & i122));
                    int i125 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i126 = i125 & 1;
                    int i127 = (i125 | 1) & (~i126);
                    int i128 = -(-(i126 << 1));
                    byte b = (byte) ((i127 ^ i128) + ((i127 & i128) << 1));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(((i46 | i47) << 1) - (i46 ^ i47), s2, i104 + ((i103 ^ i97) | i104), (i123 & i124) + (i124 | i123), b, objArr4);
                    java.lang.String str3 = (java.lang.String) objArr4[0];
                    int i129 = -android.graphics.Color.green(0);
                    int identityHashCode5 = java.lang.System.identityHashCode(anonymousClass1);
                    int i130 = i129 * (-496);
                    int i131 = ((i130 | 27280) << 1) - (i130 ^ 27280);
                    int i132 = ~i129;
                    int i133 = i132 | 54;
                    int i134 = ~i133;
                    int i135 = ((i133 | i134) & i134) * 497;
                    int i136 = (i132 | i129) & i132;
                    int i137 = i136 & 54;
                    int i138 = (~i137) & (i136 | 54);
                    int i139 = (i137 ^ i138) | (i137 & i138);
                    int i140 = i139 & identityHashCode5;
                    int i141 = ~identityHashCode5;
                    int i142 = ~(((~i140) & (i139 | identityHashCode5)) | i140);
                    int i143 = (i141 | identityHashCode5) & i141;
                    int i144 = i143 & 54;
                    int i145 = (~i144) & (i143 | 54);
                    int i146 = (i145 ^ i144) | (i145 & i144);
                    int i147 = i146 & i129;
                    int i148 = (i146 | i129) & (~i147);
                    int i149 = ~((i148 ^ i147) | (i148 & i147));
                    int i150 = i142 & i149;
                    int i151 = (i149 | i142) & (~i150);
                    int i152 = ((((i131 | i135) << 1) - (i131 ^ i135)) - (~(-(~(((i151 ^ i150) | (i151 & i150)) * 497))))) - 2;
                    int i153 = ((~i141) & i132) | ((~i132) & i141);
                    int i154 = i132 & i141;
                    int i155 = ~((i153 ^ i154) | (i153 & i154));
                    int i156 = i136 | (-55);
                    int i157 = ~i156;
                    int i158 = (i156 | i157) & i157;
                    int i159 = i155 & i158;
                    int i160 = (i155 | i158) & (~i159);
                    int i161 = (i160 ^ i159) | (i160 & i159);
                    int i162 = (i129 ^ 54) | (i129 & 54);
                    int i163 = i162 ^ identityHashCode5;
                    int i164 = i162 & identityHashCode5;
                    int i165 = (i164 ^ i163) | (i164 & i163);
                    int i166 = ~i165;
                    int i167 = (i165 | i166) & i166;
                    int i168 = i161 ^ i167;
                    int i169 = i167 & i161;
                    int i170 = ((i169 ^ i168) | (i169 & i168)) * 497;
                    short s3 = (short) ((-2) - (~(71 - (~(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))));
                    int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                    int i171 = 194829121 & capsMode;
                    char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i172 = 52443 ^ mirror;
                    int i173 = -(-((mirror & 52443) << 1));
                    int i174 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i175 = i174 * (-51);
                    int i176 = (i175 & 53) + (i175 | 53);
                    int i177 = ~java.lang.System.identityHashCode(anonymousClass1);
                    int i178 = i177 & i174;
                    int i179 = (~i178) & (i177 | i174);
                    int i180 = (i179 ^ i178) | (i179 & i178);
                    int i181 = (i180 & 1) | (i180 ^ 1);
                    int i182 = ~i181;
                    int i183 = -(~(-(-((i182 & (i181 | i182)) * 52))));
                    int i184 = (((i176 | i183) << 1) - (i183 ^ i176)) - 1;
                    int i185 = ~((i177 ^ (-2)) | (i177 & (-2)));
                    int i186 = ~i174;
                    int i187 = (i186 & (-2)) | (i174 & 1);
                    int i188 = i174 & (-2);
                    int i189 = ~((i187 ^ i188) | (i187 & i188));
                    int i190 = ((~i189) & i185) | ((~i185) & i189);
                    int i191 = i185 & i189;
                    int i192 = ((~i180) | (i191 ^ i190) | (i191 & i190)) * (-52);
                    int i193 = i184 | i192;
                    int i194 = i186 & i177;
                    int i195 = i194 | ((i177 | i186) & (~i194));
                    int i196 = ~i195;
                    int i197 = (i195 | i196) & i196;
                    int i198 = i186 & 1;
                    int i199 = (~i198) & (i186 | 1);
                    int i200 = ~((i198 ^ i199) | (i198 & i199));
                    int i201 = ((~i200) & i197) | ((~i197) & i200);
                    int i202 = i197 & i200;
                    byte b2 = (byte) ((((i193 << 1) - ((~(i192 & i184)) & i193)) - (~(-(~(-(-(((i202 & i201) | (i201 ^ i202)) * 52))))))) - 2);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(((((~i170) & i152) | ((~i152) & i170)) - (~((i170 & i152) << 1))) - 1, s3, ((194829121 ^ capsMode) | i171) + i171, ((i172 | i173) << 1) - (i173 ^ i172), b2, objArr5);
                    java.lang.Object invoke = cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr5[0]), java.lang.CharSequence.class, java.lang.Integer.TYPE).invoke(null, objArr2);
                    int i203 = getAid;
                    getProfileVersion = ((i203 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i203 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                    int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                    int i204 = resolveSizeAndState & (-55);
                    int i205 = ((resolveSizeAndState ^ (-55)) | i204) << 1;
                    int i206 = -((~i204) & (resolveSizeAndState | (-55)));
                    int i207 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int identityHashCode6 = java.lang.System.identityHashCode(anonymousClass1);
                    int i208 = (-2) - (~((-964) - (~(i207 * (-963)))));
                    int i209 = ((i208 ^ 17370) | (i208 & 17370)) << 1;
                    int i210 = -((i208 & (-17371)) | ((~i208) & 17370));
                    int i211 = (i209 & i210) + (i210 | i209);
                    int i212 = ~i207;
                    int i213 = ~(identityHashCode6 | (-19));
                    int i214 = ((~i213) & i212) | ((~i212) & i213);
                    int i215 = i212 & i213;
                    int i216 = -(-(((i215 ^ i214) | (i215 & i214)) * (-964)));
                    int i217 = i211 & i216;
                    int i218 = (i217 - (~((i216 ^ i211) | i217))) - 1;
                    int i219 = ~identityHashCode6;
                    int i220 = (identityHashCode6 | i219) & i219;
                    int i221 = ((~i220) & (-19)) | (i220 & 18);
                    int i222 = i220 & (-19);
                    int i223 = ~((i222 ^ i221) | (i222 & i221));
                    int i224 = ~((i207 ^ (-19)) | (i207 & (-19)));
                    int i225 = ((~i224) & i223) | ((~i223) & i224);
                    int i226 = i224 & i223;
                    int i227 = -(-(((i226 ^ i225) | (i226 & i225)) * (-964)));
                    short s4 = (short) ((i218 & i227) + (i227 | i218));
                    int red = android.graphics.Color.red(0);
                    int identityHashCode7 = java.lang.System.identityHashCode(anonymousClass1);
                    int i228 = red * 70;
                    int i229 = (-363476436) & i228;
                    int i230 = (((((-363476436) ^ i228) | i229) << 1) - (~(-((i228 | (-363476436)) & (~i229))))) - 1;
                    int i231 = ~red;
                    int i232 = i231 & 194829093;
                    int i233 = ~i231;
                    int i234 = (i233 & (-194829094)) | i232;
                    int i235 = i231 & (-194829094);
                    int i236 = (i234 ^ i235) | (i234 & i235);
                    int i237 = ~identityHashCode7;
                    int i238 = ((~i236) & identityHashCode7) | (i236 & i237);
                    int i239 = i236 & identityHashCode7;
                    int i240 = (red ^ 194829093) | (red & 194829093);
                    int i241 = -(~(((~((i239 & i238) | (i238 ^ i239))) | (~((i240 & identityHashCode7) | (i240 ^ identityHashCode7)))) * 69));
                    int i242 = (((i230 | i241) << 1) - (i241 ^ i230)) - 1;
                    int i243 = i235 | (i233 & 194829093);
                    int i244 = ~((i243 ^ i232) | (i232 & i243));
                    int i245 = (i233 & identityHashCode7) | (i231 & i237);
                    int i246 = i231 & identityHashCode7;
                    int i247 = ~((i246 ^ i245) | (i246 & i245));
                    int i248 = i244 & i247;
                    int i249 = (i244 | i247) & (~i248);
                    int i250 = (i249 ^ i248) | (i249 & i248);
                    int i251 = identityHashCode7 & 194829093;
                    int i252 = (identityHashCode7 | 194829093) & (~i251);
                    int i253 = ~((i252 ^ i251) | (i252 & i251));
                    int i254 = -(-(((i250 ^ i253) | (i253 & i250)) * (-69)));
                    int i255 = i242 & i254;
                    int i256 = -(-((i254 ^ i242) | i255));
                    int i257 = ((i255 | i256) << 1) - (i256 ^ i255);
                    int i258 = red & (-194829094);
                    int i259 = (red | (-194829094)) & (~i258);
                    int i260 = (~((i258 ^ i259) | (i259 & i258))) * 69;
                    int i261 = i257 & i260;
                    int i262 = i260 | i257;
                    int i263 = -android.view.MotionEvent.axisFromString("");
                    int identityHashCode8 = java.lang.System.identityHashCode(anonymousClass1);
                    int i264 = i263 * 55;
                    int i265 = (-868791086) & i264;
                    int i266 = -(-((i264 ^ (-868791086)) | i265));
                    int i267 = ((i265 | i266) << 1) - (i266 ^ i265);
                    int i268 = ~i263;
                    int i269 = (i268 & 1155937013) | ((~i268) & (-1155937014));
                    int i270 = i268 & (-1155937014);
                    int i271 = ~((i269 ^ i270) | (i269 & i270));
                    int i272 = ~identityHashCode8;
                    int i273 = ~i272;
                    int i274 = (i272 & 1155937013) | (i273 & (-1155937014));
                    int i275 = (-1155937014) & i272;
                    int i276 = ~((i275 ^ i274) | (i275 & i274));
                    int i277 = ((i271 ^ i276) | (i271 & i276)) * (-108);
                    int i278 = i267 & i277;
                    int i279 = (i267 | i277) & (~i278);
                    int i280 = i278 << 1;
                    int i281 = (i279 & i280) + (i279 | i280);
                    int i282 = i268 ^ identityHashCode8;
                    int i283 = i268 & identityHashCode8;
                    int i284 = ~((i282 ^ i283) | (i282 & i283));
                    int i285 = i263 & 1155937013;
                    int i286 = ~((i263 ^ 1155937013) | i285);
                    int i287 = (i284 ^ i286) | (i284 & i286);
                    int i288 = (i268 & i272) | (i273 & i263);
                    int i289 = i272 & i263;
                    int i290 = ~((i288 ^ i289) | (i288 & i289));
                    int i291 = i287 ^ i290;
                    int i292 = i290 & i287;
                    int i293 = ((i292 ^ i291) | (i292 & i291)) * 54;
                    int i294 = i281 ^ i293;
                    int i295 = ((i293 & i281) | i294) << 1;
                    int i296 = -i294;
                    int i297 = (i295 ^ i296) + ((i295 & i296) << 1);
                    int i298 = (i263 | 1155937013) & (~i285);
                    int i299 = (i298 ^ i285) | (i298 & i285);
                    int i300 = ~i299;
                    int i301 = (i299 | i300) & i300;
                    int i302 = ((i301 ^ identityHashCode8) | (i301 & identityHashCode8)) * 54;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(((i206 & i205) << 1) + (i205 ^ i206), s4, (i261 & i262) + (i262 | i261), (((i297 ^ i302) | (i297 & i302)) << 1) - (((~i297) & i302) | ((~i302) & i297)), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    int i303 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int identityHashCode9 = java.lang.System.identityHashCode(anonymousClass1);
                    int i304 = i303 * (-1335);
                    int i305 = 36685 & i304;
                    int i306 = -(-((i304 ^ 36685) | i305));
                    int i307 = ((i305 | i306) << 1) - (i306 ^ i305);
                    int i308 = ((~identityHashCode9) & i303) | ((~i303) & identityHashCode9);
                    int i309 = i303 & identityHashCode9;
                    int i310 = -(-(((~((i308 ^ i309) | (i308 & i309))) | 54) * (-668)));
                    int i311 = (i307 & i310) + (i310 | i307);
                    int i312 = identityHashCode9 ^ 54;
                    int i313 = identityHashCode9 & 54;
                    int i314 = ~((i312 ^ i313) | (i312 & i313));
                    int i315 = i303 ^ i314;
                    int i316 = i314 & i303;
                    int i317 = ((i316 ^ i315) | (i316 & i315)) * 1336;
                    int i318 = (((~i317) & i311) | ((~i311) & i317)) + ((i317 & i311) << 1);
                    int i319 = i303 ^ identityHashCode9;
                    int i320 = (i319 ^ i309) | (i319 & i309);
                    int i321 = ((i320 ^ 54) | (i320 & 54)) * 668;
                    int i322 = i318 & i321;
                    short s5 = (short) (60 - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int identityHashCode10 = java.lang.System.identityHashCode(anonymousClass1);
                    int i323 = maximumDrawingCacheSize * 471;
                    int i324 = (i323 ^ 1570213608) | (1570213608 & i323);
                    int i325 = maximumDrawingCacheSize & 194829144;
                    int i326 = (~i325) & (maximumDrawingCacheSize | 194829144);
                    int i327 = -(~(((i325 ^ i326) | (i325 & i326)) * (-470)));
                    int i328 = ~maximumDrawingCacheSize;
                    int i329 = i328 & (-194829145);
                    int i330 = (~i329) & (i328 | (-194829145));
                    int i331 = ~((i329 & i330) | (i329 ^ i330));
                    int i332 = identityHashCode10 & (-194829145);
                    int i333 = (~i332) & (identityHashCode10 | (-194829145));
                    int i334 = ~((i333 ^ i332) | (i333 & i332));
                    int i335 = (i334 ^ i331) | (i331 & i334);
                    int i336 = ~identityHashCode10;
                    int i337 = (i328 & i336) | ((~i336) & maximumDrawingCacheSize) | (i336 & maximumDrawingCacheSize);
                    int i338 = ((~i337) & 194829144) | (i337 & (-194829145));
                    int i339 = i337 & 194829144;
                    int i340 = ~((i338 & i339) | (i339 ^ i338));
                    int i341 = i335 & i340;
                    int i342 = (((((r9 | i324) << 1) - (i324 ^ r9)) - (~i327)) - 2) + ((((i340 | i335) & (~i341)) | i341) * (-470));
                    int i343 = maximumDrawingCacheSize & (-194829145);
                    int i344 = (~i343) & (maximumDrawingCacheSize | (-194829145));
                    int i345 = (i343 ^ i344) | (i343 & i344);
                    int i346 = i345 ^ identityHashCode10;
                    int i347 = i345 & identityHashCode10;
                    int i348 = ~((i347 ^ i346) | (i347 & i346));
                    int i349 = (identityHashCode10 | i336) & i336;
                    int i350 = i349 & maximumDrawingCacheSize;
                    int i351 = (maximumDrawingCacheSize | i349) & (~i350);
                    int i352 = (i351 ^ i350) | (i351 & i350);
                    int i353 = i352 & 194829144;
                    int i354 = ~(((i352 | 194829144) & (~i353)) | i353);
                    int i355 = ((i354 ^ i348) | (i354 & i348)) * 470;
                    int i356 = -android.view.KeyEvent.keyCodeFromString("");
                    int identityHashCode11 = java.lang.System.identityHashCode(anonymousClass1);
                    int i357 = i356 * 503;
                    int i358 = ~i356;
                    int i359 = i358 & (-1155936995);
                    int i360 = (1155936994 & i356) | i359;
                    int i361 = i356 & (-1155936995);
                    int i362 = (i360 ^ i361) | (i360 & i361);
                    int i363 = (-2) - (~(((((-1615723524) ^ i357) + ((i357 & (-1615723524)) << 1)) - 1) - (~(i362 * (-502)))));
                    int i364 = ((~i358) & 1155936994) | i359;
                    int i365 = 1155936994 & i358;
                    int i366 = ~((i364 & i365) | (i364 ^ i365));
                    int i367 = ~identityHashCode11;
                    int i368 = (i367 | identityHashCode11) & i367;
                    int i369 = i358 & i368;
                    int i370 = (~i369) & (i368 | i358);
                    int i371 = ~((i369 ^ i370) | (i369 & i370));
                    int i372 = (i371 ^ i366) | (i371 & i366);
                    int i373 = ~((i362 & i367) | ((~i362) & identityHashCode11) | (i362 & identityHashCode11));
                    int i374 = i372 & i373;
                    int i375 = (i372 | i373) & (~i374);
                    int i376 = -(-(((i375 ^ i374) | (i375 & i374)) * (-502)));
                    int i377 = i363 ^ i376;
                    int i378 = (i376 & i363) << 1;
                    int i379 = (i377 & i378) + (i378 | i377);
                    int i380 = i358 & i367;
                    int i381 = (i358 | i367) & (~i380);
                    int i382 = (i380 ^ i381) | (i381 & i380);
                    int i383 = i382 ^ (-1155936995);
                    int i384 = i382 & (-1155936995);
                    int i385 = ~((i384 ^ i383) | (i384 & i383));
                    int i386 = (-1155936995) ^ i356;
                    int i387 = (i386 ^ i361) | (i386 & i361);
                    int i388 = (i387 & i367) | ((~i387) & identityHashCode11);
                    int i389 = i387 & identityHashCode11;
                    int i390 = (i389 ^ i388) | (i389 & i388);
                    int i391 = ~i390;
                    int i392 = (i390 | i391) & i391;
                    int i393 = ((~i392) & i385) | ((~i385) & i392);
                    int i394 = i385 & i392;
                    int i395 = ((i394 ^ i393) | (i394 & i393)) * 502;
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    int i396 = bitsPerPixel & 1;
                    int i397 = -(-((bitsPerPixel ^ 1) | i396));
                    byte b3 = (byte) ((i396 & i397) + (i396 | i397));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(i322 + ((i321 ^ i318) | i322), s5, (i342 & i355) + (i355 | i342), (i379 & i395) + (i395 | i379), b3, objArr7);
                    cls2.getMethod((java.lang.String) objArr7[0], null).invoke(invoke, null);
                    return null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }

            static {
                init$0();
                getAid = 0;
                getProfileVersion = 1;
                valueOf = -345565839;
                AlternateContactlessPaymentDataJson = 520368540;
                DigitizedCardProfile = 1541538556;
                RecordsJson = new byte[]{116, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -85, 75, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 3, 84, 71, 88, 64, 75, -110, 19, 64, 67, 70, 87, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 86, 120, com.google.common.base.Ascii.NAK, 124, 126, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, 103, com.google.common.base.Ascii.GS, 75, com.google.common.base.Ascii.US, 102, 0, com.google.common.base.Ascii.NAK, 18, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 100, -39, com.google.common.base.Ascii.NAK, 104, 0, com.google.common.base.Ascii.NAK, 18, 111, 68, 41, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, 109, 5, 108, 100, 102, 97, 19};
            }

            static void init$0() {
                $$a = new byte[]{18, -1, 36, -56};
                $$b = 142;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DigitizedCardProfile(new java.lang.Object[]{this}, -1207126629, 1207126629, java.lang.System.identityHashCode(this));
            }
        });
        writeReplace = (values + 113) % 128;
    }

    private java.util.List<com.payair.hce.isNetworkError> createDemoTransactionCredentials(java.lang.String str, final java.lang.String str2, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        java.lang.String replace = str.substring(0, 19).replace(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "");
        com.payair.hce.CmsDSessionData cmsDSessionData = new com.payair.hce.CmsDSessionData();
        cmsDSessionData.values(str).writeReplace(readContactlessImk(replace)).valueOf(readDsrpImk(replace)).SdkCoreAlternateContactlessPaymentDataImpl(readIdnImk(replace)).AlternateContactlessPaymentDataJson(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(getMobilePin(str2)).writeReplace());
        int atcCount = getAtcCount(str2);
        int i3 = i + atcCount;
        com.payair.hce.ReplenishResponseEncrypted[] AlternateContactlessPaymentDataJson2 = cmsDSessionData.AlternateContactlessPaymentDataJson(atcCount, i3);
        updateAtcCount(str2, i3);
        int length = AlternateContactlessPaymentDataJson2.length;
        while (i2 < length) {
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = AlternateContactlessPaymentDataJson2[i2];
            final com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredentialData = getTransactionCredentialData((com.payair.hce.getIccKek) com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted}, 1219330914, -1219330912, java.lang.System.identityHashCode(replenishResponseEncrypted)));
            arrayList.add(new com.payair.hce.isNetworkError() { // from class: com.payair.hce.DemoRemoteCommunicationManager.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10;
                private static int $11;
                private static long AlternateContactlessPaymentDataJson;
                private static char RecordsJson;
                private static int SdkCoreAlternateContactlessPaymentDataImpl;
                private static int getAid;
                private static int values;

                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i4, int i5, int i6) {
                    int i7 = ~i4;
                    int i8 = ~i5;
                    int i9 = ~i6;
                    int i10 = ~(i6 | i4);
                    if ((i4 * (-519)) + (i5 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i5 | i6)) | (~(i7 | i8 | i9))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + (((~(i8 | i9)) | i10) * (-1040)) + (((~(i4 | i8)) | (~(i7 | i9)) | i10) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) != 1) {
                        return AlternateContactlessPaymentDataJson(objArr);
                    }
                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 61) % 128;
                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("0000").DigitizedCardProfile();
                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 41) % 128;
                    return DigitizedCardProfile2;
                }

                private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
                    int i4 = 106 - s;
                    byte[] bArr = $$a;
                    int i5 = 4 - (s3 * 3);
                    int i6 = s2 * 4;
                    byte[] bArr2 = new byte[1 - i6];
                    int i7 = 0 - i6;
                    int i8 = -1;
                    if (bArr == null) {
                        i5++;
                        i4 = i7 + (-i5);
                    }
                    while (true) {
                        i8++;
                        bArr2[i8] = (byte) i4;
                        if (i8 == i7) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        } else {
                            int i9 = bArr[i5];
                            i5++;
                            i4 += -i9;
                        }
                    }
                }

                private static void a(java.lang.String str3, java.lang.String str4, java.lang.String str5, int i4, char c, java.lang.Object[] objArr) {
                    char[] cArr;
                    char[] cArr2;
                    char c2;
                    if (str5 != null) {
                        $11 = ($10 + 49) % 128;
                        cArr = str5.toCharArray();
                    } else {
                        cArr = str5;
                    }
                    char[] cArr3 = cArr;
                    java.lang.Object obj = null;
                    if (str4 != null) {
                        int i5 = $11 + 71;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        cArr2 = str4.toCharArray();
                    } else {
                        cArr2 = str4;
                    }
                    char[] cArr4 = cArr2;
                    char[] charArray = str3 != null ? str3.toCharArray() : str3;
                    com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
                    int length2 = cArr3.length;
                    char[] cArr5 = new char[length2];
                    int length3 = charArray.length;
                    char[] cArr6 = new char[length3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length2);
                    java.lang.System.arraycopy(charArray, 0, cArr6, 0, length3);
                    cArr5[0] = (char) (cArr5[0] ^ c);
                    cArr6[2] = (char) (cArr6[2] + ((char) i4));
                    int length4 = cArr4.length;
                    char[] cArr7 = new char[length4];
                    getwalletdata.writeReplace = 0;
                    while (getwalletdata.writeReplace < length4) {
                        $10 = ($11 + 93) % 128;
                        try {
                            java.lang.Object[] objArr2 = {getwalletdata};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                            if (obj2 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 71, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1179, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                byte length5 = (byte) $$a.length;
                                byte b = (byte) (length5 - 4);
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                b(length5, b, b, objArr3);
                                obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                            java.lang.Object[] objArr4 = {getwalletdata};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 31, 3443 - android.view.View.resolveSize(0, 0), (char) (android.view.View.combineMeasuredStates(0, 0) + 3831))).getMethod("g", java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                            java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                            if (obj4 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 26, 1864 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.graphics.Color.alpha(0) + 41775));
                                byte b2 = (byte) ($$b & 1);
                                byte b3 = (byte) (b2 - 1);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                b(b2, b3, b3, objArr6);
                                obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                            java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                            if (obj5 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.combineMeasuredStates(0, 0) + 3133, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                b((short) 0, (short) 0, (short) 0, objArr8);
                                c2 = 2;
                                obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                            } else {
                                c2 = 2;
                            }
                            cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                            cArr5[intValue2] = getwalletdata.values;
                            cArr7[getwalletdata.writeReplace] = (char) ((((int) (values ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (RecordsJson ^ 1263759066225628708L)));
                            getwalletdata.writeReplace++;
                            cArr4 = cArr4;
                            obj = null;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new java.lang.String(cArr7);
                }

                @Override // com.payair.hce.isNetworkError
                public final java.lang.String writeReplace() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(java.lang.String.format(java.util.Locale.getDefault(), "%04d", java.lang.Integer.valueOf(transactionCredentialData.getAtc()))).writeReplace());
                    sb.append(com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.MockData.MOCK_EXPIRED_OTP);
                    java.lang.String obj = sb.toString();
                    int i4 = getAid + 27;
                    SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                    if (i4 % 2 != 0) {
                        return obj;
                    }
                    throw null;
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] valueOf() {
                    java.lang.Object obj;
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 15;
                    getAid = i4 % 128;
                    if (i4 % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "\ue365孴", "庺嚂\uf5d1ᒥ", android.graphics.Color.argb(0, 0, 1, 1), (char) ((android.view.ViewConfiguration.getTouchSlop() % 15) * 42485), objArr);
                        obj = objArr[0];
                    } else {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "\ue365孴", "庺嚂\uf5d1ᒥ", android.graphics.Color.argb(0, 0, 0, 0), (char) (42485 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr2);
                        obj = objArr2[0];
                    }
                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(((java.lang.String) obj).intern()).DigitizedCardProfile();
                    int i5 = getAid + 63;
                    SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
                    if (i5 % 2 != 0) {
                        return DigitizedCardProfile2;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] values() {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 107;
                    getAid = i4 % 128;
                    try {
                        if (i4 % 2 != 0) {
                            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getContactlessUmdSingleUseKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                            throw null;
                        }
                        com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, transactionCredentialData.getContactlessUmdSingleUseKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha2));
                        byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2));
                        int i5 = SdkCoreAlternateContactlessPaymentDataImpl + 55;
                        getAid = i5 % 128;
                        if (i5 % 2 == 0) {
                            return bArr;
                        }
                        throw new java.lang.ArithmeticException();
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] AlternateContactlessPaymentDataJson() {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 3) % 128;
                    try {
                        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getDsrpUmdSingleUseKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                        byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                        int i4 = getAid + 89;
                        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                        if (i4 % 2 != 0) {
                            return bArr;
                        }
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] DigitizedCardProfile() {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 91) % 128;
                    try {
                        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getContactlessMdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                        byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                        int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 97;
                        getAid = i4 % 128;
                        if (i4 % 2 == 0) {
                            return bArr;
                        }
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] getAid() {
                    int i4 = getAid + 79;
                    SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                    try {
                        if (i4 % 2 != 0) {
                            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getDsrpMdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                            return (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                        }
                        com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, transactionCredentialData.getDsrpMdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha2));
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] RecordsJson() {
                    int i4 = getAid + 115;
                    SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                    try {
                        if (i4 % 2 != 0) {
                            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getContactlessUmdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                            return (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                        }
                        com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, transactionCredentialData.getContactlessUmdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha2));
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 39;
                    getAid = i4 % 128;
                    try {
                        if (i4 % 2 == 0) {
                            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getDsrpUmdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                            return (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                        }
                        com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, transactionCredentialData.getDsrpUmdSessionKey()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha2));
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] IccPrivateKeyCrtComponentsJson() {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 99;
                    getAid = i4 % 128;
                    try {
                        if (i4 % 2 == 0) {
                            com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, transactionCredentialData.getIdn()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
                            byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk));
                            int i5 = SdkCoreAlternateContactlessPaymentDataImpl + 25;
                            getAid = i5 % 128;
                            if (i5 % 2 == 0) {
                                return bArr;
                            }
                            throw null;
                        }
                        com.payair.hce.setTransitionAlpha settransitionalpha2 = (com.payair.hce.setTransitionAlpha) com.payair.hce.DemoRemoteCommunicationManager.this.mRemoteManagementCrypto;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha2, transactionCredentialData.getIdn()}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha2));
                        throw null;
                    } catch (java.security.GeneralSecurityException unused) {
                        return null;
                    }
                }

                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                    com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass2 anonymousClass2 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass2) objArr[0];
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 43;
                    getAid = i4 % 128;
                    com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential = transactionCredentialData;
                    if (i4 % 2 == 0) {
                        return java.lang.Integer.valueOf(transactionCredential.getAtc());
                    }
                    transactionCredential.getAtc();
                    throw null;
                }

                @Override // com.payair.hce.isNetworkError
                public final void getGpoResponse() {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 13;
                    getAid = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    getAid = 0;
                    SdkCoreAlternateContactlessPaymentDataImpl = 1;
                    AlternateContactlessPaymentDataJson = 1263759066225628708L;
                    values = -804334044;
                    RecordsJson = (char) 56700;
                }

                @Override // com.payair.hce.isNetworkError
                public final byte[] SdkCoreBusinessLogicModuleImpl() {
                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -292554996, 292554997, java.lang.System.identityHashCode(this));
                }

                static void init$0() {
                    $$a = new byte[]{3, -32, -117, 13};
                    $$b = 39;
                }

                @Override // com.payair.hce.isNetworkError
                public final int getProfileVersion() {
                    return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 779464938, -779464938, java.lang.System.identityHashCode(this))).intValue();
                }
            });
            i2++;
            values = (writeReplace + 19) % 128;
        }
        return arrayList;
    }

    private com.payair.hce.checkForSuccess getDigitizedCardProfile(java.lang.String str) {
        values = (writeReplace + 65) % 128;
        com.payair.hce.checkForSuccess cmsCFormattedDigitizedCardProfile = getCmsCFormattedDigitizedCardProfile(str);
        if (cmsCFormattedDigitizedCardProfile != null) {
            return cmsCFormattedDigitizedCardProfile;
        }
        int i = values + 37;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            getCmsDFormattedDigitizedCardProfile(str);
            throw null;
        }
        com.payair.hce.checkForSuccess cmsDFormattedDigitizedCardProfile = getCmsDFormattedDigitizedCardProfile(str);
        writeReplace = (values + 9) % 128;
        return cmsDFormattedDigitizedCardProfile;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.payair.hce.checkForSuccess getCmsCFormattedDigitizedCardProfile(java.lang.String str) {
        com.payair.hce.checkForSuccess digitizedCard;
        int i;
        values = (writeReplace + 45) % 128;
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto;
        if (str.contains("version")) {
            try {
                if (new org.json.JSONObject(str).getJSONObject("cardProfile").getString("version").trim().equalsIgnoreCase(com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile.toString())) {
                    digitizedCard = new com.payair.hce.CardProfileMdesCmsCV2().getDigitizedCard(str, settransitionalpha);
                    i = writeReplace + 67;
                    values = i % 128;
                    if (i % 2 != 0) {
                        return digitizedCard;
                    }
                    throw null;
                }
            } catch (org.json.JSONException unused) {
                return null;
            }
        }
        digitizedCard = null;
        i = writeReplace + 67;
        values = i % 128;
        if (i % 2 != 0) {
        }
    }

    private com.payair.hce.checkForSuccess getCmsDFormattedDigitizedCardProfile(java.lang.String str) {
        com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json valueOf2;
        java.lang.Object values2;
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto;
        if (!str.contains("version")) {
            return null;
        }
        try {
            if (!new org.json.JSONObject(str).getJSONObject("cardProfile").getString("version").trim().equalsIgnoreCase("2.0")) {
                return null;
            }
            int i = values + 121;
            writeReplace = i % 128;
            if (i % 2 == 0) {
                valueOf2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.valueOf(str.getBytes());
                values2 = com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, readIccEncryptionKey(valueOf2.mchipCardProfile.commonData.digitizedCardId.substring(1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE))}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
            } else {
                valueOf2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.valueOf(str.getBytes());
                values2 = com.payair.hce.setTransitionAlpha.values(new java.lang.Object[]{settransitionalpha, readIccEncryptionKey(valueOf2.mchipCardProfile.commonData.digitizedCardId.substring(0, 16))}, 202220383, -202220375, java.lang.System.identityHashCode(settransitionalpha));
            }
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) values2;
            new com.payair.hce.setFocusableInTouchMode();
            com.payair.hce.checkForSuccess checkforsuccess = (com.payair.hce.checkForSuccess) com.payair.hce.setFocusableInTouchMode.valueOf(new java.lang.Object[]{valueOf2, initializevisapaymentsdk, settransitionalpha}, -2013748298, 2013748300, (int) java.lang.System.currentTimeMillis());
            int i2 = values + 75;
            writeReplace = i2 % 128;
            if (i2 % 2 != 0) {
                return checkforsuccess;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.security.GeneralSecurityException | org.json.JSONException unused) {
            return null;
        }
    }

    private byte[] readIccEncryptionKey(java.lang.String str) {
        values = (writeReplace + 111) % 128;
        try {
            byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(readValue(str, "icc-encryption-key"));
            int i = values + 57;
            writeReplace = i % 128;
            if (i % 2 != 0) {
                return writeReplace2;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.payair.hce.getTokenInfo unused) {
            return com.payair.hce.stopService.writeReplace("***REMOVED***");
        }
    }

    private java.lang.String readContactlessImk(java.lang.String str) {
        int i = writeReplace + 109;
        values = i % 128;
        try {
            if (i % 2 == 0) {
                return readValue(str, "imk-cl");
            }
            readValue(str, "imk-cl");
            throw new java.lang.NullPointerException();
        } catch (com.payair.hce.getTokenInfo unused) {
            return "***REMOVED***";
        }
    }

    private java.lang.String readDsrpImk(java.lang.String str) {
        writeReplace = (values + 121) % 128;
        try {
            java.lang.String readValue = readValue(str, "imk-dsrp");
            int i = values + 63;
            writeReplace = i % 128;
            if (i % 2 != 0) {
                return readValue;
            }
            throw null;
        } catch (com.payair.hce.getTokenInfo unused) {
            return "***REMOVED***";
        }
    }

    private java.lang.String readIdnImk(java.lang.String str) {
        writeReplace = (values + 33) % 128;
        try {
            java.lang.String readValue = readValue(str, "imk-idn");
            values = (writeReplace + 97) % 128;
            return readValue;
        } catch (com.payair.hce.getTokenInfo unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (65104 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 32 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
    }

    private com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] getAllCmsCFormattedTransactionCredentials(java.lang.String str, java.lang.String str2) {
        try {
            com.payair.hce.setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = (com.payair.hce.setAllowedHandwritingDelegatePackage) com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf(new java.lang.Object[]{str}, -965814242, 965814246, (int) java.lang.System.currentTimeMillis());
            int i = writeReplace;
            values = (i + 51) % 128;
            if (setallowedhandwritingdelegatepackage == null) {
                return null;
            }
            int i2 = i + 19;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                if (((com.payair.hce.setElevation[]) com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage}, 917462212, -917462209, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage))) == null || ((com.payair.hce.setElevation[]) com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage}, 917462212, -917462209, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage))).length == 0) {
                    return null;
                }
                values = (writeReplace + 61) % 128;
                com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, str2}, 486987112, -486987112, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
                return (com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[]) com.payair.hce.setAllowedHandwritingDelegatePackage.valueOf(new java.lang.Object[]{setallowedhandwritingdelegatepackage, (com.payair.hce.setTransitionAlpha) this.mRemoteManagementCrypto}, -2027828101, 2027828103, java.lang.System.identityHashCode(setallowedhandwritingdelegatepackage));
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] getAllCmsDFormattedTransactionCredentials(java.lang.String str) {
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr;
        int i;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int i2 = writeReplace + 95;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                transactionCredentialArr = new com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[jSONArray.length()];
                i = 1;
            } else {
                transactionCredentialArr = new com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[jSONArray.length()];
                i = 0;
            }
            while (i < jSONArray.length()) {
                int i3 = values + 63;
                writeReplace = i3 % 128;
                if (i3 % 2 != 0) {
                    try {
                        transactionCredentialArr[i] = com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential.valueOf(jSONArray.getString(i));
                        i++;
                    } catch (org.json.JSONException unused) {
                        return null;
                    }
                } else {
                    transactionCredentialArr[i] = com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential.valueOf(jSONArray.getString(i));
                    throw new java.lang.ArithmeticException();
                }
                return null;
            }
            values = (writeReplace + 115) % 128;
            return transactionCredentialArr;
        } catch (org.json.JSONException unused2) {
            return null;
        }
    }

    private java.lang.String readValue(java.lang.String str, java.lang.String str2) throws com.payair.hce.getTokenInfo {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        java.lang.String AlternateContactlessPaymentDataJson2 = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson(sb.toString());
        if (AlternateContactlessPaymentDataJson2 == null) {
            writeReplace = (values + 73) % 128;
            AlternateContactlessPaymentDataJson2 = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson("default-".concat(java.lang.String.valueOf(str2)));
        }
        if (AlternateContactlessPaymentDataJson2 != null) {
            int i = values + 13;
            writeReplace = i % 128;
            if (i % 2 != 0) {
                return AlternateContactlessPaymentDataJson2;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Configuration (default-");
        sb2.append(str2);
        sb2.append(") not found!");
        throw new com.payair.hce.getTokenInfo(sb2.toString());
    }

    private com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential getTransactionCredentialData(com.payair.hce.getIccKek geticckek) {
        int i = (writeReplace + 89) % 128;
        values = i;
        if (geticckek == null) {
            int i2 = (i + 101) % 128;
            writeReplace = i2;
            int i3 = i2 + 91;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential = new com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential();
        transactionCredential.setContactlessMdSessionKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(geticckek.DigitizedCardProfile()).DigitizedCardProfile());
        transactionCredential.setContactlessUmdSingleUseKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(geticckek.valueOf()).DigitizedCardProfile());
        transactionCredential.setContactlessUmdSessionKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek}, -1760992470, 1760992471, java.lang.System.identityHashCode(geticckek))).DigitizedCardProfile());
        transactionCredential.setDsrpMdSessionKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(geticckek.getProfileVersion()).DigitizedCardProfile());
        transactionCredential.setDsrpUmdSingleUseKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(geticckek.writeReplace()).DigitizedCardProfile());
        transactionCredential.setDsrpUmdSessionKey(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek}, 653749449, -653749447, java.lang.System.identityHashCode(geticckek))).DigitizedCardProfile());
        transactionCredential.setAtc(java.lang.Integer.parseInt(geticckek.values(), 16));
        transactionCredential.setIdn(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(geticckek.RecordsJson()).DigitizedCardProfile());
        return transactionCredential;
    }

    private void restoreDemoCardsFromDatabase() {
        try {
            java.util.List<com.payair.hce.sendRequest> AlternateContactlessPaymentDataJson2 = this.mCardManager.AlternateContactlessPaymentDataJson();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.payair.hce.sendRequest> it = AlternateContactlessPaymentDataJson2.iterator();
            while (it.hasNext()) {
                int i = writeReplace + 99;
                values = i % 128;
                arrayList.add((i % 2 != 0 ? it.next().values().substring(1, 70) : it.next().values().substring(0, 19)).replace(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, ""));
            }
            this.mUsedCards = arrayList;
            int i2 = writeReplace + 45;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (com.payair.hce.setSuccessful unused) {
        }
    }

    private void setMobilePin(java.lang.String str, byte[] bArr) {
        values = (writeReplace + 51) % 128;
        this.mContext.getSharedPreferences(DEMO_PREFERENCE_PIN, 0).edit().putString(str, android.util.Base64.encodeToString(bArr, 0)).commit();
        writeReplace = (values + 103) % 128;
    }

    private byte[] getMobilePin(java.lang.String str) {
        java.lang.Object obj;
        java.lang.String string = this.mContext.getSharedPreferences(DEMO_PREFERENCE_PIN, 0).getString(str, null);
        if (string != null) {
            return android.util.Base64.decode(string, 0);
        }
        int i = values + 75;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(50 - android.text.TextUtils.indexOf("", ""), (char) (11836 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 40)), (android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) > 2.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) == 2.0f ? 0 : -1)) + 3, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf("", "") + 56, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12954), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr2);
            obj = objArr2[0];
        }
        byte[] bytes = ((java.lang.String) obj).intern().getBytes();
        values = (writeReplace + 31) % 128;
        return bytes;
    }

    public void provisionFromLocalStorage(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(MPSDK_ROOT_DIR);
            sb.append(CARDPROFILE_DIRECTORY);
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(sb.toString(), str)));
                try {
                    java.lang.String readJsonFromLocalStorage = readJsonFromLocalStorage(bufferedReader);
                    bufferedReader.close();
                    int i = values + 97;
                    writeReplace = i % 128;
                    if (i % 2 != 0) {
                        com.payair.hce.checkForSuccess digitizedCardProfile = getDigitizedCardProfile(readJsonFromLocalStorage);
                        java.lang.String obj = java.util.UUID.randomUUID().toString();
                        updateSukFileName(obj, str2);
                        createDemoCardProfile(digitizedCardProfile, obj);
                        return;
                    }
                    com.payair.hce.checkForSuccess digitizedCardProfile2 = getDigitizedCardProfile(readJsonFromLocalStorage);
                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                    updateSukFileName(obj2, str2);
                    createDemoCardProfile(digitizedCardProfile2, obj2);
                    throw new java.lang.ArithmeticException();
                } finally {
                }
            } catch (java.io.IOException e) {
                android.content.Context context = this.mContext;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required file(s) not found in Local storage:");
                sb2.append(e.getMessage());
                try {
                    java.lang.Object[] objArr = {context, sb2.toString(), 1};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    b("\uf4b7Ώ춐\uf4d6㍓벩덤\u0ef9৸뾎뙄অ\u0e80멮딤ବβ땓롎ؿX뀦뻳ſ", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("뜒拈₡띿\uf7b2\udde1幚쨏䩦\udec5孩촾", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr3);
                    java.lang.String str3 = (java.lang.String) objArr3[0];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b("痎㡗怋疯\ue8fd蝱ỿ핗袁葖ᯟ툫迭膰ᢵ킑苋躑ᖏ\uddeb脍诰፵\udad1萋裇၏", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                    java.lang.Object invoke = cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr4[0]), java.lang.CharSequence.class, java.lang.Integer.TYPE).invoke(null, objArr);
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b("\uf4b7Ώ춐\uf4d6㍓벩덤\u0ef9৸뾎뙄অ\u0e80멮딤ବβ땓롎ؿX뀦뻳ſ", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b("誗ဟ囹諤℞꼿蝖Ჱ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr6);
                        cls2.getMethod((java.lang.String) objArr6[0], null).invoke(invoke, null);
                        int i2 = values + 5;
                        writeReplace = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
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
            }
        } catch (java.lang.RuntimeException unused) {
        }
    }

    private void createDemoCardProfile(com.payair.hce.checkForSuccess checkforsuccess, java.lang.String str) {
        writeReplace = (values + 105) % 128;
        if (checkforsuccess != null) {
            try {
                java.lang.String AlternateContactlessPaymentDataJson2 = com.payair.hce.stopService.AlternateContactlessPaymentDataJson(checkforsuccess.getDigitizedCardId());
                this.mRemoteCommunicationEventListener.DigitizedCardProfile(checkforsuccess, str);
                java.lang.String AlternateContactlessPaymentDataJson3 = com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(AlternateContactlessPaymentDataJson3);
                sb.append("-pin");
                java.lang.String AlternateContactlessPaymentDataJson4 = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson(sb.toString());
                if (AlternateContactlessPaymentDataJson4 == null) {
                    int i = writeReplace + 63;
                    values = i % 128;
                    if (i % 2 != 0) {
                        com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson("default-pin");
                        throw new java.lang.NullPointerException();
                    }
                    AlternateContactlessPaymentDataJson4 = com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson("default-pin");
                    values = (writeReplace + 107) % 128;
                }
                setMobilePin(str, AlternateContactlessPaymentDataJson4.getBytes());
            } catch (com.payair.hce.completeTokenize unused) {
            }
        }
    }

    private com.payair.hce.isNetworkError createTransactionCredentialForLocalStorage(final java.lang.String str, final com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential) {
        com.payair.hce.isNetworkError isnetworkerror = new com.payair.hce.isNetworkError() { // from class: com.payair.hce.DemoRemoteCommunicationManager.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static int IccPrivateKeyCrtComponentsJson;
            private static long values;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = (~i) | i2;
                int i5 = ~i3;
                if ((i * 141) + (i2 * (-279)) + ((i2 | i3) * 140) + (((~i4) | (~(i5 | i2))) * (-280)) + (((~(i | (~i2))) | (~(i5 | i)) | (~(i4 | i3))) * 140) == 1) {
                    return writeReplace(objArr);
                }
                com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass5 anonymousClass5 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass5) objArr[0];
                AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 87) % 128;
                byte[] dsrpUmdSingleUseKey = transactionCredential.getDsrpUmdSingleUseKey();
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 55) % 128;
                return dsrpUmdSingleUseKey;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
                int i;
                int i2 = (s * 2) + 117;
                int i3 = s3 * 4;
                int i4 = s2 + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i3 + 1];
                if (bArr == null) {
                    int i5 = i4;
                    int i6 = 0;
                    i2 = (-i2) + i4;
                    i4 = i5;
                    i = i6;
                    int i7 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i3) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    byte b = bArr[i7];
                    i4 = i2;
                    i2 = b;
                    i6 = i + 1;
                    i5 = i7;
                    i2 = (-i2) + i4;
                    i4 = i5;
                    i = i6;
                    int i72 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i3) {
                    }
                } else {
                    i = 0;
                    int i722 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i3) {
                    }
                }
            }

            private static void a(java.lang.String str2, int i, java.lang.Object[] objArr) {
                $10 = ($11 + 1) % 128;
                char[] charArray = str2 != null ? str2.toCharArray() : str2;
                com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
                char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), charArray, i);
                getcardholdervalidator.valueOf = 4;
                while (getcardholdervalidator.valueOf < writeReplace2.length) {
                    getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
                    int i2 = getcardholdervalidator.valueOf;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1921, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b((short) 0, (short) -1, (short) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                        }
                        writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, 428 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31611));
                            byte b = (byte) (3 & $$b);
                            byte b2 = (byte) (-b);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(b, b2, (byte) (b2 + 1), objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                        }
                        ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                        $11 = ($10 + 103) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
            }

            @Override // com.payair.hce.isNetworkError
            public final java.lang.String writeReplace() {
                java.lang.String hexString = java.lang.Integer.toHexString(transactionCredential.getAtc());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("0000".substring(hexString.length()));
                sb.append(hexString);
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(obj);
                sb2.append(com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.MockData.MOCK_EXPIRED_OTP);
                java.lang.String obj2 = sb2.toString();
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 87) % 128;
                return obj2;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] valueOf() {
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 77) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\ude67柀\ude52\uf03e㷅䥍", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern()).DigitizedCardProfile();
                int i = AlternateContactlessPaymentDataJson + 77;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 != 0) {
                    return DigitizedCardProfile2;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] values() {
                AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 91) % 128;
                byte[] contactlessUmdSingleUseKey = transactionCredential.getContactlessUmdSingleUseKey();
                int i = IccPrivateKeyCrtComponentsJson + 81;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 == 0) {
                    return contactlessUmdSingleUseKey;
                }
                throw null;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] DigitizedCardProfile() {
                int i = IccPrivateKeyCrtComponentsJson + 59;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 != 0) {
                    transactionCredential.getContactlessMdSessionKey();
                    throw new java.lang.ArithmeticException();
                }
                byte[] contactlessMdSessionKey = transactionCredential.getContactlessMdSessionKey();
                int i2 = AlternateContactlessPaymentDataJson + 115;
                IccPrivateKeyCrtComponentsJson = i2 % 128;
                if (i2 % 2 != 0) {
                    return contactlessMdSessionKey;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass5 anonymousClass5 = (com.payair.hce.DemoRemoteCommunicationManager.AnonymousClass5) objArr[0];
                int i = IccPrivateKeyCrtComponentsJson + 95;
                AlternateContactlessPaymentDataJson = i % 128;
                com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential2 = transactionCredential;
                if (i % 2 == 0) {
                    return transactionCredential2.getDsrpMdSessionKey();
                }
                transactionCredential2.getDsrpMdSessionKey();
                throw null;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] RecordsJson() {
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 31) % 128;
                byte[] contactlessUmdSessionKey = transactionCredential.getContactlessUmdSessionKey();
                AlternateContactlessPaymentDataJson = (IccPrivateKeyCrtComponentsJson + 53) % 128;
                return contactlessUmdSessionKey;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
                int i = AlternateContactlessPaymentDataJson + 63;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 == 0) {
                    transactionCredential.getDsrpUmdSessionKey();
                    throw null;
                }
                byte[] dsrpUmdSessionKey = transactionCredential.getDsrpUmdSessionKey();
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 101) % 128;
                return dsrpUmdSessionKey;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] IccPrivateKeyCrtComponentsJson() {
                int i = AlternateContactlessPaymentDataJson + 61;
                IccPrivateKeyCrtComponentsJson = i % 128;
                com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential2 = transactionCredential;
                if (i % 2 != 0) {
                    return transactionCredential2.getIdn();
                }
                transactionCredential2.getIdn();
                throw null;
            }

            @Override // com.payair.hce.isNetworkError
            public final int getProfileVersion() {
                IccPrivateKeyCrtComponentsJson = (AlternateContactlessPaymentDataJson + 67) % 128;
                int atc = transactionCredential.getAtc();
                int i = AlternateContactlessPaymentDataJson + 65;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 != 0) {
                    return atc;
                }
                throw null;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] SdkCoreBusinessLogicModuleImpl() {
                int i = IccPrivateKeyCrtComponentsJson + 99;
                AlternateContactlessPaymentDataJson = i % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("0000");
                if (i % 2 == 0) {
                    return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                }
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }

            @Override // com.payair.hce.isNetworkError
            public final void getGpoResponse() {
                int i = IccPrivateKeyCrtComponentsJson + 29;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                AlternateContactlessPaymentDataJson = 0;
                IccPrivateKeyCrtComponentsJson = 1;
                values = -6633341895335257480L;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] getAid() {
                return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 813029551, -813029550, java.lang.System.identityHashCode(this));
            }

            static void init$0() {
                $$a = new byte[]{45, -88, -122, 76};
                $$b = 149;
            }

            @Override // com.payair.hce.isNetworkError
            public final byte[] AlternateContactlessPaymentDataJson() {
                return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -563913415, 563913415, java.lang.System.identityHashCode(this));
            }
        };
        writeReplace = (values + 83) % 128;
        return isnetworkerror;
    }

    private java.lang.String readJsonFromLocalStorage(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        writeReplace = (values + 17) % 128;
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return new java.lang.String(sb);
            }
            int i = writeReplace + 69;
            values = i % 128;
            if (i % 2 != 0) {
                sb.append(readLine);
                throw new java.lang.ArithmeticException();
            }
            sb.append(readLine);
        }
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = -5543434631153857653L;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -26, -77, 102};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
    }

    static void valueOf() {
        DigitizedCardProfile = new char[]{24223, 27717, 17042, 28766, 10044, 55823, 35310, 48340, 29626, 8556, 54349, 35645, 48648, 28154, 8388, 55182, 34163, 47181, 28462, 8719, 53749, 34002, 48018, 26980, 41158, 37392, 50442, 14426, 27552, 24314, 37355, 49984, 13846, 27001, 23617, 36770, 49804, 13731, 26438, 23144, 36106, 49217, 13229, 26254, 22996, 35662, 65049, 12642, 25653, 22441, 35456, 64932, 12109, 25202, 21869, 34890, 27652, 24284, 2480, 62608};
        valueOf = 375576739378588788L;
    }
}
