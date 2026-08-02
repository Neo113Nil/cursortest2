package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ProvisionResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private static int values;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardProfile")
    public com.mastercard.mpsdk.card.profile.DigitizedCardProfile cardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "iccKek")
    public java.lang.String iccKek;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 2) + 99;
        byte[] bArr = $$a;
        int i5 = 1 - (b * 2);
        int i6 = (s * 3) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i6];
            i6++;
            i4 = (-i4) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public ProvisionResponseEncrypted() {
    }

    public ProvisionResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.mastercard.mpsdk.card.profile.DigitizedCardProfile digitizedCardProfile, java.lang.String str5) {
        super(str, str2, str3, str4);
        this.cardProfile = digitizedCardProfile;
        this.iccKek = str5;
    }

    public com.mastercard.mpsdk.card.profile.DigitizedCardProfile getCardProfile() {
        int i = valueOf + 39;
        int i2 = i % 128;
        values = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.mastercard.mpsdk.card.profile.DigitizedCardProfile digitizedCardProfile = this.cardProfile;
        valueOf = (i2 + 39) % 128;
        return digitizedCardProfile;
    }

    public void setCardProfile(com.mastercard.mpsdk.card.profile.DigitizedCardProfile digitizedCardProfile) {
        int i = valueOf + 5;
        values = i % 128;
        if (i % 2 != 0) {
            this.cardProfile = digitizedCardProfile;
        } else {
            this.cardProfile = digitizedCardProfile;
            throw null;
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i >>> getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47, android.view.View.MeasureSpec.getSize(0) + 381, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 62388));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 35, 3966 - (android.os.Process.myTid() >> 22), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 213 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 49, android.widget.ExpandableListView.getPackedPositionChild(0L) + 382, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 0, 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3966 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777182) - android.graphics.Color.rgb(0, 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 211, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 35, 212 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public java.lang.String getIccKek() {
        int i = (valueOf + 55) % 128;
        values = i;
        java.lang.String str = this.iccKek;
        int i2 = i + 57;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setIccKek(java.lang.String str) {
        int i = valueOf + 53;
        int i2 = i % 128;
        values = i2;
        if (i % 2 != 0) {
            this.iccKek = str;
            valueOf = (i2 + 25) % 128;
        } else {
            this.iccKek = str;
            throw null;
        }
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        java.lang.String str = new java.lang.String(bArr);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(android.view.ViewConfiguration.getFadingEdgeLength() >> 16, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 7 - android.view.View.MeasureSpec.getMode(0), objArr);
            if (str.contains(((java.lang.String) objArr[0]).intern())) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, (char) (17889 - android.graphics.ImageFormat.getBitsPerPixel(0)), 12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr2[0]).intern());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 7 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
                if (!jSONObject2.getString(((java.lang.String) objArr3[0]).intern()).trim().equalsIgnoreCase(com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile.toString())) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(android.text.TextUtils.indexOf("", "", 0) + 18, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 58294), (android.os.Process.myTid() >> 22) + 29, objArr4);
                    throw new org.json.JSONException(((java.lang.String) objArr4[0]).intern());
                }
                com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 7, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 17890), 12 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
                com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, ((java.lang.String) objArr5[0]).intern(), com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.class}, -767319137, 767319142, java.lang.System.identityHashCode(setonitemselectedlistener));
                java.lang.Object values2 = com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener2));
                java.lang.Object obj = values2;
                com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted provisionResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted) values2;
                int i = values + 35;
                valueOf = i % 128;
                if (i % 2 == 0) {
                    return provisionResponseEncrypted;
                }
                throw null;
            }
            com.payair.hce.setOnItemSelectedListener setonitemselectedlistener3 = new com.payair.hce.setOnItemSelectedListener();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, (char) (17891 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionChild(0L) + 12, objArr6);
            com.payair.hce.setOnItemSelectedListener setonitemselectedlistener4 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener3, ((java.lang.String) objArr6[0]).intern(), com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.class}, -767319137, 767319142, java.lang.System.identityHashCode(setonitemselectedlistener3));
            java.lang.Object values3 = com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener4, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener4));
            java.lang.Object obj2 = values3;
            return (com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted) values3;
        } catch (org.json.JSONException e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
            new java.lang.Object[]{e};
            return null;
        }
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toJsonString() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(48 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 7 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = valueOf + 59;
        values = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.Color.alpha(0) + 54, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 30 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 85, (char) (android.graphics.Color.red(0) + 46568), 9 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
        ((java.lang.String) objArr2[0]).intern();
        int i = values + 63;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return "ProvisionResponseEncrypted";
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        values = 1;
        DigitizedCardProfile = new char[]{24281, 28789, 931, 53985, 58426, 46971, 18107, 6958, 13715, 17985, 38676, 41441, 62084, 856, 23570, 28380, 49046, 51294, 48458, 37847, 57355, 12609, 1935, 21709, 42245, 64003, 51348, 6600, 28190, 48988, 36231, 58054, 13062, 11, 22148, 42970, 62464, 50455, 7045, 26820, 47360, 36419, 56477, 11727, 520, 21338, 41370, 24197, 28734, 946, 54014, 58418, 46951, 18086, 24319, 28770, 958, 53988, 58426, 46951, 18108, 6649, 11065, 64074, 36284, 23785, 28203, 371, 53427, 58349, 46394, 17531, 6050, 9955, 63537, 35680, 23189, 28148, 16168, 52846, 57760, 45286, 16942, 5425, 60267, 50648, 46672, 26393, 20952, 695, 62296, 44053, 40578, 20439};
        AlternateContactlessPaymentDataJson = -6860673951745937392L;
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30};
        $$b = 89;
    }
}
