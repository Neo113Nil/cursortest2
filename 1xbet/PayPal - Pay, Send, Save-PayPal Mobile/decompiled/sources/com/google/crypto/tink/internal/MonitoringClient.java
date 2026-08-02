package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public interface MonitoringClient {

    public interface Logger {
        default void log(int i, long j) {
        }

        default void logFailure() {
        }

        default void logKeyExport(int i) {
        }
    }

    com.google.crypto.tink.internal.MonitoringClient.Logger createLogger(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.String str, java.lang.String str2);
}
