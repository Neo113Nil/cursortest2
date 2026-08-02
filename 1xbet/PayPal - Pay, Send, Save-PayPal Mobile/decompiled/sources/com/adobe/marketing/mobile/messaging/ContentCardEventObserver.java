package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u000b\u001a\u00020\u000e8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u00118CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardEventObserver;", "Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "event", "", "onEvent", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;)V", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/messaging/ImageOnlyTemplateEventHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Lcom/adobe/marketing/mobile/messaging/LargeImageTemplateEventHandler;", "getHighSpeedVideoFpsRanges", "Lcom/adobe/marketing/mobile/messaging/SmallImageTemplateEventHandler;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCardEventObserver implements com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.messaging.ContentCardUIEventListener getHighSpeedVideoFpsRangesFor;
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.messaging.SmallImageTemplateEventHandler>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardEventObserver$smallImageEventHandler$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.messaging.SmallImageTemplateEventHandler invoke() {
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener;
            contentCardUIEventListener = com.adobe.marketing.mobile.messaging.ContentCardEventObserver.this.getHighSpeedVideoFpsRangesFor;
            return new com.adobe.marketing.mobile.messaging.SmallImageTemplateEventHandler(contentCardUIEventListener);
        }

        {
            super(0);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.messaging.LargeImageTemplateEventHandler>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardEventObserver$largeImageEventHandler$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.messaging.LargeImageTemplateEventHandler invoke() {
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener;
            contentCardUIEventListener = com.adobe.marketing.mobile.messaging.ContentCardEventObserver.this.getHighSpeedVideoFpsRangesFor;
            return new com.adobe.marketing.mobile.messaging.LargeImageTemplateEventHandler(contentCardUIEventListener);
        }

        {
            super(0);
        }
    });

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.messaging.ImageOnlyTemplateEventHandler>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardEventObserver$imageOnlyEventHandler$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.messaging.ImageOnlyTemplateEventHandler invoke() {
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener;
            contentCardUIEventListener = com.adobe.marketing.mobile.messaging.ContentCardEventObserver.this.getHighSpeedVideoFpsRangesFor;
            return new com.adobe.marketing.mobile.messaging.ImageOnlyTemplateEventHandler(contentCardUIEventListener);
        }

        {
            super(0);
        }
    });

    public ContentCardEventObserver(com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener) {
        this.getHighSpeedVideoFpsRangesFor = contentCardUIEventListener;
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver
    public final void onEvent(com.adobe.marketing.mobile.aepcomposeui.UIEvent<?, ?> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.Object template = event.getAepUi().getTemplate();
        if (template instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate) {
            ((com.adobe.marketing.mobile.messaging.SmallImageTemplateEventHandler) this.Camera2StreamConfigurationMap.getValue()).onEvent$messaging_phoneRelease(event, ((com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate) template).getId());
        } else if (template instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate) {
            ((com.adobe.marketing.mobile.messaging.LargeImageTemplateEventHandler) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).onEvent$messaging_phoneRelease(event, ((com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate) template).getId());
        } else if (template instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.ImageOnlyTemplate) {
            ((com.adobe.marketing.mobile.messaging.ImageOnlyTemplateEventHandler) this.getHighSpeedVideoSizes.getValue()).onEvent$messaging_phoneRelease(event, ((com.adobe.marketing.mobile.aepcomposeui.uimodels.ImageOnlyTemplate) template).getId());
        }
    }
}
