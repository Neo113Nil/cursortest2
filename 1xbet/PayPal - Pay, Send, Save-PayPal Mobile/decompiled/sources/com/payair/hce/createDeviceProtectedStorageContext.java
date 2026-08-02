package com.payair.hce;

/* loaded from: classes4.dex */
public final class createDeviceProtectedStorageContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static char getProfileVersion;
    private static char valueOf;
    private static char writeReplace;
    private com.payair.hce.access300 AlternateContactlessPaymentDataJson;
    private com.payair.hce.access400 values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 2;
        int i4 = 99 - (b * 3);
        byte[] bArr = $$a;
        int i5 = 4 - (b2 * 2);
        byte[] bArr2 = new byte[24 - i3];
        int i6 = 23 - i3;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += -i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 1 - (s * 2);
        byte[] bArr = $$d;
        int i4 = (b2 * 4) + 110;
        int i5 = (b * 4) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i3;
            i5++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public createDeviceProtectedStorageContext() {
    }

    public static com.payair.hce.createContextForSplit DigitizedCardProfile(final com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl sdkCoreDigitizedCardProfileImpl) {
        com.payair.hce.createContextForSplit createcontextforsplit = new com.payair.hce.createContextForSplit() { // from class: com.payair.hce.createDeviceProtectedStorageContext.2
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int valueOf = 1;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i3;
                int i6 = ~((~i2) | i);
                int i7 = (i * 55) + (i2 * (-107)) + (((~(i2 | i5)) | (~(i4 | i2))) * (-108)) + (((~(i | i5)) | (~(i4 | i3)) | i6) * 54) + ((i3 | i6) * 54);
                if (i7 == 1) {
                    return values(objArr);
                }
                if (i7 != 2) {
                    return i7 != 3 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
                }
                final com.payair.hce.enforceUriPermission mppLiteModule = com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.this.getMppLiteModule();
                com.payair.hce.enforceUriPermission enforceuripermission = new com.payair.hce.enforceUriPermission() { // from class: com.payair.hce.createDeviceProtectedStorageContext.5
                    private static int DigitizedCardProfile = 1;
                    private static int valueOf;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i8, int i9, int i10) {
                        int i11 = ~i9;
                        int i12 = ~i10;
                        int i13 = (~(i11 | i12)) | (~(i11 | i8)) | (~(i12 | i8));
                        int i14 = ~i8;
                        int i15 = (i8 * (-589)) + (i9 * 591) + (((~(i10 | i14 | i9)) | i13) * 590) + (i13 * (-1180)) + (((~(i9 | i12)) | (~(i14 | i12))) * 590);
                        if (i15 == 1) {
                            return values(objArr2);
                        }
                        if (i15 != 2) {
                            return DigitizedCardProfile(objArr2);
                        }
                        final com.payair.hce.checkCallingUriPermissions cardRiskManagementData = com.payair.hce.enforceUriPermission.this.getCardRiskManagementData();
                        com.payair.hce.checkCallingUriPermissions checkcallinguripermissions = new com.payair.hce.checkCallingUriPermissions() { // from class: com.payair.hce.createDeviceProtectedStorageContext.3
                            private static int AlternateContactlessPaymentDataJson = 0;
                            private static int DigitizedCardProfile = 1;

                            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3, int i16, int i17, int i18) {
                                int i19 = ~i17;
                                int i20 = ~i18;
                                if ((i16 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + (i17 * (-987)) + (((~(i19 | i20 | i16)) | (~(i16 | i17 | i18))) * 988) + ((i16 | i19) * (-988)) + (((~((~i16) | i19)) | (~(i18 | i19)) | (~(i17 | i20 | i16))) * 988) != 1) {
                                    return values(objArr3);
                                }
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass3) objArr3[0];
                                int i21 = AlternateContactlessPaymentDataJson;
                                int i22 = (i21 & (-92)) | ((~i21) & 91);
                                int i23 = (i21 & 91) << 1;
                                DigitizedCardProfile = (((i22 | i23) << 1) - (i23 ^ i22)) % 128;
                                byte[] crmCountryCode = com.payair.hce.checkCallingUriPermissions.this.getCrmCountryCode();
                                int i24 = DigitizedCardProfile;
                                int i25 = ((i24 ^ 121) | (i24 & 121)) << 1;
                                int i26 = -((i24 & (-122)) | ((~i24) & 121));
                                AlternateContactlessPaymentDataJson = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
                                return crmCountryCode;
                            }

                            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass3) objArr3[0];
                                int i16 = AlternateContactlessPaymentDataJson;
                                int i17 = ((i16 ^ 47) | (i16 & 47)) << 1;
                                int i18 = -((i16 & (-48)) | ((~i16) & 47));
                                DigitizedCardProfile = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                                byte[] additionalCheckTable = com.payair.hce.checkCallingUriPermissions.this.getAdditionalCheckTable();
                                int i19 = AlternateContactlessPaymentDataJson;
                                int i20 = i19 & 117;
                                int i21 = ((i19 ^ 117) | i20) << 1;
                                int i22 = -((i19 | 117) & (~i20));
                                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                                DigitizedCardProfile = i23 % 128;
                                if (i23 % 2 != 0) {
                                    return additionalCheckTable;
                                }
                                throw new java.lang.ArithmeticException();
                            }

                            @Override // com.payair.hce.checkCallingUriPermissions
                            public final byte[] getCrmCountryCode() {
                                return (byte[]) writeReplace(new java.lang.Object[]{this}, -1428975488, 1428975489, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.checkCallingUriPermissions
                            public final byte[] getAdditionalCheckTable() {
                                return (byte[]) writeReplace(new java.lang.Object[]{this}, 2054148334, -2054148334, java.lang.System.identityHashCode(this));
                            }
                        };
                        int i16 = valueOf;
                        int i17 = i16 & 67;
                        DigitizedCardProfile = (((((i16 ^ 67) | i17) << 1) - (~(-((i16 | 67) & (~i17))))) - 1) % 128;
                        return checkcallinguripermissions;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        final com.payair.hce.checkCallingUriPermission contactlessPaymentData = com.payair.hce.enforceUriPermission.this.getContactlessPaymentData();
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = new com.payair.hce.checkCallingUriPermission() { // from class: com.payair.hce.createDeviceProtectedStorageContext.1
                            private static final byte[] $$a = null;
                            private static final int $$b = 0;
                            private static final byte[] $$d = null;
                            private static final int $$e = 0;
                            private static int $10;
                            private static int $11;
                            private static byte[] AlternateContactlessPaymentDataJson;
                            private static int DigitizedCardProfile;
                            private static char IccPrivateKeyCrtComponentsJson;
                            private static char RecordsJson;
                            private static char SdkCoreAlternateContactlessPaymentDataImpl;
                            private static char getAid;
                            private static int getCvrMaskAnd;
                            private static int getGpoResponse;
                            private static short[] getProfileVersion;
                            private static int valueOf;
                            private static int values;

                            private static void a(byte b, int i8, int i9, java.lang.Object[] objArr3) {
                                int i10 = i9 * 34;
                                byte[] bArr = $$a;
                                int i11 = 37 - (i8 * 34);
                                int i12 = 718 - (b * 653);
                                char[] cArr = new char[35 - i10];
                                int i13 = 34 - i10;
                                int i14 = -1;
                                if (bArr == null) {
                                    i12 = (i12 + (-i13)) - 2;
                                }
                                while (true) {
                                    i14++;
                                    i11++;
                                    cArr[i14] = (char) i12;
                                    if (i14 == i13) {
                                        objArr3[0] = new java.lang.String(cArr);
                                        return;
                                    }
                                    i12 = (i12 + (-bArr[i11])) - 2;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private static void d(short s, short s2, int i8, java.lang.Object[] objArr3) {
                                int i9;
                                int i10 = 3 - (s2 * 3);
                                int i11 = s * 2;
                                byte[] bArr = $$d;
                                int i12 = 110 - (i8 * 6);
                                byte[] bArr2 = new byte[i11 + 1];
                                if (bArr == null) {
                                    int i13 = i11;
                                    int i14 = i10;
                                    int i15 = 0;
                                    int i16 = i10 + i13;
                                    i9 = i15;
                                    int i17 = i14;
                                    i12 = i16;
                                    i10 = i17;
                                    int i18 = i10 + 1;
                                    bArr2[i9] = (byte) i12;
                                    if (i9 == i11) {
                                        objArr3[0] = new java.lang.String(bArr2, 0);
                                        return;
                                    }
                                    int i19 = i12;
                                    i14 = i18;
                                    i10 = bArr[i18];
                                    i15 = i9 + 1;
                                    i13 = i19;
                                    int i162 = i10 + i13;
                                    i9 = i15;
                                    int i172 = i14;
                                    i12 = i162;
                                    i10 = i172;
                                    int i182 = i10 + 1;
                                    bArr2[i9] = (byte) i12;
                                    if (i9 == i11) {
                                    }
                                } else {
                                    i9 = 0;
                                    int i1822 = i10 + 1;
                                    bArr2[i9] = (byte) i12;
                                    if (i9 == i11) {
                                    }
                                }
                            }

                            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3, int i8, int i9, int i10) {
                                int i11 = ~i9;
                                int i12 = ~(i11 | i10);
                                if ((i8 * (-244)) + (i9 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE) + (((~((~i10) | i11)) | (~(i11 | i8))) * (-245)) + (i12 * (-245)) + ((i8 | i12) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) == 1) {
                                    return values(objArr3);
                                }
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass1) objArr3[0];
                                getGpoResponse = (getCvrMaskAnd + 49) % 128;
                                byte[] aid = com.payair.hce.checkCallingUriPermission.this.getAid();
                                getGpoResponse = (getCvrMaskAnd + 71) % 128;
                                return aid;
                            }

                            private static void c(java.lang.String str, int i8, java.lang.Object[] objArr3) {
                                char[] cArr;
                                if (str != null) {
                                    int i9 = $10 + 63;
                                    $11 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        throw null;
                                    }
                                    cArr = str.toCharArray();
                                } else {
                                    cArr = str;
                                }
                                char[] cArr2 = cArr;
                                com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
                                char[] cArr3 = new char[cArr2.length];
                                getproducttype.AlternateContactlessPaymentDataJson = 0;
                                char[] cArr4 = new char[2];
                                while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
                                    cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                                    cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
                                    int i10 = 58224;
                                    int i11 = 0;
                                    while (i11 < 16) {
                                        $10 = ($11 + 37) % 128;
                                        char c = cArr4[1];
                                        char c2 = cArr4[0];
                                        try {
                                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i10) ^ ((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                            if (obj == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1336, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                d((short) 0, (short) 0, 0, objArr5);
                                                obj = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                                            }
                                            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).charValue();
                                            cArr4[1] = charValue;
                                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (IccPrivateKeyCrtComponentsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAid)};
                                            int i12 = charValue + i10;
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                            if (obj2 == null) {
                                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 62, 1335 - (android.os.Process.myTid() >> 22), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                d((short) 0, (short) 0, 0, objArr7);
                                                obj2 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                                            }
                                            cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr6)).charValue();
                                            i10 -= 40503;
                                            i11++;
                                            $11 = ($10 + 41) % 128;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
                                    cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
                                    java.lang.Object[] objArr8 = {getproducttype, getproducttype};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 53, 3543 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                                    }
                                    ((java.lang.reflect.Method) obj3).invoke(null, objArr8);
                                }
                                objArr3[0] = new java.lang.String(cArr3, 0, i8);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:42:0x021b  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private static void b(int i8, int i9, int i10, byte b, short s, java.lang.Object[] objArr3) {
                                int i11;
                                long j;
                                int i12;
                                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                try {
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(DigitizedCardProfile)};
                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                    char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                                    if (obj == null) {
                                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).intValue();
                                    if (intValue == -1) {
                                        $10 = ($11 + 105) % 128;
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    if (i11 != 0) {
                                        byte[] bArr = AlternateContactlessPaymentDataJson;
                                        if (bArr != null) {
                                            int length = bArr.length;
                                            byte[] bArr2 = new byte[length];
                                            int i13 = 0;
                                            while (i13 < length) {
                                                $11 = ($10 + 87) % 128;
                                                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(bArr[i13])};
                                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                                if (obj2 == null) {
                                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf("", c, 0, 0) + 5089, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                                }
                                                bArr2[i13] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).byteValue();
                                                i13++;
                                                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                                            }
                                            bArr = bArr2;
                                        }
                                        if (bArr == null) {
                                            j = -4897270311952305750L;
                                            intValue = (short) (((short) (getProfileVersion[i9 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                                            if (intValue > 0) {
                                                gettrack2constructiondata.writeReplace = ((i9 + intValue) - 2) + ((int) (values ^ j)) + i11;
                                                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(valueOf), sb};
                                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                                if (obj3 == null) {
                                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, 2364 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.graphics.Color.alpha(0));
                                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                    d((short) 0, (short) 0, 1, objArr7);
                                                    obj3 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                                                }
                                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                                byte[] bArr3 = AlternateContactlessPaymentDataJson;
                                                if (bArr3 != null) {
                                                    int length2 = bArr3.length;
                                                    byte[] bArr4 = new byte[length2];
                                                    for (int i14 = 0; i14 < length2; i14++) {
                                                        bArr4[i14] = (byte) (bArr3[i14] ^ (-4897270311952305750L));
                                                    }
                                                    bArr3 = bArr4;
                                                }
                                                boolean z = bArr3 != null;
                                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                                    int i15 = $11 + 67;
                                                    $10 = i15 % 128;
                                                    if (i15 % 2 != 0) {
                                                        throw new java.lang.ArithmeticException();
                                                    }
                                                    if (z) {
                                                        byte[] bArr5 = AlternateContactlessPaymentDataJson;
                                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                                                    } else {
                                                        short[] sArr = getProfileVersion;
                                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                                                    }
                                                    sb.append(gettrack2constructiondata.values);
                                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                                    gettrack2constructiondata.DigitizedCardProfile++;
                                                }
                                            }
                                            objArr3[0] = sb.toString();
                                        }
                                        int i16 = $10 + 117;
                                        $11 = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            byte[] bArr6 = AlternateContactlessPaymentDataJson;
                                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(values)};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                            if (obj4 == null) {
                                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                                            }
                                            i12 = ((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue()] & (-4897270311952305750L))) >>> ((int) (DigitizedCardProfile * (-4897270311952305750L)));
                                        } else {
                                            byte[] bArr7 = AlternateContactlessPaymentDataJson;
                                            java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(values)};
                                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                            if (obj5 == null) {
                                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 29, (char) (android.os.Process.myTid() >> 22))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                                            }
                                            i12 = ((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)));
                                        }
                                        intValue = (byte) i12;
                                    }
                                    j = -4897270311952305750L;
                                    if (intValue > 0) {
                                    }
                                    objArr3[0] = sb.toString();
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getPpseFci() {
                                int i8 = getGpoResponse + 107;
                                getCvrMaskAnd = i8 % 128;
                                com.payair.hce.checkCallingUriPermission checkcallinguripermission2 = com.payair.hce.checkCallingUriPermission.this;
                                if (i8 % 2 != 0) {
                                    return checkcallinguripermission2.getPpseFci();
                                }
                                checkcallinguripermission2.getPpseFci();
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getPaymentFci() {
                                getGpoResponse = (getCvrMaskAnd + 23) % 128;
                                byte[] paymentFci = com.payair.hce.checkCallingUriPermission.this.getPaymentFci();
                                getCvrMaskAnd = (getGpoResponse + 73) % 128;
                                return paymentFci;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getGpoResponse() {
                                getCvrMaskAnd = (getGpoResponse + 71) % 128;
                                byte[] gpoResponse = com.payair.hce.checkCallingUriPermission.this.getGpoResponse();
                                getCvrMaskAnd = (getGpoResponse + 1) % 128;
                                return gpoResponse;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getCdol1RelatedDataLength() {
                                int i8 = getCvrMaskAnd + 21;
                                getGpoResponse = i8 % 128;
                                if (i8 % 2 != 0) {
                                    com.payair.hce.checkCallingUriPermission.this.getCdol1RelatedDataLength();
                                    throw new java.lang.ArithmeticException();
                                }
                                byte[] cdol1RelatedDataLength = com.payair.hce.checkCallingUriPermission.this.getCdol1RelatedDataLength();
                                getGpoResponse = (getCvrMaskAnd + 11) % 128;
                                return cdol1RelatedDataLength;
                            }

                            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass1) objArr3[0];
                                getCvrMaskAnd = (getGpoResponse + 75) % 128;
                                byte[] ciacDecline = com.payair.hce.checkCallingUriPermission.this.getCiacDecline();
                                int i8 = getGpoResponse + 83;
                                getCvrMaskAnd = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return ciacDecline;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getCvrMaskAnd() {
                                getCvrMaskAnd = (getGpoResponse + 33) % 128;
                                byte[] cvrMaskAnd = com.payair.hce.checkCallingUriPermission.this.getCvrMaskAnd();
                                int i8 = getCvrMaskAnd + 41;
                                getGpoResponse = i8 % 128;
                                if (i8 % 2 == 0) {
                                    return cvrMaskAnd;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getIssuerApplicationData() {
                                getCvrMaskAnd = (getGpoResponse + 63) % 128;
                                byte[] issuerApplicationData = com.payair.hce.checkCallingUriPermission.this.getIssuerApplicationData();
                                int i8 = getCvrMaskAnd + 17;
                                getGpoResponse = i8 % 128;
                                if (i8 % 2 == 0) {
                                    return issuerApplicationData;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final com.payair.hce.createDisplayContext getIccPrivateKeyCrtComponents() {
                                final com.payair.hce.createDisplayContext iccPrivateKeyCrtComponents = com.payair.hce.checkCallingUriPermission.this.getIccPrivateKeyCrtComponents();
                                com.payair.hce.createDisplayContext createdisplaycontext = new com.payair.hce.createDisplayContext() { // from class: com.payair.hce.createDeviceProtectedStorageContext.8
                                    private static final byte[] $$a = null;
                                    private static final int $$b = 0;
                                    private static final byte[] $$d = null;
                                    private static final int $$e = 0;
                                    private static int $10;
                                    private static int $11;
                                    private static int AlternateContactlessPaymentDataJson;
                                    private static int values;
                                    private static int[] writeReplace;

                                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3, int i8, int i9, int i10) {
                                        return values(objArr3);
                                    }

                                    private static void a(int i8, short s, short s2, java.lang.Object[] objArr3) {
                                        byte[] bArr = $$d;
                                        int i9 = s2 * 2;
                                        int i10 = (s * 3) + 66;
                                        int i11 = (i8 * 2) + 4;
                                        byte[] bArr2 = new byte[1 - i9];
                                        int i12 = -1;
                                        if (bArr == null) {
                                            i11++;
                                            i10 += i11;
                                        }
                                        while (true) {
                                            i12++;
                                            bArr2[i12] = (byte) i10;
                                            if (i12 == 0 - i9) {
                                                objArr3[0] = new java.lang.String(bArr2, 0);
                                                return;
                                            } else {
                                                byte b = bArr[i11];
                                                i11++;
                                                i10 += b;
                                            }
                                        }
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    private static void c(byte b, short s, short s2, java.lang.Object[] objArr3) {
                                        int i8;
                                        int i9 = (b * 653) + 65;
                                        int i10 = s2 + 4;
                                        byte[] bArr = $$a;
                                        int i11 = s * 34;
                                        char[] cArr = new char[35 - i11];
                                        int i12 = 34 - i11;
                                        if (bArr == null) {
                                            int i13 = i9;
                                            i9 = i12;
                                            int i14 = 0;
                                            i9 = (i9 + (-i13)) - 2;
                                            i8 = i14;
                                            cArr[i8] = (char) i9;
                                            i10++;
                                            i14 = i8 + 1;
                                            if (i8 == i12) {
                                                objArr3[0] = new java.lang.String(cArr);
                                                return;
                                            }
                                            i13 = bArr[i10];
                                            i9 = (i9 + (-i13)) - 2;
                                            i8 = i14;
                                            cArr[i8] = (char) i9;
                                            i10++;
                                            i14 = i8 + 1;
                                            if (i8 == i12) {
                                            }
                                        } else {
                                            i8 = 0;
                                            cArr[i8] = (char) i9;
                                            i10++;
                                            i14 = i8 + 1;
                                            if (i8 == i12) {
                                            }
                                        }
                                    }

                                    private static void b(int[] iArr, int i8, java.lang.Object[] objArr3) {
                                        int[] iArr2;
                                        int i9;
                                        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                                        char[] cArr = new char[4];
                                        char[] cArr2 = new char[iArr.length * 2];
                                        int[] iArr3 = writeReplace;
                                        long j = 0;
                                        int i10 = 1;
                                        if (iArr3 != null) {
                                            $11 = ($10 + 11) % 128;
                                            int length = iArr3.length;
                                            int[] iArr4 = new int[length];
                                            int i11 = 0;
                                            while (i11 < length) {
                                                try {
                                                    java.lang.Object[] objArr4 = new java.lang.Object[i10];
                                                    objArr4[0] = java.lang.Integer.valueOf(iArr3[i11]);
                                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                                                    if (obj == null) {
                                                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 27, (android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)) + 28, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                                                    }
                                                    iArr4[i11] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).intValue();
                                                    i11++;
                                                    $10 = ($11 + 79) % 128;
                                                    j = 0;
                                                    i10 = 1;
                                                } catch (java.lang.Throwable th) {
                                                    java.lang.Throwable cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            }
                                            iArr3 = iArr4;
                                        }
                                        int length2 = iArr3.length;
                                        int[] iArr5 = new int[length2];
                                        int[] iArr6 = writeReplace;
                                        if (iArr6 != null) {
                                            $10 = ($11 + 69) % 128;
                                            int length3 = iArr6.length;
                                            int[] iArr7 = new int[length3];
                                            int i12 = 0;
                                            while (i12 < length3) {
                                                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(iArr6[i12])};
                                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                                                if (obj2 == null) {
                                                    iArr2 = iArr6;
                                                    i9 = length3;
                                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("z", java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                                                } else {
                                                    iArr2 = iArr6;
                                                    i9 = length3;
                                                }
                                                iArr7[i12] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
                                                i12++;
                                                iArr6 = iArr2;
                                                length3 = i9;
                                            }
                                            $10 = ($11 + 35) % 128;
                                            iArr6 = iArr7;
                                        }
                                        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
                                        istransitsupported.valueOf = 0;
                                        while (istransitsupported.valueOf < iArr.length) {
                                            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
                                            cArr[1] = (char) iArr[istransitsupported.valueOf];
                                            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                                            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                                            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                                            istransitsupported.values = (cArr[2] << 16) + cArr[3];
                                            com.payair.hce.isTransitSupported.values(iArr5);
                                            int i13 = 0;
                                            for (int i14 = 16; i13 < i14; i14 = 16) {
                                                istransitsupported.DigitizedCardProfile ^= iArr5[i13];
                                                java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                                                if (obj3 == null) {
                                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, 5088 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                                                }
                                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue();
                                                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                                                istransitsupported.values = intValue;
                                                i13++;
                                            }
                                            int i15 = istransitsupported.DigitizedCardProfile;
                                            istransitsupported.DigitizedCardProfile = istransitsupported.values;
                                            istransitsupported.values = i15;
                                            istransitsupported.values ^= iArr5[16];
                                            istransitsupported.DigitizedCardProfile ^= iArr5[17];
                                            int i16 = istransitsupported.DigitizedCardProfile;
                                            int i17 = istransitsupported.values;
                                            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                                            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                                            cArr[2] = (char) (istransitsupported.values >>> 16);
                                            cArr[3] = (char) istransitsupported.values;
                                            com.payair.hce.isTransitSupported.values(iArr5);
                                            cArr2[istransitsupported.valueOf * 2] = cArr[0];
                                            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                                            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                                            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                                            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                                            if (obj4 == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2923 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (3037 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                a(0, (short) 0, (short) 0, objArr8);
                                                obj4 = cls.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
                                            }
                                            ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                                        }
                                        objArr3[0] = new java.lang.String(cArr2, 0, i8);
                                    }

                                    @Override // com.payair.hce.createDisplayContext
                                    public final byte[] getP() {
                                        AlternateContactlessPaymentDataJson = (values + 103) % 128;
                                        byte[] p = com.payair.hce.createDisplayContext.this.getP();
                                        values = (AlternateContactlessPaymentDataJson + 33) % 128;
                                        return p;
                                    }

                                    @Override // com.payair.hce.createDisplayContext
                                    public final byte[] getQ() {
                                        AlternateContactlessPaymentDataJson = (values + 43) % 128;
                                        byte[] q = com.payair.hce.createDisplayContext.this.getQ();
                                        AlternateContactlessPaymentDataJson = (values + 45) % 128;
                                        return q;
                                    }

                                    @Override // com.payair.hce.createDisplayContext
                                    public final byte[] getDp() {
                                        values = (AlternateContactlessPaymentDataJson + 87) % 128;
                                        byte[] dp = com.payair.hce.createDisplayContext.this.getDp();
                                        int i8 = AlternateContactlessPaymentDataJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                        values = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            return dp;
                                        }
                                        throw null;
                                    }

                                    @Override // com.payair.hce.createDisplayContext
                                    public final byte[] getDq() {
                                        int i8 = AlternateContactlessPaymentDataJson + 117;
                                        values = i8 % 128;
                                        com.payair.hce.createDisplayContext createdisplaycontext2 = com.payair.hce.createDisplayContext.this;
                                        if (i8 % 2 == 0) {
                                            return createdisplaycontext2.getDq();
                                        }
                                        createdisplaycontext2.getDq();
                                        throw null;
                                    }

                                    @Override // com.payair.hce.createDisplayContext
                                    public final byte[] getU() {
                                        int i8 = values + 39;
                                        AlternateContactlessPaymentDataJson = i8 % 128;
                                        com.payair.hce.createDisplayContext createdisplaycontext2 = com.payair.hce.createDisplayContext.this;
                                        if (i8 % 2 != 0) {
                                            return createdisplaycontext2.getU();
                                        }
                                        createdisplaycontext2.getU();
                                        throw null;
                                    }

                                    /* JADX WARN: Can't wrap try/catch for region: R(13:36|37|(1:39)(4:83|84|85|(11:87|88|41|42|(1:44)(5:52|53|54|55|(3:57|(1:59)(4:69|70|71|72)|(6:62|63|(1:65)|66|67|68)))|45|46|(1:48)|49|50|51)(1:89))|40|41|42|(0)(0)|45|46|(0)|49|50|51) */
                                    /* JADX WARN: Code restructure failed: missing block: B:60:0x06c5, code lost:
                                    
                                        if ((r2 % 2) == 0) goto L91;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:73:0x06fd, code lost:
                                    
                                        if (r7.equals(((java.lang.String) r11[0]).intern()) != false) goto L91;
                                     */
                                    /* JADX WARN: Removed duplicated region for block: B:19:0x02f3 A[RETURN] */
                                    /* JADX WARN: Removed duplicated region for block: B:21:0x02f4 A[Catch: all -> 0x088a, TRY_ENTER, TryCatch #5 {all -> 0x088a, blocks: (B:21:0x02f4, B:23:0x0303, B:24:0x0349, B:28:0x043a, B:30:0x0489, B:31:0x04d7, B:63:0x0723, B:65:0x075a, B:66:0x07a7, B:46:0x07e5, B:48:0x0825, B:49:0x0876, B:96:0x050c, B:98:0x0546, B:99:0x0594, B:128:0x0241, B:130:0x028f, B:131:0x02d9, B:3:0x001f, B:5:0x005b, B:9:0x008e, B:16:0x014c, B:103:0x0155, B:105:0x015b, B:106:0x015c, B:7:0x015d, B:108:0x0161, B:115:0x0214, B:118:0x021d, B:120:0x0223, B:121:0x0224), top: B:2:0x001f, inners: #7 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:44:0x0658  */
                                    /* JADX WARN: Removed duplicated region for block: B:48:0x0825 A[Catch: all -> 0x088a, TryCatch #5 {all -> 0x088a, blocks: (B:21:0x02f4, B:23:0x0303, B:24:0x0349, B:28:0x043a, B:30:0x0489, B:31:0x04d7, B:63:0x0723, B:65:0x075a, B:66:0x07a7, B:46:0x07e5, B:48:0x0825, B:49:0x0876, B:96:0x050c, B:98:0x0546, B:99:0x0594, B:128:0x0241, B:130:0x028f, B:131:0x02d9, B:3:0x001f, B:5:0x005b, B:9:0x008e, B:16:0x014c, B:103:0x0155, B:105:0x015b, B:106:0x015c, B:7:0x015d, B:108:0x0161, B:115:0x0214, B:118:0x021d, B:120:0x0223, B:121:0x0224), top: B:2:0x001f, inners: #7 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:52:0x065a A[Catch: Exception -> 0x07cb, TRY_LEAVE, TryCatch #3 {Exception -> 0x07cb, blocks: (B:42:0x062f, B:52:0x065a, B:55:0x0689, B:57:0x0691, B:69:0x06c8, B:72:0x06f7, B:76:0x07bc, B:77:0x07c2, B:80:0x07c4, B:81:0x07ca, B:54:0x0664, B:71:0x06d2), top: B:41:0x062f, inners: #1, #6 }] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                        java.lang.Object[] objArr4;
                                        java.lang.Object[] objArr5;
                                        int i8;
                                        java.lang.String str;
                                        java.lang.Object obj;
                                        java.io.File file;
                                        java.io.File file2;
                                        java.lang.String[] strArr;
                                        int i9;
                                        int intValue = ((java.lang.Number) objArr3[0]).intValue();
                                        int intValue2 = ((java.lang.Number) objArr3[1]).intValue();
                                        try {
                                            try {
                                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                b(new int[]{791487762, 1036375701, -1399217554, -2028718107, 65196781, -1727847132, -1234341385, 2066534141, -661743012, 1083713871}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, objArr6);
                                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                b(new int[]{-1990832647, 1311313005, -1960763474, -845531600, 1266676524, -1759090304, -1399217554, -2028718107, 493490614, -1498281184}, android.graphics.Color.alpha(0) + 18, objArr7);
                                                strArr = new java.lang.String[]{((java.lang.String) objArr6[0]).intern(), ((java.lang.String) objArr7[0]).intern()};
                                            } catch (java.lang.Throwable th) {
                                                java.lang.Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Exception unused) {
                                            objArr4 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 2}, null, new int[1]};
                                            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                            int i10 = ~currentTimeMillis;
                                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(intValue2), 16, java.lang.Integer.valueOf((((935329711 | i10) * (-369)) - 1838430672) + (((~((-650006832) | i10)) | 354922153) * (-369)) + (((~(currentTimeMillis | 650006831)) | 285322880 | (~(i10 | (-580407559)))) * 369))};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj2 == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                byte b = $$a[14];
                                                byte b2 = (byte) (b + 1);
                                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                c(b2, b2, b, objArr9);
                                                obj2 = cls.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                            }
                                            ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr8)).intValue();
                                        }
                                        try {
                                            for (i9 = 0; i9 < 2; i9++) {
                                                java.lang.String str2 = strArr[i9];
                                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                b(new int[]{-856930022, -313325244, -558590472, 1308011914, 159062329, 225001135, -1515563673, 1205272030}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr10);
                                                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr10[0]).intern());
                                                if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                                                    objArr4 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 1}, null, new int[1]};
                                                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                                    int i11 = ~currentTimeMillis2;
                                                    try {
                                                        java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(intValue2), 16, java.lang.Integer.valueOf((((~((-993696484) | i11)) | (~((-11232502) | currentTimeMillis2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1001314618 + (((~(currentTimeMillis2 | (-990943747))) | (~(i11 | (-8479765)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj3 == null) {
                                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-1) - android.os.Process.getGidForName("")));
                                                            byte b3 = $$a[14];
                                                            byte b4 = (byte) (b3 + 1);
                                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                            c(b4, b4, b3, objArr12);
                                                            obj3 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                                                        }
                                                        ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                                                        if (intValue == ((int[]) objArr4[1])[0]) {
                                                            return objArr4;
                                                        }
                                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                                                        if (obj4 == null) {
                                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2391, (char) (29421 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                            byte b5 = (byte) (-$$a[14]);
                                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                            c(b5, b5, r7[23], objArr13);
                                                            obj4 = cls4.getMethod((java.lang.String) objArr13[0], null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                                                        }
                                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                                                        long j = ~((int) java.lang.System.currentTimeMillis());
                                                        long j2 = ~(j | (-699771989));
                                                        long j3 = ~(longValue | 699771988);
                                                        long j4 = (((-1527) * longValue) - 535325571585L) + ((longValue | j2) * 764) + (((~(j | longValue)) | j3) * (-1528)) + ((j3 | (((~longValue) | (-699771989)) ^ (-1)) | j2) * 764) + 981856085;
                                                        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                                                        int i12 = ~currentTimeMillis3;
                                                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                                        if (((((int) (j4 >> 32)) & ((((~((-335011386) | i12)) | (~((-1102215026) | currentTimeMillis3))) * 1900) + 1871737038 + (((~(1102215025 | i12)) | (~(335011385 | currentTimeMillis3))) * (-950)) + (((~(currentTimeMillis3 | 1102215025)) | (~(i12 | 335011385))) * 950))) | (((int) j4) & (((((~((-112222707) | r10)) | (~(1549449116 | r10))) * (-867)) - 1972008908) + (((~((-112222707) | currentTimeMillis4)) | 44056674 | (~(1549449116 | currentTimeMillis4))) * (-1734)) + (((~(currentTimeMillis4 | (-68166033))) | (~((~currentTimeMillis4) | (-44056675))) | (~(1593505790 | currentTimeMillis4))) * 867)))) == 1) {
                                                            AlternateContactlessPaymentDataJson = (values + 37) % 128;
                                                            objArr5 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 10}, null, new int[1]};
                                                            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                                            int i13 = ~currentTimeMillis5;
                                                            java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(intValue2), 16, java.lang.Integer.valueOf((((~(i13 | (-796741227))) | 588598784) * 98) + 1844965714 + (((~(i13 | (-208187759))) | (-796741227) | (~(208187758 | currentTimeMillis5))) * (-49)) + (((~(currentTimeMillis5 | (-796741227))) | (-796786543)) * 49))};
                                                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj5 == null) {
                                                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.blue(0));
                                                                byte b6 = $$a[14];
                                                                byte b7 = (byte) (b6 + 1);
                                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                                c(b7, b7, b6, objArr15);
                                                                obj5 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                                            }
                                                            int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr14)).intValue();
                                                            i8 = 0;
                                                            ((int[]) objArr5[3])[0] = intValue3;
                                                        } else {
                                                            objArr5 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                                                            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                                                            int i14 = ~currentTimeMillis6;
                                                            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf((((((~((-777295688) | i14)) | 202375169) | r2) * (-502)) - 481951282) + (((~(currentTimeMillis6 | 802553815)) | (~(i14 | (-574920519)))) * 502))};
                                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj6 == null) {
                                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                byte b8 = $$a[14];
                                                                byte b9 = (byte) (b8 + 1);
                                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                                c(b9, b9, b8, objArr17);
                                                                obj6 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                                            }
                                                            int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr16)).intValue();
                                                            i8 = 0;
                                                            ((int[]) objArr5[3])[0] = intValue4;
                                                        }
                                                        if (intValue != ((int[]) objArr5[1])[i8]) {
                                                            return objArr5;
                                                        }
                                                        try {
                                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                            b(new int[]{-1695443156, 2002178125, -1125678424, 416253156, -816548873, -911232708, -605607581, 1942013804, 557333749, 347950936, 1816316039, 1664006724, 910278728, 892353619, 1907633717, -395822061, -43676964, -731703501, -776654453, -657080283}, 40 - android.view.View.MeasureSpec.getMode(i8), objArr18);
                                                            file2 = new java.io.File(((java.lang.String) objArr18[i8]).intern());
                                                        } catch (java.lang.Exception unused2) {
                                                        }
                                                        if (file2.canRead()) {
                                                            java.io.FileReader fileReader = new java.io.FileReader(file2);
                                                            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                                            try {
                                                                str = bufferedReader.readLine();
                                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                                b(new int[]{1429439039, -263793192}, 3 - android.view.View.resolveSizeAndState(0, 0, 0), objArr19);
                                                                if (!str.equals(((java.lang.String) objArr19[0]).intern())) {
                                                                    values = (AlternateContactlessPaymentDataJson + 107) % 128;
                                                                    fileReader.close();
                                                                    bufferedReader.close();
                                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                                    b(new int[]{-904667218, -2087093850, -2094928615, -1010802054, -1565309463, 267479146, -2108259543, 451954292, 1210714631, 1467551395, 42249569, 205974071, 782536334, 1393206929, -921223540, -63798441}, 32 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr20);
                                                                    file = new java.io.File(((java.lang.String) objArr20[0]).intern());
                                                                    if (!file.canRead()) {
                                                                        try {
                                                                            java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                                            b(new int[]{178180930, -2013896652}, -android.view.MotionEvent.axisFromString(""), objArr21);
                                                                            if (readLine.equals(((java.lang.String) objArr21[0]).intern())) {
                                                                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                                                b(new int[]{-1695443156, 2002178125, -1125678424, 416253156, -816548873, -911232708, -605607581, 1942013804, 557333749, 347950936, 1816316039, 1664006724, 557333749, 347950936, 1816316039, 1664006724, -239528908, 295712090}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35, objArr22);
                                                                                java.io.File file3 = new java.io.File(((java.lang.String) objArr22[0]).intern());
                                                                                if (file3.canRead()) {
                                                                                    try {
                                                                                        java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                                        b(new int[]{178180930, -2013896652}, android.graphics.Color.argb(0, 0, 0, 0) + 1, objArr23);
                                                                                    } finally {
                                                                                    }
                                                                                } else {
                                                                                    int i15 = values + 89;
                                                                                    AlternateContactlessPaymentDataJson = i15 % 128;
                                                                                }
                                                                                if (str != null) {
                                                                                    java.lang.Object[] objArr24 = {new int[]{intValue}, new int[]{intValue ^ 20}, str, new int[1]};
                                                                                    int i16 = ~((~((int) java.lang.System.currentTimeMillis())) | 386110616);
                                                                                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(intValue2), 16, java.lang.Integer.valueOf(((318870680 | i16) * (-970)) + 273614792 + ((i16 | 67239936) * 970))};
                                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                    if (obj7 == null) {
                                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.view.View.getDefaultSize(0, 0));
                                                                                        byte b10 = $$a[14];
                                                                                        byte b11 = (byte) (b10 + 1);
                                                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                                                        c(b11, b11, b10, objArr26);
                                                                                        obj7 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                                    }
                                                                                    ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr25)).intValue();
                                                                                    return objArr24;
                                                                                }
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    }
                                                                    java.lang.Object[] objArr27 = {new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                                                                    int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                                                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf(((((~((-9027371) | currentTimeMillis7)) | 524330) * 104) - 428470248) + ((~((~currentTimeMillis7) | 1004404654)) * (-104)) + ((currentTimeMillis7 | 995901614) * 104))};
                                                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj == null) {
                                                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                        byte b12 = $$a[14];
                                                                        byte b13 = (byte) (b12 + 1);
                                                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                        c(b13, b13, b12, objArr29);
                                                                        obj = cls8.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                                                    }
                                                                    ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr28)).intValue();
                                                                    return objArr27;
                                                                }
                                                                fileReader.close();
                                                                bufferedReader.close();
                                                            } finally {
                                                            }
                                                        } else {
                                                            values = (AlternateContactlessPaymentDataJson + 111) % 128;
                                                        }
                                                        str = null;
                                                        java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                        b(new int[]{-904667218, -2087093850, -2094928615, -1010802054, -1565309463, 267479146, -2108259543, 451954292, 1210714631, 1467551395, 42249569, 205974071, 782536334, 1393206929, -921223540, -63798441}, 32 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr202);
                                                        file = new java.io.File(((java.lang.String) objArr202[0]).intern());
                                                        if (!file.canRead()) {
                                                        }
                                                        java.lang.Object[] objArr272 = {new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                                                        int currentTimeMillis72 = (int) java.lang.System.currentTimeMillis();
                                                        java.lang.Object[] objArr282 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf(((((~((-9027371) | currentTimeMillis72)) | 524330) * 104) - 428470248) + ((~((~currentTimeMillis72) | 1004404654)) * (-104)) + ((currentTimeMillis72 | 995901614) * 104))};
                                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj == null) {
                                                        }
                                                        ((int[]) objArr272[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr282)).intValue();
                                                        return objArr272;
                                                    } catch (java.lang.Throwable th2) {
                                                        java.lang.Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf(((((~r7) | 131113) * (-828)) - 137527688) + (((~((int) java.lang.System.currentTimeMillis())) | 1004797871) * (-828)) + 1251017408)};
                                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj8 == null) {
                                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                byte b14 = $$a[14];
                                                byte b15 = (byte) (b14 + 1);
                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                c(b15, b15, b14, objArr31);
                                                obj8 = cls9.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                            }
                                            ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr30)).intValue();
                                            if (intValue == ((int[]) objArr4[1])[0]) {
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                        objArr4 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                                    }

                                    static {
                                        init$1();
                                        $10 = 0;
                                        $11 = 1;
                                        init$0();
                                        values = 0;
                                        AlternateContactlessPaymentDataJson = 1;
                                        writeReplace = new int[]{-162437182, 152469090, -1164816549, 1221410744, -1124176210, -1583872707, -747406558, -1914182984, 205797219, 500306207, -1564966924, -1544212762, 786375502, 1373164066, -901443441, -1240476635, -399047907, 498614507};
                                    }

                                    static void init$1() {
                                        $$d = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
                                        $$e = 60;
                                    }

                                    static void init$0() {
                                        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                                        $$b = 10;
                                    }

                                    public static java.lang.Object[] values(int i8, int i9) {
                                        return (java.lang.Object[]) DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(i9)}, -962718449, 962718449, i8);
                                    }
                                };
                                getGpoResponse = (getCvrMaskAnd + 83) % 128;
                                return createdisplaycontext;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getPinIvCvc3Track2() {
                                getCvrMaskAnd = (getGpoResponse + 63) % 128;
                                byte[] pinIvCvc3Track2 = com.payair.hce.checkCallingUriPermission.this.getPinIvCvc3Track2();
                                int i8 = getGpoResponse + 13;
                                getCvrMaskAnd = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return pinIvCvc3Track2;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getCiacDeclineOnPpms() {
                                getGpoResponse = (getCvrMaskAnd + 43) % 128;
                                byte[] ciacDeclineOnPpms = com.payair.hce.checkCallingUriPermission.this.getCiacDeclineOnPpms();
                                getCvrMaskAnd = (getGpoResponse + 111) % 128;
                                return ciacDeclineOnPpms;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final com.payair.hce.enforceCallingOrSelfUriPermission getAlternateContactlessPaymentData() {
                                final com.payair.hce.enforceCallingOrSelfUriPermission alternateContactlessPaymentData = com.payair.hce.checkCallingUriPermission.this.getAlternateContactlessPaymentData();
                                if (alternateContactlessPaymentData == null) {
                                    int i8 = getGpoResponse + 11;
                                    getCvrMaskAnd = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        return null;
                                    }
                                    throw null;
                                }
                                com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission = new com.payair.hce.enforceCallingOrSelfUriPermission() { // from class: com.payair.hce.createDeviceProtectedStorageContext.4
                                    private static int AlternateContactlessPaymentDataJson = 0;
                                    private static int values = 1;

                                    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3, int i9, int i10, int i11) {
                                        int i12 = i9 | i10;
                                        int i13 = ~i9;
                                        int i14 = (~i11) | i13;
                                        int i15 = ~(i11 | i12);
                                        int i16 = (i9 * 503) + (i10 * 503) + (i12 * (-502)) + (((~((~i10) | i13)) | (~i14) | i15) * (-502)) + (((~(i10 | i14)) | i15) * 502);
                                        if (i16 == 1) {
                                            byte[] ciacDecline = com.payair.hce.enforceCallingOrSelfUriPermission.this.getCiacDecline();
                                            int i17 = values;
                                            int i18 = i17 & 119;
                                            AlternateContactlessPaymentDataJson = (((i17 | 119) & (~i18)) + (i18 << 1)) % 128;
                                            return ciacDecline;
                                        }
                                        if (i16 != 2) {
                                            return i16 != 3 ? i16 != 4 ? writeReplace(objArr3) : valueOf(objArr3) : DigitizedCardProfile(objArr3);
                                        }
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4) objArr3[0];
                                        int i19 = AlternateContactlessPaymentDataJson;
                                        values = (((i19 | 27) << 1) - (i19 ^ 27)) % 128;
                                        byte[] gpoResponse = com.payair.hce.enforceCallingOrSelfUriPermission.this.getGpoResponse();
                                        int i20 = values;
                                        AlternateContactlessPaymentDataJson = ((i20 ^ 125) + ((i20 & 125) << 1)) % 128;
                                        return gpoResponse;
                                    }

                                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4) objArr3[0];
                                        int i9 = AlternateContactlessPaymentDataJson;
                                        int i10 = i9 & 79;
                                        int i11 = -(-((i9 ^ 79) | i10));
                                        values = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                                        byte[] aid = com.payair.hce.enforceCallingOrSelfUriPermission.this.getAid();
                                        int i12 = AlternateContactlessPaymentDataJson;
                                        int i13 = (-2) - (~(((i12 | 8) << 1) - (i12 ^ 8)));
                                        values = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            return aid;
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4) objArr3[0];
                                        int i9 = values;
                                        int i10 = i9 & 111;
                                        int i11 = -(-((i9 ^ 111) | i10));
                                        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                                        AlternateContactlessPaymentDataJson = i12 % 128;
                                        com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission2 = com.payair.hce.enforceCallingOrSelfUriPermission.this;
                                        if (i12 % 2 != 0) {
                                            enforcecallingorselfuripermission2.getPaymentFci();
                                            throw null;
                                        }
                                        byte[] paymentFci = enforcecallingorselfuripermission2.getPaymentFci();
                                        int i13 = values & 121;
                                        AlternateContactlessPaymentDataJson = ((((r0 | 121) & (~i13)) - (~(-(-(i13 << 1))))) - 1) % 128;
                                        return paymentFci;
                                    }

                                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass4) objArr3[0];
                                        int i9 = values;
                                        int i10 = (((i9 | 4) << 1) - (i9 ^ 4)) - 1;
                                        AlternateContactlessPaymentDataJson = i10 % 128;
                                        com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission2 = com.payair.hce.enforceCallingOrSelfUriPermission.this;
                                        if (i10 % 2 == 0) {
                                            return enforcecallingorselfuripermission2.getCvrMaskAnd();
                                        }
                                        enforcecallingorselfuripermission2.getCvrMaskAnd();
                                        throw null;
                                    }

                                    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                    public final byte[] getCvrMaskAnd() {
                                        return (byte[]) values(new java.lang.Object[]{this}, 1878092041, -1878092038, java.lang.System.identityHashCode(this));
                                    }

                                    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                    public final byte[] getCiacDecline() {
                                        return (byte[]) values(new java.lang.Object[]{this}, -1126429400, 1126429401, java.lang.System.identityHashCode(this));
                                    }

                                    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                    public final byte[] getGpoResponse() {
                                        return (byte[]) values(new java.lang.Object[]{this}, -432747419, 432747421, java.lang.System.identityHashCode(this));
                                    }

                                    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                    public final byte[] getPaymentFci() {
                                        return (byte[]) values(new java.lang.Object[]{this}, -1625555658, 1625555658, java.lang.System.identityHashCode(this));
                                    }

                                    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                    public final byte[] getAid() {
                                        return (byte[]) values(new java.lang.Object[]{this}, -652675214, 652675218, java.lang.System.identityHashCode(this));
                                    }
                                };
                                getGpoResponse = (getCvrMaskAnd + 93) % 128;
                                return enforcecallingorselfuripermission;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final com.payair.hce.checkCallingOrSelfUriPermissions[] getRecords() {
                                com.payair.hce.checkCallingOrSelfUriPermissions[] records;
                                int length;
                                com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr;
                                int i8;
                                int i9 = getCvrMaskAnd + 33;
                                getGpoResponse = i9 % 128;
                                int i10 = 0;
                                if (i9 % 2 == 0) {
                                    records = com.payair.hce.checkCallingUriPermission.this.getRecords();
                                    com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr2 = new com.payair.hce.checkCallingOrSelfUriPermissions[records.length];
                                    length = records.length;
                                    checkcallingorselfuripermissionsArr = checkcallingorselfuripermissionsArr2;
                                    i8 = 0;
                                } else {
                                    records = com.payair.hce.checkCallingUriPermission.this.getRecords();
                                    com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr3 = new com.payair.hce.checkCallingOrSelfUriPermissions[records.length];
                                    length = records.length;
                                    checkcallingorselfuripermissionsArr = checkcallingorselfuripermissionsArr3;
                                    i8 = 0;
                                    i10 = 1;
                                }
                                while (i10 < length) {
                                    final com.payair.hce.checkCallingOrSelfUriPermissions checkcallingorselfuripermissions = records[i10];
                                    checkcallingorselfuripermissionsArr[i8] = new com.payair.hce.checkCallingOrSelfUriPermissions() { // from class: com.payair.hce.createDeviceProtectedStorageContext.9
                                        private static int DigitizedCardProfile = 1;
                                        private static int valueOf;

                                        public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3, int i11, int i12, int i13) {
                                            int i14 = ~i11;
                                            int i15 = ~i12;
                                            int i16 = ~(i11 | i12);
                                            int i17 = (i11 * (-721)) + (i12 * (-721)) + (((~i13) | (~(i14 | i15)) | i16) * 1444) + (((~(i13 | i11)) | i16 | (~(i13 | i12))) * (-1444)) + (((~(i11 | i15)) | (~(i12 | i14))) * 722);
                                            if (i17 == 1) {
                                                return valueOf(objArr3);
                                            }
                                            if (i17 != 2) {
                                                return writeReplace(objArr3);
                                            }
                                            com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9) objArr3[0];
                                            valueOf = (DigitizedCardProfile + 85) % 128;
                                            byte[] recordValue = com.payair.hce.checkCallingOrSelfUriPermissions.this.getRecordValue();
                                            int i18 = valueOf;
                                            int i19 = i18 & 11;
                                            DigitizedCardProfile = ((i19 - (~((i18 ^ 11) | i19))) - 1) % 128;
                                            return recordValue;
                                        }

                                        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                            com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9) objArr3[0];
                                            DigitizedCardProfile = (valueOf + 121) % 128;
                                            byte recordNumber = com.payair.hce.checkCallingOrSelfUriPermissions.this.getRecordNumber();
                                            int i11 = DigitizedCardProfile;
                                            int i12 = i11 & 115;
                                            int i13 = i12 + ((i11 ^ 115) | i12);
                                            valueOf = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                return java.lang.Byte.valueOf(recordNumber);
                                            }
                                            throw null;
                                        }

                                        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                            com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass9) objArr3[0];
                                            int i11 = DigitizedCardProfile;
                                            int i12 = (i11 ^ 61) + ((i11 & 61) << 1);
                                            valueOf = i12 % 128;
                                            com.payair.hce.checkCallingOrSelfUriPermissions checkcallingorselfuripermissions2 = com.payair.hce.checkCallingOrSelfUriPermissions.this;
                                            if (i12 % 2 == 0) {
                                                return java.lang.Byte.valueOf(checkcallingorselfuripermissions2.getSfi());
                                            }
                                            checkcallingorselfuripermissions2.getSfi();
                                            throw null;
                                        }

                                        @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                        public final byte[] getRecordValue() {
                                            return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1794737549, -1794737547, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                        public final byte getSfi() {
                                            return ((java.lang.Byte) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1246924662, 1246924662, java.lang.System.identityHashCode(this))).byteValue();
                                        }

                                        @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                        public final byte getRecordNumber() {
                                            return ((java.lang.Byte) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1836089911, 1836089912, java.lang.System.identityHashCode(this))).byteValue();
                                        }
                                    };
                                    i8++;
                                    i10++;
                                    getGpoResponse = (getCvrMaskAnd + 23) % 128;
                                }
                                return checkcallingorselfuripermissionsArr;
                            }

                            static {
                                init$1();
                                $10 = 0;
                                $11 = 1;
                                init$0();
                                getGpoResponse = 0;
                                getCvrMaskAnd = 1;
                                values = -1338801774;
                                DigitizedCardProfile = 520368548;
                                valueOf = -1929877780;
                                AlternateContactlessPaymentDataJson = new byte[]{-89, 84, -84, 89, -89, -66, 66, 84, -84, 92, -94, -88, -69, 118, -91, 84, -89, 84, -84, 89, -89, -66, 66, 84, -84, 92, -94, -88, -69, -120, 107, 87, -24, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, 91, 93, -93, 82, -113, 78, 84, -84, 92, -94, -88, -69, -120, 107, 87, -24, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, -92, 89, 87, -85, -71, 89, -83, 84, 92, 89, 87, -85, -71, 89, -83, 84, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -113, 107, 87, -24, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, -85, -92, 84, 84, -81, -86, -86, -86, -86, -86, -86, -86, -86};
                                IccPrivateKeyCrtComponentsJson = (char) 3126;
                                getAid = (char) 2295;
                                RecordsJson = (char) 31619;
                                SdkCoreAlternateContactlessPaymentDataImpl = (char) 9855;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:195:0x0a23 A[Catch: all -> 0x07bf, TRY_LEAVE, TryCatch #23 {all -> 0x07bf, blocks: (B:121:0x060d, B:126:0x0619, B:128:0x061f, B:129:0x0620, B:137:0x0624, B:139:0x0629, B:147:0x06e9, B:151:0x06f2, B:153:0x06f8, B:154:0x06f9, B:157:0x06fe, B:165:0x07a1, B:169:0x07aa, B:171:0x07b0, B:172:0x07b1, B:183:0x08f2, B:190:0x0910, B:191:0x0925, B:193:0x0986, B:195:0x0a23, B:253:0x0928, B:254:0x093f, B:301:0x07b3, B:303:0x07bb, B:304:0x07bc, B:160:0x0717, B:162:0x0749, B:163:0x0793, B:142:0x0642, B:144:0x068e, B:145:0x06db, B:101:0x0448, B:103:0x046c, B:104:0x04c4), top: B:100:0x0448, inners: #5, #11, #13 }] */
                            /* JADX WARN: Type inference failed for: r12v34, types: [int] */
                            /* JADX WARN: Type inference failed for: r12v35 */
                            /* JADX WARN: Type inference failed for: r12v39 */
                            /* JADX WARN: Type inference failed for: r1v134, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v159, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v183, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v216, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v240, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v265, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v56, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v83, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r22v17, types: [int] */
                            /* JADX WARN: Type inference failed for: r2v164, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r4v17 */
                            /* JADX WARN: Type inference failed for: r4v18 */
                            /* JADX WARN: Type inference failed for: r4v19 */
                            /* JADX WARN: Type inference failed for: r4v20 */
                            /* JADX WARN: Type inference failed for: r4v21 */
                            /* JADX WARN: Type inference failed for: r4v23, types: [int] */
                            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Integer, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r4v33 */
                            /* JADX WARN: Type inference failed for: r4v4 */
                            /* JADX WARN: Type inference failed for: r4v5 */
                            /* JADX WARN: Type inference failed for: r6v16 */
                            /* JADX WARN: Type inference failed for: r7v10 */
                            /* JADX WARN: Type inference failed for: r7v11 */
                            /* JADX WARN: Type inference failed for: r7v18 */
                            /* JADX WARN: Type inference failed for: r7v2 */
                            /* JADX WARN: Type inference failed for: r7v3 */
                            /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r7v38 */
                            /* JADX WARN: Type inference failed for: r7v41, types: [int[]] */
                            /* JADX WARN: Type inference failed for: r7v5 */
                            /* JADX WARN: Type inference failed for: r7v59 */
                            /* JADX WARN: Type inference failed for: r7v6, types: [int] */
                            /* JADX WARN: Type inference failed for: r7v60 */
                            /* JADX WARN: Type inference failed for: r7v7 */
                            /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r7v85 */
                            /* JADX WARN: Type inference failed for: r7v86 */
                            /* JADX WARN: Type inference failed for: r7v9 */
                            /* JADX WARN: Type inference failed for: r8v115 */
                            /* JADX WARN: Type inference failed for: r8v116 */
                            /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
                            /* JADX WARN: Type inference failed for: r8v2 */
                            /* JADX WARN: Type inference failed for: r8v21 */
                            /* JADX WARN: Type inference failed for: r8v3 */
                            /* JADX WARN: Type inference failed for: r8v32 */
                            /* JADX WARN: Type inference failed for: r8v52 */
                            /* JADX WARN: Type inference failed for: r8v57, types: [int[]] */
                            /* JADX WARN: Type inference failed for: r8v6 */
                            /* JADX WARN: Type inference failed for: r8v69, types: [int[]] */
                            /* JADX WARN: Type inference failed for: r8v7 */
                            /* JADX WARN: Type inference failed for: r8v9, types: [int] */
                            /* JADX WARN: Type inference failed for: r8v91, types: [java.nio.Buffer, java.nio.LongBuffer] */
                            /* JADX WARN: Type inference failed for: r8v92 */
                            /* JADX WARN: Type inference failed for: r8v94, types: [int] */
                            /* JADX WARN: Type inference failed for: r9v2, types: [java.nio.LongBuffer[]] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static java.lang.Object[] valueOf(android.content.Context context, java.lang.String[] strArr, int i8, int i9, int i10) {
                                ?? r7;
                                ?? r8;
                                int i11;
                                java.lang.String str;
                                java.lang.Object obj;
                                int i12;
                                int i13;
                                java.lang.Object obj2;
                                int i14;
                                java.lang.String str2;
                                int length;
                                int i15;
                                java.lang.Object obj3;
                                int currentTimeMillis;
                                int i16;
                                int i17;
                                java.lang.Object obj4;
                                ?? lastIndexOf;
                                java.lang.Integer num;
                                java.lang.String[] strArr2 = strArr;
                                int i18 = getGpoResponse;
                                getCvrMaskAnd = (i18 + 85) % 128;
                                int i19 = -1347122530;
                                java.lang.Integer num2 = 16;
                                int i20 = 0;
                                long j = 0;
                                int i21 = 1;
                                try {
                                    if (context == null) {
                                        java.lang.Object[] objArr3 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr3[0])[0] = i8;
                                        ((int[]) objArr3[1])[0] = i8;
                                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i10), 0, java.lang.Integer.valueOf((((((-774963739) | i8) * (-381)) + 269887650) + (((~((~i8) | 1103931749)) | (-1861298815)) * 381)) - 1091559246)};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj6 = obj5;
                                        if (obj5 == null) {
                                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                            byte b = (byte) (-$$a[14]);
                                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                                            a(b, b, (byte) (b - 1), objArr5);
                                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                                            obj6 = method;
                                        }
                                        ((int[]) objArr3[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr4)).intValue();
                                        return objArr3;
                                    }
                                    if (strArr2.length == 0) {
                                        getCvrMaskAnd = (i18 + 25) % 128;
                                        java.lang.Object[] objArr6 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr6[0])[0] = i8;
                                        ((int[]) objArr6[1])[0] = i8 ^ 4;
                                        int i22 = ~i8;
                                        java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i10), num2, java.lang.Integer.valueOf((((~((-1706608702) | i22)) | 17842177) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1113389184 + ((~((-17842178) | i8)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i22 | (-189883460))) | 172041282 | (~(i8 | (-1688766525)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj8 = obj7;
                                        if (obj7 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            byte b2 = (byte) (-$$a[14]);
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            a(b2, b2, (byte) (b2 - 1), objArr8);
                                            java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                            obj8 = method2;
                                        }
                                        ((int[]) objArr6[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr7)).intValue();
                                        return objArr6;
                                    }
                                    int length2 = strArr2.length;
                                    ?? r9 = new java.nio.LongBuffer[length2];
                                    int i23 = 0;
                                    java.lang.Integer num3 = 0;
                                    while (true) {
                                        java.lang.String str3 = "";
                                        if (i23 < strArr2.length) {
                                            java.lang.String lowerCase = strArr2[i23].toLowerCase();
                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(i20, i20, i20);
                                            lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            java.lang.Object[] objArr9 = new java.lang.Object[i21];
                                            b(1812179188 - resolveSizeAndState, 1355304903 - lastIndexOf, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i20) - 12, (byte) ((android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                                            java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr9[i20]).intern(), "");
                                            long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                                            java.lang.Integer num4 = num3;
                                            long longValue2 = new java.math.BigInteger(replaceAll.substring(i20, 16), 16).longValue();
                                            int length3 = replaceAll.length();
                                            if (length3 == 32) {
                                                num = num2;
                                                r9[i23] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                                            } else {
                                                if (length3 != 64) {
                                                    java.lang.Object[] objArr10 = {new int[1], new int[1], new int[1]};
                                                    ((int[]) objArr10[0])[0] = i8;
                                                    ((int[]) objArr10[1])[0] = i8 ^ 3;
                                                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i10), num2, java.lang.Integer.valueOf(((((-7340589) | r1) * 494) - 892473984) + (((~((~i8) | 1485821395)) | (-1089831807)) * 494))};
                                                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    java.lang.Object obj10 = obj9;
                                                    if (obj9 == null) {
                                                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                        byte b3 = (byte) (-$$a[14]);
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        a(b3, b3, (byte) (b3 - 1), objArr12);
                                                        java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                                        obj10 = method3;
                                                    }
                                                    ((int[]) objArr10[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr11)).intValue();
                                                    return objArr10;
                                                }
                                                num = num2;
                                                r9[i23] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                                            }
                                            i23++;
                                            strArr2 = strArr;
                                            num3 = num4;
                                            num2 = num;
                                            i20 = 0;
                                            j = 0;
                                            i21 = 1;
                                        } else {
                                            java.lang.Integer num5 = num2;
                                            java.lang.Integer num6 = num3;
                                            try {
                                            } catch (java.lang.Throwable unused) {
                                                r7 = -1347122530;
                                                r8 = "";
                                                i19 = i8;
                                            }
                                            if (context == null) {
                                                try {
                                                    java.lang.Object[] objArr13 = {new int[1], new int[1], new int[1]};
                                                    ((int[]) objArr13[0])[0] = i8;
                                                    ((int[]) objArr13[1])[0] = i8;
                                                    try {
                                                        java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i10), num6, java.lang.Integer.valueOf((((~((-17842307) | i8)) | (~(1878649854 | i8))) * 69) + 958530476 + (((~((-630219743) | i8)) | 612377436 | (~(1266272418 | i8))) * (-69)) + 242331808)};
                                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj11 != null) {
                                                            obj4 = obj11;
                                                        } else {
                                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.indexOf("", "") + 2713, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                                                            byte b4 = (byte) (-$$a[14]);
                                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                            a(b4, b4, (byte) (b4 - 1), objArr15);
                                                            java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method4);
                                                            obj4 = method4;
                                                        }
                                                        ((int[]) objArr13[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr14)).intValue();
                                                        return objArr13;
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable unused2) {
                                                    obj = -1347122530;
                                                    str = "";
                                                    i11 = 1;
                                                    i12 = i8;
                                                }
                                            } else {
                                                byte[][] bArr = new byte[length2][];
                                                int i24 = 0;
                                                r7 = 0;
                                                java.lang.Integer num7 = num3;
                                                java.lang.String str4 = lastIndexOf;
                                                while (i24 < length2) {
                                                    ?? r82 = r9[i24];
                                                    if (r82.capacity() == 4) {
                                                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                                                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                                                        long[] array = r82.array();
                                                        ?? length4 = array.length;
                                                        int i25 = 0;
                                                        str4 = str4;
                                                        while (i25 < length4) {
                                                            int i26 = getGpoResponse + 31;
                                                            java.lang.String str5 = length4;
                                                            getCvrMaskAnd = i26 % 128;
                                                            if (i26 % 2 == 0) {
                                                                asLongBuffer.put(array[i25]);
                                                                i25 += 97;
                                                            } else {
                                                                asLongBuffer.put(array[i25]);
                                                                i25++;
                                                            }
                                                            length4 = str5;
                                                            str4 = str5;
                                                        }
                                                        r82 = r7 + 1;
                                                        bArr[r7] = allocate.array();
                                                        r7 = r82;
                                                    }
                                                    i24++;
                                                    r7 = r7;
                                                    num7 = r82;
                                                    str4 = str4;
                                                }
                                                if (r7 > 0) {
                                                    getCvrMaskAnd = (getGpoResponse + 11) % 128;
                                                    try {
                                                        currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                                                        try {
                                                            try {
                                                                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i8 ^ currentTimeMillis), bArr, java.lang.Integer.valueOf((int) r7)};
                                                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                                                java.lang.Object obj13 = obj12;
                                                                if (obj12 == null) {
                                                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, android.graphics.Color.argb(0, 0, 0, 0) + 429, (char) (31611 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                                    byte b5 = $$a[14];
                                                                    byte b6 = (byte) (b5 + 1);
                                                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                                    a(b6, b6, (byte) (-b5), objArr17);
                                                                    java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, method5);
                                                                    obj13 = method5;
                                                                }
                                                                r7 = 0;
                                                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr16)).longValue();
                                                                long j2 = i8;
                                                                long j3 = ~j2;
                                                                i13 = length2;
                                                                long j4 = ((334 * longValue3) - 281419609763L) + (((~(j3 | (-847649429))) | (~(longValue3 | j2))) * 333) + (((~((-847649429) | j2)) | (~(j3 | longValue3))) * 333) + 86251279;
                                                                i19 = i8;
                                                                i16 = ~i19;
                                                                i17 = ((((int) j4) & ((((((~((-10634007) | i19)) | (~((-1447860417) | i19))) * 69) - 1411177198) + ((((~(2118957256 | i19)) | (-2129591263)) | (~(681730846 | i19))) * (-69))) - 938958296)) | (((int) (j4 >> 32)) & ((((((-4202625) | i19) * (-676)) + 354915986) + (((~((-851502294) | i16)) | 4202624) * 676)) + ((((~(2006238591 | i16)) | (-2010441216)) | (~((-847299670) | i19))) * 676)))) ^ currentTimeMillis;
                                                            } catch (java.lang.Throwable th2) {
                                                                java.lang.Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (java.lang.Throwable unused3) {
                                                        }
                                                    } catch (java.lang.Throwable unused4) {
                                                        r7 = -1347122530;
                                                        i19 = i8;
                                                    }
                                                    if ((i9 & 1) != 1 || (i17 ^ i19) != 15) {
                                                        r7 = -1347122530;
                                                        int i27 = i17 ^ i19;
                                                        if (i27 == 0) {
                                                            java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                                                            ((int[]) objArr18[0])[0] = i19;
                                                            ((int[]) objArr18[1])[0] = i17;
                                                            try {
                                                                java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i10), num6, java.lang.Integer.valueOf((((~((-168204488) | i19)) | (~(1728287673 | i16))) * (-1808)) + 330565104 + (((~((-33722498) | i19)) | (~(1862769663 | i16))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-1728287674) | i19)) | 134481990 | (~(i16 | 168204487))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                java.lang.Object obj15 = obj14;
                                                                if (obj14 == null) {
                                                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.graphics.Color.blue(0));
                                                                    byte b7 = (byte) (-$$a[14]);
                                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                                    a(b7, b7, (byte) (b7 - 1), objArr20);
                                                                    java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                                                    obj15 = method6;
                                                                }
                                                                ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr19)).intValue();
                                                                return objArr18;
                                                            } catch (java.lang.Throwable th3) {
                                                                java.lang.Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        }
                                                        i19 = i19;
                                                        r7 = -1347122530;
                                                        r8 = currentTimeMillis;
                                                        if (i27 == 11) {
                                                            java.lang.Object[] objArr21 = {new int[1], new int[1], new int[1]};
                                                            ((int[]) objArr21[0])[0] = i19;
                                                            ((int[]) objArr21[1])[0] = i17;
                                                            try {
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i10), num5, java.lang.Integer.valueOf((((~(1370997222 | i19)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 2137885132) + (((~(1370997222 | i16)) | 286408834) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                java.lang.Object obj17 = obj16;
                                                                if (obj16 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                                    byte b8 = (byte) (-$$a[14]);
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    a(b8, b8, (byte) (b8 - 1), objArr23);
                                                                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                                                    obj17 = method7;
                                                                }
                                                                ((int[]) objArr21[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            } catch (java.lang.Throwable th4) {
                                                                java.lang.Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        }
                                                        r8 = "";
                                                        i11 = 1;
                                                        i12 = i19;
                                                        obj = r7;
                                                        str = r8;
                                                        java.lang.Object[] objArr24 = {new int[i11], new int[i11], new int[i11]};
                                                        ((int[]) objArr24[0])[0] = i12;
                                                        ((int[]) objArr24[i11])[0] = i12 ^ 2;
                                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i10), num5, java.lang.Integer.valueOf(((((~((-1741422346) | i12)) | 1861603966) * 398) - 824330966) + (((~((-1741422346) | (~i12))) | 1861603966) * 398))};
                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(obj);
                                                        java.lang.Object obj19 = obj18;
                                                        if (obj18 == null) {
                                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2712 - android.os.Process.getGidForName(str), (char) android.text.TextUtils.indexOf(str, str, 0));
                                                            byte b9 = (byte) (-$$a[14]);
                                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                            a(b9, b9, (byte) (b9 - 1), objArr26);
                                                            java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(obj, method8);
                                                            obj19 = method8;
                                                        }
                                                        ((int[]) objArr24[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr25)).intValue();
                                                        return objArr24;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr27 = {new int[1], new int[1], new int[1]};
                                                        ((int[]) objArr27[0])[0] = i19;
                                                        ((int[]) objArr27[1])[0] = i17;
                                                        try {
                                                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i10), num5, java.lang.Integer.valueOf((((~((-201853761) | i19)) | 48300088) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1123465896 + ((~((-201853761) | i16)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                                            try {
                                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                java.lang.Object obj21 = obj20;
                                                                if (obj20 == null) {
                                                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
                                                                    byte b10 = (byte) (-$$a[14]);
                                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                    a(b10, b10, (byte) (b10 - 1), objArr29);
                                                                    java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                                                    obj21 = method9;
                                                                }
                                                                ((int[]) objArr27[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr28)).intValue();
                                                                return objArr27;
                                                            } catch (java.lang.Throwable th5) {
                                                                th = th5;
                                                                java.lang.Throwable cause5 = th.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } catch (java.lang.Throwable unused5) {
                                                        r7 = -1347122530;
                                                    }
                                                } else {
                                                    i13 = length2;
                                                    r7 = -1347122530;
                                                    i19 = i8;
                                                    r8 = num7;
                                                }
                                                try {
                                                    try {
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        c("忂㉸笹\uec40ꉶᲔ\uef68碔Ṕꍥ嶴⚚\uf357\uef29幧竖꼑礰嶴⚚鶶ƈϮ蟄", android.graphics.Color.green(0) + 23, objArr30);
                                                        java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                                        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                        r8 = android.view.View.MeasureSpec.getMode(0);
                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                        b(normalizeMetaState + 1812179233, packedPositionType + 1355304904, 3 - r8, (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), objArr31);
                                                        java.lang.Object invoke = cls10.getMethod(((java.lang.String) objArr31[0]).intern(), null).invoke(context, null);
                                                        try {
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c("忂㉸笹\uec40ꉶᲔ\uef68碔Ṕꍥ嶴⚚\uf357\uef29幧竖꼑礰嶴⚚鶶ƈϮ蟄", 24 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr32);
                                                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                            r8 = new java.lang.Object[1];
                                                            c("ꥎ\ue5a7Ἣ팛휾붗⻈ꓢꥎ\ue5a7磆ᔳ屺珃", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 14, r8);
                                                            try {
                                                                java.lang.Object[] objArr33 = {cls11.getMethod(((java.lang.String) r8[0]).intern(), null).invoke(context, null), 64};
                                                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                                b((android.os.Process.myPid() >> 22) + 1812179227, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1355304920, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr34);
                                                                java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr34[0]).intern());
                                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                c("ꥎ\ue5a7Ἣ팛휾붗⻈ꓢꥎ\ue5a7뵠퍭ᡓ\udb4c", android.text.TextUtils.indexOf("", "", 0) + 14, objArr35);
                                                                r8 = 1;
                                                                java.lang.Object invoke2 = cls12.getMethod(((java.lang.String) objArr35[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr33);
                                                                int i28 = i13;
                                                                int i29 = 0;
                                                                java.nio.LongBuffer[] longBufferArr = r9;
                                                                java.lang.String str6 = str4;
                                                                while (i29 < i28) {
                                                                    java.nio.LongBuffer longBuffer = longBufferArr[i29];
                                                                    if (longBuffer.capacity() == 4) {
                                                                        int i30 = getCvrMaskAnd;
                                                                        int i31 = i30 + 37;
                                                                        getGpoResponse = i31 % 128;
                                                                        if (i31 % 2 == 0) {
                                                                            int i32 = i30 + 93;
                                                                            getGpoResponse = i32 % 128;
                                                                            if (i32 % 2 != 0) {
                                                                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                c("灌휵怯\ue9b4옼\uda95牑瑔", 115 << (android.view.ViewConfiguration.getKeyRepeatTimeout() * 77), objArr36);
                                                                                obj3 = objArr36[0];
                                                                            } else {
                                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                                c("灌휵怯\ue9b4옼\uda95牑瑔", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, objArr37);
                                                                                obj3 = objArr37[0];
                                                                            }
                                                                            str2 = (java.lang.String) obj3;
                                                                            i14 = 0;
                                                                            java.lang.String intern = str2.intern();
                                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                            b(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1812179228, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1355304954, 16 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)), (byte) (android.os.Process.myPid() >> 22), (short) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr38);
                                                                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                                                            int i33 = i28;
                                                                            java.nio.LongBuffer[] longBufferArr2 = longBufferArr;
                                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                            b(android.view.View.resolveSize(0, 0) + 1812179245, 1355304983 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-4) - android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr39);
                                                                            java.lang.Object[] objArr40 = (java.lang.Object[]) cls13.getField(((java.lang.String) objArr39[0]).intern()).get(invoke2);
                                                                            length = objArr40.length;
                                                                            i15 = 0;
                                                                            java.lang.String str7 = str6;
                                                                            while (i15 < length) {
                                                                                java.lang.Object obj22 = objArr40[i15];
                                                                                try {
                                                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                                    c("驗ᆩ⬞\uda64瓢淧탘焏㦸㺓ꤠⅅᥘ㩿ᡁ弰䰂觝冋羊ㆴ\ua63f\udce6퀗벓忊Ϯ蟄", android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, objArr41);
                                                                                    java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr41[0]).intern());
                                                                                    java.lang.Object obj23 = invoke2;
                                                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                                    c("ꥎ\ue5a7礌\u0cf4㌰ﵫ⮶⏧\uf89e╭朚璭", android.view.Gravity.getAbsoluteGravity(0, 0) + 11, objArr42);
                                                                                    java.lang.Object[] objArr43 = objArr40;
                                                                                    java.lang.Object invoke3 = cls14.getMethod(((java.lang.String) objArr42[0]).intern(), java.lang.String.class).invoke(null, intern);
                                                                                    try {
                                                                                        int i34 = length;
                                                                                        java.lang.String str8 = intern;
                                                                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                                        b(1812179227 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1355304993, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (short) android.view.KeyEvent.normalizeMetaState(0), objArr44);
                                                                                        java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                                                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                                        c("ྼ\ude43㑻與畮爞爻障聖\ue554遥糠", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11, objArr45);
                                                                                        java.lang.Object invoke4 = cls15.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(obj22, null);
                                                                                        getCvrMaskAnd = (getGpoResponse + 63) % 128;
                                                                                        try {
                                                                                            java.lang.Object[] objArr46 = {invoke4};
                                                                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                                            c("驗ᆩ⬞\uda64瓢淧탘焏㦸㺓ꤠⅅᥘ㩿ᡁ弰䰂觝冋羊ㆴ\ua63f\udce6퀗벓忊Ϯ蟄", android.text.TextUtils.getTrimmedLength(str3) + 27, objArr47);
                                                                                            java.lang.Class<?> cls16 = java.lang.Class.forName(((java.lang.String) objArr47[0]).intern());
                                                                                            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                            int gidForName = android.os.Process.getGidForName(str3);
                                                                                            str7 = str3;
                                                                                            try {
                                                                                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                                                                b(makeMeasureSpec + 1812179230, gidForName + 1355305020, (android.view.ViewConfiguration.getTapTimeout() >> 16) - 8, (byte) android.view.KeyEvent.getDeadChar(0, 0), (short) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr48);
                                                                                                try {
                                                                                                    if (java.nio.ByteBuffer.wrap((byte[]) cls16.getMethod(((java.lang.String) objArr48[0]).intern(), byte[].class).invoke(invoke3, objArr46)).asLongBuffer().equals(longBuffer.rewind())) {
                                                                                                        java.lang.Object[] objArr49 = {new int[1], new int[1], new int[1]};
                                                                                                        ((int[]) objArr49[0])[0] = i19 == true ? 1 : 0;
                                                                                                        ((int[]) objArr49[1])[0] = i19 == true ? 1 : 0;
                                                                                                        try {
                                                                                                            java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i10), num6, java.lang.Integer.valueOf(((((-1678778401) | r1) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1053101008) + (((~((~(i19 == true ? 1 : 0)) | 183469916)) | (-1828004473)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                                                                                                            java.lang.Object obj25 = obj24;
                                                                                                            if (obj24 == null) {
                                                                                                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                                                                                byte b11 = (byte) (-$$a[14]);
                                                                                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                                                                a(b11, b11, (byte) (b11 - 1), objArr51);
                                                                                                                java.lang.reflect.Method method10 = cls17.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, method10);
                                                                                                                obj25 = method10;
                                                                                                            }
                                                                                                            ((int[]) objArr49[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr50)).intValue();
                                                                                                            getGpoResponse = (getCvrMaskAnd + 1) % 128;
                                                                                                            return objArr49;
                                                                                                        } catch (java.lang.Throwable th7) {
                                                                                                            java.lang.Throwable cause6 = th7.getCause();
                                                                                                            if (cause6 != null) {
                                                                                                                throw cause6;
                                                                                                            }
                                                                                                            throw th7;
                                                                                                        }
                                                                                                    }
                                                                                                    i15++;
                                                                                                    invoke2 = obj23;
                                                                                                    objArr40 = objArr43;
                                                                                                    length = i34;
                                                                                                    str3 = str7;
                                                                                                    intern = str8;
                                                                                                    str7 = str7;
                                                                                                } catch (java.lang.Throwable unused6) {
                                                                                                    r8 = str7;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th8) {
                                                                                                th = th8;
                                                                                                java.lang.Throwable cause7 = th.getCause();
                                                                                                if (cause7 != null) {
                                                                                                    throw cause7;
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th9) {
                                                                                            th = th9;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th10) {
                                                                                        java.lang.Throwable cause8 = th10.getCause();
                                                                                        if (cause8 != null) {
                                                                                            throw cause8;
                                                                                        }
                                                                                        throw th10;
                                                                                    }
                                                                                } catch (java.lang.Throwable th11) {
                                                                                    java.lang.Throwable cause9 = th11.getCause();
                                                                                    if (cause9 != null) {
                                                                                        throw cause9;
                                                                                    }
                                                                                    throw th11;
                                                                                }
                                                                            }
                                                                            java.lang.String str9 = str3;
                                                                            i29++;
                                                                            i28 = i33;
                                                                            str3 = str9;
                                                                            longBufferArr = longBufferArr2;
                                                                            str6 = str9;
                                                                        }
                                                                    }
                                                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                    b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1812179207, 1355304951 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 11, (byte) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (short) ((-1) - android.view.MotionEvent.axisFromString(str3)), objArr52);
                                                                    i14 = 0;
                                                                    str2 = (java.lang.String) objArr52[0];
                                                                    java.lang.String intern2 = str2.intern();
                                                                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                                                                    b(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1812179228, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1355304954, 16 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)), (byte) (android.os.Process.myPid() >> 22), (short) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr382);
                                                                    java.lang.Class<?> cls132 = java.lang.Class.forName(((java.lang.String) objArr382[0]).intern());
                                                                    int i332 = i28;
                                                                    java.nio.LongBuffer[] longBufferArr22 = longBufferArr;
                                                                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                                                                    b(android.view.View.resolveSize(0, 0) + 1812179245, 1355304983 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-4) - android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr392);
                                                                    java.lang.Object[] objArr402 = (java.lang.Object[]) cls132.getField(((java.lang.String) objArr392[0]).intern()).get(invoke2);
                                                                    length = objArr402.length;
                                                                    i15 = 0;
                                                                    java.lang.String str72 = str6;
                                                                    while (i15 < length) {
                                                                    }
                                                                    java.lang.String str92 = str3;
                                                                    i29++;
                                                                    i28 = i332;
                                                                    str3 = str92;
                                                                    longBufferArr = longBufferArr22;
                                                                    str6 = str92;
                                                                }
                                                                java.lang.String str10 = str3;
                                                                java.lang.Object[] objArr53 = {new int[1], new int[1], new int[1]};
                                                                ((int[]) objArr53[0])[0] = i19 == true ? 1 : 0;
                                                                ((int[]) objArr53[1])[0] = ~i19 ? 1 : 0;
                                                                int i35 = ~(i19 == true ? 1 : 0);
                                                                int i36 = ~(631322956 | (i19 == true ? 1 : 0));
                                                                try {
                                                                    java.lang.Object[] objArr54 = {java.lang.Integer.valueOf(i10), num5, java.lang.Integer.valueOf((((~((-18886917) | i35)) | (~(1265169204 | (i19 == true ? 1 : 0)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 784059328 + (((~((-1265169205) | i35)) | i36) * (-1040)) + (((~(i35 | (-631322957))) | 1246282288 | i36) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                                                                    if (obj26 == null) {
                                                                        try {
                                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                                            byte b12 = (byte) (-$$a[14]);
                                                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                            a(b12, b12, (byte) (b12 - 1), objArr55);
                                                                            java.lang.reflect.Method method11 = cls18.getMethod((java.lang.String) objArr55[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, method11);
                                                                            obj2 = method11;
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            java.lang.Throwable cause10 = th.getCause();
                                                                            if (cause10 != null) {
                                                                                throw cause10;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        obj2 = obj26;
                                                                    }
                                                                    ((int[]) objArr53[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr54)).intValue();
                                                                    return objArr53;
                                                                } catch (java.lang.Throwable th13) {
                                                                    th = th13;
                                                                }
                                                            } catch (java.lang.Throwable th14) {
                                                                java.lang.Throwable cause11 = th14.getCause();
                                                                if (cause11 != null) {
                                                                    throw cause11;
                                                                }
                                                                throw th14;
                                                            }
                                                        } catch (java.lang.Throwable th15) {
                                                            java.lang.Throwable cause12 = th15.getCause();
                                                            if (cause12 != null) {
                                                                throw cause12;
                                                            }
                                                            throw th15;
                                                        }
                                                    } catch (java.lang.Throwable th16) {
                                                        java.lang.Throwable cause13 = th16.getCause();
                                                        if (cause13 != null) {
                                                            throw cause13;
                                                        }
                                                        throw th16;
                                                    }
                                                } catch (java.lang.Throwable unused7) {
                                                }
                                            }
                                        }
                                    }
                                } catch (java.lang.Throwable th17) {
                                    java.lang.Throwable cause14 = th17.getCause();
                                    if (cause14 != null) {
                                        throw cause14;
                                    }
                                    throw th17;
                                }
                            }

                            static void init$1() {
                                $$d = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117};
                                $$e = 44;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getCiacDecline() {
                                return (byte[]) values(new java.lang.Object[]{this}, -1294588590, 1294588591, java.lang.System.identityHashCode(this));
                            }

                            static void init$0() {
                                $$a = new byte[]{59, 86, -115, -69, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                                $$b = 85;
                            }

                            @Override // com.payair.hce.checkCallingUriPermission
                            public final byte[] getAid() {
                                return (byte[]) values(new java.lang.Object[]{this}, -261270741, 261270741, java.lang.System.identityHashCode(this));
                            }
                        };
                        int i8 = valueOf;
                        int i9 = (i8 ^ 99) + ((i8 & 99) << 1);
                        DigitizedCardProfile = i9 % 128;
                        if (i9 % 2 != 0) {
                            return checkcallinguripermission;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass5) objArr2[0];
                        int i8 = valueOf;
                        int i9 = (i8 & (-100)) | ((~i8) & 99);
                        int i10 = (i8 & 99) << 1;
                        DigitizedCardProfile = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                        final com.payair.hce.revokeSelfPermissionOnKill remotePaymentData = com.payair.hce.enforceUriPermission.this.getRemotePaymentData();
                        if (remotePaymentData == null) {
                            int i11 = valueOf;
                            DigitizedCardProfile = ((((i11 | 60) << 1) - (i11 ^ 60)) - 1) % 128;
                            int i12 = i11 & 17;
                            int i13 = (i11 | 17) & (~i12);
                            int i14 = i12 << 1;
                            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                            DigitizedCardProfile = i15 % 128;
                            if (i15 % 2 != 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill = new com.payair.hce.revokeSelfPermissionOnKill() { // from class: com.payair.hce.createDeviceProtectedStorageContext.7
                            private static int DigitizedCardProfile = 0;
                            private static int values = 1;

                            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3, int i16, int i17, int i18) {
                                int i19 = ~i17;
                                int i20 = ~i18;
                                switch ((i16 * 866) + (i17 * (-864)) + (((~((~i16) | i20)) | i19) * (-865)) + ((~(i18 | i16)) * 865) + (((~(i16 | i20)) | (~(i19 | i20))) * 865)) {
                                    case 1:
                                        return values(objArr3);
                                    case 2:
                                        return DigitizedCardProfile(objArr3);
                                    case 3:
                                        return AlternateContactlessPaymentDataJson(objArr3);
                                    case 4:
                                        return writeReplace(objArr3);
                                    case 5:
                                        return IccPrivateKeyCrtComponentsJson(objArr3);
                                    case 6:
                                        return getAid(objArr3);
                                    case 7:
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                        values = ((-2) - (~(DigitizedCardProfile + 6))) % 128;
                                        byte[] panSequenceNumber = com.payair.hce.revokeSelfPermissionOnKill.this.getPanSequenceNumber();
                                        int i21 = values;
                                        int i22 = i21 & 49;
                                        int i23 = (i21 | 49) & (~i22);
                                        int i24 = -(-(i22 << 1));
                                        DigitizedCardProfile = ((i23 ^ i24) + ((i23 & i24) << 1)) % 128;
                                        return panSequenceNumber;
                                    default:
                                        return valueOf(objArr3);
                                }
                            }

                            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = values;
                                int i17 = (i16 | 107) << 1;
                                int i18 = -(i16 ^ 107);
                                DigitizedCardProfile = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                                byte[] pan = com.payair.hce.revokeSelfPermissionOnKill.this.getPan();
                                int i19 = DigitizedCardProfile + 105;
                                values = i19 % 128;
                                if (i19 % 2 != 0) {
                                    return pan;
                                }
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = values + 97;
                                DigitizedCardProfile = i16 % 128;
                                com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill2 = com.payair.hce.revokeSelfPermissionOnKill.this;
                                if (i16 % 2 == 0) {
                                    return revokeselfpermissiononkill2.getApplicationExpiryDate();
                                }
                                revokeselfpermissiononkill2.getApplicationExpiryDate();
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = DigitizedCardProfile;
                                int i17 = ((i16 ^ 78) + ((i16 & 78) << 1)) - 1;
                                values = i17 % 128;
                                com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill2 = com.payair.hce.revokeSelfPermissionOnKill.this;
                                if (i17 % 2 == 0) {
                                    revokeselfpermissiononkill2.getAip();
                                    throw null;
                                }
                                byte[] aip = revokeselfpermissiononkill2.getAip();
                                int i18 = DigitizedCardProfile;
                                int i19 = (((i18 & (-96)) | ((~i18) & 95)) - (~((i18 & 95) << 1))) - 1;
                                values = i19 % 128;
                                if (i19 % 2 != 0) {
                                    return aip;
                                }
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = DigitizedCardProfile;
                                int i17 = i16 ^ 5;
                                int i18 = (i16 & 5) << 1;
                                int i19 = (i17 & i18) + (i18 | i17);
                                values = i19 % 128;
                                com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill2 = com.payair.hce.revokeSelfPermissionOnKill.this;
                                if (i19 % 2 == 0) {
                                    revokeselfpermissiononkill2.getCiacDecline();
                                    throw null;
                                }
                                byte[] ciacDecline = revokeselfpermissiononkill2.getCiacDecline();
                                int i20 = values & 29;
                                DigitizedCardProfile = (((((r0 ^ 29) | i20) << 1) - (~(-((r0 | 29) & (~i20))))) - 1) % 128;
                                return ciacDecline;
                            }

                            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                values = (DigitizedCardProfile + 39) % 128;
                                byte[] cvrMaskAnd = com.payair.hce.revokeSelfPermissionOnKill.this.getCvrMaskAnd();
                                int i16 = values;
                                int i17 = (i16 & (-92)) | ((~i16) & 91);
                                int i18 = -(-((i16 & 91) << 1));
                                int i19 = (i17 & i18) + (i18 | i17);
                                DigitizedCardProfile = i19 % 128;
                                if (i19 % 2 == 0) {
                                    return cvrMaskAnd;
                                }
                                throw new java.lang.ArithmeticException();
                            }

                            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = DigitizedCardProfile;
                                int i17 = (i16 & 61) + (i16 | 61);
                                values = i17 % 128;
                                byte[] issuerApplicationData = com.payair.hce.revokeSelfPermissionOnKill.this.getIssuerApplicationData();
                                if (i17 % 2 == 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                int i18 = values;
                                int i19 = i18 & 25;
                                int i20 = ((i18 ^ 25) | i19) << 1;
                                int i21 = -((i18 | 25) & (~i19));
                                DigitizedCardProfile = ((i20 & i21) + (i21 | i20)) % 128;
                                return issuerApplicationData;
                            }

                            private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass7) objArr3[0];
                                int i16 = DigitizedCardProfile;
                                int i17 = (i16 & 15) + (i16 | 15);
                                values = i17 % 128;
                                com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill2 = com.payair.hce.revokeSelfPermissionOnKill.this;
                                if (i17 % 2 == 0) {
                                    revokeselfpermissiononkill2.getTrack2Equivalent();
                                    throw null;
                                }
                                byte[] track2Equivalent = revokeselfpermissiononkill2.getTrack2Equivalent();
                                int i18 = DigitizedCardProfile;
                                int i19 = i18 & 3;
                                int i20 = (i18 ^ 3) | i19;
                                values = (((i19 | i20) << 1) - (i20 ^ i19)) % 128;
                                return track2Equivalent;
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getTrack2Equivalent() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -381809658, 381809664, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getIssuerApplicationData() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 235649432, -235649432, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getCvrMaskAnd() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1900788383, -1900788379, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getCiacDecline() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -428260321, 428260323, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getAip() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1155933601, 1155933602, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getApplicationExpiryDate() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -2118389757, 2118389762, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getPanSequenceNumber() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -906397523, 906397530, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.revokeSelfPermissionOnKill
                            public final byte[] getPan() {
                                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1732943321, -1732943318, java.lang.System.identityHashCode(this));
                            }
                        };
                        int i16 = DigitizedCardProfile;
                        int i17 = ((i16 ^ 19) | (i16 & 19)) << 1;
                        int i18 = -((i16 & (-20)) | ((~i16) & 19));
                        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                        valueOf = i19 % 128;
                        if (i19 % 2 == 0) {
                            return revokeselfpermissiononkill;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.revokeSelfPermissionOnKill getRemotePaymentData() {
                        return (com.payair.hce.revokeSelfPermissionOnKill) DigitizedCardProfile(new java.lang.Object[]{this}, 1201857171, -1201857171, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.checkCallingUriPermission getContactlessPaymentData() {
                        return (com.payair.hce.checkCallingUriPermission) DigitizedCardProfile(new java.lang.Object[]{this}, 1256847646, -1256847645, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.checkCallingUriPermissions getCardRiskManagementData() {
                        return (com.payair.hce.checkCallingUriPermissions) DigitizedCardProfile(new java.lang.Object[]{this}, 89530829, -89530827, java.lang.System.identityHashCode(this));
                    }
                };
                int i8 = AlternateContactlessPaymentDataJson;
                int i9 = ((i8 ^ 49) | (i8 & 49)) << 1;
                int i10 = -((i8 & (-50)) | ((~i8) & 49));
                valueOf = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                return enforceuripermission;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass2) objArr[0];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = (i & 93) + (i | 93);
                valueOf = i2 % 128;
                com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl sdkCoreDigitizedCardProfileImpl2 = com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.this;
                if (i2 % 2 != 0) {
                    return sdkCoreDigitizedCardProfileImpl2.getDigitizedCardId();
                }
                sdkCoreDigitizedCardProfileImpl2.getDigitizedCardId();
                throw null;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass2) objArr[0];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = (i | 83) << 1;
                int i3 = -((i & (-84)) | ((~i) & 83));
                int i4 = (i2 & i3) + (i3 | i2);
                valueOf = i4 % 128;
                com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl sdkCoreDigitizedCardProfileImpl2 = com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.this;
                if (i4 % 2 != 0) {
                    return java.lang.Integer.valueOf(sdkCoreDigitizedCardProfileImpl2.getMaximumPinTry());
                }
                sdkCoreDigitizedCardProfileImpl2.getMaximumPinTry();
                throw null;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                final com.payair.hce.checkUriPermission businessLogicModule = com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.this.getBusinessLogicModule();
                com.payair.hce.checkUriPermission checkuripermission = new com.payair.hce.checkUriPermission() { // from class: com.payair.hce.createDeviceProtectedStorageContext.6
                    private static int AlternateContactlessPaymentDataJson = 0;
                    private static int valueOf = 1;

                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        int i4 = ~i;
                        int i5 = ~i3;
                        int i6 = ~((~i2) | i);
                        switch ((i * 55) + (i2 * (-107)) + (((~(i2 | i5)) | (~(i4 | i2))) * (-108)) + (((~(i | i5)) | (~(i4 | i3)) | i6) * 54) + ((i3 | i6) * 54)) {
                            case 1:
                                int cvmResetTimeout = com.payair.hce.checkUriPermission.this.getCvmResetTimeout();
                                int i7 = valueOf;
                                AlternateContactlessPaymentDataJson = (((i7 | 93) << 1) - (i7 ^ 93)) % 128;
                                return java.lang.Integer.valueOf(cvmResetTimeout);
                            case 2:
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6) objArr2[0];
                                int i8 = valueOf + 18;
                                AlternateContactlessPaymentDataJson = ((~i8) + (i8 << 1)) % 128;
                                byte[] cardLayoutDescription = com.payair.hce.checkUriPermission.this.getCardLayoutDescription();
                                int i9 = AlternateContactlessPaymentDataJson;
                                valueOf = (((i9 | 59) << 1) - (i9 ^ 59)) % 128;
                                return cardLayoutDescription;
                            case 3:
                                com.payair.hce.enforceCallingUriPermission enforcecallinguripermission = new com.payair.hce.enforceCallingUriPermission() { // from class: com.payair.hce.createDeviceProtectedStorageContext.6.5
                                    private static int AlternateContactlessPaymentDataJson = 1;
                                    private static int writeReplace;

                                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3, int i10, int i11, int i12) {
                                        int i13 = ~i11;
                                        int i14 = ~i12;
                                        switch ((i10 * 46) + (i11 * 46) + (((~(i13 | i14)) | i10) * (-90)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~((~i10) | i12)) | i13 | (~(i10 | i14))) * 45)) {
                                            case 1:
                                                return DigitizedCardProfile(objArr3);
                                            case 2:
                                                return writeReplace(objArr3);
                                            case 3:
                                                return AlternateContactlessPaymentDataJson(objArr3);
                                            case 4:
                                                return values(objArr3);
                                            case 5:
                                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                                int i15 = AlternateContactlessPaymentDataJson;
                                                int i16 = i15 & 47;
                                                int i17 = ((i15 ^ 47) | i16) << 1;
                                                int i18 = -((i15 | 47) & (~i16));
                                                writeReplace = ((i17 & i18) + (i18 | i17)) % 128;
                                                boolean pinAlwaysRequiredIfCurrencyNotProvided = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions().getPinAlwaysRequiredIfCurrencyNotProvided();
                                                int i19 = writeReplace;
                                                int i20 = i19 ^ 41;
                                                int i21 = (i19 & 41) << 1;
                                                AlternateContactlessPaymentDataJson = ((i20 ^ i21) + ((i21 & i20) << 1)) % 128;
                                                return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyNotProvided);
                                            case 6:
                                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass52 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                                int i22 = writeReplace;
                                                AlternateContactlessPaymentDataJson = (((i22 & (-72)) | ((~i22) & 71)) + ((i22 & 71) << 1)) % 128;
                                                boolean pinAlwaysRequiredIfCurrencyProvided = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions().getPinAlwaysRequiredIfCurrencyProvided();
                                                int i23 = AlternateContactlessPaymentDataJson;
                                                writeReplace = ((i23 & 121) + (i23 | 121)) % 128;
                                                return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyProvided);
                                            case 7:
                                                return valueOf(objArr3);
                                            default:
                                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass53 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                                int i24 = writeReplace;
                                                int i25 = i24 & 65;
                                                AlternateContactlessPaymentDataJson = (((i24 | 65) & (~i25)) + (i25 << 1)) % 128;
                                                boolean ackAlwaysRequiredIfCurrencyProvided = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions().getAckAlwaysRequiredIfCurrencyProvided();
                                                int i26 = AlternateContactlessPaymentDataJson;
                                                int i27 = i26 & 125;
                                                writeReplace = (((i26 | 125) & (~i27)) + (i27 << 1)) % 128;
                                                return java.lang.Boolean.valueOf(ackAlwaysRequiredIfCurrencyProvided);
                                        }
                                    }

                                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                        int i10 = writeReplace;
                                        AlternateContactlessPaymentDataJson = ((i10 & 57) + (i10 | 57)) % 128;
                                        boolean ackAlwaysRequiredIfCurrencyNotProvided = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions().getAckAlwaysRequiredIfCurrencyNotProvided();
                                        int i11 = writeReplace;
                                        int i12 = (i11 & (-12)) | ((~i11) & 11);
                                        int i13 = (i11 & 11) << 1;
                                        int i14 = (i12 & i13) + (i13 | i12);
                                        AlternateContactlessPaymentDataJson = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(ackAlwaysRequiredIfCurrencyNotProvided);
                                        }
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                        int i10 = writeReplace;
                                        int i11 = (i10 ^ 73) + ((i10 & 73) << 1);
                                        AlternateContactlessPaymentDataJson = i11 % 128;
                                        com.payair.hce.enforceCallingUriPermission magstripeCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions();
                                        if (i11 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(magstripeCvmIssuerOptions.getAckAutomaticallyResetByApplication());
                                        }
                                        magstripeCvmIssuerOptions.getAckAutomaticallyResetByApplication();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                        int i10 = writeReplace;
                                        int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
                                        AlternateContactlessPaymentDataJson = i11 % 128;
                                        com.payair.hce.enforceCallingUriPermission magstripeCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions();
                                        if (i11 % 2 != 0) {
                                            boolean ackPreEntryAllowed = magstripeCvmIssuerOptions.getAckPreEntryAllowed();
                                            int i12 = writeReplace;
                                            int i13 = i12 ^ 85;
                                            int i14 = -(-((i12 & 85) << 1));
                                            int i15 = (i13 & i14) + (i14 | i13);
                                            AlternateContactlessPaymentDataJson = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                return java.lang.Boolean.valueOf(ackPreEntryAllowed);
                                            }
                                            throw new java.lang.ArithmeticException();
                                        }
                                        magstripeCvmIssuerOptions.getAckPreEntryAllowed();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                        AlternateContactlessPaymentDataJson = (writeReplace + 21) % 128;
                                        boolean pinAutomaticallyResetByApplication = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions().getPinAutomaticallyResetByApplication();
                                        int i10 = writeReplace;
                                        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
                                        AlternateContactlessPaymentDataJson = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(pinAutomaticallyResetByApplication);
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass5) objArr3[0];
                                        int i10 = AlternateContactlessPaymentDataJson;
                                        int i11 = (i10 & 93) + (i10 | 93);
                                        writeReplace = i11 % 128;
                                        com.payair.hce.enforceCallingUriPermission magstripeCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMagstripeCvmIssuerOptions();
                                        if (i11 % 2 == 0) {
                                            return java.lang.Boolean.valueOf(magstripeCvmIssuerOptions.getPinPreEntryAllowed());
                                        }
                                        magstripeCvmIssuerOptions.getPinPreEntryAllowed();
                                        throw null;
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinPreEntryAllowed() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1127517005, -1127517002, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 719225209, -719225205, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1880901730, -1880901724, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1599913998, -1599913993, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckPreEntryAllowed() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1731407411, -1731407404, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 332128899, -332128898, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 741737556, -741737554, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 8080783, -8080783, java.lang.System.identityHashCode(this))).booleanValue();
                                    }
                                };
                                int i10 = valueOf;
                                AlternateContactlessPaymentDataJson = (((i10 | 33) << 1) - (i10 ^ 33)) % 128;
                                return enforcecallinguripermission;
                            case 4:
                                com.payair.hce.createPackageContext createpackagecontext = new com.payair.hce.createPackageContext() { // from class: com.payair.hce.createDeviceProtectedStorageContext.6.2
                                    private static int AlternateContactlessPaymentDataJson = 0;
                                    private static int valueOf = 1;

                                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3, int i11, int i12, int i13) {
                                        int i14 = ~i11;
                                        switch ((i11 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) + (i12 * (-271)) + (((~((~i12) | i14 | (~i13))) | (~(i11 | i12 | i13))) * (-272)) + (((~(i14 | i12)) | (~(i14 | i13))) * (-272)) + (((~(i11 | i13)) | i12) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)) {
                                            case 1:
                                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                                int i15 = AlternateContactlessPaymentDataJson;
                                                int i16 = i15 ^ 41;
                                                int i17 = (i15 & 41) << 1;
                                                valueOf = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                                                boolean ackAlwaysRequiredIfCurrencyProvided = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions().getAckAlwaysRequiredIfCurrencyProvided();
                                                int i18 = AlternateContactlessPaymentDataJson;
                                                int i19 = i18 ^ 93;
                                                int i20 = ((i18 & 93) | i19) << 1;
                                                int i21 = -i19;
                                                valueOf = (((i20 | i21) << 1) - (i20 ^ i21)) % 128;
                                                return java.lang.Boolean.valueOf(ackAlwaysRequiredIfCurrencyProvided);
                                            case 2:
                                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass22 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                                AlternateContactlessPaymentDataJson = (valueOf + 75) % 128;
                                                boolean ackAutomaticallyResetByApplication = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions().getAckAutomaticallyResetByApplication();
                                                int i22 = AlternateContactlessPaymentDataJson;
                                                valueOf = ((i22 & 53) + (i22 | 53)) % 128;
                                                return java.lang.Boolean.valueOf(ackAutomaticallyResetByApplication);
                                            case 3:
                                                return valueOf(objArr3);
                                            case 4:
                                                return AlternateContactlessPaymentDataJson(objArr3);
                                            case 5:
                                                return writeReplace(objArr3);
                                            case 6:
                                                return values(objArr3);
                                            case 7:
                                                return RecordsJson(objArr3);
                                            default:
                                                return DigitizedCardProfile(objArr3);
                                        }
                                    }

                                    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = valueOf;
                                        int i12 = ((i11 ^ 3) | (i11 & 3)) << 1;
                                        int i13 = -((i11 & (-4)) | ((~i11) & 3));
                                        int i14 = (i12 & i13) + (i13 | i12);
                                        AlternateContactlessPaymentDataJson = i14 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i14 % 2 == 0) {
                                            boolean pinPreEntryAllowed = mchipCvmIssuerOptions.getPinPreEntryAllowed();
                                            int i15 = valueOf;
                                            int i16 = ((i15 | 55) << 1) - (i15 ^ 55);
                                            AlternateContactlessPaymentDataJson = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                return java.lang.Boolean.valueOf(pinPreEntryAllowed);
                                            }
                                            throw new java.lang.ArithmeticException();
                                        }
                                        mchipCvmIssuerOptions.getPinPreEntryAllowed();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = valueOf + 19;
                                        AlternateContactlessPaymentDataJson = i11 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i11 % 2 == 0) {
                                            return java.lang.Boolean.valueOf(mchipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided());
                                        }
                                        mchipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = AlternateContactlessPaymentDataJson;
                                        int i12 = ((i11 ^ 29) | (i11 & 29)) << 1;
                                        int i13 = -((i11 & (-30)) | ((~i11) & 29));
                                        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                                        valueOf = i14 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i14 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(mchipCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided());
                                        }
                                        mchipCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = valueOf;
                                        int i12 = i11 ^ 73;
                                        int i13 = ((i11 & 73) | i12) << 1;
                                        int i14 = -i12;
                                        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                                        AlternateContactlessPaymentDataJson = i15 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i15 % 2 == 0) {
                                            return java.lang.Boolean.valueOf(mchipCvmIssuerOptions.getAckPreEntryAllowed());
                                        }
                                        mchipCvmIssuerOptions.getAckPreEntryAllowed();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = valueOf;
                                        int i12 = (i11 & (-124)) | ((~i11) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                        int i13 = -(-((i11 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1));
                                        int i14 = (i12 & i13) + (i13 | i12);
                                        AlternateContactlessPaymentDataJson = i14 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i14 % 2 == 0) {
                                            boolean pinAutomaticallyResetByApplication = mchipCvmIssuerOptions.getPinAutomaticallyResetByApplication();
                                            int i15 = valueOf;
                                            int i16 = i15 & 23;
                                            int i17 = (i15 | 23) & (~i16);
                                            int i18 = -(-(i16 << 1));
                                            AlternateContactlessPaymentDataJson = ((i17 & i18) + (i17 | i18)) % 128;
                                            return java.lang.Boolean.valueOf(pinAutomaticallyResetByApplication);
                                        }
                                        mchipCvmIssuerOptions.getPinAutomaticallyResetByApplication();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6.AnonymousClass2) objArr3[0];
                                        int i11 = valueOf;
                                        int i12 = ((i11 | 71) << 1) - ((i11 & (-72)) | ((~i11) & 71));
                                        AlternateContactlessPaymentDataJson = i12 % 128;
                                        com.payair.hce.createPackageContext mchipCvmIssuerOptions = com.payair.hce.checkUriPermission.this.getMchipCvmIssuerOptions();
                                        if (i12 % 2 == 0) {
                                            boolean pinAlwaysRequiredIfCurrencyProvided = mchipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyProvided();
                                            int i13 = AlternateContactlessPaymentDataJson;
                                            valueOf = ((((i13 | 106) << 1) - (i13 ^ 106)) - 1) % 128;
                                            return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyProvided);
                                        }
                                        mchipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyProvided();
                                        throw null;
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getPinAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1450120503, -1450120497, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getPinAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1494654753, -1494654748, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getAckAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -1141018441, 1141018443, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getAckPreEntryAllowed() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 84275664, -84275660, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1384849499, -1384849496, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -1322180139, 1322180139, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getPinPreEntryAllowed() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1749441891, -1749441884, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.createPackageContext
                                    public final boolean getAckAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1679070893, -1679070892, java.lang.System.identityHashCode(this))).booleanValue();
                                    }
                                };
                                int i11 = AlternateContactlessPaymentDataJson;
                                int i12 = i11 & 3;
                                valueOf = (i12 + ((i11 ^ 3) | i12)) % 128;
                                return createpackagecontext;
                            case 5:
                                return valueOf(objArr2);
                            case 6:
                                return DigitizedCardProfile(objArr2);
                            case 7:
                                return AlternateContactlessPaymentDataJson(objArr2);
                            default:
                                com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6 anonymousClass62 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6) objArr2[0];
                                int i13 = valueOf;
                                AlternateContactlessPaymentDataJson = (((i13 & 32) + (i13 | 32)) - 1) % 128;
                                int dualTapResetTimeout = com.payair.hce.checkUriPermission.this.getDualTapResetTimeout();
                                int i14 = valueOf;
                                int i15 = i14 & 27;
                                AlternateContactlessPaymentDataJson = (((i14 | 27) & (~i15)) + (i15 << 1)) % 128;
                                return java.lang.Integer.valueOf(dualTapResetTimeout);
                        }
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6) objArr2[0];
                        int i = valueOf;
                        int i2 = ((i ^ 45) | (i & 45)) << 1;
                        int i3 = -((i & (-46)) | ((~i) & 45));
                        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                        AlternateContactlessPaymentDataJson = i4 % 128;
                        byte[] applicationLifeCycleData = com.payair.hce.checkUriPermission.this.getApplicationLifeCycleData();
                        if (i4 % 2 == 0) {
                            return applicationLifeCycleData;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6) objArr2[0];
                        int i = AlternateContactlessPaymentDataJson + 74;
                        valueOf = ((~i) + (i << 1)) % 128;
                        byte[] securityWord = com.payair.hce.checkUriPermission.this.getSecurityWord();
                        int i2 = valueOf;
                        int i3 = (i2 & 83) + (i2 | 83);
                        AlternateContactlessPaymentDataJson = i3 % 128;
                        if (i3 % 2 == 0) {
                            return securityWord;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceProtectedStorageContext.AnonymousClass6) objArr2[0];
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = ((i & (-36)) | ((~i) & 35)) + ((i & 35) << 1);
                        valueOf = i2 % 128;
                        com.payair.hce.checkUriPermission checkuripermission2 = com.payair.hce.checkUriPermission.this;
                        if (i2 % 2 == 0) {
                            checkuripermission2.getCardholderValidators();
                            throw null;
                        }
                        java.lang.String[] cardholderValidators = checkuripermission2.getCardholderValidators();
                        int i3 = AlternateContactlessPaymentDataJson;
                        valueOf = (((i3 | 99) << 1) - (i3 ^ 99)) % 128;
                        return cardholderValidators;
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final com.payair.hce.enforceCallingUriPermission getMagstripeCvmIssuerOptions() {
                        return (com.payair.hce.enforceCallingUriPermission) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -443121121, 443121124, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final com.payair.hce.createPackageContext getMchipCvmIssuerOptions() {
                        return (com.payair.hce.createPackageContext) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1265587636, -1265587632, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final java.lang.String[] getCardholderValidators() {
                        return (java.lang.String[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2061805721, 2061805727, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getSecurityWord() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -415336391, 415336396, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getCardLayoutDescription() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -267001389, 267001391, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getApplicationLifeCycleData() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1457740767, -1457740760, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final int getDualTapResetTimeout() {
                        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 66261916, -66261916, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final int getCvmResetTimeout() {
                        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1923311541, -1923311540, java.lang.System.identityHashCode(this))).intValue();
                    }
                };
                int i = AlternateContactlessPaymentDataJson;
                int i2 = ((i & 4) + (i | 4)) - 1;
                valueOf = i2 % 128;
                if (i2 % 2 != 0) {
                    return checkuripermission;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.createContextForSplit
            public final com.payair.hce.enforceUriPermission getMppLiteModule() {
                return (com.payair.hce.enforceUriPermission) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1878889048, 1878889050, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.createContextForSplit
            public final com.payair.hce.checkUriPermission getBusinessLogicModule() {
                return (com.payair.hce.checkUriPermission) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1126392154, -1126392154, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.createContextForSplit
            public final int getMaximumPinTry() {
                return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1718810408, 1718810409, java.lang.System.identityHashCode(this))).intValue();
            }

            @Override // com.payair.hce.createContextForSplit
            public final java.lang.String getDigitizedCardId() {
                return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 810969723, -810969720, java.lang.System.identityHashCode(this));
            }
        };
        int i = getAid + 101;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return createcontextforsplit;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        $10 = (i2 + 83) % 128;
        if (str != null) {
            $10 = (i2 + 97) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        $10 = ($11 + 121) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 81) % 128;
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63, 1335 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 61, 1334 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((byte) 0, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53, 3543 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3, 0, i);
        int i7 = $11 + 77;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    public createDeviceProtectedStorageContext(com.payair.hce.access400 access400Var, com.payair.hce.access300 access300Var) {
        this.values = access400Var;
        this.AlternateContactlessPaymentDataJson = access300Var;
    }

    public final com.payair.hce.transactionCanBeResumed DigitizedCardProfile(com.payair.hce.getTokenPan gettokenpan) throws com.payair.hce.setAlternateContactlessPaymentData {
        getAid = (IccPrivateKeyCrtComponentsJson + 111) % 128;
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.writeReplace().AlternateContactlessPaymentDataJson();
        com.payair.hce.transactionCanBeResumed valueOf2 = this.AlternateContactlessPaymentDataJson.getAid().valueOf();
        com.payair.hce.transactionCanBeResumed values = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson().values();
        if (AlternateContactlessPaymentDataJson.DigitizedCardProfile() != 2) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("♋㢱䁙趑丑☐ࠨ\ueacbᑽ镙븎㐂꒴ⲙﲮꝸ‗\ue4bf\ud957ᘄ螗譸겟蛏䜆ᨱ꿡ෑ\ue43b兙겟蛏\ud957ᘄ\uef5e寫峥ჱ䊓\ueafe蒯\u086d┘囸磎\ue77aⓓ䯻螗譸ݿ\ue7af㹰䫜", android.text.TextUtils.indexOf("", "", 0, 0) + 54, objArr);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
            sb.append(AlternateContactlessPaymentDataJson.DigitizedCardProfile());
            throw new com.payair.hce.setAlternateContactlessPaymentData(sb.toString());
        }
        if (valueOf2.DigitizedCardProfile() != 2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("♋㢱䁙趑丑☐ࠨ\ueacbᑽ镙븎㐂叾䢵쮗\uec55毜ﱀⳍ櫴ᑽ镙븎㐂䬏䘂ﳲ冷ﲮꝸ⦊ᗕ\ud957ᘄ\uef5e寫峥ჱ䊓\ueafe蒯\u086d┘囸磎\ue77aⓓ䯻螗譸ݿ\ue7af㹰䫜", 53 - android.view.MotionEvent.axisFromString(""), objArr2);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
            sb2.append(valueOf2.DigitizedCardProfile());
            throw new com.payair.hce.setAlternateContactlessPaymentData(sb2.toString());
        }
        if (values.DigitizedCardProfile() != 6) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("ઈԃ嘶ꋎ繌\ue7ecଖ쩉愘硵丑☐ࠨ\ueacbᑽ镙硃扼ꀯ㠺\uf1ae噠≲淆勞룿\udf9e㰉쿔ɳ쬅ᵐ\uf539\u0012琰逳ⳍ櫴ᘔﲓⳔ蘓렼\uf5a1큽ㄖ凪羶", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, objArr3);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(((java.lang.String) objArr3[0]).intern());
            sb3.append(values.DigitizedCardProfile());
            throw new com.payair.hce.setAlternateContactlessPaymentData(sb3.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (gettokenpan == com.payair.hce.getTokenPan.values) {
            getAid = (IccPrivateKeyCrtComponentsJson + 15) % 128;
            arrayList.add(((com.payair.hce.provisionFromLocalStorage) this.values.valueOf(com.payair.hce.provisionFromLocalStorage.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readIccEncryptionKey) this.values.valueOf(com.payair.hce.readIccEncryptionKey.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.getDigitizedCardProfile) this.values.valueOf(com.payair.hce.getDigitizedCardProfile.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.getCmsDFormattedDigitizedCardProfile) this.values.valueOf(com.payair.hce.getCmsDFormattedDigitizedCardProfile.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readContactlessImk) this.values.valueOf(com.payair.hce.readContactlessImk.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readIdnImk) this.values.valueOf(com.payair.hce.readIdnImk.class)).SdkCoreAlternateContactlessPaymentDataImpl());
            com.payair.hce.access400 access400Var = this.values;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b(0, (byte) 0, (byte) 0, objArr4);
            arrayList.add(access400Var.valueOf(java.lang.Class.forName((java.lang.String) objArr4[0])).SdkCoreAlternateContactlessPaymentDataImpl());
        } else {
            arrayList.add(((com.payair.hce.provisionFromLocalStorage) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.provisionFromLocalStorage.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readIccEncryptionKey) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.readIccEncryptionKey.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.getDigitizedCardProfile) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.getDigitizedCardProfile.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.getCmsDFormattedDigitizedCardProfile) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.getCmsDFormattedDigitizedCardProfile.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readContactlessImk) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.readContactlessImk.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            arrayList.add(((com.payair.hce.readIdnImk) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile((java.lang.Class<?>) com.payair.hce.readIdnImk.class).valueOf()).SdkCoreAlternateContactlessPaymentDataImpl());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, (byte) 0, (byte) 0, objArr5);
            arrayList.add(com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile(java.lang.Class.forName((java.lang.String) objArr5[0])).valueOf().SdkCoreAlternateContactlessPaymentDataImpl());
            getAid = (IccPrivateKeyCrtComponentsJson + 49) % 128;
        }
        arrayList.add(((com.payair.hce.deviceAuthenticationCompleted) this.values.valueOf(com.payair.hce.deviceAuthenticationCompleted.class)).SdkCoreAlternateContactlessPaymentDataImpl());
        arrayList.add(AlternateContactlessPaymentDataJson);
        arrayList.add(valueOf2);
        arrayList.add(values);
        com.payair.hce.transactionCanBeResumed valueOf3 = com.payair.hce.onRequestSessionCompleted.valueOf(arrayList);
        if (valueOf3.DigitizedCardProfile() == 39) {
            int i = IccPrivateKeyCrtComponentsJson + 97;
            getAid = i % 128;
            if (i % 2 != 0) {
                return valueOf3;
            }
            throw new java.lang.ArithmeticException();
        }
        valueOf3.values();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a("꒴ⲙ䊓\ueafe\udcd6\uf89aⓓ䯻ﲮꝸ\u0af3㌒⛇奯\ued67듃ᣵ芪綤\udad8㤥\ud817꒴ⲙ䛱\ue84bႻ윽䖨舺Ⳕ蘓렼\uf5a1큽ㄖ凪羶", android.text.TextUtils.getTrimmedLength("") + 37, objArr6);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(((java.lang.String) objArr6[0]).intern());
        sb4.append(valueOf3.DigitizedCardProfile());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a("╱ߚ\udfae瓦쮑븲ⳍ櫴\ud970혃㹰䫜募ӂ", 15 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
        sb4.append(((java.lang.String) objArr7[0]).intern());
        throw new com.payair.hce.setAlternateContactlessPaymentData(sb4.toString());
    }

    public static com.payair.hce.setCiacDeclineOnPpms AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, byte[] bArr, byte[] bArr2) throws com.payair.hce.setAlternateContactlessPaymentData {
        IccPrivateKeyCrtComponentsJson = (getAid + 99) % 128;
        com.payair.hce.setCiacDeclineOnPpms AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(transactioncanberesumed.valueOf(), bArr, bArr2);
        getAid = (IccPrivateKeyCrtComponentsJson + 61) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    private static com.payair.hce.setCiacDeclineOnPpms AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, byte[] bArr3) throws com.payair.hce.setAlternateContactlessPaymentData {
        int i = (IccPrivateKeyCrtComponentsJson + 29) % 128;
        getAid = i;
        if (bArr != null) {
            int i2 = (i + 87) % 128;
            IccPrivateKeyCrtComponentsJson = i2;
            if (bArr2 != null) {
                getAid = (i2 + 29) % 128;
                if (bArr3 != null) {
                    if (bArr.length != 18) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a("㗥ਇ䁵ꬋଖ쩉\uf60e✸㝯쬠⳯쳜\udd02ᢩ⫨ꔪᒢ뀔䖲釼ࠨ\ueacb纲┶峥ჱ\u0af3㌒쑁ẽ낶\udd46䜆ᨱ꿡ෑ\ue43b兙겟蛏\ud957ᘄ\uef5e寫峥ჱ䊓\ueafe蒯\u086d┘囸磎\ue77aⓓ䯻螗譸ݿ\ue7af㹰䫜", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 62, objArr);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
                        sb.append(bArr.length);
                        throw new com.payair.hce.setAlternateContactlessPaymentData(sb.toString());
                    }
                    if (bArr2.length != 6) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a("ઈԃ嘶ꋎ繌\ue7ecଖ쩉愘硵丑☐ࠨ\ueacbᑽ镙븎㐂룧㯛䁵ꬋ蝶⇁勞룿\udf9e㰉쿔ɳ쬅ᵐ\uf539\u0012琰逳ⳍ櫴ᘔﲓⳔ蘓렼\uf5a1큽ㄖ凪羶", 47 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
                        sb2.append(bArr2.length);
                        throw new com.payair.hce.setAlternateContactlessPaymentData(sb2.toString());
                    }
                    com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr);
                    try {
                        AlternateContactlessPaymentDataJson.valueOf(0, bArr, 0, 18);
                        AlternateContactlessPaymentDataJson.valueOf(2, bArr2);
                        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{0, 0, 0, 0, 0, 0, 0, -1});
                        AlternateContactlessPaymentDataJson2.valueOf(1, bArr3, 0, 5);
                        AlternateContactlessPaymentDataJson.valueOf(10, AlternateContactlessPaymentDataJson2.valueOf(), 0, AlternateContactlessPaymentDataJson2.DigitizedCardProfile());
                        return new com.payair.hce.setCiacDeclineOnPpms(AlternateContactlessPaymentDataJson);
                    } catch (com.payair.hce.postToastMessageOnUi e) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a("㗥ਇ䁵ꬋଖ쩉\uf60e✸㝯쬠⳯쳜\udd02ᢩ⫨ꔪᒢ뀔䖲釼ࠨ\ueacb纲┶䊓\ueafe\udcd6\uf89aᒢ뀔Ⳕ蘓≲淆勞룿\uf887\u0bc4겟蛏峥ჱ䊓\ueafe蒯\u086d┘囸磎\ue77aⓓ䯻螗譸ݿ\ue7af㹰䫜", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57, objArr3);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(((java.lang.String) objArr3[0]).intern());
                        sb3.append(e.getMessage());
                        throw new com.payair.hce.setAlternateContactlessPaymentData(sb3.toString());
                    }
                }
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("㗥ਇ䁵ꬋଖ쩉\uf60e✸㝯쬠⳯쳜\udd02ᢩ⫨ꔪᒢ뀔䖲釼ࠨ\ueacb纲┶峥ჱ䛱\ue84b磎\ue77a쵝㝻쿔ɳ껗\ufbca좵췟\ue6ea彴䤛㕙㦺灩纑者壁ਹ", 47 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        throw new com.payair.hce.setAlternateContactlessPaymentData(((java.lang.String) objArr4[0]).intern());
    }

    static void init$1() {
        $$d = new byte[]{9, com.visa.cbp.getEncExpo.IResultReceiver2, -92, com.visa.cbp.getEncExpo.IResultReceiver2};
        $$e = 58;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        DigitizedCardProfile = (char) 56493;
        writeReplace = (char) 31384;
        valueOf = (char) 21008;
        getProfileVersion = (char) 23186;
    }

    static void init$0() {
        $$a = new byte[]{108, -62, 108, 66, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, 4, -3, 14, -11, -11, -9, 16};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }
}
