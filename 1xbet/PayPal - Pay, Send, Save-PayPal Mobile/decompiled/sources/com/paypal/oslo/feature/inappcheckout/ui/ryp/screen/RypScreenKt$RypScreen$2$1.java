package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt$RypScreen$2$1", f = "RypScreen.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RypScreenKt$RypScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getInputFormats;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel getOutputMinFrameDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect> effect = this.getOutputFormats.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel = this.getOutputMinFrameDuration;
            final android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            final java.lang.String str = this.getHighSpeedVideoSizesFor;
            final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str3 = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getInputFormats;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> state = this.getInputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt$RypScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt.m15570access$handleEffectCwJ1qa8((com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Effect) obj2, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, authenticationXOResponse, cardSharedViewModel, com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt.access$RypScreen$lambda$0(state), context, str, str2, str3, checkoutLogger);
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt$RypScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt$RypScreen$2$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RypScreenKt$RypScreen$2$1(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.State> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt$RypScreen$2$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = rypViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutCoordinator;
        this.getHighSpeedVideoSizes = authenticationXOResponse;
        this.getOutputMinFrameDuration = cardSharedViewModel;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getInputFormats = checkoutLogger;
        this.getInputSizeshNQ4ISI = state;
    }
}
