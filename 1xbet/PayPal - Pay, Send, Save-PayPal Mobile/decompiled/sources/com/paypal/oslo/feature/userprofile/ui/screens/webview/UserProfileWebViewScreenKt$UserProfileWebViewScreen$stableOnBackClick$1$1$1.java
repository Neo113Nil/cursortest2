package com.paypal.oslo.feature.userprofile.ui.screens.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1", f = "UserProfileWebViewScreen.kt", i = {0, 0, 0}, l = {68}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1$1"}, nl = {67}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoSizes;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizesFor = 1;
                obj = com.paypal.oslo.core.userstore.UserStore.refresh$default(userStore, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((com.paypal.oslo.core.userstore.model.User) obj);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("url", str);
            pairArr[1] = kotlin.TuplesKt.to("source", str2);
            java.lang.String message = m23439exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(m23439exceptionOrNullimpl.getClass()).getSimpleName();
            }
            pairArr[2] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to refresh user profile after webview operations", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1 userProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1 = new com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        userProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1.getInputSizeshNQ4ISI = obj;
        return userProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1(com.paypal.oslo.core.userstore.UserStore userStore, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt$UserProfileWebViewScreen$stableOnBackClick$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
    }
}
