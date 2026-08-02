package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/zettle/sdk/core/auth/LoggedInState$LoggedIn;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.ZettleServicesImpl$start$2", f = "ServiceProvider.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class ZettleServicesImpl$start$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.zettle.sdk.core.auth.LoggedInState.LoggedIn, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.ZettleServicesImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        okhttp3.OkHttpClient okHttpClient;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            okHttpClient = zettleServicesImpl.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (zettleServicesImpl.refreshServices(okHttpClient, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.zettle.sdk.core.auth.LoggedInState.LoggedIn loggedIn, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.ZettleServicesImpl$start$2) create(loggedIn, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.ZettleServicesImpl$start$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleServicesImpl$start$2(com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.ZettleServicesImpl$start$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = zettleServicesImpl;
    }
}
