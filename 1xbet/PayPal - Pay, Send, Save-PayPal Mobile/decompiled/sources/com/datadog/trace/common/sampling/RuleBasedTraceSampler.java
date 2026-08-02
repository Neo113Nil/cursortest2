package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class RuleBasedTraceSampler<T extends com.datadog.trace.core.CoreSpan<T>> implements com.datadog.trace.common.sampling.Sampler, com.datadog.trace.common.sampling.PrioritySampler {
    public static final java.lang.String SAMPLING_LIMIT_RATE = "_dd.limit_psr";
    public static final java.lang.String SAMPLING_RULE_RATE = "_dd.rule_psr";
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.RuleBasedTraceSampler.class);
    private final long Camera2StreamConfigurationMap;
    private final com.datadog.trace.common.sampling.PrioritySampler getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.trace.core.util.SimpleRateLimiter getHighSpeedVideoFpsRanges;
    private final java.util.List<com.datadog.trace.common.sampling.SamplingRule> getHighSpeedVideoFpsRangesFor;

    @Override // com.datadog.trace.common.sampling.Sampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return true;
    }

    public RuleBasedTraceSampler(java.util.List<com.datadog.trace.common.sampling.SamplingRule> list, int i, com.datadog.trace.common.sampling.PrioritySampler prioritySampler) {
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = prioritySampler;
        this.getHighSpeedVideoFpsRanges = new com.datadog.trace.core.util.SimpleRateLimiter(i);
        this.Camera2StreamConfigurationMap = i;
    }

    public static com.datadog.trace.common.sampling.RuleBasedTraceSampler build(com.datadog.trace.common.sampling.TraceSamplingRules traceSamplingRules, java.lang.Double d, int i) {
        return build(null, null, traceSamplingRules, d, i);
    }

    public static com.datadog.trace.common.sampling.RuleBasedTraceSampler build(@java.lang.Deprecated java.util.Map<java.lang.String, java.lang.String> map, @java.lang.Deprecated java.util.Map<java.lang.String, java.lang.String> map2, com.datadog.trace.common.sampling.TraceSamplingRules traceSamplingRules, java.lang.Double d, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (traceSamplingRules == null || traceSamplingRules.isEmpty()) {
            if (map != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    try {
                        arrayList.add(new com.datadog.trace.common.sampling.SamplingRule.ServiceSamplingRule(entry.getKey(), new com.datadog.trace.common.sampling.DeterministicSampler.TraceSampler(java.lang.Double.parseDouble(entry.getValue()))));
                    } catch (java.lang.NumberFormatException e) {
                        getHighSpeedVideoSizes.error("Unable to parse rate for service: {}", entry, e);
                    }
                }
            }
            if (map2 != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : map2.entrySet()) {
                    try {
                        arrayList.add(new com.datadog.trace.common.sampling.SamplingRule.OperationSamplingRule(entry2.getKey(), new com.datadog.trace.common.sampling.DeterministicSampler.TraceSampler(java.lang.Double.parseDouble(entry2.getValue()))));
                    } catch (java.lang.NumberFormatException e2) {
                        getHighSpeedVideoSizes.error("Unable to parse rate for operation: {}", entry2, e2);
                    }
                }
            }
        } else {
            if (!map.isEmpty() || !map2.isEmpty()) {
                getHighSpeedVideoSizes.warn("Both {} and/or {} as well as {} are defined. Only {} will be used for rule-based sampling", com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_SERVICE_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_OPERATION_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES, com.datadog.trace.api.config.TracerConfig.TRACE_SAMPLING_RULES);
            }
            for (com.datadog.trace.common.sampling.TraceSamplingRules.Rule rule : traceSamplingRules.getRules()) {
                arrayList.add(new com.datadog.trace.common.sampling.SamplingRule.TraceSamplingRule(rule.getService(), rule.getName(), rule.getResource(), rule.getTags(), new com.datadog.trace.common.sampling.DeterministicSampler.TraceSampler(rule.getSampleRate())));
            }
        }
        if (d != null) {
            arrayList.add(new com.datadog.trace.common.sampling.SamplingRule.AlwaysMatchesSamplingRule(new com.datadog.trace.common.sampling.DeterministicSampler.TraceSampler(d.doubleValue())));
        }
        return new com.datadog.trace.common.sampling.RuleBasedTraceSampler(arrayList, i, new com.datadog.trace.common.sampling.RateByServiceTraceSampler());
    }

    @Override // com.datadog.trace.common.sampling.PrioritySampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> void setSamplingPriority(T t) {
        com.datadog.trace.common.sampling.SamplingRule samplingRule;
        java.util.Iterator<com.datadog.trace.common.sampling.SamplingRule> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                samplingRule = null;
                break;
            } else {
                samplingRule = it.next();
                if (samplingRule.matches(t)) {
                    break;
                }
            }
        }
        if (samplingRule == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.setSamplingPriority(t);
            return;
        }
        if (samplingRule.sample(t)) {
            if (this.getHighSpeedVideoFpsRanges.tryAcquire()) {
                t.setSamplingPriority(2, "_dd.rule_psr", samplingRule.getSampler().getSampleRate(), 3);
            } else {
                t.setSamplingPriority(-1, "_dd.rule_psr", samplingRule.getSampler().getSampleRate(), 3);
            }
            t.mo10039setMetric(SAMPLING_LIMIT_RATE, this.Camera2StreamConfigurationMap);
            return;
        }
        t.setSamplingPriority(-1, "_dd.rule_psr", samplingRule.getSampler().getSampleRate(), 3);
    }
}
