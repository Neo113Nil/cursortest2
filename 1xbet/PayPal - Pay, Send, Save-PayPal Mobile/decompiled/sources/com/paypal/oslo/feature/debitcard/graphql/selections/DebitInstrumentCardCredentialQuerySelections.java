package com.paypal.oslo.feature.debitcard.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/selections/DebitInstrumentCardCredentialQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentCardCredentialQuerySelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentCardCredentialQuerySelections INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentCardCredentialQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    private DebitInstrumentCardCredentialQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardNumber", com.paypal.oslo.api.graphql.schema.type.CardNumber.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentLastNChars.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardVerificationCode", com.paypal.oslo.api.graphql.schema.type.CVV.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, com.paypal.oslo.api.graphql.schema.type.DateYearMonth.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("scheme", com.paypal.oslo.api.graphql.schema.type.CardBrand.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("debitInstrumentCardCredential", com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredential.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__debitInstrumentCardCredential_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
