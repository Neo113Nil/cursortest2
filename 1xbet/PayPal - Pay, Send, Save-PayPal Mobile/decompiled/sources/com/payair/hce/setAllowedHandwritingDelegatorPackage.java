package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class setAllowedHandwritingDelegatorPackage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static android.os.Bundle AlternateContactlessPaymentDataJson;
    private static com.payair.hce.setAllowedHandwritingDelegatorPackage DigitizedCardProfile;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static com.payair.hce.setSystemGestureExclusionRects RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static com.payair.hce.reInitialize getAid;
    private static long getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static final /* synthetic */ com.payair.hce.setAllowedHandwritingDelegatorPackage[] getProfileVersion;
    private static com.payair.hce.setHovered valueOf;
    private static com.payair.hce.setPreferKeepClear values;
    private static com.payair.hce.setTheme writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 4 - (b * 2);
        int i3 = 119 - (s * 2);
        int i4 = b2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            int i7 = i2;
            int i8 = (-i2) + i5;
            int i9 = i7 + 1;
            i = i6;
            i3 = i8;
            i2 = i9;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3;
            i7 = i2;
            i2 = bArr[i2];
            i6 = i + 1;
            i5 = i10;
            int i82 = (-i2) + i5;
            int i92 = i7 + 1;
            i = i6;
            i3 = i82;
            i2 = i92;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    private setAllowedHandwritingDelegatorPackage(java.lang.String str) {
    }

    private static /* synthetic */ com.payair.hce.setAllowedHandwritingDelegatorPackage[] getPpseFci() {
        int i = (getCvrMaskAnd + 105) % 128;
        getGpoResponse = i;
        com.payair.hce.setAllowedHandwritingDelegatorPackage[] setallowedhandwritingdelegatorpackageArr = {DigitizedCardProfile};
        getCvrMaskAnd = (i + 63) % 128;
        return setallowedhandwritingdelegatorpackageArr;
    }

    public static com.payair.hce.setAllowedHandwritingDelegatorPackage valueOf(java.lang.String str) {
        getGpoResponse = (getCvrMaskAnd + 67) % 128;
        com.payair.hce.setAllowedHandwritingDelegatorPackage setallowedhandwritingdelegatorpackage = (com.payair.hce.setAllowedHandwritingDelegatorPackage) java.lang.Enum.valueOf(com.payair.hce.setAllowedHandwritingDelegatorPackage.class, str);
        getCvrMaskAnd = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return setallowedhandwritingdelegatorpackage;
    }

    public static com.payair.hce.setAllowedHandwritingDelegatorPackage[] values() {
        int i = getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setAllowedHandwritingDelegatorPackage[] setallowedhandwritingdelegatorpackageArr = (com.payair.hce.setAllowedHandwritingDelegatorPackage[]) getProfileVersion.clone();
        int i2 = getGpoResponse + 9;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return setallowedhandwritingdelegatorpackageArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        getCardholderValidators();
        DigitizedCardProfile = new com.payair.hce.setAllowedHandwritingDelegatorPackage("INSTANCE");
        getProfileVersion = getPpseFci();
        com.payair.hce.setStatusCode setstatuscode = com.payair.hce.setStatusCode.AlternateContactlessPaymentDataJson;
        new java.util.ArrayList();
        getAid = com.payair.hce.reInitialize.DigitizedCardProfile;
        IccPrivateKeyCrtComponentsJson = false;
        getCvrMaskAnd = (getGpoResponse + 53) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 17;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(getCiacDecline ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCiacDecline)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1921, (char) android.view.View.MeasureSpec.getMode(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 429, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr5);
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
        java.lang.String str2 = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
        $10 = ($11 + 109) % 128;
        objArr[0] = str2;
    }

    static void DigitizedCardProfile(com.payair.hce.setTheme settheme) {
        int i = (getCvrMaskAnd + 95) % 128;
        getGpoResponse = i;
        writeReplace = settheme;
        getCvrMaskAnd = (i + 73) % 128;
    }

    static com.payair.hce.setTheme DigitizedCardProfile() {
        int i = getCvrMaskAnd + 3;
        getGpoResponse = i % 128;
        com.payair.hce.setTheme settheme = writeReplace;
        if (i % 2 == 0) {
            return settheme;
        }
        throw new java.lang.ArithmeticException();
    }

    static void AlternateContactlessPaymentDataJson(com.payair.hce.setHovered sethovered) {
        int i = getCvrMaskAnd;
        getGpoResponse = (i + 57) % 128;
        valueOf = sethovered;
        int i2 = i + 11;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static com.payair.hce.setHovered writeReplace() {
        int i = getGpoResponse + 21;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setHovered sethovered = valueOf;
        int i3 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getGpoResponse = i3 % 128;
        if (i3 % 2 == 0) {
            return sethovered;
        }
        throw new java.lang.ArithmeticException();
    }

    static void valueOf() {
        int i = getCvrMaskAnd + 21;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (r1.equals(((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{r2}, -667563269, 667563273, java.lang.System.identityHashCode(r2))).AlternateContactlessPaymentDataJson()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.payair.hce.setSystemGestureExclusionRects AlternateContactlessPaymentDataJson() {
        getGpoResponse = (getCvrMaskAnd + 91) % 128;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = values;
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, 1132877524, -1132877522, java.lang.System.identityHashCode(setpreferkeepclear));
        if (sendrequest != null) {
            getGpoResponse = (getCvrMaskAnd + 47) % 128;
            if (RecordsJson != null) {
                java.lang.String AlternateContactlessPaymentDataJson2 = sendrequest.AlternateContactlessPaymentDataJson();
                com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = RecordsJson;
            }
            java.lang.String str = new java.lang.String(sendrequest.DigitizedCardProfile().AlternateContactlessPaymentDataJson());
            RecordsJson = new com.payair.hce.setSystemGestureExclusionRects(sendrequest, com.payair.hce.setPreferKeepClearRects.AlternateContactlessPaymentDataJson(str), com.payair.hce.setPreferKeepClearRects.valueOf(str));
        } else {
            com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects2 = RecordsJson;
            if (setsystemgestureexclusionrects2 != null) {
                getGpoResponse = (getCvrMaskAnd + 117) % 128;
                if (!((java.lang.Boolean) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects2}, 167972064, -167972055, java.lang.System.identityHashCode(setsystemgestureexclusionrects2))).booleanValue()) {
                    int i = getGpoResponse + 89;
                    getCvrMaskAnd = i % 128;
                    if (i % 2 == 0) {
                        RecordsJson = null;
                        throw null;
                    }
                    RecordsJson = null;
                }
            }
        }
        return RecordsJson;
    }

    static void IccPrivateKeyCrtComponentsJson() {
        getCvrMaskAnd = (getGpoResponse + 97) % 128;
    }

    static void valueOf(com.payair.hce.reInitialize reinitialize) {
        int i = (getGpoResponse + 61) % 128;
        getCvrMaskAnd = i;
        getAid = reinitialize;
        int i2 = i + 95;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static com.payair.hce.reInitialize getAid() {
        int i = getGpoResponse;
        int i2 = i + 33;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.reInitialize reinitialize = getAid;
        int i3 = i + 105;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            return reinitialize;
        }
        throw new java.lang.ArithmeticException();
    }

    static void DigitizedCardProfile(com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects) {
        RecordsJson = setsystemgestureexclusionrects;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = values;
        if (setpreferkeepclear != null) {
            int i = (getCvrMaskAnd + 69) % 128;
            getGpoResponse = i;
            if (setsystemgestureexclusionrects != null) {
                getCvrMaskAnd = (i + 43) % 128;
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, (com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))}, -1936581216, 1936581224, java.lang.System.identityHashCode(setpreferkeepclear));
            } else {
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -1936581216, 1936581224, java.lang.System.identityHashCode(setpreferkeepclear));
                getCvrMaskAnd = (getGpoResponse + 27) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.util.ArrayList<com.payair.hce.setSystemGestureExclusionRects> RecordsJson() {
        java.util.List<com.payair.hce.sendRequest> AlternateContactlessPaymentDataJson2;
        com.payair.hce.setTheme settheme = writeReplace;
        if (settheme != null) {
            try {
                AlternateContactlessPaymentDataJson2 = settheme.writeReplace().AlternateContactlessPaymentDataJson();
            } catch (com.payair.hce.setSuccessful | java.lang.Exception unused) {
            }
            java.util.ArrayList<com.payair.hce.setSystemGestureExclusionRects> arrayList = new java.util.ArrayList<>();
            if (AlternateContactlessPaymentDataJson2 != null) {
                for (com.payair.hce.sendRequest sendrequest : AlternateContactlessPaymentDataJson2) {
                    if (sendrequest.DigitizedCardProfile() != null) {
                        int i = getGpoResponse + 35;
                        getCvrMaskAnd = i % 128;
                        if (i % 2 != 0) {
                            byte[] AlternateContactlessPaymentDataJson3 = sendrequest.DigitizedCardProfile().AlternateContactlessPaymentDataJson();
                            if (AlternateContactlessPaymentDataJson3 != null) {
                                java.lang.String str = new java.lang.String(AlternateContactlessPaymentDataJson3);
                                com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = new com.payair.hce.setSystemGestureExclusionRects(sendrequest, com.payair.hce.setPreferKeepClearRects.AlternateContactlessPaymentDataJson(str), com.payair.hce.setPreferKeepClearRects.valueOf(str));
                                arrayList.add(setsystemgestureexclusionrects);
                                if (((java.lang.Integer) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1819026444, 1819026450, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).intValue() == -1) {
                                    int intValue = ((java.lang.Integer) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1848767035, 1848767068, (int) java.lang.System.currentTimeMillis())).intValue();
                                    com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects, java.lang.Integer.valueOf(intValue)}, 1954860045, -1954860043, intValue);
                                    final com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = new com.payair.hce.setPreferKeepClearRects(setsystemgestureexclusionrects.valueOf(), com.payair.hce.setPreferKeepClearRects.valueOf(str));
                                    sendrequest.valueOf(new com.payair.hce.getNetworkTokenReference() { // from class: com.payair.hce.setAllowedHandwritingDelegatorPackage.1
                                        private static int DigitizedCardProfile = 0;
                                        private static int valueOf = 1;

                                        public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i2, int i3, int i4) {
                                            int i5 = ~((~i2) | i3);
                                            int i6 = ~i3;
                                            int i7 = ~(i2 | i6);
                                            if ((i2 * (-523)) + (i3 * 263) + ((i5 | i7 | (~(i6 | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i7 * (-786)) + (((~((~i4) | i6)) | i5 | i7) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) == 1) {
                                                return valueOf(objArr);
                                            }
                                            com.payair.hce.setAllowedHandwritingDelegatorPackage.AnonymousClass1 anonymousClass1 = (com.payair.hce.setAllowedHandwritingDelegatorPackage.AnonymousClass1) objArr[0];
                                            int i8 = DigitizedCardProfile;
                                            int i9 = i8 & 71;
                                            int i10 = (i8 | 71) & (~i9);
                                            int i11 = -(-(i9 << 1));
                                            valueOf = ((i10 & i11) + (i10 | i11)) % 128;
                                            com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects2 = com.payair.hce.setPreferKeepClearRects.this;
                                            byte[] bytes = ((java.lang.String) com.payair.hce.setPreferKeepClearRects.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclearrects2}, 408851357, -408851356, java.lang.System.identityHashCode(setpreferkeepclearrects2))).getBytes();
                                            int i12 = valueOf;
                                            DigitizedCardProfile = ((i12 ^ 13) + ((i12 & 13) << 1)) % 128;
                                            return bytes;
                                        }

                                        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                                            int i2 = DigitizedCardProfile;
                                            int i3 = (i2 ^ 82) + ((i2 & 82) << 1);
                                            int i4 = (~i3) + (i3 << 1);
                                            valueOf = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                throw new java.lang.ArithmeticException();
                                            }
                                            int i5 = i2 + 15;
                                            valueOf = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                return com.caverock.androidsvg.BuildConfig.VERSION_NAME;
                                            }
                                            throw null;
                                        }

                                        @Override // com.payair.hce.getNetworkTokenReference
                                        public final byte[] AlternateContactlessPaymentDataJson() {
                                            return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1489855452, 1489855452, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.getNetworkTokenReference
                                        public final java.lang.String DigitizedCardProfile() {
                                            return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1616241773, -1616241772, java.lang.System.identityHashCode(this));
                                        }
                                    });
                                }
                            }
                        } else {
                            sendrequest.DigitizedCardProfile().AlternateContactlessPaymentDataJson();
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    getCvrMaskAnd = (getGpoResponse + 119) % 128;
                }
                com.payair.hce.setSystemGestureExclusionRects magstripeCvmIssuerOptions = getMagstripeCvmIssuerOptions();
                if (magstripeCvmIssuerOptions != null) {
                    getGpoResponse = (getCvrMaskAnd + 33) % 128;
                    arrayList.add(magstripeCvmIssuerOptions);
                }
                java.util.Collections.sort(arrayList);
            }
            getCvrMaskAnd = (getGpoResponse + 9) % 128;
            return arrayList;
        }
        AlternateContactlessPaymentDataJson2 = null;
        java.util.ArrayList<com.payair.hce.setSystemGestureExclusionRects> arrayList2 = new java.util.ArrayList<>();
        if (AlternateContactlessPaymentDataJson2 != null) {
        }
        getCvrMaskAnd = (getGpoResponse + 9) % 128;
        return arrayList2;
    }

    static void values(int i) {
        getCvrMaskAnd = (getGpoResponse + 97) % 128;
        com.payair.hce.setLeft.values(new java.lang.Object[]{"cardPosition", java.lang.Integer.valueOf(i), ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0)}, 987195454, -987195452, i);
        int i2 = getGpoResponse + 7;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static int SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getGpoResponse + 15;
        getCvrMaskAnd = i % 128;
        return ((java.lang.Integer) (i % 2 == 0 ? com.payair.hce.setLeft.values(new java.lang.Object[]{"cardPosition", -1, ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0)}, 654732084, -654732078, -1) : com.payair.hce.setLeft.values(new java.lang.Object[]{"cardPosition", -1, ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0)}, 654732084, -654732078, -1))).intValue();
    }

    static java.lang.String getProfileVersion() {
        getCvrMaskAnd = (getGpoResponse + 105) % 128;
        java.lang.String str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"pan", "", ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0)}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        getGpoResponse = (getCvrMaskAnd + 109) % 128;
        return str;
    }

    private static com.payair.hce.setSystemGestureExclusionRects getMagstripeCvmIssuerOptions() {
        getGpoResponse = (getCvrMaskAnd + 105) % 128;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0);
        java.lang.String str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"pan", null, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        if (str == null) {
            return null;
        }
        if (!((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"request_sent", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            getCvrMaskAnd = (getGpoResponse + 117) % 128;
            return null;
        }
        return new com.payair.hce.setSystemGestureExclusionRects(str, (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"month", null, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, null, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"cardPath", null, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()), ((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"contactlessMode", 0, sharedPreferences}, 654732084, -654732078, 0)).intValue(), ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"remoteEnabled", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue(), ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"usMaestroEnabled", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue(), ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"onlinePinEnabled", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue(), ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"tokenizationEnabled", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue(), ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"activationRequired", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue(), ((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"cardPosition", -1, sharedPreferences}, 654732084, -654732078, -1)).intValue());
    }

    static void getCiacDecline() {
        int i = getGpoResponse + 45;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        if (i % 2 != 0) {
            com.payair.hce.setTheme settheme = writeReplace;
            if (settheme != null) {
                int i3 = i2 + 93;
                getGpoResponse = i3 % 128;
                if (i3 % 2 == 0) {
                    settheme.DigitizedCardProfile();
                } else {
                    settheme.DigitizedCardProfile();
                    throw null;
                }
            }
            valueOf((byte[]) null);
            DigitizedCardProfile((byte[]) null);
            DigitizedCardProfile((com.payair.hce.accessperformEnroll) null);
            com.payair.hce.setPreferKeepClear setpreferkeepclear = values;
            if (setpreferkeepclear != null) {
                getCvrMaskAnd = (getGpoResponse + 19) % 128;
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
                com.payair.hce.setPreferKeepClear setpreferkeepclear2 = values;
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear2}, 1935693604, -1935693597, java.lang.System.identityHashCode(setpreferkeepclear2));
                com.payair.hce.setPreferKeepClear setpreferkeepclear3 = values;
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear3, null}, -1936581216, 1936581224, java.lang.System.identityHashCode(setpreferkeepclear3));
            }
            AlternateContactlessPaymentDataJson(false);
            DigitizedCardProfile((com.payair.hce.setSystemGestureExclusionRects) null);
            z_(null);
            getPaymentFci();
            writeReplace = null;
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{null}, -1381053641, 1381053678, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.HCEInitializer.AlternateContactlessPaymentDataJson();
            com.payair.hce.setLeft.values(new java.lang.Object[0], 1070182773, -1070182765, (int) java.lang.System.currentTimeMillis());
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getGpoResponse() {
        getGpoResponse = (getCvrMaskAnd + 7) % 128;
    }

    static void getPaymentFci() {
        int i = getGpoResponse + 75;
        getCvrMaskAnd = i % 128;
        int i2 = i % 2;
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0).edit().clear().apply();
        int i3 = getCvrMaskAnd + 73;
        getGpoResponse = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void SdkCoreBusinessLogicModuleImpl() {
        getCvrMaskAnd = (getGpoResponse + 95) % 128;
    }

    static void z_(android.content.Intent intent) {
        getGpoResponse = (getCvrMaskAnd + 91) % 128;
        AlternateContactlessPaymentDataJson = null;
        com.payair.hce.setStatusCode setstatuscode = com.payair.hce.setStatusCode.AlternateContactlessPaymentDataJson;
        getCvrMaskAnd = (getGpoResponse + 27) % 128;
    }

    static void getCvrMaskAnd() {
        getCvrMaskAnd = (getGpoResponse + 85) % 128;
    }

    static void getApplicationLifeCycleData() {
        getCvrMaskAnd = (getGpoResponse + 65) % 128;
    }

    static void writeReplace(java.lang.String str, java.lang.String str2) {
        getCvrMaskAnd = (getGpoResponse + 81) % 128;
        com.payair.hce.setLeft.values(new java.lang.Object[]{"TASK_ID".concat(java.lang.String.valueOf(str)), str2, A_()}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
        getCvrMaskAnd = (getGpoResponse + 109) % 128;
    }

    static void DigitizedCardProfile(byte[] bArr) {
        android.content.SharedPreferences A_ = A_();
        if (bArr != null && A_ != null) {
            int i = getCvrMaskAnd + 49;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                if (getCardLayoutDescription() != null) {
                    return;
                }
                java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("ﰬﱜ弿\udd74\u0093Ҿ뱼㩯\uf4e1햃ఛ㌛\ued0c찵ᕾ⯜\ue5a7썩Ếᱤ\udeefﮐ☮ᔆ", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
                com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), writeReplace2, A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
            } else {
                getCardLayoutDescription();
                throw null;
            }
        } else {
            if (A_ == null) {
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ﰬﱜ弿\udd74\u0093Ҿ뱼㩯\uf4e1햃ఛ㌛\ued0c찵ᕾ⯜\ue5a7썩Ếᱤ\udeefﮐ☮ᔆ", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
            com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), A_}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
        }
        getCvrMaskAnd = (getGpoResponse + 89) % 128;
    }

    static void writeReplace(byte[] bArr) {
        getCvrMaskAnd = (getGpoResponse + 77) % 128;
        android.content.SharedPreferences A_ = A_();
        if (bArr == null || A_ == null) {
            if (A_ != null) {
                getGpoResponse = (getCvrMaskAnd + 87) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("ﰬﱜ弿\udd74\u0093Ҿ뱼㩯\uf4e1햃ఛ㌛\ued0c찵ᕾ⯜\ue5a7썩Ếᱤ\udeefﮐ☮ᔆ", (-1) - android.os.Process.getGidForName(""), objArr);
                com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), A_}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
                return;
            }
            return;
        }
        if (getCardLayoutDescription() == null) {
            java.lang.String str = new java.lang.String(bArr);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ﰬﱜ弿\udd74\u0093Ҿ뱼㩯\uf4e1햃ఛ㌛\ued0c찵ᕾ⯜\ue5a7썩Ếᱤ\udeefﮐ☮ᔆ", android.view.KeyEvent.getDeadChar(0, 0), objArr2);
            com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), str, A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
        }
        getCvrMaskAnd = (getGpoResponse + 17) % 128;
    }

    static byte[] getCardLayoutDescription() {
        getGpoResponse = (getCvrMaskAnd + 47) % 128;
        byte[] bArr = null;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ﰬﱜ弿\udd74\u0093Ҿ뱼㩯\uf4e1햃ఛ㌛\ued0c찵ᕾ⯜\ue5a7썩Ếᱤ\udeefﮐ☮ᔆ", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr);
            java.lang.String str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), null, A_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
            if (!android.text.TextUtils.isEmpty(str)) {
                getCvrMaskAnd = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                bArr = str.getBytes();
                getGpoResponse = (getCvrMaskAnd + 81) % 128;
            }
        } catch (java.lang.Exception unused) {
        }
        return bArr;
    }

    static void valueOf(byte[] bArr) {
        getCvrMaskAnd = (getGpoResponse + 91) % 128;
        android.content.SharedPreferences A_ = A_();
        if (bArr != null) {
            int i = (getGpoResponse + 107) % 128;
            getCvrMaskAnd = i;
            if (A_ != null) {
                int i2 = i + 57;
                getGpoResponse = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("硛砫縴ﱿ娘帵ﰊ稙炖\uf488嚐獭楻\ued3e俬殶懌\ue260䐽尘媞\uda8c粥啰", android.graphics.Color.alpha(0), objArr);
                    com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), writeReplace2, A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                    return;
                }
                java.lang.String writeReplace3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("硛砫縴ﱿ娘帵ﰊ稙炖\uf488嚐獭楻\ued3e俬殶懌\ue260䐽尘媞\uda8c粥啰", android.graphics.Color.alpha(0), objArr2);
                com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), writeReplace3, A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                return;
            }
        }
        if (A_ != null) {
            getGpoResponse = (getCvrMaskAnd + 103) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("硛砫縴ﱿ娘帵ﰊ稙炖\uf488嚐獭楻\ued3e俬殶懌\ue260䐽尘媞\uda8c粥啰", android.view.KeyEvent.getDeadChar(0, 0), objArr3);
            com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr3[0]).intern(), A_}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r0 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(r0).DigitizedCardProfile();
        r1 = com.payair.hce.setAllowedHandwritingDelegatorPackage.getGpoResponse + 21;
        com.payair.hce.setAllowedHandwritingDelegatorPackage.getCvrMaskAnd = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0089, code lost:
    
        r0 = com.payair.hce.setAllowedHandwritingDelegatorPackage.getCvrMaskAnd + 99;
        com.payair.hce.setAllowedHandwritingDelegatorPackage.getGpoResponse = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0093, code lost:
    
        if ((r0 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] getDualTapResetTimeout() {
        java.lang.String str;
        int i = getGpoResponse + 15;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("硛砫縴ﱿ娘帵ﰊ稙炖\uf488嚐獭楻\ued3e俬殶懌\ue260䐽尘媞\uda8c粥啰", android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), null, A_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("硛砫縴ﱿ娘帵ﰊ稙炖\uf488嚐獭楻\ued3e俬殶懌\ue260䐽尘媞\uda8c粥啰", android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
            str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), null, A_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        }
    }

    static com.payair.hce.accessperformEnroll getCvmResetTimeout() {
        getGpoResponse = (getCvrMaskAnd + 113) % 128;
        java.lang.String str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"deviceFingerprint", null, A_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        if (!android.text.TextUtils.isEmpty(str)) {
            return new com.payair.hce.accessperformEnroll(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str).DigitizedCardProfile());
        }
        int i = getCvrMaskAnd + 7;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void DigitizedCardProfile(com.payair.hce.accessperformEnroll accessperformenroll) {
        android.content.SharedPreferences A_ = A_();
        if (accessperformenroll == null || A_ == null) {
            if (A_ != null) {
                com.payair.hce.setLeft.values(new java.lang.Object[]{"deviceFingerprint", A_}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
            }
            getGpoResponse = (getCvrMaskAnd + 61) % 128;
        } else {
            int i = getGpoResponse + 81;
            getCvrMaskAnd = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.setLeft.values(new java.lang.Object[]{"deviceFingerprint", com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessperformenroll}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessperformenroll))).writeReplace(), A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
            } else {
                com.payair.hce.setLeft.values(new java.lang.Object[]{"deviceFingerprint", com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessperformenroll}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessperformenroll))).writeReplace(), A_}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r1 = new java.util.HashSet();
        com.payair.hce.setAllowedHandwritingDelegatorPackage.getGpoResponse = (com.payair.hce.setAllowedHandwritingDelegatorPackage.getCvrMaskAnd + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void DigitizedCardProfile(java.lang.String str) {
        android.content.SharedPreferences A_;
        java.util.Set set;
        int i = getCvrMaskAnd + 41;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            A_ = A_();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("땂딦剝퀞⚷⊄簶﨡붞\ud8e6⨱\uf375ꑶ셤㍲\ueb8a곞츶㢟", android.view.KeyEvent.normalizeMetaState(0), objArr);
            set = (java.util.Set) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), A_}, -554803296, 554803300, (int) java.lang.System.currentTimeMillis());
        } else {
            A_ = A_();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("땂딦剝퀞⚷⊄簶﨡붞\ud8e6⨱\uf375ꑶ셤㍲\ueb8a곞츶㢟", android.view.KeyEvent.normalizeMetaState(0), objArr2);
            set = (java.util.Set) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), A_}, -554803296, 554803300, (int) java.lang.System.currentTimeMillis());
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        int i2 = getCvrMaskAnd + 11;
        while (true) {
            getGpoResponse = i2 % 128;
            if (!it.hasNext()) {
                hashSet.add(str);
                B_(A_, hashSet);
                return;
            } else {
                hashSet.add((java.lang.String) it.next());
                i2 = getCvrMaskAnd + 117;
            }
        }
    }

    static void writeReplace(java.lang.String str) {
        int i = getGpoResponse + 121;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            DigitizedCardProfile(str);
        } else {
            DigitizedCardProfile(str);
            throw null;
        }
    }

    private static android.content.SharedPreferences A_() {
        int i = getGpoResponse + 35;
        getCvrMaskAnd = i % 128;
        android.content.SharedPreferences sharedPreferences = com.payair.hce.setImportantForAccessibility.valueOf;
        if (i % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    static void AlternateContactlessPaymentDataJson(java.lang.String str) {
        android.content.SharedPreferences A_ = A_();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("땂딦剝퀞⚷⊄簶﨡붞\ud8e6⨱\uf375ꑶ셤㍲\ueb8a곞츶㢟", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        java.util.Set set = (java.util.Set) com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), A_}, -554803296, 554803300, (int) java.lang.System.currentTimeMillis());
        java.util.HashSet hashSet = new java.util.HashSet();
        if (set != null) {
            getCvrMaskAnd = (getGpoResponse + 89) % 128;
            set.remove(str);
            java.util.Iterator it = set.iterator();
            getCvrMaskAnd = (getGpoResponse + 109) % 128;
            while (it.hasNext()) {
                int i = getCvrMaskAnd + 111;
                getGpoResponse = i % 128;
                if (i % 2 != 0) {
                    hashSet.add((java.lang.String) it.next());
                    throw null;
                }
                hashSet.add((java.lang.String) it.next());
            }
            B_(A_, hashSet);
        }
    }

    static void B_(android.content.SharedPreferences sharedPreferences, java.util.Set<java.lang.String> set) {
        int i = getCvrMaskAnd + 15;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("땂딦剝퀞⚷⊄簶﨡붞\ud8e6⨱\uf375ꑶ셤㍲\ueb8a곞츶㢟", android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
            com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), set, sharedPreferences}, -753890282, 753890291, (int) java.lang.System.currentTimeMillis());
            int size = set.size();
            com.payair.hce.setLeft.values(new java.lang.Object[]{"StringSetSize", java.lang.Integer.valueOf(size), sharedPreferences}, 987195454, -987195452, size);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("땂딦剝퀞⚷⊄簶﨡붞\ud8e6⨱\uf375ꑶ셤㍲\ueb8a곞츶㢟", android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
            com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), set, sharedPreferences}, -753890282, 753890291, (int) java.lang.System.currentTimeMillis());
            int size2 = set.size();
            com.payair.hce.setLeft.values(new java.lang.Object[]{"StringSetSize", java.lang.Integer.valueOf(size2), sharedPreferences}, 987195454, -987195452, size2);
        }
        getCvrMaskAnd = (getGpoResponse + 1) % 128;
    }

    static void AlternateContactlessPaymentDataJson(boolean z) {
        int i = getGpoResponse + 31;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            android.content.SharedPreferences A_ = A_();
            if (A_ != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("먝면填\uda32눏똌掿\ue5a0닙틕뺖\ueced\uab1d쭸Ʂ\uf422ꎀ쐽", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
                com.payair.hce.setLeft.values(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), java.lang.Boolean.valueOf(z), A_}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
            }
            getGpoResponse = (getCvrMaskAnd + 117) % 128;
            return;
        }
        A_();
        throw new java.lang.ArithmeticException();
    }

    static void writeReplace(com.payair.hce.setPreferKeepClear setpreferkeepclear) {
        int i = getCvrMaskAnd + 105;
        int i2 = i % 128;
        getGpoResponse = i2;
        if (i % 2 == 0) {
            values = setpreferkeepclear;
            getCvrMaskAnd = (i2 + 29) % 128;
        } else {
            values = setpreferkeepclear;
            throw null;
        }
    }

    static com.payair.hce.setPreferKeepClear getSecurityWord() {
        int i = (getCvrMaskAnd + 39) % 128;
        getGpoResponse = i;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = values;
        int i2 = i + 7;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return setpreferkeepclear;
        }
        throw null;
    }

    static void valueOf(boolean z) {
        getCvrMaskAnd = (getGpoResponse + 45) % 128;
        if (getMchipCvmIssuerOptions()) {
            return;
        }
        RecordsJson = null;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = values;
        if (setpreferkeepclear != null) {
            com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -1936581216, 1936581224, java.lang.System.identityHashCode(setpreferkeepclear));
            getCvrMaskAnd = (getGpoResponse + 99) % 128;
        }
    }

    static void writeReplace(boolean z) {
        int i = (getGpoResponse + 65) % 128;
        getCvrMaskAnd = i;
        SdkCoreAlternateContactlessPaymentDataImpl = false;
        int i2 = i + 95;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static com.payair.hce.setLayoutDirection values(android.content.Context context) {
        java.lang.String str;
        com.payair.hce.setLayoutDirection setlayoutdirection = new com.payair.hce.setLayoutDirection();
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        android.nfc.NfcAdapter defaultAdapter = ((android.nfc.NfcManager) context.getSystemService("nfc")).getDefaultAdapter();
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, android.os.Build.MODEL}, -392310814, 392310815, java.lang.System.identityHashCode(setlayoutdirection));
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, android.os.Build.MANUFACTURER}, -961881943, 961881949, java.lang.System.identityHashCode(setlayoutdirection));
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, string}, -1366007243, 1366007250, java.lang.System.identityHashCode(setlayoutdirection));
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, android.os.Build.DEVICE}, 1867236259, -1867236255, java.lang.System.identityHashCode(setlayoutdirection));
        if (defaultAdapter == null) {
            getGpoResponse = (getCvrMaskAnd + 125) % 128;
            str = "false";
        } else {
            getCvrMaskAnd = (getGpoResponse + 19) % 128;
            str = "true";
        }
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, str}, 1826131751, -1826131749, java.lang.System.identityHashCode(setlayoutdirection));
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, "ANDROID"}, -923287419, 923287424, java.lang.System.identityHashCode(setlayoutdirection));
        com.payair.hce.setLayoutDirection.values(new java.lang.Object[]{setlayoutdirection, android.os.Build.FINGERPRINT}, -851881150, 851881153, java.lang.System.identityHashCode(setlayoutdirection));
        return setlayoutdirection;
    }

    static int SdkCoreCardRiskManagementDataImpl() {
        int i = getCvrMaskAnd + 89;
        getGpoResponse = i % 128;
        try {
            if (i % 2 == 0) {
                java.util.List<com.payair.hce.sendRequest> AlternateContactlessPaymentDataJson2 = DigitizedCardProfile().writeReplace().AlternateContactlessPaymentDataJson();
                getCvrMaskAnd = (getGpoResponse + 93) % 128;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<com.payair.hce.sendRequest> it = AlternateContactlessPaymentDataJson2.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((java.lang.Integer) com.payair.hce.setPreferKeepClearRects.DigitizedCardProfile(new java.lang.Object[]{new java.lang.String(it.next().DigitizedCardProfile().AlternateContactlessPaymentDataJson())}, -135600210, 135600213, (int) java.lang.System.currentTimeMillis())).intValue()));
                }
                for (int i2 = 0; i2 < 20; i2++) {
                    if (!arrayList.contains(java.lang.Integer.valueOf(i2))) {
                        int i3 = getCvrMaskAnd + 89;
                        getGpoResponse = i3 % 128;
                        if (i3 % 2 == 0) {
                            return i2;
                        }
                        throw null;
                    }
                }
                return -1;
            }
            DigitizedCardProfile().writeReplace().AlternateContactlessPaymentDataJson();
            throw new java.lang.NullPointerException();
        } catch (com.payair.hce.setSuccessful unused) {
            return -1;
        }
    }

    private static boolean getMchipCvmIssuerOptions() {
        int i = getCvrMaskAnd + 25;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            return IccPrivateKeyCrtComponentsJson;
        }
        throw null;
    }

    static void values(boolean z) {
        int i = getCvrMaskAnd;
        getGpoResponse = (i + 89) % 128;
        IccPrivateKeyCrtComponentsJson = z;
        int i2 = i + 19;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void getCardholderValidators() {
        getCiacDecline = 8241101461588670185L;
    }

    static void init$0() {
        $$a = new byte[]{94, 46, -101, 115};
        $$b = 205;
    }
}
