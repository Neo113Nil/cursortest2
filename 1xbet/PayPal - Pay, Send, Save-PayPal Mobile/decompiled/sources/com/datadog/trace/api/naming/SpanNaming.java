package com.datadog.trace.api.naming;

/* loaded from: classes3.dex */
public class SpanNaming {
    public static final int SCHEMA_MAX_VERSION = 1;
    public static final int SCHEMA_MIN_VERSION = 0;
    private final int getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.api.naming.NamingSchema getHighSpeedVideoSizes;

    public static com.datadog.trace.api.naming.SpanNaming instance() {
        return com.datadog.trace.api.naming.SpanNaming.Singleton.Camera2StreamConfigurationMap;
    }

    private SpanNaming() {
        this(com.datadog.trace.api.Config.get().getSpanAttributeSchemaVersion());
    }

    private SpanNaming(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        if (i == 1) {
            this.getHighSpeedVideoSizes = new com.datadog.trace.api.naming.v1.NamingSchemaV1();
        } else {
            this.getHighSpeedVideoSizes = new com.datadog.trace.api.naming.v0.NamingSchemaV0();
        }
    }

    public com.datadog.trace.api.naming.NamingSchema namingSchema() {
        return this.getHighSpeedVideoSizes;
    }

    public int version() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static class Singleton {
        private static com.datadog.trace.api.naming.SpanNaming Camera2StreamConfigurationMap = new com.datadog.trace.api.naming.SpanNaming((byte) 0);
    }

    /* synthetic */ SpanNaming(byte b) {
        this();
    }
}
