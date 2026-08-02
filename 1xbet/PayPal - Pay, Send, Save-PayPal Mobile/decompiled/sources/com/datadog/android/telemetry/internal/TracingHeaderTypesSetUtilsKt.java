package com.datadog.android.telemetry.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/internal/telemetry/TracingHeaderTypesSet;", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "toSelectedTracingPropagators", "(Lcom/datadog/android/internal/telemetry/TracingHeaderTypesSet;)Ljava/util/List;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TracingHeaderTypesSetUtilsKt {
    public static final java.util.List<com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator> toSelectedTracingPropagators(com.datadog.android.internal.telemetry.TracingHeaderTypesSet tracingHeaderTypesSet) {
        com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator selectedTracingPropagator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeaderTypesSet, "");
        java.util.Set<com.datadog.android.internal.telemetry.TracingHeaderType> types = tracingHeaderTypesSet.getTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(types, 10));
        java.util.Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            int i = com.datadog.android.telemetry.internal.TracingHeaderTypesSetUtilsKt.WhenMappings.$EnumSwitchMapping$0[((com.datadog.android.internal.telemetry.TracingHeaderType) it.next()).ordinal()];
            if (i == 1) {
                selectedTracingPropagator = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator.DATADOG;
            } else if (i == 2) {
                selectedTracingPropagator = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator.B3;
            } else if (i == 3) {
                selectedTracingPropagator = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator.B3MULTI;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                selectedTracingPropagator = com.datadog.android.telemetry.model.TelemetryConfigurationEvent.SelectedTracingPropagator.TRACECONTEXT;
            }
            arrayList.add(selectedTracingPropagator);
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.internal.telemetry.TracingHeaderType.values().length];
            try {
                iArr[com.datadog.android.internal.telemetry.TracingHeaderType.DATADOG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.internal.telemetry.TracingHeaderType.B3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.internal.telemetry.TracingHeaderType.B3MULTI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.internal.telemetry.TracingHeaderType.TRACECONTEXT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
