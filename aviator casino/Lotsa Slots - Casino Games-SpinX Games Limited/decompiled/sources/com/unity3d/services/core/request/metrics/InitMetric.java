package com.unity3d.services.core.request.metrics;

/* loaded from: classes6.dex */
public class InitMetric {
    private static final java.lang.String INIT_METRIC_ENVIRONMENT_NOT_OK = "native_init_environment_not_ok";
    private static final java.lang.String INIT_METRIC_ENVIRONMENT_OK = "native_init_environment_ok";

    public static com.unity3d.services.core.request.metrics.Metric newInitEnvironmentOk() {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_METRIC_ENVIRONMENT_OK, null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newInitEnvironmentNotOk() {
        return new com.unity3d.services.core.request.metrics.Metric(INIT_METRIC_ENVIRONMENT_NOT_OK, null);
    }
}
