package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "T", "", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "presentable", "", "onDismiss", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;)V", "Lcom/adobe/marketing/mobile/services/ui/PresentationError;", "error", "onError", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;Lcom/adobe/marketing/mobile/services/ui/PresentationError;)V", "onHide", "onShow"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface PresentationEventListener<T extends com.adobe.marketing.mobile.services.ui.Presentation<T>> {
    void onDismiss(com.adobe.marketing.mobile.services.ui.Presentable<T> presentable);

    void onError(com.adobe.marketing.mobile.services.ui.Presentable<T> presentable, com.adobe.marketing.mobile.services.ui.PresentationError error);

    void onHide(com.adobe.marketing.mobile.services.ui.Presentable<T> presentable);

    void onShow(com.adobe.marketing.mobile.services.ui.Presentable<T> presentable);
}
