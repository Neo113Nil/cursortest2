package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0005\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0005\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "p0", "debounce", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/time/Duration;", "debounce-HG0u8IE", "debounceDuration", "sample", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "fixedPeriodTicker", "(Lkotlinx/coroutines/CoroutineScope;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "sample-HG0u8IE", "timeout-HG0u8IE", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__DelayKt {
    public static /* synthetic */ long getHighSpeedVideoSizes(long j) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(kotlinx.coroutines.flow.FlowKt__DelayKt.getHighSpeedVideoSizes(j));
                }
            }, flow, null));
        }
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m24101debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.debounce(flow, kotlinx.coroutines.DelayKt.m24058toDelayMillisLRDsOJo(j));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> function1) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                long m24058toDelayMillisLRDsOJo;
                m24058toDelayMillisLRDsOJo = kotlinx.coroutines.DelayKt.m24058toDelayMillisLRDsOJo(((kotlin.time.Duration) kotlin.jvm.functions.Function1.this.invoke(obj)).getGetHighResolutionOutputSizeshNQ4ISI());
                return java.lang.Long.valueOf(m24058toDelayMillisLRDsOJo);
            }
        }, flow, null));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Sample period should be positive".toString());
        }
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2(j, flow, null));
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(kotlinx.coroutines.CoroutineScope coroutineScope, long j) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1(j, null), 1, null);
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m24102sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.sample(flow, kotlinx.coroutines.DelayKt.m24058toDelayMillisLRDsOJo(j));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m24103timeoutHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }
}
