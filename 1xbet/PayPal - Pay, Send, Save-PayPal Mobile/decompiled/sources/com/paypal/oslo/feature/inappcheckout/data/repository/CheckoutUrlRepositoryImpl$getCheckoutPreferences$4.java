package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$getCheckoutPreferences$4", f = "CheckoutUrlRepositoryImpl.kt", i = {0}, l = {73}, m = "invokeSuspend", n = {"query"}, nl = {142}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CheckoutUrlRepositoryImpl$getCheckoutPreferences$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError, ? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery getCheckoutPreferencesQuery = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetCheckoutPreferencesQuery(this.getHighSpeedVideoFpsRanges.getValue(), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutPreferencesMapperKt.toGraphQLTokenType(this.getHighSpeedVideoFpsRanges.getType())));
            apolloClient = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCheckoutPreferencesQuery);
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getCheckoutPreferencesQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
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
        com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl checkoutUrlRepositoryImpl = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            return com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl.access$handleCallError(checkoutUrlRepositoryImpl, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl.access$handleResult(checkoutUrlRepositoryImpl, (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        java.lang.Object leftValue = both.getLeftValue();
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutUrlRepositoryImpl.getHighSpeedVideoSizes, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Unexpected state: both error and data present", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError("Unexpected state: both error and data present"));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError, ? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$getCheckoutPreferences$4) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$getCheckoutPreferences$4(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutUrlRepositoryImpl$getCheckoutPreferences$4(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl checkoutUrlRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl$getCheckoutPreferences$4> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = checkoutToken;
        this.Camera2StreamConfigurationMap = checkoutUrlRepositoryImpl;
    }
}
