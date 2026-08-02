package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$sendEffect$1", f = "LinkAgreementsViewModel.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, nl = {161}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsViewModel$sendEffect$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            channel = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (channel.send(this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$sendEffect$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$sendEffect$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsViewModel$sendEffect$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel linkAgreementsViewModel, com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect linkAgreementsUiEffect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$sendEffect$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = linkAgreementsViewModel;
        this.getHighSpeedVideoSizes = linkAgreementsUiEffect;
    }
}
