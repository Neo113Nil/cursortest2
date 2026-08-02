package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class ConfigDefaults {
    static final java.util.BitSet Camera2StreamConfigurationMap;
    public static final java.lang.String DEFAULT_AGENT_HOST = "localhost";
    public static final int DEFAULT_AGENT_TIMEOUT = 10;
    public static final java.lang.String DEFAULT_AGENT_WRITER_TYPE = "DDAgentWriter";
    public static final boolean DEFAULT_ASYNC_PROPAGATING = true;
    public static final int DEFAULT_DOGSTATSD_PORT = 8125;
    public static final boolean DEFAULT_IAST_DEDUPLICATION_ENABLED = true;
    public static final int DEFAULT_IAST_MAX_CONCURRENT_REQUESTS = 4;
    public static final int DEFAULT_IAST_MAX_RANGE_COUNT = 10;
    public static final int DEFAULT_IAST_REQUEST_SAMPLING = 33;
    public static final int DEFAULT_IAST_VULNERABILITIES_PER_REQUEST = 2;
    public static final java.lang.String DEFAULT_SERVICE_NAME = "unnamed-java-app";
    public static final java.lang.String DEFAULT_SERVLET_ROOT_CONTEXT_SERVICE_NAME = "root-servlet";
    public static final boolean DEFAULT_STARTUP_LOGS_ENABLED = true;
    public static final int DEFAULT_TRACE_AGENT_PORT = 8126;
    public static final int DEFAULT_TRACE_X_DATADOG_TAGS_MAX_LENGTH = 512;
    static final java.util.BitSet getHighResolutionOutputSizeshNQ4ISI;
    static final java.util.BitSet getHighSpeedVideoFpsRanges;
    static final java.util.BitSet getHighSpeedVideoFpsRangesFor;
    static final java.util.BitSet getHighSpeedVideoSizes;
    static final java.util.Set<com.datadog.trace.api.TracePropagationStyle> getHighSpeedVideoSizesFor;
    static final java.lang.String getInputFormats;
    static final java.lang.String getInputSizeshNQ4ISI;
    static final java.util.Set<java.lang.String> getOutputFormats;
    static final java.lang.String getOutputMinFrameDuration;

    static {
        java.util.BitSet bitSet = new java.util.BitSet();
        getHighSpeedVideoSizes = bitSet;
        bitSet.set(500, 600);
        java.util.BitSet bitSet2 = new java.util.BitSet();
        getHighSpeedVideoFpsRangesFor = bitSet2;
        bitSet2.set(400, 500);
        java.util.BitSet bitSet3 = new java.util.BitSet();
        getHighSpeedVideoFpsRanges = bitSet3;
        bitSet3.set(2, 17);
        java.util.BitSet bitSet4 = new java.util.BitSet();
        getHighResolutionOutputSizeshNQ4ISI = bitSet4;
        bitSet4.set(1, 17);
        java.util.BitSet bitSet5 = new java.util.BitSet();
        Camera2StreamConfigurationMap = bitSet5;
        bitSet5.set(0, 1);
        getInputFormats = null;
        getHighSpeedVideoSizesFor = new java.util.LinkedHashSet(java.util.Arrays.asList(com.datadog.trace.api.TracePropagationStyle.DATADOG, com.datadog.trace.api.TracePropagationStyle.TRACECONTEXT));
        getOutputFormats = new java.util.HashSet(java.util.Arrays.asList("SHA1", "SHA-1", "MD2", "MD5", "RIPEMD128", "MD4"));
        getOutputMinFrameDuration = null;
        getInputSizeshNQ4ISI = null;
    }

    private ConfigDefaults() {
    }
}
