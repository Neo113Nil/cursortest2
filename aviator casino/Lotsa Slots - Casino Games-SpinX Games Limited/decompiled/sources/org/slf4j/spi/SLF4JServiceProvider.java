package org.slf4j.spi;

/* loaded from: classes6.dex */
public interface SLF4JServiceProvider {
    org.slf4j.ILoggerFactory getLoggerFactory();

    org.slf4j.spi.MDCAdapter getMDCAdapter();

    org.slf4j.IMarkerFactory getMarkerFactory();

    java.lang.String getRequestedApiVersion();

    void initialize();
}
