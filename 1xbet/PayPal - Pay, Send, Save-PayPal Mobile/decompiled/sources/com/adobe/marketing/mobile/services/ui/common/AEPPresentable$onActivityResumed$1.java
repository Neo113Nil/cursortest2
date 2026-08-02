package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityResumed$1", f = "AEPPresentable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AEPPresentable$onActivityResumed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRanges.getState() == com.adobe.marketing.mobile.services.ui.Presentable.State.VISIBLE) {
            weakReference = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
            android.app.Activity activity = (android.app.Activity) weakReference.get();
            if (activity != null && !kotlin.jvm.internal.Intrinsics.areEqual(activity, this.getHighResolutionOutputSizeshNQ4ISI)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Detaching from ");
                sb.append(activity);
                sb.append(" before attaching to ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", sb.toString(), new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.ui.common.AEPPresentable.access$detach(this.getHighSpeedVideoFpsRanges, activity);
            }
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityResumed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityResumed$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AEPPresentable$onActivityResumed$1(com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable, android.app.Activity activity, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.common.AEPPresentable$onActivityResumed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = aEPPresentable;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
    }
}
