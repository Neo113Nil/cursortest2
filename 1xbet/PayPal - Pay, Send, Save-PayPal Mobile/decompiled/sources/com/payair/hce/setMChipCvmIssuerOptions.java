package com.payair.hce;

/* loaded from: classes10.dex */
final class setMChipCvmIssuerOptions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreDigitizedCardProfileImpl;
    private static int buildRecords;
    private static long getAlternateContactlessPaymentData;
    private static char[] getCdol1RelatedDataLength;
    private static int getCiacDeclineOnPpms;
    private static long getDigitizedCardId;
    private static boolean getIccPrivateKeyCrtComponents;
    private static boolean getIssuerApplicationData;
    private static int getMaximumPinTry;
    private static char getPinIvCvc3Track2;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private com.payair.hce.setAdditionalCheckTable DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private boolean RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private java.lang.String SdkCoreBusinessLogicModuleImpl;
    private java.lang.String SdkCoreCardRiskManagementDataImpl;
    private boolean SdkCoreContactlessPaymentDataImpl;
    private java.lang.String getAdditionalCheckTable;
    private boolean getAid;
    private java.lang.String getApplicationLifeCycleData;
    private java.lang.String getCardLayoutDescription;
    private java.lang.String getCardholderValidators;
    private java.lang.String getCiacDecline;
    private java.lang.String getCrmCountryCode;
    private java.lang.String getCvmResetTimeout;
    private com.payair.hce.getSessionCode getCvrMaskAnd;
    private java.lang.String getDualTapResetTimeout;
    private java.lang.String getGpoResponse;
    private java.lang.String getMagstripeCvmIssuerOptions;
    private java.lang.String getMchipCvmIssuerOptions;
    private boolean getPaymentFci;
    private java.lang.String getPpseFci;
    private boolean getProfileVersion;
    private java.lang.String getSecurityWord;
    private com.payair.hce.setCardholderValidators valueOf;
    private com.payair.hce.setIssuerApplicationData values;
    private com.payair.hce.setCrmCountryCode writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = (i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50);
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = null;
        if (i7 == 1) {
            com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = (com.payair.hce.setMChipCvmIssuerOptions) objArr[0];
            com.payair.hce.setIssuerApplicationData setissuerapplicationdata = setmchipcvmissueroptions.values;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, null, "\u0082\u008c\u0088\u0083", objArr2);
            setissuerapplicationdata.DigitizedCardProfile(((java.lang.String) objArr2[0]).intern());
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
            com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 2}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
            com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 4}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
            com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, setmchipcvmissueroptions.values.valueOf(2)}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
            getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 57) % 128;
            return provisionRequestEncrypted;
        }
        if (i7 == 2) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 != 3) {
            return i7 != 4 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions2 = (com.payair.hce.setMChipCvmIssuerOptions) objArr[0];
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 13) % 128;
        if (setmchipcvmissueroptions2.getProfileVersion) {
            com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted2 = new com.payair.hce.NotifyProvisionResponseEncrypted();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), null, null, "\u0082\u008c\u0087\u0083", objArr3);
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, ((java.lang.String) objArr3[0]).intern()}, -673827104, 673827105, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.IccPrivateKeyCrtComponentsJson}, 482572675, -482572670, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.getCardholderValidators}, 777446572, -777446566, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.SdkCoreCardRiskManagementDataImpl}, 615811210, -615811206, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.getAdditionalCheckTable}, 2101966976, -2101966973, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.AlternateContactlessPaymentDataJson}, -908160720, 908160730, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.SdkCoreAlternateContactlessPaymentDataImpl}, -182336031, 182336033, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted2, setmchipcvmissueroptions2.getCardLayoutDescription()}, 1279660799, -1279660791, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted2));
            notifyProvisionResponseEncrypted = notifyProvisionResponseEncrypted2;
        }
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 115) % 128;
        return notifyProvisionResponseEncrypted;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 119 - b;
        int i5 = 1 - (s * 4);
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += i6;
            i6 = i7;
            i2 = i8;
            int i9 = i6 + 1;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i6 = bArr[i9];
            i8 = i3;
            i4 += i6;
            i6 = i7;
            i2 = i8;
            int i92 = i6 + 1;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i6 + 1;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getDigitizedCardId ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getDigitizedCardId)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1921 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, (byte) 2, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 428 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (31610 - android.view.KeyEvent.normalizeMetaState(0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (byte) 0, -1, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    private static void b(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            int i2 = $10 + 1;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
            $11 = ($10 + 1) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr4.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 101) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 71, android.text.TextUtils.indexOf("", "", 0) + 1179, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, (byte) 17, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 30, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3443, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3832))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1864 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41774));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((short) 0, (byte) 14, -1, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 29, 3134 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((short) 0, (byte) 13, -1, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (getAlternateContactlessPaymentData ^ 1263759066225628708L)) ^ ((int) (getCiacDeclineOnPpms ^ 1263759066225628708L))) ^ ((char) (getPinIvCvc3Track2 ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = getCdol1RelatedDataLength;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.View.getDefaultSize(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(j) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(buildRecords)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 47, android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getIccPrivateKeyCrtComponents) {
            $11 = ($10 + 63) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 5, 1630 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (byte) 1, -1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                int i3 = $10 + 103;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 / 5;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!getIssuerApplicationData) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 17) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $11 = ($10 + 109) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 43, 1628 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((short) 0, (byte) 1, -1, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i5 = $11 + 85;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str4;
    }

    public setMChipCvmIssuerOptions() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), null, null, "\u0083\u0084\u0081\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        this.AlternateContactlessPaymentDataJson = "";
        this.IccPrivateKeyCrtComponentsJson = intern;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, null, null, "\u0083\u0082", objArr2);
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr2[0]).intern();
        this.RecordsJson = false;
        this.getAid = false;
        this.getProfileVersion = false;
        this.getPaymentFci = false;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("갻䅓缥Ė", "쒂哣嬄\uf554", (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", (char) (android.graphics.Color.rgb(0, 0, 0) + 16798811), objArr3);
        this.getCiacDecline = ((java.lang.String) objArr3[0]).intern();
        this.SdkCoreBusinessLogicModuleImpl = null;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), null, null, "\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082", objArr4);
        this.getGpoResponse = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("⒍謹聪橳\ued0c﨣", "솽壘䐿닆", android.view.View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", (char) (50756 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr5);
        this.getCardLayoutDescription = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), null, null, "\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085", objArr6);
        this.getApplicationLifeCycleData = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("ᇜ箯汀唢\u05c8晉\uf1d3\u0b34၇\ue963\ud8e5珉\ua7dc䠌ሓ怔삎踫및坴ᣛᬸ癥螮埮♢ﶣ\u0ee1ᓏ篼茧⡑\ud9b5襙쐞孴", "駛䷋陉櫀", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.KeyEvent.getDeadChar(0, 0), objArr7);
        this.getDualTapResetTimeout = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0082\u0082\u0083\u0086", objArr8);
        this.getSecurityWord = ((java.lang.String) objArr8[0]).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b("⒍謹聪橳\ued0c﨣", "솽壘䐿닆", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, "\u0000\u0000\u0000\u0000", (char) (50756 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr9);
        this.getCvmResetTimeout = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.getSize(0) + 127, null, null, "\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0085\u0087\u0085", objArr10);
        this.getMchipCvmIssuerOptions = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0085\u0085\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0086\u0083\u0083\u0082", objArr11);
        this.getAdditionalCheckTable = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("⒍謹聪橳\ued0c﨣", "솽壘䐿닆", android.view.KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 50757), objArr12);
        this.getCardholderValidators = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("ḵꖚ㘆\udc34\uf3bd염\udad7ᵌ焩→⮇㕱", "\u2002挻㜝䢇", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr13);
        this.SdkCoreCardRiskManagementDataImpl = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, null, "\u0088\u0081\u008f\u0087\u0090\u008c\u0088\u008f\u008e\u0082\u0088\u008e\u0088\u008b\u008e\u008d\u0087\u008c\u0083\u0084\u008b\u0085\u0084\u0083\u0084\u0086\u0082\u0081\u008a\u0083\u0089\u0088", objArr14);
        this.getMagstripeCvmIssuerOptions = ((java.lang.String) objArr14[0]).intern();
        this.getCrmCountryCode = com.payair.hce.setCardLayoutDescription.writeReplace;
        this.SdkCoreContactlessPaymentDataImpl = false;
        this.getPpseFci = "";
        com.payair.hce.getExpiryTimestamp.DigitizedCardProfile();
        com.payair.hce.setAdditionalCheckTable setadditionalchecktable = new com.payair.hce.setAdditionalCheckTable();
        this.DigitizedCardProfile = setadditionalchecktable;
        setadditionalchecktable.writeReplace("").valueOf(intern);
        com.payair.hce.setCardholderValidators setcardholdervalidators = new com.payair.hce.setCardholderValidators();
        this.valueOf = setcardholdervalidators;
        setcardholdervalidators.writeReplace("").DigitizedCardProfile(intern);
        com.payair.hce.setIssuerApplicationData setissuerapplicationdata = new com.payair.hce.setIssuerApplicationData();
        this.values = setissuerapplicationdata;
        ((com.payair.hce.setIssuerApplicationData) com.payair.hce.setIssuerApplicationData.valueOf(new java.lang.Object[]{setissuerapplicationdata, ""}, 1158783977, -1158783977, java.lang.System.identityHashCode(setissuerapplicationdata))).AlternateContactlessPaymentDataJson(intern);
        com.payair.hce.setCrmCountryCode setcrmcountrycode = new com.payair.hce.setCrmCountryCode();
        this.writeReplace = setcrmcountrycode;
        setcrmcountrycode.DigitizedCardProfile("").AlternateContactlessPaymentDataJson(intern);
    }

    public final com.payair.hce.setMChipCvmIssuerOptions valueOf(java.lang.String str) {
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 111) % 128;
        this.AlternateContactlessPaymentDataJson = str;
        this.DigitizedCardProfile.writeReplace(str);
        this.valueOf.writeReplace(str);
        com.payair.hce.setIssuerApplicationData setissuerapplicationdata = this.values;
        this.writeReplace.DigitizedCardProfile(str);
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 93) % 128;
        return this;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = (com.payair.hce.setMChipCvmIssuerOptions) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreDigitizedCardProfileImpl + 49;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            setmchipcvmissueroptions.IccPrivateKeyCrtComponentsJson = str;
            setmchipcvmissueroptions.DigitizedCardProfile.valueOf(str);
            setmchipcvmissueroptions.valueOf.DigitizedCardProfile(str);
            setmchipcvmissueroptions.values.AlternateContactlessPaymentDataJson(str);
            setmchipcvmissueroptions.writeReplace.AlternateContactlessPaymentDataJson(str);
            return setmchipcvmissueroptions;
        }
        setmchipcvmissueroptions.IccPrivateKeyCrtComponentsJson = str;
        setmchipcvmissueroptions.DigitizedCardProfile.valueOf(str);
        setmchipcvmissueroptions.valueOf.DigitizedCardProfile(str);
        setmchipcvmissueroptions.values.AlternateContactlessPaymentDataJson(str);
        setmchipcvmissueroptions.writeReplace.AlternateContactlessPaymentDataJson(str);
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setMChipCvmIssuerOptions AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getMaximumPinTry + 11;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = str;
            this.valueOf.valueOf(str);
            this.values.writeReplace(str);
            SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 37) % 128;
            return this;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = str;
        this.valueOf.valueOf(str);
        this.values.writeReplace(str);
        throw null;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions valueOf() {
        int i = (getMaximumPinTry + 71) % 128;
        SdkCoreDigitizedCardProfileImpl = i;
        this.RecordsJson = true;
        int i2 = i + 121;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setMChipCvmIssuerOptions writeReplace() {
        int i = getMaximumPinTry + 25;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 != 0) {
            this.getAid = true;
            return this;
        }
        this.getAid = true;
        return this;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions AlternateContactlessPaymentDataJson() {
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 103) % 128;
        this.SdkCoreContactlessPaymentDataImpl = true;
        this.valueOf.valueOf();
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 15) % 128;
        return this;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = (com.payair.hce.setMChipCvmIssuerOptions) objArr[0];
        int i = SdkCoreDigitizedCardProfileImpl;
        getMaximumPinTry = (i + 71) % 128;
        setmchipcvmissueroptions.getProfileVersion = true;
        int i2 = i + 23;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            return setmchipcvmissueroptions;
        }
        throw null;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions DigitizedCardProfile() {
        int i = (getMaximumPinTry + 109) % 128;
        SdkCoreDigitizedCardProfileImpl = i;
        this.getPaymentFci = true;
        getMaximumPinTry = (i + 39) % 128;
        return this;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions AlternateContactlessPaymentDataJson(com.payair.hce.getSessionCode getsessioncode) {
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 113) % 128;
        this.valueOf.AlternateContactlessPaymentDataJson(getsessioncode);
        this.values.values(getsessioncode);
        int i = SdkCoreDigitizedCardProfileImpl + 31;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setMChipCvmIssuerOptions DigitizedCardProfile(com.payair.hce.getSessionCode getsessioncode) {
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 67) % 128;
        com.payair.hce.setCardholderValidators setcardholdervalidators = this.valueOf;
        this.values.DigitizedCardProfile(getsessioncode);
        int i = SdkCoreDigitizedCardProfileImpl + 7;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions DigitizedCardProfile(int i) {
        java.lang.Object invoke;
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 37) % 128;
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                b("\uf4e7㾴慸", "䈅១␝\u181b", 488104258 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", (char) (android.view.View.combineMeasuredStates(0, 0) + 6948), objArr);
                try {
                    java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c("ၺ窺တ閽㤨傀셽䙘뤸ꤎ毺ᄶ䋗\u07fb㉚\ue8b5\uec47尋씌䈘떳ꫡ澺ᶀ弔Ί㘊\uf76b\ue897堫\ud8e2仅뇡뚇", -android.os.Process.getGidForName(""), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c("鲠♵鳇∸\ue4e8ో盺鮰㖢\uf5c1\udc6e쳴츖嬥藓", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr4);
                    java.lang.Object invoke2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                    int i2 = getMaximumPinTry;
                    int i3 = i2 + 113;
                    SdkCoreDigitizedCardProfileImpl = i3 % 128;
                    int i4 = i3 % 2 != 0 ? 30902 : com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
                    SdkCoreDigitizedCardProfileImpl = (i2 + 9) % 128;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i4)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c("ၺ窺တ閽㤨傀셽䙘뤸ꤎ毺ᄶ䋗\u07fb㉚\ue8b5\uec47尋씌䈘떳ꫡ澺ᶀ弔Ί㘊\uf76b\ue897堫\ud8e2仅뇡뚇", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c("혊⍝홣鑮픈२삱ꩭ缏\uf0fb樠ﴜ蒨帋", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr7);
                    cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE).invoke(invoke2, objArr5);
                    int i5 = SdkCoreDigitizedCardProfileImpl + 105;
                    getMaximumPinTry = i5 % 128;
                    if (i5 % 2 == 0) {
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        c("ၺ窺တ閽㤨傀셽䙘뤸ꤎ毺ᄶ䋗\u07fb㉚\ue8b5\uec47尋씌䈘떳ꫡ澺ᶀ弔Ί㘊\uf76b\ue897堫\ud8e2仅뇡뚇", android.view.View.combineMeasuredStates(1, 0), objArr8);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() / 105;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        c("⌆敔⍡敛㻿佪ㆃ䆥訏뛪鬩ᛣ熷᠕", 0, objArr9);
                        invoke = cls3.getMethod((java.lang.String) objArr9[0], null).invoke(invoke2, null);
                    } else {
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        c("ၺ窺တ閽㤨傀셽䙘뤸ꤎ毺ᄶ䋗\u07fb㉚\ue8b5\uec47尋씌䈘떳ꫡ澺ᶀ弔Ί㘊\uf76b\ue897堫\ud8e2仅뇡뚇", android.view.View.combineMeasuredStates(0, 0) + 1, objArr10);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c("⌆敔⍡敛㻿佪ㆃ䆥訏뛪鬩ᛣ熷᠕", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr11);
                        invoke = cls4.getMethod((java.lang.String) objArr11[0], null).invoke(invoke2, null);
                    }
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    c("탭뷖킇吣視韬ã\uf6e6禯湢ꩤꆈ艀삗\uf3c4堋Ⳑ魧Ғ\uf2a6甤涍긤괾龃", 1 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr12);
                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c("漥쫚潂ⴭ\uea0e\ue0e4积镏옻ᥴ퍹숒㶉람", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr13);
                    valueOf(new com.payair.hce.getSessionCode((java.security.interfaces.RSAPrivateCrtKey) cls5.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)));
                    return this;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                b("\uf0ac鶵粡\uda70櫃쐿萎컯而靪≴뛗㕟귀盙\ueb15絙\uf397㙬늑퇫\udb7e맺넣쀷ῥ茗響锧쇜雇", "翿\ue627\uf30b騧", 199632767 - android.view.View.MeasureSpec.getSize(0), "\u0000\u0000\u0000\u0000", (char) (10228 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr14);
                sb.append(((java.lang.String) objArr14[0]).intern());
                sb.append(e.getMessage());
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(sb.toString()));
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public final com.payair.hce.setMChipCvmIssuerOptions valueOf(com.payair.hce.getSessionCode getsessioncode) {
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 113) % 128;
        this.getCvrMaskAnd = getsessioncode;
        this.valueOf.writeReplace(getsessioncode);
        this.values.AlternateContactlessPaymentDataJson(getsessioncode);
        int i = getMaximumPinTry + 111;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.GetTaskStatusRequestEncrypted SdkCoreAlternateContactlessPaymentDataImpl() {
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = new com.payair.hce.GetTaskStatusRequestEncrypted();
        com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted, getAid()}, 1215698523, -1215698521, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted, IccPrivateKeyCrtComponentsJson()}, -1871813025, 1871813025, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted, (com.payair.hce.NotifyProvisionResponseEncrypted) DigitizedCardProfile(new java.lang.Object[]{this}, -1154589096, 1154589099, java.lang.System.identityHashCode(this))}, -422828516, 422828520, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        int i = getMaximumPinTry + 117;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return getTaskStatusRequestEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.getTransactionCredentialsStatus getAid() {
        com.payair.hce.getTransactionCredentialsStatus gettransactioncredentialsstatus = new com.payair.hce.getTransactionCredentialsStatus();
        gettransactioncredentialsstatus.DigitizedCardProfile(this.getGpoResponse);
        com.payair.hce.getTransactionCredentialsStatus.valueOf(new java.lang.Object[]{gettransactioncredentialsstatus, this.getCiacDecline}, -728987859, 728987859, java.lang.System.identityHashCode(gettransactioncredentialsstatus));
        int i = SdkCoreDigitizedCardProfileImpl + 49;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return gettransactioncredentialsstatus;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.payair.hce.setTransactionCredentialsStatus IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = new com.payair.hce.setTransactionCredentialsStatus();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("젔ેঁꠠ此\ue9be覲ͷײᓩ끺瞻靺坧", "햓\ue35d\u2dbfꎴ", android.os.Process.myTid() >> 22, "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 46125), objArr);
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, ((java.lang.String) objArr[0]).intern()}, -1484393426, 1484393446, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, SdkCoreBusinessLogicModuleImpl()}, 1087417281, -1087417265, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getGpoResponse()}, -872883368, 872883383, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getCiacDecline()}, -2044077409, 2044077415, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.getDualTapResetTimeout}, -1009290899, 1009290921, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = new com.payair.hce.GetTaskStatusResponseEncrypted();
        if (this.getAid) {
            com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.getApplicationLifeCycleData}, 257999473, -257999469, java.lang.System.identityHashCode(settransactioncredentialsstatus));
            com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.getCardLayoutDescription}, -1077412548, 1077412556, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        } else {
            com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, ""}, 257999473, -257999469, java.lang.System.identityHashCode(settransactioncredentialsstatus));
            com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, ""}, -1077412548, 1077412556, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        }
        if (!this.getAid) {
            int i = getMaximumPinTry + 103;
            SdkCoreDigitizedCardProfileImpl = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!this.getPaymentFci) {
                com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, 0}, 32854005, -32854005, 0);
                com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, ""}, 517941145, -517941137, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
                com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, ""}, -1235788348, 1235788353, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
                com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, ""}, 686313489, -686313482, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
                com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, ""}, 617468933, -617468929, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
                com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, ""}, -1860520839, 1860520842, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
                com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getTaskStatusResponseEncrypted}, 1559507769, -1559507755, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getPaymentFci()}, 146349442, -146349441, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                if (this.RecordsJson) {
                    com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, ""}, 1081675126, -1081675103, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                    com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, ""}, 1780446036, -1780446019, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                } else {
                    int i2 = getMaximumPinTry + 21;
                    SdkCoreDigitizedCardProfileImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.SdkCoreBusinessLogicModuleImpl}, 1081675126, -1081675103, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.getSecurityWord}, 1780446036, -1780446019, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                        throw null;
                    }
                    com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.SdkCoreBusinessLogicModuleImpl}, 1081675126, -1081675103, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                    com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, this.getSecurityWord}, 1780446036, -1780446019, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                    SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 93) % 128;
                }
                if (this.getPaymentFci) {
                    com.payair.hce.getValidForSeconds getvalidforseconds = new com.payair.hce.getValidForSeconds();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, null, null, "\u0084\u0082\u0081\u0081\u0086\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0087", objArr2);
                    com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds, ((java.lang.String) objArr2[0]).intern()}, -1318830400, 1318830403, java.lang.System.identityHashCode(getvalidforseconds));
                    com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds, this.getCvmResetTimeout}, -1457570646, 1457570654, java.lang.System.identityHashCode(getvalidforseconds));
                    com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds, this.getMchipCvmIssuerOptions}, -673145889, 673145898, java.lang.System.identityHashCode(getvalidforseconds));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("齯ᇯ\uf431橎렩ɦ\ud885䟿㼻똷넋肔挭氄ⱪ읁≯ᥣ⹂ఁ\uea27尝껽㦖헁噍\u0c72ꓭ\uea23矃죀ݟ", "\ud98f\ueb6e⯛貘", android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000", (char) (38955 - android.graphics.Color.alpha(0)), objArr3);
                    com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds, ((java.lang.String) objArr3[0]).intern()}, 1434234943, -1434234936, java.lang.System.identityHashCode(getvalidforseconds));
                    com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds, (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1253001983, 1253001987, java.lang.System.identityHashCode(this))}, -939102575, 939102579, java.lang.System.identityHashCode(getvalidforseconds));
                    com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getvalidforseconds}, -342179465, 342179476, java.lang.System.identityHashCode(settransactioncredentialsstatus));
                }
                return settransactioncredentialsstatus;
            }
        }
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, 57}, 32854005, -32854005, 57);
        com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, this.getCvrMaskAnd.getProfileVersion()}, 517941145, -517941137, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, this.getCvrMaskAnd.RecordsJson()}, -1235788348, 1235788353, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, this.getCvrMaskAnd.getAid()}, 686313489, -686313482, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, this.getCvrMaskAnd.IccPrivateKeyCrtComponentsJson()}, 617468933, -617468929, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.getSessionCode getsessioncode = this.getCvrMaskAnd;
        com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted, (java.lang.String) com.payair.hce.getSessionCode.writeReplace(new java.lang.Object[]{getsessioncode}, -1578676701, 1578676703, java.lang.System.identityHashCode(getsessioncode))}, -1860520839, 1860520842, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getTaskStatusResponseEncrypted}, 1559507769, -1559507755, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus, getPaymentFci()}, 146349442, -146349441, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        if (this.RecordsJson) {
        }
        if (this.getPaymentFci) {
        }
        return settransactioncredentialsstatus;
    }

    private java.lang.String SdkCoreBusinessLogicModuleImpl() {
        if (!this.getPaymentFci) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, "\u0083\u0082\u0083\u0082\u008b\u008c\u0082\u0083\u0082\u0083\u0086\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0087\u008b\u0082\u0085\u0086\u008d\u0082\u0083\u0090\u0089\u0082\u008d\u0082\u0085\u008e\u0083\u0083\u008a\u0087\u0083\u0084\u0082\u0084\u0090\u0086\u0086\u0086\u0086\u0086\u0089\u0081\u0084\u008a\u0088\u008a\u0084\u008a\u0089\u0081\u0088\u008a\u0083\u0086\u0082\u008a\u0081\u0084\u0089\u0082\u0086\u008c\u0084\u0081\u0085\u0090", objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 125) % 128;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), null, null, "\u0081\u0082\u0083\u0082\u0087\u0081\u0085\u0088\u0081\u0082\u0083\u0082\u008b\u008c\u0084\u0082\u0081\u0081\u0086\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0087\u008b\u0082\u0085\u0086\u0082\u0083\u0083\u0090\u0081\u0082\u0083\u0082\u0087\u0081\u0085\u0088\u0083\u0082\u0083\u0082\u008b\u008c\u0082\u0083\u0082\u0083\u0086\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0087\u008b\u0082\u0085\u0086\u0082\u0083\u0083\u0090\u0086\u0081\u008d\u0082\u0085\u008e\u008b\u0081\u008a\u0087\u0083\u0084\u0082\u0084\u0090\u0086\u0086\u0086\u0086\u0086\u0089\u0081\u0084\u008a\u0088\u008a\u0084\u008a\u0089\u0081\u0088\u008a\u0083\u0086\u0082\u008a\u0081\u0084\u0089\u0082\u0086\u008c\u0088\u0084\u0085\u0090", objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 11) % 128;
        return intern;
    }

    private java.lang.String getGpoResponse() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("ꑊ맖㼶믎", "ⷤ丫ᚠர", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, "\u0000\u0000\u0000\u0000", (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45077), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getCiacDecline);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("좟阾兀\uf2ae㨫쏶ᙁ▛䇊谢", "曬\u0ea4\ua83b㥠", android.view.MotionEvent.axisFromString("") + 1, "\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.getMode(0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String str2 = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern, sb.toString()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        if (!this.getPpseFci.equals("")) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("藺ᙡ䢑ㅕ", "撞䵿⾁蟵", android.view.ViewConfiguration.getScrollBarSize() >> 8, "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 62767), objArr3);
            str = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr3[0]).intern(), new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(this.getPpseFci.getBytes()))}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        } else {
            int i = getMaximumPinTry;
            int i2 = i + 49;
            SdkCoreDigitizedCardProfileImpl = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            SdkCoreDigitizedCardProfileImpl = (i + 103) % 128;
            str = "";
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("藺ᙡ䢑ㅕ", "撞䵿⾁蟵", android.os.Process.myTid() >> 22, "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSize(0, 0) + 62767), objArr4);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(com.payair.hce.setCardLayoutDescription.DigitizedCardProfile);
        sb2.append(com.payair.hce.setCardLayoutDescription.AlternateContactlessPaymentDataJson);
        sb2.append(this.getCrmCountryCode);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("⠣ꉿ㵝쮳", "첥닜擒ጚ", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, "\u0000\u0000\u0000\u0000", (char) (6755 - android.view.MotionEvent.axisFromString("")), objArr5);
        java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str2);
        sb3.append(str);
        sb2.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern2, sb3.toString()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj = sb2.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("ᤍ錃", "뿀蜌퀋뿇", (android.os.Process.getThreadPriority(0) + 20) >> 6, "\u0000\u0000\u0000\u0000", (char) (android.view.View.combineMeasuredStates(0, 0) + 51152), objArr6);
        java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
        float maxVolume = android.media.AudioTrack.getMaxVolume();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("젔ેঁꠠ此\ue9be覲ͷײᓩ끺瞻靺坧", "햓\ue35d\u2dbfꎴ", (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", (char) (46125 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr7);
        sb4.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern3, ((java.lang.String) objArr7[0]).intern()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b("⾽䡥", "츰㮼¤䵕", android.graphics.Color.blue(0), "\u0000\u0000\u0000\u0000", (char) (21760 - android.view.View.resolveSize(0, 0)), objArr8);
        sb4.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr8[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj2 = sb4.toString();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((android.os.Process.myPid() >> 22) + 127, null, null, "\u0085\u0090", objArr9);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr9[0]).intern(), obj2}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    private java.lang.String getCiacDecline() {
        if (this.getAid) {
            if (!this.SdkCoreContactlessPaymentDataImpl) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, null, "\u0083\u0082\u0084\u0082\u0083\u0082\u0082\u0083\u0082\u0082\u0083\u0082\u0083\u0082\u008c\u0082\u008c\u0082\u0086\u0088\u0082\u008c\u008e\u0083\u0081\u0082\u0081\u008c\u0089\u0082\u008b\u008b", objArr);
                return ((java.lang.String) objArr[0]).intern();
            }
            int i = getMaximumPinTry + 119;
            SdkCoreDigitizedCardProfileImpl = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(39 % android.view.View.resolveSizeAndState(1, 0, 1), null, null, "\u0083\u0082\u0084\u0082\u0083\u0082\u0082\u0083\u0082\u0082\u0083\u0082\u0083\u0082\u008c\u0082\u008c\u0082\u0086\u0088\u0082\u008c\u0088\u0083\u0081\u0082\u0081\u008c\u0089\u0082\u008b\u008b", objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(android.view.View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0083\u0082\u0084\u0082\u0083\u0082\u0082\u0083\u0082\u0082\u0083\u0082\u0083\u0082\u008c\u0082\u008c\u0082\u0086\u0088\u0082\u008c\u0088\u0083\u0081\u0082\u0081\u008c\u0089\u0082\u008b\u008b", objArr3);
            return ((java.lang.String) objArr3[0]).intern();
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(android.graphics.Color.red(0) + 127, null, null, "\u0082\u0082\u0083\u0082\u0083\u0082\u008c\u0082\u0086\u0082\u0086\u0088\u0082\u0082\u0081\u0082\u0081\u0082\u0081\u008c\u0087\u0082\u008b\u008b", objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        int i2 = SdkCoreDigitizedCardProfileImpl + 73;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    private com.payair.hce.ProvisionRequestEncrypted[] getPaymentFci() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(6);
        this.DigitizedCardProfile.writeReplace(this.AlternateContactlessPaymentDataJson).valueOf(this.IccPrivateKeyCrtComponentsJson);
        this.DigitizedCardProfile.values(this.writeReplace.AlternateContactlessPaymentDataJson());
        arrayList.add(getCvmResetTimeout());
        if (this.RecordsJson) {
            this.SdkCoreBusinessLogicModuleImpl = getDualTapResetTimeout();
        }
        if (this.getAid) {
            getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 125) % 128;
            arrayList.add(getApplicationLifeCycleData());
            arrayList.add(getSecurityWord());
            arrayList.add(getMchipCvmIssuerOptions());
        }
        if (this.getPaymentFci) {
            int i = SdkCoreDigitizedCardProfileImpl;
            getMaximumPinTry = (i + 95) % 128;
            if (!this.getAid) {
                int i2 = i + 39;
                getMaximumPinTry = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(getSecurityWord());
                    throw null;
                }
                arrayList.add(getSecurityWord());
            }
            arrayList.add(getAdditionalCheckTable());
            arrayList.add((com.payair.hce.ProvisionRequestEncrypted) DigitizedCardProfile(new java.lang.Object[]{this}, 1081569728, -1081569727, java.lang.System.identityHashCode(this)));
        }
        com.payair.hce.ProvisionRequestEncrypted[] provisionRequestEncryptedArr = new com.payair.hce.ProvisionRequestEncrypted[arrayList.size()];
        SdkCoreDigitizedCardProfileImpl = (getMaximumPinTry + 115) % 128;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            int i4 = SdkCoreDigitizedCardProfileImpl + 51;
            getMaximumPinTry = i4 % 128;
            if (i4 % 2 == 0) {
                provisionRequestEncryptedArr[i3] = (com.payair.hce.ProvisionRequestEncrypted) arrayList.get(i3);
                i3 += 38;
            } else {
                provisionRequestEncryptedArr[i3] = (com.payair.hce.ProvisionRequestEncrypted) arrayList.get(i3);
                i3++;
            }
        }
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 13) % 128;
        return provisionRequestEncryptedArr;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = (com.payair.hce.setMChipCvmIssuerOptions) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setCardLayoutDescription.values);
        sb.append(com.payair.hce.setCardLayoutDescription.valueOf);
        sb.append(com.payair.hce.setCardLayoutDescription.writeReplace);
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("ᐜ氍⒪螞維믝挑\uf098앂鋴駬\u0ee4", "狴␝돋狏", bitsPerPixel + 1, "\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(setmchipcvmissueroptions.getCiacDecline);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("좟阾兀\uf2ae㨫쏶ᙁ▛䇊谢", "曬\u0ea4\ua83b㥠", android.text.TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("ᤍ錃", "뿀蜌퀋뿇", (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.graphics.Color.argb(0, 0, 0, 0) + 51152), objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0084\u0082\u0081\u0081\u0086\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0082\u0087", objArr5);
        sb2.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{intern, ((java.lang.String) objArr5[0]).intern()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("⾽䡥", "츰㮼¤䵕", android.view.Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", (char) (android.graphics.Color.red(0) + 21760), objArr6);
        sb2.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr6[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.String obj2 = sb2.toString();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, null, "\u0085\u0090", objArr7);
        java.lang.String str = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr7[0]).intern(), obj2}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        int i = SdkCoreDigitizedCardProfileImpl + 85;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String getCardLayoutDescription() {
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 5) % 128;
        java.lang.String AlternateContactlessPaymentDataJson = this.writeReplace.AlternateContactlessPaymentDataJson();
        int i = getMaximumPinTry + 13;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.ProvisionRequestEncrypted getCvmResetTimeout() {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 1}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 1}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, this.DigitizedCardProfile.values()}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
        int i = getMaximumPinTry + 51;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return provisionRequestEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String getDualTapResetTimeout() {
        com.payair.hce.setCvmResetTimeout setcvmresettimeout = new com.payair.hce.setCvmResetTimeout();
        com.payair.hce.setCvmResetTimeout writeReplace = setcvmresettimeout.writeReplace(this.AlternateContactlessPaymentDataJson);
        ((com.payair.hce.setCvmResetTimeout) com.payair.hce.setCvmResetTimeout.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace, this.IccPrivateKeyCrtComponentsJson}, -1737404, 1737404, java.lang.System.identityHashCode(writeReplace))).DigitizedCardProfile(this.SdkCoreAlternateContactlessPaymentDataImpl).values(this.writeReplace.AlternateContactlessPaymentDataJson()).AlternateContactlessPaymentDataJson(this.getMagstripeCvmIssuerOptions);
        java.lang.String DigitizedCardProfile = setcvmresettimeout.DigitizedCardProfile();
        getMaximumPinTry = (SdkCoreDigitizedCardProfileImpl + 7) % 128;
        return DigitizedCardProfile;
    }

    private com.payair.hce.ProvisionRequestEncrypted getApplicationLifeCycleData() {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 1}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 2}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, this.valueOf.writeReplace(1)}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
        int i = getMaximumPinTry + 17;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return provisionRequestEncrypted;
        }
        throw null;
    }

    private com.payair.hce.ProvisionRequestEncrypted getSecurityWord() {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 2}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 2}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, this.valueOf.writeReplace(2)}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
        int i = getMaximumPinTry + 31;
        SdkCoreDigitizedCardProfileImpl = i % 128;
        if (i % 2 == 0) {
            return provisionRequestEncrypted;
        }
        throw null;
    }

    private com.payair.hce.ProvisionRequestEncrypted getMchipCvmIssuerOptions() {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 3}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 2}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, this.valueOf.writeReplace(3)}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
        int i = SdkCoreDigitizedCardProfileImpl + 17;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return provisionRequestEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.ProvisionRequestEncrypted getAdditionalCheckTable() {
        com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = new com.payair.hce.ProvisionRequestEncrypted();
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 1}, -1812962118, 1812962120, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, (byte) 4}, -1806533381, 1806533381, java.lang.System.identityHashCode(provisionRequestEncrypted));
        com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted, this.values.valueOf(1)}, -837618313, 837618318, java.lang.System.identityHashCode(provisionRequestEncrypted));
        int i = SdkCoreDigitizedCardProfileImpl + 1;
        getMaximumPinTry = i % 128;
        if (i % 2 != 0) {
            return provisionRequestEncrypted;
        }
        throw null;
    }

    static void getProfileVersion() {
        getDigitizedCardId = 8080925410948570776L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreDigitizedCardProfileImpl = 0;
        getMaximumPinTry = 1;
        getProfileVersion();
        getCdol1RelatedDataLength = new char[]{10792, 10838, 10793, 10795, 10812, 10794, 10809, 10785, 10813, 10797, 10799, 10798, 10811, 10808, 10810, 10796};
        buildRecords = -143185306;
        getIssuerApplicationData = true;
        getIccPrivateKeyCrtComponents = true;
        getAlternateContactlessPaymentData = 1263759066225628708L;
        getCiacDeclineOnPpms = -804334044;
        getPinIvCvc3Track2 = (char) 1985;
    }

    private com.payair.hce.ProvisionRequestEncrypted getMagstripeCvmIssuerOptions() {
        return (com.payair.hce.ProvisionRequestEncrypted) DigitizedCardProfile(new java.lang.Object[]{this}, 1081569728, -1081569727, java.lang.System.identityHashCode(this));
    }

    private java.lang.String getCvrMaskAnd() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1253001983, 1253001987, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.NotifyProvisionResponseEncrypted RecordsJson() {
        return (com.payair.hce.NotifyProvisionResponseEncrypted) DigitizedCardProfile(new java.lang.Object[]{this}, -1154589096, 1154589099, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setMChipCvmIssuerOptions values() {
        return (com.payair.hce.setMChipCvmIssuerOptions) DigitizedCardProfile(new java.lang.Object[]{this}, -102940827, 102940829, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98};
        $$b = 144;
    }

    public final com.payair.hce.setMChipCvmIssuerOptions DigitizedCardProfile(java.lang.String str) {
        return (com.payair.hce.setMChipCvmIssuerOptions) DigitizedCardProfile(new java.lang.Object[]{this, str}, -607392405, 607392405, java.lang.System.identityHashCode(this));
    }
}
