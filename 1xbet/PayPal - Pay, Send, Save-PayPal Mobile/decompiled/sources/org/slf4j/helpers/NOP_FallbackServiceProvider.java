package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class NOP_FallbackServiceProvider implements org.slf4j.spi.SLF4JServiceProvider {
    public static java.lang.String REQUESTED_API_VERSION = "2.0.99";
    private final org.slf4j.ILoggerFactory getHighSpeedVideoFpsRangesFor = new org.slf4j.helpers.NOPLoggerFactory();
    private final org.slf4j.IMarkerFactory getHighResolutionOutputSizeshNQ4ISI = new org.slf4j.helpers.BasicMarkerFactory();
    private final org.slf4j.spi.MDCAdapter getHighSpeedVideoFpsRanges = new org.slf4j.helpers.NOPMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.ILoggerFactory getLoggerFactory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.IMarkerFactory getMarkerFactory() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.spi.MDCAdapter getMDCAdapter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public java.lang.String getRequestedApiVersion() {
        return REQUESTED_API_VERSION;
    }
}
