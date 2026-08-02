package com.payair.hce;

/* loaded from: classes10.dex */
final class setCardholderValidators {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreCardRiskManagementDataImpl;
    private static char getAdditionalCheckTable;
    private static int getCardholderValidators;
    private static char getCvmResetTimeout;
    private static long getDualTapResetTimeout;
    private static int getMagstripeCvmIssuerOptions;
    private static char getMchipCvmIssuerOptions;
    private static int[] getSecurityWord;
    private java.lang.String AlternateContactlessPaymentDataJson = "";
    private java.lang.String DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private java.lang.String SdkCoreBusinessLogicModuleImpl;
    private java.lang.String getAid;
    private boolean getApplicationLifeCycleData;
    private java.lang.String getCardLayoutDescription;
    private com.payair.hce.getSessionCode getCiacDecline;
    private com.payair.hce.getSessionCode getCvrMaskAnd;
    private com.payair.hce.getSessionCode getGpoResponse;
    private java.lang.String getPaymentFci;
    private java.lang.String getProfileVersion;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (i * 2);
        int i5 = i2 * 4;
        int i6 = b + 66;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = i7;
            i3 = 0;
            int i10 = i4 + (-i9);
            i4 = i8;
            i6 = i10;
            int i11 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i9 = bArr[i11];
            i4 = i6;
            i8 = i11;
            int i102 = i4 + (-i9);
            i4 = i8;
            i6 = i102;
            int i112 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object DigitizedCardProfile;
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = (i * (-665)) + (i2 * com.visa.cbp.getCertUsage.setODAData) + (i4 * (-333)) + (((~(i4 | i5)) | (~(i2 | i3))) * com.visa.cbp.getCertUsage.getODAData) + (((~(i2 | i5)) | (~(i3 | i4))) * com.visa.cbp.getCertUsage.getODAData);
        if (i6 != 1) {
            return i6 != 2 ? DigitizedCardProfile(objArr) : valueOf(objArr);
        }
        com.payair.hce.setCardholderValidators setcardholdervalidators = (com.payair.hce.setCardholderValidators) objArr[0];
        int i7 = getMagstripeCvmIssuerOptions + 47;
        getCardholderValidators = i7 % 128;
        if (i7 % 2 == 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{-683238341, -301528591}, 5 / (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >>> 111), objArr2);
            DigitizedCardProfile = com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), com.payair.hce.setCdol1RelatedDataLength.writeReplace(setcardholdervalidators.AlternateContactlessPaymentDataJson, setcardholdervalidators.valueOf, setcardholdervalidators.getCardLayoutDescription, setcardholdervalidators.getPaymentFci)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{-683238341, -301528591}, 2 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
            DigitizedCardProfile = com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr3[0]).intern(), com.payair.hce.setCdol1RelatedDataLength.writeReplace(setcardholdervalidators.AlternateContactlessPaymentDataJson, setcardholdervalidators.valueOf, setcardholdervalidators.getCardLayoutDescription, setcardholdervalidators.getPaymentFci)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        return (java.lang.String) DigitizedCardProfile;
    }

    setCardholderValidators() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1820780944, 1122635045, -2076858242, 104731719}, android.graphics.Color.blue(0) + 6, objArr);
        this.valueOf = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{522551113, -796897147}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr2);
        this.writeReplace = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{-1173316834, 730051715}, 3 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        this.values = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{-1311131476, -1216173054, 2088782763, -2132744537, 347800516, -620520591}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 10, objArr4);
        this.DigitizedCardProfile = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("汙䑦汩찓籵혔泚仈", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr5);
        this.RecordsJson = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("\uf63f䇌\uf60e짂鐋猦蒫\uebf2", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr6);
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{334009836, 623153906, -1595592131, 2081430110, -1595592131, 2081430110, -1595592131, 2081430110, -1595592131, 2081430110, 227376519, 1521745559}, 24 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
        this.IccPrivateKeyCrtComponentsJson = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b("谉\ud984谹凸髾춼詖啨괉烈ꬆ瞘칙ጘ젶ᛈ\uefa9", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr8);
        this.getPaymentFci = ((java.lang.String) objArr8[0]).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b("嬰Э嬂豓葅렘铫", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr9);
        this.getCardLayoutDescription = ((java.lang.String) objArr9[0]).intern();
        this.getApplicationLifeCycleData = false;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 61;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getDualTapResetTimeout ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $10 = ($11 + 101) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getDualTapResetTimeout)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1921, (char) android.text.TextUtils.indexOf("", "", 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, android.graphics.Color.alpha(0) + 429, (char) (31611 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 0, 0, objArr5);
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
        int i4 = $11 + 61;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getMchipCvmIssuerOptions ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreCardRiskManagementDataImpl)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1335, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 44, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getCvmResetTimeout ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAdditionalCheckTable)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 62, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1335, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) 44, 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 53, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3543, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getSecurityWord;
        int i3 = 1;
        int i4 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                $11 = ($10 + 53) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[i4] = java.lang.Integer.valueOf(iArr4[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(i4) + 27, 29 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr5[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = 1;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getSecurityWord;
        if (iArr7 != null) {
            int i6 = $11 + 25;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                $10 = ($11 + 51) % 128;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr7[i2])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr3 = iArr7;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, 29 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i2++;
                iArr7 = iArr3;
            }
            iArr7 = iArr2;
        }
        java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length3);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $11 = ($10 + 113) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                int i9 = $10 + 101;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i7];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 32, 5088 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i7 += 41;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i7];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5088, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i7++;
                }
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionChild(0L), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2923, (char) (3038 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) 0, 0, 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        try {
            byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{1154882909, -760264861, 2139700445, 753098672}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, objArr);
                try {
                    java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c("⢄⏩忤靠뻋ࡪⅇ떹됻寛䉓얁\udce7肠ꨴ뷘\ue622帩杹혁\uefcc爢睻텈\uf252\uda1e㞍썁", 27 - android.graphics.Color.green(0), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c("뺝늟踹➽⿰䇖\ue863滪畔픨띳\uf4e1", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c("⢄⏩忤靠뻋ࡪⅇ떹됻寛䉓얁\udce7肠ꨴ뷘\ue622帩杹혁\uefcc爢睻텈\uf252\uda1e㞍썁", 27 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c("ͼⱌ촚퇓㶴墡", 6 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                        cls2.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, decodeHex);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            c("⢄⏩忤靠뻋ࡪⅇ떹됻寛䉓얁\udce7肠ꨴ뷘\ue622帩杹혁\uefcc爢睻텈\uf252\uda1e㞍썁", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, objArr7);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c("ᆮ룸뺝늟ႆʤ", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6, objArr8);
                            return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) cls3.getMethod((java.lang.String) objArr8[0], null).invoke(invoke, null)));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        } catch (org.apache.commons.codec.DecoderException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final com.payair.hce.setCardholderValidators AlternateContactlessPaymentDataJson(com.payair.hce.getSessionCode getsessioncode) {
        int i = getMagstripeCvmIssuerOptions + 109;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
            this.getGpoResponse = getsessioncode;
            return this;
        }
        this.getGpoResponse = getsessioncode;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setCardholderValidators setcardholdervalidators = (com.payair.hce.setCardholderValidators) objArr[0];
        com.payair.hce.getSessionCode getsessioncode = (com.payair.hce.getSessionCode) objArr[1];
        int i = getMagstripeCvmIssuerOptions + 39;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
            setcardholdervalidators.getCiacDecline = getsessioncode;
            setcardholdervalidators.getProfileVersion = getsessioncode.SdkCoreAlternateContactlessPaymentDataImpl();
            return setcardholdervalidators;
        }
        setcardholdervalidators.getCiacDecline = getsessioncode;
        setcardholdervalidators.getProfileVersion = getsessioncode.SdkCoreAlternateContactlessPaymentDataImpl();
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setCardholderValidators valueOf() {
        java.lang.Object obj;
        int i = getCardholderValidators + 31;
        getMagstripeCvmIssuerOptions = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1714754847, -905174083}, 4 - android.text.TextUtils.getOffsetAfter("", 0), objArr);
            this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("鸒뜚鸪㼓煀넒懨⦵뼒Ṗ䂸ଶ\udc42綆⎈橦ﶲ島\u0558䵖\u1ae2먦\ue428겆㯖餔쟸迵夃\uf830ꛈ턥", android.view.View.MeasureSpec.getMode(0), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{1714754847, -905174083}, android.text.TextUtils.getOffsetAfter("", 0) + 4, objArr3);
            this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("鸒뜚鸪㼓煀넒懨⦵뼒Ṗ䂸ଶ\udc42綆⎈橦ﶲ島\u0558䵖\u1ae2먦\ue428겆㯖餔쟸迵夃\uf830ꛈ턥", android.view.View.MeasureSpec.getMode(0), objArr4);
            obj = objArr4[0];
        }
        this.IccPrivateKeyCrtComponentsJson = ((java.lang.String) obj).intern();
        int i2 = getMagstripeCvmIssuerOptions + 125;
        getCardholderValidators = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final com.payair.hce.setCardholderValidators writeReplace(com.payair.hce.getSessionCode getsessioncode) {
        int i = getCardholderValidators;
        getMagstripeCvmIssuerOptions = (i + 113) % 128;
        this.getCvrMaskAnd = getsessioncode;
        getMagstripeCvmIssuerOptions = (i + 9) % 128;
        return this;
    }

    public final com.payair.hce.setCardholderValidators writeReplace(java.lang.String str) {
        int i = (getCardholderValidators + 55) % 128;
        getMagstripeCvmIssuerOptions = i;
        this.AlternateContactlessPaymentDataJson = str;
        getCardholderValidators = (i + 107) % 128;
        return this;
    }

    public final com.payair.hce.setCardholderValidators DigitizedCardProfile(java.lang.String str) {
        this.valueOf = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str.substring(2, 4));
        sb.append(str.substring(0, 2));
        java.lang.String obj = sb.toString();
        this.SdkCoreBusinessLogicModuleImpl = obj;
        this.getAid = obj;
        int i = getCardholderValidators + 17;
        getMagstripeCvmIssuerOptions = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setCardholderValidators valueOf(java.lang.String str) {
        int i = getCardholderValidators;
        getMagstripeCvmIssuerOptions = (i + 101) % 128;
        this.values = str;
        getMagstripeCvmIssuerOptions = (i + 119) % 128;
        return this;
    }

    public final java.lang.String writeReplace(int i) {
        getCardholderValidators = (getMagstripeCvmIssuerOptions + 61) % 128;
        if (i == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1718686061, -1509119948}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, objArr);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), getProfileVersion()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        if (i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("馻잒馃侘螕瑠", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), this.getProfileVersion}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{-66382507, -130988941}, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr3[0]).intern(), this.getGpoResponse.writeReplace()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
            sb.append(AlternateContactlessPaymentDataJson());
            sb.append(values());
            java.lang.String obj = sb.toString();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new int[]{-1718686061, -1509119948}, 2 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr4);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr4[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        if (i == 3) {
            java.lang.String str = (java.lang.String) writeReplace(new java.lang.Object[]{this}, 2073341837, -2073341837, java.lang.System.identityHashCode(this));
            if (!str.equals("")) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("㨍쀹㨴䠳ꋴ樨뉘\uf2f4", android.graphics.Color.argb(0, 0, 0, 0), objArr5);
                str = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr5[0]).intern(), str}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
                getMagstripeCvmIssuerOptions = (getCardholderValidators + 111) % 128;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("ᆍ\ue496ᆴ沜틇遼쉫愐", android.os.Process.myTid() >> 22, objArr6);
            sb2.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr6[0]).intern(), this.getCvrMaskAnd.writeReplace()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
            sb2.append(str);
            sb2.append(SdkCoreAlternateContactlessPaymentDataImpl());
            java.lang.String obj2 = sb2.toString();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new int[]{-1718686061, -1509119948}, android.view.Gravity.getAbsoluteGravity(0, 0) + 2, objArr7);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr7[0]).intern(), obj2}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        if (i == 4) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b("劅虴勗\u0e5d᪙ܐ\u0a62龛珇⽬⭱뵪ႊ䲬䡁\udc27ㅠ淘滁\ufb0b혷謌辤\u1ad0\uf74fꡨ", android.view.View.getDefaultSize(0, 0), objArr8);
            sb3.append(((java.lang.String) objArr8[0]).intern());
            sb3.append(i);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        if (i == 5) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b("劅虴勗\u0e5d᪙ܐ\u0a62龛珇⽬⭱뵪ႊ䲬䡁\udc27ㅠ淘滁\ufb0b혷謌辤\u1ad0\uf74fꡨ", android.graphics.Color.argb(0, 0, 0, 0), objArr9);
            sb4.append(((java.lang.String) objArr9[0]).intern());
            sb4.append(i);
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b("劅虴勗\u0e5d᪙ܐ\u0a62龛珇⽬⭱뵪ႊ䲬䡁\udc27ㅠ淘滁\ufb0b혷謌辤\u1ad0\uf74fꡨ", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr10);
        sb5.append(((java.lang.String) objArr10[0]).intern());
        sb5.append(i);
        throw new java.lang.IllegalArgumentException(sb5.toString());
    }

    private java.lang.String AlternateContactlessPaymentDataJson() {
        int valueOf = this.getCiacDecline.valueOf();
        int valueOf2 = this.getGpoResponse.valueOf();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = valueOf - 36;
        if (valueOf2 > i) {
            sb.append(this.getGpoResponse.values().substring(i * 2, this.getGpoResponse.values().length()));
            java.lang.Object[] objArr = new java.lang.Object[1];
            b("㔗﵉㔮男皑\ued54", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, objArr);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), sb.toString()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        getMagstripeCvmIssuerOptions = (getCardholderValidators + 13) % 128;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("렖今렯운馥遂褍\u0896", android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        int i2 = getMagstripeCvmIssuerOptions + 51;
        getCardholderValidators = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 5;
        }
        int i4 = 0;
        while (i4 < (valueOf - valueOf2) - 36) {
            int i5 = getMagstripeCvmIssuerOptions + 87;
            getCardholderValidators = i5 % 128;
            if (i5 % 2 == 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("\ue57f/\ue53d㔌Ⰷ", android.view.ViewConfiguration.getKeyRepeatTimeout() * 56, objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                i4 += 24;
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("\ue57f/\ue53d㔌Ⰷ", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                i4++;
            }
        }
        return sb.toString();
    }

    private java.lang.String values() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{547994327, 222874878}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.AlternateContactlessPaymentDataJson.substring(0, 6));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-666754428, 245548247}, 2 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.getAid);
        sb.append(this.getGpoResponse.AlternateContactlessPaymentDataJson());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{-1173316834, 730051715}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{-1173316834, 730051715}, 1 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(java.lang.Integer.toHexString(this.getGpoResponse.valueOf()));
        com.payair.hce.getSessionCode getsessioncode = this.getGpoResponse;
        sb.append((java.lang.String) com.payair.hce.getSessionCode.writeReplace(new java.lang.Object[]{getsessioncode}, 668305579, -668305579, java.lang.System.identityHashCode(getsessioncode)));
        java.lang.String obj2 = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj2);
        sb2.append(this.getGpoResponse.values());
        sb2.append(this.getGpoResponse.writeReplace());
        java.lang.String AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(sb2.toString());
        java.lang.String values = this.getGpoResponse.values();
        int valueOf = this.getCiacDecline.valueOf() - 36;
        int valueOf2 = this.getGpoResponse.valueOf();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        if (valueOf <= valueOf2) {
            sb3.append(values.substring(0, valueOf * 2));
        } else {
            getMagstripeCvmIssuerOptions = (getCardholderValidators + 45) % 128;
            sb3.append(values);
            while (sb3.length() < valueOf * 2) {
                int i = getCardholderValidators + 5;
                getMagstripeCvmIssuerOptions = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b("\ue57f/\ue53d㔌Ⰷ", android.view.ViewConfiguration.getFadingEdgeLength() % 98, objArr5);
                    obj = objArr5[0];
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b("\ue57f/\ue53d㔌Ⰷ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr6);
                    obj = objArr6[0];
                }
                sb3.append(((java.lang.String) obj).intern());
            }
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("郼䋾郊쫳묄ꗽ", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr7);
        sb4.append(((java.lang.String) objArr7[0]).intern());
        sb4.append(obj2);
        sb4.append((java.lang.Object) sb3);
        sb4.append(AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{-1391564780, 510897384}, 2 - (android.os.Process.myTid() >> 22), objArr8);
        sb4.append(((java.lang.String) objArr8[0]).intern());
        java.lang.String obj3 = sb4.toString();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(new int[]{651494291, -1092694723}, android.graphics.Color.red(0) + 2, objArr9);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr9[0]).intern(), this.getCiacDecline.valueOf(obj3)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.AlternateContactlessPaymentDataJson);
        while (sb.length() < 20) {
            getMagstripeCvmIssuerOptions = (getCardholderValidators + 103) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b("薐ᶙ藖∎ꃗ", android.text.TextUtils.indexOf("", ""), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
        }
        java.lang.String values = this.getCvrMaskAnd.values();
        int valueOf = this.getGpoResponse.valueOf() - 42;
        int valueOf2 = this.getCvrMaskAnd.valueOf();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (valueOf <= valueOf2) {
            sb2.append(values.substring(0, valueOf * 2));
        } else {
            int i2 = getMagstripeCvmIssuerOptions + 37;
            getCardholderValidators = i2 % 128;
            if (i2 % 2 == 0) {
                sb2.append(values);
                i = 2 - valueOf;
            } else {
                sb2.append(values);
                i = valueOf * 2;
            }
            while (sb2.length() < i) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b("\ue57f/\ue53d㔌Ⰷ", android.view.KeyEvent.normalizeMetaState(0), objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
            }
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("뉘酙뉨ᤡ㼜\uf892", android.view.View.combineMeasuredStates(0, 0), objArr3);
        sb3.append(((java.lang.String) objArr3[0]).intern());
        sb3.append((java.lang.Object) sb);
        sb3.append(this.SdkCoreBusinessLogicModuleImpl);
        sb3.append(this.getCvrMaskAnd.AlternateContactlessPaymentDataJson());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{-1173316834, 730051715}, android.graphics.Color.green(0) + 2, objArr4);
        sb3.append(((java.lang.String) objArr4[0]).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{-1173316834, 730051715}, 2 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
        sb3.append(((java.lang.String) objArr5[0]).intern());
        sb3.append(java.lang.Integer.toHexString(this.getCvrMaskAnd.valueOf()));
        com.payair.hce.getSessionCode getsessioncode = this.getCvrMaskAnd;
        sb3.append((java.lang.String) com.payair.hce.getSessionCode.writeReplace(new java.lang.Object[]{getsessioncode}, 668305579, -668305579, java.lang.System.identityHashCode(getsessioncode)));
        sb3.append((java.lang.Object) sb2);
        java.lang.String obj = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        sb4.append((java.lang.String) writeReplace(new java.lang.Object[]{this}, 2073341837, -2073341837, java.lang.System.identityHashCode(this)));
        sb4.append(this.getCvrMaskAnd.writeReplace());
        sb4.append(getProfileVersion());
        sb4.append(this.SdkCoreAlternateContactlessPaymentDataImpl);
        java.lang.String obj2 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("郼䋾郊쫳묄ꗽ", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
        sb5.append(((java.lang.String) objArr6[0]).intern());
        sb5.append(obj);
        sb5.append(AlternateContactlessPaymentDataJson(obj2));
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{-1391564780, 510897384}, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2, objArr7);
        sb5.append(((java.lang.String) objArr7[0]).intern());
        java.lang.String obj3 = sb5.toString();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b("︧ᴔ\ufe1e锞ꓡ䀭둍\ud8ff", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr8[0]).intern(), this.getGpoResponse.valueOf(obj3)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setCardholderValidators setcardholdervalidators = (com.payair.hce.setCardholderValidators) objArr[0];
        getMagstripeCvmIssuerOptions = (getCardholderValidators + 3) % 128;
        int valueOf = setcardholdervalidators.getGpoResponse.valueOf() - 42;
        if (setcardholdervalidators.getCvrMaskAnd.valueOf() > valueOf) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(setcardholdervalidators.getCvrMaskAnd.values().substring(valueOf * 2, setcardholdervalidators.getCvrMaskAnd.values().length()));
            return sb.toString();
        }
        int i = getMagstripeCvmIssuerOptions + 99;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
            return "";
        }
        throw null;
    }

    private java.lang.String getProfileVersion() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("浶誐浃ʝ뗟\u0ad1", android.view.View.MeasureSpec.getSize(0), objArr);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), com.payair.hce.setCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{221607477, 472308611}, android.graphics.Color.green(0) + 4, objArr2);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), this.valueOf}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{-987505384, 1024987225, 1298895350, 456828546, -893449827, 1513028999}, 11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{244925911, 913591892}, 4 - android.graphics.Color.red(0), objArr4);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr4[0]).intern(), this.writeReplace}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{1733263315, -875955840}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr5);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr5[0]).intern(), this.values}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("誰䩶誈쉹㝾䘫⟔\udefbꮹ\ue34cچﰍ죠胬斿鴩\ue910ꆙ䍦멩้䝏ꈖ宺⽵搌臄碾䶠Ԩ\ue0ff♮拐㫙쾯읜茀\udb8bⵟ\ue409ꀳ\uf8bdఆ薋셩鸜欵ꋚ\ue790뼛䫯䎙Ӄ峎ꦖ愼◹綌\uf747๊娠ከ홿\u2fe9筗〯㔦첮馉텼ᓕ\uedfc뺰\uf639玏譹\udfe4鞟劷ꡛ", android.graphics.ImageFormat.getBitsPerPixel(0) + 1, objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{-1611051220, -1299975194, -1809355528, 714690839, 805742487, 1729767447, -1655124496, -799036826, -534992719, 834895361, -1106041961, -1937733820, 559238846, -1477572578}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        sb.append(this.IccPrivateKeyCrtComponentsJson);
        sb.append(this.DigitizedCardProfile);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{398135296, 378327803, -1136344936, -1308418141, 547994327, 222874878}, 10 - android.text.TextUtils.indexOf("", ""), objArr8);
        sb.append(((java.lang.String) objArr8[0]).intern());
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b("⭡롮⭘つ䵗췫巿啋\u0a61ᄧ粯矏椷狲ᾟ\u169f䣁厂㥏ㆯ", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr9);
        sb.append(((java.lang.String) objArr9[0]).intern());
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b("∤ᙟ∝鹕ݩ싿េ婞̤뼖㚑磛恴\udcc3喡ᦋ䆄ﶳ獱㺻", android.graphics.Color.red(0), objArr10);
        sb.append(((java.lang.String) objArr10[0]).intern());
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(new int[]{-478575124, 736035552, 2011394026, 609990018, -1746152020, 1328317014, -1595592131, 2081430110}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr11);
        sb.append(((java.lang.String) objArr11[0]).intern());
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("蘤䛖蘝컜ƈ鯮ᄤ̸", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr12);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr12[0]).intern(), this.RecordsJson}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("떇\uebb9떾掳\ueb70ꆫﯜ㤎钇䋴\uda80ᮍ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
        sb.append(((java.lang.String) objArr13[0]).intern());
        sb.append((java.lang.String) writeReplace(new java.lang.Object[]{this}, 761482528, -761482527, java.lang.System.identityHashCode(this)));
        java.lang.String obj = sb.toString();
        int i = getMagstripeCvmIssuerOptions + 97;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    static void writeReplace() {
        getCvmResetTimeout = (char) 42430;
        getAdditionalCheckTable = (char) 52894;
        getMchipCvmIssuerOptions = (char) 3370;
        SdkCoreCardRiskManagementDataImpl = (char) 9175;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMagstripeCvmIssuerOptions = 0;
        getCardholderValidators = 1;
        writeReplace();
        getSecurityWord = new int[]{1220038465, 1365368262, -570200204, -15458319, 861139117, -1403282232, -146242891, -171954920, -83843652, -815604655, 1198729357, 409830968, -914132293, 406332788, -1018097077, 2060469592, 1941921966, -1211056869};
        getDualTapResetTimeout = -5843460227896968049L;
    }

    private java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 2073341837, -2073341837, java.lang.System.identityHashCode(this));
    }

    private java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 761482528, -761482527, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{82, -10, -24, -99};
        $$b = 129;
    }

    public final com.payair.hce.setCardholderValidators DigitizedCardProfile(com.payair.hce.getSessionCode getsessioncode) {
        return (com.payair.hce.setCardholderValidators) writeReplace(new java.lang.Object[]{this, getsessioncode}, -1559880128, 1559880130, java.lang.System.identityHashCode(this));
    }
}
