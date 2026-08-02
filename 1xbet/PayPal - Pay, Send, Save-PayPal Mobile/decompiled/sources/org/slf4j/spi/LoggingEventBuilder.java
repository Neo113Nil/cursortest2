package org.slf4j.spi;

/* loaded from: classes18.dex */
public interface LoggingEventBuilder {
    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder addArgument(java.lang.Object obj);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder addArgument(java.util.function.Supplier<?> supplier);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.lang.Object obj);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.util.function.Supplier<java.lang.Object> supplier);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder addMarker(org.slf4j.Marker marker);

    void log();

    void log(java.lang.String str);

    void log(java.lang.String str, java.lang.Object obj);

    void log(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void log(java.lang.String str, java.lang.Object... objArr);

    void log(java.util.function.Supplier<java.lang.String> supplier);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder setCause(java.lang.Throwable th);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder setMessage(java.lang.String str);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder setMessage(java.util.function.Supplier<java.lang.String> supplier);
}
