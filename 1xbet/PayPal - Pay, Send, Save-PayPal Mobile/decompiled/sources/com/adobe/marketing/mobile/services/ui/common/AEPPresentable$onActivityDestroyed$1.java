package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityDestroyed$1", f = "AEPPresentable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AEPPresentable$onActivityDestroyed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.adobe.marketing.mobile.services.ui.common.AEPPresentable.access$detach(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityDestroyed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityDestroyed$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AEPPresentable$onActivityDestroyed$1(com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable, android.app.Activity activity, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityDestroyed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = aEPPresentable;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
    }
}
