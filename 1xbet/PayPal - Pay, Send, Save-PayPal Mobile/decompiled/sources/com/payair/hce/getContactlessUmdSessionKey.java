package com.payair.hce;

/* loaded from: classes10.dex */
public final class getContactlessUmdSessionKey implements com.payair.hce.getTransactionCredentials {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static char[] writeReplace;
    private java.lang.String values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (b * 3);
        int i5 = 99 - (i2 * 4);
        int i6 = i * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            int i9 = i7;
            int i10 = 0;
            int i11 = i4 + i9;
            i3 = i10;
            int i12 = i8;
            i5 = i11;
            i4 = i12;
            int i13 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i5;
            i8 = i13;
            i4 = bArr[i13];
            i10 = i3 + 1;
            i9 = i14;
            int i112 = i4 + i9;
            i3 = i10;
            int i122 = i8;
            i5 = i112;
            i4 = i122;
            int i132 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1322 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private getContactlessUmdSessionKey() {
    }

    private getContactlessUmdSessionKey(java.lang.String str) {
        this.values = str;
    }

    public static com.payair.hce.getContactlessUmdSessionKey AlternateContactlessPaymentDataJson(java.lang.String str) {
        com.payair.hce.getContactlessUmdSessionKey getcontactlessumdsessionkey = new com.payair.hce.getContactlessUmdSessionKey(str);
        int i = valueOf + 93;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return getcontactlessumdsessionkey;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        long j;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 101) % 128;
        while (true) {
            j = 0;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(writeReplace[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getOffsetBefore("", 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 380, (char) (android.graphics.Color.blue(0) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 35, 3965 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.KeyEvent.keyCodeFromString("") + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, 212 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $10 + 1;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 212 - android.graphics.Color.alpha(0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.getDefaultSize(0, 0), 211 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            j = 0;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.getTransactionCredentials
    public final java.lang.String DigitizedCardProfile(com.payair.hce.ReplenishResponseEncrypted[] replenishResponseEncryptedArr) {
        DigitizedCardProfile = (valueOf + 41) % 128;
        com.payair.hce.setContactlessUmdSingleUseKey[] setcontactlessumdsingleusekeyArr = new com.payair.hce.setContactlessUmdSingleUseKey[replenishResponseEncryptedArr.length];
        for (int i = 0; i < replenishResponseEncryptedArr.length; i++) {
            com.payair.hce.setContactlessUmdSingleUseKey setcontactlessumdsingleusekey = new com.payair.hce.setContactlessUmdSingleUseKey();
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = replenishResponseEncryptedArr[i];
            com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted}, 1219330914, -1219330912, java.lang.System.identityHashCode(replenishResponseEncrypted));
            setcontactlessumdsingleusekey.writeReplace = java.lang.Integer.parseInt(geticckek.values(), 16);
            setcontactlessumdsingleusekey.AlternateContactlessPaymentDataJson = valueOf(geticckek.RecordsJson());
            setcontactlessumdsingleusekey.values = valueOf(geticckek.DigitizedCardProfile());
            setcontactlessumdsingleusekey.RecordsJson = valueOf(geticckek.getProfileVersion());
            setcontactlessumdsingleusekey.getAid = valueOf(geticckek.writeReplace());
            setcontactlessumdsingleusekey.DigitizedCardProfile = valueOf(geticckek.valueOf());
            setcontactlessumdsingleusekey.SdkCoreAlternateContactlessPaymentDataImpl = valueOf((java.lang.String) com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek}, 653749449, -653749447, java.lang.System.identityHashCode(geticckek)));
            setcontactlessumdsingleusekey.valueOf = valueOf((java.lang.String) com.payair.hce.getIccKek.DigitizedCardProfile(new java.lang.Object[]{geticckek}, -1760992470, 1760992471, java.lang.System.identityHashCode(geticckek)));
            setcontactlessumdsingleusekeyArr[i] = setcontactlessumdsingleusekey;
        }
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (7197 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(setcontactlessumdsingleusekeyArr);
        DigitizedCardProfile = (valueOf + 89) % 128;
        return DigitizedCardProfile2;
    }

    private java.lang.String valueOf(java.lang.String str) {
        valueOf = (DigitizedCardProfile + 29) % 128;
        try {
            java.lang.String values = com.payair.hce.getPendingAction.writeReplace().values(str, this.values);
            valueOf = (DigitizedCardProfile + 9) % 128;
            java.lang.String upperCase = values.toUpperCase();
            DigitizedCardProfile = (valueOf + 33) % 128;
            return upperCase;
        } catch (com.payair.hce.setVersion e) {
            e.printStackTrace();
            return null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        valueOf = 1;
        writeReplace = new char[]{17051, 5122, 61416, 16650, 6308, 62419, 17772};
        AlternateContactlessPaymentDataJson = -2793138525738760142L;
    }

    static void init$0() {
        $$a = new byte[]{57, -61, -44, -120};
        $$b = 128;
    }
}
