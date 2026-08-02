package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/selections/RevolvingCreditCustomerServiceFragmentSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditCustomerServiceFragmentSelections {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditCustomerServiceFragmentSelections INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditCustomerServiceFragmentSelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    private RevolvingCreditCustomerServiceFragmentSelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("addressLine1", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("addressLine2", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("addressLine3", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("adminArea1", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("adminArea2", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("adminArea3", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("countryCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CountryCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Phone", kotlin.collections.CollectionsKt.listOf("Phone")).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.selections.RevolvingCreditPhoneFragmentSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRanges = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("mailingAddress", com.paypal.oslo.api.graphql.schema.type.AddressPortable.INSTANCE.getType()).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("operationHours", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("payableTo", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("phoneNumber", com.paypal.oslo.api.graphql.schema.type.Phone.INSTANCE.getType()).selections(listOf2).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
