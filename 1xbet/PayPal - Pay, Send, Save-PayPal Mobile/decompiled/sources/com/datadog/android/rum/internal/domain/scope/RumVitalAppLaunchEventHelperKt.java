package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumVitalAppLaunchEventHelperKt {
    public static final /* synthetic */ java.lang.String access$vitalName(com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric) {
        int i = com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelperKt.WhenMappings.$EnumSwitchMapping$0[appLaunchMetric.ordinal()];
        if (i == 1) {
            return "time_to_initial_display";
        }
        if (i == 2) {
            return "time_to_full_display";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.values().length];
            try {
                iArr[com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.TTID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.TTFD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
