package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/UIService;", "", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "T", "presentation", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "presentationUtilityProvider", "Lcom/adobe/marketing/mobile/services/ui/Presentable;", "create", "(Lcom/adobe/marketing/mobile/services/ui/Presentation;Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;)Lcom/adobe/marketing/mobile/services/ui/Presentable;", "Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;", "presentationDelegate", "", "setPresentationDelegate", "(Lcom/adobe/marketing/mobile/services/ui/PresentationDelegate;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface UIService {
    <T extends com.adobe.marketing.mobile.services.ui.Presentation<T>> com.adobe.marketing.mobile.services.ui.Presentable<T> create(T presentation, com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider);

    void setPresentationDelegate(com.adobe.marketing.mobile.services.ui.PresentationDelegate presentationDelegate);
}
