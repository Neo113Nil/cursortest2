package com.paypal.oslo.feature.settings.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/util/SettingsNotificationsOptInSource;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "<init>", "()V", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsNotificationsOptInSource implements com.paypal.oslo.feature.pushnotification.api.optin.OptInSource {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.ui.util.SettingsNotificationsOptInSource INSTANCE = new com.paypal.oslo.feature.settings.ui.util.SettingsNotificationsOptInSource();
    private static final java.lang.String key = "settings_receive_notification";

    private SettingsNotificationsOptInSource() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final /* bridge */ java.lang.String getDisplayName() {
        return super.getDisplayName();
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final java.lang.String getKey() {
        return key;
    }
}
