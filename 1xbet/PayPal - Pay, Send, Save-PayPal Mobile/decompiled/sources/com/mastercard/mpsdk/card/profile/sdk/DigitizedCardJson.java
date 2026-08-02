package com.mastercard.mpsdk.card.profile.sdk;

/* loaded from: classes4.dex */
public class DigitizedCardJson {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "accountType")
    public java.lang.String accountType;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardCountryCode")
    public java.lang.String cardCountryCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessPaymentData")
    public com.mastercard.mpsdk.card.profile.sdk.CardContactlessPaymentDataJson contactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "digitizedCardId")
    public java.lang.String digitizedCardId;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpData")
    public com.mastercard.mpsdk.card.profile.sdk.CardDsrpDataJson dsrpData;

    @com.payair.hce.setSelectionFromTop(valueOf = "isTransactionIdRequired")
    public boolean isTransactionIdRequired;

    @com.payair.hce.setSelectionFromTop(valueOf = "pan")
    public java.lang.String pan;

    @com.payair.hce.setSelectionFromTop(valueOf = "productType")
    public java.lang.String productType;

    @com.payair.hce.setSelectionFromTop(valueOf = "version")
    public java.lang.String profileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = "walletRelatedData")
    public com.mastercard.mpsdk.card.profile.sdk.CardWalletRelatedDataJson walletRelatedData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = (i * 2) + 117;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = s * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = (-i4) + i7;
            i2 = i8;
            int i10 = i6;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            int i11 = i4 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i3;
            i6 = i11;
            i4 = bArr[i11];
            i8 = i2 + 1;
            i7 = i12;
            int i92 = (-i4) + i7;
            i2 = i8;
            int i102 = i6;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            int i112 = i4 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1122 = i4 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 29;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 69) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, android.graphics.Color.blue(0) + 1921, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) -1, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 429, (char) (31611 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) -1, 1, (short) 0, objArr5);
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

    public DigitizedCardJson() {
    }

    private DigitizedCardJson(com.payair.hce.checkForSuccess checkforsuccess) {
        this.profileVersion = checkforsuccess.getVersion().toString();
        this.digitizedCardId = buildValue(checkforsuccess.getDigitizedCardId());
        this.cardCountryCode = buildValue(checkforsuccess.getCardCountryCode());
        this.pan = buildValue(checkforsuccess.getPan());
        this.accountType = checkforsuccess.getWalletData().getAccountType().toString();
        this.productType = checkforsuccess.getWalletData().getProductType().toString();
        this.isTransactionIdRequired = checkforsuccess.isTransactionIdRequired();
        assignWalletRelatedData(checkforsuccess.getWalletData());
        assignDsrpData(checkforsuccess.getDsrpData());
        assignContactlessData(checkforsuccess.getContactlessPaymentData());
    }

    private void assignContactlessData(com.payair.hce.JsonResponse jsonResponse) {
        AlternateContactlessPaymentDataJson = (valueOf + 97) % 128;
        if (jsonResponse != null) {
            com.mastercard.mpsdk.card.profile.sdk.CardContactlessPaymentDataJson cardContactlessPaymentDataJson = new com.mastercard.mpsdk.card.profile.sdk.CardContactlessPaymentDataJson();
            this.contactlessPaymentData = cardContactlessPaymentDataJson;
            cardContactlessPaymentDataJson.cvrMaskAnd = buildValue(jsonResponse.getCvrMaskAnd());
            this.contactlessPaymentData.ciacDeclineOnPpms = buildValue(jsonResponse.getCiacDeclineOnPpms());
            this.contactlessPaymentData.ciacDecline = buildValue(jsonResponse.getCiacDecline());
            this.contactlessPaymentData.aid = buildValue(jsonResponse.getAid());
            this.contactlessPaymentData.cdol1RelatedDataLength = jsonResponse.getCdol1RelatedDataLength();
            if (jsonResponse.getCvmModel() != null) {
                int i = AlternateContactlessPaymentDataJson + 17;
                valueOf = i % 128;
                if (i % 2 == 0) {
                    this.contactlessPaymentData.cvmModel = jsonResponse.getCvmModel().toString();
                    throw null;
                }
                this.contactlessPaymentData.cvmModel = jsonResponse.getCvmModel().toString();
            }
            if (jsonResponse.getUmdGeneration() != null) {
                AlternateContactlessPaymentDataJson = (valueOf + 107) % 128;
                this.contactlessPaymentData.umdGeneration = jsonResponse.getUmdGeneration().toString();
                valueOf = (AlternateContactlessPaymentDataJson + 89) % 128;
            }
            this.contactlessPaymentData.gpoResponse = buildValue(jsonResponse.getGpoResponse());
            com.mastercard.mpsdk.card.profile.sdk.CardContactlessPaymentDataJson cardContactlessPaymentDataJson2 = this.contactlessPaymentData;
            com.payair.hce.initializeVisaPaymentSdk iccPrivateKeyCrtComponents = jsonResponse.getIccPrivateKeyCrtComponents();
            cardContactlessPaymentDataJson2.iccPrivateKeyCrtComponents = buildValue((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{iccPrivateKeyCrtComponents}, -1877837077, 1877837077, java.lang.System.identityHashCode(iccPrivateKeyCrtComponents)));
            this.contactlessPaymentData.paymentFci = buildValue(jsonResponse.getPaymentFci());
            this.contactlessPaymentData.ppseFci = buildValue(jsonResponse.getPpseFci());
            this.contactlessPaymentData.issuerApplicationData = buildValue(jsonResponse.getIssuerApplicationData());
            this.contactlessPaymentData.pinIvCvc3Track2 = buildValue(jsonResponse.getPinIvCvc3Track2());
            this.contactlessPaymentData.isTransitSupported = jsonResponse.isTransitSupported();
            this.contactlessPaymentData.isUsAipMaskingSupported = jsonResponse.isUsAipMaskingSupported();
            assignAlternateContactlessData(jsonResponse.getAlternateContactlessPaymentData());
            assignTrack1ConstructionData(jsonResponse.getTrack1ConstructionData());
            assignTrack2ConstructionData(jsonResponse.getTrack2ConstructionData());
            assignRecords(jsonResponse.getRecords());
        }
    }

    private void assignRecords(java.util.List<com.payair.hce.setNetworkError> list) {
        int i = AlternateContactlessPaymentDataJson + 45;
        valueOf = i % 128;
        if (i % 2 != 0) {
            if (list == null || list.isEmpty()) {
                return;
            }
            AlternateContactlessPaymentDataJson = (valueOf + 39) % 128;
            com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson[] cardRecordsJsonArr = new com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson[list.size()];
            int i2 = 0;
            for (com.payair.hce.setNetworkError setnetworkerror : list) {
                com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson cardRecordsJson = new com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson();
                cardRecordsJsonArr[i2] = cardRecordsJson;
                cardRecordsJson.recordNumber = setnetworkerror.getRecordNumber();
                cardRecordsJsonArr[i2].sfi = buildValue(setnetworkerror.getSfi());
                cardRecordsJsonArr[i2].recordValue = buildValue(setnetworkerror.getRecordValue());
                i2++;
            }
            this.contactlessPaymentData.records = cardRecordsJsonArr;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    private void assignTrack1ConstructionData(com.payair.hce.setErrorName seterrorname) {
        int i = valueOf + 3;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (seterrorname != null) {
            this.contactlessPaymentData.track1ConstructionData = new com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson();
            this.contactlessPaymentData.track1ConstructionData.nAtc = buildValue(seterrorname.getNAtc());
            this.contactlessPaymentData.track1ConstructionData.pUnAtc = buildValue(seterrorname.getPUnAtc());
            this.contactlessPaymentData.track1ConstructionData.pCvc3 = buildValue(seterrorname.getPCvc3());
            this.contactlessPaymentData.track1ConstructionData.trackData = buildValue(seterrorname.getTrackData());
            AlternateContactlessPaymentDataJson = (valueOf + 11) % 128;
        }
    }

    private void assignTrack2ConstructionData(com.payair.hce.setErrorName seterrorname) {
        int i = valueOf + 43;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (seterrorname != null) {
            this.contactlessPaymentData.track2ConstructionData = new com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson();
            this.contactlessPaymentData.track2ConstructionData.nAtc = buildValue(seterrorname.getNAtc());
            this.contactlessPaymentData.track2ConstructionData.pUnAtc = buildValue(seterrorname.getPUnAtc());
            this.contactlessPaymentData.track2ConstructionData.pCvc3 = buildValue(seterrorname.getPCvc3());
            this.contactlessPaymentData.track2ConstructionData.trackData = buildValue(seterrorname.getTrackData());
        }
        int i2 = valueOf + 59;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void assignAlternateContactlessData(com.payair.hce.JsonRequest jsonRequest) {
        int i = valueOf + 29;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (jsonRequest != null) {
            this.contactlessPaymentData.alternateContactlessPaymentData = new com.mastercard.mpsdk.card.profile.sdk.CardAlternateContactlessPaymentDataJson();
            this.contactlessPaymentData.alternateContactlessPaymentData.paymentFci = buildValue(jsonRequest.getPaymentFci());
            this.contactlessPaymentData.alternateContactlessPaymentData.aid = buildValue(jsonRequest.getAid());
            this.contactlessPaymentData.alternateContactlessPaymentData.ciacDecline = buildValue(jsonRequest.getCiacDecline());
            this.contactlessPaymentData.alternateContactlessPaymentData.cvrMaskAnd = buildValue(jsonRequest.getCvrMaskAnd());
            this.contactlessPaymentData.alternateContactlessPaymentData.gpoResponse = buildValue(jsonRequest.getgpoResponse());
            valueOf = (AlternateContactlessPaymentDataJson + 27) % 128;
        }
    }

    private void assignDsrpData(com.payair.hce.getStatusCode getstatuscode) {
        int i = valueOf + 3;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (getstatuscode != null) {
            com.mastercard.mpsdk.card.profile.sdk.CardDsrpDataJson cardDsrpDataJson = new com.mastercard.mpsdk.card.profile.sdk.CardDsrpDataJson();
            this.dsrpData = cardDsrpDataJson;
            cardDsrpDataJson.cvrMaskAnd = buildValue(getstatuscode.getCvrMaskAnd());
            this.dsrpData.ciacDecline = buildValue(getstatuscode.getCiacDecline());
            this.dsrpData.aip = buildValue(getstatuscode.getAip());
            this.dsrpData.expiryDate = buildValue(getstatuscode.getExpiryDate());
            this.dsrpData.issuerApplicationData = buildValue(getstatuscode.getIssuerApplicationData());
            this.dsrpData.panSequenceNumber = buildValue(getstatuscode.getPanSequenceNumber());
            this.dsrpData.par = buildValue(getstatuscode.getPar());
            this.dsrpData.track2EquivalentData = buildValue(getstatuscode.getTrack2EquivalentData());
            if (getstatuscode.getUcafVersion() != null) {
                valueOf = (AlternateContactlessPaymentDataJson + 103) % 128;
                this.dsrpData.ucafVersion = getstatuscode.getUcafVersion().toString();
            }
            if (getstatuscode.getUmdGeneration() != null) {
                int i2 = AlternateContactlessPaymentDataJson + 35;
                valueOf = i2 % 128;
                if (i2 % 2 != 0) {
                    this.dsrpData.umdGeneration = getstatuscode.getUmdGeneration().toString();
                } else {
                    this.dsrpData.umdGeneration = getstatuscode.getUmdGeneration().toString();
                    throw null;
                }
            }
            if (getstatuscode.getCvmModel() != null) {
                valueOf = (AlternateContactlessPaymentDataJson + 89) % 128;
                this.dsrpData.cvmModel = getstatuscode.getCvmModel().toString();
            }
        }
    }

    private void assignWalletRelatedData(com.payair.hce.setDetailedMessage setdetailedmessage) {
        if (setdetailedmessage != null) {
            this.walletRelatedData = new com.mastercard.mpsdk.card.profile.sdk.CardWalletRelatedDataJson();
            if (setdetailedmessage.getCardholderValidator() != null) {
                AlternateContactlessPaymentDataJson = (valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                this.walletRelatedData.cardholderValidator = setdetailedmessage.getCardholderValidator().toString();
                AlternateContactlessPaymentDataJson = (valueOf + 29) % 128;
            }
            this.walletRelatedData.cvmResetTimeout = setdetailedmessage.getCvmResetTimeout();
            this.walletRelatedData.dualTapResetTimeout = setdetailedmessage.getDualTapResetTimeout();
        }
    }

    private java.lang.String buildValue(byte[] bArr) {
        if (bArr != null) {
            int i = AlternateContactlessPaymentDataJson + 17;
            valueOf = i % 128;
            if (i % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                return com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
            }
        }
        valueOf = (AlternateContactlessPaymentDataJson + 117) % 128;
        return null;
    }

    public byte[] getContent(com.payair.hce.checkForSuccess checkforsuccess) {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("챉\uab1c챣屹㮿轩ᒬ囂嵄Ẩ蘨", 1 - android.view.View.MeasureSpec.getMode(0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("܋磒ݨಠ鞐峦䑸\ufaf5阆쵶훶榁▶㾒杝ᠩ댮ꀴ\uf037뚠䋕ክ节┰큣菄\u135c폏濦\uf452뷱䉻ﺛ曮", android.text.TextUtils.getOffsetAfter("", 0) + 1, objArr2);
        setchilddivider.values(((java.lang.String) objArr2[0]).intern());
        byte[] bytes = setchilddivider.DigitizedCardProfile(new com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson(checkforsuccess)).getBytes();
        int i = AlternateContactlessPaymentDataJson + 59;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return bytes;
        }
        throw null;
    }

    public com.payair.hce.checkForSuccess getCard(byte[] bArr) {
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        final com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson digitizedCardJson = (com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, new java.lang.String(bArr), com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.payair.hce.checkForSuccess checkforsuccess = new com.payair.hce.checkForSuccess() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static int DigitizedCardProfile;
            private static int RecordsJson;
            private static int SdkCoreAlternateContactlessPaymentDataImpl;
            private static int valueOf;
            private static byte[] values;
            private static short[] writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
                int i3;
                int i4 = i2 + 4;
                int i5 = 104 - (i * 2);
                byte[] bArr2 = $$a;
                int i6 = s * 3;
                byte[] bArr3 = new byte[i6 + 1];
                if (bArr2 == null) {
                    int i7 = i6;
                    int i8 = 0;
                    i5 += -i7;
                    i3 = i8;
                    bArr3[i3] = (byte) i5;
                    i8 = i3 + 1;
                    i4++;
                    if (i3 == i6) {
                        objArr[0] = new java.lang.String(bArr3, 0);
                        return;
                    }
                    i7 = bArr2[i4];
                    i5 += -i7;
                    i3 = i8;
                    bArr3[i3] = (byte) i5;
                    i8 = i3 + 1;
                    i4++;
                    if (i3 == i6) {
                    }
                } else {
                    i3 = 0;
                    bArr3[i3] = (byte) i5;
                    i8 = i3 + 1;
                    i4++;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x0204  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
                long j;
                boolean z;
                int length;
                byte[] bArr2;
                int i4;
                long j2;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i5 = 2;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 28 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    int i6 = intValue == -1 ? 1 : 0;
                    if (i6 != 0) {
                        int i7 = ($10 + 87) % 128;
                        $11 = i7;
                        byte[] bArr3 = values;
                        if (bArr3 != null) {
                            int i8 = i7 + 107;
                            $10 = i8 % 128;
                            if (i8 % 2 != 0) {
                                length = bArr3.length;
                                bArr2 = new byte[length];
                                i4 = 1;
                            } else {
                                length = bArr3.length;
                                bArr2 = new byte[length];
                                i4 = 0;
                            }
                            while (i4 < length) {
                                int i9 = $11 + 57;
                                $10 = i9 % 128;
                                if (i9 % i5 != 0) {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i4])};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.getOffsetBefore("", 0), 5088 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.getDefaultSize(0, 0))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                    }
                                    bArr2[i4] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                    i4 <<= 1;
                                    i5 = 2;
                                } else {
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr3[i4])};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj3 == null) {
                                        j2 = 0;
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 31, 5087 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                                    } else {
                                        j2 = 0;
                                    }
                                    bArr2[i4] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                                    i4++;
                                    i5 = 2;
                                }
                            }
                            bArr3 = bArr2;
                        }
                        if (bArr3 == null) {
                            j = -4897270311952305750L;
                            intValue = (short) (((short) (writeReplace[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                            if (intValue > 0) {
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (DigitizedCardProfile ^ j)) + i6;
                                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson), sb};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj4 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2365, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    b(0, -1, (short) 0, objArr6);
                                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                byte[] bArr4 = values;
                                if (bArr4 != null) {
                                    int length2 = bArr4.length;
                                    byte[] bArr5 = new byte[length2];
                                    int i10 = 0;
                                    while (i10 < length2) {
                                        int i11 = $11 + 121;
                                        $10 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            bArr5[i10] = (byte) (bArr4[i10] + 4897270311952305750L);
                                        } else {
                                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4897270311952305750L));
                                            i10++;
                                        }
                                    }
                                    bArr4 = bArr5;
                                }
                                if (bArr4 != null) {
                                    int i12 = ($10 + 81) % 128;
                                    $11 = i12;
                                    int i13 = i12 + 87;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z) {
                                        $10 = ($11 + 63) % 128;
                                        byte[] bArr6 = values;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    } else {
                                        short[] sArr = writeReplace;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    }
                                    sb.append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    gettrack2constructiondata.DigitizedCardProfile++;
                                }
                            }
                            objArr[0] = sb.toString();
                        }
                        byte[] bArr7 = values;
                        java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj5 == null) {
                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.getTrimmedLength(""), 29 - android.view.KeyEvent.keyCodeFromString(""), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                        }
                        intValue = (byte) (((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
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

            @Override // com.payair.hce.checkForSuccess
            public com.payair.hce.getStatusCodeFromServer getVersion() {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 21) % 128;
                java.lang.String str = digitizedCardJson.profileVersion;
                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((-191734912) - (doubleTapTimeout >> 16), (pressedStateDuration >> 16) - 741336248, (-45) - packedPositionType, (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((-67) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
                if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    return com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
                }
                com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile;
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 113) % 128;
                return getstatuscodefromserver;
            }

            @Override // com.payair.hce.checkForSuccess
            public byte[] getDigitizedCardId() {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 57) % 128;
                byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.digitizedCardId);
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 93) % 128;
                return writeReplace2;
            }

            @Override // com.payair.hce.checkForSuccess
            public byte[] getCardCountryCode() {
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 115) % 128;
                byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.cardCountryCode);
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 49) % 128;
                return writeReplace2;
            }

            @Override // com.payair.hce.checkForSuccess
            public byte[] getPan() {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 1) % 128;
                byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.pan);
                int i = RecordsJson + 29;
                SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                if (i % 2 != 0) {
                    return writeReplace2;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.checkForSuccess
            public boolean isTransactionIdRequired() {
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 5;
                RecordsJson = i % 128;
                boolean z = digitizedCardJson.isTransactionIdRequired;
                if (i % 2 == 0) {
                    return z;
                }
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public com.payair.hce.setDetailedMessage getWalletData() {
                com.payair.hce.setDetailedMessage setdetailedmessage = new com.payair.hce.setDetailedMessage() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.1
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static char[] AlternateContactlessPaymentDataJson;
                    private static int DigitizedCardProfile;
                    private static int values;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
                        int i2;
                        int i3;
                        int i4 = 1 - (s2 * 4);
                        int i5 = 4 - (s * 2);
                        int i6 = 111 - (i * 2);
                        byte[] bArr2 = $$a;
                        byte[] bArr3 = new byte[i4];
                        if (bArr2 == null) {
                            int i7 = i6;
                            i6 = i4;
                            i3 = 0;
                            i6 += i7;
                            i5++;
                            i2 = i3;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i6;
                            if (i3 == i4) {
                                objArr[0] = new java.lang.String(bArr3, 0);
                                return;
                            }
                            i7 = bArr2[i5];
                            i6 += i7;
                            i5++;
                            i2 = i3;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i6;
                            if (i3 == i4) {
                            }
                        } else {
                            i2 = 0;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i6;
                            if (i3 == i4) {
                            }
                        }
                    }

                    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
                        int i;
                        char[] cArr;
                        char c;
                        char[] cArr2;
                        java.lang.String str2 = str;
                        byte[] bArr2 = str2;
                        if (str2 != null) {
                            bArr2 = str2.getBytes("ISO-8859-1");
                        }
                        byte[] bArr3 = bArr2;
                        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
                        int i2 = 0;
                        int i3 = iArr[0];
                        byte b = 1;
                        int i4 = iArr[1];
                        int i5 = 2;
                        int i6 = iArr[2];
                        int i7 = iArr[3];
                        char[] cArr3 = AlternateContactlessPaymentDataJson;
                        if (cArr3 != null) {
                            int length = cArr3.length;
                            char[] cArr4 = new char[length];
                            $10 = ($11 + 33) % 128;
                            int i8 = 0;
                            while (i8 < length) {
                                $10 = ($11 + 85) % 128;
                                try {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    objArr2[i2] = java.lang.Integer.valueOf(cArr3[i8]);
                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                                    if (obj == null) {
                                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(i2, i2) + 29, 2807 - android.view.View.MeasureSpec.makeMeasureSpec(i2, i2), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                        byte b2 = (byte) ($$b - i5);
                                        byte b3 = (byte) (b2 + 1);
                                        cArr2 = cArr3;
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        b(b2, b3, (byte) (b3 - 1), objArr3);
                                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                                    } else {
                                        cArr2 = cArr3;
                                    }
                                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                                    i8++;
                                    cArr3 = cArr2;
                                    i2 = 0;
                                    i5 = 2;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr3 = cArr4;
                        }
                        char[] cArr5 = new char[i4];
                        java.lang.System.arraycopy(cArr3, i3, cArr5, 0, i4);
                        if (bArr3 != null) {
                            int i9 = $11 + 27;
                            $10 = i9 % 128;
                            if (i9 % 2 != 0) {
                                cArr = new char[i4];
                                getaccounttype.writeReplace = 1;
                                c = 1;
                            } else {
                                cArr = new char[i4];
                                getaccounttype.writeReplace = 0;
                                c = 0;
                            }
                            while (getaccounttype.writeReplace < i4) {
                                int i10 = $11 + 107;
                                $10 = i10 % 128;
                                if (i10 % 2 == 0 ? bArr3[getaccounttype.writeReplace] != b : bArr3[getaccounttype.writeReplace] != b) {
                                    int i11 = getaccounttype.writeReplace;
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                                    if (obj2 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 44, (-16774336) - android.graphics.Color.rgb(0, 0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte b4 = (byte) ($$b - 2);
                                        byte b5 = b4;
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        b(b4, b5, b5, objArr5);
                                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                                    }
                                    cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                                    $11 = ($10 + 79) % 128;
                                } else {
                                    int i12 = getaccounttype.writeReplace;
                                    char c2 = cArr5[getaccounttype.writeReplace];
                                    java.lang.Object[] objArr6 = new java.lang.Object[2];
                                    objArr6[b] = java.lang.Integer.valueOf(c);
                                    objArr6[0] = java.lang.Integer.valueOf(c2);
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                                    if (obj3 == null) {
                                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 44, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2835, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        int i13 = $$b;
                                        byte b6 = (byte) (i13 - 2);
                                        byte b7 = (byte) i13;
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        b(b6, b7, (byte) (b7 - 2), objArr7);
                                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                                    }
                                    cArr[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                                }
                                c = cArr[getaccounttype.writeReplace];
                                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 35, 212 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                                }
                                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                                b = 1;
                            }
                            cArr5 = cArr;
                        }
                        if (i7 > 0) {
                            int i14 = $10 + 37;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                char[] cArr6 = new char[i4];
                                i = 0;
                                java.lang.System.arraycopy(cArr5, 0, cArr6, 1, i4);
                                java.lang.System.arraycopy(cArr6, 1, cArr5, i4 - i7, i7);
                                java.lang.System.arraycopy(cArr6, i7, cArr5, 0, i4 + i7);
                            } else {
                                i = 0;
                                char[] cArr7 = new char[i4];
                                java.lang.System.arraycopy(cArr5, 0, cArr7, 0, i4);
                                int i15 = i4 - i7;
                                java.lang.System.arraycopy(cArr7, 0, cArr5, i15, i7);
                                java.lang.System.arraycopy(cArr7, i7, cArr5, 0, i15);
                            }
                        } else {
                            i = 0;
                        }
                        if (z) {
                            char[] cArr8 = new char[i4];
                            getaccounttype.writeReplace = i;
                            while (getaccounttype.writeReplace < i4) {
                                cArr8[getaccounttype.writeReplace] = cArr5[(i4 - getaccounttype.writeReplace) - 1];
                                getaccounttype.writeReplace++;
                            }
                            cArr5 = cArr8;
                        }
                        if (i6 > 0) {
                            getaccounttype.writeReplace = 0;
                            while (getaccounttype.writeReplace < i4) {
                                $10 = ($11 + 55) % 128;
                                cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[2]);
                                getaccounttype.writeReplace++;
                                $10 = ($11 + 125) % 128;
                            }
                        }
                        objArr[0] = new java.lang.String(cArr5);
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public com.payair.hce.setOrderRef getCardholderValidator() {
                        int i = DigitizedCardProfile + 105;
                        values = i % 128;
                        if (i % 2 == 0) {
                            java.lang.String str = digitizedCardJson.walletRelatedData.cardholderValidator;
                            throw null;
                        }
                        if (digitizedCardJson.walletRelatedData.cardholderValidator == null) {
                            return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        }
                        java.lang.String str2 = digitizedCardJson.walletRelatedData.cardholderValidator;
                        int hashCode = str2.hashCode();
                        if (hashCode == -1733098743) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            a(new int[]{10, 22, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr);
                            if (str2.equals(((java.lang.String) objArr[0]).intern())) {
                                DigitizedCardProfile = (values + 93) % 128;
                                return com.payair.hce.setOrderRef.writeReplace;
                            }
                        } else if (hashCode == -1634547624) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(new int[]{0, 10, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr2);
                            if (str2.equals(((java.lang.String) objArr2[0]).intern())) {
                                values = (DigitizedCardProfile + 17) % 128;
                                return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                            }
                        }
                        return com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public int getCvmResetTimeout() {
                        DigitizedCardProfile = (values + 87) % 128;
                        int i = digitizedCardJson.walletRelatedData.cvmResetTimeout;
                        int i2 = values + 63;
                        DigitizedCardProfile = i2 % 128;
                        if (i2 % 2 == 0) {
                            return i;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public int getDualTapResetTimeout() {
                        DigitizedCardProfile = (values + 69) % 128;
                        int i = digitizedCardJson.walletRelatedData.dualTapResetTimeout;
                        DigitizedCardProfile = (values + 125) % 128;
                        return i;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public com.payair.hce.getjSONObject getAccountType() {
                        if (digitizedCardJson.accountType == null) {
                            return com.payair.hce.getjSONObject.valueOf;
                        }
                        java.lang.String str = digitizedCardJson.accountType;
                        int hashCode = str.hashCode();
                        if (hashCode == 64920780) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            a(new int[]{38, 5, 29, 4}, null, true, objArr);
                            if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                return com.payair.hce.getjSONObject.AlternateContactlessPaymentDataJson;
                            }
                        } else if (hashCode == 433141802) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(new int[]{43, 7, 7, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, objArr2);
                            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                DigitizedCardProfile = (values + 109) % 128;
                                return com.payair.hce.getjSONObject.valueOf;
                            }
                        } else if (hashCode == 1996005113) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(new int[]{32, 6, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr3);
                            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                DigitizedCardProfile = (values + 117) % 128;
                                return com.payair.hce.getjSONObject.values;
                            }
                        }
                        com.payair.hce.getjSONObject getjsonobject = com.payair.hce.getjSONObject.valueOf;
                        values = (DigitizedCardProfile + 9) % 128;
                        return getjsonobject;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // com.payair.hce.setDetailedMessage
                    public com.payair.hce.setjSONObject getProductType() {
                        if (digitizedCardJson.productType == null) {
                            return com.payair.hce.setjSONObject.values;
                        }
                        java.lang.String str = digitizedCardJson.productType;
                        switch (str.hashCode()) {
                            case 64920780:
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                a(new int[]{38, 5, 29, 4}, null, true, objArr);
                                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                    DigitizedCardProfile = (values + 65) % 128;
                                    return com.payair.hce.setjSONObject.DigitizedCardProfile;
                                }
                                return com.payair.hce.setjSONObject.values;
                            case 399611855:
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a(new int[]{60, 7, 53, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false, objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    DigitizedCardProfile = (values + 77) % 128;
                                    return com.payair.hce.setjSONObject.AlternateContactlessPaymentDataJson;
                                }
                                return com.payair.hce.setjSONObject.values;
                            case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a(new int[]{43, 7, 7, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    int i = DigitizedCardProfile + 7;
                                    values = i % 128;
                                    if (i % 2 != 0) {
                                        com.payair.hce.setjSONObject setjsonobject = com.payair.hce.setjSONObject.values;
                                        int i2 = DigitizedCardProfile + 111;
                                        values = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            return setjsonobject;
                                        }
                                        throw null;
                                    }
                                    return com.payair.hce.setjSONObject.AlternateContactlessPaymentDataJson;
                                }
                                return com.payair.hce.setjSONObject.values;
                            case 1387439946:
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a(new int[]{50, 10, 0, 3}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001", false, objArr4);
                                if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                                    DigitizedCardProfile = (values + 39) % 128;
                                    return com.payair.hce.setjSONObject.valueOf;
                                }
                                return com.payair.hce.setjSONObject.values;
                            case 1996005113:
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a(new int[]{32, 6, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr5);
                                if (str.equals(((java.lang.String) objArr5[0]).intern())) {
                                    DigitizedCardProfile = (values + 91) % 128;
                                    return com.payair.hce.setjSONObject.writeReplace;
                                }
                                return com.payair.hce.setjSONObject.values;
                            default:
                                return com.payair.hce.setjSONObject.values;
                        }
                    }

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        DigitizedCardProfile = 0;
                        values = 1;
                        AlternateContactlessPaymentDataJson = new char[]{16872, 16768, 16774, 16779, 16772, 16774, 16796, 16793, 16770, 16773, 16872, 16771, 16775, 16780, 16776, 16770, 16796, 16786, 16788, 16771, 16773, 16771, 16777, 16777, 16777, 16778, 16799, 16799, 16781, 16781, 16770, 16799, 16876, 16778, 16776, 16768, 16773, 16772, 16808, 16785, 16812, 16815, 16831, 16864, 16790, 16797, 16797, 16795, 16788, 16791, 16874, 16779, 16776, 16777, 16775, 16768, 16771, 16775, 16773, 16772, 16780, 16712, 16718, 16817, 16819, 16820, 16821};
                    }

                    static void init$0() {
                        $$a = new byte[]{124, -43, -124, -86};
                        $$b = 2;
                    }
                };
                int i = RecordsJson + 17;
                SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                if (i % 2 != 0) {
                    return setdetailedmessage;
                }
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public com.payair.hce.JsonResponse getContactlessPaymentData() {
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 43) % 128;
                final com.mastercard.mpsdk.card.profile.sdk.CardContactlessPaymentDataJson cardContactlessPaymentDataJson = digitizedCardJson.contactlessPaymentData;
                if (cardContactlessPaymentDataJson == null) {
                    return null;
                }
                com.payair.hce.JsonResponse jsonResponse = new com.payair.hce.JsonResponse() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.2
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static int AlternateContactlessPaymentDataJson;
                    private static int DigitizedCardProfile;
                    private static char valueOf;
                    private static int values;
                    private static long writeReplace;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
                        int i3;
                        byte[] bArr2 = $$a;
                        int i4 = 106 - s;
                        int i5 = i * 3;
                        int i6 = 4 - (i2 * 2);
                        byte[] bArr3 = new byte[i5 + 1];
                        if (bArr2 == null) {
                            int i7 = i6;
                            int i8 = 0;
                            i4 += -i6;
                            i6 = i7 + 1;
                            i3 = i8;
                            bArr3[i3] = (byte) i4;
                            if (i3 == i5) {
                                objArr[0] = new java.lang.String(bArr3, 0);
                                return;
                            }
                            int i9 = i3 + 1;
                            i7 = i6;
                            i6 = bArr2[i6];
                            i8 = i9;
                            i4 += -i6;
                            i6 = i7 + 1;
                            i3 = i8;
                            bArr3[i3] = (byte) i4;
                            if (i3 == i5) {
                            }
                        } else {
                            i3 = 0;
                            bArr3[i3] = (byte) i4;
                            if (i3 == i5) {
                            }
                        }
                    }

                    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
                        char[] cArr;
                        char[] cArr2;
                        char c2;
                        if (str3 != null) {
                            $11 = ($10 + 81) % 128;
                            cArr = str3.toCharArray();
                        } else {
                            cArr = str3;
                        }
                        char[] cArr3 = cArr;
                        if (str2 != null) {
                            $10 = ($11 + 63) % 128;
                            cArr2 = str2.toCharArray();
                        } else {
                            cArr2 = str2;
                        }
                        char[] cArr4 = cArr2;
                        char[] charArray = str != null ? str.toCharArray() : str;
                        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
                        int length = cArr3.length;
                        char[] cArr5 = new char[length];
                        int length2 = charArray.length;
                        char[] cArr6 = new char[length2];
                        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
                        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
                        cArr5[0] = (char) (cArr5[0] ^ c);
                        cArr6[2] = (char) (cArr6[2] + ((char) i));
                        int length3 = cArr4.length;
                        char[] cArr7 = new char[length3];
                        getwalletdata.writeReplace = 0;
                        while (getwalletdata.writeReplace < length3) {
                            $11 = ($10 + 95) % 128;
                            try {
                                java.lang.Object[] objArr2 = {getwalletdata};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 71, 1179 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte length4 = (byte) $$a.length;
                                    byte b = (byte) (length4 - 4);
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    b(length4, b, b, objArr3);
                                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                                java.lang.Object[] objArr4 = {getwalletdata};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 3443 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 3831))).getMethod("g", java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                                if (obj3 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 26, android.graphics.ImageFormat.getBitsPerPixel(0) + 1865, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41774));
                                    byte b2 = $$a[2];
                                    byte b3 = (byte) (b2 - 1);
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    b(b2, b3, b3, objArr6);
                                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                                if (obj4 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3133, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                    byte b4 = (byte) ($$a[2] - 1);
                                    byte b5 = b4;
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    b(b4, b5, b5, objArr8);
                                    c2 = 2;
                                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                                } else {
                                    c2 = 2;
                                }
                                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                                cArr5[intValue2] = getwalletdata.values;
                                cArr7[getwalletdata.writeReplace] = (char) ((((cArr4[getwalletdata.writeReplace] ^ cArr5[intValue2]) ^ (writeReplace ^ 1263759066225628708L)) ^ ((int) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
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

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getAid() {
                        DigitizedCardProfile = (values + 75) % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.aid);
                        DigitizedCardProfile = (values + 71) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getPpseFci() {
                        int i = values + 7;
                        DigitizedCardProfile = i % 128;
                        java.lang.String str = cardContactlessPaymentDataJson.ppseFci;
                        if (i % 2 != 0) {
                            return com.payair.hce.stopService.writeReplace(str);
                        }
                        com.payair.hce.stopService.writeReplace(str);
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getPaymentFci() {
                        int i = values + 57;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 == 0) {
                            com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.paymentFci);
                            throw null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.paymentFci);
                        int i2 = DigitizedCardProfile + 67;
                        values = i2 % 128;
                        if (i2 % 2 == 0) {
                            return writeReplace2;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getGpoResponse() {
                        DigitizedCardProfile = (values + 105) % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.gpoResponse);
                        int i = DigitizedCardProfile + 93;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return writeReplace2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public int getCdol1RelatedDataLength() {
                        values = (DigitizedCardProfile + 47) % 128;
                        int i = cardContactlessPaymentDataJson.cdol1RelatedDataLength;
                        values = (DigitizedCardProfile + 103) % 128;
                        return i;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getIssuerApplicationData() {
                        int i = DigitizedCardProfile + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        values = i % 128;
                        if (i % 2 != 0) {
                            com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.issuerApplicationData);
                            throw null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.issuerApplicationData);
                        values = (DigitizedCardProfile + 105) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public com.payair.hce.gotDeleteData getCvmModel() {
                        DigitizedCardProfile = (values + 45) % 128;
                        if (cardContactlessPaymentDataJson.cvmModel == null) {
                            values = (DigitizedCardProfile + 31) % 128;
                            return com.payair.hce.gotDeleteData.valueOf;
                        }
                        java.lang.String str = cardContactlessPaymentDataJson.cvmModel;
                        int hashCode = str.hashCode();
                        if (hashCode == -1724098714) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            a("\u0000\u0000\u0000\u0000", "澌鸵痆\ue803Ⓟ뼧埐겥陋", "객図ⲱ哑", (-1319701587) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0), objArr);
                            if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                values = (DigitizedCardProfile + 69) % 128;
                                return com.payair.hce.gotDeleteData.DigitizedCardProfile;
                            }
                        } else if (hashCode == -1579111723) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a("\u0000\u0000\u0000\u0000", "伧\ue640ᗚ㝆\ud831硢켯㗃\udb7a駀昱윟", "솵䪲\uf5f5❻", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
                            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                return com.payair.hce.gotDeleteData.valueOf;
                            }
                        } else if (hashCode == 1953740997) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a("\u0000\u0000\u0000\u0000", "浸ॺ\ue11f䅉錓\udd2d扼栛᧠쯦玻뫑ᖭ⍱", "\uf22c\ue627禔鮽", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48505), objArr3);
                            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                return com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                            }
                        }
                        return com.payair.hce.gotDeleteData.values;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
                    
                        if (r0.equals(((java.lang.String) r2[0]).intern()) != false) goto L26;
                     */
                    @Override // com.payair.hce.JsonResponse
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                        if (cardContactlessPaymentDataJson.umdGeneration == null) {
                            return com.payair.hce.setSendAuthenticationHeader.writeReplace;
                        }
                        java.lang.String str = cardContactlessPaymentDataJson.umdGeneration;
                        int hashCode = str.hashCode();
                        if (hashCode == 366664857) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            a("\u0000\u0000\u0000\u0000", "໊䞜ꈦ\uaacf\u0bbb張ᶯ䝴\uf446蠍㈔夦㡾㘡繵笐뙕욪뚓踵ၜ뫘\ue0ac\uf6fd恊࿇빬", "選삨↮襃", (-1379882864) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17184), objArr);
                        } else {
                            if (hashCode == 1118204426) {
                                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "詭㝝\uf22d叿潜\uec0b橫뭇뿊\uea1b㵉⠮膳쩘걳㥘獹䂨哣褕\u0b52ꌲഝｈ\uebf0㖳", "쫑\ue101\ue1c2\uea71", (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) - 1, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29153), objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    int i = values + 5;
                                    DigitizedCardProfile = i % 128;
                                    if (i % 2 != 0) {
                                        return com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                                    }
                                }
                            } else if (hashCode == 1555809199) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "硩\ue399璓멟釰愂\uf421辱٩醟潑唨䱱\u0c4f히䋅凲ⳣὨ\ud829ಚꢞ㏗톞㺽", "拐㥗鬨糁", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 674846562, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    int i2 = values + 85;
                                    DigitizedCardProfile = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        return com.payair.hce.setSendAuthenticationHeader.writeReplace;
                                    }
                                    return com.payair.hce.setSendAuthenticationHeader.values;
                                }
                            }
                            return com.payair.hce.setSendAuthenticationHeader.values;
                        }
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getPinIvCvc3Track2() {
                        values = (DigitizedCardProfile + 43) % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.pinIvCvc3Track2);
                        int i = DigitizedCardProfile + 57;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return writeReplace2;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public boolean isTransitSupported() {
                        DigitizedCardProfile = (values + 111) % 128;
                        boolean z = cardContactlessPaymentDataJson.isTransitSupported;
                        int i = DigitizedCardProfile + 87;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return z;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public boolean isUsAipMaskingSupported() {
                        DigitizedCardProfile = (values + 5) % 128;
                        boolean z = cardContactlessPaymentDataJson.isUsAipMaskingSupported;
                        int i = DigitizedCardProfile + 111;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return z;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents() {
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk(com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.iccPrivateKeyCrtComponents));
                        values = (DigitizedCardProfile + 41) % 128;
                        return initializevisapaymentsdk;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public com.payair.hce.JsonRequest getAlternateContactlessPaymentData() {
                        int i = values + 35;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 != 0) {
                            final com.mastercard.mpsdk.card.profile.sdk.CardAlternateContactlessPaymentDataJson cardAlternateContactlessPaymentDataJson = cardContactlessPaymentDataJson.alternateContactlessPaymentData;
                            if (cardAlternateContactlessPaymentDataJson == null) {
                                int i2 = values + 35;
                                DigitizedCardProfile = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                            return new com.payair.hce.JsonRequest() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.2.1
                                private static int AlternateContactlessPaymentDataJson = 1;
                                private static int writeReplace;

                                @Override // com.payair.hce.JsonRequest
                                public byte[] getAid() {
                                    int i3 = writeReplace;
                                    int i4 = ((i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                    AlternateContactlessPaymentDataJson = i4 % 128;
                                    int i5 = i4 % 2;
                                    java.lang.String str = cardAlternateContactlessPaymentDataJson.aid;
                                    if (i5 != 0) {
                                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(str);
                                        int i6 = writeReplace & 119;
                                        AlternateContactlessPaymentDataJson = ((i6 - (~((r1 ^ 119) | i6))) - 1) % 128;
                                        return writeReplace2;
                                    }
                                    com.payair.hce.stopService.writeReplace(str);
                                    throw null;
                                }

                                @Override // com.payair.hce.JsonRequest
                                public byte[] getPaymentFci() {
                                    int i3 = writeReplace;
                                    int i4 = i3 ^ 33;
                                    int i5 = ((i3 & 33) | i4) << 1;
                                    int i6 = -i4;
                                    AlternateContactlessPaymentDataJson = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardAlternateContactlessPaymentDataJson.paymentFci);
                                    int i7 = writeReplace;
                                    int i8 = i7 & 51;
                                    int i9 = -(-((i7 ^ 51) | i8));
                                    int i10 = (i8 & i9) + (i9 | i8);
                                    AlternateContactlessPaymentDataJson = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw null;
                                }

                                @Override // com.payair.hce.JsonRequest
                                public byte[] getgpoResponse() {
                                    int i3 = writeReplace;
                                    int i4 = i3 & 25;
                                    int i5 = (i3 ^ 25) | i4;
                                    int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                                    AlternateContactlessPaymentDataJson = i6 % 128;
                                    java.lang.String str = cardAlternateContactlessPaymentDataJson.gpoResponse;
                                    if (i6 % 2 == 0) {
                                        com.payair.hce.stopService.writeReplace(str);
                                        throw null;
                                    }
                                    return com.payair.hce.stopService.writeReplace(str);
                                }

                                @Override // com.payair.hce.JsonRequest
                                public byte[] getCvrMaskAnd() {
                                    int i3 = writeReplace;
                                    int i4 = (((i3 & (-118)) | ((~i3) & 117)) - (~((i3 & 117) << 1))) - 1;
                                    AlternateContactlessPaymentDataJson = i4 % 128;
                                    java.lang.String str = cardAlternateContactlessPaymentDataJson.cvrMaskAnd;
                                    if (i4 % 2 != 0) {
                                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(str);
                                        int i5 = writeReplace;
                                        int i6 = i5 & 49;
                                        int i7 = (i5 | 49) & (~i6);
                                        int i8 = -(-(i6 << 1));
                                        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                                        AlternateContactlessPaymentDataJson = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            return writeReplace2;
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }
                                    com.payair.hce.stopService.writeReplace(str);
                                    throw new java.lang.ArithmeticException();
                                }

                                @Override // com.payair.hce.JsonRequest
                                public byte[] getCiacDecline() {
                                    int i3 = writeReplace;
                                    int i4 = i3 & 45;
                                    int i5 = i4 + ((i3 ^ 45) | i4);
                                    AlternateContactlessPaymentDataJson = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        java.lang.String str = cardAlternateContactlessPaymentDataJson.ciacDecline;
                                        throw new java.lang.ArithmeticException();
                                    }
                                    if (cardAlternateContactlessPaymentDataJson.ciacDecline == null) {
                                        int i6 = AlternateContactlessPaymentDataJson;
                                        int i7 = i6 ^ 29;
                                        writeReplace = ((((i6 & 29) | i7) << 1) - i7) % 128;
                                        return null;
                                    }
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardAlternateContactlessPaymentDataJson.ciacDecline);
                                    int i8 = writeReplace;
                                    int i9 = i8 & 125;
                                    int i10 = (((i8 | 125) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
                                    AlternateContactlessPaymentDataJson = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw null;
                                }
                            };
                        }
                        com.mastercard.mpsdk.card.profile.sdk.CardAlternateContactlessPaymentDataJson cardAlternateContactlessPaymentDataJson2 = cardContactlessPaymentDataJson.alternateContactlessPaymentData;
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public java.util.List<com.payair.hce.setNetworkError> getRecords() {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson[] cardRecordsJsonArr = cardContactlessPaymentDataJson.records;
                        DigitizedCardProfile = (values + 71) % 128;
                        for (final com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson cardRecordsJson : cardRecordsJsonArr) {
                            arrayList.add(new com.payair.hce.setNetworkError() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.2.2
                                private static int AlternateContactlessPaymentDataJson = 1;
                                private static int valueOf;

                                @Override // com.payair.hce.setNetworkError
                                public byte getRecordNumber() {
                                    int i = valueOf;
                                    int i2 = i ^ 1;
                                    int i3 = ((i & 1) | i2) << 1;
                                    int i4 = -i2;
                                    AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                                    byte b = (byte) cardRecordsJson.recordNumber;
                                    int i5 = valueOf + 74;
                                    int i6 = (~i5) + (i5 << 1);
                                    AlternateContactlessPaymentDataJson = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        return b;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                @Override // com.payair.hce.setNetworkError
                                public byte[] getSfi() {
                                    int i = valueOf;
                                    int i2 = i ^ 61;
                                    int i3 = (i & 61) << 1;
                                    AlternateContactlessPaymentDataJson = ((i2 & i3) + (i3 | i2)) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardRecordsJson.sfi);
                                    int i4 = valueOf;
                                    int i5 = (((i4 & (-10)) | ((~i4) & 9)) - (~(-(-((i4 & 9) << 1))))) - 1;
                                    AlternateContactlessPaymentDataJson = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw null;
                                }

                                @Override // com.payair.hce.setNetworkError
                                public byte[] getRecordValue() {
                                    int i = valueOf;
                                    int i2 = i | 45;
                                    int i3 = i2 << 1;
                                    int i4 = -((~(i & 45)) & i2);
                                    int i5 = (i3 & i4) + (i4 | i3);
                                    AlternateContactlessPaymentDataJson = i5 % 128;
                                    java.lang.String str = cardRecordsJson.recordValue;
                                    if (i5 % 2 != 0) {
                                        return com.payair.hce.stopService.writeReplace(str);
                                    }
                                    com.payair.hce.stopService.writeReplace(str);
                                    throw null;
                                }
                            });
                        }
                        int i = DigitizedCardProfile + 73;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return arrayList;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public com.payair.hce.setErrorName getTrack1ConstructionData() {
                        int i = DigitizedCardProfile + 107;
                        values = i % 128;
                        if (i % 2 == 0) {
                            final com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson cardTrackConstructionDataJson = cardContactlessPaymentDataJson.track1ConstructionData;
                            if (cardTrackConstructionDataJson == null) {
                                values = (DigitizedCardProfile + 77) % 128;
                                return null;
                            }
                            return new com.payair.hce.setErrorName() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.2.3
                                private static final byte[] $$a = null;
                                private static final int $$b = 0;
                                private static final byte[] $$d = null;
                                private static final int $$e = 0;
                                private static int $10;
                                private static int $11;
                                private static int AlternateContactlessPaymentDataJson;
                                private static char[] DigitizedCardProfile;
                                private static long values;
                                private static int writeReplace;

                                private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
                                    int i2 = 718 - s2;
                                    int i3 = s * 2;
                                    int i4 = 39 - (b * 2);
                                    byte[] bArr2 = $$a;
                                    char[] cArr = new char[i3 + 1];
                                    int i5 = -1;
                                    if (bArr2 == null) {
                                        i5 = -1;
                                        i2 = (i3 + i4) - 2;
                                        i4 = i4;
                                    }
                                    while (true) {
                                        int i6 = i5 + 1;
                                        cArr[i6] = (char) i2;
                                        int i7 = i4 + 1;
                                        if (i6 == i3) {
                                            objArr[0] = new java.lang.String(cArr);
                                            return;
                                        }
                                        i5 = i6;
                                        i2 = (i2 + bArr2[i7]) - 2;
                                        i4 = i7;
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                private static void c(short s, short s2, int i2, java.lang.Object[] objArr) {
                                    int i3;
                                    int i4 = s2 * 2;
                                    int i5 = 99 - (i2 * 3);
                                    byte[] bArr2 = $$d;
                                    int i6 = (s * 3) + 4;
                                    byte[] bArr3 = new byte[i4 + 1];
                                    if (bArr2 == null) {
                                        int i7 = i6;
                                        int i8 = i4;
                                        i3 = 0;
                                        int i9 = i7 + 1;
                                        i5 = i6 + (-i8);
                                        i6 = i9;
                                        bArr3[i3] = (byte) i5;
                                        if (i3 == i4) {
                                            objArr[0] = new java.lang.String(bArr3, 0);
                                            return;
                                        }
                                        i8 = bArr2[i6];
                                        i3++;
                                        int i10 = i5;
                                        i7 = i6;
                                        i6 = i10;
                                        int i92 = i7 + 1;
                                        i5 = i6 + (-i8);
                                        i6 = i92;
                                        bArr3[i3] = (byte) i5;
                                        if (i3 == i4) {
                                        }
                                    } else {
                                        i3 = 0;
                                        bArr3[i3] = (byte) i5;
                                        if (i3 == i4) {
                                        }
                                    }
                                }

                                private static void a(int i2, char c, int i3, java.lang.Object[] objArr) {
                                    com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                                    long[] jArr = new long[i3];
                                    getcvmmodel.valueOf = 0;
                                    $10 = ($11 + 91) % 128;
                                    while (getcvmmodel.valueOf < i3) {
                                        int i4 = getcvmmodel.valueOf;
                                        try {
                                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i2 + getcvmmodel.valueOf])};
                                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                                            if (obj == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 48, android.text.TextUtils.indexOf("", "", 0) + 381, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 62388));
                                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                c((short) 0, (short) 0, 0, objArr3);
                                                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                                            }
                                            java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                                            if (obj2 == null) {
                                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3967, (char) (40223 - android.graphics.Color.red(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                                            }
                                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                                            java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                            if (obj3 == null) {
                                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, 212 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                                    char[] cArr = new char[i3];
                                    getcvmmodel.valueOf = 0;
                                    while (getcvmmodel.valueOf < i3) {
                                        $11 = ($10 + 51) % 128;
                                        cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                                        java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 14, 212 - android.graphics.Color.alpha(0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                                    }
                                    objArr[0] = new java.lang.String(cArr);
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getPCvc3() {
                                    AlternateContactlessPaymentDataJson = (writeReplace + 1) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.pCvc3);
                                    writeReplace = (AlternateContactlessPaymentDataJson + 3) % 128;
                                    return writeReplace2;
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getPUnAtc() {
                                    int i2 = writeReplace + 23;
                                    AlternateContactlessPaymentDataJson = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.pUnAtc);
                                        throw null;
                                    }
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.pUnAtc);
                                    int i3 = writeReplace + 27;
                                    AlternateContactlessPaymentDataJson = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getNAtc() {
                                    writeReplace = (AlternateContactlessPaymentDataJson + 85) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.nAtc);
                                    AlternateContactlessPaymentDataJson = (writeReplace + 45) % 128;
                                    return writeReplace2;
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getTrackData() {
                                    int i2 = writeReplace + 7;
                                    AlternateContactlessPaymentDataJson = i2 % 128;
                                    java.lang.String str = cardTrackConstructionDataJson.trackData;
                                    if (i2 % 2 != 0) {
                                        return com.payair.hce.stopService.writeReplace(str);
                                    }
                                    com.payair.hce.stopService.writeReplace(str);
                                    throw null;
                                }

                                static {
                                    init$1();
                                    $10 = 0;
                                    $11 = 1;
                                    init$0();
                                    writeReplace = 0;
                                    AlternateContactlessPaymentDataJson = 1;
                                    char[] cArr = new char[1707];
                                    java.nio.ByteBuffer.wrap("ñ\u0083^\u0092¯}ÿÔLë\u009d\tíß:¶\u008b\u0018Ûà(Ay\u0001Éü\u0016ag!·\u008e\u0004hU$¥\u009dòqB×\u0093\u0091àc0Ê\u0081½î\u0005>í4\u001c\u009b\rjâ:K\u0089tX\u0096(@ÿ)N\u0087\u001e\u007fíÞ¼\u009e\fcÓþ¢¯r\u001cÁã\u0090¬`87ù\u0087KV#%ìõQD'ý\u008cR\u009d£róÛ@ä\u0091\u0006áÐ6¹\u0087\u0017×ï$Nu\u000eÅó\u001ank<»\u009c\bmY:^\u0080ñ\u0086\u0000bPÒãè2\u0000BÜ\u0095½$\nté\u0087NÖ^fð¹RÈ/\u0018\u008d«iú<\n\u0088]iíø<¯Or\u009fÍ.«A\u0000\u0091ù ¨^\u0080ñ\u0090\u0000oPÂãè2\tBÔ\u0095÷$\u000ft÷\u0087DÖ\u0001^\u0080ñ\u0090\u0000oPÂãè2\u001eBÚ\u0095´$Qtõ\u0087YÖ\u001efç^\u0080ñ\u0086\u0000\u007fPÂã¦2\u001fB×\u0095ö$-tÃ\u0087fÖ\u001efá¹XÈ\u0007\u0018\u0088«{ú4\u0084\u0088+\u008eÚj\u008aÚ9»è\u0000\u0098ÖOþþ\u001b®ä]A\fV¼óc\\\u0012)Â\u008fqe sÐ\u0080\u0087f^Íñ\u009c\u0000|PÏã¨2\u00157\u009c\u0098\u009ai~9Î\u008a¯[\u0014+ÂüêM\u0001\u001dðîY¿B\u000fåÐD¡2q\u0080ÂE\u0093\u0004cÊ4s\u0084ÞU¼&zö\u0088G (\u0016øùI¹\u001a\u0019êî»S^\u0080ñ\u0086\u0000bPÒã³2\bBÞ\u0095ö$\u001dtì\u0087EÖ^fù¹XÈ.\u0018\u009c«Yú\u0018\nÖ]qíÕ<¢Oc\u0007\u0086¨\u0080Yd\tÔºµk\u000e\u001bØÌð}\u0015-êÞO\u008fX?ýàR\u0091'A\u0081òl£>S\u0088\u0004Q´ìe»\u0016gÆÐw©\u0018MÈþy¸^\u0080ñ\u0091\u0000~P×ãè2\u0003BÖ\u0095´$\ntâ\u0087^Ö\u0014fä¹IÊèe¯\u0094\u0000Äöw\u0087¦1Öê\u0001\u0088°dàØ\u0013qB7òÖ^Áñ\u0090\u0000zPÒã¢2CBÝ\u0095¼$\u000b^\u0080ñ\u0085\u0000iPÎã¤2BBÕ\u0095°$\u0013tà\u0087XÖ\bfä¹IÈ&\u0018\u0084«|^Áñ\u0090\u0000vPÔã´2\u000bº;\u0015|^Ýñ\u009a\u00005PÑãµ2\u0002B×\u0095¬$\u001ctñ\u0087\u0005Ö\u001cfö¹SÈ6\u0018\u008f«nú6\n\u008f]tíÕ<¨Oa^Èñ\u0090\u0000uPØ^Ùñ\u0097\u0000tPÙã´2\u000b`;Ï>>ÒnuÝ\u001f\fù|e«\r\u001a JK¹üè¯X_^Ùñ\u0097\u0000tPÙã 2\u0018BÖ\u0095ª$\u000bE\u0001êy\u001b\u009cK1øC)ëY.\u008eY?ùo\u0002^Úñ\u009b\u0000pPÏã¨2\u001aBÝ§\u0080\bÑù%©\u0082\u001aæËH»\u008alø^Ýñ\u009a\u00005PÑãµ2\u0002B×\u0095¬$\u001ctñ\u0087\u0005Ö\u0015fò¹KÈ*\u0018\u008a«j^Ùñ\u0097\u0000tPÙãÿ2[BÃ^Èñ\u0090\u0000uPÄãµ2\u0004BÐUpú(\u000bÍ[|è\r9¼Ih\u009e>/¿\u007f\u0005\u008c¥^Èñ\u0090\u0000uPÄãµ2\u0004BÐ\u0095\u0086$\u0007t½\u0087\u001dÖ.f¡¹\t¹Ü\u0016\u009bç4·Ð\u0004´Õ\u0003¥Ör\u00adÃ\u001d\u0093ð`\u00041\u001d\u0081ù^X/'ÿ\u0084%Ï\u008a\u0082{c\u0097»8éÉ\u001f\u0099¼*×ûh\u008b\u00ad\\Ú^îñ\u0085\u0000kP\u0081ã\u00952\u0018BÝ\u0095\u00ad$\u0016tè\u0087NÖQfñ¹RÈ1\u0018É«Lú=\n\u0089]níÊ<¨gùÈ\u008c9hiÄÚ¿\u000b\u0013{À¬î\u001d;MÖ¾wïF_â\u0080_ñ=!\u0092\u0092lÃb3\u008adyÔÂ\u0005úv|¦\u0096\u0017þ^îñ\u009b\u0000\u007fPÓã¨2\u0004B×\u0095ù$,tÁ\u0087`ÖQfõ¹HÈ*\u0018\u0085«{úu\n\u009d]níÕ<íOk\u009f\u0081.éA:\u0091½ å^Ýñ\u009a\u00005PÉã¦2\u001fB×\u0095®$\u001et÷\u0087N^Èñ\u009a\u0000wPÅã¡2\u0004BÀ\u0095±\u0082\u009a-ÔÜ7\u008c\u009a?¼î\u0018ôH[\u0001ªàúWI:\u0098\u008dÙívª\u0087\u0005×ád\u0085µ2Åç\u0012\u009c£,óÁ\u00005Q#áÕ>lO\u001d\u009f½^Ýñ\u009a\u00005PÊã¢2\u001fBÝ\u0095¼$\u0013t«\u0087ZÖ\u0014fú¹Hx\u0083,\u009e\u0083Ùrv\"\u0091\u0091á@M0\u0085çèVYäñN\u0014áS\u0010ü@\nó{\"ÍR\u0016\u0085t4\u0098d<\u0097\u0090Æ×v:©\u0081Øé\bT\u009fº0óÁ\u0004\u0091¾\"ëóf\u0083øT\u009c^Ýñ\u009a\u00005PÃã²2\u0004Bß\u0095½$Qtã\u0087BÖ\u001ffð¹XÈ1\u0018\u0099«}ú<\n\u0095]u\u0090 ?xÎ\u009d\u009e,-]üì\u008c8[\u001eêäº\tI¨\u0018¶¨\u0018w°\u0006ÅÖde\u00954ÔÄp\u001f¨°ðA\u0015\u0011¤¢Õsd\u0003°Ôæeg5ÝÆ}\u0097>'\u0084ø9\u0089HYÖê\u0017»\rK\u00ad\u001cN¬ }È\u000e\u001dÞ¼oÍ\u0000lÐ\u0088aî2oÂÅ\u0093u\u008d[\"\u0003Óæ\u0083W0&á\u0097\u0091CFe÷\u008b§yT×\u0005\u0085µhjË\u001b\u008fË\txø)\u00adÙG\u008eõ>Qï0\u009cåLXý%\u0092\u0095Ü\u0005s]\u0082¸Ò\tax°ÉÀ\u001d\u0017;¦Äö*\u0005\u0089TÄäb;ÆJþ\u009a\u000b)´xú\u0088Yß´oR¾6Í®^Èñ\u009a\u0000tPÆã«2\bB\u009c\u0095ª$\u001btî\u0087tÖ\u0016fç¹UÈ,\u0018\u0087«jú\n\n\u0083]9í\u0091<âOt\u009fÜ.±A\u0000\u0091ù ¸s\u0014\u0083ÂÒ[eqµÙ^Ýñ\u009a\u00005PÃã¨2\u0002BÇ\u0095µ$\u0010tä\u0087OÖ\u0014fåN³áô\u0010[@\u00adóÆ\"lR©\u0085Þ4|d\u008a\u0097\"Æzv×©1ØX\bî»\rê_\u001a»M\tý ,Í_\u001a\u008f²>ÃQ{\u0081\u00970Öcw\u0093\u0087K\u0006äs\u0015\u0097E;ö@'ìW?\u0080\u001c1ïaU\u0092õÐû\u007f¼\u008e\u0013Þåm\u0094¼\"Ìù\u001b\u009bªwúÇ\tdX$èÁ7wF\u0004\u0096¶%\u0007t\u001a\u0084¹\u0015\u0098ºÓK+\u001b\u0096¨©^Æñ\u009b\u0000rPÕãé2\u001eBÅ\u0095º$Qtô\u0087NÖ\u001cfâ¹\u0010È3\u0018\u009b«`ú%\n\u0088Ê½eó\u0094\u0015Ä·w\u008a¦fÖ§\u0001\u0094°qà\u0087\u0013!B|ò\u009f-;\\Y\u008cù\u0014Ó»\u009dJ{\u001aÙ©äx\u0013\bØßún\u0014>éÍM\u009c\u0019,ÅóS\u0082/R\u0089ág°*@\u0097^Þñ\u0090\u0000vPÔãé2\u001eBÕ\u0095÷$\u0013tæ\u0087OÖ.fó¹XÈ-\u0018\u009a«fú!\n\u0082^Ýñ\u009a\u00005PÊã¢2\u001fBÝ\u0095¼$\u0013t«\u0087JÖ\u001ffó¹OÈ,\u0018\u0080«kú{\n\u008a]díÊ<¸Ow0c\u009f$n\u008b>}\u008d\u0016\\¼,yûIJ°\u001a^éø¸º\b\u0007×â¦\u008bv3Åî\u0094\u0085d$3Ò\u0083|^Ýñ\u009a\u00005PÎã£2\u0000B\u009d\u0095»$\ntì\u0087GÖ\u0015f¹¹[È*\u0018\u0087«hú0\n\u0089]qíÕ<¤O}\u009fÍ^$ñc\u0000ÌP(ãL2ûB.\u0095U$åt\b\u0087üÖêf\u001b¹\u00adÈÖ\u0018t«ØúÊ\nk]\u0096í9<QO\u0098\u009f0.TAõ\u0091\u001c \\\u0082\u0015-RÜý\u008c\u001a?vîÖ\u009e\u000fItøÚ¨c[\u0081\nÌº6e\u0099\u0014ïÄ\u000fw¡&ôÖ]\u0081®1\nàw\u0093«C\u0003ò~\u009dÃM7_rð5\u0001\u009aQ}â\u00113±Ch\u0094\u0013%½uu\u0086á×¦gL¸¼É\u008e\u00193ªÉû\u0096\u000b0\\\u0080ìn=\u000bNÒ\u009eq/\u0015@¸\u0090T!\fr±\u0082\\Óø^Ýñ\u009a\u00005P×ã¢2\u0003B×\u0095¶$\rt«\u0087IÖ\u0004fþ¹QÈ'\u0018Ç«iú<\n\u0095]fíÂ<¿Oc\u009fË.¶A\u000b\u0091ÿ^Ýñ\u009a\u00005P×ã¢2\u0003B×\u0095¶$\rtÚ\u0087OÖ\u001dfü¹PÈm\u0018\u008b«zú<\n\u0097]eí\u0089<«Oz\u009f×.¸A\u0000\u0091ù ¡s\u0005\u0083ôÒMe=bñF\u0089é\u0098\u0018wHÞûá*\u0015Zß\u008d½<\u0003lÓ\u009fRÎ\u0011~î¡Q^\u0080ñ\u0091\u0000~P×ãè2\u001eBÜ\u0095º$\u0014tà\u0087_Ö^fõ¹\\È0\u0018\u008c«mú4\n\u0095]eíø<ªOv\u009f×.¦A\u0001^\u0080ñ\u0091\u0000~P×ãè2\u001eBÜ\u0095º$\u0014tà\u0087_Ö^fð¹XÈ-\u0018\u0090«k^\u0080ñ\u0091\u0000~P×ãè2\u001eBÜ\u0095º$\u0014tà\u0087_Ö^fæ¹XÈ.\u0018\u009c«k\u0016þ¹øH\u001c\u0018¬«\u0096zb\n¨ÝÊlt<¤Ï!\u009e}.\u0088ñ \u0080X^\u0080ñ\u0086\u0000bPÒã³2\bBÞ\u0095ö$\u0013tì\u0087IÖ^fû¹TÈ!\u0018\u008a«Pú8\n\u009a]míË<¢Op\u009fæ.»A\u0000\u0091é ¤s\u0010\u0083ÂÒRe,µ\u0082Ä@\u0017u§\u0092öh^\u0080ñ\u0091\u0000~P×ãè2\u000fBÀ\u0095\u00ad$ tâ\u0087[Ö\u0002GIèX\u0019·I\u001eú!+Æ[\t\u008cd=ém8\u009e\u008bÏÕ\u007f;áÁNÐ¿?ï\u0096\\©\u008d_ý\u009d*û\u009bUË¡8\u001ei\u001fÙ´\u0006\u000fwv§Î\u0014!ExµÞâ%R\u0094\u0083è^\u0080ñ\u0086\u0000bPÒã³2\bBÞ\u0095ö$\u0013tì\u0087IÖ^fû¹TÈ!\u0018\u008b«|ú!\n\u009d]níË<©Ov\u009fË.\u0080A\u000f\u0091å ¸sY\u0083îÒLr\u0092Ý\u0083,l|ÅÏú\u001e\u001dnÒ¹¿\b\fXô«Zú\u0006üeSt¢\u009bò2A\r\u0090êà%7H\u0086ýÖ\u0019%¼tû²j\u001d{ì\u0094¼=\u000f\u0002Þå®*yGÈø\u0098\nk¦:õÝ#r2\u0083ÝÓt`K±¬Ác\u0016\u000e§³÷T\u0004áU·b\u001aÍ\u000b<älMßr\u000e\u0095~Z©7\u0018\u0093Hr»Âê\u008c^\u0080ñ\u0091\u0000~P×ãè2\u000fBÀ\u0095\u00ad$\u000ftâ\u0087JÖ\u0018fç¹^/¡\u0080°q_!ö\u0092ÉC.3áä\u008cU\u0001\u0005Íög§5^\u0080ñ\u0091\u0000zPÕã¦2BB×\u0095¶$\btë\u0087GÖ\u001efö¹YÈ0\u0018Æ«!ú-\n\u0099].íÅ<¾Og\u009fÒ^\u0080ñ\u0098\u0000uPÕãè2\u001aBÚ\u0095·$\u001btê\u0087\\Ö\u0002f¸¹\u007fÈ0\u0018\u009d«\\ú=\n\u009a]síÂ<©OU\u009fÖ.³A\u0001\u0091î £^\u0080ñ\u0085\u0000iPÎã¤2BBÚ\u0095¶$\u000ftê\u0087YÖ\u0005fä^\u009fñ\u0093\u0000}P\u0081ãý^\u0080ñ\u0085\u0000iPÎã¤2BBÀ\u0095¼$\u0013tã\u0087\u0004Ö\u001cfö¹MÈ0\u001eä±«@V\u0010á£\u0087r.\u0002üÕÛd44ÆÇk\u00969&Ýùx\u0088\u001cX\u00adë\rº\nJ¸^Ãñ\u009c\u0000yPæã\u008b2(Bà\u0095\u0086$\u001dtö\u0087_Ö_fä¹R^\u0080ñ\u0090\u0000oPÂãè2\u0000BÖ\u0095½$\u0016tä\u0087tÖ\u0012fø¹YÈ&\u0018\u008a«|ú{\n\u0083]líËo\u0005ÀQ1¦a\fÒ|\u0003Ñs\u001a¤r\u0015ÜE>;Ü\u0094Ìe35\u009e\u0086´W\\'\u0080ððAM\u0011\u00adâ\u0004^\u0080ñ\u0091\u0000zPÕã¦2BB×\u0095¶$\btë\u0087GÖ\u001efö¹YÈ0\u0018Æ«!ú1\n\u008b].íÆ<½Oc\u009fÊ.ñA\u001d\u0091æ ½\u0007#¨&YÊ\tmº\u0007ká\u001bsÌ\n}©-OÞæ\u008f´?[^èñ\u009a\u0000wPÅã¡2\u0004BÀ\u0095±^\u0080ñ\u0091\u0000zPÕã¦2BBÞ\u0095°$\ftæ\u0087\u0004Ö\u0001få¹RÈ%\u0018\u0080«cú0\n\u0088].íÄ<¸Oa\u009f\u0096.ïAJ\u0091è ¾s\u001a\u0083³ÒNe µ\u008cÄG\u00174§\u0097ön\u0006ßY\u0087è78ÒK \u009a\u0006*Ä}¾\u008c\u0010Üæ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
                                    DigitizedCardProfile = cArr;
                                    values = 7152492053673734645L;
                                }

                                static void init$1() {
                                    $$d = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
                                    $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:112:0x0c23  */
                                /* JADX WARN: Removed duplicated region for block: B:119:0x0cdf  */
                                /* JADX WARN: Removed duplicated region for block: B:131:0x0d8c  */
                                /* JADX WARN: Removed duplicated region for block: B:138:0x0e47  */
                                /* JADX WARN: Removed duplicated region for block: B:216:0x241a A[Catch: all -> 0x01c0, TryCatch #1 {all -> 0x01c0, blocks: (B:6:0x00d2, B:8:0x00e5, B:9:0x0130, B:18:0x01e5, B:20:0x0222, B:21:0x0273, B:29:0x0305, B:31:0x0318, B:32:0x0367, B:40:0x042b, B:42:0x0463, B:43:0x04b7, B:46:0x04cd, B:48:0x04dc, B:49:0x0525, B:55:0x05ca, B:57:0x0614, B:58:0x0667, B:62:0x06d1, B:64:0x06e4, B:65:0x073b, B:71:0x0808, B:73:0x0854, B:74:0x08a4, B:81:0x0960, B:83:0x0973, B:84:0x09bf, B:94:0x0aa7, B:96:0x0af0, B:97:0x0b44, B:101:0x0b7e, B:103:0x0b91, B:104:0x0bd6, B:113:0x0c3b, B:115:0x0c74, B:116:0x0cc9, B:132:0x0da4, B:134:0x0ddd, B:135:0x0e31, B:139:0x0e69, B:141:0x0e7c, B:142:0x0ec1, B:148:0x0f19, B:150:0x0f5f, B:151:0x0fb0, B:155:0x101a, B:157:0x102d, B:158:0x107a, B:164:0x126b, B:166:0x12a3, B:167:0x12f6, B:170:0x130c, B:172:0x131b, B:173:0x135c, B:177:0x13f3, B:179:0x143e, B:180:0x148f, B:184:0x14a6, B:186:0x14be, B:187:0x1500, B:193:0x15ac, B:195:0x15f8, B:196:0x1644, B:200:0x1681, B:202:0x1694, B:203:0x16db, B:206:0x16ed, B:208:0x170a, B:209:0x1756, B:214:0x2407, B:216:0x241a, B:217:0x2463, B:228:0x2866, B:230:0x2879, B:231:0x28ca, B:236:0x299e, B:238:0x29b1, B:239:0x2a01, B:250:0x2ab9, B:252:0x2afd, B:253:0x2b52, B:270:0x2d20, B:272:0x2d33, B:273:0x2d8e, B:283:0x2e6e, B:285:0x2eab, B:286:0x2eff, B:304:0x2fe9, B:306:0x3026, B:307:0x3079, B:311:0x30b2, B:313:0x30c5, B:314:0x311a, B:318:0x31c4, B:320:0x320e, B:321:0x3260, B:325:0x3293, B:327:0x32e4, B:328:0x333b, B:346:0x246f, B:348:0x248d, B:349:0x24df, B:355:0x209e, B:357:0x20b1, B:358:0x20fb, B:385:0x21a5, B:387:0x21de, B:388:0x2230, B:393:0x2335, B:395:0x237e, B:396:0x23ca, B:400:0x2265, B:402:0x22ab, B:403:0x22fc, B:408:0x114e, B:410:0x1161, B:411:0x11b0), top: B:5:0x00d2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:219:0x246c  */
                                /* JADX WARN: Removed duplicated region for block: B:227:0x2864  */
                                /* JADX WARN: Removed duplicated region for block: B:245:0x2a87  */
                                /* JADX WARN: Removed duplicated region for block: B:267:0x2d0c  */
                                /* JADX WARN: Removed duplicated region for block: B:282:0x2e56  */
                                /* JADX WARN: Removed duplicated region for block: B:289:0x2f15  */
                                /* JADX WARN: Removed duplicated region for block: B:303:0x2fd1  */
                                /* JADX WARN: Removed duplicated region for block: B:310:0x308f  */
                                /* JADX WARN: Removed duplicated region for block: B:344:0x2e52 A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:346:0x246f A[Catch: all -> 0x01c0, TryCatch #1 {all -> 0x01c0, blocks: (B:6:0x00d2, B:8:0x00e5, B:9:0x0130, B:18:0x01e5, B:20:0x0222, B:21:0x0273, B:29:0x0305, B:31:0x0318, B:32:0x0367, B:40:0x042b, B:42:0x0463, B:43:0x04b7, B:46:0x04cd, B:48:0x04dc, B:49:0x0525, B:55:0x05ca, B:57:0x0614, B:58:0x0667, B:62:0x06d1, B:64:0x06e4, B:65:0x073b, B:71:0x0808, B:73:0x0854, B:74:0x08a4, B:81:0x0960, B:83:0x0973, B:84:0x09bf, B:94:0x0aa7, B:96:0x0af0, B:97:0x0b44, B:101:0x0b7e, B:103:0x0b91, B:104:0x0bd6, B:113:0x0c3b, B:115:0x0c74, B:116:0x0cc9, B:132:0x0da4, B:134:0x0ddd, B:135:0x0e31, B:139:0x0e69, B:141:0x0e7c, B:142:0x0ec1, B:148:0x0f19, B:150:0x0f5f, B:151:0x0fb0, B:155:0x101a, B:157:0x102d, B:158:0x107a, B:164:0x126b, B:166:0x12a3, B:167:0x12f6, B:170:0x130c, B:172:0x131b, B:173:0x135c, B:177:0x13f3, B:179:0x143e, B:180:0x148f, B:184:0x14a6, B:186:0x14be, B:187:0x1500, B:193:0x15ac, B:195:0x15f8, B:196:0x1644, B:200:0x1681, B:202:0x1694, B:203:0x16db, B:206:0x16ed, B:208:0x170a, B:209:0x1756, B:214:0x2407, B:216:0x241a, B:217:0x2463, B:228:0x2866, B:230:0x2879, B:231:0x28ca, B:236:0x299e, B:238:0x29b1, B:239:0x2a01, B:250:0x2ab9, B:252:0x2afd, B:253:0x2b52, B:270:0x2d20, B:272:0x2d33, B:273:0x2d8e, B:283:0x2e6e, B:285:0x2eab, B:286:0x2eff, B:304:0x2fe9, B:306:0x3026, B:307:0x3079, B:311:0x30b2, B:313:0x30c5, B:314:0x311a, B:318:0x31c4, B:320:0x320e, B:321:0x3260, B:325:0x3293, B:327:0x32e4, B:328:0x333b, B:346:0x246f, B:348:0x248d, B:349:0x24df, B:355:0x209e, B:357:0x20b1, B:358:0x20fb, B:385:0x21a5, B:387:0x21de, B:388:0x2230, B:393:0x2335, B:395:0x237e, B:396:0x23ca, B:400:0x2265, B:402:0x22ab, B:403:0x22fc, B:408:0x114e, B:410:0x1161, B:411:0x11b0), top: B:5:0x00d2 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i2, int i3, int i4) {
                                    int i5;
                                    java.lang.Integer num;
                                    java.lang.String str;
                                    java.lang.String str2;
                                    int i6;
                                    java.lang.String str3;
                                    int i7;
                                    int i8;
                                    int i9;
                                    int i10;
                                    long j;
                                    char c;
                                    java.lang.String[][] strArr;
                                    java.lang.Object obj;
                                    java.lang.Object invoke;
                                    int i11;
                                    char c2;
                                    int i12;
                                    java.lang.String str4;
                                    int i13;
                                    int i14;
                                    java.lang.String intern;
                                    java.io.File file;
                                    java.lang.String next;
                                    java.lang.String[][] strArr2;
                                    java.lang.String[] strArr3;
                                    int i15;
                                    int i16;
                                    int i17;
                                    int i18;
                                    java.lang.String next2;
                                    char c3 = 16;
                                    int i19 = 1;
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 465, (char) (51617 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 9 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                                    int i20 = 0;
                                    java.lang.Integer num2 = 0;
                                    java.lang.String intern2 = ((java.lang.String) objArr[0]).intern();
                                    java.lang.String str5 = "";
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf("", "", 0, 0), (char) (44803 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), android.view.KeyEvent.getDeadChar(0, 0) + 27, objArr2);
                                    java.lang.String intern3 = ((java.lang.String) objArr2[0]).intern();
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    a(27 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.Color.blue(0) + 27292), 25 - android.view.View.MeasureSpec.getMode(0), objArr3);
                                    java.lang.String intern4 = ((java.lang.String) objArr3[0]).intern();
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    a(52 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (41739 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.getSize(0) + 18, objArr4);
                                    java.lang.String intern5 = ((java.lang.String) objArr4[0]).intern();
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    a(70 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                                    java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr5[0]).intern()};
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= 4) {
                                            i5 = i2;
                                            break;
                                        }
                                        try {
                                            java.lang.Object[] objArr6 = {strArr4[i21]};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                            if (obj2 == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(i20) + 36, 3161 - android.text.TextUtils.getCapsMode("", i20, i20), (char) (33100 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                java.lang.Object[] objArr7 = new java.lang.Object[i19];
                                                b($$a[c3], (byte) ($$b & 83), (short) 612, objArr7);
                                                java.lang.String str6 = (java.lang.String) objArr7[i20];
                                                java.lang.Class<?>[] clsArr = new java.lang.Class[i19];
                                                clsArr[i20] = java.lang.String.class;
                                                obj2 = cls.getMethod(str6, clsArr);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj2);
                                            }
                                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr6)).longValue();
                                            long j2 = i2;
                                            int i22 = i21;
                                            long j3 = ((530 * longValue) - 479689626512L) + (((~((~j2) | (-905074769))) | (~(longValue | (-905074769)))) * 529) + (((~longValue) | (~((-905074769) | j2))) * 529) + 1900509672;
                                            if (((((int) j3) & ((((~((-620095703) | r3)) * (-560)) - 107679515) + ((~((-71401477) | i2)) * (-560)) + (((~((~i2) | (-817130708))) | 268436481) * 560))) | (((int) (j3 >> 32)) & ((((((~((-785534663) | i2)) | 651167428) * 1504) - 1320242614) + ((~((-134367235) | i2)) * (-1504))) - 1640766496))) != 0) {
                                                i5 = i2 ^ (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                                                break;
                                            }
                                            i21 = i22 + 1;
                                            i20 = 0;
                                            c3 = 16;
                                            i19 = 1;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                    if (i5 != i2) {
                                        java.lang.Object[] objArr8 = {new int[]{i2}, new int[]{i5}, null, null, new int[1]};
                                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-1167510041) | i2)) | 75923992) * 104) - 783750487) + ((~((~i2) | 1974922105)) * (-104)) + ((i2 | 883336057) * 104))};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj3 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            b(b, b, (short) 653, objArr10);
                                            obj3 = cls2.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                                        }
                                        ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr9)).intValue();
                                        return objArr8;
                                    }
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    a(98 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 13, objArr11);
                                    java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 111, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 14 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr12);
                                    java.lang.String intern7 = ((java.lang.String) objArr12[0]).intern();
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (char) android.view.View.MeasureSpec.getSize(0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 18, objArr13);
                                    java.lang.String[] strArr5 = {intern6, intern7, ((java.lang.String) objArr13[0]).intern()};
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= 3) {
                                            num = num2;
                                            str = intern2;
                                            str2 = str5;
                                            i6 = i2;
                                            break;
                                        }
                                        java.lang.Object[] objArr14 = {strArr5[i23]};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj4 == null) {
                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 36, 3160 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (33100 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b2 = (byte) ($$a[16] - 1);
                                            byte b3 = b2;
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            b(b2, b3, (short) (b3 | 618), objArr15);
                                            obj4 = cls3.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj4);
                                        }
                                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr14)).longValue();
                                        long j4 = i2;
                                        long j5 = ~j4;
                                        num = num2;
                                        str = intern2;
                                        str2 = str5;
                                        long j6 = (((-949) * longValue2) - 224558161308L) + (((~((~longValue2) | j5)) | (~(j4 | (-236626093)))) * 1900) + (((~(236626092 | j5)) | (~(longValue2 | j4))) * (-950)) + (((~(j5 | longValue2)) | ((236626092 | j4) ^ (-1))) * 950) + 670844646;
                                        int i24 = (int) (j6 >> 32);
                                        int i25 = ~i2;
                                        if (((((int) j6) & (((((~(2083169442 | i25)) | (-645943033)) * (-933)) - 783559058) + (((~((-645943033) | i25)) | 603980960) * 933) + 1398351690)) | (((((-1140925841) | i25) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1402558106 + (((~(i25 | 149477389)) | (-1143580049)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) & i24)) != 0) {
                                            i6 = (i23 + 270) ^ i2;
                                            break;
                                        }
                                        i23++;
                                        num2 = num;
                                        intern2 = str;
                                        str5 = str2;
                                    }
                                    if (i6 != i2) {
                                        java.lang.Object[] objArr16 = {new int[]{i2}, new int[]{i6}, null, null, new int[1]};
                                        int i26 = ~i2;
                                        java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((-71045121) | i26) * 494) + 203423683 + (((~(i26 | 1539371007)) | (-1169986158)) * 494))};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj5 == null) {
                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.os.Process.myTid() >> 22));
                                            byte b4 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            b(b4, b4, (short) 653, objArr18);
                                            obj5 = cls4.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                        }
                                        ((int[]) objArr16[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                                        return objArr16;
                                    }
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
                                    if (obj6 == null) {
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, 1864 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.graphics.Color.alpha(0) + 41775));
                                        byte b5 = (byte) ($$a[16] - 1);
                                        byte b6 = b5;
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        b(b5, b6, b6, objArr19);
                                        obj6 = cls5.getMethod((java.lang.String) objArr19[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj6);
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, null)).longValue();
                                    long j7 = i2;
                                    long j8 = ~j7;
                                    long j9 = (-951475913) | j8;
                                    long j10 = ~longValue3;
                                    long j11 = (((((53 * longValue3) + 48525271563L) + ((~(j9 | longValue3)) * 52)) + ((((~(j10 | j8)) | (~(j10 | (-951475913)))) | (~j9)) * (-52))) + (((~(longValue3 | 951475912)) | (~(951475912 | j8))) * 52)) - 977736949;
                                    int i27 = ~i2;
                                    int i28 = (((int) (j11 >> 32)) & (((((~((-1963918383) | i2)) | 352584706) * (-283)) - 1860516896) + ((~((-1611333677) | i2)) * 283))) | (((int) j11) & ((((~(400827474 | i2)) | 1036398935) * (-964)) + 1368304997 + (((~(400827474 | i27)) | 671224069) * (-964))));
                                    int i29 = i28 != 0 ? (i28 + 199) ^ i2 : i2;
                                    if (i29 != i2) {
                                        java.lang.Object[] objArr20 = {new int[]{i2}, new int[]{i29}, null, null, new int[1]};
                                        java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((2187872 | i2) * 988) + 1788794317 + (((~(1009738744 | i27)) | 33556481) * (-1976)) + (((~(i2 | (-1041107354))) | 2187872 | (~(i27 | 1041107353))) * 988))};
                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj7 == null) {
                                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, 2713 - android.graphics.Color.green(0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b7 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            b(b7, b7, (short) 653, objArr22);
                                            obj7 = cls6.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                        }
                                        ((int[]) objArr20[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr21)).intValue();
                                        return objArr20;
                                    }
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    a(141 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (55816 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 20 - (android.os.Process.myTid() >> 22), objArr23);
                                    java.lang.String intern8 = ((java.lang.String) objArr23[0]).intern();
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    a(161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 7 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr24);
                                    java.lang.Object[] objArr25 = {intern8, ((java.lang.String) objArr24[0]).intern()};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj8 == null) {
                                        str3 = str2;
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2213, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        byte b8 = (byte) ($$a[16] - 1);
                                        byte b9 = b8;
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        b(b8, b9, b9, objArr26);
                                        obj8 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj8);
                                    } else {
                                        str3 = str2;
                                    }
                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr25)).longValue();
                                    long j12 = ~longValue4;
                                    long j13 = 267545333 | longValue4;
                                    long j14 = ~(j8 | longValue4);
                                    long j15 = (((((longValue4 * 85) + 22741353305L) + (((((~(j12 | (-267545334))) | (~(j8 | (-267545334)))) | (~(j12 | j8))) | (~(j13 | j7))) * (-84))) + ((((~(j12 | j7)) | 267545333) | j14) * (-84))) + ((j14 | (~j13)) * 84)) - 1002919935;
                                    int i30 = ((((int) j15) & ((((((~(1876517396 | i2)) | 270929002) * 336) + (-501357939)) + (((~(439290986 | i2)) | 1708155412) * (-168))) + (((~(439290986 | i27)) | 1876517396) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | ((((((1437182504 | i2) * 614) + (-718710374)) + ((((~(1045897750 | i27)) | 1101563944) | (~((-1811843135) | i27))) * (-1228))) + (((~(2147461694 | i27)) | (~((-710279191) | i27))) * 614)) & ((int) (j15 >> 32)))) != 0 ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i2;
                                    if (i30 != i2) {
                                        java.lang.Object[] objArr27 = {new int[]{i2}, new int[]{i30}, null, null, new int[1]};
                                        java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((i2 | 2042390637) * 614) + 1640968579 + (((~((-685828827) | i27)) | 681601096 | (~(1365017271 | i27))) * (-1228)) + (((~((-4227731) | i27)) | (~(2046618367 | i27))) * 614))};
                                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj9 == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.getOffsetAfter(str3, 0));
                                            byte b10 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            b(b10, b10, (short) 653, objArr29);
                                            obj9 = cls8.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                        }
                                        ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr28)).intValue();
                                        return objArr27;
                                    }
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    a(167 - android.view.KeyEvent.normalizeMetaState(0), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 26908), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, objArr30);
                                    java.lang.String intern9 = ((java.lang.String) objArr30[0]).intern();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    a(198 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, objArr31);
                                    java.lang.String intern10 = ((java.lang.String) objArr31[0]).intern();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 22790), 28 - android.text.TextUtils.indexOf(str3, str3), objArr32);
                                    java.lang.String intern11 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    a(249 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.os.Process.getGidForName(str3) + 1), android.view.View.combineMeasuredStates(0, 0) + 14, objArr33);
                                    java.lang.String[] strArr6 = {intern9, intern10, intern11, ((java.lang.String) objArr33[0]).intern()};
                                    int i31 = 0;
                                    while (true) {
                                        if (i31 >= 4) {
                                            i7 = i2;
                                            break;
                                        }
                                        java.lang.Object[] objArr34 = {strArr6[i31]};
                                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        if (obj10 == null) {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getOffsetAfter(str3, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3160, (char) (33099 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                            byte b11 = (byte) ($$a[16] - 1);
                                            byte b12 = b11;
                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                            b(b11, b12, b12, objArr35);
                                            obj10 = cls9.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj10);
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr34)).longValue();
                                        long j16 = ~longValue5;
                                        long j17 = ~(j7 | (-309160576));
                                        java.lang.String[] strArr7 = strArr6;
                                        int i32 = i31;
                                        long j18 = (((((521 * longValue5) + 160454338944L) + (((~((j16 | 309160575) | j8)) | (~(longValue5 | j7))) * 520)) + (((~(j16 | j8)) | j17) * (-1040))) + ((((~(309160575 | j8)) | (~((-309160576) | j16))) | j17) * 520)) - 1028507532;
                                        int i33 = (int) (j18 >> 32);
                                        int i34 = ~(1163649071 | i2);
                                        if (((i33 & (((((~((-2111910886) | i27)) | (-674684475)) * (-602)) - 965885139) + (((~((-2111910886) | i2)) | 1438720453 | (~((-1494043) | i27))) * (-301)) + ((~((-674684475) | i27)) * 301))) | (((int) j18) & ((((~((-1163649072) | i2)) | 1146732582 | (~((-1694091815) | i2))) * (-880)) + 818884229 + (((~((-1163649072) | i27)) | 1694091814 | i34) * (-880)) + (i34 * 880)))) != 0) {
                                            int i35 = AlternateContactlessPaymentDataJson + 119;
                                            writeReplace = i35 % 128;
                                            i7 = i35 % 2 != 0 ? (i32 << 16767) ^ i2 : i2 ^ (i32 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                        } else {
                                            i31 = i32 + 1;
                                            strArr6 = strArr7;
                                        }
                                    }
                                    if (i7 != i2) {
                                        java.lang.Object[] objArr36 = {new int[]{i2}, new int[]{i7}, null, null, new int[1]};
                                        java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((((~((-1651463222) | i27)) | (~((-399382877) | i2))) * (-370)) + 654690595) + ((((~(i2 | (-1651463222))) | (~((-399382877) | i27))) | (-2012175742)) * (-370))) - 1475682332)};
                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj11 == null) {
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str3) + 50, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                            byte b13 = (byte) (-$$a[18]);
                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                            b(b13, b13, (short) 653, objArr38);
                                            obj11 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                        }
                                        ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr37)).intValue();
                                        return objArr36;
                                    }
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 37942), android.view.View.combineMeasuredStates(0, 0) + 13, objArr39);
                                    java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj12 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1921 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        byte b14 = (byte) ($$a[16] - 1);
                                        byte b15 = b14;
                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                        b(b14, b15, b15, objArr41);
                                        obj12 = cls11.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                                    }
                                    java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj12).invoke(null, objArr40);
                                    if (str7 != null) {
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf(str3, str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 9 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr42);
                                        if (str7.contains(((java.lang.String) objArr42[0]).intern())) {
                                            int i36 = writeReplace + 91;
                                            AlternateContactlessPaymentDataJson = i36 % 128;
                                            i8 = i36 % 2 == 0 ? i2 ^ 15330 : i2 ^ 250;
                                            if (i8 == i2) {
                                                java.lang.Object[] objArr43 = {new int[]{i2}, new int[]{i8}, null, null, new int[1]};
                                                java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~(i2 | (-830564353))) | 1207959905) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1342557508) + ((~((-830564353) | i27)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj13 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                                    byte b16 = (byte) (-$$a[18]);
                                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                    b(b16, b16, (short) 653, objArr45);
                                                    obj13 = cls12.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                                                }
                                                ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr44)).intValue();
                                                return objArr43;
                                            }
                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                            a(285 - android.graphics.Color.green(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 17 - android.text.TextUtils.getCapsMode(str3, 0, 0), objArr46);
                                            java.lang.String intern12 = ((java.lang.String) objArr46[0]).intern();
                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 302, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 6, objArr47);
                                            java.lang.String intern13 = ((java.lang.String) objArr47[0]).intern();
                                            java.io.File file2 = new java.io.File(intern12);
                                            if (file2.exists() && file2.isFile()) {
                                                try {
                                                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                    a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 309, (char) (58568 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 1 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr48);
                                                    java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr48[0]).intern());
                                                    next2 = useDelimiter.hasNext() ? useDelimiter.next() : str3;
                                                    useDelimiter.close();
                                                } catch (java.io.IOException unused) {
                                                }
                                                if (next2.contains(intern13)) {
                                                    i9 = i2 ^ 251;
                                                    if (i9 == i2) {
                                                        java.lang.Object[] objArr49 = {new int[]{i2}, new int[]{i9}, null, null, new int[1]};
                                                        java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~((-332229413) | i2)) | 294480128) * (-566)) + 1222874001 + ((~(i2 | (-37749285))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj14 == null) {
                                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.indexOf(str3, str3) + 2713, (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                            byte b17 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                            b(b17, b17, (short) 653, objArr51);
                                                            obj14 = cls13.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                                        }
                                                        ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr50)).intValue();
                                                        return objArr49;
                                                    }
                                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 311, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 23 - android.text.TextUtils.indexOf(str3, str3), objArr52);
                                                    java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj15 == null) {
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myTid() >> 22) + 1921, (char) android.text.TextUtils.indexOf(str3, str3));
                                                        byte b18 = (byte) ($$a[16] - 1);
                                                        byte b19 = b18;
                                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                        b(b18, b19, b19, objArr54);
                                                        obj15 = cls14.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                                                    }
                                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj15).invoke(null, objArr53)).toLowerCase();
                                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                    a(333 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 4 - android.graphics.Color.argb(0, 0, 0, 0), objArr55);
                                                    int i37 = lowerCase.contains(((java.lang.String) objArr55[0]).intern()) ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i2;
                                                    if (i37 != i2) {
                                                        java.lang.Object[] objArr56 = {new int[]{i2}, new int[]{i37}, null, null, new int[1]};
                                                        java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((1973393297 | i2) * 140) + 1509994233 + (((~(1973393297 | i27)) | 16384) * (-280)) + (((~(i2 | (-16385))) | (~(77452800 | i27)) | 1895956881) * 140))};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj16 == null) {
                                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                            byte b20 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                            b(b20, b20, (short) 653, objArr58);
                                                            obj16 = cls15.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                                        }
                                                        ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr57)).intValue();
                                                        return objArr56;
                                                    }
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    a(android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr59);
                                                    java.lang.String intern14 = ((java.lang.String) objArr59[0]).intern();
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    a(385 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr60);
                                                    java.lang.Object[] objArr61 = {intern14, ((java.lang.String) objArr60[0]).intern()};
                                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                    if (obj17 == null) {
                                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 39, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2212, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0));
                                                        byte b21 = (byte) ($$a[16] - 1);
                                                        byte b22 = b21;
                                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                        b(b21, b22, b22, objArr62);
                                                        obj17 = cls16.getMethod((java.lang.String) objArr62[0], java.lang.String.class, java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj17);
                                                    }
                                                    long j19 = ~((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr61)).longValue();
                                                    long j20 = j7 | 1006351448;
                                                    long j21 = (((((r2 * (-667)) - 1343479183080L) + (((~j20) | j19) * (-668))) + (((~(j19 | j7)) | 1006351448) * 1336)) + ((j19 | j20) * 668)) - 1741726050;
                                                    if (((((int) j21) & (((~(1499836803 | i27)) * (-560)) + 684828453 + ((~((-9062481) | i2)) * (-560)) + (((~(1357904082 | i27)) | 150995201) * 560))) | ((((441335509 | i2) * (-859)) + 1815514538 + (((~(441335509 | i27)) | (~((-441194198) | i2))) * 859) + (((~((-995890902) | i27)) | 554696704) * 859)) & ((int) (j21 >> 32)))) != 0) {
                                                        i10 = i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                    } else {
                                                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                        a(343 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-16761157) - android.graphics.Color.rgb(0, 0, 0)), 12 - android.view.MotionEvent.axisFromString(str3), objArr63);
                                                        java.lang.String intern15 = ((java.lang.String) objArr63[0]).intern();
                                                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 355, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 9 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr64);
                                                        java.lang.Object[] objArr65 = {intern15, ((java.lang.String) objArr64[0]).intern()};
                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                        if (obj18 == null) {
                                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, 2213 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - android.os.Process.getGidForName(str3)));
                                                            byte b23 = (byte) ($$a[16] - 1);
                                                            byte b24 = b23;
                                                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                            b(b23, b24, b24, objArr66);
                                                            obj18 = cls17.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj18);
                                                        }
                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr65)).longValue();
                                                        long j22 = ~((-1237620819) | longValue6);
                                                        long j23 = ~longValue6;
                                                        long j24 = ~(1237620818 | j23);
                                                        long j25 = (((((longValue6 * 263) - 647275687814L) + (((~(j23 | j7)) | (j22 | j24)) * 262)) + ((-786) * j24)) + ((((~(j23 | j8)) | j22) | j24) * 262)) - 1972995420;
                                                        i10 = ((((int) j25) & ((((((~((-872811105) | i2)) | (~((-1073775638) | i27))) * 920) + (-2038855459)) + (((~((-911154145) | i27)) | 872811104) * 920)) + ((((~((-872811105) | i27)) | (~((-38343041) | i2))) | (~((-1073775638) | i2))) * 920))) | (((int) (j25 >> 32)) & ((((((~(566330477 | i2)) | (-870895934)) * (-668)) + (-1203945050)) + (((~((-870895934) | i2)) | 566330477) * 1336)) + (((-304632081) | i2) * 668)))) != 0 ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i2;
                                                    }
                                                    if (i10 != i2) {
                                                        java.lang.Object[] objArr67 = {new int[]{i2}, new int[]{i10}, null, null, new int[1]};
                                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((-1345332618) | i27) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1449405529 + (((~(705513478 | i27)) | (-2050846094)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj19 == null) {
                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2713 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                            byte b25 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                            b(b25, b25, (short) 653, objArr69);
                                                            obj19 = cls18.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                        }
                                                        ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr68)).intValue();
                                                        return objArr67;
                                                    }
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                                    if (obj20 == null) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, 2763 - android.text.TextUtils.getOffsetAfter(str3, 0), (char) android.text.TextUtils.indexOf(str3, str3));
                                                        byte b26 = (byte) ($$a[16] - 1);
                                                        byte b27 = b26;
                                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                        b(b26, b27, b27, objArr70);
                                                        obj20 = cls19.getMethod((java.lang.String) objArr70[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj20);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, null)).longValue();
                                                    long j26 = (~(1045146995 | (~longValue7))) | (~(j7 | 1045146995));
                                                    long j27 = ((-495) * longValue7) + 517347763020L + (992 * j26) + ((j26 | (~((-1045146996) | j8 | longValue7))) * (-496)) + ((longValue7 | j7) * 496) + 1170183759;
                                                    if (((((int) (j27 >> 32)) & ((((-268476929) | i27) * 494) + 1990225214 + (((~(585457111 | i27)) | (-270641669)) * 494))) | (((int) j27) & (((((-1401169768) | r4) * 764) - 1121005791) + (((~((-1401169768) | i27)) | 1367343397) * (-1528)) + (((~((-36056643) | i27)) | 1369573669) * 764)))) == 1) {
                                                        java.lang.Object[] objArr71 = {new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                                        java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i4), num, java.lang.Integer.valueOf((((~((-1063860983) | i27)) | 986985115) * (-602)) + 1610006861 + (((~(i2 | (-1063860983))) | 977285778 | (~(1073560319 | i27))) * (-301)) + ((~(986985115 | i27)) * 301))};
                                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj21 == null) {
                                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2712 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            byte b28 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                            b(b28, b28, (short) 653, objArr73);
                                                            obj21 = cls20.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                        }
                                                        ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr72)).intValue();
                                                        return objArr71;
                                                    }
                                                    java.lang.Object[] objArr74 = {1};
                                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                    if (obj22 == null) {
                                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2364 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.indexOf(str3, str3));
                                                        byte b29 = (byte) ($$a[16] - 1);
                                                        byte b30 = b29;
                                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                        b(b29, b30, b30, objArr75);
                                                        obj22 = cls21.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj22);
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr74)).longValue();
                                                    long j28 = (603 * longValue8) + 10501035280L + (((~((-34771641) | j8)) | longValue8) * (-602)) + (((~((-34771641) | (~longValue8))) | (~(j7 | (-34771641))) | (~(34771640 | j8 | longValue8))) * (-301)) + ((~(longValue8 | j8)) * 301) + 1373138559;
                                                    int i38 = ((((int) (j28 >> 32)) & (((((1459027967 | i2) * (-381)) + (-2109867398)) + (((~(1452331869 | i27)) | 1450618607) * 381)) - 1838874624)) | (((int) j28) & (((((((~((-126568433) | i27)) | 83953040) | (~((-1563794843) | i27))) * 464) + 213229157) + (((-42615393) | i2) * (-464))) + (((~((-1563794843) | i2)) | 83953040) * 464)))) != 0 ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i2;
                                                    if (i38 != i2) {
                                                        java.lang.Object[] objArr76 = {new int[]{i2}, new int[]{i38}, null, null, new int[1]};
                                                        java.lang.Object[] objArr77 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~((-634399510) | i2)) | 563095809 | (~(1416446588 | i2))) * (-754)) + 797868083 + (((~(i2 | (-563095810))) | (~(1979542397 | i27))) * (-754)) + (((-634399510) | i27) * 754))};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj23 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.indexOf(str3, str3, 0));
                                                            byte b31 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                            b(b31, b31, (short) 653, objArr78);
                                                            obj23 = cls22.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                        }
                                                        ((int[]) objArr76[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr77)).intValue();
                                                        return objArr76;
                                                    }
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 309, (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 23, objArr79);
                                                    java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj24 == null) {
                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, 1921 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                        byte b32 = (byte) ($$a[16] - 1);
                                                        byte b33 = b32;
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        b(b32, b33, b33, objArr81);
                                                        obj24 = cls23.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                                    }
                                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr80);
                                                    if (invoke2 != null) {
                                                        AlternateContactlessPaymentDataJson = (writeReplace + 69) % 128;
                                                        java.lang.Object[] objArr82 = {invoke2, 42};
                                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                        if (obj25 == null) {
                                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, 2594 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            byte b34 = (byte) ($$a[16] - 1);
                                                            byte b35 = b34;
                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                            b(b34, b35, b35, objArr83);
                                                            obj25 = cls24.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                        }
                                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr82)).longValue();
                                                        long j29 = ~(longValue9 | j7);
                                                        long j30 = ((111 * longValue9) - 20691983499L) + (((-189834712) | j29) * (-220)) + ((j29 | (~(189834711 | longValue9))) * 220) + (((~((~longValue9) | 189834711)) | (~((-189834712) | longValue9))) * 110) + 1067265813;
                                                        int i39 = (int) (j30 >> 32);
                                                        int i40 = ~((-1215573718) | i27);
                                                        if (((i39 & ((((~(2062482367 | i27)) * 130) - 1570396918) + (((~(2062482367 | i2)) | 4210704) * 130))) | (((int) j30) & (((((562123008 | i40) | (~(1215573717 | i2))) * (-338)) - 418210731) + ((i40 | (~(1777696725 | i2))) * 338)))) == 1986687685) {
                                                            AlternateContactlessPaymentDataJson = (writeReplace + 39) % 128;
                                                            j = j8;
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            a(android.view.MotionEvent.axisFromString(str3) + 447, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 59137), 16 - android.graphics.Color.blue(0), objArr84);
                                                            java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj == null) {
                                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1921, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                byte b36 = (byte) ($$a[16] - 1);
                                                                byte b37 = b36;
                                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                b(b36, b37, b37, objArr86);
                                                                obj = cls25.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                                            }
                                                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr85);
                                                            if (invoke != null) {
                                                                i11 = 0;
                                                            } else {
                                                                java.lang.Object[] objArr87 = {invoke, 42};
                                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj26 == null) {
                                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2593 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                                    byte b38 = (byte) ($$a[16] - 1);
                                                                    byte b39 = b38;
                                                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                    b(b38, b39, b39, objArr88);
                                                                    obj26 = cls26.getMethod((java.lang.String) objArr88[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                                                }
                                                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr87)).longValue();
                                                                long j31 = ~longValue10;
                                                                long j32 = ~(1021911322 | longValue10);
                                                                long j33 = (longValue10 * 371) + 379129100462L + (((~(j31 | j)) | (~(j7 | (-1021911323)))) * (-370)) + (((~(j31 | j7)) | (~(j | (-1021911323))) | j32) * (-370)) + (j32 * 370) + 235189202;
                                                                i11 = (((int) j33) & ((((~(388422477 | i27)) | (~((-1048803933) | i2))) * 959) + 912119011 + (((~(388422477 | i2)) | (~((-1048803933) | i27))) * 959))) | (((int) (j33 >> 32)) & (((((~((-1628030131) | i2)) | 173419269) * (-502)) - 336214938) + ((~((-17384451) | i27)) * (-502)) + (((~(190803719 | i2)) | (-1628030131)) * 502)));
                                                            }
                                                            if (i11 != 1986687685 && i11 != -1514516938) {
                                                                AlternateContactlessPaymentDataJson = (writeReplace + 17) % 128;
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                a(1161 - android.view.KeyEvent.getDeadChar(0, 0), (char) (6153 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr89);
                                                                java.lang.String intern16 = ((java.lang.String) objArr89[0]).intern();
                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1175, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 27, objArr90);
                                                                java.lang.String intern17 = ((java.lang.String) objArr90[0]).intern();
                                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                a(android.view.View.MeasureSpec.getSize(0) + 1201, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr91);
                                                                java.lang.String intern18 = ((java.lang.String) objArr91[0]).intern();
                                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1218, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 17, objArr92);
                                                                java.lang.String intern19 = ((java.lang.String) objArr92[0]).intern();
                                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                a(1236 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18557), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 15, objArr93);
                                                                java.lang.String intern20 = ((java.lang.String) objArr93[0]).intern();
                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                a(1250 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.Gravity.getAbsoluteGravity(0, 0) + 37, objArr94);
                                                                java.lang.String intern21 = ((java.lang.String) objArr94[0]).intern();
                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                a(1287 - (android.os.Process.myTid() >> 22), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr95);
                                                                java.lang.String intern22 = ((java.lang.String) objArr95[0]).intern();
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                a(1300 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6601), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, objArr96);
                                                                java.lang.String intern23 = ((java.lang.String) objArr96[0]).intern();
                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                a(android.view.MotionEvent.axisFromString(str3) + 1313, (char) (48961 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 22 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr97);
                                                                java.lang.String intern24 = ((java.lang.String) objArr97[0]).intern();
                                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                a(1334 - android.graphics.Color.alpha(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 31 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr98);
                                                                java.lang.String intern25 = ((java.lang.String) objArr98[0]).intern();
                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                a(android.text.TextUtils.indexOf(str3, str3) + 1365, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11282), 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr99);
                                                                java.lang.String intern26 = ((java.lang.String) objArr99[0]).intern();
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1377, (char) (41701 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr100);
                                                                java.lang.String intern27 = ((java.lang.String) objArr100[0]).intern();
                                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                a(1389 - android.text.TextUtils.getOffsetBefore(str3, 0), (char) (60649 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.os.Process.myPid() >> 22) + 12, objArr101);
                                                                java.lang.String intern28 = ((java.lang.String) objArr101[0]).intern();
                                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                a(1401 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (33699 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr102);
                                                                java.lang.String intern29 = ((java.lang.String) objArr102[0]).intern();
                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                a(1412 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (15513 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 12, objArr103);
                                                                java.lang.String intern30 = ((java.lang.String) objArr103[0]).intern();
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                a(1425 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - android.graphics.Color.argb(0, 0, 0, 0), objArr104);
                                                                java.lang.String intern31 = ((java.lang.String) objArr104[0]).intern();
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1439, (char) (android.graphics.Color.rgb(0, 0, 0) + 16806177), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr105);
                                                                java.lang.String intern32 = ((java.lang.String) objArr105[0]).intern();
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                a(android.view.View.MeasureSpec.getSize(0) + 1451, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.keyCodeFromString(str3) + 24, objArr106);
                                                                java.lang.String intern33 = ((java.lang.String) objArr106[0]).intern();
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1475, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 28 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr107);
                                                                java.lang.String[] strArr8 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr107[0]).intern()};
                                                                i16 = 0;
                                                                while (i16 < 19) {
                                                                    java.lang.String str8 = strArr8[i16];
                                                                    java.lang.Object[] objArr108 = {str8};
                                                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                                    if (obj27 == null) {
                                                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 36, 3161 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33099));
                                                                        byte b40 = (byte) ($$a[16] - 1);
                                                                        byte b41 = b40;
                                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                        b(b40, b41, (short) (b41 | 618), objArr109);
                                                                        obj27 = cls27.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj27);
                                                                    }
                                                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr108)).longValue();
                                                                    long j34 = ~longValue11;
                                                                    long j35 = ~(j | (-929422373) | longValue11);
                                                                    java.lang.String[] strArr9 = strArr8;
                                                                    int i41 = i16;
                                                                    long j36 = ((471 * longValue11) - 437757937683L) + ((longValue11 | (-929422373)) * (-470)) + (((~(j34 | j7)) | (~(929422372 | j34)) | j35) * (-470)) + (((~((-929422373) | j34 | j7)) | j35) * 470) + 1836893111;
                                                                    if (((((int) (j36 >> 32)) & (((((~(528677464 | i27)) | (-2142239324)) * 98) - 746947505) + (((~((-1965903876) | i27)) | 528677464 | (~(1965903875 | i2))) * (-49)) + (((~(528677464 | i2)) | 176335448) * 49))) | (((int) j36) & ((((~(1229948541 | i27)) | 536879488) * (-108)) + 873757993 + (((~((-1627792345) | i2)) | 139035685 | (~(1627792344 | i27))) * 54) + ((139035685 | i2) * 54)))) == 0) {
                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                        a(1425 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, objArr110);
                                                                        if (str8.equals(((java.lang.String) objArr110[0]).intern())) {
                                                                            java.lang.Object[] objArr111 = {str8};
                                                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                            if (obj28 == null) {
                                                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.myPid() >> 22), (android.os.Process.myTid() >> 22) + 3161, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33100));
                                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                b($$a[16], (byte) ($$b & 83), (short) 612, objArr112);
                                                                                obj28 = cls28.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj28);
                                                                            }
                                                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr111)).longValue();
                                                                            long j37 = ~longValue12;
                                                                            long j38 = (longValue12 * (-1917)) + 620803065600L + (((~(j37 | j)) | (~(j7 | 646669860))) * 959) + ((-959) * j37) + (((~(j37 | j7)) | (~(j | 646669860))) * 959) + 348765043;
                                                                            int i42 = ~(1663492328 | i2);
                                                                            if (((((int) j38) & (((((~(1663492328 | i27)) | (-1870588927)) * (-245)) - 571528958) + (i42 * (-245)) + ((i42 | 226265918) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) (j38 >> 32)) & (((((~((-427505210) | i2)) | 22028296) * (-283)) - 918700414) + ((~((-405476914) | i2)) * 283)))) == 0) {
                                                                            }
                                                                        }
                                                                        i16 = i41 + 1;
                                                                        strArr8 = strArr9;
                                                                    }
                                                                    i17 = i41;
                                                                }
                                                                i17 = -1;
                                                                if (i17 >= 0) {
                                                                    int i43 = AlternateContactlessPaymentDataJson + 95;
                                                                    writeReplace = i43 % 128;
                                                                    if (i43 % 2 == 0 ? (i18 = i2 ^ (i17 + 130)) != i2 : (i18 = (i17 << 1724) ^ i2) != i2) {
                                                                        java.lang.Object[] objArr113 = {new int[]{i2}, new int[]{i18}, null, null, new int[1]};
                                                                        java.lang.Object[] objArr114 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~(1410416578 | i2)) | (-640429520)) * (-465)) - 1118529074) + (((~((-640429520) | i2)) | 1410416578) * 930) + ((i2 | (-573308942)) * 465))};
                                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj29 == null) {
                                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                            byte b42 = (byte) (-$$a[18]);
                                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                            b(b42, b42, (short) 653, objArr115);
                                                                            obj29 = cls29.getMethod((java.lang.String) objArr115[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                                        }
                                                                        ((int[]) objArr113[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr114)).intValue();
                                                                        return objArr113;
                                                                    }
                                                                }
                                                            }
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            a(android.widget.ExpandableListView.getPackedPositionType(0L) + 1503, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0), 12 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr116);
                                                            java.lang.String intern34 = ((java.lang.String) objArr116[0]).intern();
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            a(1516 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), 5 - android.view.View.MeasureSpec.getMode(0), objArr117);
                                                            java.lang.String[] strArr10 = {intern34, ((java.lang.String) objArr117[0]).intern()};
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            a(1521 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 14 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr118);
                                                            java.lang.String intern35 = ((java.lang.String) objArr118[0]).intern();
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            a(android.view.View.getDefaultSize(0, 0) + 1536, (char) (android.text.TextUtils.getTrimmedLength(str3) + 16428), 19 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr119);
                                                            java.lang.String intern36 = ((java.lang.String) objArr119[0]).intern();
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            a(1555 - android.text.TextUtils.indexOf(str3, str3, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 14 - android.text.TextUtils.getOffsetAfter(str3, 0), objArr120);
                                                            java.lang.String[] strArr11 = {intern35, intern36, ((java.lang.String) objArr120[0]).intern()};
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            a(1569 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777195) - android.graphics.Color.rgb(0, 0, 0), objArr121);
                                                            java.lang.String intern37 = ((java.lang.String) objArr121[0]).intern();
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1590, (char) (12744 - android.text.TextUtils.getCapsMode(str3, 0, 0)), 10 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr122);
                                                            java.lang.String[] strArr12 = {intern37, ((java.lang.String) objArr122[0]).intern()};
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            a(1600 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (25948 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr123);
                                                            java.lang.String intern38 = ((java.lang.String) objArr123[0]).intern();
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            a(337 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 6 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr124);
                                                            c2 = 0;
                                                            java.lang.String[] strArr13 = {intern38, ((java.lang.String) objArr124[0]).intern()};
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            a(1611 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.text.TextUtils.getCapsMode(str3, 0, 0), 28 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr125);
                                                            java.lang.String intern39 = ((java.lang.String) objArr125[0]).intern();
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            a((android.os.Process.myPid() >> 22) + 1590, (char) (android.view.View.getDefaultSize(0, 0) + 12744), 10 - android.graphics.Color.green(0), objArr126);
                                                            java.lang.String[][] strArr14 = {strArr10, strArr11, strArr12, strArr13, new java.lang.String[]{intern39, ((java.lang.String) objArr126[0]).intern()}};
                                                            int i44 = -1;
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < 5) {
                                                                    str4 = str3;
                                                                    i13 = i2;
                                                                    break;
                                                                }
                                                                java.lang.String[] strArr15 = strArr14[i12];
                                                                java.lang.String str9 = strArr15[c2];
                                                                java.lang.String[] strArr16 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr15, 1, strArr15.length);
                                                                int length = strArr16.length;
                                                                int i45 = 0;
                                                                while (i45 < length) {
                                                                    int i46 = i44 + 1;
                                                                    java.lang.Object[] objArr127 = {str9, strArr16[i45]};
                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                                    if (obj30 == null) {
                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2212 - android.view.MotionEvent.axisFromString(str3), (char) android.text.TextUtils.indexOf(str3, str3));
                                                                        byte b43 = (byte) ($$a[16] - 1);
                                                                        byte b44 = b43;
                                                                        strArr2 = strArr14;
                                                                        strArr3 = strArr16;
                                                                        i15 = length;
                                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                        b(b43, b44, b44, objArr128);
                                                                        obj30 = cls30.getMethod((java.lang.String) objArr128[0], java.lang.String.class, java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj30);
                                                                    } else {
                                                                        strArr2 = strArr14;
                                                                        strArr3 = strArr16;
                                                                        i15 = length;
                                                                    }
                                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr127)).longValue();
                                                                    java.lang.String str10 = str9;
                                                                    long j39 = ~longValue13;
                                                                    int i47 = i12;
                                                                    long j40 = ~(j | 215000678);
                                                                    str4 = str3;
                                                                    int i48 = i45;
                                                                    long j41 = (((((713 * longValue13) - 152865482058L) + (((~(j39 | 215000678)) | j40) * (-712))) + (((~((j39 | j) | 215000678)) | (~((longValue13 | 215000678) | j7))) * (-712))) + ((j40 | j39) * 712)) - 950375280;
                                                                    if (((((int) j41) & (((((-136415234) | i27) * 494) - 792564401) + (((~(1906053438 | i27)) | (-1227196458)) * 494))) | (((((~((-140749373) | i2)) | 138586668) * 336) + 501358106 + (((~(1296477038 | i2)) | (-1298639743)) * (-168)) + (((~(1296477038 | i27)) | (-140749373)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) & ((int) (j41 >> 32)))) != 0) {
                                                                        int i49 = writeReplace + 41;
                                                                        AlternateContactlessPaymentDataJson = i49 % 128;
                                                                        i13 = i49 % 2 == 0 ? i2 ^ (i46 % 24794) : i2 ^ (i44 + 171);
                                                                    } else {
                                                                        i45 = i48 + 1;
                                                                        str9 = str10;
                                                                        i12 = i47;
                                                                        i44 = i46;
                                                                        str3 = str4;
                                                                        strArr16 = strArr3;
                                                                        length = i15;
                                                                        strArr14 = strArr2;
                                                                    }
                                                                }
                                                                i12++;
                                                                c2 = 0;
                                                            }
                                                            if (i13 == i2) {
                                                                java.lang.Object[] objArr129 = {new int[]{i2}, new int[]{i13}, null, null, new int[1]};
                                                                java.lang.Object[] objArr130 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-1558942098) | i2)) | 491904000) * (-366)) - 537309807) + (((~(i2 | (-1084883346))) | 17845248) * 366))};
                                                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj31 == null) {
                                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getMode(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                                    byte b45 = (byte) (-$$a[18]);
                                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                    b(b45, b45, (short) 653, objArr131);
                                                                    obj31 = cls31.getMethod((java.lang.String) objArr131[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                                }
                                                                ((int[]) objArr129[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr130)).intValue();
                                                                return objArr129;
                                                            }
                                                            try {
                                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                a(android.view.KeyEvent.getDeadChar(0, 0) + 1639, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 22947), 13 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr132);
                                                                java.lang.String intern40 = ((java.lang.String) objArr132[0]).intern();
                                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                a(1652 - android.graphics.Color.blue(0), (char) (android.os.Process.myTid() >> 22), 8 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr133);
                                                                intern = ((java.lang.String) objArr133[0]).intern();
                                                                file = new java.io.File(intern40);
                                                            } catch (java.lang.Exception unused2) {
                                                                i14 = i2 ^ 151;
                                                            }
                                                            if (file.exists() && file.isFile()) {
                                                                try {
                                                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file));
                                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                    a(308 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (58567 - android.widget.ExpandableListView.getPackedPositionChild(0L)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, objArr134);
                                                                    java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr134[0]).intern());
                                                                    next = useDelimiter2.hasNext() ? useDelimiter2.next() : str4;
                                                                    useDelimiter2.close();
                                                                } catch (java.io.IOException unused3) {
                                                                }
                                                                if (next.contains(intern)) {
                                                                    i14 = i2 ^ 150;
                                                                    if (i14 == i2) {
                                                                        java.lang.Object[] objArr135 = {new int[]{i2}, new int[]{i14}, null, null, new int[1]};
                                                                        java.lang.Object[] objArr136 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~(i2 | 1197895165)) | 852950932) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 784281945) + (((~(1197895165 | i27)) | 814780928) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj32 == null) {
                                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.os.Process.myPid() >> 22));
                                                                            byte b46 = (byte) (-$$a[18]);
                                                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                            b(b46, b46, (short) 653, objArr137);
                                                                            obj32 = cls32.getMethod((java.lang.String) objArr137[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                        }
                                                                        ((int[]) objArr135[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr136)).intValue();
                                                                        return objArr135;
                                                                    }
                                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                    a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1661, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 47 - android.view.View.MeasureSpec.getMode(0), objArr138);
                                                                    java.lang.Object[] objArr139 = {((java.lang.String) objArr138[0]).intern()};
                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj33 == null) {
                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 36, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33099));
                                                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                        b($$a[16], (byte) ($$b & 83), (short) 612, objArr140);
                                                                        obj33 = cls33.getMethod((java.lang.String) objArr140[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj33);
                                                                    }
                                                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).longValue();
                                                                    long j42 = ~longValue14;
                                                                    long j43 = ~(j | longValue14);
                                                                    long j44 = (971 * longValue14) + 1449335926374L + (((~((-747465666) | j42)) | j43) * (-970)) + ((~(longValue14 | 747465665)) * 1940) + (((~(747465665 | j42)) | j43) * 970) + 1742900569;
                                                                    int i50 = (((((int) (j44 >> 32)) & ((((((~(846444547 | i27)) | 2011296337) * (-865)) - 283289800) + ((~((-846444548) | i2)) * 865)) + (((~((-846444548) | i27)) | (~(2011296337 | i27))) * 865))) | (((int) j44) & (((((~((-293700870) | i2)) * 623) - 1713352294) + (((-2147221360) | i27) * (-623))) + ((((~((-501847910) | i2)) | 293700869) | (~((-1939074320) | i2))) * 623)))) * 263) ^ i2;
                                                                    if (i50 != i2) {
                                                                        java.lang.Object[] objArr141 = {new int[]{i2}, new int[]{i50}, null, null, new int[1]};
                                                                        java.lang.Object[] objArr142 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~(1524513375 | i27)) | 526332722) * (-328)) + 1557976253 + ((526332722 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i2 | (-1524513376))) | 442380818 | (~(1608465279 | i27))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj34 == null) {
                                                                            java.lang.String str11 = str4;
                                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.text.TextUtils.indexOf(str11, str11, 0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                                            byte b47 = (byte) (-$$a[18]);
                                                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                            b(b47, b47, (short) 653, objArr143);
                                                                            obj34 = cls34.getMethod((java.lang.String) objArr143[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                        }
                                                                        ((int[]) objArr141[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr142)).intValue();
                                                                        return objArr141;
                                                                    }
                                                                    java.lang.Object[] objArr144 = {new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                                                    int i51 = ~(1847905196 | i27);
                                                                    java.lang.Object[] objArr145 = {java.lang.Integer.valueOf(i4), num, java.lang.Integer.valueOf(((((((~((-202940902) | i27)) | 201359780) | (~(i27 | (-1847905197)))) | (~(1849486317 | i2))) * (-84)) - 1771740891) + (((~(i2 | (-1847905197))) | 202940901 | i51) * (-84)) + (((-1849486318) | i51) * 84))};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj35 == null) {
                                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                        byte b48 = (byte) (-$$a[18]);
                                                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                                        b(b48, b48, (short) 653, objArr146);
                                                                        obj35 = cls35.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                    }
                                                                    ((int[]) objArr144[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr145)).intValue();
                                                                    return objArr144;
                                                                }
                                                            }
                                                            int i52 = writeReplace + 91;
                                                            AlternateContactlessPaymentDataJson = i52 % 128;
                                                            if (i52 % 2 == 0) {
                                                                throw null;
                                                            }
                                                            i14 = i2;
                                                            if (i14 == i2) {
                                                            }
                                                        }
                                                    }
                                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                    a(android.view.View.MeasureSpec.getMode(0) + 310, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 23, objArr147);
                                                    java.lang.String intern41 = ((java.lang.String) objArr147[0]).intern();
                                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                    a(364 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (7145 - android.view.KeyEvent.getDeadChar(0, 0)), android.text.TextUtils.getTrimmedLength(str3) + 10, objArr148);
                                                    java.lang.String intern42 = ((java.lang.String) objArr148[0]).intern();
                                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                    a(375 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.KeyEvent.getDeadChar(0, 0) + 7, objArr149);
                                                    java.lang.String intern43 = ((java.lang.String) objArr149[0]).intern();
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    a(382 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 63820), 7 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr150);
                                                    java.lang.String[] strArr17 = {intern41, intern42, intern43, ((java.lang.String) objArr150[0]).intern()};
                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                    a(390 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 16 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr151);
                                                    java.lang.String intern44 = ((java.lang.String) objArr151[0]).intern();
                                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                    a(407 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 7 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr152);
                                                    java.lang.String intern45 = ((java.lang.String) objArr152[0]).intern();
                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                    a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.getOffsetBefore(str3, 0) + 7, objArr153);
                                                    java.lang.String intern46 = ((java.lang.String) objArr153[0]).intern();
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    a(420 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.os.Process.myTid() >> 22) + 3000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr154);
                                                    java.lang.String intern47 = ((java.lang.String) objArr154[0]).intern();
                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                    a(432 - android.text.TextUtils.getCapsMode(str3, 0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, objArr155);
                                                    java.lang.String[] strArr18 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr155[0]).intern()};
                                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 446, (char) (android.view.MotionEvent.axisFromString(str3) + 59138), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr156);
                                                    java.lang.String intern48 = ((java.lang.String) objArr156[0]).intern();
                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                    a(461 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (31508 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr157);
                                                    java.lang.String intern49 = ((java.lang.String) objArr157[0]).intern();
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 473, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22 - android.text.TextUtils.getOffsetAfter(str3, 0), objArr158);
                                                    java.lang.String intern50 = ((java.lang.String) objArr158[0]).intern();
                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                    a(495 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14615), android.view.Gravity.getAbsoluteGravity(0, 0) + 25, objArr159);
                                                    java.lang.String intern51 = ((java.lang.String) objArr159[0]).intern();
                                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                    a(520 - android.view.View.combineMeasuredStates(0, 0), (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 27 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr160);
                                                    java.lang.String[] strArr19 = {intern48, intern49, str, intern50, intern51, ((java.lang.String) objArr160[0]).intern()};
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    a(android.graphics.Color.red(0) + 548, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - android.text.TextUtils.getTrimmedLength(str3), objArr161);
                                                    java.lang.String intern52 = ((java.lang.String) objArr161[0]).intern();
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 559, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 7 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr162);
                                                    java.lang.String intern53 = ((java.lang.String) objArr162[0]).intern();
                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, (char) (56387 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 6 - android.text.TextUtils.indexOf(str3, str3), objArr163);
                                                    java.lang.String intern54 = ((java.lang.String) objArr163[0]).intern();
                                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 572, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 43669), android.text.TextUtils.indexOf(str3, str3) + 6, objArr164);
                                                    java.lang.String[] strArr20 = {intern52, intern53, intern54, ((java.lang.String) objArr164[0]).intern()};
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    a(579 - android.text.TextUtils.getTrimmedLength(str3), (char) (34607 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, objArr165);
                                                    java.lang.String intern55 = ((java.lang.String) objArr165[0]).intern();
                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                    a(android.os.Process.getGidForName(str3) + 415, (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, objArr166);
                                                    java.lang.String intern56 = ((java.lang.String) objArr166[0]).intern();
                                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 383, (char) (android.view.KeyEvent.normalizeMetaState(0) + 63820), 7 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr167);
                                                    java.lang.String[] strArr21 = {intern55, intern56, ((java.lang.String) objArr167[0]).intern()};
                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                    a(595 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, objArr168);
                                                    java.lang.String intern57 = ((java.lang.String) objArr168[0]).intern();
                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                    a(609 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (9757 - android.text.TextUtils.getOffsetBefore(str3, 0)), android.graphics.Color.blue(0) + 1, objArr169);
                                                    java.lang.String[] strArr22 = {intern57, ((java.lang.String) objArr169[0]).intern()};
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    a(609 - android.view.MotionEvent.axisFromString(str3), (char) (29251 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), android.graphics.Color.green(0) + 9, objArr170);
                                                    java.lang.String intern58 = ((java.lang.String) objArr170[0]).intern();
                                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                    a(619 - android.text.TextUtils.getOffsetAfter(str3, 0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47678), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr171);
                                                    java.lang.String[] strArr23 = {intern58, ((java.lang.String) objArr171[0]).intern()};
                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                    a(619 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (4298 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16 - android.view.KeyEvent.keyCodeFromString(str3), objArr172);
                                                    java.lang.String intern59 = ((java.lang.String) objArr172[0]).intern();
                                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                    a(461 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 31507), 3 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr173);
                                                    java.lang.String intern60 = ((java.lang.String) objArr173[0]).intern();
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    a((android.os.Process.myTid() >> 22) + 407, (char) ((-1) - android.view.MotionEvent.axisFromString(str3)), 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr174);
                                                    java.lang.String intern61 = ((java.lang.String) objArr174[0]).intern();
                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                    a(636 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (49523 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, objArr175);
                                                    java.lang.String intern62 = ((java.lang.String) objArr175[0]).intern();
                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                    a(421 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.getCapsMode(str3, 0, 0) + 3000), android.view.View.MeasureSpec.getMode(0) + 11, objArr176);
                                                    java.lang.String intern63 = ((java.lang.String) objArr176[0]).intern();
                                                    j = j8;
                                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 431, (char) android.text.TextUtils.indexOf(str3, str3, 0), android.text.TextUtils.getCapsMode(str3, 0, 0) + 14, objArr177);
                                                    java.lang.String[] strArr24 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr177[0]).intern()};
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 645, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, objArr178);
                                                    java.lang.String intern64 = ((java.lang.String) objArr178[0]).intern();
                                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                    a(664 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 52968), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 19, objArr179);
                                                    java.lang.String intern65 = ((java.lang.String) objArr179[0]).intern();
                                                    java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                    a(684 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (16736 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 31 - android.text.TextUtils.indexOf(str3, str3), objArr180);
                                                    java.lang.String intern66 = ((java.lang.String) objArr180[0]).intern();
                                                    java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 714, (char) (54163 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 26, objArr181);
                                                    java.lang.String intern67 = ((java.lang.String) objArr181[0]).intern();
                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                    a(740 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33484), android.text.TextUtils.getTrimmedLength(str3) + 23, objArr182);
                                                    java.lang.String intern68 = ((java.lang.String) objArr182[0]).intern();
                                                    java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                    a(763 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.os.Process.getGidForName(str3) + 1), 32 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr183);
                                                    java.lang.String[] strArr25 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr183[0]).intern(), str};
                                                    java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                    a(android.os.Process.getGidForName(str3) + 797, (char) android.graphics.Color.red(0), 13 - android.graphics.Color.alpha(0), objArr184);
                                                    java.lang.String intern69 = ((java.lang.String) objArr184[0]).intern();
                                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                    a(android.graphics.Color.rgb(0, 0, 0) + 16777591, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr185);
                                                    java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr185[0]).intern()};
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 809, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4205), 30 - android.text.TextUtils.getCapsMode(str3, 0, 0), objArr186);
                                                    java.lang.String intern70 = ((java.lang.String) objArr186[0]).intern();
                                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 838, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5607), 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr187);
                                                    java.lang.String[] strArr27 = {intern70, ((java.lang.String) objArr187[0]).intern()};
                                                    java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                    a(849 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (36390 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, objArr188);
                                                    java.lang.String intern71 = ((java.lang.String) objArr188[0]).intern();
                                                    java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                    a(870 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19266), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr189);
                                                    java.lang.String[] strArr28 = {intern71, ((java.lang.String) objArr189[0]).intern()};
                                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                    a(875 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0), 'C' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr190);
                                                    java.lang.String[] strArr29 = {((java.lang.String) objArr190[0]).intern()};
                                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                    a(android.view.View.getDefaultSize(0, 0) + 893, (char) (37988 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 16 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr191);
                                                    java.lang.String[] strArr30 = {((java.lang.String) objArr191[0]).intern()};
                                                    java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 909, (char) (android.view.KeyEvent.normalizeMetaState(0) + 18957), 19 - android.view.KeyEvent.keyCodeFromString(str3), objArr192);
                                                    java.lang.String[] strArr31 = {((java.lang.String) objArr192[0]).intern()};
                                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                    a(android.view.KeyEvent.getDeadChar(0, 0) + com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, (char) android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.getOffsetBefore(str3, 0) + 19, objArr193);
                                                    java.lang.String[] strArr32 = {((java.lang.String) objArr193[0]).intern()};
                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str3, str3, 0, 0) + 947, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, objArr194);
                                                    java.lang.String[] strArr33 = {((java.lang.String) objArr194[0]).intern()};
                                                    java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                    a((android.os.Process.myPid() >> 22) + 970, (char) (28351 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, objArr195);
                                                    java.lang.String[] strArr34 = {((java.lang.String) objArr195[0]).intern()};
                                                    java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                    a(991 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, objArr196);
                                                    java.lang.String str12 = str;
                                                    java.lang.String[] strArr35 = {((java.lang.String) objArr196[0]).intern(), str12};
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1016, (char) (248 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.View.resolveSize(0, 0) + 28, objArr197);
                                                    java.lang.String[] strArr36 = {((java.lang.String) objArr197[0]).intern(), str12};
                                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                    a(1043 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 56520), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, objArr198);
                                                    java.lang.String[] strArr37 = {((java.lang.String) objArr198[0]).intern(), str12};
                                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                    a(1070 - (android.os.Process.myPid() >> 22), (char) (431 - (android.os.Process.myPid() >> 22)), 31 - android.view.View.MeasureSpec.getMode(0), objArr199);
                                                    java.lang.String[] strArr38 = {((java.lang.String) objArr199[0]).intern(), str12};
                                                    java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                    a(1101 - android.view.View.resolveSize(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 27, objArr200);
                                                    java.lang.String[] strArr39 = {((java.lang.String) objArr200[0]).intern(), str12};
                                                    java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1127, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 32 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr201);
                                                    java.lang.String[][] strArr40 = {strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new java.lang.String[]{((java.lang.String) objArr201[0]).intern(), str12}};
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    int i53 = i2;
                                                    int i54 = 0;
                                                    int i55 = 0;
                                                    while (i54 < 24) {
                                                        java.lang.String[] strArr41 = strArr40[i54];
                                                        java.lang.Object[] objArr202 = {strArr41[0]};
                                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj36 == null) {
                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, 1920 - android.os.Process.getGidForName(str3), (char) android.text.TextUtils.indexOf(str3, str3, 0, 0));
                                                            byte b49 = (byte) ($$a[16] - 1);
                                                            byte b50 = b49;
                                                            strArr = strArr40;
                                                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                            b(b49, b50, b50, objArr203);
                                                            obj36 = cls36.getMethod((java.lang.String) objArr203[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj36);
                                                        } else {
                                                            strArr = strArr40;
                                                        }
                                                        java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj36).invoke(null, objArr202);
                                                        java.lang.String[] strArr42 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                                        if (str13 != null && str13.length() != 0) {
                                                            int i56 = writeReplace;
                                                            int i57 = i56 + 31;
                                                            AlternateContactlessPaymentDataJson = i57 % 128;
                                                            int length2 = strArr41.length;
                                                            if (i57 % 2 != 0 ? length2 != 1 : length2 != 0) {
                                                                AlternateContactlessPaymentDataJson = (i56 + 5) % 128;
                                                                for (java.lang.String str14 : strArr42) {
                                                                    if (!str13.contains(str14)) {
                                                                    }
                                                                }
                                                            }
                                                            i55++;
                                                            i53 = i2 ^ (i54 + 10);
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            sb.append(str13);
                                                            java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                            a(1160 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (15460 - android.text.TextUtils.indexOf(str3, str3, 0, 0)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr204);
                                                            sb.append(((java.lang.String) objArr204[0]).intern());
                                                            sb.append(str13);
                                                            arrayList.add(sb.toString());
                                                            break;
                                                        }
                                                        i54++;
                                                        strArr40 = strArr;
                                                    }
                                                    java.lang.Object[] objArr205 = new java.lang.Object[5];
                                                    if (i55 > 2) {
                                                        objArr205[0] = new int[]{i2};
                                                        objArr205[1] = new int[]{i53};
                                                        objArr205[4] = new int[1];
                                                        objArr205[2] = arrayList;
                                                        objArr205[3] = null;
                                                        java.lang.Object[] objArr206 = {num, num, java.lang.Integer.valueOf((((((~((-602451224) | i2)) | 37781522) * 1504) + 1707840417) + ((~((-564669702) | i2)) * (-1504))) - 645828560)};
                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj37 == null) {
                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            byte b51 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                            b(b51, b51, (short) 653, objArr207);
                                                            obj37 = cls37.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                        }
                                                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr206)).intValue();
                                                        c = 0;
                                                        ((int[]) objArr205[4])[0] = intValue;
                                                    } else {
                                                        objArr205[0] = new int[]{i2};
                                                        objArr205[1] = new int[]{i2};
                                                        objArr205[4] = new int[1];
                                                        objArr205[2] = null;
                                                        objArr205[3] = null;
                                                        java.lang.Object[] objArr208 = {num, num, java.lang.Integer.valueOf((((1845324653 | i27) * (-369)) - 1396155502) + (((~((-745816934) | i27)) | 1305029164) * (-369)) + (((~(745816933 | i2)) | 1099507720 | (~((-540295490) | i27))) * 369))};
                                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj38 == null) {
                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.graphics.Color.alpha(0) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            byte b52 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                            b(b52, b52, (short) 653, objArr209);
                                                            obj38 = cls38.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                        }
                                                        int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr208)).intValue();
                                                        c = 0;
                                                        ((int[]) objArr205[4])[0] = intValue2;
                                                    }
                                                    int i58 = ((int[]) objArr205[1])[c];
                                                    if (i58 != i2) {
                                                        int[] iArr = new int[1];
                                                        int[] iArr2 = new int[1];
                                                        java.util.List list = (java.util.List) objArr205[2];
                                                        iArr[c] = i2;
                                                        iArr2[c] = i58;
                                                        java.lang.Object[] objArr210 = {iArr, iArr2, list, null, new int[1]};
                                                        java.lang.Object[] objArr211 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((((~(1112561344 | i27)) | (-2013091538)) | (~((-37754561) | i2))) * 717) - 129181048) + (((~(i2 | 1112561344)) | (~((-37754561) | i27)) | (-2013091538)) * 717))};
                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj39 == null) {
                                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str3, str3, 0, 0), android.view.KeyEvent.keyCodeFromString(str3) + 2713, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                            byte b53 = (byte) (-$$a[18]);
                                                            java.lang.Object[] objArr212 = new java.lang.Object[1];
                                                            b(b53, b53, (short) 653, objArr212);
                                                            obj39 = cls39.getMethod((java.lang.String) objArr212[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                        }
                                                        ((int[]) objArr210[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr211)).intValue();
                                                        return objArr210;
                                                    }
                                                    java.lang.Object[] objArr842 = new java.lang.Object[1];
                                                    a(android.view.MotionEvent.axisFromString(str3) + 447, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 59137), 16 - android.graphics.Color.blue(0), objArr842);
                                                    java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj == null) {
                                                    }
                                                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr852);
                                                    if (invoke != null) {
                                                    }
                                                    if (i11 != 1986687685) {
                                                        AlternateContactlessPaymentDataJson = (writeReplace + 17) % 128;
                                                        java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                        a(1161 - android.view.KeyEvent.getDeadChar(0, 0), (char) (6153 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr892);
                                                        java.lang.String intern162 = ((java.lang.String) objArr892[0]).intern();
                                                        java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1175, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 27, objArr902);
                                                        java.lang.String intern172 = ((java.lang.String) objArr902[0]).intern();
                                                        java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                        a(android.view.View.MeasureSpec.getSize(0) + 1201, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr912);
                                                        java.lang.String intern182 = ((java.lang.String) objArr912[0]).intern();
                                                        java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1218, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 17, objArr922);
                                                        java.lang.String intern192 = ((java.lang.String) objArr922[0]).intern();
                                                        java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                        a(1236 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18557), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 15, objArr932);
                                                        java.lang.String intern202 = ((java.lang.String) objArr932[0]).intern();
                                                        java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                        a(1250 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.Gravity.getAbsoluteGravity(0, 0) + 37, objArr942);
                                                        java.lang.String intern212 = ((java.lang.String) objArr942[0]).intern();
                                                        java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                        a(1287 - (android.os.Process.myTid() >> 22), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr952);
                                                        java.lang.String intern222 = ((java.lang.String) objArr952[0]).intern();
                                                        java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                        a(1300 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6601), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, objArr962);
                                                        java.lang.String intern232 = ((java.lang.String) objArr962[0]).intern();
                                                        java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                        a(android.view.MotionEvent.axisFromString(str3) + 1313, (char) (48961 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 22 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr972);
                                                        java.lang.String intern242 = ((java.lang.String) objArr972[0]).intern();
                                                        java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                        a(1334 - android.graphics.Color.alpha(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 31 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr982);
                                                        java.lang.String intern252 = ((java.lang.String) objArr982[0]).intern();
                                                        java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str3, str3) + 1365, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11282), 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr992);
                                                        java.lang.String intern262 = ((java.lang.String) objArr992[0]).intern();
                                                        java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1377, (char) (41701 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr1002);
                                                        java.lang.String intern272 = ((java.lang.String) objArr1002[0]).intern();
                                                        java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                        a(1389 - android.text.TextUtils.getOffsetBefore(str3, 0), (char) (60649 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.os.Process.myPid() >> 22) + 12, objArr1012);
                                                        java.lang.String intern282 = ((java.lang.String) objArr1012[0]).intern();
                                                        java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                        a(1401 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (33699 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr1022);
                                                        java.lang.String intern292 = ((java.lang.String) objArr1022[0]).intern();
                                                        java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                        a(1412 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (15513 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 12, objArr1032);
                                                        java.lang.String intern302 = ((java.lang.String) objArr1032[0]).intern();
                                                        java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                        a(1425 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - android.graphics.Color.argb(0, 0, 0, 0), objArr1042);
                                                        java.lang.String intern312 = ((java.lang.String) objArr1042[0]).intern();
                                                        java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1439, (char) (android.graphics.Color.rgb(0, 0, 0) + 16806177), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr1052);
                                                        java.lang.String intern322 = ((java.lang.String) objArr1052[0]).intern();
                                                        java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                                        a(android.view.View.MeasureSpec.getSize(0) + 1451, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.keyCodeFromString(str3) + 24, objArr1062);
                                                        java.lang.String intern332 = ((java.lang.String) objArr1062[0]).intern();
                                                        java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1475, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 28 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr1072);
                                                        java.lang.String[] strArr82 = {intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, ((java.lang.String) objArr1072[0]).intern()};
                                                        i16 = 0;
                                                        while (i16 < 19) {
                                                        }
                                                        i17 = -1;
                                                        if (i17 >= 0) {
                                                        }
                                                    }
                                                    java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionType(0L) + 1503, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0), 12 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr1162);
                                                    java.lang.String intern342 = ((java.lang.String) objArr1162[0]).intern();
                                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                    a(1516 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), 5 - android.view.View.MeasureSpec.getMode(0), objArr1172);
                                                    java.lang.String[] strArr102 = {intern342, ((java.lang.String) objArr1172[0]).intern()};
                                                    java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                    a(1521 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 14 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr1182);
                                                    java.lang.String intern352 = ((java.lang.String) objArr1182[0]).intern();
                                                    java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                    a(android.view.View.getDefaultSize(0, 0) + 1536, (char) (android.text.TextUtils.getTrimmedLength(str3) + 16428), 19 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr1192);
                                                    java.lang.String intern362 = ((java.lang.String) objArr1192[0]).intern();
                                                    java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                                    a(1555 - android.text.TextUtils.indexOf(str3, str3, 0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 14 - android.text.TextUtils.getOffsetAfter(str3, 0), objArr1202);
                                                    java.lang.String[] strArr112 = {intern352, intern362, ((java.lang.String) objArr1202[0]).intern()};
                                                    java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                                    a(1569 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777195) - android.graphics.Color.rgb(0, 0, 0), objArr1212);
                                                    java.lang.String intern372 = ((java.lang.String) objArr1212[0]).intern();
                                                    java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1590, (char) (12744 - android.text.TextUtils.getCapsMode(str3, 0, 0)), 10 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr1222);
                                                    java.lang.String[] strArr122 = {intern372, ((java.lang.String) objArr1222[0]).intern()};
                                                    java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                                    a(1600 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (25948 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1232);
                                                    java.lang.String intern382 = ((java.lang.String) objArr1232[0]).intern();
                                                    java.lang.Object[] objArr1242 = new java.lang.Object[1];
                                                    a(337 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 6 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr1242);
                                                    c2 = 0;
                                                    java.lang.String[] strArr132 = {intern382, ((java.lang.String) objArr1242[0]).intern()};
                                                    java.lang.Object[] objArr1252 = new java.lang.Object[1];
                                                    a(1611 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.text.TextUtils.getCapsMode(str3, 0, 0), 28 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr1252);
                                                    java.lang.String intern392 = ((java.lang.String) objArr1252[0]).intern();
                                                    java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                                    a((android.os.Process.myPid() >> 22) + 1590, (char) (android.view.View.getDefaultSize(0, 0) + 12744), 10 - android.graphics.Color.green(0), objArr1262);
                                                    java.lang.String[][] strArr142 = {strArr102, strArr112, strArr122, strArr132, new java.lang.String[]{intern392, ((java.lang.String) objArr1262[0]).intern()}};
                                                    int i442 = -1;
                                                    i12 = 0;
                                                    while (true) {
                                                        if (i12 < 5) {
                                                        }
                                                        i12++;
                                                        c2 = 0;
                                                    }
                                                    if (i13 == i2) {
                                                    }
                                                }
                                            }
                                            i9 = i2;
                                            if (i9 == i2) {
                                            }
                                        }
                                    }
                                    i8 = i2;
                                    if (i8 == i2) {
                                    }
                                }

                                static void init$0() {
                                    $$a = new byte[]{45, -88, -122, 76, com.google.common.base.Ascii.SI, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
                                    $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
                                }
                            };
                        }
                        com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson cardTrackConstructionDataJson2 = cardContactlessPaymentDataJson.track1ConstructionData;
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public com.payair.hce.setErrorName getTrack2ConstructionData() {
                        final com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson cardTrackConstructionDataJson = cardContactlessPaymentDataJson.track2ConstructionData;
                        if (cardTrackConstructionDataJson != null) {
                            return new com.payair.hce.setErrorName() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.2.4
                                private static int DigitizedCardProfile = 0;
                                private static int writeReplace = 1;

                                @Override // com.payair.hce.setErrorName
                                public byte[] getPCvc3() {
                                    writeReplace = (DigitizedCardProfile + 33) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.pCvc3);
                                    int i = writeReplace;
                                    int i2 = (i & (-44)) | ((~i) & 43);
                                    int i3 = -(-((i & 43) << 1));
                                    DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                                    return writeReplace2;
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getPUnAtc() {
                                    int i = writeReplace;
                                    DigitizedCardProfile = (((i & 12) + (i | 12)) - 1) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.pUnAtc);
                                    int i2 = DigitizedCardProfile + 102;
                                    int i3 = (~i2) + (i2 << 1);
                                    writeReplace = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getNAtc() {
                                    int i = DigitizedCardProfile;
                                    int i2 = i & 113;
                                    int i3 = ((i ^ 113) | i2) << 1;
                                    int i4 = -((i | 113) & (~i2));
                                    writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardTrackConstructionDataJson.nAtc);
                                    int i5 = writeReplace;
                                    int i6 = (i5 ^ 48) + ((i5 & 48) << 1);
                                    DigitizedCardProfile = ((~i6) + (i6 << 1)) % 128;
                                    return writeReplace2;
                                }

                                @Override // com.payair.hce.setErrorName
                                public byte[] getTrackData() {
                                    int i = DigitizedCardProfile;
                                    int i2 = i & 35;
                                    int i3 = (i ^ 35) | i2;
                                    int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                                    writeReplace = i4 % 128;
                                    int i5 = i4 % 2;
                                    java.lang.String str = cardTrackConstructionDataJson.trackData;
                                    if (i5 == 0) {
                                        com.payair.hce.stopService.writeReplace(str);
                                        throw null;
                                    }
                                    byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(str);
                                    int i6 = DigitizedCardProfile;
                                    int i7 = ((i6 ^ 76) + ((i6 & 76) << 1)) - 1;
                                    writeReplace = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        return writeReplace2;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }
                            };
                        }
                        int i = DigitizedCardProfile;
                        values = (i + 83) % 128;
                        int i2 = i + 21;
                        values = i2 % 128;
                        if (i2 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getCiacDecline() {
                        DigitizedCardProfile = (values + 91) % 128;
                        if (cardContactlessPaymentDataJson.ciacDecline == null) {
                            return null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.ciacDecline);
                        int i = DigitizedCardProfile + 1;
                        values = i % 128;
                        if (i % 2 == 0) {
                            return writeReplace2;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getCiacDeclineOnPpms() {
                        int i = DigitizedCardProfile + 59;
                        values = i % 128;
                        if (i % 2 != 0) {
                            java.lang.String str = cardContactlessPaymentDataJson.ciacDeclineOnPpms;
                            throw null;
                        }
                        if (cardContactlessPaymentDataJson.ciacDeclineOnPpms == null) {
                            return null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.ciacDeclineOnPpms);
                        DigitizedCardProfile = (values + 49) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public byte[] getCvrMaskAnd() {
                        int i = values + 91;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 == 0) {
                            java.lang.String str = cardContactlessPaymentDataJson.cvrMaskAnd;
                            throw new java.lang.ArithmeticException();
                        }
                        if (cardContactlessPaymentDataJson.cvrMaskAnd == null) {
                            return null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(cardContactlessPaymentDataJson.cvrMaskAnd);
                        int i2 = values + 3;
                        DigitizedCardProfile = i2 % 128;
                        if (i2 % 2 != 0) {
                            return writeReplace2;
                        }
                        throw null;
                    }

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        values = 0;
                        DigitizedCardProfile = 1;
                        writeReplace = 1263759066225628708L;
                        AlternateContactlessPaymentDataJson = -804334044;
                        valueOf = (char) 37403;
                    }

                    static void init$0() {
                        $$a = new byte[]{8, -42, 1, 71};
                        $$b = 114;
                    }
                };
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
                return jsonResponse;
            }

            @Override // com.payair.hce.checkForSuccess
            public com.payair.hce.getStatusCode getDsrpData() {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 29) % 128;
                if (digitizedCardJson.dsrpData == null) {
                    return null;
                }
                com.payair.hce.getStatusCode getstatuscode = new com.payair.hce.getStatusCode() { // from class: com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson.1.3
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static final byte[] $$d = null;
                    private static final int $$e = 0;
                    private static int $10;
                    private static int $11;
                    private static int AlternateContactlessPaymentDataJson;
                    private static int DigitizedCardProfile;
                    private static long valueOf;
                    private static int[] writeReplace;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
                        int i2;
                        int i3;
                        int i4 = (s * 3) + 35;
                        byte[] bArr2 = $$a;
                        int i5 = 4 - (i * 3);
                        int i6 = (b * 3) + 65;
                        byte[] bArr3 = new byte[i4];
                        if (bArr2 == null) {
                            int i7 = i5;
                            i3 = 0;
                            i5++;
                            i6 = (i7 + (-i6)) - 2;
                            i2 = i3;
                            int i8 = i5;
                            int i9 = i6;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i9;
                            if (i3 == i4) {
                                objArr[0] = new java.lang.String(bArr3, 0);
                                return;
                            }
                            i5 = i8;
                            i6 = bArr2[i8];
                            i7 = i9;
                            i5++;
                            i6 = (i7 + (-i6)) - 2;
                            i2 = i3;
                            int i82 = i5;
                            int i92 = i6;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i92;
                            if (i3 == i4) {
                            }
                        } else {
                            i2 = 0;
                            int i822 = i5;
                            int i922 = i6;
                            i3 = i2 + 1;
                            bArr3[i2] = (byte) i922;
                            if (i3 == i4) {
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void d(byte b, byte b2, short s, java.lang.Object[] objArr) {
                        int i;
                        int i2;
                        int i3 = 3 - (b * 4);
                        int i4 = s + 66;
                        int i5 = b2 * 2;
                        byte[] bArr2 = $$d;
                        byte[] bArr3 = new byte[1 - i5];
                        int i6 = -1;
                        if (bArr2 == null) {
                            int i7 = -1;
                            int i8 = i3;
                            i3 += -i4;
                            i = i8;
                            i6 = i7;
                            i2 = i6 + 1;
                            bArr3[i2] = (byte) i3;
                            if (i2 == 0 - i5) {
                                objArr[0] = new java.lang.String(bArr3, 0);
                                return;
                            }
                            int i9 = i + 1;
                            i8 = i9;
                            i4 = bArr2[i9];
                            i7 = i2;
                            i3 += -i4;
                            i = i8;
                            i6 = i7;
                            i2 = i6 + 1;
                            bArr3[i2] = (byte) i3;
                            if (i2 == 0 - i5) {
                            }
                        } else {
                            i = i3;
                            i3 = i4;
                            i2 = i6 + 1;
                            bArr3[i2] = (byte) i3;
                            if (i2 == 0 - i5) {
                            }
                        }
                    }

                    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
                        char[] cArr;
                        int i2 = $10;
                        $11 = (i2 + 59) % 128;
                        if (str != null) {
                            int i3 = i2 + 105;
                            $11 = i3 % 128;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            cArr = str.toCharArray();
                        } else {
                            cArr = str;
                        }
                        char[] cArr2 = cArr;
                        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
                        getdsrpdata.values = i;
                        int length = cArr2.length;
                        long[] jArr = new long[length];
                        getdsrpdata.valueOf = 0;
                        while (getdsrpdata.valueOf < cArr2.length) {
                            int i4 = getdsrpdata.valueOf;
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1890 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3600));
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    d((byte) 0, (byte) 0, (short) 47, objArr3);
                                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                                }
                                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                if (obj2 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 64, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1395, (char) (29682 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    d((byte) 0, (byte) 0, (short) 46, objArr5);
                                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
                        char[] cArr3 = new char[length];
                        getdsrpdata.valueOf = 0;
                        while (getdsrpdata.valueOf < cArr2.length) {
                            $11 = ($10 + 13) % 128;
                            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63, 1444 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (29682 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                d((byte) 0, (byte) 0, (short) 46, objArr7);
                                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                        }
                        objArr[0] = new java.lang.String(cArr3);
                    }

                    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
                        int[] iArr2;
                        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length * 2];
                        int[] iArr3 = writeReplace;
                        float f = 0.0f;
                        int i2 = 16;
                        int i3 = 1;
                        int i4 = 0;
                        if (iArr3 != null) {
                            int length = iArr3.length;
                            int[] iArr4 = new int[length];
                            $10 = ($11 + 11) % 128;
                            int i5 = 0;
                            while (i5 < length) {
                                try {
                                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                                    objArr2[0] = java.lang.Integer.valueOf(iArr3[i5]);
                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                                    if (obj == null) {
                                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.KeyEvent.getMaxKeyCode() >> i2), 29 - (android.util.TypedValue.complexToFloat(0) > f ? 1 : (android.util.TypedValue.complexToFloat(0) == f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("z", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                                    }
                                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                                    i5++;
                                    f = 0.0f;
                                    i2 = 16;
                                    i3 = 1;
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
                            $10 = ($11 + 33) % 128;
                            int length3 = iArr6.length;
                            int[] iArr7 = new int[length3];
                            int i6 = 0;
                            while (i6 < length3) {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i6])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                                if (obj2 == null) {
                                    iArr2 = iArr6;
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, 29 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                                } else {
                                    iArr2 = iArr6;
                                }
                                iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                                i6++;
                                iArr6 = iArr2;
                                i4 = 0;
                            }
                            iArr6 = iArr7;
                        }
                        int i7 = i4;
                        java.lang.System.arraycopy(iArr6, i7, iArr5, i7, length2);
                        istransitsupported.valueOf = i7;
                        while (istransitsupported.valueOf < iArr.length) {
                            cArr[i7] = (char) (iArr[istransitsupported.valueOf] >> 16);
                            cArr[1] = (char) iArr[istransitsupported.valueOf];
                            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                            istransitsupported.values = (cArr[2] << 16) + cArr[3];
                            com.payair.hce.isTransitSupported.values(iArr5);
                            int i8 = 0;
                            for (int i9 = 16; i8 < i9; i9 = 16) {
                                int i10 = $11 + 49;
                                $10 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5088 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                                    istransitsupported.values = intValue;
                                    i8 += com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                } else {
                                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                                    if (obj4 == null) {
                                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5089, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                                    }
                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                                    istransitsupported.values = intValue2;
                                    i8++;
                                }
                            }
                            int i11 = istransitsupported.DigitizedCardProfile;
                            istransitsupported.DigitizedCardProfile = istransitsupported.values;
                            istransitsupported.values = i11;
                            istransitsupported.values ^= iArr5[16];
                            istransitsupported.DigitizedCardProfile ^= iArr5[17];
                            int i12 = istransitsupported.DigitizedCardProfile;
                            int i13 = istransitsupported.values;
                            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                            cArr[2] = (char) (istransitsupported.values >>> 16);
                            cArr[3] = (char) istransitsupported.values;
                            com.payair.hce.isTransitSupported.values(iArr5);
                            cArr2[istransitsupported.valueOf * 2] = cArr[0];
                            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                            if (obj5 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2922, (char) (3037 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                d((byte) 0, (byte) 0, (short) 0, objArr7);
                                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
                            }
                            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
                            i7 = 0;
                        }
                        objArr[0] = new java.lang.String(cArr2, 0, i);
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getAip() {
                        int i = DigitizedCardProfile + 13;
                        AlternateContactlessPaymentDataJson = i % 128;
                        if (i % 2 == 0) {
                            com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.aip);
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.aip);
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 29) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getExpiryDate() {
                        int i = DigitizedCardProfile + 7;
                        AlternateContactlessPaymentDataJson = i % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.expiryDate);
                        if (i % 2 != 0) {
                            return writeReplace2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getPanSequenceNumber() {
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 17) % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.panSequenceNumber);
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 67) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getTrack2EquivalentData() {
                        int i = AlternateContactlessPaymentDataJson + 15;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 != 0) {
                            com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.track2EquivalentData);
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.track2EquivalentData);
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 37) % 128;
                        return writeReplace2;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getIssuerApplicationData() {
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 35) % 128;
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.issuerApplicationData);
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 101) % 128;
                        return writeReplace2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
                    
                        if (r0.equals(((java.lang.String) r2[0]).intern()) != false) goto L19;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
                    
                        r5 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
                    
                        if ((r0 % 2) != 0) goto L19;
                     */
                    @Override // com.payair.hce.getStatusCode
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public com.payair.hce.gotDeleteData getCvmModel() {
                        if (digitizedCardJson.dsrpData.cvmModel != null) {
                            java.lang.String str = digitizedCardJson.dsrpData.cvmModel;
                            int hashCode = str.hashCode();
                            char c = 0;
                            if (hashCode == -1724098714) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                a("彊∛ꗽ⢴ꨚⷚ낲㈇뗔", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 32083, objArr);
                                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                    int i = DigitizedCardProfile + 115;
                                    AlternateContactlessPaymentDataJson = i % 128;
                                    c = i % 2 == 0 ? (char) 5 : (char) 2;
                                }
                                c = 65535;
                            } else if (hashCode != -1579111723) {
                                if (hashCode == 1953740997) {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    b(new int[]{-1029101828, 1607017048, -2146548180, -1922903055, 966631874, 2113094207, 489966842, -2112274209}, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, objArr2);
                                }
                                c = 65535;
                            } else {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a("彊蝢\uef14ퟒ㿸枽乒똌鸦웯⺆ᕟ", android.widget.ExpandableListView.getPackedPositionType(0L) + 55343, objArr3);
                                if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                    int i2 = AlternateContactlessPaymentDataJson + 75;
                                    DigitizedCardProfile = i2 % 128;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                return com.payair.hce.gotDeleteData.valueOf;
                            }
                            if (c != 1) {
                                return c != 2 ? com.payair.hce.gotDeleteData.values : com.payair.hce.gotDeleteData.DigitizedCardProfile;
                            }
                            return com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson;
                        }
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 75) % 128;
                        return com.payair.hce.gotDeleteData.valueOf;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 25) % 128;
                        if (digitizedCardJson.dsrpData.umdGeneration == null) {
                            return com.payair.hce.setSendAuthenticationHeader.writeReplace;
                        }
                        java.lang.String str = digitizedCardJson.dsrpData.umdGeneration;
                        int hashCode = str.hashCode();
                        if (hashCode == 366664857) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            b(new int[]{1371523065, -1606271285, 1722103452, 1444931604, -798894795, -661612106, -1542123557, 582470165, 366758144, 1527178192, 246493998, -1782364090, 2056026239, -2017037513}, (android.os.Process.myPid() >> 22) + 27, objArr);
                            if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 3) % 128;
                                return com.payair.hce.setSendAuthenticationHeader.values;
                            }
                        } else if (hashCode == 1118204426) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a("彈\uf63aචꌵ窱အꞬﴷᒴꨰ솺ᜮ꺼쐮ᮾ넧좫ḧ떩쬠抪렯쾼攵벬툪", 43391 - android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                            if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                return com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile;
                            }
                        } else if (hashCode == 1555809199) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(new int[]{-2034322983, -328474293, 1596494937, 1148205851, -2105748892, -1532575842, 1814250350, -1359762848, -76487924, 1343702022, 1659964946, 2002165789, -190639328, -853098077}, 25 - android.view.View.resolveSize(0, 0), objArr3);
                            if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 83) % 128;
                                return com.payair.hce.setSendAuthenticationHeader.writeReplace;
                            }
                        }
                        return com.payair.hce.setSendAuthenticationHeader.values;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public com.payair.hce.gotPutData getUcafVersion() {
                        int i = AlternateContactlessPaymentDataJson + 59;
                        DigitizedCardProfile = i % 128;
                        if (i % 2 == 0) {
                            if (digitizedCardJson.dsrpData.ucafVersion == null) {
                                return com.payair.hce.gotPutData.valueOf;
                            }
                            java.lang.String str = digitizedCardJson.dsrpData.ucafVersion;
                            int hashCode = str.hashCode();
                            if (hashCode == 2714) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                b(new int[]{-1891019023, 100789981}, 2 - android.text.TextUtils.getTrimmedLength(""), objArr);
                                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                                    return com.payair.hce.gotPutData.valueOf;
                                }
                            } else if (hashCode == 480298015) {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                b(new int[]{1606688338, -1065570718, -2032165400, -553508565}, android.graphics.ImageFormat.getBitsPerPixel(0) + 8, objArr2);
                                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                                    AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 61) % 128;
                                    return com.payair.hce.gotPutData.AlternateContactlessPaymentDataJson;
                                }
                            }
                            return com.payair.hce.gotPutData.valueOf;
                        }
                        java.lang.String str2 = digitizedCardJson.dsrpData.ucafVersion;
                        throw null;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getPar() {
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 97) % 128;
                        if (digitizedCardJson.dsrpData.par == null) {
                            return null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.par);
                        int i = DigitizedCardProfile + 105;
                        AlternateContactlessPaymentDataJson = i % 128;
                        if (i % 2 != 0) {
                            return writeReplace2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getCiacDecline() {
                        int i = DigitizedCardProfile + 47;
                        AlternateContactlessPaymentDataJson = i % 128;
                        if (i % 2 != 0) {
                            if (digitizedCardJson.dsrpData.ciacDecline == null) {
                                int i2 = DigitizedCardProfile + 73;
                                AlternateContactlessPaymentDataJson = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                            return com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.ciacDecline);
                        }
                        java.lang.String str = digitizedCardJson.dsrpData.ciacDecline;
                        throw null;
                    }

                    @Override // com.payair.hce.getStatusCode
                    public byte[] getCvrMaskAnd() {
                        if (digitizedCardJson.dsrpData.cvrMaskAnd == null) {
                            int i = AlternateContactlessPaymentDataJson + 37;
                            DigitizedCardProfile = i % 128;
                            if (i % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }
                        byte[] writeReplace2 = com.payair.hce.stopService.writeReplace(digitizedCardJson.dsrpData.cvrMaskAnd);
                        int i2 = DigitizedCardProfile + 43;
                        AlternateContactlessPaymentDataJson = i2 % 128;
                        if (i2 % 2 != 0) {
                            return writeReplace2;
                        }
                        throw null;
                    }

                    static {
                        init$1();
                        $10 = 0;
                        $11 = 1;
                        init$0();
                        DigitizedCardProfile = 0;
                        AlternateContactlessPaymentDataJson = 1;
                        valueOf = 8622044757295311233L;
                        writeReplace = new int[]{-1844863177, 809905942, 1308669343, 51195469, -1637850352, -363387440, -969900250, 996648915, -222792015, 1039397783, 1935581540, -42257614, 560926868, 1224677806, 1370823646, -438449476, -1732911290, -1401279239};
                    }

                    static void init$1() {
                        $$d = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43};
                        $$e = 31;
                    }

                    static void init$0() {
                        $$a = new byte[]{82, -10, -24, -99, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                        $$b = 20;
                    }

                    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
                        int i3;
                        java.lang.Object[] objArr;
                        int i4 = 0;
                        int i5 = 1;
                        try {
                            if (context == null) {
                                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i | 1004273591)) | (~((~i) | (-197180435)))) * (-302)) + 1692809052 + ((~((-197180435) | i)) * (-604)) + (((~(i | 807093157)) | 806437764) * 302))};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                    byte b = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    c(b, b, b, objArr4);
                                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a("彣龻\uded9ᴑ尽鬸\udb88᪩姲頗흅ᙱ嚙闇풭ጵ剌酾톷ႎ伍蹳촛\u0dcc䳯诊쩒ॸ䠭袾쟁ۭ䔇葙썦Π䋄脚", android.view.View.MeasureSpec.getMode(0) + 49363, objArr5);
                                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr5[0]).intern()), 2);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a("彊嘘䶊䍕稛熶杁ỿᖘ\u0b3aʟ㡘⼘⚸\udc4e폿쫕쀉\uf79a\ued45\ue40b鮦酑裯뾈딪것ꉏ奐傟䙸", 2400 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
                                try {
                                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    a("彣龻\uded9ᴑ尽鬸\udb88᪩姲頗흅ᙱ嚙闇풭ጵ剌酾톷ႎ伍蹳촛\u0dcc䳯诊쩒ॸ䠭袾쟁ۭ䔇葙썦Π䋄脚", 49362 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr8);
                                    objArr[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    b(new int[]{-708921711, -2147408357, 2022771778, 512297885, -152877597, -545932546, 631754105, -901804867, -1013614327, 1369255961, -991734403, -2057617222, -1033041951, -1818806927, 706715582, 947195783}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, objArr9);
                                    try {
                                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        a("彣龻\uded9ᴑ尽鬸\udb88᪩姲頗흅ᙱ嚙闇풭ጵ剌酾톷ႎ伍蹳촛\u0dcc䳯诊쩒ॸ䠭袾쟁ۭ䔇葙썦Π䋄脚", android.text.TextUtils.getOffsetAfter("", 0) + 49363, objArr11);
                                        objArr[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
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
                            } catch (java.lang.Throwable unused) {
                                i3 = 1;
                            }
                            try {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b(new int[]{-836169887, -477744446, -1278319243, -1537507108, 2123889841, 378364518, -389314841, -171611209, -1632733063, -852286320, -269727739, -1297238842}, android.graphics.Color.blue(0) + 23, objArr12);
                                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b(new int[]{-1589701284, 1216702406, 1693947561, 985626644, -643271590, 700795357, -1890960061, -2012578848, -1795347395, 1007534268}, 18 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr13);
                                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                                try {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(new int[]{-836169887, -477744446, -1278319243, -1537507108, 2123889841, 378364518, -389314841, -171611209, -1632733063, -852286320, -269727739, -1297238842}, 23 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    a("彮\u0557\ueb0b凨㞄鱍䈀⣵躶獿\ud909뿡斠쮓", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23099, objArr15);
                                    try {
                                        java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a("彨\u0ace\uf43f往ূ\uf32d庛ࢸ\uf222嶗߽\uf13e岀۲\uf043寀ש\uef5d嫅Ӓ\uee5c妷Ϥ\ued47墶˭\uec6e垻ě\ueb4d嚠\u001b\uea5b", android.view.View.MeasureSpec.getSize(0) + 21929, objArr17);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        a("彮ﱝ\u191f뛊펬炟豄⤿䛦\ue3d5ª屼藍ᘛ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41777, objArr18);
                                        java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        b(new int[]{-836169887, -477744446, -1278319243, -1537507108, 2123889841, 378364518, -389314841, -171611209, 1146474987, 1550918570, 1693947561, 985626644, 877590582, -375003712, 570172805, -1400296187}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, objArr19);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        b(new int[]{1609638613, -510909078, 1572785806, 461199211, -1352652323, -1152684737}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr20);
                                        java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                        int length = objArr21.length;
                                        int i6 = 0;
                                        while (i6 < length) {
                                            java.lang.Object obj2 = objArr21[i6];
                                            java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                            a("彑\ue948㏢籴蚌", 46703 - android.view.Gravity.getAbsoluteGravity(i4, i4), objArr22);
                                            try {
                                                java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                                java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                                a("彣멗锁\uf0d5쯛╁\u0016ᯓ的偌ꬖ蛈\ue184ﬔ혘㇝ಋ晒䅉峧란酐\uec17쟉⊇㱇ᜌ狍䶙ꝏ舭鷉\uf88a퉢ⴸࣦ掬", 58687 - android.view.View.getDefaultSize(i4, i4), objArr24);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                                java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                                a("彮⠵뇏㥋舃ே鍫ᰇ\ue5af测\uf616", android.text.TextUtils.indexOf("", "", i4, i4) + 30553, objArr25);
                                                java.lang.String intern = ((java.lang.String) objArr25[i4]).intern();
                                                java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                                                clsArr[i4] = java.lang.String.class;
                                                java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                                try {
                                                    java.lang.Object[] objArr26 = new java.lang.Object[i5];
                                                    b(new int[]{-836169887, -477744446, -1278319243, -1537507108, 2123889841, 378364518, -389314841, -171611209, 1555970774, 1159358830, 969949370, -2088222171, 1420206626, -1399658488}, android.view.View.getDefaultSize(i4, i4) + 28, objArr26);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[i4]).intern());
                                                    java.lang.Object[] objArr27 = new java.lang.Object[i5];
                                                    a("彽뀍膝鄱\ue2d1\uf27b쏊풖␣㖫՞", android.view.MotionEvent.axisFromString("") + 61292, objArr27);
                                                    try {
                                                        java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[i4]).intern(), null).invoke(obj2, null))};
                                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                        a("彣멗锁\uf0d5쯛╁\u0016ᯓ的偌ꬖ蛈\ue184ﬔ혘㇝ಋ晒䅉峧란酐\uec17쟉⊇㱇ᜌ狍䶙ꝏ舭鷉\uf88a퉢ⴸࣦ掬", 58687 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr29);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[i4]).intern());
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        b(new int[]{-132607877, -197252872, 1415003252, -1253807243, -643168795, 634870577, 1826491371, -1978105169, 571313218, -685947207}, (android.util.TypedValue.complexToFloat(i4) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)) + 19, objArr30);
                                                        java.lang.String intern2 = ((java.lang.String) objArr30[i4]).intern();
                                                        java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                                                        clsArr2[i4] = java.io.InputStream.class;
                                                        java.lang.Object invoke4 = cls8.getMethod(intern2, clsArr2).invoke(invoke3, objArr28);
                                                        int length2 = objArr.length;
                                                        int i7 = i4;
                                                        while (i7 < 2) {
                                                            java.lang.Object obj3 = objArr[i7];
                                                            try {
                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                a("彣氯㧱욽鈻弙泆㦛아鈄徦歰㠤얼銈幅欋㣊엙鄔庰毪㜪쐫釄应橋㜝쒫遫崸櫱㞝썋", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 13128, objArr31);
                                                                java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[i4]).intern());
                                                                int capsMode = android.text.TextUtils.getCapsMode("", i4, i4);
                                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                b(new int[]{246255243, 442516987, 1091160147, 1093677030, 1968778679, 181707237, -398328154, 762327314, 1356427318, -1056586283, -238109435, 761604231}, capsMode + 23, objArr32);
                                                                if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                    java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                    int i8 = ~i;
                                                                    int i9 = ~((-835740833) | i);
                                                                    try {
                                                                        java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-101686045) | i8)) | 34183936 | i9) * (-713)) + 725512504 + (i9 * 1426) + ((~(i8 | (-903242941))) * 713))};
                                                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj4 == null) {
                                                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                            byte b2 = (byte) ($$a[14] + 1);
                                                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                            c(b2, b2, b2, objArr35);
                                                                            obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                        }
                                                                        ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                        return objArr33;
                                                                    } catch (java.lang.Throwable th3) {
                                                                        java.lang.Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                }
                                                                i7++;
                                                                i4 = 0;
                                                            } catch (java.lang.Throwable th4) {
                                                                java.lang.Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        }
                                                        i6++;
                                                        i4 = 0;
                                                        i5 = 1;
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    java.lang.Throwable cause6 = th6.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th6;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                java.lang.Throwable cause7 = th7.getCause();
                                                if (cause7 != null) {
                                                    throw cause7;
                                                }
                                                throw th7;
                                            }
                                        }
                                        i3 = i5;
                                        int[] iArr = new int[i3];
                                        int[] iArr2 = new int[i3];
                                        iArr[0] = i;
                                        iArr2[0] = i;
                                        java.lang.Object[] objArr36 = {iArr, iArr2, null, new int[i3]};
                                        int i10 = ~i;
                                        java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-51629910) | i10)) | (~(953299075 | i))) * 959) - 1877733655) + (((~(i | (-51629910))) | (~(i10 | 953299075))) * 959))};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj5 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            byte b3 = (byte) ($$a[14] + 1);
                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                            c(b3, b3, b3, objArr38);
                                            obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                        }
                                        ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
                                        return objArr36;
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause8 = th8.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th8;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause9 = th9.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th9;
                                }
                            } catch (java.lang.Throwable th10) {
                                java.lang.Throwable cause10 = th10.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th10;
                            }
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause11 = th11.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th11;
                        }
                    }
                };
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 43;
                RecordsJson = i % 128;
                if (i % 2 == 0) {
                    return getstatuscode;
                }
                throw null;
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                RecordsJson = 0;
                SdkCoreAlternateContactlessPaymentDataImpl = 1;
                DigitizedCardProfile = 858510610;
                valueOf = 520368538;
                AlternateContactlessPaymentDataJson = 342463771;
                values = new byte[]{-20, -21, -86};
            }

            static void init$0() {
                $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -77, -89, 4};
                $$b = 199;
            }
        };
        int i = valueOf + 73;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return checkforsuccess;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        valueOf = 1;
        DigitizedCardProfile = -4454898405159972712L;
    }

    static void init$0() {
        $$a = new byte[]{76, 48, 60, 63};
        $$b = 11;
    }
}
