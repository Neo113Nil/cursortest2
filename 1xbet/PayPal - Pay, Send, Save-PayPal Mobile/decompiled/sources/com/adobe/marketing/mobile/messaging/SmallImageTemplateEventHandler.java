package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0010¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/SmallImageTemplateEventHandler;", "Lcom/adobe/marketing/mobile/messaging/MessagingEventHandler;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/SmallImageTemplate;", "Lcom/adobe/marketing/mobile/aepcomposeui/state/SmallImageCardUIState;", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "event", "getNewState$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;)Lcom/adobe/marketing/mobile/aepcomposeui/state/SmallImageCardUIState;", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SmallImageTemplateEventHandler extends com.adobe.marketing.mobile.messaging.MessagingEventHandler<com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.messaging.ContentCardUIEventListener getHighSpeedVideoFpsRangesFor;

    public SmallImageTemplateEventHandler(com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener) {
        super(contentCardUIEventListener);
        this.getHighSpeedVideoFpsRangesFor = contentCardUIEventListener;
    }

    @Override // com.adobe.marketing.mobile.messaging.MessagingEventHandler
    public final com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState getNewState$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.UIEvent<com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate, com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState> event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState state = event.getAepUi().getState();
        return event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss ? com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState.copy$default(state, true, false, 2, null) : event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display ? com.adobe.marketing.mobile.aepcomposeui.state.SmallImageCardUIState.copy$default(state, false, true, 1, null) : state;
    }
}
