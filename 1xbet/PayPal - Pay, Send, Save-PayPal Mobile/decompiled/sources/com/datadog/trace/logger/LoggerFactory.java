package com.datadog.trace.logger;

/* loaded from: classes3.dex */
public final class LoggerFactory {
    public static com.datadog.trace.logger.Logger getLogger(java.lang.String str) {
        return new com.datadog.trace.logger.NoOpLogger();
    }

    public static com.datadog.trace.logger.Logger getLogger(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        return new com.datadog.trace.logger.DatadogCoreTracerLogger(str, internalLogger);
    }

    public static com.datadog.trace.logger.Logger getLogger(java.lang.Class<?> cls) {
        return new com.datadog.trace.logger.NoOpLogger();
    }

    public static com.datadog.trace.logger.ILoggerFactory getILoggerFactory() {
        return new com.datadog.trace.logger.ILoggerFactory() { // from class: com.datadog.trace.logger.LoggerFactory.1
            @Override // com.datadog.trace.logger.ILoggerFactory
            public com.datadog.trace.logger.Logger getLogger(java.lang.String str) {
                return new com.datadog.trace.logger.NoOpLogger();
            }

            @Override // com.datadog.trace.logger.ILoggerFactory
            public com.datadog.trace.logger.Logger getLogger(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
                return new com.datadog.trace.logger.DatadogCoreTracerLogger(str, internalLogger);
            }
        };
    }
}
