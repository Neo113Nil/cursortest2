package com.payair.hce;

/* loaded from: classes4.dex */
public final class setInitialScale {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private final com.visa.cbp.sdk.facade.VisaPaymentSDK AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (~i3) | i4;
        int i6 = i2 | i;
        int i7 = ~(i3 | i6);
        int i8 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (((~((~i) | i4)) | (~i5) | i7) * (-252)) + (i6 * (-252)) + (((~(i | i5)) | i7) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? valueOf(objArr) : writeReplace(objArr) : DigitizedCardProfile(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    public setInitialScale(com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visaPaymentSDK, "");
        this.AlternateContactlessPaymentDataJson = visaPaymentSDK;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) objArr[0];
        int i = valueOf;
        int i2 = ((i ^ 86) + ((i & 86) << 1)) - 1;
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDK = setinitialscale.AlternateContactlessPaymentDataJson;
        if (i2 % 2 != 0) {
            throw null;
        }
        valueOf = (((i3 | 53) << 1) - (i3 ^ 53)) % 128;
        return visaPaymentSDK;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.Object obj;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) objArr[0];
        final android.content.Context context = (android.content.Context) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        int i = valueOf;
        DigitizedCardProfile = (((i ^ 7) - (~((i & 7) << 1))) - 1) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<com.visa.cbp.sdk.facade.data.TokenData> allTokenData = setinitialscale.AlternateContactlessPaymentDataJson.getAllTokenData(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allTokenData, "");
        java.util.Iterator<T> it = allTokenData.iterator();
        int i2 = valueOf;
        int i3 = i2 & 1;
        DigitizedCardProfile = (i3 + ((i2 ^ 1) | i3)) % 128;
        while (true) {
            if (!it.hasNext()) {
                int i4 = valueOf;
                DigitizedCardProfile = ((i4 ^ 33) + ((i4 & 33) << 1)) % 128;
                obj = null;
                break;
            }
            int i5 = DigitizedCardProfile;
            int i6 = i5 & 35;
            int i7 = ((i5 | 35) & (~i6)) + (i6 << 1);
            valueOf = i7 % 128;
            if (i7 % 2 == 0) {
                kotlin.jvm.internal.Intrinsics.areEqual(((com.visa.cbp.sdk.facade.data.TokenData) it.next()).getVProvisionedTokenID(), str);
                throw new java.lang.ArithmeticException();
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.visa.cbp.sdk.facade.data.TokenData) obj).getVProvisionedTokenID(), str)) {
                int i8 = DigitizedCardProfile;
                valueOf = ((i8 & 111) + (i8 | 111)) % 128;
                break;
            }
        }
        com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) obj;
        if (tokenData != null) {
            int i9 = DigitizedCardProfile;
            int i10 = (i9 | 73) << 1;
            int i11 = -(i9 ^ 73);
            valueOf = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
            if (tokenData.getTokenStatus().equals(com.payair.model.TokenStatusKt.TOKEN_ACTIVE)) {
                int i12 = valueOf;
                int i13 = (i12 | 39) << 1;
                int i14 = -(i12 ^ 39);
                int i15 = (i13 & i14) + (i14 | i13);
                DigitizedCardProfile = i15 % 128;
                if (i15 % 2 != 0) {
                    tokenData.getTokenKey();
                    throw new java.lang.ArithmeticException();
                }
                final com.visa.cbp.sdk.facade.data.TokenKey tokenKey = tokenData.getTokenKey();
                if (tokenKey != null) {
                    com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
                    boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.payair.hce.setInitialScale.5
                        private static int $valueOf = 0;
                        private static int $writeReplace = 1;

                        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i16, int i17, int i18) {
                            int i19 = ~i18;
                            int i20 = i19 | i16;
                            int i21 = ~i17;
                            int i22 = ~i16;
                            if ((i16 * (-51)) + (i17 * 53) + ((~(i20 | i17)) * 52) + (((~(i16 | i21)) | (~(i21 | i19)) | (~i20)) * (-52)) + (((~(i22 | i17)) | (~(i19 | i22))) * 52) == 1) {
                                return values(objArr2);
                            }
                            com.payair.hce.setInitialScale.AnonymousClass5 anonymousClass5 = (com.payair.hce.setInitialScale.AnonymousClass5) objArr2[0];
                            int i23 = $valueOf;
                            int i24 = i23 & 95;
                            $writeReplace = ((i24 - (~((i23 ^ 95) | i24))) - 1) % 128;
                            ((com.visa.cbp.sdk.facade.VisaPaymentSDK) com.payair.hce.setInitialScale.values(new java.lang.Object[]{com.payair.hce.setInitialScale.this}, 121221347, -121221344, (int) java.lang.System.currentTimeMillis())).selectCard(context, tokenKey);
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            int i25 = $writeReplace;
                            int i26 = i25 | 9;
                            $valueOf = ((i26 << 1) - ((~(i25 & 9)) & i26)) % 128;
                            return bool;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                            com.payair.hce.setInitialScale.AnonymousClass5 anonymousClass5 = (com.payair.hce.setInitialScale.AnonymousClass5) objArr2[0];
                            int i16 = $valueOf;
                            int i17 = (i16 ^ 111) + ((i16 & 111) << 1);
                            $writeReplace = i17 % 128;
                            if (i17 % 2 != 0) {
                                return (java.lang.Boolean) writeReplace(new java.lang.Object[]{anonymousClass5}, -1058778976, 1058778976, java.lang.System.identityHashCode(anonymousClass5));
                            }
                            throw null;
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ java.lang.Boolean invoke() {
                            ?? writeReplace = writeReplace(new java.lang.Object[]{this}, -1672834929, 1672834930, java.lang.System.identityHashCode(this));
                            return writeReplace;
                        }

                        public final java.lang.Boolean AlternateContactlessPaymentDataJson() {
                            return (java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -1058778976, 1058778976, java.lang.System.identityHashCode(this));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }}, -1308392794, 1308392825, (int) java.lang.System.currentTimeMillis())).booleanValue();
                    int i16 = valueOf;
                    DigitizedCardProfile = ((i16 & 111) + (i16 | 111)) % 128;
                    return java.lang.Boolean.valueOf(booleanValue);
                }
            }
        }
        int i17 = valueOf;
        int i18 = i17 & 97;
        DigitizedCardProfile = (i18 + ((i17 ^ 97) | i18)) % 128;
        return java.lang.Boolean.FALSE;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        int i = valueOf;
        DigitizedCardProfile = ((-2) - (~(((i | 98) << 1) - (i ^ 98)))) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        setinitialscale.AlternateContactlessPaymentDataJson.deselectCard(context);
        int i2 = valueOf;
        int i3 = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)) - 1;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) objArr[0];
        int i2 = valueOf;
        DigitizedCardProfile = ((((i2 ^ 51) | (i2 & 51)) << 1) - ((i2 & (-52)) | ((~i2) & 51))) % 128;
        com.visa.cbp.sdk.facade.data.TokenKey selectedCard = setinitialscale.AlternateContactlessPaymentDataJson.getSelectedCard((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()));
        if (selectedCard.getTokenId() == -1) {
            int i3 = valueOf;
            DigitizedCardProfile = (((i3 | 25) << 1) - (i3 ^ 25)) % 128;
            int i4 = i3 ^ 21;
            i = (((i3 & 21) | i4) << 1) - i4;
        } else {
            com.visa.cbp.sdk.facade.data.TokenData tokenData = setinitialscale.AlternateContactlessPaymentDataJson.getTokenData((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()), selectedCard);
            if (tokenData != null) {
                int i5 = DigitizedCardProfile;
                int i6 = i5 & 69;
                int i7 = -(-(i5 | 69));
                valueOf = ((i6 & i7) + (i7 | i6)) % 128;
                java.lang.String vProvisionedTokenID = tokenData.getVProvisionedTokenID();
                int i8 = DigitizedCardProfile + 19;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    return vProvisionedTokenID;
                }
                throw new java.lang.ArithmeticException();
            }
            int i9 = valueOf;
            int i10 = i9 ^ 39;
            i = ((((i9 & 39) | i10) << 1) - (~(-i10))) - 1;
        }
        DigitizedCardProfile = i % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) objArr[0];
        final android.content.Context context = (android.content.Context) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        final com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus = (com.visa.cbp.sdk.facade.data.TokenStatus) objArr[3];
        int i = valueOf + 79;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStatus, "");
            com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStatus, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
        final com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, str}, -550736711, 550736720, (int) java.lang.System.currentTimeMillis());
        if (tokenData != null) {
            int i2 = DigitizedCardProfile;
            valueOf = ((i2 & 103) + (i2 | 103)) % 128;
            if (tokenData.getTokenKey() != null) {
                com.payair.hce.setNetworkAvailable setnetworkavailable3 = com.payair.hce.setNetworkAvailable.values;
                com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.payair.hce.setInitialScale.3
                    private static int $RecordsJson = 1;
                    private static int $valueOf;

                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i3, int i4, int i5) {
                        int i6 = ~i3;
                        int i7 = ~i5;
                        int i8 = ~i4;
                        int i9 = i6 | i8;
                        return ((((i3 * 868) + (i4 * 868)) + (((~(i6 | i7)) | (~(i8 | i7))) * (-867))) + ((((~i9) | (~(i6 | i5))) | (~(i8 | i5))) * (-1734))) + (((~((i3 | i8) | i5)) | ((~((i4 | i6) | i5)) | (~(i7 | i9)))) * 867) != 1 ? writeReplace(objArr2) : values(objArr2);
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        com.payair.hce.setInitialScale.AnonymousClass3 anonymousClass3 = (com.payair.hce.setInitialScale.AnonymousClass3) objArr2[0];
                        int i3 = $valueOf;
                        int i4 = ((i3 | 17) << 1) - (i3 ^ 17);
                        $RecordsJson = i4 % 128;
                        if (i4 % 2 != 0) {
                            AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass3}, -1540369111, 1540369111, java.lang.System.identityHashCode(anonymousClass3));
                            return kotlin.Unit.INSTANCE;
                        }
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass3}, -1540369111, 1540369111, java.lang.System.identityHashCode(anonymousClass3));
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                        com.payair.hce.setInitialScale.AnonymousClass3 anonymousClass3 = (com.payair.hce.setInitialScale.AnonymousClass3) objArr2[0];
                        int i3 = $valueOf;
                        $RecordsJson = (((((i3 ^ 111) | (i3 & 111)) << 1) - (~(-((i3 & (-112)) | ((~i3) & 111))))) - 1) % 128;
                        ((com.visa.cbp.sdk.facade.VisaPaymentSDK) com.payair.hce.setInitialScale.values(new java.lang.Object[]{com.payair.hce.setInitialScale.this}, 121221347, -121221344, (int) java.lang.System.currentTimeMillis())).updateTokenStatus(context, tokenData.getTokenKey(), tokenStatus);
                        int i4 = $valueOf;
                        int i5 = i4 ^ 59;
                        int i6 = (i4 & 59) << 1;
                        int i7 = (i5 & i6) + (i6 | i5);
                        $RecordsJson = i7 % 128;
                        if (i7 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Unit] */
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ kotlin.Unit invoke() {
                        ?? AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -651775522, 651775523, java.lang.System.identityHashCode(this));
                        return AlternateContactlessPaymentDataJson;
                    }

                    public final void DigitizedCardProfile() {
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1540369111, 1540369111, java.lang.System.identityHashCode(this));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }}, -1243304760, 1243304762, (int) java.lang.System.currentTimeMillis());
                int i3 = DigitizedCardProfile;
                int i4 = i3 ^ 107;
                int i5 = ((i3 & 107) | i4) << 1;
                int i6 = -i4;
                valueOf = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
            }
        }
        int i7 = valueOf;
        int i8 = (i7 | 109) << 1;
        int i9 = -((i7 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i7) & 109));
        DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
        return null;
    }

    public static final /* synthetic */ com.visa.cbp.sdk.facade.VisaPaymentSDK AlternateContactlessPaymentDataJson(com.payair.hce.setInitialScale setinitialscale) {
        return (com.visa.cbp.sdk.facade.VisaPaymentSDK) values(new java.lang.Object[]{setinitialscale}, 121221347, -121221344, (int) java.lang.System.currentTimeMillis());
    }

    public final void writeReplace(android.content.Context context, java.lang.String str, com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus) {
        values(new java.lang.Object[]{this, context, str, tokenStatus}, -1421970376, 1421970380, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 540052939, -540052939, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(android.content.Context context) {
        values(new java.lang.Object[]{this, context}, 373382978, -373382977, java.lang.System.identityHashCode(this));
    }

    public final boolean values(android.content.Context context, java.lang.String str) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, context, str}, 660956007, -660956005, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
