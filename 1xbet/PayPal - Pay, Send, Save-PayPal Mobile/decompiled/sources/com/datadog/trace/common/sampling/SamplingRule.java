package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public abstract class SamplingRule {
    private final com.datadog.trace.common.sampling.RateSampler getHighResolutionOutputSizeshNQ4ISI;

    public abstract <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t);

    public SamplingRule(com.datadog.trace.common.sampling.RateSampler rateSampler) {
        this.getHighResolutionOutputSizeshNQ4ISI = rateSampler;
    }

    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return this.getHighResolutionOutputSizeshNQ4ISI.sample(t);
    }

    public com.datadog.trace.common.sampling.RateSampler getSampler() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static class AlwaysMatchesSamplingRule extends com.datadog.trace.common.sampling.SamplingRule {
        @Override // com.datadog.trace.common.sampling.SamplingRule
        public <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t) {
            return true;
        }

        public AlwaysMatchesSamplingRule(com.datadog.trace.common.sampling.RateSampler rateSampler) {
            super(rateSampler);
        }
    }

    public static abstract class PatternMatchSamplingRule extends com.datadog.trace.common.sampling.SamplingRule {
        private final java.util.regex.Pattern getHighSpeedVideoFpsRanges;

        protected abstract <T extends com.datadog.trace.core.CoreSpan<T>> java.lang.CharSequence getRelevantString(T t);

        public PatternMatchSamplingRule(java.lang.String str, com.datadog.trace.common.sampling.RateSampler rateSampler) {
            super(rateSampler);
            this.getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile(str);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t) {
            java.lang.CharSequence relevantString = getRelevantString(t);
            return relevantString != null && this.getHighSpeedVideoFpsRanges.matcher(relevantString).matches();
        }
    }

    public static class ServiceSamplingRule extends com.datadog.trace.common.sampling.SamplingRule.PatternMatchSamplingRule {
        @Override // com.datadog.trace.common.sampling.SamplingRule.PatternMatchSamplingRule
        protected /* bridge */ /* synthetic */ java.lang.CharSequence getRelevantString(com.datadog.trace.core.CoreSpan coreSpan) {
            return getRelevantString((com.datadog.trace.common.sampling.SamplingRule.ServiceSamplingRule) coreSpan);
        }

        public ServiceSamplingRule(java.lang.String str, com.datadog.trace.common.sampling.RateSampler rateSampler) {
            super(str, rateSampler);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule.PatternMatchSamplingRule
        protected <T extends com.datadog.trace.core.CoreSpan<T>> java.lang.String getRelevantString(T t) {
            return t.getServiceName();
        }
    }

    public static class OperationSamplingRule extends com.datadog.trace.common.sampling.SamplingRule.PatternMatchSamplingRule {
        public OperationSamplingRule(java.lang.String str, com.datadog.trace.common.sampling.RateSampler rateSampler) {
            super(str, rateSampler);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule.PatternMatchSamplingRule
        protected <T extends com.datadog.trace.core.CoreSpan<T>> java.lang.CharSequence getRelevantString(T t) {
            return t.getOperationName();
        }
    }

    public static final class TraceSamplingRule extends com.datadog.trace.common.sampling.SamplingRule {
        private final com.datadog.trace.core.util.Matcher Camera2StreamConfigurationMap;
        private final com.datadog.trace.core.util.Matcher getHighResolutionOutputSizeshNQ4ISI;
        private final com.datadog.trace.core.util.Matcher getHighSpeedVideoFpsRanges;
        private final com.datadog.trace.core.util.TagsMatcher getHighSpeedVideoFpsRangesFor;

        public TraceSamplingRule(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.datadog.trace.common.sampling.RateSampler rateSampler) {
            super(rateSampler);
            this.getHighSpeedVideoFpsRanges = com.datadog.trace.core.util.Matchers.compileGlob(str);
            this.Camera2StreamConfigurationMap = com.datadog.trace.core.util.Matchers.compileGlob(str2);
            this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.util.Matchers.compileGlob(str3);
            this.getHighSpeedVideoFpsRangesFor = com.datadog.trace.core.util.TagsMatcher.create(map);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t) {
            return com.datadog.trace.core.util.Matchers.matches(this.getHighSpeedVideoFpsRanges, t.getServiceName()) && com.datadog.trace.core.util.Matchers.matches(this.Camera2StreamConfigurationMap, t.getOperationName()) && com.datadog.trace.core.util.Matchers.matches(this.getHighResolutionOutputSizeshNQ4ISI, t.getResourceName()) && this.getHighSpeedVideoFpsRangesFor.matches(t);
        }
    }

    /* loaded from: classes8.dex */
    public static final class SpanSamplingRule extends com.datadog.trace.common.sampling.SamplingRule {
        private final com.datadog.trace.core.util.SimpleRateLimiter getHighResolutionOutputSizeshNQ4ISI;
        private final com.datadog.trace.core.util.Matcher getHighSpeedVideoFpsRanges;
        private final com.datadog.trace.core.util.Matcher getHighSpeedVideoSizes;

        public SpanSamplingRule(java.lang.String str, java.lang.String str2, com.datadog.trace.common.sampling.RateSampler rateSampler, com.datadog.trace.core.util.SimpleRateLimiter simpleRateLimiter) {
            super(rateSampler);
            this.getHighSpeedVideoFpsRanges = com.datadog.trace.core.util.Matchers.compileGlob(str);
            this.getHighSpeedVideoSizes = com.datadog.trace.core.util.Matchers.compileGlob(str2);
            this.getHighResolutionOutputSizeshNQ4ISI = simpleRateLimiter;
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t) {
            return com.datadog.trace.core.util.Matchers.matches(this.getHighSpeedVideoFpsRanges, t.getServiceName()) && com.datadog.trace.core.util.Matchers.matches(this.getHighSpeedVideoSizes, t.getOperationName());
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
            if (!super.sample(t)) {
                return false;
            }
            com.datadog.trace.core.util.SimpleRateLimiter simpleRateLimiter = this.getHighResolutionOutputSizeshNQ4ISI;
            return simpleRateLimiter == null || simpleRateLimiter.tryAcquire();
        }

        public final com.datadog.trace.core.util.SimpleRateLimiter getRateLimiter() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
