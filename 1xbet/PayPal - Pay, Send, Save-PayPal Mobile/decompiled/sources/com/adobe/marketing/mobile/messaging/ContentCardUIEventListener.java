package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J3\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardUIEventListener;", "", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "aepUI", "", "onDismiss", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)V", "onDisplay", "", "interactionId", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.ACTION_URL, "", "onInteract", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface ContentCardUIEventListener {
    void onDismiss(com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?> aepUI);

    void onDisplay(com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?> aepUI);

    boolean onInteract(com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?> aepUI, java.lang.String interactionId, java.lang.String actionUrl);
}
