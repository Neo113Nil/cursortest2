package com.datadog.trace.common.sampling;

/* loaded from: classes8.dex */
public interface SingleSpanSampler {
    <T extends com.datadog.trace.core.CoreSpan<T>> boolean setSamplingPriority(T t);

    public static final class Builder {
        private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.SingleSpanSampler.Builder.class);

        public static com.datadog.trace.common.sampling.SingleSpanSampler forConfig(com.datadog.trace.api.Config config) {
            java.lang.String spanSamplingRules = config.getSpanSamplingRules();
            java.lang.String spanSamplingRulesFile = config.getSpanSamplingRulesFile();
            boolean z = false;
            boolean z2 = (spanSamplingRules == null || spanSamplingRules.isEmpty()) ? false : true;
            if (spanSamplingRulesFile != null && !spanSamplingRulesFile.isEmpty()) {
                z = true;
            }
            if (z2 && z) {
                getHighSpeedVideoFpsRangesFor.warn("Both {} and {} defined. {} will be ignored.", com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES, com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES_FILE, com.datadog.trace.api.config.TracerConfig.SPAN_SAMPLING_RULES_FILE);
            }
            if (z2) {
                com.datadog.trace.common.sampling.SpanSamplingRules deserialize = com.datadog.trace.common.sampling.SpanSamplingRules.deserialize(spanSamplingRules);
                if (deserialize.isEmpty()) {
                    return null;
                }
                return new com.datadog.trace.common.sampling.SingleSpanSampler.RuleBasedSingleSpanSampler(deserialize);
            }
            if (!z) {
                return null;
            }
            com.datadog.trace.common.sampling.SpanSamplingRules deserializeFile = com.datadog.trace.common.sampling.SpanSamplingRules.deserializeFile(spanSamplingRulesFile);
            if (deserializeFile.isEmpty()) {
                return null;
            }
            return new com.datadog.trace.common.sampling.SingleSpanSampler.RuleBasedSingleSpanSampler(deserializeFile);
        }

        private Builder() {
        }
    }

    public static final class RuleBasedSingleSpanSampler implements com.datadog.trace.common.sampling.SingleSpanSampler {
        private final java.util.List<com.datadog.trace.common.sampling.SamplingRule.SpanSamplingRule> getHighResolutionOutputSizeshNQ4ISI;

        public RuleBasedSingleSpanSampler(com.datadog.trace.common.sampling.SpanSamplingRules spanSamplingRules) {
            if (spanSamplingRules == null) {
                throw new java.lang.NullPointerException("SpanSamplingRules can't be null.");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
            for (com.datadog.trace.common.sampling.SpanSamplingRules.Rule rule : spanSamplingRules.getRules()) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(new com.datadog.trace.common.sampling.SamplingRule.SpanSamplingRule(rule.getService(), rule.getName(), new com.datadog.trace.common.sampling.DeterministicSampler.SpanSampler(rule.getSampleRate()), rule.getMaxPerSecond() == Integer.MAX_VALUE ? null : new com.datadog.trace.core.util.SimpleRateLimiter(rule.getMaxPerSecond())));
            }
        }

        @Override // com.datadog.trace.common.sampling.SingleSpanSampler
        public final <T extends com.datadog.trace.core.CoreSpan<T>> boolean setSamplingPriority(T t) {
            for (com.datadog.trace.common.sampling.SamplingRule.SpanSamplingRule spanSamplingRule : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (spanSamplingRule.matches(t)) {
                    if (!spanSamplingRule.sample(t)) {
                        return false;
                    }
                    double sampleRate = spanSamplingRule.getSampler().getSampleRate();
                    com.datadog.trace.core.util.SimpleRateLimiter rateLimiter = spanSamplingRule.getRateLimiter();
                    t.setSpanSamplingPriority(sampleRate, rateLimiter == null ? Integer.MAX_VALUE : rateLimiter.getCapacity());
                    return true;
                }
            }
            return false;
        }
    }
}
