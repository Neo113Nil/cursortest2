package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/internal/profiler/BenchmarkMeter;", "", "", "metricName", "", "tags", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "", "createObservableGauge", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lcom/datadog/android/internal/profiler/BenchmarkCounter;", "getCounter", "(Ljava/lang/String;)Lcom/datadog/android/internal/profiler/BenchmarkCounter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BenchmarkMeter {
    void createObservableGauge(java.lang.String metricName, java.util.Map<java.lang.String, java.lang.String> tags, kotlin.jvm.functions.Function0<java.lang.Double> callback);

    com.datadog.android.internal.profiler.BenchmarkCounter getCounter(java.lang.String operation);
}
