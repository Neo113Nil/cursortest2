package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/TtfdReporter;", "Lcom/paypal/oslo/core/telemetry/vendors/datadog/TTFDReporting;", "<init>", "()V", "", "reportFullyDrawn"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TtfdReporter implements com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TtfdReporter() {
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.datadog.TTFDReporting
    public final void reportFullyDrawn() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Reporting TTFD to Datadog", null, null, 6, null);
        com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null).reportAppFullyDisplayed();
    }
}
