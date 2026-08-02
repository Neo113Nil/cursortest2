package com.paypal.oslo.feature.dataprivacy.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/selections/GetSubjectAccessRequestsQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetSubjectAccessRequestsQuerySelections {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.dataprivacy.graphql.selections.GetSubjectAccessRequestsQuerySelections INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.selections.GetSubjectAccessRequestsQuerySelections();
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    private GetSubjectAccessRequestsQuerySelections() {
    }

    static {
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("documentId", com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("name", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("partyId", com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("domain", com.paypal.oslo.api.graphql.schema.type.DSRDomain.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("requestType", com.paypal.oslo.api.graphql.schema.type.DSRRequestType.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("source", com.paypal.oslo.api.graphql.schema.type.DSRSource.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("createTime", com.paypal.oslo.api.graphql.schema.type.DateTime.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("updateTime", com.paypal.oslo.api.graphql.schema.type.DateTime.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("alias", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("file", com.paypal.oslo.api.graphql.schema.type.FileMetadata.INSTANCE.getType()).selections(listOf).build()});
        getHighSpeedVideoFpsRangesFor = listOf2;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("subjectAccessRequests", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequest.INSTANCE.getType()))).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__subjectAccessRequests_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf2).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
