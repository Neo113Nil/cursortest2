package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutableMonitoringRegistry {
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.MonitoringClient> monitoringClient = new java.util.concurrent.atomic.AtomicReference<>();
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry GLOBAL_INSTANCE = new com.google.crypto.tink.internal.MutableMonitoringRegistry();
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry.DoNothingClient DO_NOTHING_CLIENT = new com.google.crypto.tink.internal.MutableMonitoringRegistry.DoNothingClient();

    public static com.google.crypto.tink.internal.MutableMonitoringRegistry globalInstance() {
        return GLOBAL_INSTANCE;
    }

    static class DoNothingClient implements com.google.crypto.tink.internal.MonitoringClient {
        private DoNothingClient() {
        }

        @Override // com.google.crypto.tink.internal.MonitoringClient
        public com.google.crypto.tink.internal.MonitoringClient.Logger createLogger(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.String str, java.lang.String str2) {
            return com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
    }

    public final void clear() {
        synchronized (this) {
            this.monitoringClient.set(null);
        }
    }

    public final void registerMonitoringClient(com.google.crypto.tink.internal.MonitoringClient monitoringClient) {
        synchronized (this) {
            if (this.monitoringClient.get() != null) {
                throw new java.lang.IllegalStateException("a monitoring client has already been registered");
            }
            this.monitoringClient.set(monitoringClient);
        }
    }

    public final com.google.crypto.tink.internal.MonitoringClient getMonitoringClient() {
        com.google.crypto.tink.internal.MonitoringClient monitoringClient = this.monitoringClient.get();
        return monitoringClient == null ? DO_NOTHING_CLIENT : monitoringClient;
    }
}
