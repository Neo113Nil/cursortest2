package com.datadog.android.core.sampling;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00138CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/sampling/RateBasedSampler;", "", "T", "Lcom/datadog/android/core/sampling/Sampler;", "", "sampleRate", "<init>", "(F)V", "", "(D)V", "Lkotlin/Function0;", "sampleRateProvider", "(Lkotlin/jvm/functions/Function0;)V", "getSampleRate", "()Ljava/lang/Float;", "item", "", "sample", "(Ljava/lang/Object;)Z", "Ljava/security/SecureRandom;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class RateBasedSampler<T> implements com.datadog.android.core.sampling.Sampler<T> {
    private static final com.datadog.android.core.sampling.RateBasedSampler.Companion Companion = new com.datadog.android.core.sampling.RateBasedSampler.Companion(null);

    @java.lang.Deprecated
    public static final float SAMPLE_ALL_RATE = 100.0f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    public RateBasedSampler(kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.security.SecureRandom>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$random$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.security.SecureRandom invoke() {
                return new java.security.SecureRandom();
            }
        });
    }

    public RateBasedSampler(final float f) {
        this(new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: com.datadog.android.core.sampling.RateBasedSampler.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float invoke() {
                return java.lang.Float.valueOf(f);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public RateBasedSampler(double d) {
        this((float) d);
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(T item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        float floatValue = getSampleRate().floatValue();
        if (floatValue == 0.0f) {
            return false;
        }
        return floatValue == 100.0f || ((java.security.SecureRandom) this.getHighSpeedVideoFpsRanges.getValue()).nextFloat() * 100.0f <= floatValue;
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public java.lang.Float getSampleRate() {
        final float floatValue = this.getHighSpeedVideoFpsRangesFor.invoke().floatValue();
        float f = 0.0f;
        if (floatValue < 0.0f) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    float f2 = floatValue;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Sample rate value provided ");
                    sb.append(f2);
                    sb.append(" is below 0, setting it to 0.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            f = 100.0f;
            if (floatValue > 100.0f) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        float f2 = floatValue;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Sample rate value provided ");
                        sb.append(f2);
                        sb.append(" is above 100, setting it to 100.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            return java.lang.Float.valueOf(floatValue);
        }
        floatValue = f;
        return java.lang.Float.valueOf(floatValue);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/sampling/RateBasedSampler$Companion;", "", "<init>", "()V", "", "SAMPLE_ALL_RATE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
