package io.sentry;

import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentryTransaction;

/* JADX INFO: loaded from: classes2.dex */
final class SentryRuntimeEventProcessor implements EventProcessor {
    private final String javaVendor;
    private final String javaVersion;

    public SentryRuntimeEventProcessor(String str, String str2) {
        this.javaVersion = str;
        this.javaVendor = str2;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 2000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return (SentryEvent) process(sentryEvent);
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return (SentryTransaction) process(sentryTransaction);
    }

    private <T extends SentryBaseEvent> T process(T t7) {
        if (t7.getContexts().getRuntime() == null) {
            t7.getContexts().setRuntime(new SentryRuntime());
        }
        SentryRuntime runtime = t7.getContexts().getRuntime();
        if (runtime != null && runtime.getName() == null && runtime.getVersion() == null) {
            runtime.setName(this.javaVendor);
            runtime.setVersion(this.javaVersion);
        }
        return t7;
    }

    public SentryRuntimeEventProcessor() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
