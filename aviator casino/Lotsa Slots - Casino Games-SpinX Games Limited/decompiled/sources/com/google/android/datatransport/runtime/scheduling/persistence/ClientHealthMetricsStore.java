package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes3.dex */
public interface ClientHealthMetricsStore {
    com.google.android.datatransport.runtime.firebase.transport.ClientMetrics loadClientMetrics();

    void recordLogEventDropped(long j, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason, java.lang.String str);

    void resetClientMetrics();
}
