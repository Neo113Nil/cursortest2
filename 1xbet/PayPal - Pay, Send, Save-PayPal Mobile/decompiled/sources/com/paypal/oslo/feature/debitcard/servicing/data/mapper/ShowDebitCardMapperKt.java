package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"F\u0010\u000f\u001a.\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\u0000j\u0016\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/ShowDebitCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "showDebitCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getShowDebitCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "showDebitCardResponseMapper", "getShowDebitCardResponseMapper", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "Lcom/paypal/oslo/feature/debitcard/graphql/type/CardBrand;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;", "debitCardSchemeMapper", "getDebitCardSchemeMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput> showDebitCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt.$r8$lambda$Q5llOUC4GOutMdrtg07_uV5mNl0((com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails> showDebitCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt.$r8$lambda$9Lule8RxyKqCcp49UajdeaCIhb8((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.CardBrand, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme> debitCardSchemeMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = com.paypal.oslo.feature.debitcard.servicing.data.mapper.ShowDebitCardMapperKt.Camera2StreamConfigurationMap((com.paypal.oslo.api.graphql.schema.type.CardBrand) obj);
            return Camera2StreamConfigurationMap;
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput> getShowDebitCardRequestMapper() {
        return showDebitCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails> getShowDebitCardResponseMapper() {
        return showDebitCardResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.CardBrand, com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme> getDebitCardSchemeMapper() {
        return debitCardSchemeMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand) {
        java.lang.Object m23436constructorimpl;
        if (cardBrand != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String upperCase = cardBrand.name().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme = com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.UNKNOWN;
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = debitCardScheme;
            }
            com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme2 = (com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme) m23436constructorimpl;
            if (debitCardScheme2 != null) {
                return debitCardScheme2;
            }
        }
        return com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.UNKNOWN;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails $r8$lambda$9Lule8RxyKqCcp49UajdeaCIhb8(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardCredential, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails(debitInstrumentCardCredential.getId(), java.lang.String.valueOf(debitInstrumentCardCredential.getCardNumber()), java.lang.String.valueOf(debitInstrumentCardCredential.getLastNChars()), java.lang.String.valueOf(debitInstrumentCardCredential.getCardVerificationCode()), java.lang.String.valueOf(debitInstrumentCardCredential.getExpiryDate()), debitCardSchemeMapper.invoke(debitInstrumentCardCredential.getScheme()), com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentLifecycleStatusMapper().invoke(debitInstrumentCardCredential.getStatus()));
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput $r8$lambda$Q5llOUC4GOutMdrtg07_uV5mNl0(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest showDebitCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput(showDebitCardRequest.getInstrumentId());
    }
}
