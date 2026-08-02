package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCacheDir {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static byte[] getAid;
    private static char getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static short[] getProfileVersion;
    private com.payair.hce.transactionCanBeResumed valueOf;
    private com.payair.hce.transactionCanBeResumed values;
    private com.payair.hce.transactionCanBeResumed writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 110 - (b * 6);
        byte[] bArr = $$a;
        int i5 = (i * 3) + 4;
        int i6 = i2 * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = (-i5) + i7;
            int i11 = i9 + 1;
            i3 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i9 = i5;
            i5 = bArr[i5];
            i7 = i12;
            int i102 = (-i5) + i7;
            int i112 = i9 + 1;
            i3 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getCacheDir getcachedir = (com.payair.hce.getCacheDir) objArr[0];
        int i4 = (getPaymentFci + 113) % 128;
        getGpoResponse = i4;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = getcachedir.valueOf;
        getPaymentFci = (i4 + 121) % 128;
        return transactioncanberesumed;
    }

    public getCacheDir() {
    }

    public static com.payair.hce.checkForSuccess valueOf(final com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json) {
        com.payair.hce.checkForSuccess checkforsuccess = new com.payair.hce.checkForSuccess() { // from class: com.payair.hce.getCacheDir.4
            private static int valueOf = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                switch ((i * 866) + (i2 * (-864)) + (((~((~i) | i5)) | i4) * (-865)) + ((~(i3 | i)) * 865) + (((~(i | i5)) | (~(i4 | i5))) * 865)) {
                    case 1:
                        com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                        valueOf = (values + 93) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.digitizedCardId).DigitizedCardProfile();
                        int i6 = valueOf;
                        values = ((i6 & 87) + (i6 | 87)) % 128;
                        return DigitizedCardProfile2;
                    case 2:
                        com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass42 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                        int i7 = valueOf;
                        int i8 = i7 ^ 51;
                        int i9 = (i7 & 51) << 1;
                        values = ((i8 & i9) + (i9 | i8)) % 128;
                        byte[] DigitizedCardProfile3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.cardCountryCode).DigitizedCardProfile();
                        int i10 = valueOf;
                        values = (((i10 | 37) << 1) - (i10 ^ 37)) % 128;
                        return DigitizedCardProfile3;
                    case 3:
                        return writeReplace(objArr);
                    case 4:
                        return values(objArr);
                    case 5:
                        return valueOf(objArr);
                    case 6:
                        return DigitizedCardProfile(objArr);
                    case 7:
                        return getProfileVersion(objArr);
                    default:
                        return AlternateContactlessPaymentDataJson(objArr);
                }
            }

            private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
                com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                int i = valueOf;
                int i2 = i & 57;
                int i3 = -(-(i | 57));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                values = i4 % 128;
                com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this;
                if (i4 % 2 != 0) {
                    return digitizedCardProfileV2Json2.getProfileVersion();
                }
                digitizedCardProfileV2Json2.getProfileVersion();
                throw null;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                int i = valueOf;
                int i2 = (i & 121) + (i | 121);
                values = i2 % 128;
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.pan);
                if (i2 % 2 == 0) {
                    AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                    throw null;
                }
                byte[] DigitizedCardProfile2 = AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                int i3 = values;
                int i4 = (i3 ^ 51) + ((i3 & 51) << 1);
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    return DigitizedCardProfile2;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                int i = valueOf;
                values = (((i ^ 68) + ((i & 68) << 1)) - 1) % 128;
                boolean z = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.isTransactionIdRequired;
                int i2 = valueOf + 20;
                int i3 = (~i2) + (i2 << 1);
                values = i3 % 128;
                if (i3 % 2 != 0) {
                    return java.lang.Boolean.valueOf(z);
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.setDetailedMessage setdetailedmessage = new com.payair.hce.setDetailedMessage() { // from class: com.payair.hce.getCacheDir.4.2
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static int AlternateContactlessPaymentDataJson;
                    private static int DigitizedCardProfile;
                    private static long writeReplace;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i, int i2, short s, java.lang.Object[] objArr2) {
                        int i3;
                        int i4;
                        byte[] bArr = $$a;
                        int i5 = (i2 * 4) + 1;
                        int i6 = s + 112;
                        int i7 = 4 - (i * 3);
                        byte[] bArr2 = new byte[i5];
                        if (bArr == null) {
                            int i8 = i5;
                            i4 = 0;
                            i7++;
                            i6 += -i8;
                            i3 = i4;
                            i4 = i3 + 1;
                            bArr2[i3] = (byte) i6;
                            if (i4 == i5) {
                                objArr2[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            i8 = bArr[i7];
                            i7++;
                            i6 += -i8;
                            i3 = i4;
                            i4 = i3 + 1;
                            bArr2[i3] = (byte) i6;
                            if (i4 == i5) {
                            }
                        } else {
                            i3 = 0;
                            i4 = i3 + 1;
                            bArr2[i3] = (byte) i6;
                            if (i4 == i5) {
                            }
                        }
                    }

                    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        return valueOf(objArr2);
                    }

                    private static void a(java.lang.String str, int i, java.lang.Object[] objArr2) {
                        $10 = ($11 + 55) % 128;
                        char[] charArray = str != null ? str.toCharArray() : str;
                        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
                        getdsrpdata.values = i;
                        int length = charArray.length;
                        long[] jArr = new long[length];
                        getdsrpdata.valueOf = 0;
                        while (getdsrpdata.valueOf < charArray.length) {
                            int i2 = $10 + 81;
                            $11 = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i3 = getdsrpdata.valueOf;
                                try {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                                    if (obj == null) {
                                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 32, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1890, (char) (3600 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        b(0, 0, (short) 1, objArr4);
                                        obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                                    }
                                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).longValue() | (writeReplace * (-4761752123935132024L));
                                    java.lang.Object[] objArr5 = {getdsrpdata, getdsrpdata};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                    if (obj2 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1443, (char) (29682 - android.text.TextUtils.getOffsetBefore("", 0)));
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        b(0, 0, (short) 0, objArr6);
                                        obj2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                                    }
                                    ((java.lang.reflect.Method) obj2).invoke(null, objArr5);
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                int i4 = getdsrpdata.valueOf;
                                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                                if (obj3 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1890 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.View.MeasureSpec.getMode(0) + 3600));
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    b(0, 0, (short) 1, objArr8);
                                    obj3 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                                }
                                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue() ^ (writeReplace ^ (-4761752123935132024L));
                                java.lang.Object[] objArr9 = {getdsrpdata, getdsrpdata};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                if (obj4 == null) {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 64, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1443, (char) (29682 - android.view.KeyEvent.normalizeMetaState(0)));
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    b(0, 0, (short) 0, objArr10);
                                    obj4 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                                }
                                ((java.lang.reflect.Method) obj4).invoke(null, objArr9);
                            }
                        }
                        char[] cArr = new char[length];
                        getdsrpdata.valueOf = 0;
                        while (getdsrpdata.valueOf < charArray.length) {
                            int i5 = $10 + 103;
                            $11 = i5 % 128;
                            if (i5 % 2 == 0) {
                                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                                java.lang.Object[] objArr11 = {getdsrpdata, getdsrpdata};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.getOffsetAfter("", 0) + 1443, (char) (29682 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(0, 0, (short) 0, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
                                }
                                ((java.lang.reflect.Method) obj5).invoke(null, objArr11);
                                throw null;
                            }
                            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                            java.lang.Object[] objArr13 = {getdsrpdata, getdsrpdata};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                            if (obj6 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 64, 1443 - android.text.TextUtils.getOffsetAfter("", 0), (char) (29682 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(0, 0, (short) 0, objArr14);
                                obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj6);
                            }
                            ((java.lang.reflect.Method) obj6).invoke(null, objArr13);
                        }
                        objArr2[0] = new java.lang.String(cArr);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
                    
                        if (r0.equals(((java.lang.String) r2[0]).intern()) != false) goto L21;
                     */
                    @Override // com.payair.hce.setDetailedMessage
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final com.payair.hce.setOrderRef getCardholderValidator() {
                        if (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.walletRelatedData.cardholderValidator != null) {
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.walletRelatedData.cardholderValidator;
                            int hashCode = str.hashCode();
                            if (hashCode != -1733098743) {
                                if (hashCode == -1634547624) {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    a("M賖ᥰꖂ㈨뺸䯉\ud87f撁\uf12f", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 35993, objArr2);
                                }
                                return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                            }
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a("L첪馉曮㏘5촇騜松㑈 춞髺柨㓃į츏魶桞㒼Ʋ캄", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52453, objArr3);
                            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                int i = AlternateContactlessPaymentDataJson + 63;
                                DigitizedCardProfile = i % 128;
                                if (i % 2 == 0) {
                                    return com.payair.hce.setOrderRef.writeReplace;
                                }
                                com.payair.hce.setOrderRef setorderref = com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                                int i2 = DigitizedCardProfile + 77;
                                AlternateContactlessPaymentDataJson = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return setorderref;
                                }
                                throw new java.lang.ArithmeticException();
                            }
                            return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        }
                        int i3 = DigitizedCardProfile + 31;
                        AlternateContactlessPaymentDataJson = i3 % 128;
                        if (i3 % 2 != 0) {
                            return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        }
                        com.payair.hce.setOrderRef setorderref2 = com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getCvmResetTimeout() {
                        int i = AlternateContactlessPaymentDataJson;
                        DigitizedCardProfile = (i + 85) % 128;
                        DigitizedCardProfile = (i + 99) % 128;
                        return 30;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getDualTapResetTimeout() {
                        int i = (DigitizedCardProfile + 63) % 128;
                        AlternateContactlessPaymentDataJson = i;
                        int i2 = i + 57;
                        DigitizedCardProfile = i2 % 128;
                        if (i2 % 2 == 0) {
                            return 30;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.getCacheDir.AnonymousClass4.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCacheDir.AnonymousClass4.AnonymousClass2) objArr2[0];
                        int i = AlternateContactlessPaymentDataJson + 49;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 != 0) {
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType;
                            throw null;
                        }
                        if (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType == null) {
                            return com.payair.hce.getjSONObject.valueOf;
                        }
                        java.lang.String str2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.accountType;
                        int hashCode = str2.hashCode();
                        if (hashCode == 64920780) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a("D窨\uf598炎\uebe0", 31469 - android.view.View.combineMeasuredStates(0, 0), objArr3);
                            if (str2.equals(((java.lang.String) objArr3[0]).intern())) {
                                return com.payair.hce.getjSONObject.AlternateContactlessPaymentDataJson;
                            }
                        } else if (hashCode == 433141802) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a("U\ue1c7썙ꓕ虫柺䥸", 57736 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr4);
                            if (str2.equals(((java.lang.String) objArr4[0]).intern())) {
                                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 119) % 128;
                                return com.payair.hce.getjSONObject.valueOf;
                            }
                        } else if (hashCode == 1996005113) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a("C畷\uea0f弫퓝䧭", 29990 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
                            if (str2.equals(((java.lang.String) objArr5[0]).intern())) {
                                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 83) % 128;
                                return com.payair.hce.getjSONObject.values;
                            }
                        }
                        return com.payair.hce.getjSONObject.valueOf;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
                    
                        if (r0.equals(((java.lang.String) r7[0]).intern()) != false) goto L28;
                     */
                    @Override // com.payair.hce.setDetailedMessage
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final com.payair.hce.setjSONObject getProductType() {
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 31) % 128;
                        if (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.productType == null) {
                            return com.payair.hce.setjSONObject.values;
                        }
                        java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.commonData.productType;
                        char c = 0;
                        switch (str.hashCode()) {
                            case 64920780:
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("D窨\uf598炎\uebe0", 31469 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 399611855:
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("P숥蒫䜵ঝ찚躎", 49783 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    int i = AlternateContactlessPaymentDataJson + 13;
                                    DigitizedCardProfile = i % 128;
                                    if (i % 2 == 0) {
                                        c = 3;
                                        break;
                                    }
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a("U\ue1c7썙ꓕ虫柺䥸", 57737 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                                if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1387439946:
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a("C糎累痎\uf241滗\ueb45柎\ue449情", android.text.TextUtils.indexOf("", "", 0) + 31873, objArr5);
                                if (str.equals(((java.lang.String) objArr5[0]).intern())) {
                                    AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 105) % 128;
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1996005113:
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a("C畷\uea0f弫퓝䧭", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29989, objArr6);
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? com.payair.hce.setjSONObject.values : com.payair.hce.setjSONObject.values : com.payair.hce.setjSONObject.AlternateContactlessPaymentDataJson : com.payair.hce.setjSONObject.valueOf : com.payair.hce.setjSONObject.DigitizedCardProfile : com.payair.hce.setjSONObject.writeReplace;
                    }

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        DigitizedCardProfile = 0;
                        AlternateContactlessPaymentDataJson = 1;
                        writeReplace = -6486530677214906744L;
                    }

                    static void init$0() {
                        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
                        $$b = 47;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.getjSONObject getAccountType() {
                        return (com.payair.hce.getjSONObject) values(new java.lang.Object[]{this}, 555739519, -555739519, java.lang.System.identityHashCode(this));
                    }
                };
                int i = valueOf + 33;
                values = i % 128;
                if (i % 2 != 0) {
                    return setdetailedmessage;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                int i = values;
                int i2 = ((i & (-38)) | ((~i) & 37)) + ((i & 37) << 1);
                valueOf = i2 % 128;
                if (i2 % 2 == 0) {
                    final com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.dsrpData;
                    if (dsrpDataV2Json == null) {
                        int i3 = valueOf;
                        int i4 = i3 & 45;
                        values = (((((i3 ^ 45) | i4) << 1) - (~(-((~i4) & (i3 | 45))))) - 1) % 128;
                        int i5 = (i3 ^ 75) + ((i3 & 75) << 1);
                        values = i5 % 128;
                        if (i5 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    com.payair.hce.getStatusCode getstatuscode = new com.payair.hce.getStatusCode() { // from class: com.payair.hce.getCacheDir.2
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static int $10;
                        private static int $11;
                        private static char AlternateContactlessPaymentDataJson;
                        private static int IccPrivateKeyCrtComponentsJson;
                        private static int getAid;
                        private static char valueOf;
                        private static char values;
                        private static char writeReplace;

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private static void b(short s, byte b, short s2, java.lang.Object[] objArr2) {
                            int i6;
                            int i7 = s2 * 2;
                            int i8 = 3 - (b * 2);
                            byte[] bArr = $$a;
                            int i9 = (s * 2) + 110;
                            byte[] bArr2 = new byte[i7 + 1];
                            if (bArr == null) {
                                int i10 = i7;
                                int i11 = 0;
                                i9 += i10;
                                i6 = i11;
                                bArr2[i6] = (byte) i9;
                                i11 = i6 + 1;
                                i8++;
                                if (i6 == i7) {
                                    objArr2[0] = new java.lang.String(bArr2, 0);
                                    return;
                                }
                                i10 = bArr[i8];
                                i9 += i10;
                                i6 = i11;
                                bArr2[i6] = (byte) i9;
                                i11 = i6 + 1;
                                i8++;
                                if (i6 == i7) {
                                }
                            } else {
                                i6 = 0;
                                bArr2[i6] = (byte) i9;
                                i11 = i6 + 1;
                                i8++;
                                if (i6 == i7) {
                                }
                            }
                        }

                        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i6, int i7, int i8) {
                            int i9 = ~i6;
                            int i10 = ~i7;
                            return ((((i6 * (-317)) + (i7 * 319)) + (((~(i7 | ((~i8) | i6))) | (~((i9 | i10) | i8))) * (-318))) + (((~(i6 | i10)) | (~(i6 | i8))) * (-318))) + (((~(i9 | i8)) | i10) * 318) != 1 ? values(objArr2) : DigitizedCardProfile(objArr2);
                        }

                        private static void a(java.lang.String str, int i6, java.lang.Object[] objArr2) {
                            char[] cArr;
                            int i7 = ($11 + 89) % 128;
                            $10 = i7;
                            if (str != null) {
                                $11 = (i7 + 113) % 128;
                                cArr = str.toCharArray();
                                $11 = ($10 + 73) % 128;
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
                                int i8 = 58224;
                                int i9 = 0;
                                while (i9 < 16) {
                                    $11 = ($10 + 103) % 128;
                                    char c = cArr4[1];
                                    char c2 = cArr4[0];
                                    try {
                                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (values ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(valueOf)};
                                        int i10 = c2 + i8;
                                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                        if (obj == null) {
                                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1335 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.KeyEvent.keyCodeFromString(""));
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            b((short) 0, (byte) 0, (short) 0, objArr4);
                                            obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                                        }
                                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).charValue();
                                        cArr4[1] = charValue;
                                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                                        int i11 = charValue + i8;
                                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                        if (obj2 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 1335, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                                            b((short) 0, (byte) 0, (short) 0, objArr6);
                                            obj2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                                        }
                                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).charValue();
                                        i8 -= 40503;
                                        i9++;
                                        $10 = ($11 + 65) % 128;
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
                                java.lang.Object[] objArr7 = {getproducttype, getproducttype};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 3543 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr7);
                            }
                            objArr2[0] = new java.lang.String(cArr3, 0, i6);
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getAip() {
                            int i6 = IccPrivateKeyCrtComponentsJson + 15;
                            getAid = i6 % 128;
                            if (i6 % 2 != 0) {
                                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.aip).DigitizedCardProfile();
                                throw null;
                            }
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.aip).DigitizedCardProfile();
                            int i7 = IccPrivateKeyCrtComponentsJson + 13;
                            getAid = i7 % 128;
                            if (i7 % 2 == 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                            com.payair.hce.getCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCacheDir.AnonymousClass2) objArr2[0];
                            IccPrivateKeyCrtComponentsJson = (getAid + 57) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.expirationDate).DigitizedCardProfile();
                            int i6 = IccPrivateKeyCrtComponentsJson + 105;
                            getAid = i6 % 128;
                            if (i6 % 2 == 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                            com.payair.hce.getCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCacheDir.AnonymousClass2) objArr2[0];
                            int i6 = IccPrivateKeyCrtComponentsJson + 21;
                            getAid = i6 % 128;
                            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.panSequenceNumber);
                            if (i6 % 2 == 0) {
                                return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            }
                            AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            throw null;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getTrack2EquivalentData() {
                            int i6 = IccPrivateKeyCrtComponentsJson + 91;
                            getAid = i6 % 128;
                            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.track2Equivalent);
                            if (i6 % 2 == 0) {
                                return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            }
                            AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            throw null;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getIssuerApplicationData() {
                            getAid = (IccPrivateKeyCrtComponentsJson + 39) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.issuerApplicationData).DigitizedCardProfile();
                            IccPrivateKeyCrtComponentsJson = (getAid + 101) % 128;
                            return DigitizedCardProfile2;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.gotDeleteData getCvmModel() {
                            if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.cvmModel == null) {
                                getAid = (IccPrivateKeyCrtComponentsJson + 21) % 128;
                                com.payair.hce.gotDeleteData gotdeletedata = com.payair.hce.gotDeleteData.valueOf;
                                getAid = (IccPrivateKeyCrtComponentsJson + 37) % 128;
                                return gotdeletedata;
                            }
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.cvmModel;
                            int hashCode = str.hashCode();
                            if (hashCode == -1724098714) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("ꮁ\ue1fb亵◞젳䀠鷨꾝\uf1a3ᕠ", 9 - android.view.KeyEvent.getDeadChar(0, 0), objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    return com.payair.hce.gotDeleteData.DigitizedCardProfile;
                                }
                            } else if (hashCode == -1579111723) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("\udfc1\udc24筬括㇍\udb7bⷙ南퓏棐퀖淝", 12 - android.view.View.MeasureSpec.getMode(0), objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    getAid = (IccPrivateKeyCrtComponentsJson + 47) % 128;
                                    com.payair.hce.gotDeleteData gotdeletedata2 = com.payair.hce.gotDeleteData.valueOf;
                                    IccPrivateKeyCrtComponentsJson = (getAid + 99) % 128;
                                    return gotdeletedata2;
                                }
                            } else if (hashCode == 1953740997) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a("쐹脿⽌\uefd6콋⽐홆ⴽ\ud9f7⫕譼풞뫠싲", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, objArr4);
                                if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                    getAid = (IccPrivateKeyCrtComponentsJson + 81) % 128;
                                    return com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                                }
                            }
                            return com.payair.hce.gotDeleteData.values;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                            IccPrivateKeyCrtComponentsJson = (getAid + 43) % 128;
                            if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.umdGeneration == null) {
                                IccPrivateKeyCrtComponentsJson = (getAid + 13) % 128;
                                return com.payair.hce.setSendAuthenticationHeader.values;
                            }
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.umdGeneration;
                            int hashCode = str.hashCode();
                            if (hashCode == 366664857) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("覑狗ൕ᪢\ud943셅\ue4ad닝캀ଖⷙ南\ue9fe魦鳀ꈌ凱ퟴ롤뀫놗圇\udfc1\udc24筬括鹥쓳", 27 - android.view.View.getDefaultSize(0, 0), objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    return com.payair.hce.setSendAuthenticationHeader.values;
                                }
                            } else if (hashCode == 1118204426) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("ⷙ南퓏棐퀖淝闊꾍稶콭闟䰼좵끐\ue564袂\ud943셅୯\uf837낡뛳鳀ꈌ凱ퟴ", 26 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    getAid = (IccPrivateKeyCrtComponentsJson + 75) % 128;
                                    return com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                                }
                            } else if (hashCode == 1555809199) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a("ⷙ南퓏棐퀖淝闊꾍稶콭闟䰼좵끐\ue564袂ꄏ⁄빣菂ꕄ\u0fdd냮柧쒽\ude39", android.view.View.MeasureSpec.getSize(0) + 25, objArr4);
                                if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                    com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader = com.payair.hce.setSendAuthenticationHeader.writeReplace;
                                    IccPrivateKeyCrtComponentsJson = (getAid + 21) % 128;
                                    return setsendauthenticationheader;
                                }
                            }
                            return com.payair.hce.setSendAuthenticationHeader.values;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
                        
                            if (r0.equals(((java.lang.String) r2[0]).intern()) != false) goto L17;
                         */
                        @Override // com.payair.hce.getStatusCode
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final com.payair.hce.gotPutData getUcafVersion() {
                            IccPrivateKeyCrtComponentsJson = (getAid + 89) % 128;
                            if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.ucafVersion == null) {
                                return com.payair.hce.gotPutData.valueOf;
                            }
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.ucafVersion;
                            int hashCode = str.hashCode();
                            if (hashCode != 2714) {
                                if (hashCode == 480298015) {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    a("䬊뭡㬅ⴙ弳ꎫ\ue12e怢", android.graphics.Color.green(0) + 7, objArr2);
                                }
                                com.payair.hce.gotPutData gotputdata = com.payair.hce.gotPutData.valueOf;
                                getAid = (IccPrivateKeyCrtComponentsJson + 111) % 128;
                                return gotputdata;
                            }
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a("䬊뭡", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, objArr3);
                            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                int i6 = getAid + 29;
                                IccPrivateKeyCrtComponentsJson = i6 % 128;
                                if (i6 % 2 != 0) {
                                    com.payair.hce.gotPutData gotputdata2 = com.payair.hce.gotPutData.valueOf;
                                    int i7 = IccPrivateKeyCrtComponentsJson + 115;
                                    getAid = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        return gotputdata2;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }
                                return com.payair.hce.gotPutData.AlternateContactlessPaymentDataJson;
                            }
                            com.payair.hce.gotPutData gotputdata3 = com.payair.hce.gotPutData.valueOf;
                            getAid = (IccPrivateKeyCrtComponentsJson + 111) % 128;
                            return gotputdata3;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPar() {
                            IccPrivateKeyCrtComponentsJson = (getAid + 93) % 128;
                            if (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.par == null) {
                                return null;
                            }
                            int i6 = IccPrivateKeyCrtComponentsJson + 85;
                            getAid = i6 % 128;
                            if (i6 % 2 == 0) {
                                byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.par).DigitizedCardProfile();
                                getAid = (IccPrivateKeyCrtComponentsJson + 47) % 128;
                                return DigitizedCardProfile2;
                            }
                            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.this.par).DigitizedCardProfile();
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCiacDecline() {
                            int i6 = getAid + 105;
                            int i7 = i6 % 128;
                            IccPrivateKeyCrtComponentsJson = i7;
                            if (i6 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            int i8 = i7 + 23;
                            getAid = i8 % 128;
                            if (i8 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCvrMaskAnd() {
                            int i6 = (getAid + 91) % 128;
                            IccPrivateKeyCrtComponentsJson = i6;
                            getAid = (i6 + 61) % 128;
                            return null;
                        }

                        static {
                            init$0();
                            $10 = 0;
                            $11 = 1;
                            getAid = 0;
                            IccPrivateKeyCrtComponentsJson = 1;
                            writeReplace = (char) 45937;
                            AlternateContactlessPaymentDataJson = (char) 15440;
                            values = (char) 2551;
                            valueOf = (char) 28237;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPanSequenceNumber() {
                            return (byte[]) valueOf(new java.lang.Object[]{this}, 1760211618, -1760211618, java.lang.System.identityHashCode(this));
                        }

                        static void init$0() {
                            $$a = new byte[]{94, 87, -25, Byte.MAX_VALUE};
                            $$b = 48;
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getExpiryDate() {
                            return (byte[]) valueOf(new java.lang.Object[]{this}, -360579749, 360579750, java.lang.System.identityHashCode(this));
                        }
                    };
                    int i6 = values;
                    int i7 = ((i6 ^ 1) | (i6 & 1)) << 1;
                    int i8 = -((i6 & (-2)) | ((~i6) & 1));
                    int i9 = (i7 & i8) + (i8 | i7);
                    valueOf = i9 % 128;
                    if (i9 % 2 == 0) {
                        return getstatuscode;
                    }
                    throw new java.lang.ArithmeticException();
                }
                com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.dsrpData;
                throw null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.getCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCacheDir.AnonymousClass4) objArr[0];
                int i = values;
                int i2 = ((i ^ 7) | (i & 7)) << 1;
                int i3 = -((i & (-8)) | ((~i) & 7));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    final com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this;
                    final com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json = digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData;
                    if (contactlessPaymentDataV2Json == null) {
                        int i5 = values;
                        int i6 = i5 & 99;
                        int i7 = (i5 ^ 99) | i6;
                        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                        valueOf = i8 % 128;
                        if (i8 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                    com.payair.hce.JsonResponse jsonResponse = new com.payair.hce.JsonResponse() { // from class: com.payair.hce.getCacheDir.5
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static int $10;
                        private static int $11;
                        private static int DigitizedCardProfile;
                        private static int SdkCoreAlternateContactlessPaymentDataImpl;
                        private static char[] valueOf;
                        private static char values;

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private static void b(byte b, int i9, short s, java.lang.Object[] objArr2) {
                            int i10;
                            int i11;
                            int i12 = (s * 2) + 1;
                            int i13 = 73 - (b * 8);
                            int i14 = 3 - (i9 * 3);
                            byte[] bArr = $$a;
                            byte[] bArr2 = new byte[i12];
                            if (bArr == null) {
                                int i15 = i14;
                                int i16 = i12;
                                i11 = 0;
                                int i17 = i14 + i16;
                                i10 = i11;
                                i14 = i15;
                                i13 = i17;
                                i11 = i10 + 1;
                                int i18 = i14 + 1;
                                bArr2[i10] = (byte) i13;
                                if (i11 == i12) {
                                    objArr2[0] = new java.lang.String(bArr2, 0);
                                    return;
                                }
                                i16 = bArr[i18];
                                i14 = i13;
                                i15 = i18;
                                int i172 = i14 + i16;
                                i10 = i11;
                                i14 = i15;
                                i13 = i172;
                                i11 = i10 + 1;
                                int i182 = i14 + 1;
                                bArr2[i10] = (byte) i13;
                                if (i11 == i12) {
                                }
                            } else {
                                i10 = 0;
                                i11 = i10 + 1;
                                int i1822 = i14 + 1;
                                bArr2[i10] = (byte) i13;
                                if (i11 == i12) {
                                }
                            }
                        }

                        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i9, int i10, int i11) {
                            int i12;
                            int i13 = ~((~i9) | i10);
                            int i14 = ~i10;
                            int i15 = ~i11;
                            int i16 = (i9 * (-1975)) + (i10 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i11 | i13) * 988) + (((~(i9 | i14)) | (~(i9 | i15))) * (-1976)) + (((~(i14 | i11)) | i13 | (~(i10 | i15))) * 988);
                            char c = 0;
                            if (i16 == 1) {
                                com.payair.hce.getCacheDir.AnonymousClass5 anonymousClass5 = (com.payair.hce.getCacheDir.AnonymousClass5) objArr2[0];
                                DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 63) % 128;
                                com.payair.hce.JsonRequest jsonRequest = (com.payair.hce.JsonRequest) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.alternateContactlessPaymentData}, -1885591455, 1885591458, (int) java.lang.System.currentTimeMillis());
                                SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 57) % 128;
                                return jsonRequest;
                            }
                            if (i16 == 2) {
                                return values(objArr2);
                            }
                            com.payair.hce.getCacheDir.AnonymousClass5 anonymousClass52 = (com.payair.hce.getCacheDir.AnonymousClass5) objArr2[0];
                            if (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cvmModel == null) {
                                return com.payair.hce.gotDeleteData.valueOf;
                            }
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cvmModel;
                            int hashCode = str.hashCode();
                            if (hashCode != -1724098714) {
                                if (hashCode == -1579111723) {
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    a("\u0018\u0010\u0001\u0015\u0000\t\u0012\u0016\f\u0010\u0014\u000f", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), objArr3);
                                    if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                        i12 = SdkCoreAlternateContactlessPaymentDataImpl + 11;
                                        DigitizedCardProfile = i12 % 128;
                                    }
                                } else if (hashCode == 1953740997) {
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    a("\u0017\u0018\n\u0018\u0003\u0010\u0018\r\u0006\u0014\u0010\u0018\u0013\u0001", android.view.View.getDefaultSize(0, 0) + 14, (byte) (119 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr4);
                                    if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                        DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
                                        c = 1;
                                    }
                                }
                                c = 65535;
                            } else {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a("\u0016\u0010\u0004\u0011\b\u0014\u0002\u0004㘓", 9 - android.graphics.Color.blue(0), (byte) (52 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr5);
                                if (str.equals(((java.lang.String) objArr5[0]).intern())) {
                                    int i17 = SdkCoreAlternateContactlessPaymentDataImpl;
                                    int i18 = i17 + 53;
                                    DigitizedCardProfile = i18 % 128;
                                    c = i18 % 2 != 0 ? (char) 4 : (char) 2;
                                    i12 = i17 + 85;
                                    DigitizedCardProfile = i12 % 128;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                return com.payair.hce.gotDeleteData.valueOf;
                            }
                            if (c == 1) {
                                return com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                            }
                            if (c == 2) {
                                return com.payair.hce.gotDeleteData.DigitizedCardProfile;
                            }
                            com.payair.hce.gotDeleteData gotdeletedata = com.payair.hce.gotDeleteData.values;
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
                            return gotdeletedata;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getAid() {
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 13;
                            DigitizedCardProfile = i9 % 128;
                            if (i9 % 2 != 0) {
                                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.aid).DigitizedCardProfile();
                                throw null;
                            }
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.aid).DigitizedCardProfile();
                            int i10 = DigitizedCardProfile + 85;
                            SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                            if (i10 % 2 != 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getPpseFci() {
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.ppseFci).DigitizedCardProfile();
                            SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 37) % 128;
                            return DigitizedCardProfile2;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getPaymentFci() {
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 3;
                            DigitizedCardProfile = i9 % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.paymentFci).DigitizedCardProfile();
                            if (i9 % 2 == 0) {
                                return DigitizedCardProfile2;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getGpoResponse() {
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.gpoResponse).DigitizedCardProfile();
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 57;
                            DigitizedCardProfile = i9 % 128;
                            if (i9 % 2 == 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final int getCdol1RelatedDataLength() {
                            int i9 = DigitizedCardProfile + 81;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            int intValue = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.cdol1RelatedDataLength.intValue();
                            if (i9 % 2 != 0) {
                                return intValue;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getIssuerApplicationData() {
                            SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 47) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.issuerApplicationData).DigitizedCardProfile();
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
                            return DigitizedCardProfile2;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                            SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 29) % 128;
                            if (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.umdGeneration == null) {
                                return com.payair.hce.setSendAuthenticationHeader.values;
                            }
                            java.lang.String str = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.umdGeneration;
                            int hashCode = str.hashCode();
                            if (hashCode == 366664857) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("\u000e\u0013\u000e\n\u0007\u0016\t\f\u0006\u000f\u0012\u0016\u0004\u0010\u0007\n\t\u0018\t\u0014\n\b\u0018\u0010\u0001\u0015㙅", 28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (110 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
                                    return com.payair.hce.setSendAuthenticationHeader.values;
                                }
                            } else if (hashCode == 1118204426) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("\u0012\u0016\f\u0010\u0014\u000f\u0006\u0005\n\u000e\f\u0004\u0016\f\n\t\u0007\u0016\u000e\u0012\u0004\t\u0007\n\t\u0018", 26 - android.graphics.Color.alpha(0), (byte) (38 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    return com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                                }
                            } else if (hashCode == 1555809199) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a("\u0012\u0016\f\u0010\u0014\u000f\u0006\u0005\n\u000e\f\u0004\u0016\f\n\t\u0011\u0012\u0015\u0003\u000f\t\u000e\u0002㗵", 26 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 23), objArr4);
                                if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 125) % 128;
                                    return com.payair.hce.setSendAuthenticationHeader.writeReplace;
                                }
                            }
                            return com.payair.hce.setSendAuthenticationHeader.values;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getPinIvCvc3Track2() {
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.pinIvCvc3Track2).DigitizedCardProfile();
                            SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 117) % 128;
                            return DigitizedCardProfile2;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final boolean isTransitSupported() {
                            int i9 = DigitizedCardProfile + 63;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            java.lang.Boolean bool = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.isTransitSupported;
                            if (i9 % 2 != 0) {
                                return bool.booleanValue();
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final boolean isUsAipMaskingSupported() {
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 117;
                            DigitizedCardProfile = i9 % 128;
                            if (i9 % 2 != 0) {
                                java.lang.Boolean bool = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.isUsAipMaskingSupported;
                                throw null;
                            }
                            boolean booleanValue = com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.this.isUsAipMaskingSupported.booleanValue();
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
                            return booleanValue;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents() {
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 87;
                            DigitizedCardProfile = i9 % 128;
                            if (i9 % 2 != 0) {
                                throw null;
                            }
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.protectedIccPrivateKeyCrtComponents}, 1899222779, -1899222779, (int) java.lang.System.currentTimeMillis());
                            int i10 = DigitizedCardProfile + 89;
                            SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                            if (i10 % 2 != 0) {
                                return initializevisapaymentsdk;
                            }
                            throw null;
                        }

                        private static void a(java.lang.String str, int i9, byte b, java.lang.Object[] objArr2) {
                            char[] cArr;
                            int i10;
                            int length;
                            char[] cArr2;
                            if (str != null) {
                                int i11 = $10 + 71;
                                $11 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    throw null;
                                }
                                cArr = str.toCharArray();
                            } else {
                                cArr = str;
                            }
                            char[] cArr3 = cArr;
                            com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
                            char[] cArr4 = valueOf;
                            long j = 0;
                            int i12 = 3;
                            if (cArr4 != null) {
                                int i13 = $10 + 17;
                                $11 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    length = cArr4.length;
                                    cArr2 = new char[length];
                                } else {
                                    length = cArr4.length;
                                    cArr2 = new char[length];
                                }
                                int i14 = 0;
                                while (i14 < length) {
                                    try {
                                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr4[i14])};
                                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                                        if (obj == null) {
                                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.green(0), 2507 - android.widget.ExpandableListView.getPackedPositionChild(j), (char) (6802 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                            byte b2 = (byte) ($$b & i12);
                                            byte b3 = (byte) (b2 - 1);
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            b(b2, b3, b3, objArr4);
                                            obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                                        }
                                        cArr2[i14] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).charValue();
                                        i14++;
                                        j = 0;
                                        i12 = 3;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                cArr4 = cArr2;
                            }
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(values)};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2507, (char) (6802 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                byte b4 = (byte) ($$b & 3);
                                byte b5 = (byte) (b4 - 1);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                b(b4, b5, b5, objArr6);
                                obj2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                            }
                            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).charValue();
                            char[] cArr5 = new char[i9];
                            if (i9 % 2 != 0) {
                                i10 = i9 - 1;
                                cArr5[i10] = (char) (cArr3[i10] - b);
                            } else {
                                i10 = i9;
                            }
                            if (i10 > 1) {
                                digitizedCardJson12.values = 0;
                                $11 = ($10 + 71) % 128;
                                while (digitizedCardJson12.values < i10) {
                                    digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                                    digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                                    if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                                    } else {
                                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29, 3596 - android.graphics.Color.alpha(0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                                            java.lang.Object[] objArr8 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                                            if (obj4 == null) {
                                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2664 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 18889));
                                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                b((byte) 0, 0, (short) 0, objArr9);
                                                obj4 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                                            }
                                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue();
                                            int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                                            int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                                            cArr5[digitizedCardJson12.values] = cArr4[intValue];
                                            cArr5[digitizedCardJson12.values + 1] = cArr4[(i15 * charValue) + i16];
                                        } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                                            int i17 = digitizedCardJson12.DigitizedCardProfile;
                                            int i18 = digitizedCardJson12.RecordsJson;
                                            int i19 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                                            int i20 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                                            cArr5[digitizedCardJson12.values] = cArr4[(i17 * charValue) + i18];
                                            cArr5[digitizedCardJson12.values + 1] = cArr4[(i19 * charValue) + i20];
                                            $11 = ($10 + 11) % 128;
                                        } else {
                                            int i21 = digitizedCardJson12.DigitizedCardProfile;
                                            int i22 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                                            int i23 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                                            int i24 = digitizedCardJson12.RecordsJson;
                                            cArr5[digitizedCardJson12.values] = cArr4[(i21 * charValue) + i22];
                                            cArr5[digitizedCardJson12.values + 1] = cArr4[(i23 * charValue) + i24];
                                        }
                                    }
                                    digitizedCardJson12.values += 2;
                                }
                            }
                            int i25 = 0;
                            while (i25 < i9) {
                                int i26 = $11 + 69;
                                $10 = i26 % 128;
                                if (i26 % 2 != 0) {
                                    cArr5[i25] = (char) (cArr5[i25] ^ 15903);
                                    i25 += 105;
                                } else {
                                    cArr5[i25] = (char) (cArr5[i25] ^ 13722);
                                    i25++;
                                }
                            }
                            objArr2[0] = new java.lang.String(cArr5);
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final java.util.List<com.payair.hce.setNetworkError> getRecords() {
                            int i9 = DigitizedCardProfile + 77;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            if (i9 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            java.util.List<com.payair.hce.setNetworkError> list = (java.util.List) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.records}, 1279096886, -1279096884, (int) java.lang.System.currentTimeMillis());
                            DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 113) % 128;
                            return list;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.setErrorName getTrack1ConstructionData() {
                            int i9 = DigitizedCardProfile + 43;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            if (i9 % 2 != 0) {
                                com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.track1ConstructionData;
                                if (trackConstructionDataV2Json == null) {
                                    int i10 = DigitizedCardProfile + 33;
                                    SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return null;
                                    }
                                    throw null;
                                }
                                return new com.payair.hce.getCacheDir.AnonymousClass1(trackConstructionDataV2Json);
                            }
                            com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json2 = digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.track1ConstructionData;
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.setErrorName getTrack2ConstructionData() {
                            int i9 = DigitizedCardProfile + 79;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            if (i9 % 2 != 0) {
                                com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.track2ConstructionData;
                                if (trackConstructionDataV2Json == null) {
                                    int i10 = DigitizedCardProfile + 85;
                                    SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return null;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }
                                return new com.payair.hce.getCacheDir.AnonymousClass1(trackConstructionDataV2Json);
                            }
                            com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json2 = digitizedCardProfileV2Json2.mchipCardProfile.contactlessPaymentData.track2ConstructionData;
                            throw null;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getCiacDecline() {
                            int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 65;
                            DigitizedCardProfile = i9 % 128;
                            if (i9 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getCiacDeclineOnPpms() {
                            int i9 = DigitizedCardProfile + 75;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9 % 128;
                            if (i9 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                            int i9 = (DigitizedCardProfile + 57) % 128;
                            SdkCoreAlternateContactlessPaymentDataImpl = i9;
                            int i10 = i9 + 117;
                            DigitizedCardProfile = i10 % 128;
                            if (i10 % 2 == 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        static {
                            init$0();
                            $10 = 0;
                            $11 = 1;
                            DigitizedCardProfile = 0;
                            SdkCoreAlternateContactlessPaymentDataImpl = 1;
                            valueOf = new char[]{1489, 12291, 12312, 12289, 12295, 12309, 1491, 12318, 1490, 12301, 12313, 12317, 12319, 12292, 12303, 12307, 12316, 12299, 12296, 12302, 12306, 12297, 12300, 12294, 12293};
                            values = (char) 1493;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final byte[] getCvrMaskAnd() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 1126627504, -1126627502, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.JsonRequest getAlternateContactlessPaymentData() {
                            return (com.payair.hce.JsonRequest) writeReplace(new java.lang.Object[]{this}, -2045862330, 2045862331, java.lang.System.identityHashCode(this));
                        }

                        static void init$0() {
                            $$a = new byte[]{94, 87, -25, Byte.MAX_VALUE};
                            $$b = 45;
                        }

                        @Override // com.payair.hce.JsonResponse
                        public final com.payair.hce.gotDeleteData getCvmModel() {
                            return (com.payair.hce.gotDeleteData) writeReplace(new java.lang.Object[]{this}, 794595698, -794595698, java.lang.System.identityHashCode(this));
                        }
                    };
                    int i9 = valueOf + 93;
                    values = i9 % 128;
                    if (i9 % 2 != 0) {
                        return jsonResponse;
                    }
                    throw new java.lang.ArithmeticException();
                }
                com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json2 = com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.this.mchipCardProfile.contactlessPaymentData;
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCode getDsrpData() {
                return (com.payair.hce.getStatusCode) writeReplace(new java.lang.Object[]{this}, 530829107, -530829104, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.JsonResponse getContactlessPaymentData() {
                return (com.payair.hce.JsonResponse) writeReplace(new java.lang.Object[]{this}, 800892362, -800892356, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.setDetailedMessage getWalletData() {
                return (com.payair.hce.setDetailedMessage) writeReplace(new java.lang.Object[]{this}, -69136798, 69136802, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final boolean isTransactionIdRequired() {
                return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 774684138, -774684133, java.lang.System.identityHashCode(this))).booleanValue();
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getPan() {
                return (byte[]) writeReplace(new java.lang.Object[]{this}, -2067992120, 2067992120, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getCardCountryCode() {
                return (byte[]) writeReplace(new java.lang.Object[]{this}, -827301688, 827301690, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getDigitizedCardId() {
                return (byte[]) writeReplace(new java.lang.Object[]{this}, 769649686, -769649685, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCodeFromServer getVersion() {
                return (com.payair.hce.getStatusCodeFromServer) writeReplace(new java.lang.Object[]{this}, 1078715984, -1078715977, java.lang.System.identityHashCode(this));
            }
        };
        getPaymentFci = (getGpoResponse + 99) % 128;
        return checkforsuccess;
    }

    /* renamed from: com.payair.hce.getCacheDir$1, reason: invalid class name */
    public static final class AnonymousClass1 implements com.payair.hce.setErrorName {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AlternateContactlessPaymentDataJson;
        private static long DigitizedCardProfile;
        private static int valueOf;
        private static char[] values;
        private /* synthetic */ com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json writeReplace;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
            int i2;
            int i3 = i + 65;
            int i4 = s * 2;
            byte[] bArr = $$a;
            int i5 = (b * 34) + 4;
            char[] cArr = new char[i4 + 1];
            if (bArr == null) {
                int i6 = i4;
                i3 = i5;
                int i7 = 0;
                i5++;
                i3 = (i3 + i6) - 2;
                i2 = i7;
                cArr[i2] = (char) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i6 = bArr[i5];
                i5++;
                i3 = (i3 + i6) - 2;
                i2 = i7;
                cArr[i2] = (char) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                cArr[i2] = (char) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            }
        }

        private static void c(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
            byte[] bArr = $$d;
            int i = (b3 * 3) + 4;
            int i2 = b2 * 3;
            int i3 = 99 - (b * 4);
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3 = i2 + (-i);
                i++;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i3;
                if (i5 == i2) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i6 = i;
                i3 += -bArr[i];
                i = i6 + 1;
                i4 = i5;
            }
        }

        private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
            com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
            long[] jArr = new long[i2];
            getcvmmodel.valueOf = 0;
            while (getcvmmodel.valueOf < i2) {
                $11 = ($10 + 87) % 128;
                int i3 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 381 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (62388 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.widget.ExpandableListView.getPackedPositionChild(0L), 3966 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.graphics.Color.red(0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 35, 213 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            }
            char[] cArr = new char[i2];
            getcvmmodel.valueOf = 0;
            $10 = ($11 + 77) % 128;
            while (getcvmmodel.valueOf < i2) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        AnonymousClass1(com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json) {
            this.writeReplace = trackConstructionDataV2Json;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.getCacheDir.AnonymousClass1 anonymousClass1 = (com.payair.hce.getCacheDir.AnonymousClass1) objArr[0];
            int i = valueOf + 21;
            AlternateContactlessPaymentDataJson = i % 128;
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(anonymousClass1.writeReplace.pCvc3);
            if (i % 2 == 0) {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw new java.lang.ArithmeticException();
            }
            return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
        }

        @Override // com.payair.hce.setErrorName
        public final byte[] getPUnAtc() {
            int i = AlternateContactlessPaymentDataJson + 99;
            valueOf = i % 128;
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.writeReplace.pUnAtc);
            if (i % 2 != 0) {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                throw null;
            }
            return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
        }

        @Override // com.payair.hce.setErrorName
        public final byte[] getNAtc() {
            int i = AlternateContactlessPaymentDataJson + 97;
            valueOf = i % 128;
            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.writeReplace.nAtc).DigitizedCardProfile();
            if (i % 2 == 0) {
                return DigitizedCardProfile2;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // com.payair.hce.setErrorName
        public final byte[] getTrackData() {
            int i = valueOf + 71;
            AlternateContactlessPaymentDataJson = i % 128;
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.writeReplace.trackData);
            if (i % 2 != 0) {
                return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
            }
            AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
            throw null;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            valueOf = 0;
            AlternateContactlessPaymentDataJson = 1;
            char[] cArr = new char[1707];
            java.nio.ByteBuffer.wrap("\u0000,¬ÐY\b\u0006P²ð_÷\f&¹neß\u0012\n¿Lk\u00ad\u0018ÿÅ\u0017r`\u001eÞË\u0017xV$¸Ñå~<+_×Ê\u0084\u00021JÝ¿\u008að^\u0080ò|\u0007¤Xüì\\\u0001[R\u008açÂ;sL¦áà5\u0001FS\u009b»,Ý@\u007f\u0095¯&íz.\u008f^ \u0093uÞ\u0089vÚªoã^\u0080ò|\u0007¤Xüì\\\u0001[R\u008açÂ;sL¦áà5\u0001FS\u009b»,Þ@o\u0095±&ë^\u0080òk\u0007¸Xùì\\\u0001QR\u008açÊ;bL¬áì5]F\\\u009b\u008b,Á@r\u0095¹&áz\u0002\u008fR ¼uÎ\u0089tÚªoó\u0083\u0015ÔKi\u009b^\u0080ò}\u0007µXéì\\\u0001XR\u0082ç\u0080;gL²áæ5\u0002^\u0080ò}\u0007µXéì\\\u0001OR\u008cçÃ;9L°áû5\u001dFK^\u0080òk\u0007¥Xéì\u0012\u0001NR\u0081ç\u0081;EL\u0086áÄ5\u001dFM\u009b\u0081,é@w\u0095«&é^\u0080òk\u0007¸Xùì\u0007\u0001YR\u0088ç\u0081;{L©áë5]FW\u009b\u008d,Ï@x\u0095½&¦z\u0002\u008fU¶{\u001aÇï\u0010°R\u0004ªéò\u0017»»\u0011^\u0080òk\u0007¸Xùì\u0007\u0001YR\u0088ç\u0081;uL©áç5]FU\u009b\u0081,À@c\u0095\u0089&Åz\\\u008fT \u0086uÁ\u0089`Úóoä\u0083\u001fÔWi\u0096ºÙÎ{c±cmÏ\u0086:Ue\u0014Ñê<´oeÚl\u0006\u0098qDÜ\n\b°{¸¦l\u0011-}\u008e¨d\u001b(G±²§\u001d|H.´\u0088^\u0080òk\u0007¸Xùì\u0007\u0001YR\u0088ç\u0081;{L©áë5]FW\u009b\u008d,Ï@x\u0095º&åz\u0004\u008fl ®uÜ\u0089gÚ±o÷\u0083^ÔJi\u008d,À\u0080<uä*¼\u009e\u001cs\u0012 À\u0095\u0083I\">ç\u0093¼GW4\béÐ^Ýòw\u0007ïXèì\u0006\u0001UR\u0089çÊ;9L¨áæ5\u0001FO^Áò}\u0007 Xùì\u0016\u0001\u0012R\u008bçË;c^\u0080òh\u0007³Xåì\u0010\u0001\u0013R\u0083çÇ;{L¥áú5\u000bFH\u009b\u0090,È@{\u0095¬^Áò}\u0007¬Xÿì\u0000\u0001Z^Ýòw\u0007ïXúì\u0001\u0001SR\u0081çÛ;tL´á§5\u001fFZ\u009b\u008a,Ø@p\u0095¾&ëz\u0005\u008fO \u0091uÉ\u0089g^Èò}\u0007¯XóíÌAo´»ëç_\u0015²OfnÊ\u0086?]`\u000bÔþ9ýjfß/\u0003\u009dt[Ù\u000b\rù~¦^Ùòz\u0007®Xòì\u0014\u0001IR\u0080çÝ;c©Ô\u0005Að\u0093¯Ï\u001b\"öo¥\u00ad\u0010ûÌD»\u0092\u009cA0íÅ1\u009a\u007f.\u0087ÃÐ\u0090\u0010 J\föù5¦c\u0012\u0098ÿÓ¬\u0016\u0019E²\u0081\u001e+ë³´¦\u0000]í\u000f¾Ý\u000b\u0087×( è\rûÙJª\u0002wÎÀ\u0098¬)yæ,Ë\u0080hu¼*à\u009eYs\u0018 \u0087-\u0011\u0081¤tv+6\u009fØr\u008c!_^Èò}\u0007¯Xïì\u0001\u0001UR\u0086çñ;oLøá¿^Èò}\u0007¯Xïì\u0001\u0001UR\u0086çñ;oLøá¿5-F\r\u009bÐ^Ýòw\u0007ïXúì\u0001\u0001SR\u0081çÛ;tL´á§5\u001fFT\u009b\u0080,È@z\u009c|0ÜÅ\n^Êòu\u0007´Xæì\u0012\u0001HR\u008açÜÂ\u009cn\u001a\u009bÃÄØpS\u009d;Îù{¨§\fÐß}\u009e© Ú/\u0007ù°\u00adÜD\tîº\u0092æq\u0013'¼üé»^îòv\u0007¥Xøì\u001c\u0001UR\u0081ç\u008e;DL\u0084áÂ5RFY\u009b\u0091,Ä@z\u0095«&¨z\u0017\u008fU \u0091u\u008c\u0089mÚæo±^îòv\u0007¥Xøì\u001c\u0001UR\u0081ç\u008e;DL\u0084áÂ5RFY\u009b\u0091,Ä@z\u0095«&¨z\u0017\u008fU \u0091u\u008c\u0089mÚæo±\u0083/Ô\u000fiÖ^Ýòw\u0007ïXâì\u0012\u0001NR\u0081çÙ;vL²áìWQûî\u000e4Qwå\u008c\bÌ[\u000fî_^Ùòz\u0007®XòìK\u0001\n^Ýòy\u0007¯Xéì\u001b\u0001IF\u0018ê²\u001f*@?ôÄ\u0019\u0096JDÿ\u001e#±Tqùb-Õ^\u008c\u0083@4\u0006X·^Ýòw\u0007ïXáì\u0016\u0001NR\u008bçË;{Lîáø5\u0017FV\u009b\u0091<h^Ýòw\u0007ïXùì\u0016\u0001_R\u0090çÜ;rÞþ^Ýòw\u0007ïXèì\u0006\u0001UR\u0089çÊ;9L°áû5\u001dF_\u009b\u0091,Î@b^Éòm\u0007\u00adXæì,\u0001DRÝç\u0098ÿ\u0007S\u00ad¦5ù2MÜ \u008fóSF\u0010\u009aãí|@:\u0094Æç\u0086:[\u008d\u0005á¼4w\u0087;ÛÅ.\u0094^Èò}\u0007¯Xïì\u0001\u0001UR\u0086ç\u0081;dL¤áâ5]F\\\u009b\u0081,Ã@s\u0095\u00ad&áz\u0012®\u00ad\u0002\u0018÷Ê¨\u008a\u001cdñ0¢ã\u0017\u0094Ë\n¼\u009d\u0011ÚÅ8¶-kåÜ£°,eÂÖÕ\u008a\"\u007fpÐá\u0085¬y\u001e*Þ\u009f\u0090s|$?\u0099ØJ¶>I\u0093\u008eWÌûy\u000e«Qëå\u0005\bQ[\u0082î\u00852tE«èâ<\u0011OS\u0092\u0085%öIa\u009c¿/çsZ\u0086Y)\u0082|Æ\u0080tÓ¨fê\u008a\u0017O+ã\u009e\u0016LI\fýâ\u0010¶Ceöb*\u0082]Að\u0005$éWà\u008a1=>QÚ\u0084J7\tký\u009e¡18dy\u0098\u0086^Èòw\u0007®Xíì\u001f\u0001YRÊçÝ;sL«áÖ5\u0015FK\u009b\u008c,Â@x\u0095º&×z\t\u008f\u0002 Õu\u0083\u0089rÚ»oé\u0083\u0015ÔKi\u008bºÈÎKc¥´¾Èy÷\u0001[«®3ñ4EÀ¨\u008fûMN\u001e\u0092¤å}H1\u009cËï\u0095-\u0093\u00819t¡+¦\u009fRr\u001d!ß\u0094\u0089H4?ï\u0092 FY5[èÈ_\u009631æýU¢\t\u0011ü\u0012SÄ\u0006\u008cú<©õ\u001c»ðN§\u0005\u001aÅÉ\u008b½.1T\u009dÌh\u001f7B\u0083¦nï=;\u00889TÕ#B\u008e\u0005^Ýòw\u0007ïXèì\u0006\u0001UR\u0089çÊ;9L¤áà5\u0001FK\u009b\u0088,Ì@o\u0095ñ&áz\u0015v}ÚÛ/\u0014pXÄø^Æòv\u0007¨Xþì]\u0001OR\u0093çÍ;9L±áì5\u001fFN\u009bÉ,Ý@d\u0095°&øz\u0002Ô\u0087x$\u008dõÒ¦f\u0004\u008b\rØËmÙ±#Æøk¹¿EÌ\t\u0011Ø¦\u008dÊ<^Þò}\u0007¬Xÿì]\u0001OR\u0083ç\u0080;qL¡áâ5\u0017Fd\u009b\u0087,Ì@{\u0095º&úz\u0010^Þò}\u0007¬Xÿì]\u0001OR\u0083ç\u0080;{L£áí5-F_\u009b\u0081,Ã@e\u0095¶&üz\b^Ýòw\u0007ïXáì\u0016\u0001NR\u008bçË;{Lîáè5\u001cF_\u009b\u0096,Â@\u007f\u0095»&¦z\u0000\u008f_ \u008euÙ\u0089q^Ýòw\u0007ïXèì\u001c\u0001SR\u0091ç\u0080;fL¥áä5\u0007F\u0015\u009b\u0085,Û@r\u0095\u0080&æz\u0010\u008fW \u0086^Ýòw\u0007ïXåì\u0017\u0001QRËçÌ;bL©áå5\u0016F\u0015\u009b\u0082,Ä@x\u0095¸&íz\u0003\u008fJ \u0091uÅ\u0089{Úª^Ýòw\u0007ïXúì\u0001\u0001SR\u0081çÛ;tL´á§5\u0010FN\u009b\u008d,Á@r\u0095ñ&îz\u0018\u008fT \u0084uÉ\u0089gÚ®oõ\u0083\u0019ÔWi\u0096ï\u0000Cª¶2é$]×°\u0092ãLV\u0016\u008a§ý3P6\u0084Ú÷\u008f*U\u009d\u0014ñå$d\u0097<ËÂ>\u0080\u0091[Ä\u00038¸kqÞ32Ãe\u0090^Ýòw\u0007ïXùì\n\u0001OR\u0091çË;zL\u009fáì5\nFO\u009bÊ,Ï@c\u0095¶&äz\u0015\u008f\u0014 \u0085uÅ\u0089{Ú¹oâ\u0083\u0002ÔIi\u0090ºÂÎzc©^Ýòw\u0007ïXüì\u0016\u0001RR\u0081çÁ;eLîáë5\u0007FR\u009b\u0088,É@8\u0095¹&áz\u001f\u008f] \u0086uÞ\u0089eÚ¬oî\u0083\u001eÔMÿjSÀ¦XùKM¡ åó6Fv\u009aÒí(@Z\u0094©çç:>\u008d4áÃ4\u001d\u0087VÛª.é\u0081zÔ}(Ë{\u0007ÎW\"¢uüÈ%\u001bnoÊÂ\u0004\u0015E^\u0095^\u0080ò|\u0007¤Xüì\\\u0001MR\u0080çÃ;bL\u009fáù5\u001bFK\u009b\u0081^\u0080ò|\u0007¤Xüì\\\u0001OR\u008açÍ;|L¥áý5]FY\u009b\u0085,Þ@s\u0095½&éz\u001f\u008f^ ¼uË\u0089pÚ°oþ\u0083\u0014>\u0080\u0092|g¤8ü\u008c\\aO2\u008a\u0087Í[|,¥\u0081ýU]&\\û\u0081LÃ oõ»ZBö¾\u0003f\\>è\u009e\u0005\u008dVHã\u000f?¾Hgå?1\u009fB\u0088\u009fC(\u0002D¡\u0091y^\u0080òk\u0007¸Xùì\\\u0001MR\u0080çÃ;bL\u009fáý5\u0000FZ\u009b\u0087,ÈEié\u0082\u001cQC\u0010÷î\u001a°Iaüh \u0092W@ú\u0002.´]¾\u0080d7&[\u009c\u008ei=\faù\u0094¿;fn*\u0092\u009fÁht\n\u0098üÏ²r~¡%Õ¢xE¯\nÓË\u0006¤µ&Ø0\f\u0095^\u0080ò|\u0007¤Xüì\\\u0001^R\u0096çÚ;HL§áù5\u0001Ëog\u0093\u0092KÍ\u0013y³\u0094±Çyr5®§Ù[t\u000f ðÓ±ß\u0088st\u0086¬ÙômT\u0080GÓ\u0082fÅºtÍ\u00ad`õ´UÇQ\u001a\u009f\u00adÑÁx\u0014¸§ìû\u001d\u000eW¡\u0099ôÀ\u0092\u0093>xË«\u0094ê \u0014ÍJ\u009e\u009b+\u0092÷h\u0080º-øùN\u008aDW\u009eàÜ\u008cgY¿êï¶\u0004CFì\u009c¹ÛEc\u0016¿£ËO\t\u0018D¥\u0098v\u0096\u0002t¯¡^\u0080ò|\u0007¤Xüì\\\u0001^R\u0096çÚ;vL£áê5\u0017\u0010\u0002¼þI&\u0016~¢ÞOÜ\u001c\u0014©Xuò\u0002;¯y{\u009f^\u0080ò|\u0007¤Xüì\\\u0001^R\u0096çÚ;zL¥áî5\u001cyÿÕ\u0003 Û\u007f\u0083Ë#&!uéÀ¥\u001c\u0007kÍÆ\u009f\u0012hÉ\u0013eï\u00907Ïo{Ï\u0096ÍÅ\u0005pI¬òÛ>vi¢\u0086^\u0080ò|\u0007¤Xüì\\\u0001^R\u0096çÚ;gL§áè5\u001bFK\u009b\u0087^\u0080ò|\u0007¤Xüì\\\u0001^R\u0096çÚ;HL©áä5\u00174R\u0098®mr2,\u0086ÀkÁ8S\u008d\u0013Q²&|\u008b7_Ï,\u0088ñRF\f*ëÿ#L\"\u0010ÁåÇJS\u001f\rã³°g^\u0080òu\u0007¯Xþì\\\u0001KR\u008cçÀ;sL¯áþ5\u0001F\u0014\u009b¦,Þ@b\u0095\u008c&àz\u0010\u008fH \u0086uÈ\u0089SÚ±oë\u0083\u0014Ô\\i\u0090k\u0012Çú2!mwÙ\u00824\u0081g\u001eÒS\u000eõy=Ôi\u0000\u0094sÚ^\u009fò~\u0007§XªìIv¦ÚN/\u0095pÃÄ6)5z°Ïí\u0013]d\u0080É\u0080\u001d9n|³²\u0004øØ]tÿ\u00815Þsj\u008a\u0087ÆÔ\u0013a\u0015½åÊ:gp³\u0083ÀÈ\u001d\u0018ªKÆë\u0013d nü\u008bFËêy\u001f«@Åô7\u0019qJ¾ÿù#}T»ùõ-T^@\u0083\u0083^\u0080ò}\u0007µXéì\\\u0001QR\u0080çÊ;~L¡áÖ5\u0011FT\u009b\u0080,È@u\u0095¬&¦z\t\u008fW \u008f^Íòt\u0007´Xïì\u0000\u0001HR\u0084çÍ;|L³½K\u0011¶ä~»\"\u000f\u0097â\u009a±A\u0004\u0010Ø²¯\u007f\u00021\u0096I:µÏi\u00907$ÛÉÚ\u009aH/\bó©\u0084g),ýÔ\u008e\u0093SIä\u0017\u0088ð]8î%²ÈGÜèK½\u0015A¬\u0012d§`KÁ\u001c\u009d¡G\u008dz!\u0092ÔI\u008b\u001f?êÒé\u0081|4$è\u0098\u009fS2\u001dæî\u0095®V$ú»\u000faP\"äÙ\t\u0099ZZï\n^\u0080ò|\u0007 Xþì\u0012\u0001\u0013R\u0088çÇ;dL£á¦5\u0002FI\u009b\u008b,Ë@\u007f\u0095³&íz\u0002\u008f\u0015 \u0080uÙ\u0089gÚño·\u0083_ÔZi\u008dºÆÎ:c°´ïÈ,\u001dJ®\u008eÃÜ\u0017z¨®ýñ\u0011`¢Z÷\u0085\bÄ\\gñ²\u0002éV(".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
            values = cArr;
            DigitizedCardProfile = 481823309743190552L;
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123};
            $$e = 71;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0b83  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0c5b  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0d1d  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0deb  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x258c A[Catch: all -> 0x01c9, TryCatch #4 {all -> 0x01c9, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0127, B:18:0x01ef, B:21:0x0284, B:25:0x0233, B:30:0x0310, B:32:0x0323, B:33:0x036b, B:41:0x0434, B:43:0x046e, B:44:0x04c1, B:47:0x04d7, B:49:0x04e6, B:50:0x052b, B:56:0x05dd, B:58:0x062c, B:59:0x0681, B:79:0x078a, B:82:0x081e, B:85:0x07c8, B:90:0x08e3, B:92:0x08f6, B:93:0x0947, B:101:0x0a11, B:103:0x0a5c, B:104:0x0ab0, B:108:0x0aea, B:110:0x0afd, B:111:0x0b48, B:118:0x0ba3, B:121:0x0c45, B:124:0x0bef, B:140:0x0d3d, B:142:0x0d7e, B:143:0x0dd5, B:147:0x0e0d, B:149:0x0e20, B:150:0x0e6a, B:156:0x0ec5, B:158:0x0f00, B:159:0x0f53, B:163:0x0fb3, B:165:0x0fc6, B:166:0x101a, B:172:0x1222, B:175:0x12c7, B:178:0x1276, B:180:0x12de, B:182:0x12ed, B:183:0x1332, B:187:0x13f2, B:190:0x1482, B:193:0x142c, B:195:0x1499, B:197:0x14b1, B:198:0x14f8, B:204:0x15c1, B:206:0x1600, B:207:0x165a, B:211:0x1696, B:213:0x16a9, B:214:0x16f6, B:216:0x16ff, B:218:0x171d, B:219:0x1773, B:224:0x2579, B:226:0x258c, B:227:0x25d6, B:238:0x29bf, B:240:0x29d2, B:241:0x2a21, B:246:0x2aee, B:248:0x2b01, B:249:0x2b50, B:259:0x2c27, B:261:0x2c6a, B:262:0x2cbd, B:293:0x2f4e, B:295:0x2f9c, B:296:0x2ff2, B:314:0x30db, B:316:0x311e, B:317:0x3177, B:321:0x31b6, B:323:0x31c9, B:324:0x3218, B:328:0x32e1, B:330:0x3311, B:331:0x3365, B:335:0x3393, B:337:0x33d9, B:338:0x3429, B:372:0x25e4, B:374:0x2602, B:375:0x2653, B:382:0x20ed, B:384:0x2100, B:385:0x2155, B:392:0x2171, B:394:0x2184, B:395:0x21d6, B:411:0x2307, B:413:0x234f, B:414:0x23a4, B:419:0x24a7, B:422:0x2539, B:425:0x24e7, B:427:0x23d3, B:429:0x241b, B:430:0x246e, B:435:0x110a, B:437:0x111d, B:438:0x1170), top: B:5:0x00cf }] */
        /* JADX WARN: Removed duplicated region for block: B:229:0x25df  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x2e9d  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x2f36  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x3008  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x30c3  */
        /* JADX WARN: Removed duplicated region for block: B:320:0x318d  */
        /* JADX WARN: Removed duplicated region for block: B:363:0x2f33 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:372:0x25e4 A[Catch: all -> 0x01c9, TryCatch #4 {all -> 0x01c9, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0127, B:18:0x01ef, B:21:0x0284, B:25:0x0233, B:30:0x0310, B:32:0x0323, B:33:0x036b, B:41:0x0434, B:43:0x046e, B:44:0x04c1, B:47:0x04d7, B:49:0x04e6, B:50:0x052b, B:56:0x05dd, B:58:0x062c, B:59:0x0681, B:79:0x078a, B:82:0x081e, B:85:0x07c8, B:90:0x08e3, B:92:0x08f6, B:93:0x0947, B:101:0x0a11, B:103:0x0a5c, B:104:0x0ab0, B:108:0x0aea, B:110:0x0afd, B:111:0x0b48, B:118:0x0ba3, B:121:0x0c45, B:124:0x0bef, B:140:0x0d3d, B:142:0x0d7e, B:143:0x0dd5, B:147:0x0e0d, B:149:0x0e20, B:150:0x0e6a, B:156:0x0ec5, B:158:0x0f00, B:159:0x0f53, B:163:0x0fb3, B:165:0x0fc6, B:166:0x101a, B:172:0x1222, B:175:0x12c7, B:178:0x1276, B:180:0x12de, B:182:0x12ed, B:183:0x1332, B:187:0x13f2, B:190:0x1482, B:193:0x142c, B:195:0x1499, B:197:0x14b1, B:198:0x14f8, B:204:0x15c1, B:206:0x1600, B:207:0x165a, B:211:0x1696, B:213:0x16a9, B:214:0x16f6, B:216:0x16ff, B:218:0x171d, B:219:0x1773, B:224:0x2579, B:226:0x258c, B:227:0x25d6, B:238:0x29bf, B:240:0x29d2, B:241:0x2a21, B:246:0x2aee, B:248:0x2b01, B:249:0x2b50, B:259:0x2c27, B:261:0x2c6a, B:262:0x2cbd, B:293:0x2f4e, B:295:0x2f9c, B:296:0x2ff2, B:314:0x30db, B:316:0x311e, B:317:0x3177, B:321:0x31b6, B:323:0x31c9, B:324:0x3218, B:328:0x32e1, B:330:0x3311, B:331:0x3365, B:335:0x3393, B:337:0x33d9, B:338:0x3429, B:372:0x25e4, B:374:0x2602, B:375:0x2653, B:382:0x20ed, B:384:0x2100, B:385:0x2155, B:392:0x2171, B:394:0x2184, B:395:0x21d6, B:411:0x2307, B:413:0x234f, B:414:0x23a4, B:419:0x24a7, B:422:0x2539, B:425:0x24e7, B:427:0x23d3, B:429:0x241b, B:430:0x246e, B:435:0x110a, B:437:0x111d, B:438:0x1170), top: B:5:0x00cf }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0772  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0834  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
            java.lang.Integer num;
            java.lang.String str;
            int i4;
            java.lang.String str2;
            int i5;
            int i6;
            java.lang.String str3;
            int i7;
            int i8;
            int i9;
            java.lang.String str4;
            int i10;
            java.lang.String str5;
            long j;
            int i11;
            java.lang.Object[] objArr;
            char c;
            java.lang.String[][] strArr;
            int i12;
            int i13;
            java.lang.String str6;
            int i14;
            java.util.ArrayList arrayList;
            java.lang.String str7;
            java.lang.Object obj;
            java.lang.Object invoke;
            java.lang.String str8;
            int i15;
            int i16;
            java.lang.String str9;
            char c2;
            int i17;
            int i18;
            int i19;
            java.lang.String intern;
            java.io.File file;
            java.lang.String next;
            java.lang.String[][] strArr2;
            java.lang.String[] strArr3;
            java.lang.String str10;
            java.lang.String next2;
            int i20;
            int i21;
            java.lang.String next3;
            java.lang.String str11;
            int i22 = 0;
            java.lang.Integer num2 = 0;
            int i23 = 1;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(465 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf("", "", 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24235), 27 - (android.os.Process.myTid() >> 22), objArr3);
            java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 27, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26, objArr4);
            java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(52 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 19, objArr5);
            java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(70 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 28, objArr6);
            java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr6[0]).intern()};
            int i24 = 0;
            while (true) {
                if (i24 >= 4) {
                    num = num2;
                    str = "";
                    i4 = i;
                    break;
                }
                try {
                    java.lang.Object[] objArr7 = {strArr4[i24]};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 36, 3161 - android.text.TextUtils.indexOf("", ""), (char) (33099 - android.graphics.Color.argb(i22, i22, i22, i22)));
                        byte b = $$a[2];
                        java.lang.Object[] objArr8 = new java.lang.Object[i23];
                        b(35, b, b, objArr8);
                        java.lang.String str12 = (java.lang.String) objArr8[i22];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[i23];
                        clsArr[i22] = java.lang.String.class;
                        obj2 = cls.getMethod(str12, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr7)).longValue();
                    long j2 = i;
                    long j3 = ~j2;
                    num = num2;
                    long j4 = ~longValue;
                    long j5 = ~(j2 | j4 | 294568847);
                    str = "";
                    long j6 = ((-712) * longValue) + 210322156758L + (((~(longValue | (-294568848))) | (~(j3 | (-294568848))) | j5) * (-713)) + (j5 * 1426) + ((~(j4 | j3)) * 713) + 612901891;
                    int i25 = ~i;
                    if (((((int) j6) & ((((~(1399174495 | i25)) | 38051914) * (-591)) + 1593179866 + ((1399174495 | i) * 591))) | (((int) (j6 >> 32)) & ((((1426587976 | i) * 988) - 766717854) + (((~(1431841144 | i25)) | 132098) * (-1976)) + (((~((-5385267) | i)) | 1426587976 | (~(5385266 | i25))) * 988)))) != 0) {
                        i4 = i ^ (i24 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                        break;
                    }
                    i24++;
                    num2 = num;
                    i22 = 0;
                    i23 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i26 = 3;
            if (i4 != i) {
                java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-349990451) | i)) | 71331346) * 345) - 1116420824) + (((~((-349990451) | (~i))) | 1629524301) * 345) + ((~(i | (-71331347))) * 345))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    byte[] bArr = $$a;
                    byte b2 = bArr[2];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(b2, (byte) (-bArr[16]), b2, objArr11);
                    obj3 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
                return objArr9;
            }
            java.lang.String str13 = str;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            a(97 - android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 12 - android.text.TextUtils.getTrimmedLength(str13), objArr12);
            java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            a(android.view.View.MeasureSpec.getSize(0) + 110, (char) android.view.KeyEvent.keyCodeFromString(str13), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, objArr13);
            java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0), (-16777198) - android.graphics.Color.rgb(0, 0, 0), objArr14);
            java.lang.String[] strArr5 = {intern6, intern7, ((java.lang.String) objArr14[0]).intern()};
            int i27 = 0;
            while (true) {
                if (i27 >= i26) {
                    str2 = str13;
                    i5 = i;
                    break;
                }
                java.lang.Object[] objArr15 = {strArr5[i27]};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3161, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 33100));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b(653, bArr2[2], bArr2[14], objArr16);
                    obj4 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj4);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr15)).longValue();
                long j7 = ~longValue2;
                str2 = str13;
                long j8 = i;
                long j9 = ((((((-590) * longValue2) - 447596632064L) + ((~(longValue2 | 756075391)) * (-1182))) + (((~((756075391 | j7) | (~j8))) | (~(longValue2 | (-756075392)))) * (-591))) + (((756075391 | j8) | j7) * 591)) - 581592716;
                int i28 = (~((-853088133) | i)) | 584128004;
                int i29 = ~i;
                if (((((int) j9) & ((((~(787832545 | i29)) | 2069908340) * (-1042)) + 804331904 + ((787832545 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(2146787317 | i29)) | (~((-2069908341) | i)) | 710953568) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j9 >> 32)) & ((i28 * 992) + 1537498186 + ((i28 | (~(853098406 | i29))) * (-496)) + ((584138278 | i) * 496)))) != 0) {
                    i5 = (i27 + 270) ^ i;
                    break;
                }
                i27++;
                str13 = str2;
                i26 = 3;
            }
            if (i5 != i) {
                java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
                java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~((-270148610) | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 324455392 + (((~((~i) | (-270148610))) | 1612728424) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[2];
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b(b3, (byte) (-bArr3[16]), b3, objArr19);
                    obj5 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                }
                ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
                return objArr17;
            }
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
            if (obj6 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 26, 1864 - android.text.TextUtils.indexOf(str2, str2), (char) (41774 - android.os.Process.getGidForName(str2)));
                byte[] bArr4 = $$a;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                b(653, bArr4[2], bArr4[14], objArr20);
                obj6 = cls5.getMethod((java.lang.String) objArr20[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj6);
            }
            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, null)).longValue();
            long j10 = ~longValue3;
            long j11 = i;
            long j12 = ~j11;
            java.lang.String str14 = str2;
            long j13 = ((((((-209) * longValue3) + 269323427351L) + ((~(j10 | 1288628838)) * 210)) + (((~(j10 | j12)) | (~(j11 | 1288628838))) * 210)) + (((~((1288628838 | j12) | longValue3)) | (~((j10 | (-1288628839)) | j11))) * 210)) - 640584023;
            int i30 = ~i;
            int i31 = (((int) (j13 >> 32)) & ((((~(1256078249 | i)) | 181148161) * (-756)) + 538898826 + ((1256078249 | i30) * 756))) | (((int) j13) & (((((~(499657168 | i30)) | 937569241) * (-865)) - 600405314) + ((~((-499657169) | i)) * 865) + (((~(937569241 | i30)) | (~((-499657169) | i30))) * 865)));
            int i32 = i31 != 0 ? (i31 + 199) ^ i : i;
            if (i32 != i) {
                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i32}, null, null, new int[1]};
                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1005974876) | i30)) | (~((-1044871223) | i))) * 1900) - 632760965) + (((~(1044871222 | i30)) | (~(1005974875 | i))) * (-950)) + (((~(i | 1044871222)) | (~(i30 | 1005974875))) * 950))};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj7 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                    byte[] bArr5 = $$a;
                    byte b4 = bArr5[2];
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    b(b4, (byte) (-bArr5[16]), b4, objArr23);
                    obj7 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                }
                ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                return objArr21;
            }
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 141, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 20, objArr24);
            java.lang.String intern8 = ((java.lang.String) objArr24[0]).intern();
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            a(161 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59574), 6 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr25);
            java.lang.String intern9 = ((java.lang.String) objArr25[0]).intern();
            java.io.File file2 = new java.io.File(intern8);
            if (file2.exists()) {
                int i33 = valueOf + 109;
                AlternateContactlessPaymentDataJson = i33 % 128;
                if (i33 % 2 == 0) {
                    file2.isFile();
                    throw new java.lang.ArithmeticException();
                }
                if (file2.isFile()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(167 - (android.os.Process.myTid() >> 22), (char) (18760 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1 - android.os.Process.getGidForName(str14), objArr26);
                        java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr26[0]).intern());
                        if (useDelimiter.hasNext()) {
                            int i34 = AlternateContactlessPaymentDataJson + 91;
                            valueOf = i34 % 128;
                            if (i34 % 2 != 0) {
                                useDelimiter.next();
                                throw new java.lang.ArithmeticException();
                            }
                            str11 = useDelimiter.next();
                        } else {
                            str11 = str14;
                        }
                        useDelimiter.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (str11.contains(intern9)) {
                        i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                        if (i6 == i) {
                            java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1572398913) | i)) | 478447185) * (-366)) + 972905745 + (((~(i | (-1094213889))) | 262161) * 366))};
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj8 == null) {
                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str14, str14, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                byte[] bArr6 = $$a;
                                byte b5 = bArr6[2];
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b(b5, (byte) (-bArr6[16]), b5, objArr29);
                                obj8 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                            }
                            ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                            return objArr27;
                        }
                        java.lang.String str15 = str14;
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(168 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.normalizeMetaState(0), android.view.KeyEvent.normalizeMetaState(0) + 31, objArr30);
                        java.lang.String intern10 = ((java.lang.String) objArr30[0]).intern();
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        a(201 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (15853 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.view.View.resolveSizeAndState(0, 0, 0) + 23, objArr31);
                        java.lang.String intern11 = ((java.lang.String) objArr31[0]).intern();
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        a(223 - android.view.View.resolveSize(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, objArr32);
                        java.lang.String intern12 = ((java.lang.String) objArr32[0]).intern();
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        a(251 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29248), android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, objArr33);
                        java.lang.String[] strArr6 = {intern10, intern11, intern12, ((java.lang.String) objArr33[0]).intern()};
                        int i35 = 0;
                        while (true) {
                            if (i35 >= 4) {
                                str3 = str15;
                                i7 = i;
                                break;
                            }
                            AlternateContactlessPaymentDataJson = (valueOf + 97) % 128;
                            java.lang.Object[] objArr34 = {strArr6[i35]};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                            if (obj9 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, 3161 - android.view.View.combineMeasuredStates(0, 0), (char) (33099 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                byte[] bArr7 = $$a;
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                b(653, bArr7[2], bArr7[14], objArr35);
                                obj9 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj9);
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr34)).longValue();
                            long j14 = ~longValue4;
                            int i36 = i35;
                            str3 = str15;
                            long j15 = (((((319 * longValue4) - 185693276619L) + (((~((j14 | (-585783208)) | j11)) | (~((j12 | 585783207) | longValue4))) * (-318))) + (((~(585783207 | j14)) | (~(585783207 | j11))) * (-318))) + (((~((-585783208) | j11)) | j14) * 318)) - 1923451315;
                            if (((((int) j15) & ((((~(659779844 | i30)) | (-794293670)) * (-241)) + 646342671 + (((~((-134513826) | i30)) | 16847104) * 241))) | (((int) (j15 >> 32)) & (((((~((-179238094) | i30)) | (~(1258288349 | i))) * (-831)) - 1651012166) + ((~((-300033) | i)) * (-1662)) + (((~((-1257988318) | i30)) | (~(1257988317 | i)) | (~(179238093 | i))) * 831)))) != 0) {
                                i7 = (i36 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i;
                                break;
                            }
                            i35 = i36 + 1;
                            str15 = str3;
                        }
                        if (i7 != i) {
                            java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-176559635) | i30)) | (~(1874286463 | i))) * (-272)) - 1737456959) + (((~((-781604443) | i)) | 605044808) * (-272)) + (((~(i | 781604442)) | 1269241655) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj10 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                byte[] bArr8 = $$a;
                                byte b6 = bArr8[2];
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                b(b6, (byte) (-bArr8[16]), b6, objArr38);
                                obj10 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                            }
                            ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr37)).intValue();
                            return objArr36;
                        }
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 266, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, objArr39);
                        java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj11 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 40, 1922 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                            byte[] bArr9 = $$a;
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            b(653, bArr9[2], bArr9[14], objArr41);
                            obj11 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                        }
                        java.lang.String str16 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr40);
                        if (str16 != null) {
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            a(android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0), 9 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr42);
                            if (str16.contains(((java.lang.String) objArr42[0]).intern())) {
                                i8 = i ^ 250;
                                if (i8 == i) {
                                    valueOf = (AlternateContactlessPaymentDataJson + 109) % 128;
                                    java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                                    java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-4198035) | i30)) | (~(2046648063 | i))) * (-272)) + 2128269409 + (((~((-425533176) | i)) | 421335141) * (-272)) + (((~(i | 425533175)) | 1625312922) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj12 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str3), 2713 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                        byte[] bArr10 = $$a;
                                        byte b7 = bArr10[2];
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        b(b7, (byte) (-bArr10[16]), b7, objArr45);
                                        obj12 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                    }
                                    ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr44)).intValue();
                                    return objArr43;
                                }
                                java.lang.String str17 = str3;
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                a(android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, objArr46);
                                java.lang.String intern13 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 303, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 6 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr47);
                                java.lang.String intern14 = ((java.lang.String) objArr47[0]).intern();
                                java.io.File file3 = new java.io.File(intern13);
                                if (file3.exists() && file3.isFile()) {
                                    try {
                                        java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 167, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 18760), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '.', objArr48);
                                        java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr48[0]).intern());
                                        next3 = useDelimiter2.hasNext() ? useDelimiter2.next() : str17;
                                        useDelimiter2.close();
                                    } catch (java.io.IOException unused2) {
                                    }
                                    if (next3.contains(intern14)) {
                                        int i37 = valueOf + 47;
                                        AlternateContactlessPaymentDataJson = i37 % 128;
                                        i9 = i37 % 2 == 0 ? i ^ 32097 : i ^ 251;
                                        if (i9 == i) {
                                            AlternateContactlessPaymentDataJson = (valueOf + 5) % 128;
                                            java.lang.Object[] objArr49 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                            java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1035788839) | i30)) | (~(1015057259 | i))) * 959) - 650868021) + (((~(i | (-1035788839))) | (~(i30 | 1015057259))) * 959))};
                                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj13 == null) {
                                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                                byte[] bArr11 = $$a;
                                                byte b8 = bArr11[2];
                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                b(b8, (byte) (-bArr11[16]), b8, objArr51);
                                                obj13 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                                            }
                                            ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr50)).intValue();
                                            return objArr49;
                                        }
                                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                                        a((android.os.Process.myPid() >> 22) + 310, (char) android.view.View.MeasureSpec.getMode(0), android.graphics.Color.alpha(0) + 23, objArr52);
                                        java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj14 == null) {
                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1921 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.MotionEvent.axisFromString(str17) + 1));
                                            byte[] bArr12 = $$a;
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            b(653, bArr12[2], bArr12[14], objArr54);
                                            obj14 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                                        }
                                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr53)).toLowerCase();
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        a(333 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - android.view.MotionEvent.axisFromString(str17)), android.text.TextUtils.indexOf(str17, str17, 0, 0) + 4, objArr55);
                                        int i38 = lowerCase.contains(((java.lang.String) objArr55[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                                        if (i38 != i) {
                                            java.lang.Object[] objArr56 = {new int[]{i}, new int[]{i38}, null, null, new int[1]};
                                            int i39 = ~(i | (-2050792999));
                                            java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-2050792999) | i30)) | 2050756612) * (-245)) + 1970947720 + (i39 * (-245)) + ((i39 | 53099) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj15 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) android.graphics.Color.blue(0));
                                                byte[] bArr13 = $$a;
                                                byte b9 = bArr13[2];
                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                b(b9, (byte) (-bArr13[16]), b9, objArr58);
                                                obj15 = cls14.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                            }
                                            ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr57)).intValue();
                                            return objArr56;
                                        }
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        a(android.view.MotionEvent.axisFromString(str17) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr59);
                                        java.lang.String intern15 = ((java.lang.String) objArr59[0]).intern();
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        a(337 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.os.Process.getGidForName(str17) + 45846), 5 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr60);
                                        java.lang.Object[] objArr61 = {intern15, ((java.lang.String) objArr60[0]).intern()};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj16 == null) {
                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39, android.graphics.Color.green(0) + 2213, (char) ((-1) - android.text.TextUtils.indexOf(str17, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                            byte[] bArr14 = $$a;
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            b(653, bArr14[2], bArr14[14], objArr62);
                                            obj16 = cls15.getMethod((java.lang.String) objArr62[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj16);
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr61)).longValue();
                                        long j16 = ((((((-271) * longValue5) + 166209121806L) + (((~(((~longValue5) | (-608824623)) | j12)) | (~((608824622 | longValue5) | j11))) * (-272))) + (((~((-608824623) | longValue5)) | (~((-608824623) | j11))) * (-272))) + (((~(608824622 | j11)) | longValue5) * 272)) - 1344199224;
                                        int i40 = (int) (j16 >> 32);
                                        int i41 = ~((-913000610) | i30);
                                        int i42 = (int) j16;
                                        int i43 = ~((-1538637898) | i30);
                                        if (((i40 & ((((1098916114 | i41) * (-970)) - 416929818) + ((i41 | (-2011916724)) * 970))) | ((((((~(101411487 | i30)) | (-1606413024)) * (-1188)) - 777866043) + (((~((-101411488) | i)) | (-1606413024) | i43) * 594) + ((i43 | (~((-101411488) | i30)) | 33636361) * 594)) & i42)) != 0) {
                                            i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                            str4 = str17;
                                        } else {
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            a(android.view.KeyEvent.keyCodeFromString(str17) + 343, (char) (14574 - android.widget.ExpandableListView.getPackedPositionType(0L)), 14 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr63);
                                            java.lang.String intern16 = ((java.lang.String) objArr63[0]).intern();
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 356, (char) ((-1) - android.text.TextUtils.indexOf(str17, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 10 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr64);
                                            java.lang.Object[] objArr65 = {intern16, ((java.lang.String) objArr64[0]).intern()};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                            if (obj17 == null) {
                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2213, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                byte[] bArr15 = $$a;
                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                b(653, bArr15[2], bArr15[14], objArr66);
                                                obj17 = cls16.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj17);
                                            }
                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr65)).longValue();
                                            long j17 = ~longValue6;
                                            str4 = str17;
                                            long j18 = (((((319 * longValue6) + 96585473729L) + (((~((j12 | (-304686037)) | longValue6)) | (~((j17 | 304686036) | j11))) * (-318))) + (((~((-304686037) | j17)) | (~((-304686037) | j11))) * (-318))) + (((~(304686036 | j11)) | j17) * 318)) - 430688565;
                                            i10 = ((((int) (j18 >> 32)) & ((((((~(908160730 | i30)) | 529065680) * (-328)) + (-604819646)) + ((529065680 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)) + ((((~((-908160731) | i)) | 369125072) | (~(1068101338 | i30))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) j18) & ((((1878522847 | i30) * 494) + (-815959401)) + (((~(256334813 | i30)) | 1807149658) * 494)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                                        }
                                        if (i10 != i) {
                                            java.lang.Object[] objArr67 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                                            java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-71405971) | i)) | (~((-1101531718) | i30))) * 920) + 763079801 + (((~((-877908411) | i30)) | 71405970) * 920) + (((~(i30 | (-71405971))) | (~((-806502441) | i)) | (~((-1101531718) | i))) * 920))};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj18 == null) {
                                                java.lang.String str18 = str4;
                                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str18, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.text.TextUtils.getOffsetAfter(str18, 0));
                                                byte[] bArr16 = $$a;
                                                byte b10 = bArr16[2];
                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                b(b10, (byte) (-bArr16[16]), b10, objArr69);
                                                obj18 = cls17.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                            }
                                            ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr68)).intValue();
                                            return objArr67;
                                        }
                                        java.lang.String str19 = str4;
                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                        if (obj19 == null) {
                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str19, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45, 2763 - android.graphics.Color.blue(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                            byte[] bArr17 = $$a;
                                            java.lang.Object[] objArr70 = new java.lang.Object[1];
                                            b(653, bArr17[2], bArr17[14], objArr70);
                                            obj19 = cls18.getMethod((java.lang.String) objArr70[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj19);
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, null)).longValue();
                                        long j19 = ~((-56269652) | longValue7);
                                        long j20 = ~longValue7;
                                        long j21 = ((989 * longValue7) - 111132560725L) + ((j11 | j19) * 988) + (((~(j20 | 56269651)) | (~(j12 | 56269651))) * (-1976)) + (((~(j20 | j11)) | j19 | (~(j12 | longValue7))) * 988) + 68767112;
                                        if (((((int) j21) & ((((((~(i30 | 278058049)) | 1714235818) | (~((-277009409) | i))) * 717) - 1431784947) + (((~(278058049 | i)) | (~(i30 | (-277009409))) | 1714235818) * 717))) | (((int) (j21 >> 32)) & ((((~(i30 | 1672984616)) | 1184756268) * (-865)) + 26500398 + ((~((-1672984617) | i)) * 865) + (((~(i30 | (-1672984617))) | (~(i30 | 1184756268))) * 865)))) == 1) {
                                            java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                            java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~r2) | 37781666) * (-828)) - 655634803) + ((i30 | 2013064431) * (-828))) - 370038848)};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj20 == null) {
                                                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2713 - android.text.TextUtils.getTrimmedLength(str19), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                byte[] bArr18 = $$a;
                                                byte b11 = bArr18[2];
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                b(b11, (byte) (-bArr18[16]), b11, objArr73);
                                                obj20 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                            }
                                            ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr72)).intValue();
                                            return objArr71;
                                        }
                                        java.lang.Object[] objArr74 = {1};
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                        if (obj21 == null) {
                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 27, 2364 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            byte[] bArr19 = $$a;
                                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                                            b(653, bArr19[2], bArr19[14], objArr75);
                                            obj21 = cls20.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj21);
                                        }
                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr74)).longValue();
                                        long j22 = ((-271) * longValue8) + 288730039143L + (((~((-1057619192) | (~longValue8) | j12)) | (~(1057619191 | longValue8 | j11))) * (-272)) + (((~((-1057619192) | longValue8)) | (~((-1057619192) | j11))) * (-272)) + ((longValue8 | (~(1057619191 | j11))) * 272) + 350291008;
                                        int i44 = ((((int) (j22 >> 32)) & ((((((~(i30 | (-1092611245))) | 344615166) * (-602)) + 900628786) + ((((~((-1092611245) | i)) | 682156) | (~(i30 | 1436544254))) * (-301))) + ((~(i30 | 344615166)) * 301))) | (((int) j22) & ((((((~(i30 | 1099190658)) | (~((-262147) | i))) * (-831)) + 1698205680) + ((~((-337773606) | i)) * (-1662))) + ((((~(i30 | 338035751)) | (~((-338035752) | i))) | (~((-1099190659) | i))) * 831)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                        if (i44 != i) {
                                            java.lang.Object[] objArr76 = {new int[]{i}, new int[]{i44}, null, null, new int[1]};
                                            java.lang.Object[] objArr77 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((i30 | 209748002) * 1324) + 1600395419 + (((~(1303431459 | i)) | (~(747414638 | i))) * (-1324)) + 1916970270)};
                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj22 == null) {
                                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                byte[] bArr20 = $$a;
                                                byte b12 = bArr20[2];
                                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                b(b12, (byte) (-bArr20[16]), b12, objArr78);
                                                obj22 = cls21.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                            }
                                            ((int[]) objArr76[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr77)).intValue();
                                            return objArr76;
                                        }
                                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                                        a(310 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, objArr79);
                                        java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj23 == null) {
                                            str5 = str19;
                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter(str5, 0), 1921 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                            byte[] bArr21 = $$a;
                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                            b(653, bArr21[2], bArr21[14], objArr81);
                                            obj23 = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj23);
                                        } else {
                                            str5 = str19;
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj23).invoke(null, objArr80);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr82 = {invoke2, 42};
                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj24 == null) {
                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.getTrimmedLength(str5) + 2594, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                byte[] bArr22 = $$a;
                                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                b(653, bArr22[2], bArr22[14], objArr83);
                                                obj24 = cls23.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj24);
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr82)).longValue();
                                            long j23 = longValue9 | j11;
                                            long j24 = (((-929) * longValue9) - 100849512368L) + (((~j23) | (-217348088)) * (-465)) + (((~((-217348088) | j11)) | longValue9) * 930) + ((j23 | (-217348088)) * 465) + 1039752437;
                                            if (((((int) j24) & ((((~(i30 | (-2115919004))) | (-741821883)) * (-983)) + 1665064808 + (((~(i30 | (-741821883))) | 2162976) * 983))) | (((int) (j24 >> 32)) & (((((~((-606424940) | i)) | (-830801472)) * (-318)) - 1195034030) + (((~((-830801472) | i)) | (~(i30 | 900026239))) * 318) + (((~(i30 | (-293601301))) | (~(900026239 | i))) * 318)))) == 1986687685) {
                                                i11 = i;
                                                j = j12;
                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 446, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr84);
                                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), 1921 - android.view.View.getDefaultSize(0, 0), (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                    byte[] bArr23 = $$a;
                                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                    b(653, bArr23[2], bArr23[14], objArr86);
                                                    obj = cls24.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                                }
                                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr85);
                                                if (invoke != null) {
                                                    str8 = str5;
                                                    i15 = i11;
                                                    i16 = 0;
                                                } else {
                                                    java.lang.Object[] objArr87 = {invoke, 42};
                                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj25 == null) {
                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 28, android.view.KeyEvent.getDeadChar(0, 0) + 2594, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                        byte[] bArr24 = $$a;
                                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                        b(653, bArr24[2], bArr24[14], objArr88);
                                                        obj25 = cls25.getMethod((java.lang.String) objArr88[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                    }
                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr87)).longValue();
                                                    long j25 = ~((-959833591) | longValue10);
                                                    long j26 = ~longValue10;
                                                    str8 = str5;
                                                    long j27 = ~(j26 | 959833590);
                                                    long j28 = ((longValue10 * 263) - 501992967570L) + ((j25 | j27 | (~(j26 | j11))) * 262) + ((-786) * j27) + ((j27 | (~(j26 | j)) | j25) * 262) + 297266934;
                                                    i15 = i;
                                                    i16 = (((int) j28) & (((((~(i30 | 1004164062)) | 433062347) * (-933)) - 1699181802) + (((~(i30 | 433062347)) | 571101716) * 933) + 320242994)) | (((int) (j28 >> 32)) & (((~(5514069 | i15)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1437334350 + (((~(i30 | 5514069)) | 5513813) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)));
                                                }
                                                if (i16 != 1986687685 || i16 == -1514516938) {
                                                    str9 = str8;
                                                } else {
                                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                    a(1162 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str8, 0), 14 - android.view.View.getDefaultSize(0, 0), objArr89);
                                                    java.lang.String intern17 = ((java.lang.String) objArr89[0]).intern();
                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                    a(1175 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 26 - android.graphics.Color.red(0), objArr90);
                                                    java.lang.String intern18 = ((java.lang.String) objArr90[0]).intern();
                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                    a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1202, (char) (24575 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr91);
                                                    java.lang.String intern19 = ((java.lang.String) objArr91[0]).intern();
                                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                    a(1218 - android.view.View.MeasureSpec.getMode(0), (char) (1218 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 16 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr92);
                                                    java.lang.String intern20 = ((java.lang.String) objArr92[0]).intern();
                                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                    a(android.graphics.Color.blue(0) + 1235, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 15 - android.view.View.resolveSizeAndState(0, 0, 0), objArr93);
                                                    java.lang.String intern21 = ((java.lang.String) objArr93[0]).intern();
                                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1251, (char) (android.text.TextUtils.indexOf(str8, str8) + 7145), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, objArr94);
                                                    java.lang.String intern22 = ((java.lang.String) objArr94[0]).intern();
                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1287, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), '<' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr95);
                                                    java.lang.String intern23 = ((java.lang.String) objArr95[0]).intern();
                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                    a(1300 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (38383 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr96);
                                                    java.lang.String intern24 = ((java.lang.String) objArr96[0]).intern();
                                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                    a(1312 - android.view.View.resolveSize(0, 0), (char) (33032 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 22 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr97);
                                                    java.lang.String intern25 = ((java.lang.String) objArr97[0]).intern();
                                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                    a(1333 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52243), android.graphics.ImageFormat.getBitsPerPixel(0) + 32, objArr98);
                                                    java.lang.String intern26 = ((java.lang.String) objArr98[0]).intern();
                                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1365, (char) android.view.View.getDefaultSize(0, 0), (android.os.Process.myPid() >> 22) + 12, objArr99);
                                                    java.lang.String intern27 = ((java.lang.String) objArr99[0]).intern();
                                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                    a(1377 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (20098 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.getTrimmedLength(str8) + 12, objArr100);
                                                    java.lang.String intern28 = ((java.lang.String) objArr100[0]).intern();
                                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                    a(1389 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, objArr101);
                                                    java.lang.String intern29 = ((java.lang.String) objArr101[0]).intern();
                                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                    a(android.view.KeyEvent.getDeadChar(0, 0) + 1401, (char) (10111 - android.view.Gravity.getAbsoluteGravity(0, 0)), 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr102);
                                                    java.lang.String intern30 = ((java.lang.String) objArr102[0]).intern();
                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                    a(1413 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 38803), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, objArr103);
                                                    java.lang.String intern31 = ((java.lang.String) objArr103[0]).intern();
                                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getOffsetBefore(str8, 0) + 1425, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.Color.red(0) + 14, objArr104);
                                                    java.lang.String intern32 = ((java.lang.String) objArr104[0]).intern();
                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                    a(1439 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.combineMeasuredStates(0, 0), 12 - android.view.View.combineMeasuredStates(0, 0), objArr105);
                                                    java.lang.String intern33 = ((java.lang.String) objArr105[0]).intern();
                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                    a(1451 - (android.os.Process.myTid() >> 22), (char) (27346 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 23 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr106);
                                                    java.lang.String intern34 = ((java.lang.String) objArr106[0]).intern();
                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1475, (char) (android.os.Process.myPid() >> 22), 28 - android.view.View.resolveSize(0, 0), objArr107);
                                                    java.lang.String[] strArr7 = {intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, intern34, ((java.lang.String) objArr107[0]).intern()};
                                                    int i45 = 0;
                                                    while (i45 < 19) {
                                                        java.lang.String str20 = strArr7[i45];
                                                        java.lang.Object[] objArr108 = {str20};
                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                        if (obj26 == null) {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3161, (char) (33099 - android.text.TextUtils.indexOf(str8, str8, 0, 0)));
                                                            byte[] bArr25 = $$a;
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            b(653, bArr25[2], bArr25[14], objArr109);
                                                            obj26 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj26);
                                                        }
                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr108)).longValue();
                                                        long j29 = ~longValue11;
                                                        str9 = str8;
                                                        long j30 = j29 | j;
                                                        java.lang.String[] strArr8 = strArr7;
                                                        int i46 = i45;
                                                        long j31 = (-1071426093) + ((-112) * longValue11) + 29819105680L + (((~j30) | (-266242015)) * 226) + (((~(266242014 | longValue11)) | (~(266242014 | j11)) | (~(j30 | (-266242015)))) * (-113)) + ((~(j29 | j11)) * 113);
                                                        if (((((int) j31) & ((((266099495 | i15) * (-50)) - 1750204169) + (((~((-173558567) | i15)) | (~(i30 | 1876884471))) * 50) + (((~(i30 | 266099495)) | (~(i30 | 1703325905)) | (-1876884472)) * 50))) | ((((((i30 | (-2113239551)) * 1324) - 818884594) + (((~((-1827764727) | i15)) | (~((-1029976159) | i15))) * (-1324))) - 133400464) & ((int) (j31 >> 32)))) == 0) {
                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                            a(1425 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 15 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr110);
                                                            if (str20.equals(((java.lang.String) objArr110[0]).intern())) {
                                                                java.lang.Object[] objArr111 = {str20};
                                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                if (obj27 == null) {
                                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 3161, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33098));
                                                                    byte b13 = $$a[14];
                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                    b(41, b13, b13, objArr112);
                                                                    obj27 = cls27.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                                                }
                                                                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr111)).longValue();
                                                                long j32 = ~longValue12;
                                                                long j33 = ~(7948898 | j11);
                                                                long j34 = ((521 * longValue12) - 4125478062L) + (((~(longValue12 | j11)) | (~((-7948899) | j32 | j))) * 520) + (((~(j32 | j)) | j33) * (-1040)) + (((~((-7948899) | j)) | (~(j32 | 7948898)) | j33) * 520) + 987486005;
                                                                if (((((int) (j34 >> 32)) & ((((~((-829834006) | i15)) | (~(i30 | 607392405))) * (-1808)) + 660969898 + (((~((-540279318) | i15)) | (~(i30 | 896947093))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-607392406) | i15)) | 289554688 | (~(i30 | 829834005))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j34) & ((((~((-153747718) | i15)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 557421480) + (((~(i30 | (-153747718))) | 545278032) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 0) {
                                                                    AlternateContactlessPaymentDataJson = (valueOf + 41) % 128;
                                                                }
                                                            }
                                                            i45 = i46 + 1;
                                                            strArr7 = strArr8;
                                                            str8 = str9;
                                                        }
                                                        i20 = i46;
                                                    }
                                                    str9 = str8;
                                                    i20 = -1;
                                                    if (i20 >= 0 && (i21 = (i20 + 130) ^ i15) != i15) {
                                                        java.lang.Object[] objArr113 = {new int[]{i15}, new int[]{i21}, null, null, new int[1]};
                                                        java.lang.Object[] objArr114 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i30 | (-107021097))) | (-1943825002)) * (-933)) + 2004753836) + (((~(i30 | (-1943825002))) | 1906075713) * 933)) - 1318615378)};
                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj28 == null) {
                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.graphics.Color.red(0));
                                                            byte[] bArr26 = $$a;
                                                            byte b14 = bArr26[2];
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            b(b14, (byte) (-bArr26[16]), b14, objArr115);
                                                            obj28 = cls28.getMethod((java.lang.String) objArr115[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                        }
                                                        ((int[]) objArr113[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr114)).intValue();
                                                        return objArr113;
                                                    }
                                                }
                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                a(1504 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (13714 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, objArr116);
                                                java.lang.String intern35 = ((java.lang.String) objArr116[0]).intern();
                                                java.lang.String str21 = str9;
                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                a(1516 - android.view.KeyEvent.keyCodeFromString(str9), (char) android.graphics.Color.argb(0, 0, 0, 0), 4 - android.text.TextUtils.lastIndexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr117);
                                                java.lang.String[] strArr9 = {intern35, ((java.lang.String) objArr117[0]).intern()};
                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                a(android.view.KeyEvent.getDeadChar(0, 0) + 1521, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10278), 15 - (android.os.Process.myTid() >> 22), objArr118);
                                                java.lang.String intern36 = ((java.lang.String) objArr118[0]).intern();
                                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                a(1536 - android.view.KeyEvent.keyCodeFromString(str21), (char) (android.graphics.Color.rgb(0, 0, 0) + 16811669), 19 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr119);
                                                java.lang.String intern37 = ((java.lang.String) objArr119[0]).intern();
                                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                a(android.view.MotionEvent.axisFromString(str21) + 1556, (char) (6152 - android.text.TextUtils.indexOf(str21, str21, 0, 0)), 14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr120);
                                                java.lang.String[] strArr10 = {intern36, intern37, ((java.lang.String) objArr120[0]).intern()};
                                                long j35 = j;
                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1568, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.Color.green(0) + 21, objArr121);
                                                java.lang.String intern38 = ((java.lang.String) objArr121[0]).intern();
                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                a(1590 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.indexOf(str21, str21, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 10, objArr122);
                                                java.lang.String[] strArr11 = {intern38, ((java.lang.String) objArr122[0]).intern()};
                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                a(1599 - android.text.TextUtils.indexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.getOffsetAfter(str21, 0) + 58315), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr123);
                                                java.lang.String intern39 = ((java.lang.String) objArr123[0]).intern();
                                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                a(337 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SYN), android.text.TextUtils.getOffsetBefore(str21, 0) + 6, objArr124);
                                                java.lang.String[] strArr12 = {intern39, ((java.lang.String) objArr124[0]).intern()};
                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                a(1611 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.indexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51402), 27 - android.text.TextUtils.lastIndexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr125);
                                                java.lang.String intern40 = ((java.lang.String) objArr125[0]).intern();
                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                a(android.graphics.Color.green(0) + 1590, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr126);
                                                c2 = 0;
                                                java.lang.String[][] strArr13 = {strArr9, strArr10, strArr11, strArr12, new java.lang.String[]{intern40, ((java.lang.String) objArr126[0]).intern()}};
                                                i17 = 0;
                                                int i47 = -1;
                                                loop4: while (true) {
                                                    if (i17 < 5) {
                                                        i18 = i15;
                                                        break;
                                                    }
                                                    java.lang.String[] strArr14 = strArr13[i17];
                                                    java.lang.String str22 = strArr14[c2];
                                                    java.lang.String[] strArr15 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                                    int length = strArr15.length;
                                                    valueOf = (AlternateContactlessPaymentDataJson + 119) % 128;
                                                    int i48 = 0;
                                                    while (i48 < length) {
                                                        java.lang.String str23 = strArr15[i48];
                                                        java.io.File file4 = new java.io.File(str22);
                                                        if (file4.exists() && file4.isFile()) {
                                                            try {
                                                                java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                                                strArr2 = strArr13;
                                                                try {
                                                                    strArr3 = strArr15;
                                                                    try {
                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                        str10 = str22;
                                                                        try {
                                                                            a(android.text.TextUtils.indexOf(str21, str21, 0) + 167, (char) (18760 - android.graphics.Color.blue(0)), 2 - android.view.View.getDefaultSize(0, 0), objArr127);
                                                                            java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr127[0]).intern());
                                                                            next2 = useDelimiter3.hasNext() ? useDelimiter3.next() : str21;
                                                                            useDelimiter3.close();
                                                                        } catch (java.io.IOException unused3) {
                                                                            continue;
                                                                        }
                                                                    } catch (java.io.IOException unused4) {
                                                                    }
                                                                } catch (java.io.IOException unused5) {
                                                                }
                                                            } catch (java.io.IOException unused6) {
                                                            }
                                                            if (next2.contains(str23)) {
                                                                i18 = i15 ^ (i47 + 171);
                                                                break loop4;
                                                            }
                                                            i48++;
                                                            i47++;
                                                            strArr13 = strArr2;
                                                            strArr15 = strArr3;
                                                            str22 = str10;
                                                        }
                                                        strArr2 = strArr13;
                                                        strArr3 = strArr15;
                                                        str10 = str22;
                                                        i48++;
                                                        i47++;
                                                        strArr13 = strArr2;
                                                        strArr15 = strArr3;
                                                        str22 = str10;
                                                    }
                                                    i17++;
                                                    c2 = 0;
                                                }
                                                if (i18 == i15) {
                                                    java.lang.Object[] objArr128 = {new int[]{i15}, new int[]{i18}, null, null, new int[1]};
                                                    java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-526936559) | i15)) | 86534220 | (~(1523909539 | i15))) * (-754)) + 1952495223 + (((~((-86534221) | i15)) | (~(i30 | 1610443759))) * (-754)) + ((i30 | (-526936559)) * 754))};
                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj29 == null) {
                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                        byte[] bArr27 = $$a;
                                                        byte b15 = bArr27[2];
                                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                        b(b15, (byte) (-bArr27[16]), b15, objArr130);
                                                        obj29 = cls29.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                    }
                                                    ((int[]) objArr128[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr129)).intValue();
                                                    return objArr128;
                                                }
                                                try {
                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.lastIndexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1640, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 54266), 13 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr131);
                                                    java.lang.String intern41 = ((java.lang.String) objArr131[0]).intern();
                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                    a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1652, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2252), 8 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr132);
                                                    intern = ((java.lang.String) objArr132[0]).intern();
                                                    file = new java.io.File(intern41);
                                                } catch (java.lang.Exception unused7) {
                                                    i19 = i15 ^ 151;
                                                }
                                                if (file.exists() && file.isFile()) {
                                                    try {
                                                        java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file));
                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                        a(android.graphics.Color.alpha(0) + 167, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18759), android.text.TextUtils.indexOf(str21, str21) + 2, objArr133);
                                                        java.util.Scanner useDelimiter4 = scanner4.useDelimiter(((java.lang.String) objArr133[0]).intern());
                                                        next = useDelimiter4.hasNext() ? useDelimiter4.next() : str21;
                                                        useDelimiter4.close();
                                                    } catch (java.io.IOException unused8) {
                                                    }
                                                    if (next.contains(intern)) {
                                                        i19 = i15 ^ 150;
                                                        if (i19 == i15) {
                                                            java.lang.Object[] objArr134 = {new int[]{i15}, new int[]{i19}, null, null, new int[1]};
                                                            java.lang.Object[] objArr135 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i30 | (-1266069562))) | (~(784776536 | i15))) * 959) + 52336753 + (((~((-1266069562) | i15)) | (~(i30 | 784776536))) * 959))};
                                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj30 == null) {
                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                                byte[] bArr28 = $$a;
                                                                byte b16 = bArr28[2];
                                                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                b(b16, (byte) (-bArr28[16]), b16, objArr136);
                                                                obj30 = cls30.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                            }
                                                            ((int[]) objArr134[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr135)).intValue();
                                                            return objArr134;
                                                        }
                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1661, (char) ((-1) - android.text.TextUtils.lastIndexOf(str21, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 47 - android.text.TextUtils.indexOf(str21, str21, 0), objArr137);
                                                        java.lang.Object[] objArr138 = {((java.lang.String) objArr137[0]).intern()};
                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                        if (obj31 == null) {
                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSizeAndState(0, 0, 0), 3162 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (33100 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                            byte b17 = $$a[14];
                                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                            b(41, b17, b17, objArr139);
                                                            obj31 = cls31.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj31);
                                                        }
                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr138)).longValue();
                                                        long j36 = 804793580 | longValue13;
                                                        long j37 = (((-753) * longValue13) - 607619153655L) + (((~j36) | (~(804793580 | j11)) | (~(longValue13 | j11))) * (-754)) + (((~(longValue13 | j35 | (-804793581))) | (~(j36 | j11))) * (-754)) + ((j35 | 804793580) * 754) + 1800228484;
                                                        int i49 = (((((int) (j37 >> 32)) & (((((((~(i30 | 799697850)) | (-2141945787)) | (~(i30 | 2058043034))) * (-1136)) + 1738041050) + ((((~(799697850 | i15)) | (~(2058043034 | i15))) | (~(i30 | (-715795099)))) * (-568))) + ((((~(i30 | (-799697851))) | (~(i30 | (-2058043035)))) | (~(2141945786 | i15))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) j37) & ((((i30 | (-589826)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 925088259) + (((~(i30 | 1604738898)) | (-352916562)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) * 263) ^ i15;
                                                        if (i49 == i15) {
                                                            java.lang.Object[] objArr140 = {new int[]{i15}, new int[]{i15}, null, null, new int[1]};
                                                            java.lang.Object[] objArr141 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~((-2011415329) | i15)) | (-2012998514)) * (-502)) - 150350661) + ((~(i30 | (-1973567745))) * (-502)) + (((~((-39430770) | i15)) | (-2011415329)) * 502))};
                                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj32 == null) {
                                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.red(0) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                byte[] bArr29 = $$a;
                                                                byte b18 = bArr29[2];
                                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                b(b18, (byte) (-bArr29[16]), b18, objArr142);
                                                                obj32 = cls32.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                            }
                                                            ((int[]) objArr140[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr141)).intValue();
                                                            return objArr140;
                                                        }
                                                        java.lang.Object[] objArr143 = {new int[]{i15}, new int[]{i49}, null, null, new int[1]};
                                                        int i50 = i30 | 620539893;
                                                        java.lang.Object[] objArr144 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((i50 * 495) + 1093520980 + (((~i50) | 71347604) * 495))};
                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj33 == null) {
                                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                            byte[] bArr30 = $$a;
                                                            byte b19 = bArr30[2];
                                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                            b(b19, (byte) (-bArr30[16]), b19, objArr145);
                                                            obj33 = cls33.getMethod((java.lang.String) objArr145[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                        }
                                                        ((int[]) objArr143[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr144)).intValue();
                                                        return objArr143;
                                                    }
                                                }
                                                i19 = i15;
                                                if (i19 == i15) {
                                                }
                                            }
                                        }
                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 311, (char) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 23 - android.view.KeyEvent.normalizeMetaState(0), objArr146);
                                        java.lang.String intern42 = ((java.lang.String) objArr146[0]).intern();
                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                        a(365 - android.view.View.MeasureSpec.getSize(0), (char) (63292 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), 11 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr147);
                                        java.lang.String intern43 = ((java.lang.String) objArr147[0]).intern();
                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                        a(375 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 49819), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 7, objArr148);
                                        java.lang.String intern44 = ((java.lang.String) objArr148[0]).intern();
                                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str5, str5, 0) + 382, (char) (65158 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 8, objArr149);
                                        java.lang.String[] strArr16 = {intern42, intern43, intern44, ((java.lang.String) objArr149[0]).intern()};
                                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                                        a((android.os.Process.myTid() >> 22) + 390, (char) (android.text.TextUtils.getOffsetAfter(str5, 0) + 60508), (-16777199) - android.graphics.Color.rgb(0, 0, 0), objArr150);
                                        java.lang.String intern45 = ((java.lang.String) objArr150[0]).intern();
                                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                                        a((android.os.Process.myTid() >> 22) + 407, (char) (29202 - android.view.View.MeasureSpec.getSize(0)), android.graphics.Color.alpha(0) + 7, objArr151);
                                        java.lang.String intern46 = ((java.lang.String) objArr151[0]).intern();
                                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                                        a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 414, (char) (29656 - android.os.Process.getGidForName(str5)), 8 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr152);
                                        java.lang.String intern47 = ((java.lang.String) objArr152[0]).intern();
                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                        a(422 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, objArr153);
                                        java.lang.String intern48 = ((java.lang.String) objArr153[0]).intern();
                                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                                        a(android.text.TextUtils.getCapsMode(str5, 0, 0) + 432, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf(str5, str5) + 14, objArr154);
                                        java.lang.String[] strArr17 = {intern45, intern46, intern47, intern48, ((java.lang.String) objArr154[0]).intern()};
                                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                                        a(447 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), android.view.View.resolveSizeAndState(0, 0, 0) + 16, objArr155);
                                        java.lang.String intern49 = ((java.lang.String) objArr155[0]).intern();
                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                        a(462 - android.text.TextUtils.indexOf(str5, str5, 0, 0), (char) ((android.os.Process.myPid() >> 22) + 49824), 3 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr156);
                                        java.lang.String intern50 = ((java.lang.String) objArr156[0]).intern();
                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                        a(473 - android.text.TextUtils.getOffsetBefore(str5, 0), (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40051), 23 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr157);
                                        java.lang.String intern51 = ((java.lang.String) objArr157[0]).intern();
                                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 496, (char) android.view.View.combineMeasuredStates(0, 0), android.view.View.resolveSize(0, 0) + 25, objArr158);
                                        java.lang.String intern52 = ((java.lang.String) objArr158[0]).intern();
                                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 28 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr159);
                                        java.lang.String str24 = str5;
                                        j = j12;
                                        java.lang.String[] strArr18 = {intern49, intern50, intern2, intern51, intern52, ((java.lang.String) objArr159[0]).intern()};
                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 549, (char) ((-1) - android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 11 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr160);
                                        java.lang.String intern53 = ((java.lang.String) objArr160[0]).intern();
                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 559, (char) (android.text.TextUtils.indexOf(str24, str24) + 2457), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, objArr161);
                                        java.lang.String intern54 = ((java.lang.String) objArr161[0]).intern();
                                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                                        a(android.view.KeyEvent.normalizeMetaState(0) + 567, (char) android.view.View.combineMeasuredStates(0, 0), 5 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr162);
                                        java.lang.String intern55 = ((java.lang.String) objArr162[0]).intern();
                                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 573, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr163);
                                        java.lang.String[] strArr19 = {intern53, intern54, intern55, ((java.lang.String) objArr163[0]).intern()};
                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                        a(android.view.Gravity.getAbsoluteGravity(0, 0) + 579, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6341), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr164);
                                        java.lang.String intern56 = ((java.lang.String) objArr164[0]).intern();
                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                        a(android.graphics.Color.rgb(0, 0, 0) + 16777630, (char) (29657 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, objArr165);
                                        java.lang.String intern57 = ((java.lang.String) objArr165[0]).intern();
                                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                                        a(382 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 65159), 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr166);
                                        java.lang.String[] strArr20 = {intern56, intern57, ((java.lang.String) objArr166[0]).intern()};
                                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 595, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.os.Process.myTid() >> 22) + 14, objArr167);
                                        java.lang.String intern58 = ((java.lang.String) objArr167[0]).intern();
                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) (25334 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr168);
                                        java.lang.String[] strArr21 = {intern58, ((java.lang.String) objArr168[0]).intern()};
                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) ((-1) - android.text.TextUtils.lastIndexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 9 - android.view.View.MeasureSpec.getSize(0), objArr169);
                                        java.lang.String intern59 = ((java.lang.String) objArr169[0]).intern();
                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                        a(619 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 32865), android.view.KeyEvent.keyCodeFromString(str24) + 1, objArr170);
                                        java.lang.String[] strArr22 = {intern59, ((java.lang.String) objArr170[0]).intern()};
                                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                                        a(android.text.TextUtils.lastIndexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_NOT_FOUND, (char) (android.os.Process.myPid() >> 22), 16 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr171);
                                        java.lang.String intern60 = ((java.lang.String) objArr171[0]).intern();
                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                        a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 462, (char) (android.view.MotionEvent.axisFromString(str24) + 49825), android.text.TextUtils.indexOf(str24, str24, 0, 0) + 3, objArr172);
                                        java.lang.String intern61 = ((java.lang.String) objArr172[0]).intern();
                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                        a(android.view.MotionEvent.axisFromString(str24) + 408, (char) (29202 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 7 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr173);
                                        java.lang.String intern62 = ((java.lang.String) objArr173[0]).intern();
                                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                                        a(android.view.KeyEvent.getDeadChar(0, 0) + 636, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 8 - android.graphics.Color.blue(0), objArr174);
                                        java.lang.String intern63 = ((java.lang.String) objArr174[0]).intern();
                                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                                        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 421, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '%', objArr175);
                                        java.lang.String intern64 = ((java.lang.String) objArr175[0]).intern();
                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                        a(432 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 14 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr176);
                                        java.lang.String[] strArr23 = {intern60, intern61, intern62, intern63, intern64, ((java.lang.String) objArr176[0]).intern()};
                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str24, str24, 0, 0) + 644, (char) (android.text.TextUtils.lastIndexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41435), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, objArr177);
                                        java.lang.String intern65 = ((java.lang.String) objArr177[0]).intern();
                                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                                        a(android.view.View.resolveSize(0, 0) + 664, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr178);
                                        java.lang.String intern66 = ((java.lang.String) objArr178[0]).intern();
                                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                                        a(683 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 61542), 31 - android.view.KeyEvent.normalizeMetaState(0), objArr179);
                                        java.lang.String intern67 = ((java.lang.String) objArr179[0]).intern();
                                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                                        a(714 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2307), android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 27, objArr180);
                                        java.lang.String intern68 = ((java.lang.String) objArr180[0]).intern();
                                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                                        a(android.text.TextUtils.getCapsMode(str24, 0, 0) + 740, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4578), 22 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr181);
                                        java.lang.String intern69 = ((java.lang.String) objArr181[0]).intern();
                                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                                        a(android.graphics.Color.alpha(0) + 763, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 33, objArr182);
                                        java.lang.String[] strArr24 = {intern65, intern66, intern67, intern68, intern69, ((java.lang.String) objArr182[0]).intern(), intern2};
                                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                                        a(795 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (43485 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 13 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr183);
                                        java.lang.String intern70 = ((java.lang.String) objArr183[0]).intern();
                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 375, (char) (49820 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, objArr184);
                                        java.lang.String[] strArr25 = {intern70, ((java.lang.String) objArr184[0]).intern()};
                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                        a(android.os.Process.getGidForName(str24) + 810, (char) (android.graphics.Color.rgb(0, 0, 0) + 16806734), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, objArr185);
                                        java.lang.String intern71 = ((java.lang.String) objArr185[0]).intern();
                                        java.lang.Object[] objArr186 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str24, str24) + 839, (char) (android.text.TextUtils.indexOf(str24, str24) + 28602), 10 - android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr186);
                                        java.lang.String[] strArr26 = {intern71, ((java.lang.String) objArr186[0]).intern()};
                                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                                        a(849 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.indexOf(str24, str24, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, objArr187);
                                        java.lang.String intern72 = ((java.lang.String) objArr187[0]).intern();
                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 869, (char) (10406 - android.graphics.Color.red(0)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr188);
                                        java.lang.String[] strArr27 = {intern72, ((java.lang.String) objArr188[0]).intern()};
                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 874, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 18 - android.text.TextUtils.lastIndexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr189);
                                        java.lang.String[] strArr28 = {((java.lang.String) objArr189[0]).intern()};
                                        java.lang.Object[] objArr190 = new java.lang.Object[1];
                                        a(893 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (35416 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 15 - android.view.MotionEvent.axisFromString(str24), objArr190);
                                        java.lang.String[] strArr29 = {((java.lang.String) objArr190[0]).intern()};
                                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 909, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 19, objArr191);
                                        java.lang.String[] strArr30 = {((java.lang.String) objArr191[0]).intern()};
                                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                                        a(928 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 19 - android.text.TextUtils.getOffsetBefore(str24, 0), objArr192);
                                        java.lang.String[] strArr31 = {((java.lang.String) objArr192[0]).intern()};
                                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                                        a(947 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), (android.os.Process.myPid() >> 22) + 23, objArr193);
                                        java.lang.String[] strArr32 = {((java.lang.String) objArr193[0]).intern()};
                                        java.lang.Object[] objArr194 = new java.lang.Object[1];
                                        a(970 - android.graphics.Color.blue(0), (char) android.graphics.Color.alpha(0), 'E' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr194);
                                        java.lang.String[] strArr33 = {((java.lang.String) objArr194[0]).intern()};
                                        java.lang.Object[] objArr195 = new java.lang.Object[1];
                                        a(991 - android.text.TextUtils.getTrimmedLength(str24), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, objArr195);
                                        java.lang.String[] strArr34 = {((java.lang.String) objArr195[0]).intern(), intern2};
                                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                                        a(1015 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 28 - android.view.KeyEvent.normalizeMetaState(0), objArr196);
                                        java.lang.String[] strArr35 = {((java.lang.String) objArr196[0]).intern(), intern2};
                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                        a(1043 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (45533 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, objArr197);
                                        java.lang.String[] strArr36 = {((java.lang.String) objArr197[0]).intern(), intern2};
                                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1070, (char) (android.text.TextUtils.indexOf(str24, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 32 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr198);
                                        java.lang.String[] strArr37 = {((java.lang.String) objArr198[0]).intern(), intern2};
                                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                                        a(1101 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 27 - android.graphics.Color.green(0), objArr199);
                                        java.lang.String[] strArr38 = {((java.lang.String) objArr199[0]).intern(), intern2};
                                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                                        a(1176 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (41399 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 32, objArr200);
                                        java.lang.String[][] strArr39 = {strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, new java.lang.String[]{((java.lang.String) objArr200[0]).intern(), intern2}};
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        int i51 = i;
                                        int i52 = 0;
                                        int i53 = 0;
                                        while (i52 < 24) {
                                            valueOf = (AlternateContactlessPaymentDataJson + 99) % 128;
                                            java.lang.String[] strArr40 = strArr39[i52];
                                            java.lang.Object[] objArr201 = {strArr40[0]};
                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj34 == null) {
                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName(str24) + 41, 1921 - (android.os.Process.myPid() >> 22), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                byte[] bArr31 = $$a;
                                                strArr = strArr39;
                                                i12 = i51;
                                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                b(653, bArr31[2], bArr31[14], objArr202);
                                                obj34 = cls34.getMethod((java.lang.String) objArr202[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                                            } else {
                                                strArr = strArr39;
                                                i12 = i51;
                                            }
                                            java.lang.String str25 = (java.lang.String) ((java.lang.reflect.Method) obj34).invoke(null, objArr201);
                                            java.lang.String[] strArr41 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr40, 1, strArr40.length);
                                            if (str25 == null || str25.length() == 0) {
                                                i13 = i52;
                                                str6 = str24;
                                            } else {
                                                if (strArr40.length != 1) {
                                                    java.lang.Object[] objArr203 = {str25, strArr41};
                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                    if (obj35 == null) {
                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf(str24, str24) + 2880, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        byte[] bArr32 = $$a;
                                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                        b(653, bArr32[2], bArr32[14], objArr204);
                                                        obj35 = cls35.getMethod((java.lang.String) objArr204[0], java.lang.String.class, java.lang.String[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj35);
                                                    }
                                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr203)).longValue();
                                                    long j38 = ~(839398917 | longValue14);
                                                    arrayList = arrayList2;
                                                    str7 = str24;
                                                    i13 = i52;
                                                    long j39 = ((((((-396) * longValue14) - 334080769364L) + ((((~(j | 839398917)) | j38) | (~(j | longValue14))) * (-397))) + ((-397) * j38)) + (((j11 | j38) | (~((-839398918) | (~longValue14)))) * 397)) - 1189312861;
                                                    i14 = i;
                                                    int i54 = ~(1403338711 | i14);
                                                    if (((((int) j39) & (((((~(i30 | 1101595728)) | 335565065) * 98) - 121061603) + (((~(i30 | 335630681)) | 1101595728 | (~((-335630682) | i14))) * (-49)) + (((~(1101595728 | i14)) | 65616) * 49))) | (((int) (j39 >> 32)) & ((((~(i30 | (-42286552))) | 33887699 | i54) * (-502)) + 1268982124 + ((i54 | (~(i30 | (-8398853)))) * 502)))) == 0) {
                                                        arrayList2 = arrayList;
                                                        str6 = str7;
                                                    }
                                                } else {
                                                    i14 = i;
                                                    arrayList = arrayList2;
                                                    str7 = str24;
                                                    i13 = i52;
                                                }
                                                i53++;
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                sb.append(str25);
                                                str6 = str7;
                                                i12 = i14 ^ (i13 + 10);
                                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                a(android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1161, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr205);
                                                sb.append(((java.lang.String) objArr205[0]).intern());
                                                sb.append(str25);
                                                java.lang.String obj36 = sb.toString();
                                                arrayList2 = arrayList;
                                                arrayList2.add(obj36);
                                            }
                                            i51 = i12;
                                            str24 = str6;
                                            i52 = i13 + 1;
                                            strArr39 = strArr;
                                        }
                                        i11 = i;
                                        str5 = str24;
                                        int i55 = i51;
                                        if (i53 > 2) {
                                            valueOf = (AlternateContactlessPaymentDataJson + 103) % 128;
                                            objArr = new java.lang.Object[]{new int[]{i11}, new int[]{i55}, arrayList2, null, new int[1]};
                                            java.lang.Object[] objArr206 = {num, num, java.lang.Integer.valueOf(((((~(i30 | 1152269642)) | 898576455) * (-328)) - 900130907) + ((898576455 | i11) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-1152269643) | i11)) | 76427330 | (~(i30 | 1974418767))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj37 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                byte[] bArr33 = $$a;
                                                byte b20 = bArr33[2];
                                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                b(b20, (byte) (-bArr33[16]), b20, objArr207);
                                                obj37 = cls36.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                            }
                                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr206)).intValue();
                                            c = 0;
                                            ((int[]) objArr[4])[0] = intValue;
                                        } else {
                                            objArr = new java.lang.Object[]{new int[]{i11}, new int[]{i11}, null, null, new int[1]};
                                            java.lang.Object[] objArr208 = {num, num, java.lang.Integer.valueOf((((~(i30 | 1393577301)) | 657268796) * (-1042)) + 686204336 + ((1393577301 | i11) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-657268797) | i11)) | 50331668 | (~(i30 | 2000514429))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj38 == null) {
                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf(str5, str5, 0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                byte[] bArr34 = $$a;
                                                byte b21 = bArr34[2];
                                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                b(b21, (byte) (-bArr34[16]), b21, objArr209);
                                                obj38 = cls37.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                            }
                                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr208)).intValue();
                                            c = 0;
                                            ((int[]) objArr[4])[0] = intValue2;
                                        }
                                        int i56 = ((int[]) objArr[1])[c];
                                        if (i56 != i11) {
                                            int[] iArr = new int[1];
                                            int[] iArr2 = new int[1];
                                            java.util.List list = (java.util.List) objArr[2];
                                            iArr[c] = i11;
                                            iArr2[c] = i56;
                                            java.lang.Object[] objArr210 = {iArr, iArr2, list, null, new int[1]};
                                            java.lang.Object[] objArr211 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i30 | (-880372975))) | 71303330) * (-241)) - 851835614) + (((~(i30 | (-809069645))) | 1099169793) * 241))};
                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj39 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                byte[] bArr35 = $$a;
                                                byte b22 = bArr35[2];
                                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                                b(b22, (byte) (-bArr35[16]), b22, objArr212);
                                                obj39 = cls38.getMethod((java.lang.String) objArr212[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                            }
                                            ((int[]) objArr210[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr211)).intValue();
                                            return objArr210;
                                        }
                                        java.lang.Object[] objArr842 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 446, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr842);
                                        java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj == null) {
                                        }
                                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr852);
                                        if (invoke != null) {
                                        }
                                        if (i16 != 1986687685) {
                                        }
                                        str9 = str8;
                                        java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                        a(1504 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (13714 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, objArr1162);
                                        java.lang.String intern352 = ((java.lang.String) objArr1162[0]).intern();
                                        java.lang.String str212 = str9;
                                        java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                        a(1516 - android.view.KeyEvent.keyCodeFromString(str9), (char) android.graphics.Color.argb(0, 0, 0, 0), 4 - android.text.TextUtils.lastIndexOf(str212, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr1172);
                                        java.lang.String[] strArr92 = {intern352, ((java.lang.String) objArr1172[0]).intern()};
                                        java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                        a(android.view.KeyEvent.getDeadChar(0, 0) + 1521, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10278), 15 - (android.os.Process.myTid() >> 22), objArr1182);
                                        java.lang.String intern362 = ((java.lang.String) objArr1182[0]).intern();
                                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                        a(1536 - android.view.KeyEvent.keyCodeFromString(str212), (char) (android.graphics.Color.rgb(0, 0, 0) + 16811669), 19 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1192);
                                        java.lang.String intern372 = ((java.lang.String) objArr1192[0]).intern();
                                        java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                        a(android.view.MotionEvent.axisFromString(str212) + 1556, (char) (6152 - android.text.TextUtils.indexOf(str212, str212, 0, 0)), 14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1202);
                                        java.lang.String[] strArr102 = {intern362, intern372, ((java.lang.String) objArr1202[0]).intern()};
                                        long j352 = j;
                                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                        a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1568, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.Color.green(0) + 21, objArr1212);
                                        java.lang.String intern382 = ((java.lang.String) objArr1212[0]).intern();
                                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                        a(1590 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.indexOf(str212, str212, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 10, objArr1222);
                                        java.lang.String[] strArr112 = {intern382, ((java.lang.String) objArr1222[0]).intern()};
                                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                        a(1599 - android.text.TextUtils.indexOf(str212, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.getOffsetAfter(str212, 0) + 58315), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr1232);
                                        java.lang.String intern392 = ((java.lang.String) objArr1232[0]).intern();
                                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                                        a(337 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SYN), android.text.TextUtils.getOffsetBefore(str212, 0) + 6, objArr1242);
                                        java.lang.String[] strArr122 = {intern392, ((java.lang.String) objArr1242[0]).intern()};
                                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                                        a(1611 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.indexOf(str212, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51402), 27 - android.text.TextUtils.lastIndexOf(str212, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr1252);
                                        java.lang.String intern402 = ((java.lang.String) objArr1252[0]).intern();
                                        java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                        a(android.graphics.Color.green(0) + 1590, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr1262);
                                        c2 = 0;
                                        java.lang.String[][] strArr132 = {strArr92, strArr102, strArr112, strArr122, new java.lang.String[]{intern402, ((java.lang.String) objArr1262[0]).intern()}};
                                        i17 = 0;
                                        int i472 = -1;
                                        loop4: while (true) {
                                            if (i17 < 5) {
                                            }
                                            i17++;
                                            c2 = 0;
                                        }
                                        if (i18 == i15) {
                                        }
                                    }
                                }
                                i9 = i;
                                if (i9 == i) {
                                }
                            }
                        }
                        i8 = i;
                        if (i8 == i) {
                        }
                    }
                }
            }
            i6 = i;
            if (i6 == i) {
            }
        }

        static void init$0() {
            $$a = new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 106, 0, 124, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
            $$b = 73;
        }

        @Override // com.payair.hce.setErrorName
        public final byte[] getPCvc3() {
            return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1177773023, -1177773023, java.lang.System.identityHashCode(this));
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 15) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            $11 = ($10 + 11) % 128;
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (SdkCoreBusinessLogicModuleImpl ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getCvrMaskAnd)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1335, (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.argb(0, 0, 0, 0) + 1335, (char) android.text.TextUtils.indexOf("", "", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, 3542 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d9 A[Catch: all -> 0x02d9, TryCatch #0 {all -> 0x02d9, blocks: (B:3:0x000d, B:6:0x0032, B:7:0x0066, B:17:0x008f, B:19:0x00a6, B:20:0x00d6, B:26:0x00f5, B:28:0x0112, B:29:0x014a, B:39:0x01b6, B:41:0x01d9, B:42:0x021c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        int i4;
        java.lang.Object obj;
        byte[] bArr;
        boolean z;
        int length;
        byte[] bArr2;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
            boolean z2 = intValue == -1;
            if (z2) {
                byte[] bArr3 = getAid;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        $10 = ($11 + 109) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i6])};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 5087 - android.view.MotionEvent.axisFromString(""), (char) (android.text.TextUtils.indexOf("", c, 0) + 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                        }
                        bArr4[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getProfileVersion[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i7 = (int) (DigitizedCardProfile ^ j);
                        if (z2) {
                            int i8 = $11 + 103;
                            $10 = i8 % 128;
                            if (i8 % 2 == 0) {
                                i4 = 1;
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i7 + i4;
                                java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson), sb};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 27, android.text.TextUtils.getOffsetAfter("", 0) + 2364, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    c(0, (byte) 1, 0, objArr5);
                                    obj = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                bArr = getAid;
                                if (bArr != null) {
                                    int i9 = $10 + 3;
                                    $11 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        length = bArr.length;
                                        bArr2 = new byte[length];
                                        i5 = 1;
                                    } else {
                                        length = bArr.length;
                                        bArr2 = new byte[length];
                                        i5 = 0;
                                    }
                                    while (i5 < length) {
                                        $11 = ($10 + 99) % 128;
                                        bArr2[i5] = (byte) (bArr[i5] ^ (-4897270311952305750L));
                                        i5++;
                                    }
                                    bArr = bArr2;
                                }
                                if (bArr != null) {
                                    int i10 = $11 + 95;
                                    $10 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        z = true;
                                        gettrack2constructiondata.DigitizedCardProfile = 1;
                                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                            $11 = ($10 + 97) % 128;
                                            if (z) {
                                                byte[] bArr5 = getAid;
                                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                            } else {
                                                short[] sArr = getProfileVersion;
                                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                            }
                                            sb.append(gettrack2constructiondata.values);
                                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                            gettrack2constructiondata.DigitizedCardProfile++;
                                        }
                                    }
                                }
                                z = false;
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                }
                            }
                        } else {
                            $11 = ($10 + 115) % 128;
                        }
                        i4 = 0;
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i7 + i4;
                        java.lang.Object[] objArr42 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson), sb};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj == null) {
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr42)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        bArr = getAid;
                        if (bArr != null) {
                        }
                        if (bArr != null) {
                        }
                        z = false;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = getAid;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 29 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public getCacheDir(com.payair.hce.setHCEEventListener sethceeventlistener, java.util.LinkedHashMap<java.lang.Integer, com.payair.hce.setCardManager> linkedHashMap, boolean z) throws com.payair.hce.updateSukFileName {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed4;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed5;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed6;
        if (sethceeventlistener != null) {
            if (sethceeventlistener.DigitizedCardProfile() == null) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.getSecurityWord;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(android.text.TextUtils.getTrimmedLength("") - 1174201001, 626088098 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (-30) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((-119) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (short) (47 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate, ((java.lang.String) objArr[0]).intern());
            }
            if (sethceeventlistener.values() == null) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = com.payair.hce.requestTaskStatusUpdate.getSecurityWord;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b("룔뱡\uf00b샱ᤕ㣉靳ដ軿\uaace觚鹼\udc9a봁閖뚐㧉蠹瀣炄\ude49ᅢ晊ﲆ丸뒽ㄵ㎵ቨ읅郀ᄈ訇暲溄냘ꮾ캖点ᷛ", android.graphics.ImageFormat.getBitsPerPixel(0) + 41, objArr2);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate2, ((java.lang.String) objArr2[0]).intern());
            }
            if (sethceeventlistener.AlternateContactlessPaymentDataJson() == null) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate3 = com.payair.hce.requestTaskStatusUpdate.getSecurityWord;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((-1174201004) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 626088137 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 31, (byte) (51 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (52 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr3);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate3, ((java.lang.String) objArr3[0]).intern());
            }
            this.valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(sethceeventlistener.DigitizedCardProfile());
            this.writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(sethceeventlistener.values());
            this.values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(sethceeventlistener.AlternateContactlessPaymentDataJson());
            return;
        }
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> values = linkedHashMap.get(257).values();
        if (values != null) {
            if (z) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("홍ꢉ虔\u0895", 4 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr4[0]).intern())) != null) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b("홍ꢉ虔\u0895", 4 - android.graphics.Color.green(0), objArr5);
                    transactioncanberesumed4 = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr5[0]).intern())).AlternateContactlessPaymentDataJson();
                } else {
                    transactioncanberesumed4 = null;
                }
                this.valueOf = transactioncanberesumed4;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a((-1174201025) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 626088174 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-31) - (android.os.Process.myPid() >> 22), (byte) ((-68) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (short) (89 - android.text.TextUtils.getOffsetAfter("", 0)), objArr6);
                if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr6[0]).intern())) != null) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((-1174201025) - android.widget.ExpandableListView.getPackedPositionChild(0L), 626088175 - android.widget.ExpandableListView.getPackedPositionType(0L), android.view.KeyEvent.normalizeMetaState(0) - 31, (byte) ((-67) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) (89 - android.view.View.resolveSize(0, 0)), objArr7);
                    transactioncanberesumed5 = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr7[0]).intern())).AlternateContactlessPaymentDataJson();
                } else {
                    transactioncanberesumed5 = null;
                }
                this.writeReplace = transactioncanberesumed5;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("홍ꢉ圐\ue2d4", android.text.TextUtils.getCapsMode("", 0, 0) + 4, objArr8);
                if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr8[0]).intern())) != null) {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b("홍ꢉ圐\ue2d4", 4 - android.text.TextUtils.indexOf("", ""), objArr9);
                    transactioncanberesumed6 = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr9[0]).intern())).AlternateContactlessPaymentDataJson();
                } else {
                    transactioncanberesumed6 = null;
                }
                this.values = transactioncanberesumed6;
                return;
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a((-1174201025) - android.os.Process.getGidForName(""), android.view.View.getDefaultSize(0, 0) + 626088179, (-32) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (short) ((-101) - android.view.KeyEvent.getDeadChar(0, 0)), objArr10);
            if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr10[0]).intern())) != null) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(android.text.TextUtils.getOffsetAfter("", 0) - 1174201024, 626088179 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 30, (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128), (short) ((-100) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr11);
                transactioncanberesumed = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr11[0]).intern())).AlternateContactlessPaymentDataJson();
            } else {
                transactioncanberesumed = null;
            }
            this.valueOf = transactioncanberesumed;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 1174201024, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 626088183, (-32) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((-86) - (android.os.Process.myPid() >> 22)), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 98), objArr12);
            if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr12[0]).intern())) != null) {
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(indexOf - 1174201023, (scrollDefaultDelay >> 16) + 626088183, (longPressTimeout >> 16) - 31, (byte) ((-86) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((-97) - android.view.View.MeasureSpec.getMode(0)), objArr13);
                transactioncanberesumed2 = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr13[0]).intern())).AlternateContactlessPaymentDataJson();
            } else {
                transactioncanberesumed2 = null;
            }
            this.writeReplace = transactioncanberesumed2;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            a((-1174201024) - android.view.KeyEvent.keyCodeFromString(""), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22731, (-31) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48), (short) (android.view.View.MeasureSpec.getMode(0) + 25), objArr14);
            if (values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr14[0]).intern())) != null) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                a((-1174201024) - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 626088186, (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 31, (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47), (short) (24 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr15);
                transactioncanberesumed3 = values.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr15[0]).intern())).AlternateContactlessPaymentDataJson();
            } else {
                transactioncanberesumed3 = null;
            }
            this.values = transactioncanberesumed3;
        }
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        int i = getGpoResponse + 7;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return this.writeReplace;
        }
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson() {
        int i = getPaymentFci + 11;
        int i2 = i % 128;
        getGpoResponse = i2;
        if (i % 2 != 0) {
            throw null;
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.values;
        int i3 = i2 + 69;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public final java.lang.String toString() {
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("겐뮥覈ᔇ\uf533暺\uf112茂", 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.valueOf.writeReplace());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("뿴ࠂ겐뮥\uf0f7\ude72콘㓭韼ら", android.graphics.Color.blue(0) + 10, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.writeReplace.writeReplace());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("뿴ࠂ̲\ue15b콘㓭韼ら", android.view.Gravity.getAbsoluteGravity(0, 0) + 8, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.values.writeReplace());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        new java.lang.Object[]{sb.toString()};
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("ᠾ⸝矼Ⴉ\ue8b5ᨴ\uf508鹄诣ㅂ丸뒽ㄵ㎵ቨ읅郀ᄈ\uf201䋓\uf6a7ⶮꮾ캖点ᷛ", 26 - android.text.TextUtils.getOffsetBefore("", 0), objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        getGpoResponse = (getPaymentFci + 57) % 128;
        return intern;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getPaymentFci = 1;
        DigitizedCardProfile = -978675980;
        AlternateContactlessPaymentDataJson = 520368564;
        IccPrivateKeyCrtComponentsJson = 1526256467;
        getAid = new byte[]{-93, -97, -63, com.visa.cbp.getEncExpo.kernelVersion, -44, -84, -19, -29, -61, -110, -15, -30, -13, -9, -19, -36, -47, -89, -8, -10, -99, -62, 36, -90, -9, 59, -85, -21, -9, -6, com.visa.cbp.getEncExpo.onUnminimized, -2, -20, 63, -97, Byte.MIN_VALUE, -97, 33, -31, -94, 3, 65, 83, 72, com.visa.cbp.getEncExpo.onUnminimized, kotlin.io.encoding.Base64.padSymbol, 39, 71, 2, 81, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 87, -85, kotlin.io.encoding.Base64.padSymbol, 64, 113, -5, -84, 86, 13, 82, 120, -26, -85, -17, -1, 63, -85, 58, 84, -82, 48, -29, -13, 13, 97, 33, 76, 66, 89, -14, 76, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 94, 125, 76, -95, 17, -94, 76, -78, 13, -114};
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 47591;
        RecordsJson = (char) 48309;
        SdkCoreBusinessLogicModuleImpl = (char) 8009;
        getCvrMaskAnd = (char) 53444;
    }

    static void init$0() {
        $$a = new byte[]{77, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 43, -56};
        $$b = 143;
    }

    public final com.payair.hce.transactionCanBeResumed values() {
        return (com.payair.hce.transactionCanBeResumed) values(new java.lang.Object[]{this}, -622902962, 622902962, java.lang.System.identityHashCode(this));
    }
}
