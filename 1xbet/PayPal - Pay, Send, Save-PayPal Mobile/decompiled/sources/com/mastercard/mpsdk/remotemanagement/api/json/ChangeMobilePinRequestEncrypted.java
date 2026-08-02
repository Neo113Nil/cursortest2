package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ChangeMobilePinRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "currentMobilePin")
    private byte[] currentMobilePin;
    private com.payair.hce.checkPermission mLogUtils;

    @com.payair.hce.setSelectionFromTop(valueOf = "newMobilePin")
    private byte[] newMobilePin;

    @com.payair.hce.setSelectionFromTop(valueOf = "taskId")
    private java.lang.String taskId;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 4 - (b * 2);
        int i3 = b2 * 2;
        int i4 = (s * 3) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i6;
            i2 = i5 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = bArr[i2];
            int i9 = i2;
            i6 = i4;
            i4 = i8;
            i7 = i + 1;
            i5 = i9;
            i4 = (-i4) + i6;
            i2 = i5 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    public ChangeMobilePinRequestEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.mLogUtils = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        this.tokenUniqueReference = str2;
        this.taskId = str3;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (i + 93) % 128;
        java.lang.String str = this.tokenUniqueReference;
        int i2 = i + 41;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted setTokenUniqueReference(java.lang.String str) {
        int i = writeReplace + 41;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            this.tokenUniqueReference = str;
            int i3 = i2 + 51;
            writeReplace = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }
        this.tokenUniqueReference = str;
        throw new java.lang.ArithmeticException();
    }

    public byte[] getCurrentMobilePin() {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (i + 117) % 128;
        byte[] bArr = this.currentMobilePin;
        int i2 = i + 9;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted setCurrentMobilePin(com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings) {
        AlternateContactlessPaymentDataJson = (writeReplace + 117) % 128;
        this.currentMobilePin = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings));
        writeReplace = (AlternateContactlessPaymentDataJson + 95) % 128;
        return this;
    }

    public byte[] getNewMobilePin() {
        int i = (writeReplace + 85) % 128;
        AlternateContactlessPaymentDataJson = i;
        byte[] bArr = this.newMobilePin;
        int i2 = i + 87;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted setNewMobilePin(com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings) {
        AlternateContactlessPaymentDataJson = (writeReplace + 63) % 128;
        this.newMobilePin = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings));
        AlternateContactlessPaymentDataJson = (writeReplace + 95) % 128;
        return this;
    }

    public java.lang.String getTaskId() {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (i + 103) % 128;
        java.lang.String str = this.taskId;
        int i2 = i + 43;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted setTaskId(java.lang.String str) {
        int i = writeReplace + 99;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            this.taskId = str;
            writeReplace = (i2 + 95) % 128;
            return this;
        }
        this.taskId = str;
        throw null;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $10 + 31;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2025, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60037));
                    byte b = $$a[2];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.Color.green(0) + 3543, (char) android.graphics.Color.blue(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $11 = ($10 + 49) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 53, android.text.TextUtils.indexOf("", "", 0, 0) + 3543, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 115) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\u001b\u001b\t\u0014\u000bￖￒ", 141 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, 8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "￨\u0001\u0006\ufffb\r\n\n�\u0006\f￥\u0007\ufffa\u0001\u0004�", 158 - android.view.KeyEvent.normalizeMetaState(0), 3 - (android.os.Process.myTid() >> 22), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr2);
        setchilddivider.values(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, "\u0011\uffff\b\b\u0003￪\uffff\u0006\u0003￼\t\uffe7", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 157, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, objArr3);
        setchilddivider.values(((java.lang.String) objArr3[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.checkCallingOrSelfPermission(), byte[].class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        writeReplace = (AlternateContactlessPaymentDataJson + 57) % 128;
        return DigitizedCardProfile2;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "￡\n\uffff\u000e\u0015\f\u0010\u0001\u0000\u0017\u000e\u0001\r\u0011\u0001\u000f\u0010￥\u0000\uffd9ￃ\uffdf\u0004�\n\u0003\u0001￩\u000b\ufffe\u0005\b\u0001￬\u0005\n￮\u0001\r\u0011\u0001\u000f\u0010", 154 - android.view.KeyEvent.getDeadChar(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.requestId);
        sb.append('\'');
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, "\uffc9\uffdf\u0007\u0005\u0010\u0007\u0014\u0007\b\u0007\ufff4\u0007\u0017\u0013\u000b\u0010\ufff7\u0010\u0007\r\u0011\u0016ￂￎ", 149 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 24, 'H' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.tokenUniqueReference);
        sb.append('\'');
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, "\u000b\ufff2\u0007\u000e\u000b\u0004\u0011\uffef\u0016\u0010\u0007\u0014\u0014\u0017\u0005ￂￎ\uffdf\u0010", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 147, android.widget.ExpandableListView.getPackedPositionChild(0L) + 18, 19 - android.text.TextUtils.getCapsMode("", 0, 0), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.currentMobilePin);
        if (sb.toString() != null) {
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.currentMobilePin).writeReplace();
            AlternateContactlessPaymentDataJson = (writeReplace + 85) % 128;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("null");
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(false, "\u0015\b\u000f\u0012\u000b\ufff6\u000f\u0014￣ￒￆ\u0014\u000b\u001d\ufff3", 144 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 9, 15 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(this.newMobilePin);
            if (sb2.toString() != null) {
                AlternateContactlessPaymentDataJson = (writeReplace + 117) % 128;
                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.newMobilePin).writeReplace();
            }
        }
        return getClass().getSimpleName();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        DigitizedCardProfile = 1889207127;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
        $$b = 126;
    }
}
