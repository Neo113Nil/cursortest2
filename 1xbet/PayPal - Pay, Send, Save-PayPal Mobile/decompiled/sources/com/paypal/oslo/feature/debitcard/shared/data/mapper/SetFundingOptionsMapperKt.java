package com.paypal.oslo.feature.debitcard.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/SetDebitInstrumentFundingOptionsInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "setFundingOptionsRequestMapper", "Lkotlin/jvm/functions/Function1;", "getSetFundingOptionsRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/SetDebitInstrumentFundingOptionsMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsResult;", "setFundingOptionsResponseMapper", "getSetFundingOptionsResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SetFundingOptionsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest, com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentFundingOptionsInput> setFundingOptionsRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt.m14568$r8$lambda$pfOY5vUxtqJEX44qOUowhUxdag((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult> setFundingOptionsResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt.m14567$r8$lambda$Hv3EvYs_H5S3Vv7GcLt8M5ldfI((com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentFundingOptionsMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest, com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentFundingOptionsInput> getSetFundingOptionsRequestMapper() {
        return setFundingOptionsRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult> getSetFundingOptionsResponseMapper() {
        return setFundingOptionsResponseMapper;
    }

    /* renamed from: $r8$lambda$Hv3EvYs_H5S3-Vv7GcLt8M5ldfI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult m14567$r8$lambda$Hv3EvYs_H5S3Vv7GcLt8M5ldfI(com.paypal.oslo.feature.debitcard.graphql.SetDebitInstrumentFundingOptionsMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult(data.getSetDebitInstrumentFundingOptions().getSuccess());
    }

    /* renamed from: $r8$lambda$pfOY5vUxtqJEX44qOU-owhUxdag, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentFundingOptionsInput m14568$r8$lambda$pfOY5vUxtqJEX44qOUowhUxdag(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest) {
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitCardFundingOptionsRequest, "");
        java.lang.String instrumentId = setDebitCardFundingOptionsRequest.getInstrumentId();
        java.lang.String id = setDebitCardFundingOptionsRequest.getFundingSource().getId();
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(setDebitCardFundingOptionsRequest.getFundingSource().getIssuerName());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = null;
        switch (com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[setDebitCardFundingOptionsRequest.getFundingSource().getFundingSourceType().ordinal()]) {
            case 1:
                fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_BALANCE;
                break;
            case 2:
                fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_CHECKING;
                break;
            case 3:
                fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD;
                break;
            case 4:
                fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD;
                break;
            case 5:
            case 6:
                fundingInstrumentType = null;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput(id, presentIfNotNull, companion.presentIfNotNull(fundingInstrumentType), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(setDebitCardFundingOptionsRequest.getFundingSource().getLastNChars()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(setDebitCardFundingOptionsRequest.getFundingSource().getClassification()), null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.mapFundingSourceStatusToGraphQL(setDebitCardFundingOptionsRequest.getFundingSource().getStatus())), 32, null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOption = setDebitCardFundingOptionsRequest.getPrimaryFundingOption();
        int i = primaryFundingOption == null ? -1 : com.paypal.oslo.feature.debitcard.shared.data.mapper.SetFundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$1[primaryFundingOption.ordinal()];
        if (i != -1) {
            if (i == 1) {
                debitInstrumentPrimaryFundingSourceType = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType.BALANCE;
            } else if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return new com.paypal.oslo.api.graphql.schema.type.SetDebitInstrumentFundingOptionsInput(instrumentId, new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput(debitInstrumentFundingSourceInput, null, companion2.presentIfNotNull(debitInstrumentPrimaryFundingSourceType), 2, null));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_CREDIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.PAYPAL_CREDIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
