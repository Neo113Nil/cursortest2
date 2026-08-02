package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class SetMobilePinRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int values;

    @com.payair.hce.setSelectionFromTop(valueOf = "newMobilePin")
    private byte[] newMobilePin;

    @com.payair.hce.setSelectionFromTop(valueOf = "taskId")
    private java.lang.String taskId;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = (s * 2) + 1;
        int i6 = (b2 * 4) + 115;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += i6;
            i2 = i7;
            i = i8;
            bArr2[i] = (byte) i4;
            i3 = i + 1;
            int i9 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i6 = bArr[i9];
            i8 = i3;
            i4 += i6;
            i2 = i7;
            i = i8;
            bArr2[i] = (byte) i4;
            i3 = i + 1;
            int i92 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = i4;
            i4 = i6;
            bArr2[i] = (byte) i4;
            i3 = i + 1;
            int i922 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    public SetMobilePinRequestEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.tokenUniqueReference = str2;
        this.taskId = str3;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = values;
        DigitizedCardProfile = (i + 119) % 128;
        java.lang.String str = this.tokenUniqueReference;
        int i2 = i + 13;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinRequestEncrypted setTokenUniqueReference(java.lang.String str) {
        int i = DigitizedCardProfile + 55;
        values = i % 128;
        if (i % 2 != 0) {
            this.tokenUniqueReference = str;
            return this;
        }
        this.tokenUniqueReference = str;
        throw null;
    }

    public byte[] getNewMobilePin() {
        int i = (values + 75) % 128;
        DigitizedCardProfile = i;
        byte[] bArr = this.newMobilePin;
        int i2 = i + 27;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinRequestEncrypted setNewMobilePin(com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings) {
        int i = values + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            this.newMobilePin = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings));
            return this;
        }
        this.newMobilePin = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings));
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getTaskId() {
        int i = values + 67;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.taskId;
        int i3 = i2 + 121;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinRequestEncrypted setTaskId(java.lang.String str) {
        int i = (DigitizedCardProfile + 31) % 128;
        values = i;
        this.taskId = str;
        int i2 = i + 43;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\u0014\u000bￖￒ\u001b\u001b\t", android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4, 7 - android.graphics.Color.blue(0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "\u0011\uffe7\t￼\u0003\u0006\uffff￪\u0003\b\b\uffff", 244 - android.view.KeyEvent.keyCodeFromString(""), android.view.View.combineMeasuredStates(0, 0) + 10, 12 - android.view.KeyEvent.keyCodeFromString(""), objArr2);
        setchilddivider.values(((java.lang.String) objArr2[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.checkCallingOrSelfPermission(), byte[].class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = values + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "\u0000￫\u0004\t￭\u0000\f\u0010\u0000\u000e\u000f￠\t\ufffe\r\u0014\u000b\u000f\u0000\uffff\u0016\r\u0000\f\u0010\u0000\u000e\u000f￤\uffff\uffd8ￂ￮\u0000\u000f￨\n�\u0004\u0007", 242 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 'P' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 40 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.requestId);
        sb.append('\'');
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, "\uffdf\u0007\u0005\u0010\u0007\u0014\u0007\b\u0007\ufff4\u0007\u0017\u0013\u000b\u0010\ufff7\u0010\u0007\r\u0011\u0016ￂￎ\uffc9", 236 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 22 - android.graphics.ImageFormat.getBitsPerPixel(0), 24 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.tokenUniqueReference);
        sb.append('\'');
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, "\u001d\u000b\u0014ￆￒ￣\u0014\u000f\ufff6\u000b\u0012\u000f\b\u0015\ufff3", 232 - android.view.KeyEvent.normalizeMetaState(0), 5 - android.graphics.Color.green(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.newMobilePin);
        if (sb.toString() != null) {
            DigitizedCardProfile = (values + 5) % 128;
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.newMobilePin).writeReplace();
            values = (DigitizedCardProfile + 85) % 128;
        }
        return getClass().getSimpleName();
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i4 = $11 + 95;
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            int i6 = i5 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 15) % 128;
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i7 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i7]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2073, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) -1, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3495, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            $10 = ($11 + 71) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            java.lang.System.arraycopy(cArr5, 0, cArr4, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr5, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr4, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i9 = $11 + 13;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[i3 / digitizedCardJson11.DigitizedCardProfile];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.rgb(0, 0, 0) + 16780759, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 53, android.view.View.resolveSize(0, 0) + 3543, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
                $11 = ($10 + 59) % 128;
            }
            int i10 = $11 + 67;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 2;
            }
            cArr4 = cArr2;
        }
        java.lang.String str2 = new java.lang.String(cArr4);
        $10 = ($11 + 117) % 128;
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = 1889207279;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 152;
    }
}
