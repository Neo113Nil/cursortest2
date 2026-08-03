package kotlinx.coroutines.flow;

/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0005H\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0002\b\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0005H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0000\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\t\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\t\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "", "Lkotlin/Function1;", "timeout", "Lkotlin/time/Duration;", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceDuration", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "sample", "periodMillis", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes6.dex */
final /* synthetic */ class FlowKt__DelayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j, java.lang.Object obj) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    long debounce$lambda$1$FlowKt__DelayKt;
                    debounce$lambda$1$FlowKt__DelayKt = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j, obj);
                    return java.lang.Long.valueOf(debounce$lambda$1$FlowKt__DelayKt);
                }
            });
        }
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, function1);
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m12345debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.debounce(flow, kotlinx.coroutines.DelayKt.m12292toDelayMillisLRDsOJo(j));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                long debounce$lambda$2$FlowKt__DelayKt;
                debounce$lambda$2$FlowKt__DelayKt = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(kotlin.jvm.functions.Function1.this, obj);
                return java.lang.Long.valueOf(debounce$lambda$2$FlowKt__DelayKt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return kotlinx.coroutines.DelayKt.m12292toDelayMillisLRDsOJo(((kotlin.time.Duration) function1.invoke(obj)).getRawValue());
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> debounceInternal$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
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
    public static final <T> kotlinx.coroutines.flow.Flow<T> m12346sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.sample(flow, kotlinx.coroutines.DelayKt.m12292toDelayMillisLRDsOJo(j));
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m12347timeoutHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return m12348timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> kotlinx.coroutines.flow.Flow<T> m12348timeoutInternalHG0u8IE$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }
}
