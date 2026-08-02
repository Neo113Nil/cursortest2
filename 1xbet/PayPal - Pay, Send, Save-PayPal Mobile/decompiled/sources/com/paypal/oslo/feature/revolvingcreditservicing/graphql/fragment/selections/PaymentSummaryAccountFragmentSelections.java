package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/selections/PaymentSummaryAccountFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryAccountFragmentSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.PaymentSummaryAccountFragmentSelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.PaymentSummaryAccountFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private PaymentSummaryAccountFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditMoneyFragmentSelections.INSTANCE.get__root()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("paymentStatus", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("nextPaymentDueTime", com.paypal.oslo.api.graphql.schema.type.DateTime.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("currentBalance", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf).build()});
        Camera2StreamConfigurationMap = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("billing", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingBilling.INSTANCE.getType()).selections(listOf2).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
