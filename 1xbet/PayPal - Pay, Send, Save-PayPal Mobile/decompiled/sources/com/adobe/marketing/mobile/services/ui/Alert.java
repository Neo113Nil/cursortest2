package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Alert;", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "settings", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertEventListener;", "eventListener", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;Lcom/adobe/marketing/mobile/services/ui/alert/AlertEventListener;)V", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertEventListener;", "getEventListener", "()Lcom/adobe/marketing/mobile/services/ui/alert/AlertEventListener;", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "getSettings", "()Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Alert extends com.adobe.marketing.mobile.services.ui.Presentation<com.adobe.marketing.mobile.services.ui.Alert> {
    public static final int $stable = 8;
    private final com.adobe.marketing.mobile.services.ui.alert.AlertEventListener eventListener;
    private final com.adobe.marketing.mobile.services.ui.alert.AlertSettings settings;

    public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings getSettings() {
        return this.settings;
    }

    public final com.adobe.marketing.mobile.services.ui.alert.AlertEventListener getEventListener() {
        return this.eventListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Alert(com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings, com.adobe.marketing.mobile.services.ui.alert.AlertEventListener alertEventListener) {
        super(alertEventListener, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertEventListener, "");
        this.settings = alertSettings;
        this.eventListener = alertEventListener;
    }
}
