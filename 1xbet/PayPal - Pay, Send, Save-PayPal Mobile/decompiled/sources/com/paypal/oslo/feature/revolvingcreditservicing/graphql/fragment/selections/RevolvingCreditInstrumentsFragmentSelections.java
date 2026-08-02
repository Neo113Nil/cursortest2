package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/selections/RevolvingCreditInstrumentsFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditInstrumentsFragmentSelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditInstrumentsFragmentSelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditInstrumentsFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    private RevolvingCreditInstrumentsFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("activationStatus", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus.INSTANCE.getType()).build());
        getHighSpeedVideoSizes = listOf;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditInstrumentID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("allowedFeatures", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature.INSTANCE.getType()))).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("card", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCard.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentLastNChars.INSTANCE.getType()).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
