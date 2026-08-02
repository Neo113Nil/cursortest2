package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0010¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/LargeImageTemplateEventHandler;", "Lcom/adobe/marketing/mobile/messaging/MessagingEventHandler;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/LargeImageTemplate;", "Lcom/adobe/marketing/mobile/aepcomposeui/state/LargeImageCardUIState;", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "event", "getNewState$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;)Lcom/adobe/marketing/mobile/aepcomposeui/state/LargeImageCardUIState;", "getHighSpeedVideoFpsRanges", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LargeImageTemplateEventHandler extends com.adobe.marketing.mobile.messaging.MessagingEventHandler<com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.messaging.ContentCardUIEventListener Camera2StreamConfigurationMap;

    public LargeImageTemplateEventHandler(com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener) {
        super(contentCardUIEventListener);
        this.Camera2StreamConfigurationMap = contentCardUIEventListener;
    }

    @Override // com.adobe.marketing.mobile.messaging.MessagingEventHandler
    public final com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState getNewState$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.UIEvent<com.adobe.marketing.mobile.aepcomposeui.uimodels.LargeImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState state = event.getAepUi().getState();
        return event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss ? com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState.copy$default(state, true, false, 2, null) : event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display ? com.adobe.marketing.mobile.aepcomposeui.state.LargeImageCardUIState.copy$default(state, false, true, 1, null) : state;
    }
}
