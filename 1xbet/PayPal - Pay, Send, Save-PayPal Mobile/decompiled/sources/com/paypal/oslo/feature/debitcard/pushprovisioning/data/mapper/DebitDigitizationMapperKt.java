package com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitDigitizationRequestMapper", "Lkotlin/jvm/functions/Function1;", "getDebitDigitizationRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationResponse;", "digitizationResponseMapper", "getDigitizationResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitDigitizationMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest, com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput> debitDigitizationRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.$r8$lambda$9m8CnrI6WHSuiFAf0igN5JoGptg((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse> digitizationResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.$r8$lambda$BvYIIljukXsh8bgmKgd5rU0Mh1o((com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest, com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput> getDebitDigitizationRequestMapper() {
        return debitDigitizationRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse> getDigitizationResponseMapper() {
        return digitizationResponseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput $r8$lambda$9m8CnrI6WHSuiFAf0igN5JoGptg(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest debitDigitizationRequest) {
        com.apollographql.apollo.api.Optional.Absent absent;
        java.lang.String nonceSignature;
        java.lang.String nonce;
        java.lang.String tokenRequestorId;
        java.util.Map<java.lang.String, java.lang.String> additionalAttributes;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.paypal.oslo.api.graphql.schema.type.WalletProvider walletProvider;
        com.apollographql.apollo.api.Optional.Present present;
        com.apollographql.apollo.api.Optional.Present present2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitDigitizationRequest, "");
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.WhenMappings.$EnumSwitchMapping$0[debitDigitizationRequest.getTokenProductName().ordinal()] == 1 ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.DIGITIZATION_TOKEN : com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.UNKNOWN;
        java.lang.String fundingCardId = debitDigitizationRequest.getFundingCardId();
        java.lang.String clientChannel = debitDigitizationRequest.getClientChannel();
        com.apollographql.apollo.api.Optional absent3 = (clientChannel == null || (present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ClientChannel.INSTANCE.safeValueOf(clientChannel))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present2;
        java.lang.String experienceChannel = debitDigitizationRequest.getExperienceChannel();
        com.apollographql.apollo.api.Optional absent4 = (experienceChannel == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.INSTANCE.safeValueOf(experienceChannel))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet wallet = debitDigitizationRequest.getWallet();
        if (wallet != null) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(wallet.getWalletId());
            com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(wallet.getDeviceId());
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            int i = com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.WhenMappings.$EnumSwitchMapping$1[wallet.getBrand().ordinal()];
            if (i == 1) {
                walletProvider = com.paypal.oslo.api.graphql.schema.type.WalletProvider.GOOGLE_PAY;
            } else {
                if (i != 2 && i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                walletProvider = null;
            }
            com.apollographql.apollo.api.Optional.Present present3 = companion.present(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput(null, presentIfNotNull, companion2.presentIfNotNull(walletProvider), presentIfNotNull2, 1, null));
            if (present3 != null) {
                absent = present3;
                com.apollographql.apollo.api.Optional optional = absent;
                nonceSignature = debitDigitizationRequest.getNonceSignature();
                if (nonceSignature != null || (r0 = com.apollographql.apollo.api.Optional.INSTANCE.present(nonceSignature)) == null) {
                    com.apollographql.apollo.api.Optional absent5 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                }
                com.apollographql.apollo.api.Optional optional2 = absent5;
                nonce = debitDigitizationRequest.getNonce();
                if (nonce != null || (r0 = com.apollographql.apollo.api.Optional.INSTANCE.present(nonce)) == null) {
                    com.apollographql.apollo.api.Optional absent6 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                }
                com.apollographql.apollo.api.Optional optional3 = absent6;
                tokenRequestorId = debitDigitizationRequest.getTokenRequestorId();
                if (tokenRequestorId != null || (r0 = com.apollographql.apollo.api.Optional.INSTANCE.present(tokenRequestorId)) == null) {
                    com.apollographql.apollo.api.Optional absent7 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                }
                com.apollographql.apollo.api.Optional optional4 = absent7;
                additionalAttributes = debitDigitizationRequest.getAdditionalAttributes();
                if (additionalAttributes != null) {
                    com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.util.ArrayList arrayList = new java.util.ArrayList(additionalAttributes.size());
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : additionalAttributes.entrySet()) {
                        arrayList.add(new com.paypal.oslo.api.graphql.schema.type.MetadataItemInput(entry.getKey(), entry.getValue()));
                    }
                    com.apollographql.apollo.api.Optional.Present present4 = companion3.present(kotlin.collections.CollectionsKt.toList(arrayList));
                    if (present4 != null) {
                        absent2 = present4;
                        return new com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput(debitInstrumentProductName, absent3, absent4, null, optional, optional2, fundingCardId, optional3, optional4, absent2, 8, null);
                    }
                }
                absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                return new com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput(debitInstrumentProductName, absent3, absent4, null, optional, optional2, fundingCardId, optional3, optional4, absent2, 8, null);
            }
        }
        absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        com.apollographql.apollo.api.Optional optional5 = absent;
        nonceSignature = debitDigitizationRequest.getNonceSignature();
        if (nonceSignature != null) {
        }
        com.apollographql.apollo.api.Optional absent52 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        com.apollographql.apollo.api.Optional optional22 = absent52;
        nonce = debitDigitizationRequest.getNonce();
        if (nonce != null) {
        }
        com.apollographql.apollo.api.Optional absent62 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        com.apollographql.apollo.api.Optional optional32 = absent62;
        tokenRequestorId = debitDigitizationRequest.getTokenRequestorId();
        if (tokenRequestorId != null) {
        }
        com.apollographql.apollo.api.Optional absent72 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        com.apollographql.apollo.api.Optional optional42 = absent72;
        additionalAttributes = debitDigitizationRequest.getAdditionalAttributes();
        if (additionalAttributes != null) {
        }
        absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        return new com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput(debitInstrumentProductName, absent3, absent4, null, optional5, optional22, fundingCardId, optional32, optional42, absent2, 8, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse $r8$lambda$BvYIIljukXsh8bgmKgd5rU0Mh1o(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String preDigitizationData = data.getCreateDebitInstrumentDigitizationData().getPreDigitizationData();
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse(preDigitizationData != null ? preDigitizationData : "");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_GOOGLE_PAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.GOOGLE_PAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.SAMSUNG_PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
