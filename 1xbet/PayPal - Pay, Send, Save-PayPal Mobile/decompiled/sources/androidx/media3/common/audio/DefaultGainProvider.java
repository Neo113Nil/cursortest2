package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class DefaultGainProvider implements androidx.media3.common.audio.GainProcessor.GainProvider {
    private final com.google.common.collect.TreeRangeMap<java.lang.Long, com.google.common.base.Function<android.util.Pair<java.lang.Long, java.lang.Integer>, java.lang.Float>> Camera2StreamConfigurationMap;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.media3.common.audio.DefaultGainProvider.FadeProvider FADE_IN_LINEAR = new androidx.media3.common.audio.DefaultGainProvider.FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j, long j2) {
            return androidx.media3.common.audio.DefaultGainProvider.getHighSpeedVideoSizes(j, j2);
        }
    };
    public static final androidx.media3.common.audio.DefaultGainProvider.FadeProvider FADE_OUT_LINEAR = new androidx.media3.common.audio.DefaultGainProvider.FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda1
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j, long j2) {
            return androidx.media3.common.audio.DefaultGainProvider.getHighResolutionOutputSizeshNQ4ISI(j, j2);
        }
    };
    public static final androidx.media3.common.audio.DefaultGainProvider.FadeProvider FADE_IN_EQUAL_POWER = new androidx.media3.common.audio.DefaultGainProvider.FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda2
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j, long j2) {
            return androidx.media3.common.audio.DefaultGainProvider.getHighSpeedVideoFpsRanges(j, j2);
        }
    };
    public static final androidx.media3.common.audio.DefaultGainProvider.FadeProvider FADE_OUT_EQUAL_POWER = new androidx.media3.common.audio.DefaultGainProvider.FadeProvider() { // from class: androidx.media3.common.audio.DefaultGainProvider$$ExternalSyntheticLambda3
        @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
        public final float getGainFactorAt(long j, long j2) {
            return androidx.media3.common.audio.DefaultGainProvider.getHighSpeedVideoFpsRangesFor(j, j2);
        }
    };

    public interface FadeProvider {
        float getGainFactorAt(long j, long j2);
    }

    static /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI(long j, long j2) {
        return (j2 - j) / j2;
    }

    static /* synthetic */ float getHighSpeedVideoSizes(long j, long j2) {
        return j / j2;
    }

    /* synthetic */ DefaultGainProvider(com.google.common.collect.TreeRangeMap treeRangeMap, float f, byte b) {
        this(treeRangeMap, f);
    }

    public static final class Builder {
        private final float Camera2StreamConfigurationMap;
        private final com.google.common.collect.TreeRangeMap<java.lang.Long, com.google.common.base.Function<android.util.Pair<java.lang.Long, java.lang.Integer>, java.lang.Float>> getHighSpeedVideoSizes;

        public Builder(float f) {
            com.google.common.collect.TreeRangeMap<java.lang.Long, com.google.common.base.Function<android.util.Pair<java.lang.Long, java.lang.Integer>, java.lang.Float>> create = com.google.common.collect.TreeRangeMap.create();
            this.getHighSpeedVideoSizes = create;
            this.Camera2StreamConfigurationMap = f;
            create.put(com.google.common.collect.Range.all(), new com.google.common.base.Function() { // from class: androidx.media3.common.audio.DefaultGainProvider$Builder$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    java.lang.Float valueOf;
                    valueOf = java.lang.Float.valueOf(-3.4028235E38f);
                    return valueOf;
                }
            });
        }

        public final androidx.media3.common.audio.DefaultGainProvider.Builder addFadeAt(final long j, final long j2, final androidx.media3.common.audio.DefaultGainProvider.FadeProvider fadeProvider) {
            com.google.common.base.Preconditions.checkArgument(j >= 0);
            com.google.common.base.Preconditions.checkArgument(j2 > 1);
            this.getHighSpeedVideoSizes.put(com.google.common.collect.Range.closedOpen(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j + j2)), new com.google.common.base.Function() { // from class: androidx.media3.common.audio.DefaultGainProvider$Builder$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.audio.DefaultGainProvider.Builder.getHighResolutionOutputSizeshNQ4ISI(j, fadeProvider, j2, (android.util.Pair) obj);
                }
            });
            return this;
        }

        static /* synthetic */ java.lang.Float getHighResolutionOutputSizeshNQ4ISI(long j, androidx.media3.common.audio.DefaultGainProvider.FadeProvider fadeProvider, long j2, android.util.Pair pair) {
            int intValue = ((java.lang.Integer) pair.second).intValue();
            return java.lang.Float.valueOf(fadeProvider.getGainFactorAt(((java.lang.Long) pair.first).longValue() - androidx.media3.common.util.Util.durationUsToSampleCount(j, intValue), androidx.media3.common.util.Util.durationUsToSampleCount(j2, intValue)));
        }

        public final androidx.media3.common.audio.DefaultGainProvider build() {
            return new androidx.media3.common.audio.DefaultGainProvider(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, (byte) 0);
        }
    }

    static /* synthetic */ float getHighSpeedVideoFpsRanges(long j, long j2) {
        return (float) java.lang.Math.sin((j * 1.5707963267948966d) / j2);
    }

    static /* synthetic */ float getHighSpeedVideoFpsRangesFor(long j, long j2) {
        return (float) java.lang.Math.cos((j * 1.5707963267948966d) / j2);
    }

    private DefaultGainProvider(com.google.common.collect.TreeRangeMap<java.lang.Long, com.google.common.base.Function<android.util.Pair<java.lang.Long, java.lang.Integer>, java.lang.Float>> treeRangeMap, float f) {
        com.google.common.collect.TreeRangeMap<java.lang.Long, com.google.common.base.Function<android.util.Pair<java.lang.Long, java.lang.Integer>, java.lang.Float>> create = com.google.common.collect.TreeRangeMap.create();
        this.Camera2StreamConfigurationMap = create;
        create.putAll(treeRangeMap);
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public final float getGainFactorAtSamplePosition(long j, int i) {
        com.google.common.base.Preconditions.checkState(i > 0);
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        float floatValue = ((java.lang.Float) ((com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap.get(java.lang.Long.valueOf(androidx.media3.common.util.Util.sampleCountToDurationUs(j, i))))).apply(android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)))).floatValue();
        return floatValue == -3.4028235E38f ? this.getHighResolutionOutputSizeshNQ4ISI : floatValue;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public final long isUnityUntil(long j, int i) {
        com.google.common.base.Preconditions.checkState(i > 0);
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        java.util.Map.Entry entry = (java.util.Map.Entry) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap.getEntry(java.lang.Long.valueOf(androidx.media3.common.util.Util.sampleCountToDurationUs(j, i))));
        float floatValue = ((java.lang.Float) ((com.google.common.base.Function) entry.getValue()).apply(android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)))).floatValue();
        if (floatValue == 1.0f) {
            return j + 1;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != 1.0f || floatValue != -3.4028235E38f) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (((com.google.common.collect.Range) entry.getKey()).hasUpperBound()) {
            return androidx.media3.common.util.Util.durationUsToSampleCount(((java.lang.Long) ((com.google.common.collect.Range) entry.getKey()).upperEndpoint()).longValue(), i);
        }
        return Long.MIN_VALUE;
    }
}
