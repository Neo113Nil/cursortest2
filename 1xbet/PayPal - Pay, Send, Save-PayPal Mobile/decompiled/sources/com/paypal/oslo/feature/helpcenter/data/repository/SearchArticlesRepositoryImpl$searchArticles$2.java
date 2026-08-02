package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/SearchArticleData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$searchArticles$2", f = "SearchArticlesRepositoryImpl.kt", i = {0, 0, 0}, l = {83}, m = "invokeSuspend", n = {"trimmedQuery", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "input"}, nl = {-1}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class SearchArticlesRepositoryImpl$searchArticles$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchHelpArticlesType;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String obj2 = kotlin.text.StringsKt.trim(this.getHighSpeedVideoFpsRangesFor).toString();
        if (kotlin.text.StringsKt.isBlank(obj2)) {
            return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.emptyList());
        }
        if (obj2.length() >= 3) {
            searchHelpArticlesType = com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType.FULL_SEARCH;
        } else {
            searchHelpArticlesType = com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType.TYPE_AHEAD;
        }
        com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput = new com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel.FAQ, com.paypal.oslo.api.graphql.schema.type.AccountCategory.CONSUMER, obj2, searchHelpArticlesType);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchHelpArticlesType);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchHelpArticlesInput);
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object access$executeSearchQuery = com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl.access$executeSearchQuery(this.getOutputFormats, searchHelpArticlesInput, obj2, this);
        return access$executeSearchQuery == coroutine_suspended ? coroutine_suspended : access$executeSearchQuery;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$searchArticles$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$searchArticles$2(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchArticlesRepositoryImpl$searchArticles$2(java.lang.String str, com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl searchArticlesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$searchArticles$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputFormats = searchArticlesRepositoryImpl;
    }
}
