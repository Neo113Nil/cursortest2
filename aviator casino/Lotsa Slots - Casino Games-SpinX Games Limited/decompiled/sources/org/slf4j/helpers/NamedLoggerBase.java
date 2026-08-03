package org.slf4j.helpers;

/* loaded from: classes6.dex */
abstract class NamedLoggerBase implements org.slf4j.Logger, java.io.Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected java.lang.String name;

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atDebug() {
        return org.slf4j.Logger.CC.$default$atDebug(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atError() {
        return org.slf4j.Logger.CC.$default$atError(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atInfo() {
        return org.slf4j.Logger.CC.$default$atInfo(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atLevel(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$atLevel(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atTrace() {
        return org.slf4j.Logger.CC.$default$atTrace(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atWarn() {
        return org.slf4j.Logger.CC.$default$atWarn(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ boolean isEnabledForLevel(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$isEnabledForLevel(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$makeLoggingEventBuilder(this, level);
    }

    NamedLoggerBase() {
    }

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.name;
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return org.slf4j.LoggerFactory.getLogger(getName());
    }
}
