package com.datadog.trace.core.taginterceptor;

/* loaded from: classes3.dex */
public class RuleFlags {
    private final boolean[] getHighSpeedVideoFpsRangesFor;

    public enum Feature {
        RESOURCE_NAME("ResourceNameRule"),
        URL_AS_RESOURCE_NAME("URLAsResourceNameRule"),
        STATUS_404("Status404Rule"),
        STATUS_404_DECORATOR("Status404Decorator"),
        DB_STATEMENT("DBStatementRule"),
        FORCE_MANUAL_DROP("ForceManualDropTagInterceptor"),
        FORCE_MANUAL_KEEP("ForceManualKeepTagInterceptor"),
        PEER_SERVICE,
        SERVICE_NAME("ServiceNameTagInterceptor"),
        SERVLET_CONTEXT("ServletContextTagInterceptor");

        private final boolean Camera2StreamConfigurationMap = true;
        private final java.lang.String getHighSpeedVideoFpsRanges;

        Feature(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        Feature() {
            this.getHighSpeedVideoFpsRanges = r3;
        }
    }

    public RuleFlags() {
        this(com.datadog.trace.api.Config.get());
    }

    public RuleFlags(com.datadog.trace.api.Config config) {
        com.datadog.trace.core.taginterceptor.RuleFlags.Feature[] values = com.datadog.trace.core.taginterceptor.RuleFlags.Feature.values();
        this.getHighSpeedVideoFpsRangesFor = new boolean[values.length];
        for (com.datadog.trace.core.taginterceptor.RuleFlags.Feature feature : values) {
            if (config.isRuleEnabled(feature.getHighSpeedVideoFpsRanges, feature.Camera2StreamConfigurationMap)) {
                this.getHighSpeedVideoFpsRangesFor[feature.ordinal()] = true;
            }
        }
    }

    public boolean isEnabled(com.datadog.trace.core.taginterceptor.RuleFlags.Feature feature) {
        return this.getHighSpeedVideoFpsRangesFor[feature.ordinal()];
    }
}
