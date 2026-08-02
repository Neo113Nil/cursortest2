package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$hide$1", f = "AEPPresentable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AEPPresentable$hide$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.adobe.marketing.mobile.services.ui.Presentation presentation;
        com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate;
        com.adobe.marketing.mobile.services.ui.common.PresentationObserver presentationObserver;
        com.adobe.marketing.mobile.services.ui.Presentation presentation2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighResolutionOutputSizeshNQ4ISI.getState() != com.adobe.marketing.mobile.services.ui.Presentable.State.VISIBLE) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Presentable is already hidden. Ignoring hide request.", new java.lang.Object[0]);
            presentation2 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            presentation2.getListener().onError(this.getHighResolutionOutputSizeshNQ4ISI, com.adobe.marketing.mobile.services.ui.AlreadyHidden.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getPresentationStateManager().onHidden();
        presentation = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
        presentation.getListener().onHide(this.getHighResolutionOutputSizeshNQ4ISI);
        presentationDelegate = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighResolutionOutputSizeshNQ4ISI).getOutputMinFrameDuration;
        if (presentationDelegate != null) {
            presentationDelegate.onHide(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        presentationObserver = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighResolutionOutputSizeshNQ4ISI).getInputFormats;
        presentationObserver.onPresentationInvisible$core_phoneRelease(this.getHighResolutionOutputSizeshNQ4ISI.getPresentation());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable$hide$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.common.AEPPresentable$hide$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AEPPresentable$hide$1(com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.common.AEPPresentable$hide$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = aEPPresentable;
    }
}
