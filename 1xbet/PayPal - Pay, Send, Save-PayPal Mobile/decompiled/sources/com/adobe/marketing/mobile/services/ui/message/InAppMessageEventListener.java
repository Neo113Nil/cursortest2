package com.adobe.marketing.mobile.services.ui.message;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventListener;", "Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "Lcom/adobe/marketing/mobile/services/ui/InAppMessage;", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "message", "", "onBackPressed", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;)V", "", "url", "", "onUrlLoading", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;Ljava/lang/String;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface InAppMessageEventListener extends com.adobe.marketing.mobile.services.ui.PresentationEventListener<com.adobe.marketing.mobile.services.ui.InAppMessage> {
    void onBackPressed(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> message);

    boolean onUrlLoading(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.InAppMessage> message, java.lang.String url);
}
