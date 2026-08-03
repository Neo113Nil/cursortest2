package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class SubstituteServiceProvider implements org.slf4j.spi.SLF4JServiceProvider {
    private final org.slf4j.helpers.SubstituteLoggerFactory loggerFactory = new org.slf4j.helpers.SubstituteLoggerFactory();
    private final org.slf4j.IMarkerFactory markerFactory = new org.slf4j.helpers.BasicMarkerFactory();
    private final org.slf4j.spi.MDCAdapter mdcAdapter = new org.slf4j.helpers.BasicMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public org.slf4j.ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    public org.slf4j.helpers.SubstituteLoggerFactory getSubstituteLoggerFactory() {
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
        throw new java.lang.UnsupportedOperationException();
    }
}
