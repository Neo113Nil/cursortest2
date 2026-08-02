package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMppLiteModule implements com.payair.hce.getDefaultCardForContactlessPayments {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static long values;
    private static int writeReplace;
    private java.util.List<com.payair.hce.resetAuthenticationReferences> AlternateContactlessPaymentDataJson;
    private com.payair.hce.reInitialize DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (i * 3);
        int i5 = s * 4;
        byte[] bArr = $$a;
        int i6 = i2 + 112;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i4;
            int i10 = (-i4) + i7;
            i3 = i8;
            int i11 = i9;
            i6 = i10;
            i4 = i11;
            bArr2[i3] = (byte) i6;
            int i12 = i4 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i6;
            i9 = i12;
            i4 = bArr[i12];
            i7 = i13;
            int i102 = (-i4) + i7;
            i3 = i8;
            int i112 = i9;
            i6 = i102;
            i4 = i112;
            bArr2[i3] = (byte) i6;
            int i122 = i4 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            int i1222 = i4 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        }
    }

    public setMppLiteModule(com.payair.hce.reInitialize reinitialize, java.util.List<com.payair.hce.resetAuthenticationReferences> list) {
        this.DigitizedCardProfile = reinitialize;
        this.AlternateContactlessPaymentDataJson = list;
    }

    @Override // com.payair.hce.getDefaultCardForContactlessPayments
    public final com.payair.hce.reInitialize valueOf() {
        int i = (valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        writeReplace = i;
        com.payair.hce.reInitialize reinitialize = this.DigitizedCardProfile;
        valueOf = (i + 19) % 128;
        return reinitialize;
    }

    @Override // com.payair.hce.getDefaultCardForContactlessPayments
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> DigitizedCardProfile() {
        int i = (writeReplace + 107) % 128;
        valueOf = i;
        java.util.List<com.payair.hce.resetAuthenticationReferences> list = this.AlternateContactlessPaymentDataJson;
        writeReplace = (i + 105) % 128;
        return list;
    }

    public final java.lang.String toString() {
        valueOf = (writeReplace + 115) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.KeyEvent.getMaxKeyCode();
        android.view.ViewConfiguration.getZoomControlsTimeout();
        new java.lang.Object[]{this.DigitizedCardProfile};
        android.view.ViewConfiguration.getEdgeSlop();
        new java.lang.Object[]{this.AlternateContactlessPaymentDataJson};
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("죦롏⧍饗ે爫毥\udb6c䳺㱷궈ᴧ躑縔\uef9b弧삺뀯↺鋀ɔ", 28807 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        writeReplace = (valueOf + 35) % 128;
        return intern;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 89;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1890 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(65 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1444 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (29682 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 23) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1443, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29634));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, 0, 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        values = 8980031019943312931L;
    }

    static void init$0() {
        $$a = new byte[]{59, 86, -115, -69};
        $$b = 53;
    }
}
