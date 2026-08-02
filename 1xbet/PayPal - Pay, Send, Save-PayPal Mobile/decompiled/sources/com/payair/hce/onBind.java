package com.payair.hce;

/* loaded from: classes4.dex */
public class onBind implements com.payair.hce.setTheme {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private final com.payair.hce.VisaRepersoInitializer AlternateContactlessPaymentDataJson;
    private final com.payair.hce.accessgetCoroutineScopep DigitizedCardProfile;
    private com.payair.hce.checkPermission getAid;
    private final com.payair.hce.getText valueOf;
    private com.payair.hce.getAttributionTag values;
    private final com.payair.hce.gotPostData writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (s * 3);
        int i5 = 3 - (i * 4);
        int i6 = (b * 2) + 115;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += i7;
            i2 = i3;
            int i8 = i5;
            int i9 = i6;
            i3 = i2 + 1;
            int i10 = i8 + 1;
            bArr2[i2] = (byte) i9;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i10;
            i6 = bArr[i10];
            i7 = i9;
            i6 += i7;
            i2 = i3;
            int i82 = i5;
            int i92 = i6;
            i3 = i2 + 1;
            int i102 = i82 + 1;
            bArr2[i2] = (byte) i92;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5;
            int i922 = i6;
            i3 = i2 + 1;
            int i1022 = i822 + 1;
            bArr2[i2] = (byte) i922;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    public onBind(com.payair.hce.gotPostData gotpostdata, com.payair.hce.VisaRepersoInitializer visaRepersoInitializer, com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep, com.payair.hce.getText gettext, com.payair.hce.getAttributionTag getattributiontag) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "ￛ\u0006\uffff\u000eￛ7", android.view.KeyEvent.keyCodeFromString("") + 146, android.text.TextUtils.getOffsetAfter("", 0) + 4, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onBind.class.getName());
        this.getAid = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.writeReplace = gotpostdata;
        this.values = getattributiontag;
        this.AlternateContactlessPaymentDataJson = visaRepersoInitializer;
        this.DigitizedCardProfile = accessgetcoroutinescopep;
        this.valueOf = gettext;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 43) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 44, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2072, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 60038));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53, 3543 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 54, 3544 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 69) % 128;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.setTheme
    public final com.payair.hce.getText values() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 51;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.getText gettext = this.valueOf;
        RecordsJson = (i + 53) % 128;
        return gettext;
    }

    @Override // com.payair.hce.setTheme
    public final com.payair.hce.gotPostData writeReplace() {
        int i = (IccPrivateKeyCrtComponentsJson + 119) % 128;
        RecordsJson = i;
        com.payair.hce.gotPostData gotpostdata = this.writeReplace;
        int i2 = i + 63;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return gotpostdata;
        }
        throw null;
    }

    @Override // com.payair.hce.setTheme
    public final com.payair.hce.getSharedPreferences AlternateContactlessPaymentDataJson() {
        int i = IccPrivateKeyCrtComponentsJson + 71;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.getAttributionTag getattributiontag = this.values;
        int i3 = i2 + 79;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return getattributiontag;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onBind onbind = (com.payair.hce.onBind) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 19;
        RecordsJson = i2 % 128;
        com.payair.hce.VisaRepersoInitializer visaRepersoInitializer = onbind.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 77;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return visaRepersoInitializer;
        }
        throw null;
    }

    @Override // com.payair.hce.setTheme
    public final void DigitizedCardProfile() {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 33) % 128;
        this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
        this.values.values();
        int i = RecordsJson + 79;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setTheme
    public final com.payair.hce.copy RecordsJson() {
        int i = RecordsJson + 35;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.VisaRepersoInitializer visaRepersoInitializer = this.AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return visaRepersoInitializer;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 1889207084;
    }

    static void init$0() {
        $$a = new byte[]{97, -8, 44, 77};
        $$b = 145;
    }

    @Override // com.payair.hce.setTheme
    public final com.payair.hce.VisaRepersoInitializer valueOf() {
        return (com.payair.hce.VisaRepersoInitializer) writeReplace(new java.lang.Object[]{this}, -1083486357, 1083486357, java.lang.System.identityHashCode(this));
    }
}
