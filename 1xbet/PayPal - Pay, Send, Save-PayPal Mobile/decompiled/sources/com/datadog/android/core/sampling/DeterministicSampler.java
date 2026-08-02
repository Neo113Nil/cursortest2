package com.datadog.android.core.sampling;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 \u001b*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB%\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fB)\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/sampling/DeterministicSampler;", "", "T", "Lcom/datadog/android/core/sampling/Sampler;", "Lkotlin/Function1;", "Lkotlin/ULong;", "idConverter", "", "sampleRate", "<init>", "(Lkotlin/jvm/functions/Function1;F)V", "", "(Lkotlin/jvm/functions/Function1;D)V", "Lkotlin/Function0;", "sampleRateProvider", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSampleRate", "()Ljava/lang/Float;", "item", "", "sample", "(Ljava/lang/Object;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DeterministicSampler<T> implements com.datadog.android.core.sampling.Sampler<T> {
    public static final long MAX_ID = -1;
    public static final long SAMPLER_HASHER = 1111111111111111111L;
    public static final float SAMPLE_ALL_RATE = 100.0f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, kotlin.ULong> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DeterministicSampler(kotlin.jvm.functions.Function1<? super T, kotlin.ULong> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeterministicSampler(kotlin.jvm.functions.Function1<? super T, kotlin.ULong> function1, final float f) {
        this(function1, new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: com.datadog.android.core.sampling.DeterministicSampler.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float invoke() {
                return java.lang.Float.valueOf(f);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeterministicSampler(kotlin.jvm.functions.Function1<? super T, kotlin.ULong> function1, double d) {
        this((kotlin.jvm.functions.Function1) function1, (float) d);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(T item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        float floatValue = getSampleRate().floatValue();
        if (floatValue >= 100.0f) {
            return true;
        }
        return floatValue > 0.0f && java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(this.Camera2StreamConfigurationMap.invoke(item).getGetHighSpeedVideoFpsRanges() * SAMPLER_HASHER), kotlin.UnsignedKt.doubleToULong((kotlin.UnsignedKt.ulongToDouble(-1L) * ((double) floatValue)) / 100.0d)) < 0;
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public java.lang.Float getSampleRate() {
        final float floatValue = this.getHighSpeedVideoSizes.invoke().floatValue();
        float f = 0.0f;
        if (floatValue < 0.0f) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.sampling.DeterministicSampler$getSampleRate$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
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
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.sampling.DeterministicSampler$getSampleRate$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
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
}
