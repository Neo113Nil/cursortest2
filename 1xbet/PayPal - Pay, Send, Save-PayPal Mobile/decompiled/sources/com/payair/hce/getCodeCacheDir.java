package com.payair.hce;

/* loaded from: classes4.dex */
public final class getCodeCacheDir {
    private static int getAid = 1;
    private static int values;
    private com.payair.hce.setTrack2EquivalentData AlternateContactlessPaymentDataJson;
    private com.payair.hce.addCardAndSuk DigitizedCardProfile;
    private com.payair.hce.setPanSequenceNumber valueOf;
    private com.payair.hce.createConfigurationContext writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        int i6 = (i * 860) + (i2 * (-858)) + ((i | i3) * (-859)) + (((~((~i) | i5 | i3)) | (~(i4 | i))) * 859) + (((~(i | i5)) | (~(i5 | i4))) * 859);
        if (i6 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 2) {
            com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) objArr[0];
            int i7 = getAid;
            int i8 = i7 & 23;
            int i9 = i7 | 23;
            values = ((i8 & i9) + (i8 | i9)) % 128;
            com.payair.hce.addCardAndSuk addcardandsuk = getcodecachedir.DigitizedCardProfile;
            values = (((i7 | 103) << 1) - (i7 ^ 103)) % 128;
            return addcardandsuk;
        }
        if (i6 != 3) {
            return i6 != 4 ? writeReplace(objArr) : valueOf(objArr);
        }
        com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) objArr[0];
        int i10 = (values + 35) % 128;
        getAid = i10;
        com.payair.hce.createConfigurationContext createconfigurationcontext = getcodecachedir2.writeReplace;
        int i11 = i10 & 79;
        int i12 = ((i10 ^ 79) | i11) << 1;
        int i13 = -((i10 | 79) & (~i11));
        values = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        return createconfigurationcontext;
    }

    public getCodeCacheDir() {
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        final com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json digitizedCardProfileV1Json = (com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json) objArr[0];
        com.payair.hce.checkForSuccess checkforsuccess = new com.payair.hce.checkForSuccess() { // from class: com.payair.hce.getCodeCacheDir.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static char[] AlternateContactlessPaymentDataJson;
            private static int SdkCoreAlternateContactlessPaymentDataImpl;
            private static int getProfileVersion;
            private static int valueOf;
            private static boolean values;
            private static boolean writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(byte b, byte b2, int i, java.lang.Object[] objArr2) {
                int i2;
                byte[] bArr = $$a;
                int i3 = b2 * 3;
                int i4 = 118 - (i * 4);
                int i5 = (b * 2) + 4;
                byte[] bArr2 = new byte[1 - i3];
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = 0;
                    int i8 = i5;
                    int i9 = i5 + i6;
                    int i10 = i8 + 1;
                    i2 = i7;
                    i4 = i9;
                    i5 = i10;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                        objArr2[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i11 = i4;
                    i8 = i5;
                    i5 = bArr[i5];
                    i7 = i2 + 1;
                    i6 = i11;
                    int i92 = i5 + i6;
                    int i102 = i8 + 1;
                    i2 = i7;
                    i4 = i92;
                    i5 = i102;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    if (i2 == 0 - i3) {
                    }
                }
            }

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i, int i2, int i3) {
                com.payair.hce.setDetailedMessage setdetailedmessage = new com.payair.hce.setDetailedMessage() { // from class: com.payair.hce.getCodeCacheDir.1.3
                    private static int values = 0;
                    private static int writeReplace = 1;

                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3, int i4, int i5, int i6) {
                        int i7 = ~i5;
                        int i8 = (~i6) | i7;
                        int i9 = i5 | i4;
                        int i10 = ~(i6 | i9);
                        int i11 = (i4 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (i5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (((~((~i4) | i7)) | (~i8) | i10) * (-252)) + (i9 * (-252)) + (((~(i4 | i8)) | i10) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (i11 != 1) {
                            return i11 != 2 ? i11 != 3 ? i11 != 4 ? AlternateContactlessPaymentDataJson(objArr3) : valueOf(objArr3) : values(objArr3) : DigitizedCardProfile(objArr3);
                        }
                        values = (writeReplace + 97) % 128;
                        com.payair.hce.setjSONObject setjsonobject = com.payair.hce.setjSONObject.values;
                        values = (writeReplace + 7) % 128;
                        return setjsonobject;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                        int i4 = writeReplace + 57;
                        values = i4 % 128;
                        if (i4 % 2 != 0) {
                            com.payair.hce.setOrderRef setorderref = com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                            throw new java.lang.ArithmeticException();
                        }
                        com.payair.hce.setOrderRef setorderref2 = com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        int i5 = writeReplace;
                        int i6 = i5 & 77;
                        int i7 = -(-((i5 ^ 77) | i6));
                        values = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                        return setorderref2;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                        com.payair.hce.getCodeCacheDir.AnonymousClass1.AnonymousClass3 anonymousClass3 = (com.payair.hce.getCodeCacheDir.AnonymousClass1.AnonymousClass3) objArr3[0];
                        int i4 = writeReplace;
                        int i5 = i4 ^ 79;
                        int i6 = -(-((i4 & 79) << 1));
                        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                        values = i7 % 128;
                        int i8 = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.businessLogicModule.cvmResetTimeout;
                        if (i7 % 2 == 0) {
                            return java.lang.Integer.valueOf(i8);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                        com.payair.hce.getCodeCacheDir.AnonymousClass1.AnonymousClass3 anonymousClass3 = (com.payair.hce.getCodeCacheDir.AnonymousClass1.AnonymousClass3) objArr3[0];
                        int i4 = writeReplace + 75;
                        values = i4 % 128;
                        int i5 = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.businessLogicModule.dualTapResetTimeout;
                        if (i4 % 2 == 0) {
                            return java.lang.Integer.valueOf(i5);
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                        int i4 = writeReplace;
                        values = ((((i4 ^ 23) | (i4 & 23)) << 1) - ((i4 & (-24)) | ((~i4) & 23))) % 128;
                        com.payair.hce.getjSONObject getjsonobject = com.payair.hce.getjSONObject.valueOf;
                        int i5 = values;
                        int i6 = (((i5 | 68) << 1) - (i5 ^ 68)) - 1;
                        writeReplace = i6 % 128;
                        if (i6 % 2 != 0) {
                            return getjsonobject;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.setjSONObject getProductType() {
                        return (com.payair.hce.setjSONObject) writeReplace(new java.lang.Object[]{this}, -1114800732, 1114800733, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.getjSONObject getAccountType() {
                        return (com.payair.hce.getjSONObject) writeReplace(new java.lang.Object[]{this}, 517444151, -517444147, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getDualTapResetTimeout() {
                        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1557044884, -1557044882, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getCvmResetTimeout() {
                        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 664676550, -664676547, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.setOrderRef getCardholderValidator() {
                        return (com.payair.hce.setOrderRef) writeReplace(new java.lang.Object[]{this}, -290575296, 290575296, java.lang.System.identityHashCode(this));
                    }
                };
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
                return setdetailedmessage;
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCodeFromServer getVersion() {
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 125) % 128;
                com.payair.hce.getStatusCodeFromServer profileVersion = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.getProfileVersion();
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 3) % 128;
                return profileVersion;
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getDigitizedCardId() {
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 75) % 128;
                byte[] DigitizedCardProfile = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.digitizedCardId).DigitizedCardProfile();
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 125;
                getProfileVersion = i % 128;
                if (i % 2 != 0) {
                    return DigitizedCardProfile;
                }
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getCardCountryCode() {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 67) % 128;
                byte[] DigitizedCardProfile = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.mppLiteModule.cardRiskManagementData.crmCountryCode).DigitizedCardProfile();
                int i = getProfileVersion + 99;
                SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                if (i % 2 == 0) {
                    return DigitizedCardProfile;
                }
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
            
                if ((r0.length() % 2) != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
            
                if ((r0.length() / 4) != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x008f, code lost:
            
                com.payair.hce.getCodeCacheDir.AnonymousClass1.SdkCoreAlternateContactlessPaymentDataImpl = (com.payair.hce.getCodeCacheDir.AnonymousClass1.getProfileVersion + 23) % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
            
                r1 = new java.lang.StringBuilder();
                r1.append(r0);
                r0 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 126, null, null, "\u0081", r0);
                r1.append(((java.lang.String) r0[0]).intern());
                r0 = r1.toString();
             */
            @Override // com.payair.hce.checkForSuccess
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final byte[] getPan() {
                java.lang.String replaceAll;
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
                getProfileVersion = i % 128;
                if (i % 2 == 0) {
                    java.lang.String substring = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.digitizedCardId.substring(0, 61);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(48 >> android.view.View.combineMeasuredStates(0, 0), null, null, "\u0081", objArr2);
                    replaceAll = substring.replaceAll(((java.lang.String) objArr2[0]).intern(), "");
                } else {
                    java.lang.String substring2 = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.digitizedCardId.substring(0, 19);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(127 - android.view.View.combineMeasuredStates(0, 0), null, null, "\u0081", objArr3);
                    replaceAll = substring2.replaceAll(((java.lang.String) objArr3[0]).intern(), "");
                }
                return com.payair.hce.stopService.writeReplace(replaceAll);
            }

            @Override // com.payair.hce.checkForSuccess
            public final boolean isTransactionIdRequired() {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
                return true;
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.JsonResponse getContactlessPaymentData() {
                final com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json contactlessPaymentDataV1Json = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.mppLiteModule.contactlessPaymentData;
                if (contactlessPaymentDataV1Json == null) {
                    int i = getProfileVersion;
                    SdkCoreAlternateContactlessPaymentDataImpl = (i + 81) % 128;
                    SdkCoreAlternateContactlessPaymentDataImpl = (i + 15) % 128;
                    return null;
                }
                return new com.payair.hce.JsonResponse() { // from class: com.payair.hce.getCodeCacheDir.4
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static final byte[] $$d = null;
                    private static final int $$e = 0;
                    private static int $10;
                    private static int $11;
                    private static char AlternateContactlessPaymentDataJson;
                    private static char DigitizedCardProfile;
                    private static final int IccPrivateKeyCrtComponentsJson = 0;
                    private static final byte[] SdkCoreAlternateContactlessPaymentDataImpl = null;
                    private static int getAid;
                    private static int getProfileVersion;
                    private static char valueOf;
                    private static char writeReplace;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i2, int i3, int i4) {
                        int i5 = ~i2;
                        int i6 = ~(i2 | i3);
                        int i7 = (i2 * (-375)) + (i3 * (-375)) + (((~((~i3) | i5)) | i4 | i6) * 376) + (((~(i2 | (~i4))) | i6) * (-376)) + (((~(i5 | i4)) | i3) * 376);
                        if (i7 == 1) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass4 anonymousClass4 = (com.payair.hce.getCodeCacheDir.AnonymousClass4) objArr2[0];
                            getProfileVersion = (getAid + 99) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.cvrMaskAnd).DigitizedCardProfile();
                            getAid = (getProfileVersion + 103) % 128;
                            return DigitizedCardProfile2;
                        }
                        if (i7 == 2) {
                            int i8 = getProfileVersion + 65;
                            getAid = i8 % 128;
                            return java.lang.Boolean.valueOf(i8 % 2 == 0);
                        }
                        if (i7 != 3) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass4 anonymousClass42 = (com.payair.hce.getCodeCacheDir.AnonymousClass4) objArr2[0];
                            getAid = (getProfileVersion + 41) % 128;
                            byte[] DigitizedCardProfile3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.ppseFci).DigitizedCardProfile();
                            getAid = (getProfileVersion + 33) % 128;
                            return DigitizedCardProfile3;
                        }
                        com.payair.hce.getCodeCacheDir.AnonymousClass4 anonymousClass43 = (com.payair.hce.getCodeCacheDir.AnonymousClass4) objArr2[0];
                        getProfileVersion = (getAid + 113) % 128;
                        byte[] DigitizedCardProfile4 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.ciacDeclineOnPpms).DigitizedCardProfile();
                        getProfileVersion = (getAid + 35) % 128;
                        return DigitizedCardProfile4;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
                    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
                    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
                    private static void c(byte b, byte b2, short s, java.lang.Object[] objArr2) {
                        ?? r7 = 118 - (s * 19);
                        int i2 = 37 - (b * 33);
                        int i3 = b2 * 27;
                        byte[] bArr = $$a;
                        byte[] bArr2 = new byte[34 - i3];
                        int i4 = -1;
                        byte b3 = r7;
                        if (bArr == null) {
                            b3 = i2 + r7;
                            i2++;
                        }
                        while (true) {
                            i4++;
                            bArr2[i4] = b3;
                            if (i4 == 33 - i3) {
                                objArr2[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            byte b4 = b3;
                            b3 = b4 + bArr[i2];
                            i2++;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void d(int i2, int i3, byte b, java.lang.Object[] objArr2) {
                        int i4;
                        int i5 = b * 4;
                        int i6 = 4 - (i2 * 3);
                        byte[] bArr = $$d;
                        int i7 = 110 - (i3 * 3);
                        byte[] bArr2 = new byte[i5 + 1];
                        if (bArr == null) {
                            int i8 = i6;
                            int i9 = i5;
                            int i10 = 0;
                            int i11 = (-i6) + i9;
                            int i12 = i8 + 1;
                            i4 = i10;
                            i7 = i11;
                            i6 = i12;
                            bArr2[i4] = (byte) i7;
                            if (i4 == i5) {
                                objArr2[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            int i13 = i7;
                            i8 = i6;
                            i6 = bArr[i6];
                            i10 = i4 + 1;
                            i9 = i13;
                            int i112 = (-i6) + i9;
                            int i122 = i8 + 1;
                            i4 = i10;
                            i7 = i112;
                            i6 = i122;
                            bArr2[i4] = (byte) i7;
                            if (i4 == i5) {
                            }
                        } else {
                            i4 = 0;
                            bArr2[i4] = (byte) i7;
                            if (i4 == i5) {
                            }
                        }
                    }

                    private static void b(java.lang.String str, int i2, java.lang.Object[] objArr2) {
                        char[] cArr;
                        int i3 = $10;
                        $11 = (i3 + 35) % 128;
                        java.lang.Object obj = null;
                        if (str != null) {
                            int i4 = i3 + 1;
                            $11 = i4 % 128;
                            if (i4 % 2 == 0) {
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
                            int i5 = 58224;
                            int i6 = 0;
                            while (i6 < 16) {
                                char c = cArr4[1];
                                char c2 = cArr4[0];
                                try {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(valueOf)};
                                    int i7 = c2 + i5;
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                    if (obj2 == null) {
                                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.Gravity.getAbsoluteGravity(0, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1336, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        d(0, 0, (byte) 0, objArr4);
                                        obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                                    }
                                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(obj, objArr3)).charValue();
                                    cArr4[1] = charValue;
                                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                                    int i8 = charValue + i5;
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                    if (obj3 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 62, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1335, (char) (android.view.MotionEvent.axisFromString("") + 1));
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        d(0, 0, (byte) 0, objArr6);
                                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj3);
                                    }
                                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).charValue();
                                    i5 -= 40503;
                                    i6++;
                                    obj = null;
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
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3543, (char) (android.os.Process.myPid() >> 22))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                            obj = null;
                        }
                        objArr2[0] = new java.lang.String(cArr3, 0, i2);
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getAid() {
                        int i2 = getAid + 35;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 == 0) {
                            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.aid).DigitizedCardProfile();
                            throw null;
                        }
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.aid).DigitizedCardProfile();
                        getAid = (getProfileVersion + 51) % 128;
                        return DigitizedCardProfile2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPaymentFci() {
                        getProfileVersion = (getAid + 113) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.paymentFci).DigitizedCardProfile();
                        getProfileVersion = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        return DigitizedCardProfile2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getGpoResponse() {
                        getAid = (getProfileVersion + 113) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.gpoResponse).DigitizedCardProfile();
                        getAid = (getProfileVersion + 19) % 128;
                        return DigitizedCardProfile2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final int getCdol1RelatedDataLength() {
                        java.lang.String str;
                        int i2 = 107;
                        int i3 = getAid + 107;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 == 0) {
                            str = com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.cdol1RelatedDataLength;
                        } else {
                            str = com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.cdol1RelatedDataLength;
                            i2 = 16;
                        }
                        int parseInt = java.lang.Integer.parseInt(str, i2);
                        int i4 = getProfileVersion + 41;
                        getAid = i4 % 128;
                        if (i4 % 2 == 0) {
                            return parseInt;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getIssuerApplicationData() {
                        getProfileVersion = (getAid + 61) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.issuerApplicationData).DigitizedCardProfile();
                        int i2 = getAid + 43;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.gotDeleteData getCvmModel() {
                        int i2 = getAid;
                        getProfileVersion = (i2 + 97) % 128;
                        int i3 = i2 + 55;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                        int i2 = (getAid + 99) % 128;
                        getProfileVersion = i2;
                        getAid = (i2 + 115) % 128;
                        return null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPinIvCvc3Track2() {
                        getAid = (getProfileVersion + 9) % 128;
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.pinIvCvc3Track2).DigitizedCardProfile();
                        int i2 = getAid + 17;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isUsAipMaskingSupported() {
                        getProfileVersion = (getAid + 79) % 128;
                        return true;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents() {
                        getProfileVersion = (getAid + 37) % 128;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.iccPrivateKeyCrtComponents}, 1899222779, -1899222779, (int) java.lang.System.currentTimeMillis());
                        getAid = (getProfileVersion + 99) % 128;
                        return initializevisapaymentsdk;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.JsonRequest getAlternateContactlessPaymentData() {
                        int i2 = getProfileVersion + 115;
                        getAid = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                        com.payair.hce.JsonRequest jsonRequest = (com.payair.hce.JsonRequest) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.alternateContactlessPaymentData}, -1885591455, 1885591458, (int) java.lang.System.currentTimeMillis());
                        getAid = (getProfileVersion + 67) % 128;
                        return jsonRequest;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final java.util.List<com.payair.hce.setNetworkError> getRecords() {
                        int i2 = getAid + 29;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 != 0) {
                            return (java.util.List) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.records}, 1279096886, -1279096884, (int) java.lang.System.currentTimeMillis());
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack1ConstructionData() {
                        int i2 = (getProfileVersion + 29) % 128;
                        getAid = i2;
                        int i3 = i2 + 51;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack2ConstructionData() {
                        int i2 = getProfileVersion;
                        int i3 = i2 + 125;
                        getAid = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        getAid = (i2 + 15) % 128;
                        return null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDecline() {
                        int i2 = getAid + 33;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 == 0) {
                            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.ciacDecline).DigitizedCardProfile();
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.ContactlessPaymentDataV1Json.this.ciacDecline).DigitizedCardProfile();
                        int i3 = getAid + 73;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 != 0) {
                            return DigitizedCardProfile2;
                        }
                        throw null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x04f0 A[ADDED_TO_REGION] */
                    /* JADX WARN: Type inference failed for: r13v14 */
                    /* JADX WARN: Type inference failed for: r13v19 */
                    /* JADX WARN: Type inference failed for: r13v2 */
                    /* JADX WARN: Type inference failed for: r13v20 */
                    /* JADX WARN: Type inference failed for: r13v32 */
                    /* JADX WARN: Type inference failed for: r13v44 */
                    /* JADX WARN: Type inference failed for: r13v45 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static void writeReplace(long j, long j2) {
                        ?? r13;
                        char c;
                        java.lang.Object method;
                        int i2;
                        boolean z;
                        char c2;
                        java.lang.Object declaredMethod;
                        int i3;
                        boolean z2;
                        boolean z3;
                        java.lang.Object obj;
                        java.lang.Object invoke;
                        com.payair.hce.getObbDirs getobbdirs = new com.payair.hce.getObbDirs(j, j2);
                        byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                        byte b = bArr[30];
                        short s = bArr[2];
                        int i4 = 1;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(b, s, (short) (s | 578), objArr2);
                        java.lang.String str = (java.lang.String) objArr2[0];
                        byte b2 = bArr[2];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(b2, (short) (b2 | 425), (short) 153, objArr3);
                        try {
                            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
                            char c3 = 433;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            short s2 = 410;
                            a((byte) (-bArr[433]), (short) 410, (short) 153, objArr5);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a((byte) (bArr[570] + 1), (short) 421, (short) 138, objArr6);
                            java.lang.String str2 = (java.lang.String) objArr6[0];
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a((byte) (-bArr[433]), (short) 410, (short) 153, objArr7);
                            java.lang.Object[] objArr8 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
                            int[] iArr = new int[objArr8.length];
                            int i5 = 0;
                            while (i5 < objArr8.length) {
                                java.lang.Object[] objArr9 = {objArr8[i5]};
                                byte[] bArr2 = SdkCoreAlternateContactlessPaymentDataImpl;
                                byte b3 = (byte) (-bArr2[433]);
                                int i6 = IccPrivateKeyCrtComponentsJson;
                                short s3 = (short) (i6 + 3);
                                java.lang.Object[] objArr10 = new java.lang.Object[i4];
                                a(b3, (short) 409, s3, objArr10);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[i4];
                                a((byte) (bArr2[488] + i4), (short) (i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE), (short) (bArr2[0] + i4), objArr11);
                                java.lang.String str3 = (java.lang.String) objArr11[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[i4];
                                java.lang.Object[] objArr12 = new java.lang.Object[i4];
                                a((byte) (-bArr2[433]), (short) 410, (short) 153, objArr12);
                                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                java.lang.Object invoke2 = cls2.getMethod(str3, clsArr).invoke(null, objArr9);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a((byte) (-bArr2[433]), (short) 409, s3, objArr13);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a((short) 61, (short) 418, (short) 112, objArr14);
                                iArr[i5] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke2, null)).intValue();
                                i5++;
                                i4 = 1;
                            }
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                try {
                                    r13 = 41;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                }
                                switch (getobbdirs.AlternateContactlessPaymentDataJson(iArr[i7])) {
                                    case -38:
                                        i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                        c3 = 433;
                                        s2 = 410;
                                    case -37:
                                        getobbdirs.AlternateContactlessPaymentDataJson(41);
                                        int i9 = getobbdirs.writeReplace;
                                        i7 = (i9 == 80 || i9 != 90) ? 21 : 89;
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -36:
                                        i7 = 118;
                                        c3 = 433;
                                    case -35:
                                        try {
                                            getobbdirs.AlternateContactlessPaymentDataJson(41);
                                            i8 = 27;
                                            i7 = getobbdirs.writeReplace != 27 ? 1 : 71;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -34:
                                        i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                                        c3 = 433;
                                        s2 = 410;
                                    case -33:
                                        i7 = 126;
                                        c3 = 433;
                                        s2 = 410;
                                    case -32:
                                        try {
                                            getobbdirs.AlternateContactlessPaymentDataJson(30);
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        if (getobbdirs.writeReplace == 0) {
                                            i7 = 88;
                                            c3 = 433;
                                            s2 = 410;
                                        }
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -31:
                                        i7 = 119;
                                        c3 = 433;
                                        s2 = 410;
                                    case -30:
                                        i7 = 121;
                                        c3 = 433;
                                        s2 = 410;
                                    case -29:
                                        getobbdirs.AlternateContactlessPaymentDataJson(30);
                                        if (getobbdirs.writeReplace == 0) {
                                            i7 = 70;
                                            c3 = 433;
                                            s2 = 410;
                                        }
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -28:
                                        try {
                                            getobbdirs.values = 1;
                                            getobbdirs.AlternateContactlessPaymentDataJson(7);
                                            getobbdirs.AlternateContactlessPaymentDataJson(9);
                                            getProfileVersion = getobbdirs.writeReplace;
                                            i7 = i8;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            if ((i8 >= 21 || i8 > 39) && ((i8 < 39 || i8 > 49) && ((i8 < 89 || i8 > 108) && (i8 < 108 || i8 > 118)))) {
                                                throw th;
                                            }
                                            getobbdirs.getAid = th;
                                            getobbdirs.AlternateContactlessPaymentDataJson(46);
                                            i7 = 10;
                                            c3 = 433;
                                            s2 = 410;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                    case -27:
                                        try {
                                            getobbdirs.values = getAid;
                                            try {
                                                getobbdirs.AlternateContactlessPaymentDataJson(2);
                                                i7 = i8;
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                if (i8 >= 21) {
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -26:
                                        return;
                                    case -25:
                                        i7 = 80;
                                    case -24:
                                        i7 = 60;
                                        c3 = 433;
                                        s2 = 410;
                                    case -23:
                                        i7 = 58;
                                        c3 = 433;
                                        s2 = 410;
                                    case -22:
                                        c = 153;
                                        getobbdirs.values = 3;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.Class cls4 = (java.lang.Class) getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.String str4 = (java.lang.String) getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        method = cls4.getMethod(str4, (java.lang.Class[]) getobbdirs.getProfileVersion);
                                        getobbdirs.getAid = method;
                                        i2 = 1;
                                        try {
                                            getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                            i7 = i8;
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -21:
                                        c = 153;
                                        byte b4 = $$a[34];
                                        byte b5 = (byte) (b4 - 1);
                                        byte b6 = b4;
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        c(b5, b6, (byte) (b6 - 1), objArr15);
                                        method = (java.lang.String) objArr15[0];
                                        getobbdirs.getAid = method;
                                        i2 = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -20:
                                        c = 153;
                                        getobbdirs.values = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        method = java.lang.Class.forName((java.lang.String) getobbdirs.getProfileVersion);
                                        getobbdirs.getAid = method;
                                        i2 = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                        c = 153;
                                        byte b7 = $$a[34];
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        c(b7, (byte) (b7 - 1), b7, objArr16);
                                        method = (java.lang.String) objArr16[0];
                                        getobbdirs.getAid = method;
                                        i2 = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                        c = 153;
                                        getobbdirs.values = 3;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.Object obj2 = getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.Object obj3 = getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        try {
                                            java.lang.Object[] objArr17 = {obj3, getobbdirs.getProfileVersion};
                                            byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            a((byte) (-bArr3[c3]), (short) 402, (short) 28, objArr18);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            a((short) 61, (short) 420, bArr3[5], objArr19);
                                            java.lang.String str5 = (java.lang.String) objArr19[0];
                                            byte b8 = (byte) (-bArr3[c3]);
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            a(b8, s2, (short) 43, objArr20);
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            a((short) 47, (short) (IccPrivateKeyCrtComponentsJson | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE), bArr3[2], objArr21);
                                            method = cls5.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr20[0]), java.lang.Class.forName((java.lang.String) objArr21[0])).invoke(obj2, objArr17);
                                            getobbdirs.getAid = method;
                                            i2 = 1;
                                            getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                            i7 = i8;
                                            c3 = 433;
                                            s2 = 410;
                                        } catch (java.lang.Throwable th8) {
                                            java.lang.Throwable cause = th8.getCause();
                                            if (cause == null) {
                                                throw th8;
                                            }
                                            throw cause;
                                        }
                                    case -17:
                                        z = false;
                                        c2 = 153;
                                        getobbdirs.values = 3;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.Class cls6 = (java.lang.Class) getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.String str6 = (java.lang.String) getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        declaredMethod = cls6.getDeclaredMethod(str6, (java.lang.Class[]) getobbdirs.getProfileVersion);
                                        getobbdirs.getAid = declaredMethod;
                                        i3 = 1;
                                        r13 = z;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -16:
                                        r13 = 0;
                                        z = false;
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        c2 = 153;
                                        try {
                                            a((byte) (-SdkCoreAlternateContactlessPaymentDataImpl[c3]), s2, (short) 153, objArr22);
                                            declaredMethod = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                            getobbdirs.getAid = declaredMethod;
                                            i3 = 1;
                                            r13 = z;
                                            getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                            i7 = i8;
                                        } catch (java.lang.Throwable th9) {
                                            th = th9;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -15:
                                        z2 = false;
                                        getobbdirs.values = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(9);
                                        getobbdirs.getAid = new java.lang.Class[getobbdirs.writeReplace];
                                        i3 = 1;
                                        c2 = 153;
                                        r13 = z2;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -14:
                                        z3 = false;
                                        obj = "valueOf";
                                        getobbdirs.getAid = obj;
                                        z2 = z3;
                                        i3 = 1;
                                        c2 = 153;
                                        r13 = z2;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -13:
                                        z3 = false;
                                        obj = com.payair.hce.setLongClickable.class;
                                        getobbdirs.getAid = obj;
                                        z2 = z3;
                                        i3 = 1;
                                        c2 = 153;
                                        r13 = z2;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -12:
                                        z3 = false;
                                        getobbdirs.values = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(9);
                                        int i10 = getobbdirs.writeReplace;
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        a((byte) (-SdkCoreAlternateContactlessPaymentDataImpl[c3]), s2, (short) 43, objArr23);
                                        obj = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr23[0]), i10);
                                        getobbdirs.getAid = obj;
                                        z2 = z3;
                                        i3 = 1;
                                        c2 = 153;
                                        r13 = z2;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -11:
                                        getobbdirs.AlternateContactlessPaymentDataJson(14);
                                        throw ((java.lang.Throwable) getobbdirs.getProfileVersion);
                                    case -10:
                                        i7 = 19;
                                    case -9:
                                        i7 = 16;
                                    case -8:
                                        try {
                                            getobbdirs.AlternateContactlessPaymentDataJson(11);
                                        } catch (java.lang.Throwable th10) {
                                            th = th10;
                                            c2 = 153;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        if (getobbdirs.writeReplace == 0) {
                                            i7 = 15;
                                        } else {
                                            i7 = i8;
                                            c3 = 433;
                                            s2 = 410;
                                        }
                                        break;
                                    case -7:
                                        try {
                                            getobbdirs.values = 1;
                                            getobbdirs.AlternateContactlessPaymentDataJson(7);
                                            getobbdirs.AlternateContactlessPaymentDataJson(8);
                                            java.lang.Object obj4 = getobbdirs.getProfileVersion;
                                            try {
                                                byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                a((byte) (-bArr4[c3]), (short) (IccPrivateKeyCrtComponentsJson | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE), (short) (-bArr4[563]), objArr24);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                a((short) 59, (short) 418, (short) (bArr4[432] - 1), objArr25);
                                                z3 = false;
                                                try {
                                                    obj = cls7.getMethod((java.lang.String) objArr25[0], null).invoke(obj4, null);
                                                    getobbdirs.getAid = obj;
                                                    z2 = z3;
                                                    i3 = 1;
                                                    c2 = 153;
                                                    r13 = z2;
                                                    getobbdirs.AlternateContactlessPaymentDataJson(i3);
                                                    i7 = i8;
                                                } catch (java.lang.Throwable th11) {
                                                    th = th11;
                                                    java.lang.Throwable cause2 = th.getCause();
                                                    if (cause2 == null) {
                                                        throw th;
                                                    }
                                                    throw cause2;
                                                }
                                            } catch (java.lang.Throwable th12) {
                                                th = th12;
                                            }
                                        } catch (java.lang.Throwable th13) {
                                            th = th13;
                                            if (i8 >= 21) {
                                            }
                                            throw th;
                                        }
                                        c3 = 433;
                                        s2 = 410;
                                        break;
                                    case -6:
                                        i7 = 54;
                                    case -5:
                                        getobbdirs.values = 1;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.Object obj5 = getobbdirs.getProfileVersion;
                                        try {
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            a((byte) (-SdkCoreAlternateContactlessPaymentDataImpl[c3]), s2, (short) 153, objArr26);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                            a((short) 61, (short) 420, r4[488], objArr27);
                                            invoke = cls8.getMethod((java.lang.String) objArr27[0], null).invoke(obj5, null);
                                            getobbdirs.getAid = invoke;
                                            i2 = 1;
                                            c = 153;
                                            getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                            i7 = i8;
                                            c3 = 433;
                                            s2 = 410;
                                        } catch (java.lang.Throwable th14) {
                                            java.lang.Throwable cause3 = th14.getCause();
                                            if (cause3 == null) {
                                                throw th14;
                                            }
                                            throw cause3;
                                        }
                                    case -4:
                                        getobbdirs.values = 2;
                                        getobbdirs.AlternateContactlessPaymentDataJson(7);
                                        getobbdirs.AlternateContactlessPaymentDataJson(8);
                                        java.lang.String str7 = (java.lang.String) getobbdirs.getProfileVersion;
                                        getobbdirs.AlternateContactlessPaymentDataJson(9);
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        b(str7, getobbdirs.writeReplace, objArr28);
                                        invoke = (java.lang.String) objArr28[0];
                                        getobbdirs.getAid = invoke;
                                        i2 = 1;
                                        c = 153;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -3:
                                        try {
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            a((byte) (SdkCoreAlternateContactlessPaymentDataImpl[483] - 1), (short) 405, (short) 105, objArr29);
                                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                            a((short) 59, (short) 413, (short) 85, objArr30);
                                            getobbdirs.values = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr30[0], null).invoke(null, null)).intValue();
                                            getobbdirs.AlternateContactlessPaymentDataJson(2);
                                            i7 = i8;
                                            c3 = 433;
                                            s2 = 410;
                                        } catch (java.lang.Throwable th15) {
                                            java.lang.Throwable cause4 = th15.getCause();
                                            if (cause4 == null) {
                                                throw th15;
                                            }
                                            throw cause4;
                                        }
                                    case -2:
                                        invoke = "\ue757絤Იﲋ";
                                        getobbdirs.getAid = invoke;
                                        i2 = 1;
                                        c = 153;
                                        getobbdirs.AlternateContactlessPaymentDataJson(i2);
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                    case -1:
                                        i7 = 49;
                                    default:
                                        i7 = i8;
                                        c3 = 433;
                                        s2 = 410;
                                }
                            }
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause5 = th16.getCause();
                            if (cause5 == null) {
                                throw th16;
                            }
                            throw cause5;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(short s, short s2, short s3, java.lang.Object[] objArr2) {
                        int i2;
                        int i3;
                        byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                        int i4 = 426 - s2;
                        int i5 = 581 - s3;
                        int i6 = s + 44;
                        byte[] bArr2 = new byte[i4];
                        if (bArr == null) {
                            int i7 = i4;
                            int i8 = i5;
                            i3 = 0;
                            int i9 = i5 + (-i7);
                            i2 = i3;
                            i5 = i8;
                            i6 = i9;
                            int i10 = i5 + 1;
                            i3 = i2 + 1;
                            bArr2[i2] = (byte) i6;
                            if (i3 == i4) {
                                objArr2[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            i7 = bArr[i10];
                            i5 = i6;
                            i8 = i10;
                            int i92 = i5 + (-i7);
                            i2 = i3;
                            i5 = i8;
                            i6 = i92;
                            int i102 = i5 + 1;
                            i3 = i2 + 1;
                            bArr2[i2] = (byte) i6;
                            if (i3 == i4) {
                            }
                        } else {
                            i2 = 0;
                            int i1022 = i5 + 1;
                            i3 = i2 + 1;
                            bArr2[i2] = (byte) i6;
                            if (i3 == i4) {
                            }
                        }
                    }

                    static void DigitizedCardProfile() {
                        byte[] bArr = new byte[600];
                        java.lang.System.arraycopy("u!\u0000|ü\u0005ÿû\u0006ù\u0007ÿú\u0007ø\b÷\tö\nÿù\bÿø\tÿ÷\nû\u0001\u0004ÿö\u000bû\u0001\u0004ÿõ\fÿô\rÿü\u0001\u0004ûÿ\u0006ûþ\u0007ÿü\u0000\u0005ûþ\u0007ÿü\u0000\u0005ûü\tÿüÿ\u0006ûû\nûú\u000bûù\fÿüþ\u0007ÿüý\bûü\tÿüü\tûø\rÿüû\nú\u0002\u0004ÿüú\u000bûÿ\u0006ú\u0001\u0005ûÿ\u0006ÿüù\fûþ\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ú\u0001\u0005ÿû\u0000\u0006ú\u0001\u0005ú\u0001\u0005ÿüù\fûþ\u0007ÿûÿ\u0007ú\u0000\u0006ú\u0000\u0006úÿ\u0007ûþ\u0007ÿûþ\bú\u0000\u0006úþ\bûþ\u0007ÿûý\túý\tÿûü\nÿûû\u000búü\núû\u000búú\fúù\rúÿ\u0007ÿûú\fúþ\bÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿû\u0006ù\u0007ÿú\u0007ù\u0002\u0005ù\u0001\u0006ù\u0000\u0007ÿù\bÿø\tÿ÷\nÿûû\u000bùÿ\bùþ\tùý\nÿûú\fúþ\bÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bûü\tÿüÿ\u0006ùü\u000bùû\fùú\rú\u0002\u0004ÿüþ\u0007ÿüý\bûü\tÿüü\tø\u0004\u0004ÿüû\nú\u0002\u0004ÿüú\u000bûÿ\u0006ú\u0001\u0005ûÿ\u0006ÿüù\fûþ\u0007ÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ú\u0001\u0005ÿû\u0000\u0006ú\u0001\u0005ú\u0001\u0005ÿüù\fûþ\u0007ÿûÿ\u0007ÿúþ\tø\u0002\u0006ÿúý\nø\u0001\u0007ÿúý\nÿúü\u000bø\u0000\bÿúû\føÿ\tÿúû\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\u0002ñ'ìé-æì6Ô\u000bÿûú\u000fó\u0004\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ1âì\u0002\u000e\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bûø\u0007\u0004\u0006\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9".getBytes("ISO-8859-1"), 0, bArr, 0, 600);
                        SdkCoreAlternateContactlessPaymentDataImpl = bArr;
                        IccPrivateKeyCrtComponentsJson = 131;
                    }

                    static {
                        init$1();
                        $10 = 0;
                        $11 = 1;
                        init$0();
                        DigitizedCardProfile();
                        getAid = 0;
                        getProfileVersion = 1;
                        DigitizedCardProfile = (char) 59966;
                        AlternateContactlessPaymentDataJson = (char) 25069;
                        writeReplace = (char) 16217;
                        valueOf = (char) 63891;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCvrMaskAnd() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 2034296812, -2034296811, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDeclineOnPpms() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 124018037, -124018034, java.lang.System.identityHashCode(this));
                    }

                    static void init$1() {
                        $$d = new byte[]{109, 99, -23, -23};
                        $$e = 97;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isTransitSupported() {
                        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 1563841224, -1563841222, java.lang.System.identityHashCode(this))).booleanValue();
                    }

                    static void init$0() {
                        $$a = new byte[]{92, 60, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.IResultReceiver, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
                        $$b = 81;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPpseFci() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -292321047, 292321047, java.lang.System.identityHashCode(this));
                    }
                };
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCode getDsrpData() {
                final com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json remotePaymentDataV1Json = com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json.this.mppLiteModule.remotePaymentData;
                if (remotePaymentDataV1Json != null) {
                    com.payair.hce.getStatusCode getstatuscode = new com.payair.hce.getStatusCode() { // from class: com.payair.hce.getCodeCacheDir.2
                        private static int DigitizedCardProfile = 0;
                        private static int valueOf = 1;

                        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i, int i2, int i3) {
                            int i4 = ~i;
                            int i5 = ~((~i3) | i4);
                            switch ((i * (-337)) + (i2 * 339) + (((~((~i2) | i)) | i5 | (~(i | i3))) * (-338)) + ((~(i4 | i2)) * 338) + (((~(i | i2 | i3)) | i5) * 338)) {
                                case 1:
                                    return AlternateContactlessPaymentDataJson(objArr2);
                                case 2:
                                    return writeReplace(objArr2);
                                case 3:
                                    return values(objArr2);
                                case 4:
                                    int i6 = DigitizedCardProfile;
                                    valueOf = ((((i6 | 22) << 1) - (i6 ^ 22)) - 1) % 128;
                                    com.payair.hce.gotPutData gotputdata = com.payair.hce.gotPutData.valueOf;
                                    int i7 = valueOf;
                                    DigitizedCardProfile = (((i7 ^ 78) + ((i7 & 78) << 1)) - 1) % 128;
                                    return gotputdata;
                                case 5:
                                    return DigitizedCardProfile(objArr2);
                                case 6:
                                    return RecordsJson(objArr2);
                                case 7:
                                    com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                                    int i8 = DigitizedCardProfile;
                                    valueOf = ((i8 & 67) + (i8 | 67)) % 128;
                                    byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.ciacDecline).DigitizedCardProfile();
                                    int i9 = valueOf;
                                    DigitizedCardProfile = ((i9 & 17) + (i9 | 17)) % 128;
                                    return DigitizedCardProfile2;
                                case 8:
                                    return getAid(objArr2);
                                case 9:
                                    com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass22 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                                    int i10 = DigitizedCardProfile;
                                    int i11 = i10 & 35;
                                    int i12 = i10 | 35;
                                    valueOf = ((i11 & i12) + (i12 | i11)) % 128;
                                    byte[] DigitizedCardProfile3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.cvrMaskAnd).DigitizedCardProfile();
                                    int i13 = DigitizedCardProfile;
                                    int i14 = i13 ^ 93;
                                    int i15 = (i13 & 93) << 1;
                                    valueOf = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                                    return DigitizedCardProfile3;
                                case 10:
                                    return SdkCoreAlternateContactlessPaymentDataImpl(objArr2);
                                default:
                                    return valueOf(objArr2);
                            }
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                            int i = valueOf;
                            int i2 = i & 5;
                            int i3 = ((i ^ 5) | i2) << 1;
                            int i4 = -((i | 5) & (~i2));
                            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                            DigitizedCardProfile = i5 % 128;
                            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.aip);
                            if (i5 % 2 == 0) {
                                return AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            }
                            AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr2) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                            int i = DigitizedCardProfile;
                            int i2 = i ^ 51;
                            int i3 = ((i & 51) | i2) << 1;
                            int i4 = -i2;
                            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                            valueOf = i5 % 128;
                            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.applicationExpiryDate);
                            if (i5 % 2 == 0) {
                                AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                                throw null;
                            }
                            byte[] DigitizedCardProfile2 = AlternateContactlessPaymentDataJson2.DigitizedCardProfile();
                            int i6 = DigitizedCardProfile;
                            int i7 = i6 & 119;
                            int i8 = (((i6 | 119) & (~i7)) - (~(i7 << 1))) - 1;
                            valueOf = i8 % 128;
                            if (i8 % 2 != 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr2) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                            int i = DigitizedCardProfile;
                            valueOf = (((i & 75) - (~(-(-(i | 75))))) - 1) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.panSequenceNumber).DigitizedCardProfile();
                            int i2 = DigitizedCardProfile + 31;
                            valueOf = i2 % 128;
                            if (i2 % 2 != 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                            int i = valueOf;
                            int i2 = i ^ 111;
                            int i3 = ((i & 111) | i2) << 1;
                            int i4 = -i2;
                            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
                            DigitizedCardProfile = i5 % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.track2Equivalent).DigitizedCardProfile();
                            if (i5 % 2 != 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            int i6 = valueOf;
                            int i7 = i6 & 3;
                            int i8 = i7 + ((i6 ^ 3) | i7);
                            DigitizedCardProfile = i8 % 128;
                            if (i8 % 2 == 0) {
                                return DigitizedCardProfile2;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                            com.payair.hce.getCodeCacheDir.AnonymousClass2 anonymousClass2 = (com.payair.hce.getCodeCacheDir.AnonymousClass2) objArr2[0];
                            int i = DigitizedCardProfile;
                            valueOf = ((i ^ 55) + ((i & 55) << 1)) % 128;
                            byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.mastercard.mpsdk.card.profile.v1.RemotePaymentDataV1Json.this.issuerApplicationData).DigitizedCardProfile();
                            int i2 = DigitizedCardProfile;
                            int i3 = i2 & 107;
                            int i4 = (i2 ^ 107) | i3;
                            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                            valueOf = i5 % 128;
                            if (i5 % 2 != 0) {
                                return DigitizedCardProfile2;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr2) {
                            int i = DigitizedCardProfile;
                            int i2 = (i & (-28)) | ((~i) & 27);
                            int i3 = (i & 27) << 1;
                            valueOf = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
                            int i4 = (((i | 28) << 1) - (i ^ 28)) - 1;
                            valueOf = i4 % 128;
                            if (i4 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                            int i = valueOf;
                            int i2 = i & 21;
                            int i3 = (i ^ 21) | i2;
                            DigitizedCardProfile = ((i2 & i3) + (i2 | i3)) % 128;
                            int i4 = i & 121;
                            int i5 = (i | 121) & (~i4);
                            int i6 = -(-(i4 << 1));
                            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                            DigitizedCardProfile = i7 % 128;
                            if (i7 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                            int i = DigitizedCardProfile;
                            int i2 = (((i ^ 97) | (i & 97)) << 1) - ((i & (-98)) | ((~i) & 97));
                            valueOf = i2 % 128;
                            if (i2 % 2 != 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCvrMaskAnd() {
                            return (byte[]) values(new java.lang.Object[]{this}, -2139861306, 2139861315, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCiacDecline() {
                            return (byte[]) values(new java.lang.Object[]{this}, 1637039710, -1637039703, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPar() {
                            return (byte[]) values(new java.lang.Object[]{this}, 1448987663, -1448987661, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.gotPutData getUcafVersion() {
                            return (com.payair.hce.gotPutData) values(new java.lang.Object[]{this}, -1756659494, 1756659498, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                            return (com.payair.hce.setSendAuthenticationHeader) values(new java.lang.Object[]{this}, -378182545, 378182545, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.gotDeleteData getCvmModel() {
                            return (com.payair.hce.gotDeleteData) values(new java.lang.Object[]{this}, 278725574, -278725568, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getIssuerApplicationData() {
                            return (byte[]) values(new java.lang.Object[]{this}, 2103337386, -2103337381, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getTrack2EquivalentData() {
                            return (byte[]) values(new java.lang.Object[]{this}, 595498331, -595498330, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPanSequenceNumber() {
                            return (byte[]) values(new java.lang.Object[]{this}, 2049493704, -2049493696, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getExpiryDate() {
                            return (byte[]) values(new java.lang.Object[]{this}, 1593111744, -1593111734, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getAip() {
                            return (byte[]) values(new java.lang.Object[]{this}, -1635383025, 1635383028, java.lang.System.identityHashCode(this));
                        }
                    };
                    getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 23) % 128;
                    return getstatuscode;
                }
                int i = getProfileVersion + 117;
                int i2 = i % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i2;
                if (i % 2 != 0) {
                    throw null;
                }
                getProfileVersion = (i2 + 27) % 128;
                return null;
            }

            private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr2) {
                java.lang.String str3 = str2;
                int i2 = $11 + 119;
                $10 = i2 % 128;
                byte[] bArr = str3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (str3 != null) {
                    bArr = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                char[] charArray = str != null ? str.toCharArray() : str;
                com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
                char[] cArr = AlternateContactlessPaymentDataJson;
                float f = 0.0f;
                if (cArr != null) {
                    $10 = ($11 + 73) % 128;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr[i3])};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 286 - (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)), (char) (46337 - (android.util.TypedValue.complexToFraction(0, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(0, f, f) == f ? 0 : -1))))).getMethod("y", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                            }
                            cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).charValue();
                            i3++;
                            f = 0.0f;
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
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.os.Process.myPid() >> 22), 286 - (android.os.Process.myTid() >> 22), (char) (46337 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("x", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                if (writeReplace) {
                    getumdgeneration.values = bArr2.length;
                    char[] cArr3 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                        java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 44, 1630 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b((byte) 0, (byte) 0, 0, objArr6);
                            obj3 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    }
                    objArr2[0] = new java.lang.String(cArr3);
                    return;
                }
                if (!values) {
                    getumdgeneration.values = iArr.length;
                    char[] cArr4 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    int i4 = $11 + 89;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                        getumdgeneration.valueOf++;
                    }
                    objArr2[0] = new java.lang.String(cArr4);
                    return;
                }
                getumdgeneration.values = charArray.length;
                char[] cArr5 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1630 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, 0, objArr8);
                        obj4 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                }
                objArr2[0] = new java.lang.String(cArr5);
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                SdkCoreAlternateContactlessPaymentDataImpl = 0;
                getProfileVersion = 1;
                AlternateContactlessPaymentDataJson = new char[]{10761};
                valueOf = -143185293;
                values = true;
                writeReplace = true;
            }

            static void init$0() {
                $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
                $$b = 30;
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.setDetailedMessage getWalletData() {
                return (com.payair.hce.setDetailedMessage) writeReplace(new java.lang.Object[]{this}, -1959646216, 1959646216, java.lang.System.identityHashCode(this));
            }
        };
        int i = values;
        int i2 = i & 69;
        int i3 = i2 + ((i ^ 69) | i2);
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return checkforsuccess;
        }
        throw new java.lang.ArithmeticException();
    }

    public getCodeCacheDir(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2) throws com.payair.hce.updateSukFileName {
        hasversioncheckfailed.DigitizedCardProfile();
        if (hasversioncheckfailed.valueOf() == null && hasversioncheckfailed.values() == null && hasversioncheckfailed.writeReplace() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.DigitizedCardProfile);
        }
        com.payair.hce.createConfigurationContext createconfigurationcontext = new com.payair.hce.createConfigurationContext(hasversioncheckfailed);
        this.writeReplace = createconfigurationcontext;
        if (((java.lang.Boolean) com.payair.hce.createConfigurationContext.valueOf(new java.lang.Object[]{createconfigurationcontext}, -1089688552, 1089688552, java.lang.System.identityHashCode(createconfigurationcontext))).booleanValue()) {
            this.valueOf = new com.payair.hce.setPanSequenceNumber(hasversioncheckfailed, this.writeReplace, list, list2);
        }
        if (this.writeReplace.writeReplace()) {
            this.AlternateContactlessPaymentDataJson = new com.payair.hce.setTrack2EquivalentData(hasversioncheckfailed);
        }
        com.payair.hce.createConfigurationContext createconfigurationcontext2 = this.writeReplace;
        if (((java.lang.Boolean) com.payair.hce.createConfigurationContext.valueOf(new java.lang.Object[]{createconfigurationcontext2}, 727813202, -727813200, java.lang.System.identityHashCode(createconfigurationcontext2))).booleanValue()) {
            try {
                this.DigitizedCardProfile = new com.payair.hce.addCardAndSuk(hasversioncheckfailed);
            } catch (java.lang.Exception unused) {
                this.writeReplace.getAid();
            }
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) objArr[0];
        int i = getAid;
        values = (i + 109) % 128;
        com.payair.hce.setPanSequenceNumber setpansequencenumber = getcodecachedir.valueOf;
        int i2 = i & 57;
        int i3 = (((i | 57) & (~i2)) - (~(i2 << 1))) - 1;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return setpansequencenumber;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) objArr[0];
        int i = getAid;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        values = i2 % 128;
        com.payair.hce.setTrack2EquivalentData settrack2equivalentdata = getcodecachedir.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return settrack2equivalentdata;
        }
        throw null;
    }

    public final com.payair.hce.addCardAndSuk values() {
        return (com.payair.hce.addCardAndSuk) valueOf(new java.lang.Object[]{this}, -1462391279, 1462391281, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setTrack2EquivalentData AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setTrack2EquivalentData) valueOf(new java.lang.Object[]{this}, 1387703596, -1387703595, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setPanSequenceNumber valueOf() {
        return (com.payair.hce.setPanSequenceNumber) valueOf(new java.lang.Object[]{this}, -687040266, 687040266, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.createConfigurationContext writeReplace() {
        return (com.payair.hce.createConfigurationContext) valueOf(new java.lang.Object[]{this}, -775162360, 775162363, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.checkForSuccess values(com.mastercard.mpsdk.card.profile.v1.DigitizedCardProfileV1Json digitizedCardProfileV1Json) {
        return (com.payair.hce.checkForSuccess) valueOf(new java.lang.Object[]{digitizedCardProfileV1Json}, -522720079, 522720083, (int) java.lang.System.currentTimeMillis());
    }
}
