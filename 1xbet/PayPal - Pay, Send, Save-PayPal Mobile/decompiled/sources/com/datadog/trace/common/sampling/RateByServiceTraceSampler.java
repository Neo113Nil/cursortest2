package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class RateByServiceTraceSampler implements com.datadog.trace.common.sampling.Sampler, com.datadog.trace.common.sampling.PrioritySampler, com.datadog.trace.common.writer.RemoteResponseListener {
    public static final java.lang.String SAMPLING_AGENT_RATE = "_dd.agent_psr";
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.RateByServiceTraceSampler.class);
    private volatile com.datadog.trace.common.sampling.RateByServiceTraceSampler.RateSamplersByEnvAndService getHighSpeedVideoFpsRangesFor;

    @Override // com.datadog.trace.common.sampling.Sampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean sample(T t) {
        return true;
    }

    public RateByServiceTraceSampler() {
        this(java.lang.Double.valueOf(1.0d));
    }

    public RateByServiceTraceSampler(java.lang.Double d) {
        this.getHighSpeedVideoFpsRangesFor = new com.datadog.trace.common.sampling.RateByServiceTraceSampler.RateSamplersByEnvAndService(d.doubleValue());
    }

    @Override // com.datadog.trace.common.sampling.PrioritySampler
    public <T extends com.datadog.trace.core.CoreSpan<T>> void setSamplingPriority(T t) {
        com.datadog.trace.common.sampling.RateSampler rateSampler;
        java.lang.String serviceName = t.getServiceName();
        java.lang.String str = (java.lang.String) t.getTag("env", "");
        com.datadog.trace.common.sampling.RateByServiceTraceSampler.RateSamplersByEnvAndService rateSamplersByEnvAndService = this.getHighSpeedVideoFpsRangesFor;
        java.util.Map<java.lang.String, com.datadog.trace.common.sampling.RateSampler> map = rateSamplersByEnvAndService.Camera2StreamConfigurationMap.get(str);
        if (map == null) {
            rateSampler = rateSamplersByEnvAndService.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            rateSampler = map.get(serviceName);
            if (rateSampler == null) {
                rateSampler = rateSamplersByEnvAndService.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        if (rateSampler.sample(t)) {
            t.setSamplingPriority(1, "_dd.agent_psr", rateSampler.getSampleRate(), 1);
        } else {
            t.setSamplingPriority(0, "_dd.agent_psr", rateSampler.getSampleRate(), 1);
        }
    }

    @Override // com.datadog.trace.common.writer.RemoteResponseListener
    public void onResponse(java.lang.String str, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Number>> map) {
        final java.util.Map<java.lang.String, java.lang.Number> map2 = map.get("rate_by_service");
        if (map2 != null) {
            getHighSpeedVideoSizes.debug("Update service sampler rates: {} -> {}", str, map);
            java.util.HashMap hashMap = new java.util.HashMap(map2.size() * 2);
            for (final java.util.Map.Entry<java.lang.String, java.lang.Number> entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService highSpeedVideoSizes = com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService.getHighSpeedVideoSizes(entry.getKey());
                    com.datadog.trace.core.util.MapUtils.computeIfAbsent(highSpeedVideoSizes.getHighSpeedVideoFpsRanges, (java.util.Map) com.datadog.trace.core.util.MapUtils.computeIfAbsent(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, hashMap, new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.common.sampling.RateByServiceTraceSampler$$ExternalSyntheticLambda0
                        @Override // com.datadog.android.trace.internal.compat.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return com.datadog.trace.common.sampling.RateByServiceTraceSampler.getHighSpeedVideoFpsRangesFor(map2);
                        }
                    }), new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.common.sampling.RateByServiceTraceSampler$$ExternalSyntheticLambda1
                        @Override // com.datadog.android.trace.internal.compat.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            com.datadog.trace.common.sampling.RateSampler highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = com.datadog.trace.common.sampling.RateByServiceTraceSampler.getHighSpeedVideoFpsRanges(((java.lang.Number) entry.getValue()).doubleValue());
                            return highSpeedVideoFpsRanges;
                        }
                    });
                }
            }
            this.getHighSpeedVideoFpsRangesFor = new com.datadog.trace.common.sampling.RateByServiceTraceSampler.RateSamplersByEnvAndService(hashMap, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges);
        }
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor(java.util.Map map) {
        return new java.util.HashMap(map.size() * 2);
    }

    public double getSampleRate() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r3 <= 1.0d) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.datadog.trace.common.sampling.RateSampler getHighSpeedVideoFpsRanges(double d) {
        if (d < 0.0d) {
            getHighSpeedVideoSizes.error("SampleRate is negative or null, disabling the sampler");
        }
        d = 1.0d;
        return new com.datadog.trace.common.sampling.DeterministicSampler.TraceSampler(d);
    }

    static final class RateSamplersByEnvAndService {
        final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.datadog.trace.common.sampling.RateSampler>> Camera2StreamConfigurationMap;
        final com.datadog.trace.common.sampling.RateSampler getHighResolutionOutputSizeshNQ4ISI;
        final double getHighSpeedVideoFpsRanges;

        RateSamplersByEnvAndService(double d) {
            this(new java.util.HashMap(0), d);
        }

        RateSamplersByEnvAndService(java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.datadog.trace.common.sampling.RateSampler>> map, double d) {
            this.getHighSpeedVideoFpsRanges = d;
            this.Camera2StreamConfigurationMap = map;
            this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.common.sampling.RateByServiceTraceSampler.getHighSpeedVideoFpsRanges(d);
        }
    }

    /* loaded from: classes8.dex */
    static final class EnvAndService {
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private static final com.datadog.trace.api.cache.DDCache<java.lang.String, com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService> getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.cache.DDCaches.newFixedSizeCache(32);
        private static final com.datadog.android.trace.internal.compat.function.Function<java.lang.String, com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService> Camera2StreamConfigurationMap = new com.datadog.android.trace.internal.compat.function.Function<java.lang.String, com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService>() { // from class: com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService.1
            @Override // com.datadog.android.trace.internal.compat.function.Function
            public /* synthetic */ com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService apply(java.lang.String str) {
                java.lang.String str2 = str;
                int indexOf = str2.indexOf(58) + 1;
                int indexOf2 = str2.indexOf(44, indexOf);
                int indexOf3 = str2.indexOf(58, indexOf2) + 1;
                if ((indexOf == indexOf2 && indexOf3 == str2.length()) || (indexOf | indexOf2 | indexOf3) < 0) {
                    return com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService.getHighSpeedVideoSizes;
                }
                return new com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService(str2.substring(indexOf3), str2.substring(indexOf, indexOf2), (byte) 0);
            }
        };
        static final com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService getHighSpeedVideoSizes = new com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService("", "");

        public static com.datadog.trace.common.sampling.RateByServiceTraceSampler.EnvAndService getHighSpeedVideoSizes(java.lang.String str) {
            return getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(str, Camera2StreamConfigurationMap);
        }

        private EnvAndService(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = str2;
        }

        /* synthetic */ EnvAndService(java.lang.String str, java.lang.String str2, byte b) {
            this(str, str2);
        }
    }
}
