package com.paypal.oslo.feature.dataprivacy.data.source;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0014\u0010\u000eJ,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0019\u0010\u000eJ\u0013\u0010\u001b\u001a\u00020\u000b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/dataprivacy/data/network/DataPrivacyRestService;", "restService", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/dataprivacy/data/network/DataPrivacyRestService;)V", "", "partyId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "getExistingRequests", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateDARRequest;", "request", "Lcom/paypal/oslo/feature/dataprivacy/graphql/CreateSubjectAccessRequestMutation$Data;", "createDataAccessRequest", "(Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateDARRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getErasureRequests", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateErasureRequest;", "createErasureRequest", "(Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateErasureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetDataPrivacyIdentityLinksQuery$Data;", "getIdentityLinks", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "fileId", "", "downloadFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/dataprivacy/data/network/DataPrivacyRestService;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DataPrivacyGraphQLDataSource {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService getHighSpeedVideoSizes;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data Camera2StreamConfigurationMap = new com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data(new com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.IdentityLinks(kotlin.collections.CollectionsKt.emptyList()));

    @javax.inject.Inject
    public DataPrivacyGraphQLDataSource(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService dataPrivacyRestService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyRestService, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = dataPrivacyRestService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getExistingRequests(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getExistingRequests$1 dataPrivacyGraphQLDataSource$getExistingRequests$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getExistingRequests$1) {
            dataPrivacyGraphQLDataSource$getExistingRequests$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getExistingRequests$1) continuation;
            if ((dataPrivacyGraphQLDataSource$getExistingRequests$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$getExistingRequests$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$getExistingRequests$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$getExistingRequests$1.Camera2StreamConfigurationMap;
                int i2 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput2 = new com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput(com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.paypal.oslo.api.graphql.schema.type.DSRDomain.PAYPAL, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.DSRRequestType.DATA_ACCESS_REQUEST), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent());
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Fetching existing requests", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", subjectAccessRequestsInput2.getDomain().name())), null, 4, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery getSubjectAccessRequestsQuery = new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery(subjectAccessRequestsInput2);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str)), i2, 0 == true ? 1 : 0);
                    dataPrivacyGraphQLDataSource$getExistingRequests$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    dataPrivacyGraphQLDataSource$getExistingRequests$1.getHighSpeedVideoFpsRangesFor = subjectAccessRequestsInput2;
                    dataPrivacyGraphQLDataSource$getExistingRequests$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getSubjectAccessRequestsQuery);
                    dataPrivacyGraphQLDataSource$getExistingRequests$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    dataPrivacyGraphQLDataSource$getExistingRequests$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, getSubjectAccessRequestsQuery, callConfig, dataPrivacyGraphQLDataSource$getExistingRequests$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    subjectAccessRequestsInput = subjectAccessRequestsInput2;
                    obj = execute;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    subjectAccessRequestsInput = (com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput) dataPrivacyGraphQLDataSource$getExistingRequests$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "getExistingRequests failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", subjectAccessRequestsInput.getDomain().name()), kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data data = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return data != null ? new arrow.core.Ior.Right(data) : new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "getExistingRequests partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", subjectAccessRequestsInput.getDomain().name()), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data data2 = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) graphQLData.getData();
                    if (data2 != null) {
                        return new arrow.core.Ior.Both(getHighSpeedVideoSizes(callError2), data2);
                    }
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError2));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$getExistingRequests$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getExistingRequests$1(this, continuation);
        java.lang.Object obj2 = dataPrivacyGraphQLDataSource$getExistingRequests$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$getExistingRequests$1.Camera2StreamConfigurationMap;
        int i22 = 1;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createDataAccessRequest(java.lang.String str, com.paypal.oslo.feature.dataprivacy.domain.model.CreateDARRequest createDARRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1 dataPrivacyGraphQLDataSource$createDataAccessRequest$1;
        int i;
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource;
        com.paypal.oslo.feature.dataprivacy.domain.model.CreateDARRequest createDARRequest2;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1) {
            dataPrivacyGraphQLDataSource$createDataAccessRequest$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1) continuation;
            if ((dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                    com.paypal.oslo.api.graphql.schema.type.DSRSource safeValueOf = com.paypal.oslo.api.graphql.schema.type.DSRSource.INSTANCE.safeValueOf(createDARRequest.getSource());
                    java.lang.String channel = createDARRequest.getChannel();
                    com.paypal.oslo.api.graphql.schema.type.DSRDomain safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.DSRDomain.INSTANCE.safeValueOf(createDARRequest.getDomain());
                    com.apollographql.apollo.api.Optional.Absent absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                    com.paypal.oslo.api.graphql.schema.type.DSRRequestType safeValueOf3 = com.paypal.oslo.api.graphql.schema.type.DSRRequestType.INSTANCE.safeValueOf(createDARRequest.getRequestType());
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARCategory> categories = createDARRequest.getCategories();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(categories, 10));
                    java.util.Iterator it = categories.iterator();
                    while (it.hasNext()) {
                        com.paypal.oslo.feature.dataprivacy.domain.model.DARCategory dARCategory = (com.paypal.oslo.feature.dataprivacy.domain.model.DARCategory) it.next();
                        java.lang.String name2 = dARCategory.getName();
                        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.util.Iterator it2 = it;
                        java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARItem> items = dARCategory.getCriteria().getItems();
                        java.lang.Object obj2 = coroutine_suspended;
                        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1 dataPrivacyGraphQLDataSource$createDataAccessRequest$12 = dataPrivacyGraphQLDataSource$createDataAccessRequest$1;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                        for (java.util.Iterator it3 = items.iterator(); it3.hasNext(); it3 = it3) {
                            com.paypal.oslo.feature.dataprivacy.domain.model.DARItem dARItem = (com.paypal.oslo.feature.dataprivacy.domain.model.DARItem) it3.next();
                            arrayList2.add(new com.paypal.oslo.api.graphql.schema.type.ItemInput(dARItem.getItem(), dARItem.getFields()));
                        }
                        arrayList.add(new com.paypal.oslo.api.graphql.schema.type.CategoryInput(name2, new com.paypal.oslo.api.graphql.schema.type.CriteriaInput(companion2.presentIfNotNull(arrayList2), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(dARCategory.getCriteria().getFormats()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(dARCategory.getCriteria().getStartTime()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(dARCategory.getCriteria().getEndTime()), null, 16, null)));
                        it = it2;
                        coroutine_suspended = obj2;
                        dataPrivacyGraphQLDataSource$createDataAccessRequest$1 = dataPrivacyGraphQLDataSource$createDataAccessRequest$12;
                    }
                    com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1 dataPrivacyGraphQLDataSource$createDataAccessRequest$13 = dataPrivacyGraphQLDataSource$createDataAccessRequest$1;
                    java.lang.Object obj3 = coroutine_suspended;
                    com.paypal.oslo.api.graphql.schema.type.CreateSubjectAccessRequestInput createSubjectAccessRequestInput = new com.paypal.oslo.api.graphql.schema.type.CreateSubjectAccessRequestInput(absent, safeValueOf, channel, safeValueOf2, absent2, safeValueOf3, null, companion.present(arrayList), null, 320, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation createSubjectAccessRequestMutation = new com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation(createSubjectAccessRequestInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str)), 1, 0 == true ? 1 : 0);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Creating data access request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest.getDomain()), kotlin.TuplesKt.to("categoriesCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(createDARRequest.getCategories().size()))), null, 4, null);
                    dataPrivacyGraphQLDataSource = this;
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    createDARRequest2 = createDARRequest;
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.getHighSpeedVideoFpsRanges = createDARRequest2;
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSubjectAccessRequestInput);
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSubjectAccessRequestMutation);
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    dataPrivacyGraphQLDataSource$createDataAccessRequest$13.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(dataPrivacyGraphQLDataSource.getHighSpeedVideoFpsRangesFor, createSubjectAccessRequestMutation, callConfig, dataPrivacyGraphQLDataSource$createDataAccessRequest$13);
                    if (obj == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createDARRequest2 = (com.paypal.oslo.feature.dataprivacy.domain.model.CreateDARRequest) dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dataPrivacyGraphQLDataSource = this;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createDataAccessRequest failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest2.getDomain()), kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data data = (com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createDataAccessRequest succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest2.getDomain()), kotlin.TuplesKt.to("requestId", data.getCreateSubjectAccessRequest().getId())), null, 4, null);
                        return new arrow.core.Ior.Right(data);
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createDataAccessRequest returned null data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest2.getDomain())), null, null, 12, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data data2 = (com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createDataAccessRequest partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest2.getDomain()), kotlin.TuplesKt.to("requestId", data2.getCreateSubjectAccessRequest().getId()), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                        return new arrow.core.Ior.Both(getHighSpeedVideoSizes(callError2), data2);
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createDataAccessRequest partial success with null data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createDARRequest2.getDomain()), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError2));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$createDataAccessRequest$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createDataAccessRequest$1(this, continuation);
        java.lang.Object obj4 = dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$createDataAccessRequest$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj4;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getErasureRequests(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getErasureRequests$1 dataPrivacyGraphQLDataSource$getErasureRequests$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getErasureRequests$1) {
            dataPrivacyGraphQLDataSource$getErasureRequests$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getErasureRequests$1) continuation;
            if ((dataPrivacyGraphQLDataSource$getErasureRequests$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$getErasureRequests$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$getErasureRequests$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$getErasureRequests$1.Camera2StreamConfigurationMap;
                int i2 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput = new com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput(com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.paypal.oslo.api.graphql.schema.type.DSRDomain.PAYPAL, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.DSRRequestType.DATA_ERASURE), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(100)), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(1)), com.apollographql.apollo.api.Optional.INSTANCE.absent());
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery getSubjectAccessRequestsQuery = new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery(subjectAccessRequestsInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str)), i2, 0 == true ? 1 : 0);
                    dataPrivacyGraphQLDataSource$getErasureRequests$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    dataPrivacyGraphQLDataSource$getErasureRequests$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subjectAccessRequestsInput);
                    dataPrivacyGraphQLDataSource$getErasureRequests$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getSubjectAccessRequestsQuery);
                    dataPrivacyGraphQLDataSource$getErasureRequests$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    dataPrivacyGraphQLDataSource$getErasureRequests$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, getSubjectAccessRequestsQuery, callConfig, dataPrivacyGraphQLDataSource$getErasureRequests$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data data = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return data != null ? new arrow.core.Ior.Right(data) : new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data data2 = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null) {
                        return new arrow.core.Ior.Both(getHighSpeedVideoSizes(callError), data2);
                    }
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$getErasureRequests$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getErasureRequests$1(this, continuation);
        java.lang.Object obj2 = dataPrivacyGraphQLDataSource$getErasureRequests$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$getErasureRequests$1.Camera2StreamConfigurationMap;
        int i22 = 1;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createErasureRequest(java.lang.String str, com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest createErasureRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createErasureRequest$1 dataPrivacyGraphQLDataSource$createErasureRequest$1;
        int i;
        java.lang.String str2;
        com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest createErasureRequest2;
        java.lang.String str3;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createErasureRequest$1) {
            dataPrivacyGraphQLDataSource$createErasureRequest$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createErasureRequest$1) continuation;
            if ((dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$createErasureRequest$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizesFor;
                int i2 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback feedback = createErasureRequest.getFeedback();
                    com.paypal.oslo.core.network.graphql.AuthType authType = null;
                    java.lang.Object[] objArr = 0;
                    java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> reasons = feedback != null ? feedback.getReasons() : null;
                    if (reasons == null) {
                        reasons = kotlin.collections.CollectionsKt.emptyList();
                    }
                    java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list = reasons;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int i3 = com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason) it.next()).ordinal()];
                        if (i3 == 1) {
                            str3 = "I have another PayPal account";
                        } else if (i3 == 2) {
                            str3 = "This is my only PayPal account, but I don't use it";
                        } else if (i3 == 3) {
                            str3 = "I'm concerned about data privacy";
                        } else if (i3 == 4) {
                            str3 = "I receive too many emails and notifications";
                        } else {
                            if (i3 != 5) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            str3 = "Other reasons (please specify below)";
                        }
                        arrayList.add(str3);
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    com.paypal.oslo.feature.dataprivacy.domain.model.ErasureFeedback feedback2 = createErasureRequest.getFeedback();
                    if (feedback2 == null || (str2 = feedback2.getComments()) == null || kotlin.text.StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) arrayList2, str2);
                    }
                    java.lang.String requestType = createErasureRequest.getRequestType();
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    com.paypal.oslo.api.graphql.schema.type.CategoryInput categoryInput = new com.paypal.oslo.api.graphql.schema.type.CategoryInput(requestType, new com.paypal.oslo.api.graphql.schema.type.CriteriaInput(null, com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), companion.presentIfNotNull(arrayList2), 1, null));
                    com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                    com.paypal.oslo.api.graphql.schema.type.DSRSource safeValueOf = com.paypal.oslo.api.graphql.schema.type.DSRSource.INSTANCE.safeValueOf(createErasureRequest.getSource());
                    java.lang.String channel = createErasureRequest.getChannel();
                    com.paypal.oslo.api.graphql.schema.type.DSRDomain safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.DSRDomain.INSTANCE.safeValueOf(createErasureRequest.getDomain());
                    com.apollographql.apollo.api.Optional.Absent absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                    com.paypal.oslo.api.graphql.schema.type.DSRRequestType safeValueOf3 = com.paypal.oslo.api.graphql.schema.type.DSRRequestType.INSTANCE.safeValueOf(createErasureRequest.getRequestType());
                    com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.lang.String email = createErasureRequest.getEmail();
                    if (kotlin.text.StringsKt.isBlank(email)) {
                        email = null;
                    }
                    com.paypal.oslo.api.graphql.schema.type.CreateSubjectAccessRequestInput createSubjectAccessRequestInput = new com.paypal.oslo.api.graphql.schema.type.CreateSubjectAccessRequestInput(absent, safeValueOf, channel, safeValueOf2, absent2, safeValueOf3, companion2.presentIfNotNull(email), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(categoryInput)), null, 256, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation createSubjectAccessRequestMutation = new com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation(createSubjectAccessRequestInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(authType, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str)), i2, objArr == true ? 1 : 0);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Creating erasure request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createErasureRequest.getDomain()), kotlin.TuplesKt.to("requestType", createErasureRequest.getRequestType())), null, 4, null);
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoFpsRanges = createErasureRequest;
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSubjectAccessRequestInput);
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSubjectAccessRequestMutation);
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, createSubjectAccessRequestMutation, callConfig, dataPrivacyGraphQLDataSource$createErasureRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    createErasureRequest2 = createErasureRequest;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createErasureRequest2 = (com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest) dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createErasureRequest failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createErasureRequest2.getDomain()), kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data data = (com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null) {
                        return new arrow.core.Ior.Right(data);
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createErasureRequest data not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createErasureRequest2.getDomain())), null, 4, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createErasureRequest partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createErasureRequest2.getDomain()), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data data2 = (com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) graphQLData.getData();
                    if (data2 != null) {
                        return new arrow.core.Ior.Both(getHighSpeedVideoSizes(callError2), data2);
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "createErasureRequest partial success with no data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", createErasureRequest2.getDomain()), kotlin.TuplesKt.to("error", callError2.toString())), null, 4, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes(callError2));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$createErasureRequest$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createErasureRequest$1(this, continuation);
        java.lang.Object obj2 = dataPrivacyGraphQLDataSource$createErasureRequest$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$createErasureRequest$1.getHighSpeedVideoSizesFor;
        int i22 = 1;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getIdentityLinks(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getIdentityLinks$1 dataPrivacyGraphQLDataSource$getIdentityLinks$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getIdentityLinks$1) {
            dataPrivacyGraphQLDataSource$getIdentityLinks$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getIdentityLinks$1) continuation;
            if ((dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.IdentityLinksInput identityLinksInput = new com.paypal.oslo.api.graphql.schema.type.IdentityLinksInput(com.apollographql.apollo.api.Optional.INSTANCE.present(str), null, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.IdentityLinkTenant.PAYPAL), null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)), null, 186, null);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Fetching identity links", null, null, 6, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery getDataPrivacyIdentityLinksQuery = new com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(identityLinksInput));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str)), i2, 0 == true ? 1 : 0);
                    dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityLinksInput);
                    dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDataPrivacyIdentityLinksQuery);
                    dataPrivacyGraphQLDataSource$getIdentityLinks$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, getDataPrivacyIdentityLinksQuery, callConfig, dataPrivacyGraphQLDataSource$getIdentityLinks$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data data = (com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null) {
                        data = Camera2StreamConfigurationMap;
                    }
                    return new arrow.core.Ior.Right(data);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "getIdentityLinks partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", callError.toString())), null, 4, null);
                    com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data data2 = (com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data) graphQLData.getData();
                    if (data2 == null) {
                        data2 = Camera2StreamConfigurationMap;
                    }
                    return new arrow.core.Ior.Both(getHighSpeedVideoSizes(callError), data2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$getIdentityLinks$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getIdentityLinks$1(this, continuation);
        java.lang.Object obj2 = dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$getIdentityLinks$1.getHighResolutionOutputSizeshNQ4ISI;
        int i22 = 1;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NetworkFailure.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.ApiError(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadFile(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, byte[]>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$downloadFile$1 dataPrivacyGraphQLDataSource$downloadFile$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$downloadFile$1) {
            dataPrivacyGraphQLDataSource$downloadFile$1 = (com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$downloadFile$1) continuation;
            if ((dataPrivacyGraphQLDataSource$downloadFile$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dataPrivacyGraphQLDataSource$downloadFile$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dataPrivacyGraphQLDataSource$downloadFile$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataPrivacyGraphQLDataSource$downloadFile$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<java.lang.String, java.lang.String> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-PayPal-Party-Id", str2));
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Downloading file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fileId", str)), null, 4, null);
                    com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService dataPrivacyRestService = this.getHighSpeedVideoSizes;
                    dataPrivacyGraphQLDataSource$downloadFile$1.getHighSpeedVideoFpsRanges = str;
                    dataPrivacyGraphQLDataSource$downloadFile$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    dataPrivacyGraphQLDataSource$downloadFile$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapOf);
                    dataPrivacyGraphQLDataSource$downloadFile$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = dataPrivacyRestService.downloadFile(str, mapOf, dataPrivacyGraphQLDataSource$downloadFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) dataPrivacyGraphQLDataSource$downloadFile$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Ior.Right(((okhttp3.ResponseBody) ((arrow.core.Either.Right) either).getValue()).bytes());
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "downloadFile failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fileId", str), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()).toString())), null, null, 12, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NetworkFailure.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dataPrivacyGraphQLDataSource$downloadFile$1 = new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$downloadFile$1(this, continuation);
        java.lang.Object obj2 = dataPrivacyGraphQLDataSource$downloadFile$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataPrivacyGraphQLDataSource$downloadFile$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.ANOTHER_ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.DONT_USE_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.PRIVACY_CONCERN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.TOO_MANY_EMAILS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.OTHER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
