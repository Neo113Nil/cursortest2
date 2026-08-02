package com.payair.hce.communication;

/* loaded from: classes4.dex */
public class JsonResponse {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] AlternateContactlessPaymentDataJson = null;
    private static boolean DigitizedCardProfile = false;
    public static final int HTTP_STATUS_BAD_AUTH = 401;
    public static final int HTTP_STATUS_BAD_REQUEST = 400;
    public static final java.lang.Integer HTTP_STATUS_BANK_ID_ALREADY_SYNCED;
    public static final java.lang.Integer HTTP_STATUS_CARD_REMOVED;
    public static final int HTTP_STATUS_CREATED = 201;
    public static final int HTTP_STATUS_INVALID_HOST = -100;
    public static final int HTTP_STATUS_NONE = -1;
    public static final int HTTP_STATUS_NOT_FOUND = 404;
    public static final int HTTP_STATUS_OK = 200;
    public static final int HTTP_STATUS_SUCCESS = 1;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static java.lang.String TAG;
    private static boolean valueOf;
    private static long values;
    private static int writeReplace;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "statusCodeFromServer")
    private java.lang.Integer statusCodeFromServer = null;
    private boolean isSuccessful = false;
    private boolean networkError = false;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "statusCode")
    private java.lang.Integer statusCode = null;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "statusMessage")
    private java.lang.String statusMessage = null;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "detailedMessage")
    private java.lang.String detailedMessage = null;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "errorName")
    private java.lang.String errorName = null;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY)
    private java.util.List<com.payair.hce.ErrorModel> errors = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 38 - (b2 * 34);
        int i4 = (b * 53) + 65;
        int i5 = 35 - (s * 28);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i4 = i5;
            i = 0;
            int i7 = i3;
            i4 = (i4 + i6) - 2;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i7 = i2;
            i4 = (i4 + i6) - 2;
            i2 = i7 + 1;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2 = i3;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s + 68;
        int i5 = i + 7;
        byte[] bArr = $$d;
        int i6 = 91 - b;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 = (i4 + i7) - 1;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i4 = (i4 + i7) - 1;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$g;
        int i4 = (i * 3) + 4;
        int i5 = 118 - s2;
        int i6 = (s * 2) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i4;
            int i9 = (-i4) + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i5 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i11;
            int i92 = (-i4) + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i5 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        writeReplace();
        valueOf();
        TAG = "JsonResponse";
        HTTP_STATUS_CARD_REMOVED = java.lang.Integer.valueOf(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL);
        HTTP_STATUS_BANK_ID_ALREADY_SYNCED = 155;
        int i = RecordsJson;
        int i2 = (i & (-96)) | ((~i) & 95);
        int i3 = -(-((i & 95) << 1));
        IccPrivateKeyCrtComponentsJson = ((i2 & i3) + (i3 | i2)) % 128;
    }

    public boolean checkForSuccess() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int i3 = -(-((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
        RecordsJson = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (getStatusCode() != null) {
            int i4 = RecordsJson;
            int i5 = ((i4 | 126) << 1) - (i4 ^ 126);
            int i6 = (~i5) + (i5 << 1);
            IccPrivateKeyCrtComponentsJson = i6 % 128;
            if (i6 % 2 == 0 ? getStatusCode().intValue() < 400 : getStatusCode().intValue() < 4699) {
                java.lang.Integer num = this.statusCodeFromServer;
                if (num != null) {
                    int i7 = IccPrivateKeyCrtComponentsJson;
                    RecordsJson = ((i7 ^ 33) + ((i7 & 33) << 1)) % 128;
                    if (num.intValue() < 100) {
                        int i8 = RecordsJson;
                        int i9 = i8 & 43;
                        int i10 = ((i8 ^ 43) | i9) << 1;
                        int i11 = -((i8 | 43) & (~i9));
                        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                        IccPrivateKeyCrtComponentsJson = i12 % 128;
                        if (i12 % 2 != 0) {
                            this.isSuccessful = false;
                        } else {
                            this.isSuccessful = true;
                        }
                        boolean z = this.isSuccessful;
                        int i13 = RecordsJson;
                        int i14 = i13 & 85;
                        IccPrivateKeyCrtComponentsJson = ((i14 - (~((i13 ^ 85) | i14))) - 1) % 128;
                        return z;
                    }
                }
                this.isSuccessful = false;
                int i15 = RecordsJson;
                IccPrivateKeyCrtComponentsJson = ((i15 ^ 93) + ((i15 & 93) << 1)) % 128;
                boolean z2 = this.isSuccessful;
                int i132 = RecordsJson;
                int i142 = i132 & 85;
                IccPrivateKeyCrtComponentsJson = ((i142 - (~((i132 ^ 85) | i142))) - 1) % 128;
                return z2;
            }
        }
        this.isSuccessful = false;
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 109) % 128;
        boolean z22 = this.isSuccessful;
        int i1322 = RecordsJson;
        int i1422 = i1322 & 85;
        IccPrivateKeyCrtComponentsJson = ((i1422 - (~((i1322 ^ 85) | i1422))) - 1) % 128;
        return z22;
    }

    public java.lang.Integer getStatusCode() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (((i & (-60)) | ((~i) & 59)) - (~((i & 59) << 1))) - 1;
        int i3 = i2 % 128;
        RecordsJson = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.Integer num = this.statusCode;
        int i4 = (i3 & 74) + (i3 | 74);
        int i5 = (~i4) + (i4 << 1);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public void setStatusCode(java.lang.Integer num) {
        int i = IccPrivateKeyCrtComponentsJson;
        RecordsJson = (((i ^ 31) - (~(-(-((i & 31) << 1))))) - 1) % 128;
        this.statusCode = num;
        int i2 = (i & (-92)) | ((~i) & 91);
        int i3 = (i & 91) << 1;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.Integer getStatusCodeFromServer() {
        int i = RecordsJson;
        int i2 = i & 11;
        int i3 = ((((i ^ 11) | i2) << 1) - ((i | 11) & (~i2))) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        java.lang.Integer num = this.statusCodeFromServer;
        int i4 = i3 & 31;
        int i5 = (i3 | 31) & (~i4);
        int i6 = i4 << 1;
        RecordsJson = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return num;
    }

    public void setStatusCodeFromServer(java.lang.Integer num) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (((i & 34) + (i | 34)) - 1) % 128;
        RecordsJson = i2;
        this.statusCodeFromServer = num;
        int i3 = (-2) - (~(i2 + 62));
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void d(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 55;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            $11 = ($10 + 69) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1890 - android.view.View.getDefaultSize(0, 0), (char) (3601 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e((short) 0, 0, (short) 5, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 64, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1395, (char) (29681 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((short) 0, 0, (short) 6, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            $10 = ($11 + 23) % 128;
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1443, (char) (android.view.View.getDefaultSize(0, 0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e((short) 0, 0, (short) 6, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 91) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public boolean isSuccessful() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 1) | (i & 1)) << 1;
        int i3 = -((i & (-2)) | ((~i) & 1));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        RecordsJson = i4;
        boolean z = this.isSuccessful;
        int i5 = ((i4 ^ 11) | (i4 & 11)) << 1;
        int i6 = -((i4 & (-12)) | ((~i4) & 11));
        IccPrivateKeyCrtComponentsJson = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return z;
    }

    public void setSuccessful(boolean z) {
        int i = RecordsJson;
        int i2 = i & 51;
        int i3 = (((i ^ 51) | i2) << 1) - ((i | 51) & (~i2));
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            this.isSuccessful = z;
        } else {
            this.isSuccessful = z;
            throw new java.lang.ArithmeticException();
        }
    }

    public boolean isNetworkError() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 83) + ((i & 83) << 1);
        int i3 = i2 % 128;
        RecordsJson = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.networkError;
        int i4 = (i3 ^ 35) + ((i3 & 35) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setNetworkError(boolean z) {
        int i = RecordsJson;
        int i2 = i & 89;
        int i3 = (i2 + ((i ^ 89) | i2)) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        this.networkError = z;
        RecordsJson = ((i3 & 87) + (i3 | 87)) % 128;
    }

    public java.lang.String getStatusMessage() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i ^ 59;
        RecordsJson = (((((i & 59) | i2) << 1) - (~(-i2))) - 1) % 128;
        java.lang.String str = this.statusMessage;
        int i3 = i + 21;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setStatusMessage(java.lang.String str) {
        int i = RecordsJson;
        int i2 = i ^ 35;
        int i3 = (((i & 35) | i2) << 1) - i2;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            this.statusMessage = str;
            int i4 = i & 97;
            int i5 = (i | 97) & (~i4);
            int i6 = i4 << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            IccPrivateKeyCrtComponentsJson = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.statusMessage = str;
        throw null;
    }

    public java.lang.String getDetailedMessage() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 9;
        int i3 = (i ^ 9) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        RecordsJson = i4 % 128;
        java.lang.String str = this.detailedMessage;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = (i & (-78)) | ((~i) & 77);
        int i6 = -(-((i & 77) << 1));
        RecordsJson = ((i5 & i6) + (i6 | i5)) % 128;
        return str;
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = $10 + 47;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            }
            for (int i4 = 0; i4 < length; i4++) {
                $10 = ($11 + 87) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 46, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 111) % 128;
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (DigitizedCardProfile) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 43, 1629 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((short) 0, 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!valueOf) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[getumdgeneration.values >> getumdgeneration.valueOf] / i] - intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1630, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    e((short) 0, 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            } else {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1630 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    e((short) 0, 0, (short) 0, objArr9);
                    obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x06dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDetailedMessage(java.lang.String str) {
        java.lang.Integer num;
        android.content.Context context;
        java.lang.String str2;
        int i;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i2;
        int i3;
        java.lang.Object invoke;
        int i4 = RecordsJson;
        IccPrivateKeyCrtComponentsJson = ((i4 & 89) + (i4 | 89)) % 128;
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, android.text.TextUtils.indexOf("", "", 0, 0) + 667, (char) (40024 - android.view.KeyEvent.normalizeMetaState(0)));
        byte[] bArr = $$a;
        byte b = bArr[14];
        byte b2 = (byte) (b - 1);
        byte b3 = b;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 - 1), objArr3);
        long j = cls.getField((java.lang.String) objArr3[0]).getLong(null);
        try {
            try {
                try {
                    if (j != -1) {
                        int i5 = RecordsJson;
                        int i6 = i5 & 7;
                        int i7 = (i5 ^ 7) | i6;
                        IccPrivateKeyCrtComponentsJson = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i8 = maxKeyCode * 306;
                        int i9 = (((i8 & (-611)) | ((~i8) & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)) - (~((i8 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1))) - 1;
                        int i10 = ((38862 | i9) << 1) - (i9 ^ 38862);
                        int i11 = maxKeyCode & 127;
                        int i12 = (~i11) & (maxKeyCode | 127);
                        int i13 = (i12 ^ i11) | (i11 & i12);
                        int i14 = ~i13;
                        int i15 = (i13 | i14) & i14;
                        int i16 = ~identityHashCode;
                        int i17 = ~maxKeyCode;
                        int i18 = maxKeyCode & i16;
                        int i19 = i18 | (identityHashCode & i17);
                        int i20 = identityHashCode & maxKeyCode;
                        int i21 = (i19 ^ i20) | (i20 & i19);
                        int i22 = ~i21;
                        int i23 = (i21 | i22) & i22;
                        int i24 = i15 & i23;
                        int i25 = (i23 | i15) & (~i24);
                        int i26 = -(-(((i25 ^ i24) | (i25 & i24)) * 305));
                        int i27 = (i10 | i26) << 1;
                        int i28 = -(((~i26) & i10) | ((~i10) & i26));
                        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                        int i30 = (i17 & i16) | ((~i16) & maxKeyCode);
                        int i31 = ~((i30 ^ i18) | (i18 & i30));
                        int i32 = ((~i31) & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i31 & 127);
                        int i33 = i31 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                        int i34 = -(-(((i33 ^ i32) | (i33 & i32)) * 305));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(((i29 | i34) << 1) - (i34 ^ i29), null, null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        int i35 = -android.view.KeyEvent.getDeadChar(0, 0);
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i36 = ~identityHashCode2;
                        int i37 = ~((i36 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i36 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i38 = ~i35;
                        int i39 = ~((i38 ^ identityHashCode2) | (i38 & identityHashCode2));
                        int i40 = (i37 & i39) | (i37 ^ i39);
                        int i41 = (i36 | identityHashCode2) & i36;
                        int i42 = (i41 & i38) | ((~i41) & i35);
                        int i43 = i41 & i35;
                        int i44 = ~((i42 ^ i43) | (i42 & i43));
                        int i45 = i40 & i44;
                        num = 0;
                        int i46 = (-2) - (~((((i35 * (-958)) - 121666) - (~(-(~(-(-((((~i45) & (i40 | i44)) | i45) * 959))))))) - 1));
                        int i47 = (i35 ^ 127) | (i35 & 127);
                        int i48 = ~i47;
                        int i49 = ((i47 | i48) & i48) * (-959);
                        int i50 = ((((i46 ^ i49) | (i46 & i49)) << 1) - (~(-((i46 & (~i49)) | ((~i46) & i49))))) - 1;
                        int i51 = ((~i36) & i38) | ((~i38) & i36);
                        int i52 = i38 & i36;
                        int i53 = (i51 ^ i52) | (i51 & i52);
                        int i54 = ~i53;
                        int i55 = (i53 | i54) & i54;
                        int i56 = ~((identityHashCode2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i57 = i35 & identityHashCode2;
                        int i58 = (i35 | identityHashCode2) & (~i57);
                        int i59 = -(-((((~i55) & i56) | ((~i56) & i55) | (i55 & i56) | (~((i58 ^ i57) | (i58 & i57)))) * 959));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((i50 ^ i59) + ((i59 & i50) << 1), null, null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr5);
                        if (j + 1978 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            int i60 = RecordsJson;
                            int i61 = i60 & 49;
                            int i62 = ((((i60 ^ 49) | i61) << 1) - (~(-((i60 | 49) & (~i61))))) - 1;
                            IccPrivateKeyCrtComponentsJson = i62 % 128;
                            if (i62 % 2 != 0) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 668 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40024));
                                byte b4 = bArr[14];
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(b4, (byte) (b4 - 1), b4, objArr6);
                                java.lang.Object[] objArr7 = {cls3.getField((java.lang.String) objArr6[0]).get(null), -1909246005, 1};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4684 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj);
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr7);
                            } else {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, 667 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 40025));
                                byte b5 = bArr[14];
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                a(b5, (byte) (b5 - 1), b5, objArr8);
                                java.lang.Object[] objArr9 = {cls4.getField((java.lang.String) objArr8[0]).get(null), -1909246005, null};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 4684 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr9);
                            }
                            objArr2 = (java.lang.Object[]) invoke;
                            str2 = str;
                            i2 = ((int[]) objArr2[1])[0];
                            i3 = ((int[]) objArr2[0])[0];
                            if (i3 != i2) {
                                int i63 = RecordsJson;
                                int i64 = i63 & 105;
                                int i65 = (i63 ^ 105) | i64;
                                IccPrivateKeyCrtComponentsJson = ((i64 ^ i65) + ((i65 & i64) << 1)) % 128;
                                java.lang.Object[] objArr10 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[4])[0]), num};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4685, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr10);
                                RecordsJson = (IccPrivateKeyCrtComponentsJson + 79) % 128;
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.Object[] objArr11 = {objArr2};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.os.Process.myPid() >> 22), 4684 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("values", java.lang.Object[].class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj4);
                                }
                                arrayList.add(((java.lang.reflect.Method) obj4).invoke(null, objArr11));
                                java.lang.Object[] objArr12 = {objArr2};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                if (obj5 == null) {
                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.os.Process.myPid() >> 22) + 4684, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("writeReplace", java.lang.Object[].class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj5);
                                }
                                arrayList.add(((java.lang.reflect.Method) obj5).invoke(null, objArr12));
                                int i66 = i2 & i3;
                                long j2 = (~i66) & ((i2 ^ i3) | i66);
                                int i67 = IccPrivateKeyCrtComponentsJson + 125;
                                RecordsJson = i67 % 128;
                                if (i67 % 2 == 0) {
                                    int i68 = 5 / 2;
                                }
                                try {
                                    java.lang.Object[] objArr13 = {java.lang.Long.valueOf(j2 ^ 1517509746377097216L), 353322779L};
                                    byte[] bArr2 = $$d;
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    c((byte) (bArr2[46] - 1), (byte) 40, bArr2[42], objArr14);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                    byte b6 = bArr2[28];
                                    byte b7 = b6;
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    c(b6, b7, (byte) (b7 | org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE), objArr15);
                                    cls5.getMethod((java.lang.String) objArr15[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr13);
                                    java.lang.Object[] objArr16 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[4])[0]), num};
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                    if (obj6 == null) {
                                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4684 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj6);
                                    }
                                    ((java.lang.reflect.Method) obj6).invoke(null, objArr16);
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            this.detailedMessage = str2;
                            int i69 = IccPrivateKeyCrtComponentsJson;
                            int i70 = i69 & 91;
                            int i71 = (i69 | 91) & (~i70);
                            int i72 = i70 << 1;
                            RecordsJson = (((i71 | i72) << 1) - (i71 ^ i72)) % 128;
                            return;
                        }
                    } else {
                        num = 0;
                    }
                    int myTid = android.os.Process.myTid() >> 22;
                    int identityHashCode3 = java.lang.System.identityHashCode(this);
                    int i73 = myTid * (-523);
                    int i74 = 33401 & i73;
                    int i75 = ((33401 ^ i73) | i74) << 1;
                    int i76 = -((i73 | 33401) & (~i74));
                    int i77 = ~myTid;
                    int i78 = i77 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i79 = ~(((~i77) & 127) | i78 | (i77 & 127));
                    int i80 = myTid ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i81 = myTid & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i82 = ~(i80 | i81);
                    int i83 = ((~i79) & i82) | ((~i82) & i79);
                    int i84 = i79 & i82;
                    int i85 = (i83 ^ i84) | (i84 & i83);
                    int i86 = ~((identityHashCode3 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode3 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i87 = ((((i75 | i76) << 1) - (i76 ^ i75)) - (~(-(-(((i85 ^ i86) | (i85 & i86)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))))) - 1;
                    int i88 = (~((myTid & 127) | i78 | i81)) * (-786);
                    int i89 = i87 & i88;
                    int i90 = (i88 | i87) & (~i89);
                    int i91 = i89 << 1;
                    int i92 = ~identityHashCode3;
                    int i93 = i92 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i94 = ((i92 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) & (~i93)) | i93;
                    int i95 = ~i94;
                    int i96 = (i94 | i95) & i95;
                    int i97 = i77 & (i77 | myTid);
                    int i98 = ~((i97 ^ 127) | (i97 & 127));
                    int i99 = (i96 ^ i98) | (i96 & i98);
                    int i100 = ~(((myTid | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) & (~i81)) | i81);
                    int i101 = i99 & i100;
                    int i102 = (i100 | i99) & (~i101);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b((((i90 & i91) + (i90 | i91)) - (~(((i102 & i101) | (i102 ^ i101)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) - 1, null, null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr17);
                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                    int i103 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int identityHashCode4 = java.lang.System.identityHashCode(this);
                    int i104 = i103 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                    int i105 = ((-34416) ^ i104) + ((i104 & (-34416)) << 1);
                    int i106 = (~i105) + (i105 << 1);
                    int i107 = ~i103;
                    int i108 = i107 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i109 = i108 | ((~i108) & (i107 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i110 = ~identityHashCode4;
                    int i111 = ~((i109 ^ i110) | (i109 & i110));
                    int i112 = i103 & 127;
                    int i113 = (~i112) & (i103 | 127);
                    int i114 = (i112 ^ i113) | (i112 & i113);
                    int i115 = i114 ^ identityHashCode4;
                    int i116 = i114 & identityHashCode4;
                    int i117 = (i116 & i115) | (i115 ^ i116);
                    int i118 = ~i117;
                    int i119 = (i117 | i118) & i118;
                    int i120 = i111 ^ i119;
                    int i121 = i111 & i119;
                    int i122 = -(-(((i121 ^ i120) | (i121 & i120)) * (-272)));
                    int i123 = i106 & i122;
                    int i124 = (((i106 | i122) & (~i123)) - (~(i123 << 1))) - 1;
                    int i125 = i107 & 127;
                    int i126 = (~i125) & (i107 | 127);
                    int i127 = ~((i125 ^ i126) | (i125 & i126));
                    int i128 = (i107 | i103) & i107;
                    int i129 = ~(((~i128) & identityHashCode4) | (i128 & i110) | (i128 & identityHashCode4));
                    int i130 = ((i127 ^ i129) | (i127 & i129)) * (-272);
                    int i131 = (i124 & i130) + (i124 | i130);
                    int i132 = (i103 & i110) | (i107 & identityHashCode4);
                    int i133 = i103 & identityHashCode4;
                    int i134 = ~((i133 ^ i132) | (i132 & i133));
                    int i135 = ((~i134) & 127) | (i134 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i136 = i134 & 127;
                    int i137 = ((i136 ^ i135) | (i136 & i135)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                    int i138 = i131 & i137;
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    b(i138 + ((i137 ^ i131) | i138), null, null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr18);
                    long longValue = ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr18[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 40, 668 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0) + 40024));
                    byte b8 = bArr[14];
                    byte b9 = (byte) (b8 - 1);
                    byte b10 = b8;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    a(b9, b10, (byte) (b10 - 1), objArr19);
                    cls7.getField((java.lang.String) objArr19[0]).set(null, java.lang.Long.valueOf(longValue));
                    RecordsJson = (IccPrivateKeyCrtComponentsJson + 75) % 128;
                    objArr2 = objArr;
                    i2 = ((int[]) objArr2[1])[0];
                    i3 = ((int[]) objArr2[0])[0];
                    if (i3 != i2) {
                    }
                    this.detailedMessage = str2;
                    int i692 = IccPrivateKeyCrtComponentsJson;
                    int i702 = i692 & 91;
                    int i712 = (i692 | 91) & (~i702);
                    int i722 = i702 << 1;
                    RecordsJson = (((i712 | i722) << 1) - (i712 ^ i722)) % 128;
                    return;
                } catch (java.lang.Exception unused) {
                    try {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                java.lang.Object[] objArr20 = {context, java.lang.Integer.valueOf(i), num, -1909246005};
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                c((byte) (-$$d[10]), (byte) 88, r0[42], objArr21);
                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                c(r0[4], r0[14], r0[28], objArr22);
                java.lang.String str3 = (java.lang.String) objArr22[0];
                int i139 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                d("\uea5c쵦ꐳ鿐皆⹝ŧ\uf860폶誏扁䔎㰤២캯ꘈ餮烗⯩ʦ塚\udd1c듇", (i139 ^ 10037) + ((i139 & 10037) << 1), objArr23);
                objArr = (java.lang.Object[]) cls8.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr23[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr20);
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, android.text.TextUtils.indexOf("", "") + 667, (char) (40023 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                byte b11 = bArr[14];
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                a(b11, (byte) (b11 - 1), b11, objArr24);
                cls9.getField((java.lang.String) objArr24[0]).set(null, objArr);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            int i140 = -(~(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            b((-2) - (~((i140 ^ 126) + ((i140 & 126) << 1))), null, null, "\u0083\u0081\u008c\u0084\u0097\u0096\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0094\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr25);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr25[0]);
            int i141 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i142 = i141 & 127;
            int i143 = ((i141 ^ 127) | i142) << 1;
            int i144 = -((i141 | 127) & (~i142));
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            b((i143 ^ i144) + ((i144 & i143) << 1), null, null, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0094\u008b\u0082\u008c\u0084\u0084\u0098\u0090", objArr26);
            context = (android.content.Context) cls10.getMethod((java.lang.String) objArr26[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                int i145 = IccPrivateKeyCrtComponentsJson;
                int i146 = i145 & 31;
                int i147 = (i145 | 31) & (~i146);
                int i148 = i146 << 1;
                int i149 = (i147 ^ i148) + ((i147 & i148) << 1);
                RecordsJson = i149 % 128;
                if (i149 % 2 == 0) {
                    context.getApplicationContext();
                    throw null;
                }
                context = context.getApplicationContext();
            }
            str2 = str;
            if (str2 != null) {
                int i150 = RecordsJson;
                int i151 = ((i150 & (-92)) | ((~i150) & 91)) + ((i150 & 91) << 1);
                IccPrivateKeyCrtComponentsJson = i151 % 128;
                if (i151 % 2 != 0) {
                    throw null;
                }
                i = str.length();
                int i152 = IccPrivateKeyCrtComponentsJson;
                int i153 = i152 & 81;
                int i154 = (i152 | 81) & (~i153);
                int i155 = -(-(i153 << 1));
                RecordsJson = ((i154 & i155) + (i154 | i155)) % 128;
            } else {
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 113) % 128;
                i = 0;
            }
            int i156 = RecordsJson;
            int i157 = i156 & 43;
            int i158 = (i157 + ((i156 ^ 43) | i157)) % 128;
            IccPrivateKeyCrtComponentsJson = i158;
            int i159 = i158 & 49;
            int i160 = ((i158 ^ 49) | i159) << 1;
            int i161 = -((~i159) & (i158 | 49));
            RecordsJson = ((i160 ^ i161) + ((i161 & i160) << 1)) % 128;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    public java.lang.String getErrorName() {
        int i = RecordsJson;
        int i2 = i & 47;
        int i3 = (i | 47) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return this.errorName;
        }
        throw null;
    }

    public void setErrorName(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 105;
        int i3 = i | 105;
        RecordsJson = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        this.errorName = str;
        int i4 = i & 51;
        int i5 = (i ^ 51) | i4;
        RecordsJson = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
    }

    public java.util.List<com.payair.hce.ErrorModel> getErrors() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 3) + ((i & 3) << 1)) % 128;
        RecordsJson = i2;
        java.util.List<com.payair.hce.ErrorModel> list = this.errors;
        int i3 = i2 & 1;
        int i4 = (i2 | 1) & (~i3);
        int i5 = -(-(i3 << 1));
        IccPrivateKeyCrtComponentsJson = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        return list;
    }

    public void setErrors(java.util.List<com.payair.hce.ErrorModel> list) {
        int i = RecordsJson;
        int i2 = (((i | 16) << 1) - (i ^ 16)) - 1;
        int i3 = i2 % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        if (i2 % 2 == 0) {
            this.errors = list;
            int i4 = (i3 ^ 38) + ((i3 & 38) << 1);
            RecordsJson = ((~i4) + (i4 << 1)) % 128;
            return;
        }
        this.errors = list;
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonResponse{isSuccessful=");
        sb.append(this.isSuccessful);
        sb.append(", networkError=");
        sb.append(this.networkError);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusCodeFromServer=");
        sb.append(this.statusCodeFromServer);
        sb.append(", statusMessage='");
        sb.append(this.statusMessage);
        sb.append("', detailedMessage='");
        sb.append(this.detailedMessage);
        sb.append("', errorName='");
        sb.append(getErrorName());
        sb.append("', errors='");
        java.util.List<com.payair.hce.ErrorModel> list = this.errors;
        if (list != null) {
            int i2 = RecordsJson & 79;
            IccPrivateKeyCrtComponentsJson = ((i2 - (~(-(-((r2 ^ 79) | i2))))) - 1) % 128;
            i = list.size();
            int i3 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = ((i3 ^ 99) + ((i3 & 99) << 1)) % 128;
        } else {
            int i4 = RecordsJson;
            int i5 = i4 & 65;
            int i6 = -(-(i4 | 65));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            IccPrivateKeyCrtComponentsJson = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 2;
            }
            i = 0;
        }
        sb.append(i);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i9 = IccPrivateKeyCrtComponentsJson;
        int i10 = (i9 & (-42)) | ((~i9) & 41);
        int i11 = (i9 & 41) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        RecordsJson = i12 % 128;
        if (i12 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public boolean isDataValid() {
        int i = RecordsJson;
        int i2 = i & 43;
        int i3 = (i | 43) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        IccPrivateKeyCrtComponentsJson = i6;
        boolean z = i5 % 2 == 0;
        int i7 = (i6 & 49) + (i6 | 49);
        RecordsJson = i7 % 128;
        if (i7 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static void init$2() {
        $$g = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, -26, -116};
        $$h = 85;
    }

    static void init$1() {
        $$d = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -107, com.google.common.base.Ascii.SUB, -98, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, com.google.common.base.Ascii.SYN, 43, 7, -46, 16, 19, com.google.common.base.Ascii.SI, 1, -9, 7, 0, -41, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, -18, 38, -1, 3, com.google.common.base.Ascii.FF, -10, 18, -20, 0, -32, com.google.common.base.Ascii.US, 18, -13, -19, 35, -2, -8, 4, 4, -6, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 16, -12, -3, com.google.common.base.Ascii.DC4, -14, -33, 45, 0, -7, 4, -1, com.google.common.base.Ascii.SI, -2, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.DC4, -10, 7, 0, -42, 45, 0, 7, -14, com.google.common.base.Ascii.DC4, -3, -20, com.google.common.base.Ascii.FF, 10, -15, -21, com.google.common.base.Ascii.CAN};
        $$e = 147;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = new char[]{11028, 11235, 11241, 11239, 11234, 11244, 11043, 11238, 11014, 11260, 11257, 11240, 11232, 11062, 11233, 11030, 11246, 11237, 11015, 11060, 11259, 11033, 11245, 11256};
        writeReplace = -143185035;
        valueOf = true;
        DigitizedCardProfile = true;
    }

    static void init$0() {
        $$a = new byte[]{98, 74, -39, 82, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM};
        $$b = 24;
    }

    static void valueOf() {
        int i = RecordsJson + 15;
        int i2 = i % 128;
        IccPrivateKeyCrtComponentsJson = i2;
        values = -8397299140295942987L;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        RecordsJson = (i2 + 67) % 128;
    }
}
