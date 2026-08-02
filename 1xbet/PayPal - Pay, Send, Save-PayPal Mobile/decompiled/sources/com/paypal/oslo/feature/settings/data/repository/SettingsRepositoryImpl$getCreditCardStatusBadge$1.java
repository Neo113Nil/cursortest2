package com.paypal.oslo.feature.settings.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCreditCardStatusBadge$1", f = "SettingsRepositoryImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsRepositoryImpl$getCreditCardStatusBadge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        iSettingsApolloClient = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object creditAutoPayStatus = iSettingsApolloClient.getCreditAutoPayStatus(this);
        return creditAutoPayStatus == coroutine_suspended ? coroutine_suspended : creditAutoPayStatus;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCreditCardStatusBadge$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCreditCardStatusBadge$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsRepositoryImpl$getCreditCardStatusBadge$1(com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl settingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCreditCardStatusBadge$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = settingsRepositoryImpl;
    }
}
