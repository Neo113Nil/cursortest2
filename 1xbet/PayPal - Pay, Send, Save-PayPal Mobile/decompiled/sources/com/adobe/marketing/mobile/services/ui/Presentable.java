package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Presentable;", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "T", "", "", "dismiss", "()V", "getPresentation", "()Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lcom/adobe/marketing/mobile/services/ui/Presentable$State;", "getState", "()Lcom/adobe/marketing/mobile/services/ui/Presentable$State;", "hide", "show", "State"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface Presentable<T extends com.adobe.marketing.mobile.services.ui.Presentation<?>> {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Presentable$State;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN", "DETACHED"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum State {
        VISIBLE,
        HIDDEN,
        DETACHED
    }

    void dismiss();

    T getPresentation();

    com.adobe.marketing.mobile.services.ui.Presentable.State getState();

    void hide();

    void show();
}
