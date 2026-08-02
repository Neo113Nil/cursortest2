package com.adobe.marketing.mobile.services.ui.floatingbutton;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonEventListener;", "Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "Lcom/adobe/marketing/mobile/services/ui/FloatingButton;", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "presentable", "", "onPanDetected", "(Lcom/adobe/marketing/mobile/services/ui/Presentable;)V", "onTapDetected"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface FloatingButtonEventListener extends com.adobe.marketing.mobile.services.ui.PresentationEventListener<com.adobe.marketing.mobile.services.ui.FloatingButton> {
    void onPanDetected(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.FloatingButton> presentable);

    void onTapDetected(com.adobe.marketing.mobile.services.ui.Presentable<com.adobe.marketing.mobile.services.ui.FloatingButton> presentable);
}
