package com.paypal.oslo.feature.pushnotification.preferences;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/PreferencesPushOptInSource;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "key", "Ljava/lang/String;", "getKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PreferencesPushOptInSource implements com.paypal.oslo.feature.pushnotification.api.optin.OptInSource {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pushnotification.preferences.PreferencesPushOptInSource INSTANCE = new com.paypal.oslo.feature.pushnotification.preferences.PreferencesPushOptInSource();
    private static final java.lang.String key = "push_notification_preferences";

    public final int hashCode() {
        return 310186095;
    }

    private PreferencesPushOptInSource() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final /* bridge */ java.lang.String getDisplayName() {
        return super.getDisplayName();
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final java.lang.String getKey() {
        return key;
    }

    public final java.lang.String toString() {
        return "PreferencesPushOptInSource";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.preferences.PreferencesPushOptInSource)) {
            return false;
        }
        return true;
    }
}
