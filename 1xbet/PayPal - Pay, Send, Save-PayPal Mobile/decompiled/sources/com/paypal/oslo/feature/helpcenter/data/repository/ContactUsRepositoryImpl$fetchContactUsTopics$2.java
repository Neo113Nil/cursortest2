package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterGenericError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl$fetchContactUsTopics$2", f = "ContactUsRepositoryImpl.kt", i = {0}, l = {39}, m = "invokeSuspend", n = {"apolloCall"}, nl = {40}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class ContactUsRepositoryImpl$fetchContactUsTopics$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> items;
        java.util.List filterNotNull;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics2;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> items2;
        java.util.List filterNotNull2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList2 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            apolloClient = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            com.apollographql.apollo.ApolloCall query = apolloClient.query(new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery());
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        if (ior instanceof arrow.core.Ior.Left) {
            arrow.core.Ior.Left left = (arrow.core.Ior.Left) ior;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "ContactUsTopics network error", com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl.access$toLogAttributes(this.Camera2StreamConfigurationMap, (com.paypal.oslo.core.network.graphql.error.CallError) left.getValue()), null, 4, null);
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl.access$handleError(this.Camera2StreamConfigurationMap, (com.paypal.oslo.core.network.graphql.error.CallError) left.getValue()));
        }
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data data = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
            if (data == null || (helpContactTopics2 = data.getHelpContactTopics()) == null || (items2 = helpContactTopics2.getItems()) == null || (filterNotNull2 = kotlin.collections.CollectionsKt.filterNotNull(items2)) == null) {
                arrayList = null;
            } else {
                java.util.List list = filterNotNull2;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(com.paypal.oslo.feature.helpcenter.data.mapper.ContactUsMapperKt.toDomain((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item) it.next()));
                }
                arrayList = arrayList3;
            }
            java.util.ArrayList arrayList4 = arrayList;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "ContactUsTopics empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", "No contact us topics returned")), null, 4, null);
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No contact us topics returned", null, 2, null));
            }
            return new arrow.core.Ior.Right(arrayList);
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data data2 = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
        if (data2 != null && (helpContactTopics = data2.getHelpContactTopics()) != null && (items = helpContactTopics.getItems()) != null && (filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(items)) != null) {
            java.util.List list2 = filterNotNull;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(com.paypal.oslo.feature.helpcenter.data.mapper.ContactUsMapperKt.toDomain((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item) it2.next()));
            }
            arrayList2 = arrayList5;
        }
        java.util.ArrayList arrayList6 = arrayList2;
        if (arrayList6 == null || arrayList6.isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "ContactUsTopics empty with error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", "No contact us topics returned")), null, 4, null);
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No contact us topics returned", (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()));
        }
        return new arrow.core.Ior.Both(com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl.access$handleError(this.Camera2StreamConfigurationMap, (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()), arrayList2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl$fetchContactUsTopics$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl$fetchContactUsTopics$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactUsRepositoryImpl$fetchContactUsTopics$2(com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl contactUsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl$fetchContactUsTopics$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = contactUsRepositoryImpl;
    }
}
