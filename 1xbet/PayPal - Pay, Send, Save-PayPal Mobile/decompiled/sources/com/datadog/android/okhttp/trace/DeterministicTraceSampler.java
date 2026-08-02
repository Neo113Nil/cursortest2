package com.datadog.android.okhttp.trace;

@kotlin.Deprecated(message = "Use com.datadog.android.trace.DeterministicTraceSampler instead.", replaceWith = @kotlin.ReplaceWith(expression = "DeterministicTraceSampler", imports = {"com.datadog.android.trace.DeterministicTraceSampler"}))
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/datadog/android/okhttp/trace/DeterministicTraceSampler;", "Lcom/datadog/android/core/sampling/DeterministicSampler;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "", "sampleRate", "<init>", "(F)V", "", "(D)V", "Lkotlin/Function0;", "sampleRateProvider", "(Lkotlin/jvm/functions/Function0;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DeterministicTraceSampler extends com.datadog.android.core.sampling.DeterministicSampler<com.datadog.android.trace.api.span.DatadogSpan> {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.datadog.android.okhttp.trace.DeterministicTraceSampler$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.datadog.android.trace.api.span.DatadogSpan, kotlin.ULong> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.ULong invoke(com.datadog.android.trace.api.span.DatadogSpan datadogSpan) {
            com.datadog.android.trace.api.span.DatadogSpan datadogSpan2 = datadogSpan;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan2, "");
            return kotlin.ULong.m23493boximpl(((com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider) this.receiver).m10015provideIdI7RO_PI(datadogSpan2));
        }

        AnonymousClass1(java.lang.Object obj) {
            super(1, obj, com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider.class, "provideId", "provideId-I7RO_PI(Lcom/datadog/android/trace/api/span/DatadogSpan;)J", 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeterministicTraceSampler(kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        super(new com.datadog.android.okhttp.trace.DeterministicTraceSampler.AnonymousClass1(com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider.INSTANCE), function0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
    }

    public DeterministicTraceSampler(final float f) {
        this(new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: com.datadog.android.okhttp.trace.DeterministicTraceSampler.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float invoke() {
                return java.lang.Float.valueOf(f);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public DeterministicTraceSampler(double d) {
        this((float) d);
    }
}
