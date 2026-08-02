package com.datadog.trace.logger;

/* loaded from: classes8.dex */
public interface ILoggerFactory {
    com.datadog.trace.logger.Logger getLogger(java.lang.String str);

    com.datadog.trace.logger.Logger getLogger(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger);
}
