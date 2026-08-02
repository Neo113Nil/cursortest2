package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/AlreadyDismissed;", "Lcom/adobe/marketing/mobile/services/ui/DismissFailed;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AlreadyDismissed extends com.adobe.marketing.mobile.services.ui.DismissFailed {
    public static final int $stable = 0;
    public static final com.adobe.marketing.mobile.services.ui.AlreadyDismissed INSTANCE = new com.adobe.marketing.mobile.services.ui.AlreadyDismissed();

    private AlreadyDismissed() {
        super("Presentable is already dismissed.", null);
    }
}
