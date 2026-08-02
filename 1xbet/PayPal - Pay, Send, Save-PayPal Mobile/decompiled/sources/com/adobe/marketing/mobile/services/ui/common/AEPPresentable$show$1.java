package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.common.AEPPresentable$show$1", f = "AEPPresentable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AEPPresentable$show$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        r0 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) r5.getHighSpeedVideoFpsRangesFor).getOutputMinFrameDuration;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider;
        com.adobe.marketing.mobile.services.ui.common.PresentationObserver presentationObserver;
        com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider appLifecycleProvider;
        com.adobe.marketing.mobile.services.ui.Presentation presentation;
        com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate;
        com.adobe.marketing.mobile.services.ui.common.PresentationObserver presentationObserver2;
        com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate2;
        com.adobe.marketing.mobile.services.ui.Presentation presentation2;
        com.adobe.marketing.mobile.services.ui.Presentation presentation3;
        com.adobe.marketing.mobile.services.ui.Presentation presentation4;
        com.adobe.marketing.mobile.services.ui.Presentation presentation5;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRangesFor.getState() != com.adobe.marketing.mobile.services.ui.Presentable.State.VISIBLE) {
            presentationUtilityProvider = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).getInputSizeshNQ4ISI;
            android.app.Activity currentActivity = presentationUtilityProvider.getCurrentActivity();
            if (currentActivity == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Current activity is null. Cannot show presentable.", new java.lang.Object[0]);
                presentation4 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                presentation4.getListener().onError(this.getHighSpeedVideoFpsRangesFor, com.adobe.marketing.mobile.services.ui.NoAttachableActivity.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable = this.getHighSpeedVideoFpsRangesFor;
            presentationObserver = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) aEPPresentable).getInputFormats;
            if (aEPPresentable.hasConflicts(presentationObserver.getVisiblePresentations$core_phoneRelease())) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Presentable has conflicts with other visible presentations. Ignoring show request.", new java.lang.Object[0]);
                presentation3 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                presentation3.getListener().onError(this.getHighSpeedVideoFpsRangesFor, com.adobe.marketing.mobile.services.ui.ConflictingPresentation.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            if (this.getHighSpeedVideoFpsRangesFor.gateDisplay() && presentationDelegate2 != null && !presentationDelegate2.canShow(this.getHighSpeedVideoFpsRangesFor)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Presentable couldn't be displayed, PresentationDelegate#canShow states the presentable should not be displayed.", new java.lang.Object[0]);
                presentation2 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                presentation2.getListener().onError(this.getHighSpeedVideoFpsRangesFor, com.adobe.marketing.mobile.services.ui.SuppressedByAppDeveloper.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            com.adobe.marketing.mobile.services.ui.common.AEPPresentable.access$show(this.getHighSpeedVideoFpsRangesFor, currentActivity);
            appLifecycleProvider = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
            appLifecycleProvider.registerListener$core_phoneRelease(this.getHighSpeedVideoFpsRangesFor);
            presentation = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            presentation.getListener().onShow(this.getHighSpeedVideoFpsRangesFor);
            presentationDelegate = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).getOutputMinFrameDuration;
            if (presentationDelegate != null) {
                presentationDelegate.onShow(this.getHighSpeedVideoFpsRangesFor);
            }
            presentationObserver2 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).getInputFormats;
            presentationObserver2.onPresentationVisible$core_phoneRelease(this.getHighSpeedVideoFpsRangesFor.getPresentation());
            return kotlin.Unit.INSTANCE;
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "AEPPresentable", "Presentable is already shown. Ignoring show request.", new java.lang.Object[0]);
        presentation5 = ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
        presentation5.getListener().onError(this.getHighSpeedVideoFpsRangesFor, com.adobe.marketing.mobile.services.ui.AlreadyShown.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.common.AEPPresentable$show$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.common.AEPPresentable$show$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AEPPresentable$show$1(com.adobe.marketing.mobile.services.ui.common.AEPPresentable<T> aEPPresentable, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.common.AEPPresentable$show$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = aEPPresentable;
    }
}
