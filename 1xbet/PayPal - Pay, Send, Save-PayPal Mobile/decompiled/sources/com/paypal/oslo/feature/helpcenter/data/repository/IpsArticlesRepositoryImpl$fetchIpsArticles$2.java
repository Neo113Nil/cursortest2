package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterGenericError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/IpsArticleData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl$fetchIpsArticles$2", f = "IpsArticlesRepositoryImpl.kt", i = {0, 0, 0}, l = {68}, m = "invokeSuspend", n = {"input", "query", "apolloCall"}, nl = {69}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class IpsArticlesRepositoryImpl$fetchIpsArticles$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError helpCenterGenericError;
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.InProductSupportHelpArticles inProductSupportHelpArticles;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput inProductSupportHelpArticlesInput = new com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel.FAQ, com.paypal.oslo.api.graphql.schema.type.AccountCategory.CONSUMER, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery getHelpCenterIpsArticlesQuery = new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery(inProductSupportHelpArticlesInput);
            apolloClient = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            com.apollographql.apollo.ApolloCall query = apolloClient.query(getHelpCenterIpsArticlesQuery);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(inProductSupportHelpArticlesInput);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHelpCenterIpsArticlesQuery);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
            this.getHighSpeedVideoSizesFor = 1;
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
        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ior.leftOrNull();
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Data data = graphQLData != null ? (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Data) graphQLData.getData() : null;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item> items = (data == null || (inProductSupportHelpArticles = data.getInProductSupportHelpArticles()) == null) ? null : inProductSupportHelpArticles.getItems();
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item> list = items;
        if (list == null || list.isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "IpsArticles Empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", "No IPS articles returned")), null, 4, null);
            if (callError != null) {
                helpCenterGenericError = com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl.access$handleError(this.getOutputFormats, callError);
            } else {
                helpCenterGenericError = new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No IPS articles returned", null);
            }
            return new arrow.core.Ior.Left(helpCenterGenericError);
        }
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item> list2 = items;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item item : list2) {
            java.lang.String id = item.getId();
            java.lang.String title = item.getTitle();
            java.lang.String excerpt = item.getExcerpt();
            com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory = item.getContentCategory();
            arrayList.add(new com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData(new com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview(id, title, excerpt, contentCategory != null ? contentCategory.name() : null)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (callError != null) {
            return new arrow.core.Ior.Both(com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl.access$handleError(this.getOutputFormats, callError), arrayList2);
        }
        return new arrow.core.Ior.Right(arrayList2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl$fetchIpsArticles$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl$fetchIpsArticles$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpsArticlesRepositoryImpl$fetchIpsArticles$2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl ipsArticlesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl$fetchIpsArticles$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getOutputFormats = ipsArticlesRepositoryImpl;
    }
}
