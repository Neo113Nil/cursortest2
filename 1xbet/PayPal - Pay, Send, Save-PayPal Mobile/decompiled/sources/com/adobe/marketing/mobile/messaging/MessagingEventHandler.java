package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0001\u001dB\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00028\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH ¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/MessagingEventHandler;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;", "event", "getNewState$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;)Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "", "propositionId", "", "onEvent$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent;Ljava/lang/String;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Interact;", "onInteractEvent$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/UIEvent$Interact;Ljava/lang/String;)V", "interaction", "Lcom/adobe/marketing/mobile/MessagingEdgeEventType;", "eventType", "track$messaging_phoneRelease", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/MessagingEdgeEventType;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class MessagingEventHandler<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> {
    private final com.adobe.marketing.mobile.messaging.ContentCardUIEventListener getHighResolutionOutputSizeshNQ4ISI;

    public abstract S getNewState$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.UIEvent<T, S> event);

    public MessagingEventHandler(com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = contentCardUIEventListener;
    }

    public final void onEvent$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.UIEvent<T, S> event, java.lang.String propositionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propositionId, "");
        com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> aepUi = event.getAepUi();
        if (event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(event.getAepUi().getTemplate().getType());
            sb.append(" with id ");
            sb.append(propositionId);
            sb.append(" is displayed");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", sb.toString(), new java.lang.Object[0]);
            if (event.getAepUi().getState().getDisplayed()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", "UI already displayed, skipping handling display event", new java.lang.Object[0]);
                return;
            }
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", "UI displayed for the first time, sending display tracking event", new java.lang.Object[0]);
            aepUi.updateState(getNewState$messaging_phoneRelease(event));
            track$messaging_phoneRelease(propositionId, null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISPLAY);
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener = this.getHighResolutionOutputSizeshNQ4ISI;
            if (contentCardUIEventListener != null) {
                contentCardUIEventListener.onDisplay(event.getAepUi());
                return;
            }
            return;
        }
        if (event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(event.getAepUi().getTemplate().getType());
            sb2.append(" with id ");
            sb2.append(propositionId);
            sb2.append(" is dismissed");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", sb2.toString(), new java.lang.Object[0]);
            if (event.getAepUi().getState().getDismissed()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", "UI already dismissed, skipping handling dismiss tracking event", new java.lang.Object[0]);
                return;
            }
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", "UI dismissed for the first time, sending dismiss tracking event", new java.lang.Object[0]);
            aepUi.updateState(getNewState$messaging_phoneRelease(event));
            track$messaging_phoneRelease(propositionId, null, com.adobe.marketing.mobile.MessagingEdgeEventType.DISMISS);
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (contentCardUIEventListener2 != null) {
                contentCardUIEventListener2.onDismiss(event.getAepUi());
                return;
            }
            return;
        }
        if (event instanceof com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(event.getAepUi().getTemplate().getType());
            sb3.append(" with id ");
            sb3.append(propositionId);
            sb3.append(" is interacted");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", sb3.toString(), new java.lang.Object[0]);
            onInteractEvent$messaging_phoneRelease((com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact) event, propositionId);
        }
    }

    public void onInteractEvent$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact<T, S> event, java.lang.String propositionId) {
        java.lang.String actionUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propositionId, "");
        com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplateType type = event.getAepUi().getTemplate().getType();
        if (event.getAction() instanceof com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) {
            com.adobe.marketing.mobile.messaging.ContentCardUIEventListener contentCardUIEventListener = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(contentCardUIEventListener != null ? java.lang.Boolean.valueOf(contentCardUIEventListener.onInteract(event.getAepUi(), ((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getId(), ((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getActionUrl())) : null, java.lang.Boolean.TRUE) && (actionUrl = ((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getActionUrl()) != null && actionUrl.length() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(type);
                sb.append(" opening URL: ");
                sb.append(((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getActionUrl());
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", sb.toString(), new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getUriService().openUri(((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getActionUrl());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(type);
            sb2.append(' ');
            sb2.append(((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getId());
            sb2.append(" clicked");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingEventHandler", sb2.toString(), new java.lang.Object[0]);
            track$messaging_phoneRelease(propositionId, ((com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) event.getAction()).getId(), com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT);
        }
    }

    public final void track$messaging_phoneRelease(java.lang.String propositionId, java.lang.String interaction, com.adobe.marketing.mobile.MessagingEdgeEventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propositionId, "");
        com.adobe.marketing.mobile.messaging.ContentCardSchemaData contentCardSchemaData = com.adobe.marketing.mobile.messaging.ContentCardMapper.INSTANCE.getInstance().getContentCardSchemaData(propositionId);
        if (contentCardSchemaData != null) {
            contentCardSchemaData.track(interaction, eventType);
        }
    }
}
