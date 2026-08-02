package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public interface Sampler {
    <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t);

    public static final class Builder {
        private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.Sampler.Builder.class);

        public static com.datadog.trace.common.sampling.Sampler forConfig(com.datadog.trace.api.Config config, com.datadog.trace.api.TraceConfig traceConfig) {
            if (config != null) {
                java.util.Map<java.lang.String, java.lang.String> traceSamplingServiceRules = config.getTraceSamplingServiceRules();
                java.util.Map<java.lang.String, java.lang.String> traceSamplingOperationRules = config.getTraceSamplingOperationRules();
                java.lang.String traceSamplingRules = config.getTraceSamplingRules();
                com.datadog.trace.common.sampling.TraceSamplingRules traceSamplingRules2 = com.datadog.trace.common.sampling.TraceSamplingRules.EMPTY;
                if (traceSamplingRules != null) {
                    traceSamplingRules2 = com.datadog.trace.common.sampling.TraceSamplingRules.deserialize(traceSamplingRules);
                }
                boolean z = (traceSamplingServiceRules == null || traceSamplingServiceRules.isEmpty()) ? false : true;
                boolean z2 = (traceSamplingOperationRules == null || traceSamplingOperationRules.isEmpty()) ? false : true;
                boolean isEmpty = traceSamplingRules2.isEmpty();
                boolean isV2CompatibilityEnabled = config.isV2CompatibilityEnabled();
                if ((z || z2) && !isEmpty) {
                    getHighSpeedVideoSizes.warn("Both {} and/or {} as well as {} are defined. Only {} will be used for rule-based sampling", com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_SERVICE_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_OPERATION_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES);
                }
                java.lang.Double traceSampleRate = traceConfig != null ? traceConfig.getTraceSampleRate() : config.getTraceSampleRate();
                if (isV2CompatibilityEnabled && (z || z2 || !isEmpty || traceSampleRate != null)) {
                    try {
                        return com.datadog.trace.common.sampling.RuleBasedTraceSampler.build(traceSamplingServiceRules, traceSamplingOperationRules, traceSamplingRules2, traceSampleRate, config.getTraceRateLimit());
                    } catch (java.lang.IllegalArgumentException e) {
                        getHighSpeedVideoSizes.error("Invalid sampler configuration. Using AllSampler", (java.lang.Throwable) e);
                        return new com.datadog.trace.common.sampling.AllSampler();
                    }
                }
                if (traceSampleRate != null) {
                    return new com.datadog.trace.common.sampling.RateByServiceTraceSampler(traceSampleRate);
                }
                if (config.isPrioritySamplingEnabled()) {
                    if (com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.KEEP.equalsIgnoreCase(config.getPrioritySamplingForce())) {
                        getHighSpeedVideoSizes.debug("Force Sampling Priority to: SAMPLER_KEEP.");
                        return new com.datadog.trace.common.sampling.ForcePrioritySampler(1, 0);
                    }
                    if (com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP.equalsIgnoreCase(config.getPrioritySamplingForce())) {
                        getHighSpeedVideoSizes.debug("Force Sampling Priority to: SAMPLER_DROP.");
                        return new com.datadog.trace.common.sampling.ForcePrioritySampler(0, 0);
                    }
                    return new com.datadog.trace.common.sampling.RateByServiceTraceSampler();
                }
                return new com.datadog.trace.common.sampling.AllSampler();
            }
            return new com.datadog.trace.common.sampling.AllSampler();
        }

        public static com.datadog.trace.common.sampling.Sampler forConfig(java.util.Properties properties) {
            return forConfig(com.datadog.trace.api.Config.get(properties), null);
        }

        private Builder() {
        }
    }
}
