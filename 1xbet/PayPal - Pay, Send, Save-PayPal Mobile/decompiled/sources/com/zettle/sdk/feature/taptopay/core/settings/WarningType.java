package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/WarningType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "Ljava/lang/String;", "getWarning", "()Ljava/lang/String;", "WARNING_LOCATION", "WARNING_NFC", "WARNING_DEV_OPTIONS"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum WarningType {
    WARNING_LOCATION("location"),
    WARNING_NFC("nfc"),
    WARNING_DEV_OPTIONS("dev_options_detected");

    private final java.lang.String warning;

    WarningType(java.lang.String str) {
        this.warning = str;
    }

    public final java.lang.String getWarning() {
        return this.warning;
    }
}
