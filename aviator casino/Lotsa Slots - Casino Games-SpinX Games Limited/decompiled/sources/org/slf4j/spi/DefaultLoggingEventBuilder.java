package org.slf4j.spi;

/* loaded from: classes6.dex */
public class DefaultLoggingEventBuilder implements org.slf4j.spi.LoggingEventBuilder, org.slf4j.spi.CallerBoundaryAware {
    static java.lang.String DLEB_FQCN = "org.slf4j.spi.DefaultLoggingEventBuilder";
    protected org.slf4j.Logger logger;
    protected org.slf4j.event.DefaultLoggingEvent loggingEvent;

    public DefaultLoggingEventBuilder(org.slf4j.Logger logger, org.slf4j.event.Level level) {
        this.logger = logger;
        this.loggingEvent = new org.slf4j.event.DefaultLoggingEvent(level, logger);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addMarker(org.slf4j.Marker marker) {
        this.loggingEvent.addMarker(marker);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setCause(java.lang.Throwable th) {
        this.loggingEvent.setThrowable(th);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addArgument(java.lang.Object obj) {
        this.loggingEvent.addArgument(obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addArgument(java.util.function.Supplier<?> supplier) {
        this.loggingEvent.addArgument(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.CallerBoundaryAware
    public void setCallerBoundary(java.lang.String str) {
        this.loggingEvent.setCallerBoundary(str);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log() {
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setMessage(java.lang.String str) {
        this.loggingEvent.setMessage(str);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder setMessage(java.util.function.Supplier<java.lang.String> supplier) {
        this.loggingEvent.setMessage(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str) {
        this.loggingEvent.setMessage(str);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object obj) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        this.loggingEvent.addArgument(obj2);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.lang.String str, java.lang.Object... objArr) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArguments(objArr);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(java.util.function.Supplier<java.lang.String> supplier) {
        if (supplier == null) {
            log((java.lang.String) null);
        } else {
            log(supplier.get());
        }
    }

    protected void log(org.slf4j.event.LoggingEvent loggingEvent) {
        setCallerBoundary(DLEB_FQCN);
        org.slf4j.Logger logger = this.logger;
        if (logger instanceof org.slf4j.spi.LoggingEventAware) {
            ((org.slf4j.spi.LoggingEventAware) logger).log(loggingEvent);
        } else {
            logViaPublicSLF4JLoggerAPI(loggingEvent);
        }
    }

    private void logViaPublicSLF4JLoggerAPI(org.slf4j.event.LoggingEvent loggingEvent) {
        java.lang.Object[] argumentArray = loggingEvent.getArgumentArray();
        int length = argumentArray == null ? 0 : argumentArray.length;
        java.lang.Throwable throwable = loggingEvent.getThrowable();
        int i = throwable == null ? 0 : 1;
        java.lang.String message = loggingEvent.getMessage();
        java.lang.Object[] objArr = new java.lang.Object[i + length];
        if (argumentArray != null) {
            java.lang.System.arraycopy(argumentArray, 0, objArr, 0, length);
        }
        if (throwable != null) {
            objArr[length] = throwable;
        }
        java.lang.String mergeMarkersAndKeyValuePairs = mergeMarkersAndKeyValuePairs(loggingEvent, message);
        int i2 = org.slf4j.spi.DefaultLoggingEventBuilder.AnonymousClass1.$SwitchMap$org$slf4j$event$Level[loggingEvent.getLevel().ordinal()];
        if (i2 == 1) {
            this.logger.trace(mergeMarkersAndKeyValuePairs, objArr);
            return;
        }
        if (i2 == 2) {
            this.logger.debug(mergeMarkersAndKeyValuePairs, objArr);
            return;
        }
        if (i2 == 3) {
            this.logger.info(mergeMarkersAndKeyValuePairs, objArr);
        } else if (i2 == 4) {
            this.logger.warn(mergeMarkersAndKeyValuePairs, objArr);
        } else {
            if (i2 != 5) {
                return;
            }
            this.logger.error(mergeMarkersAndKeyValuePairs, objArr);
        }
    }

    /* renamed from: org.slf4j.spi.DefaultLoggingEventBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$slf4j$event$Level;

        static {
            int[] iArr = new int[org.slf4j.event.Level.values().length];
            $SwitchMap$org$slf4j$event$Level = iArr;
            try {
                iArr[org.slf4j.event.Level.TRACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[org.slf4j.event.Level.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[org.slf4j.event.Level.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[org.slf4j.event.Level.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[org.slf4j.event.Level.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private java.lang.String mergeMarkersAndKeyValuePairs(org.slf4j.event.LoggingEvent loggingEvent, java.lang.String str) {
        java.lang.StringBuilder sb;
        if (loggingEvent.getMarkers() != null) {
            sb = new java.lang.StringBuilder();
            java.util.Iterator<org.slf4j.Marker> it = loggingEvent.getMarkers().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
        } else {
            sb = null;
        }
        if (loggingEvent.getKeyValuePairs() != null) {
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            for (org.slf4j.event.KeyValuePair keyValuePair : loggingEvent.getKeyValuePairs()) {
                sb.append(keyValuePair.key);
                sb.append(com.ironsource.B5.U);
                sb.append(keyValuePair.value);
                sb.append(' ');
            }
        }
        if (sb == null) {
            return str;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.lang.Object obj) {
        this.loggingEvent.addKeyValue(str, obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public org.slf4j.spi.LoggingEventBuilder addKeyValue(java.lang.String str, java.util.function.Supplier<java.lang.Object> supplier) {
        this.loggingEvent.addKeyValue(str, supplier.get());
        return this;
    }
}
