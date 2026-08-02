package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError$NetworkError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2", f = "RecentSearchRepositoryImpls.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError.NetworkError, ? extends kotlin.Unit>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.api.NetworkType getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dagger.Lazy lazy;
        com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lazy = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj2 = lazy.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            contactDomainModelMapper = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloClient) obj2, new com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation(new com.paypal.oslo.api.graphql.schema.type.DeleteRecentSearchesInput(contactDomainModelMapper.mapNetworkTypeToGraphQL(this.getHighSpeedVideoFpsRanges))), (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
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
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.contacts.api.RecentSearchError.NetworkError.INSTANCE);
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
        }
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            return new arrow.core.Ior.Both(com.paypal.oslo.feature.contacts.api.RecentSearchError.NetworkError.INSTANCE, kotlin.Unit.INSTANCE);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError.NetworkError, ? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2(com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl deleteRecentSearchesRepositoryImpl, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl$deleteRecentSearches$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = deleteRecentSearchesRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = networkType;
    }
}
