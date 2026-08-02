package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "current", "previous", "", "trackScreenAppeared$telemetry_release", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)V", "trackScreenDisappeared$telemetry_release", "navKey", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "getTrackerInstance$telemetry_release", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Nav3ViewTracker {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker getTrackerInstance$telemetry_release(androidx.navigation3.runtime.NavKey navKey);

    public abstract void trackScreenAppeared$telemetry_release(androidx.navigation3.runtime.NavKey current, androidx.navigation3.runtime.NavKey previous);

    public abstract void trackScreenDisappeared$telemetry_release(androidx.navigation3.runtime.NavKey current, androidx.navigation3.runtime.NavKey previous);
}
