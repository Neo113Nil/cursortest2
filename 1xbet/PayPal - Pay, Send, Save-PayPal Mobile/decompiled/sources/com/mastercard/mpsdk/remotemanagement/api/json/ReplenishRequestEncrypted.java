package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ReplenishRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static int writeReplace;
    private final com.payair.hce.checkPermission mLogUtils;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionCredentialsStatus")
    private com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] transactionCredentialsStatus;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 4;
        byte[] bArr = $$a;
        int i4 = 111 - (b * 2);
        int i5 = 4 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            i4 = i5;
            int i6 = i3;
            int i7 = 0;
            i5++;
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    public ReplenishRequestEncrypted(java.lang.String str, java.lang.String str2, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        super(str);
        this.mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        this.tokenUniqueReference = str2;
        this.transactionCredentialsStatus = singleUseKeyStatusArr;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted
    public java.lang.String getRequestId() {
        int i = writeReplace + 117;
        valueOf = i % 128;
        java.lang.String str = this.requestId;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = valueOf;
        int i2 = i + 103;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.tokenUniqueReference;
        int i3 = i + 43;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ReplenishRequestEncrypted setTokenUniqueReference(java.lang.String str) {
        int i = writeReplace + 113;
        int i2 = i % 128;
        valueOf = i2;
        if (i % 2 != 0) {
            this.tokenUniqueReference = str;
            int i3 = i2 + 117;
            writeReplace = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }
        this.tokenUniqueReference = str;
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] getTransactionCredentialsStatus() {
        int i = writeReplace + 17;
        valueOf = i % 128;
        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr = this.transactionCredentialsStatus;
        if (i % 2 != 0) {
            return singleUseKeyStatusArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ReplenishRequestEncrypted setTransactionCredentialsStatus(com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        int i = (valueOf + 57) % 128;
        writeReplace = i;
        this.transactionCredentialsStatus = singleUseKeyStatusArr;
        int i2 = i + 21;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 7, 152, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000", false, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        valueOf = (writeReplace + 63) % 128;
        return DigitizedCardProfile;
    }

    public java.lang.String toString() {
        writeReplace = (valueOf + 95) % 128;
        java.util.Arrays.toString(this.transactionCredentialsStatus);
        java.lang.String simpleName = getClass().getSimpleName();
        valueOf = (writeReplace + 113) % 128;
        return simpleName;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i6]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 29, 2807 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))));
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        cArr = cArr2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i6++;
                    cArr2 = cArr;
                    c = 0;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        java.lang.System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr2 != null) {
            $11 = ($10 + 87) % 128;
            char[] cArr5 = new char[i3];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i3) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2837 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                        byte b3 = (byte) ($$b & 10);
                        byte b4 = (byte) (b3 - 2);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, android.view.View.getDefaultSize(0, 0) + 2880, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 35, 212 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            $11 = ($10 + 103) % 128;
            char[] cArr6 = new char[i3];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i9 = i3 - i5;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i9, i5);
            java.lang.System.arraycopy(cArr6, i5, cArr4, 0, i9);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i3];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i3) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i3 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            int i10 = $10 + 13;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                getaccounttype.writeReplace = 1;
            } else {
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i3) {
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        AlternateContactlessPaymentDataJson = new char[]{16815, 16650, 16686, 16689, 16688, 16588, 16581};
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = 39;
    }
}
