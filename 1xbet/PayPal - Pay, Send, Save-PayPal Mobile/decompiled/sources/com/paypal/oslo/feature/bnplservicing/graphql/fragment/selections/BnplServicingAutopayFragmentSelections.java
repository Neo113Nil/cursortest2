package com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/selections/BnplServicingAutopayFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingAutopayFragmentSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections.BnplServicingAutopayFragmentSelections INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections.BnplServicingAutopayFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    private BnplServicingAutopayFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLServicingPaymentFundingInstrument", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "BankAccount", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD})).selections(com.paypal.oslo.feature.bnplservicing.graphql.fragment.selections.BnplServicingPaymentFundingInstrumentFragmentSelections.INSTANCE.get__root()).build()});
        Camera2StreamConfigurationMap = listOf;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("enabled", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("paymentFundingInstrument", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentFundingInstrument.INSTANCE.getType())).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("isFundingInstrumentValid", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("eTag", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ETag.INSTANCE.getType())).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
