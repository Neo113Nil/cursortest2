package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class SubstituteServiceProvider implements org.slf4j.spi.SLF4JServiceProvider {
    private final org.slf4j.helpers.SubstituteLoggerFactory getHighSpeedVideoFpsRangesFor = new org.slf4j.helpers.SubstituteLoggerFactory();
    private final org.slf4j.IMarkerFactory getHighSpeedVideoFpsRanges = new org.slf4j.helpers.BasicMarkerFactory();
    private final org.slf4j.spi.MDCAdapter Camera2StreamConfigurationMap = new org.slf4j.helpers.BasicMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.ILoggerFactory getLoggerFactory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.slf4j.helpers.SubstituteLoggerFactory getSubstituteLoggerFactory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.IMarkerFactory getMarkerFactory() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.spi.MDCAdapter getMDCAdapter() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public java.lang.String getRequestedApiVersion() {
        throw new java.lang.UnsupportedOperationException();
    }
}
