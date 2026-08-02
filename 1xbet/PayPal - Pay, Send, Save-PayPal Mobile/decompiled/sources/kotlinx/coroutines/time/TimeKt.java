package kotlinx.coroutines.time;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\t\u001aC\u0010\u0012\u001a\u00020\u0002\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001aT\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Ljava/time/Duration;", "duration", "", "delay", "(Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/flow/Flow;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "debounce", "(Lkotlinx/coroutines/flow/Flow;Ljava/time/Duration;)Lkotlinx/coroutines/flow/Flow;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "sample", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "onTimeout", "(Lkotlinx/coroutines/selects/SelectBuilder;Ljava/time/Duration;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "withTimeout", "(Ljava/time/Duration;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "", "getHighSpeedVideoFpsRanges", "(Ljava/time/Duration;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TimeKt {
    public static final java.lang.Object delay(java.time.Duration duration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object delay = kotlinx.coroutines.DelayKt.delay(getHighSpeedVideoFpsRanges(duration), continuation);
        return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration duration) {
        return kotlinx.coroutines.flow.FlowKt.debounce(flow, getHighSpeedVideoFpsRanges(duration));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration duration) {
        return kotlinx.coroutines.flow.FlowKt.sample(flow, getHighSpeedVideoFpsRanges(duration));
    }

    public static final <R> void onTimeout(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, java.time.Duration duration, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(selectBuilder, getHighSpeedVideoFpsRanges(duration), function1);
    }

    public static final <T> java.lang.Object withTimeout(java.time.Duration duration, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeout(getHighSpeedVideoFpsRanges(duration), function2, continuation);
    }

    public static final <T> java.lang.Object withTimeoutOrNull(java.time.Duration duration, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(getHighSpeedVideoFpsRanges(duration), function2, continuation);
    }

    private static final long getHighSpeedVideoFpsRanges(java.time.Duration duration) {
        if (duration.compareTo(java.time.Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(java.time.temporal.ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }
}
