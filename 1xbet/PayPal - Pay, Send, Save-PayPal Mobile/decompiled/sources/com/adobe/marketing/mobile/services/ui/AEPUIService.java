package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0018\u001a\u00020\u00158CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/AEPUIService;", "Lcom/adobe/marketing/mobile/services/ui/UIService;", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "T", "presentation", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "presentationUtilityProvider", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "create", "(Lcom/adobe/marketing/mobile/services/ui/Presentation;Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;)Lcom/adobe/marketing/mobile/services/ui/Presentable;", "Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;", "presentationDelegate", "", "setPresentationDelegate", "(Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;)V", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AEPUIService implements com.adobe.marketing.mobile.services.ui.UIService {
    private com.adobe.marketing.mobile.services.ui.PresentationDelegate getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineExceptionHandler Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.services.ui.AEPUIService$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.adobe.marketing.mobile.services.ui.AEPUIService$mainScope$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.CoroutineScope invoke() {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler;
            kotlin.coroutines.CoroutineContext plus = kotlinx.coroutines.Dispatchers.getMain().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null));
            coroutineExceptionHandler = com.adobe.marketing.mobile.services.ui.AEPUIService.this.Camera2StreamConfigurationMap;
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(plus.plus(coroutineExceptionHandler));
        }

        {
            super(0);
        }
    });

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public final <T extends com.adobe.marketing.mobile.services.ui.Presentation<T>> com.adobe.marketing.mobile.services.ui.Presentable<T> create(T presentation, com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationUtilityProvider, "");
        android.app.Application application = presentationUtilityProvider.getApplication();
        if (application == null) {
            throw new java.lang.IllegalStateException("Application is null. Please provide a valid application instance.");
        }
        com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.INSTANCE.getINSTANCE().start$core_phoneRelease(application);
        if (presentation instanceof com.adobe.marketing.mobile.services.ui.InAppMessage) {
            return new com.adobe.marketing.mobile.services.ui.message.InAppMessagePresentable((com.adobe.marketing.mobile.services.ui.InAppMessage) presentation, this.getHighSpeedVideoFpsRangesFor, presentationUtilityProvider, com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.INSTANCE.getINSTANCE(), (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges.getValue());
        }
        if (presentation instanceof com.adobe.marketing.mobile.services.ui.Alert) {
            return new com.adobe.marketing.mobile.services.ui.alert.AlertPresentable((com.adobe.marketing.mobile.services.ui.Alert) presentation, this.getHighSpeedVideoFpsRangesFor, presentationUtilityProvider, com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.INSTANCE.getINSTANCE(), (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges.getValue());
        }
        if (presentation instanceof com.adobe.marketing.mobile.services.ui.FloatingButton) {
            com.adobe.marketing.mobile.services.ui.FloatingButton floatingButton = (com.adobe.marketing.mobile.services.ui.FloatingButton) presentation;
            return new com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable(floatingButton, new com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel(floatingButton.getSettings()), this.getHighSpeedVideoFpsRangesFor, presentationUtilityProvider, com.adobe.marketing.mobile.services.ui.common.AppLifecycleProvider.INSTANCE.getINSTANCE(), (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges.getValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Presentation type: ");
        sb.append(presentation);
        sb.append(" not supported");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.adobe.marketing.mobile.services.ui.UIService
    public final void setPresentationDelegate(com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationDelegate, "");
        this.getHighSpeedVideoFpsRangesFor = presentationDelegate;
    }
}
