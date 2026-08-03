package org.slf4j.spi;

/* loaded from: classes6.dex */
public class NOPLoggingEventBuilder implements org.slf4j.spi.LoggingEventBuilder {
    static final org.slf4j.spi.NOPLoggingEventBuilder SINGLETON = new org.slf4j.spi.NOPLoggingEventBuilder();

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log() {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object obj) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object... objArr) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.util.function.Supplier<java.lang.String> supplier) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setMessage(java.lang.String str) {
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setMessage(java.util.function.Supplier<java.lang.String> supplier) {
        return this;
    }

    private NOPLoggingEventBuilder() {
    }

    public static org.slf4j.spi.LoggingEventBuilder singleton() {
        return SINGLETON;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addMarker(org.slf4j.Marker marker) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addArgument(java.lang.Object obj) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addArgument(java.util.function.Supplier<?> supplier) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.lang.Object obj) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.util.function.Supplier<java.lang.Object> supplier) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setCause(java.lang.Throwable th) {
        return singleton();
    }
}
