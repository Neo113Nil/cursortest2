package com.paypal.oslo.feature.publicprofile.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/selections/GetPublicProfileQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getInputFormats", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPublicProfileQuerySelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.publicprofile.graphql.selections.GetPublicProfileQuerySelections INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.selections.GetPublicProfileQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    private GetPublicProfileQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomerName", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PersonName", "BusinessName"})).selections(com.paypal.oslo.feature.publicprofile.graphql.fragment.selections.CustomerNameFieldsSelections.INSTANCE.get__root()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AddressPortable", kotlin.collections.CollectionsKt.listOf("AddressPortable")).selections(com.paypal.oslo.feature.publicprofile.graphql.fragment.selections.AddressPortableFieldsSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoFpsRanges = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("profilePhotoUrl", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CustomerName.INSTANCE.getType())).selections(listOf).build(), new com.apollographql.apollo.api.CompiledField.Builder("location", com.paypal.oslo.api.graphql.schema.type.AddressPortable.INSTANCE.getType()).selections(listOf2).build()});
        Camera2StreamConfigurationMap = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("handle", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("joinedDate", com.paypal.oslo.api.graphql.schema.type.DateNoTime.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PersonalPublicProfile", kotlin.collections.CollectionsKt.listOf("PersonalPublicProfile")).selections(listOf3).build()});
        getHighSpeedVideoFpsRangesFor = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomerName", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PersonName", "BusinessName"})).selections(com.paypal.oslo.feature.publicprofile.graphql.fragment.selections.CustomerNameFieldsSelections.INSTANCE.get__root()).build()});
        getHighSpeedVideoSizes = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AddressPortable", kotlin.collections.CollectionsKt.listOf("AddressPortable")).selections(com.paypal.oslo.feature.publicprofile.graphql.fragment.selections.AddressPortableFieldsSelections.INSTANCE.get__root()).build()});
        getInputSizeshNQ4ISI = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("address", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.AddressPortable.INSTANCE.getType())).selections(listOf6).build());
        getInputFormats = listOf7;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf8 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("mutualConnectionCount", com.paypal.oslo.api.graphql.schema.type.GraphQLInt.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("isExternalContact", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("isFavorited", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("isBlocked", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build()});
        getOutputFormats = listOf8;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf9 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.CustomerName.INSTANCE.getType()).selections(listOf5).build(), new com.apollographql.apollo.api.CompiledField.Builder("profilePhotoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("primaryAddress", com.paypal.oslo.api.graphql.schema.type.ContactAddress.INSTANCE.getType()).selections(listOf7).build(), new com.apollographql.apollo.api.CompiledField.Builder("relationship", com.paypal.oslo.api.graphql.schema.type.ContactRelationship.INSTANCE.getType()).selections(listOf8).build()});
        getHighSpeedVideoSizesFor = listOf9;
        __root = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("publicProfile", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PublicProfile.INSTANCE.getType())).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__publicProfile_input()).value(new com.apollographql.apollo.api.CompiledVariable("publicInput")).build())).selections(listOf4).build(), new com.apollographql.apollo.api.CompiledField.Builder("contact", com.paypal.oslo.api.graphql.schema.type.Contact.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__contact_id()).value(new com.apollographql.apollo.api.CompiledVariable(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID)).build())).selections(listOf9).build()});
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
