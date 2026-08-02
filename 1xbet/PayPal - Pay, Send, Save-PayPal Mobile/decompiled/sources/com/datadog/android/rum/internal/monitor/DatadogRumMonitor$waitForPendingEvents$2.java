package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoSizes", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DatadogRumMonitor$waitForPendingEvents$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
    public static final com.datadog.android.rum.internal.monitor.DatadogRumMonitor$waitForPendingEvents$2 getHighSpeedVideoSizes = new com.datadog.android.rum.internal.monitor.DatadogRumMonitor$waitForPendingEvents$2();

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke() {
        return "Waiting for pending RUM events was interrupted";
    }

    DatadogRumMonitor$waitForPendingEvents$2() {
        super(0);
    }
}
