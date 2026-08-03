package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class NOP_FallbackServiceProvider implements org.slf4j.spi.SLF4JServiceProvider {
    public static java.lang.String REQUESTED_API_VERSION = "2.0.99";
    private final org.slf4j.ILoggerFactory loggerFactory = new org.slf4j.helpers.NOPLoggerFactory();
    private final org.slf4j.IMarkerFactory markerFactory = new org.slf4j.helpers.BasicMarkerFactory();
    private final org.slf4j.spi.MDCAdapter mdcAdapter = new org.slf4j.helpers.NOPMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.IMarkerFactory getMarkerFactory() {
        return this.markerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.spi.MDCAdapter getMDCAdapter() {
        return this.mdcAdapter;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public java.lang.String getRequestedApiVersion() {
        return REQUESTED_API_VERSION;
    }
}
