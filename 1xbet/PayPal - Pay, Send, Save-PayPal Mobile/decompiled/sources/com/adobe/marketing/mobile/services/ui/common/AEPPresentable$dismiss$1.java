package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$dismiss$1", f = "AEPPresentable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AEPPresentable$dismiss$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider appLifecycleProvider;
        com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider;
        com.adobe.marketing.mobile.services.ui.Presentation presentation;
        com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate;
        com.adobe.marketing.mobile.services.ui.common.PresentationObserver presentationObserver;
        com.adobe.marketing.mobile.services.ui.Presentation presentation2;
        com.adobe.marketing.mobile.services.ui.Presentation presentation3;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appLifecycleProvider = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
            appLifecycleProvider.unregisterListener$core_phoneRelease(this.getHighSpeedVideoSizes);
            if (this.getHighSpeedVideoSizes.getState() != com.adobe.marketing.mobile.services.ui.Presentable.State.DETACHED) {
                presentationUtilityProvider = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).getInputSizeshNQ4ISI;
                android.app.Activity currentActivity = presentationUtilityProvider.getCurrentActivity();
                if (currentActivity == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Current activity is null. Cannot dismiss presentable.", new java.lang.Object[0]);
                    presentation2 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap;
                    presentation2.getListener().onError(this.getHighSpeedVideoSizes, com.adobe.marketing.mobile.services.ui.NoActivityToDetachFrom.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                com.adobe.marketing.mobile.services.ui.common.AEPPresentable.access$dismiss(this.getHighSpeedVideoSizes, currentActivity);
                presentation = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap;
                presentation.getListener().onDismiss(this.getHighSpeedVideoSizes);
                presentationDelegate = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).getOutputMinFrameDuration;
                if (presentationDelegate != null) {
                    presentationDelegate.onDismiss(this.getHighSpeedVideoSizes);
                }
                presentationObserver = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).getInputFormats;
                presentationObserver.onPresentationInvisible$core_phoneRelease(this.getHighSpeedVideoSizes.getPresentation());
                return kotlin.Unit.INSTANCE;
            }
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Presentable is already detached. Ignoring dismiss request.", new java.lang.Object[0]);
            presentation3 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap;
            presentation3.getListener().onError(this.getHighSpeedVideoSizes, com.adobe.marketing.mobile.services.ui.AlreadyDismissed.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable$dismiss$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.common.AEPPresentable$dismiss$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AEPPresentable$dismiss$1(com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.common.AEPPresentable$dismiss$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = aEPPresentable;
    }
}
