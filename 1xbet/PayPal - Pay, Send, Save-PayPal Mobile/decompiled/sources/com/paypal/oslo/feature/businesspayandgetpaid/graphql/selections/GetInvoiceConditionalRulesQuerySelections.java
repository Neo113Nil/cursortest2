package com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/selections/GetInvoiceConditionalRulesQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetInvoiceConditionalRulesQuerySelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.GetInvoiceConditionalRulesQuerySelections INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.GetInvoiceConditionalRulesQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private GetInvoiceConditionalRulesQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.selections.MoneyFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoSizes = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("conditionalRuleType", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("conditionalRuleValueType", com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("conditionalRuleValue", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("effectiveDate", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.DateNoTime.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("isActive", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("isCurrentlyApplicable", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("invoiceTotalPreRules", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("rules", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRule.INSTANCE.getType())))).selections(listOf2).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf3;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("invoiceConditionalRules", com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRules.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__invoiceConditionalRules_id()).value(new com.apollographql.apollo.api.CompiledVariable("id")).build())).selections(listOf3).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
