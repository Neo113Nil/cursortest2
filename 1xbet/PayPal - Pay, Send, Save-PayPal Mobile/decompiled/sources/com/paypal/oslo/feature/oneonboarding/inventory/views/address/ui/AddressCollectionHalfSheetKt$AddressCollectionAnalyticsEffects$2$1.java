package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1", f = "AddressCollectionHalfSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState verificationState = this.getInputFormats;
        if (verificationState instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed) {
            if (this.getHighSpeedVideoFpsRanges.getVisible() && !kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed) this.getInputFormats).getErrorMessage())) {
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.INSTANCE.trackVerificationError(((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed) this.getInputFormats).getErrorMessage(), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            }
        } else if (verificationState instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed) {
            this.getHighSpeedVideoSizes.invoke(((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed) verificationState).getAddress());
            this.getHighSpeedVideoFpsRangesFor.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState verificationState, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionAnalyticsEffects$2$1> continuation) {
        super(2, continuation);
        this.getInputFormats = verificationState;
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = userIntentContext;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
