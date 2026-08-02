package com.payair.hce;

/* loaded from: classes4.dex */
public final class clearAllTables extends com.payair.hce.getRequiredTypeConverters<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getAid;
    private static int getProfileVersion;
    private static long valueOf;
    private static final com.payair.hce.transactionCanBeResumed values;
    private int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (b * 4);
        int i5 = (s * 3) + 1;
        int i6 = (i * 2) + 117;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            int i9 = (-i4) + i8;
            i2 = i3;
            int i10 = i7;
            i6 = i9;
            i4 = i10;
            i3 = i2 + 1;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i6;
            i7 = i11;
            i4 = bArr[i11];
            i8 = i12;
            int i92 = (-i4) + i8;
            i2 = i3;
            int i102 = i7;
            i6 = i92;
            i4 = i102;
            i3 = i2 + 1;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson();
        values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE});
        getAid = (getProfileVersion + 3) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.payair.hce.transactionCanBeResumed] */
    public clearAllTables(byte[] bArr) throws com.payair.hce.postToastMessageOnUi {
        this.DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr);
        this.writeReplace = (int) com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile).valueOf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        int i = getAid + 91;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile;
        int i2 = getProfileVersion + 43;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.payair.hce.getWalletIdentificationDataProvider values() throws com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate, com.payair.hce.createDemoTransactionCredentials {
        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(values, com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((com.payair.hce.transactionCanBeResumed) this.DigitizedCardProfile));
        int i = getAid + 45;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return getwalletidentificationdataprovider;
        }
        throw null;
    }

    public final int writeReplace() {
        int i = getAid;
        getProfileVersion = (i + 17) % 128;
        int i2 = this.writeReplace;
        int i3 = i + 19;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public final java.lang.String toString() {
        com.payair.hce.setMaximumPinTry.valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue1f0\ue1ab㎯뗤쐈ꞧ졬㗉領귴\ue057\u0d80퇔薜\uf803斧\ua9dcﵟ郥絟脣핤\ua8df啭饑촒䂺괂煯┠奢蓝䢍\u1cff焙", android.text.TextUtils.getCapsMode("", 0, 0), objArr);
        ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("瑴瑔㞲놐ꍜ⬚꼺륥氫ꦠ蜂脥䑐膍齋\ue949", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr2);
        ((java.lang.String) objArr2[0]).intern();
        T t = this.DigitizedCardProfile;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("쾶쾟䀘粄Ը매", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
        ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("㵦㴧\udb39嵃枆빾毢Ⰼ┧䕨䏛ᑌൟ洌完籄畬ᗚ㍤撛嶧㷰\u0b46䲩䗁▅\ue319듷귣춭\ufaf6鴕鐌", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        int i = getAid + 55;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 81) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 40, 1921 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 429, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, 1, (short) 0, objArr5);
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
        java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
        $11 = ($10 + 41) % 128;
        objArr[0] = str2;
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = 6485295407599710921L;
    }

    static void init$0() {
        $$a = new byte[]{14, 101, 71, 43};
        $$b = 116;
    }
}
