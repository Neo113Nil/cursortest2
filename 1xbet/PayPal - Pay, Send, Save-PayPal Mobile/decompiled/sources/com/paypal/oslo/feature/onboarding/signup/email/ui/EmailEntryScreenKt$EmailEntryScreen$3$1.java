package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1", f = "EmailEntryScreen.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EmailEntryScreenKt$EmailEntryScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect> analyticsEffects$onboarding_prodRelease = this.Camera2StreamConfigurationMap.getAnalyticsEffects$onboarding_prodRelease();
            final android.content.Context context = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (analyticsEffects$onboarding_prodRelease.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffectKt.handleAnalyticsEffect((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect) obj2, context);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailEntryScreenKt$EmailEntryScreen$3$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = emailViewModel;
        this.getHighSpeedVideoSizes = context;
    }
}
