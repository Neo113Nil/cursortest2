package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0007@AX\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/InAppMessage;", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "settings", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventListener;", "eventListener", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventListener;)V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;", "<set-?>", "eventHandler", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;", "getEventHandler", "()Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;", "setEventHandler$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;)V", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventListener;", "getEventListener", "()Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventListener;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "getSettings", "()Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppMessage extends com.adobe.marketing.mobile.services.ui.Presentation<com.adobe.marketing.mobile.services.ui.InAppMessage> {
    public static final int $stable = 8;
    public com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler eventHandler;
    private final com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener eventListener;
    private final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings settings;

    public final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings getSettings() {
        return this.settings;
    }

    public final com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener getEventListener() {
        return this.eventListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessage(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, com.adobe.marketing.mobile.services.ui.message.InAppMessageEventListener inAppMessageEventListener) {
        super(inAppMessageEventListener, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageEventListener, "");
        this.settings = inAppMessageSettings;
        this.eventListener = inAppMessageEventListener;
    }

    public final com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler getEventHandler() {
        com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler inAppMessageEventHandler = this.eventHandler;
        if (inAppMessageEventHandler != null) {
            return inAppMessageEventHandler;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setEventHandler$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler inAppMessageEventHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageEventHandler, "");
        this.eventHandler = inAppMessageEventHandler;
    }
}
