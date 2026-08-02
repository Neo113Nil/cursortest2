package com.paypal.oslo.feature.debitcard.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/selections/DebitInstrumentCardHolderFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentCardHolderFragmentSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.graphql.fragment.selections.DebitInstrumentCardHolderFragmentSelections INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.selections.DebitInstrumentCardHolderFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private DebitInstrumentCardHolderFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("addressLine1", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("addressLine2", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("adminArea1", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("adminArea2", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("countryCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CountryCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRangesFor = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("address", com.paypal.oslo.api.graphql.schema.type.AddressPortable.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("displayAddress", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()))).build(), new com.apollographql.apollo.api.CompiledField.Builder("normalizationStatus", com.paypal.oslo.api.graphql.schema.type.AddressNormalizationStatus.INSTANCE.getType()).build()});
        getHighSpeedVideoFpsRanges = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("firstName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("billingAddress", com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddress.INSTANCE.getType()).selections(listOf2).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
