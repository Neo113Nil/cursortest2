package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionConfigurationManager$getDefaultConfiguration$2", f = "CompanionConfigurationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class CompanionConfigurationManager$getDefaultConfiguration$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionConfigurationManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            companionAppConfiguration = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            return companionAppConfiguration;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation) {
        return ((com.paypal.oslo.core.companion.data.CompanionConfigurationManager$getDefaultConfiguration$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$getDefaultConfiguration$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionConfigurationManager$getDefaultConfiguration$2(com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionConfigurationManager$getDefaultConfiguration$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = companionConfigurationManager;
    }
}
