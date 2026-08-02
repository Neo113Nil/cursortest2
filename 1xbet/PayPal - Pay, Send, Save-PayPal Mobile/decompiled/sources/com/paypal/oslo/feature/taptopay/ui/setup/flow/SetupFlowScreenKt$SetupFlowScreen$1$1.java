package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1", f = "SetupFlowScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetupFlowScreenKt$SetupFlowScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.commonui.utils.RefText subtitle;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint = this.getHighResolutionOutputSizeshNQ4ISI.getEntryPoint();
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo preSelectedCard = this.getHighResolutionOutputSizeshNQ4ISI.getPreSelectedCard();
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo preSelectedCard2 = this.getHighResolutionOutputSizeshNQ4ISI.getPreSelectedCard();
        java.lang.String value = (preSelectedCard2 == null || (subtitle = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getSubtitle(preSelectedCard2)) == null) ? null : com.paypal.oslo.core.commonui.utils.RefTextKt.value(subtitle, this.getHighSpeedVideoFpsRangesFor);
        if (value == null) {
            value = "";
        }
        setupFlowCoordinator.onIntent(new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.Initialize(entryPoint, preSelectedCard, value));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupFlowScreenKt$SetupFlowScreen$1$1(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = setupFlowCoordinator;
        this.getHighResolutionOutputSizeshNQ4ISI = setupFlowDestination;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
