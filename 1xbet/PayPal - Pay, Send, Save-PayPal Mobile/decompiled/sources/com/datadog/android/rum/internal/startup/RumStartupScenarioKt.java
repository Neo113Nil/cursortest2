package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "", "getAppStartActivityOnCreateGapNs", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)Ljava/lang/Long;", "appStartActivityOnCreateGapNs", "", "getName", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)Ljava/lang/String;", "name"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumStartupScenarioKt {
    public static final java.lang.String getName(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumStartupScenario, "");
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.Cold) {
            return "cold";
        }
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmAfterActivityDestroyed) {
            return "warm_after_activity_destroyed";
        }
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmFirstActivity) {
            return "warm_first_activity";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.Long getAppStartActivityOnCreateGapNs(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumStartupScenario, "");
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.Cold) {
            return java.lang.Long.valueOf(((com.datadog.android.rum.internal.startup.RumStartupScenario.Cold) rumStartupScenario).getAppStartActivityOnCreateGapNs());
        }
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmFirstActivity) {
            return java.lang.Long.valueOf(((com.datadog.android.rum.internal.startup.RumStartupScenario.WarmFirstActivity) rumStartupScenario).getAppStartActivityOnCreateGapNs());
        }
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmAfterActivityDestroyed) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
