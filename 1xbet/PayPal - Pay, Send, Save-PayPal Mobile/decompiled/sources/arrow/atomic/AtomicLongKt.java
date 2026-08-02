package arrow.atomic;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a<\u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\r\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\r\u0010\u000e\u001a<\u0010\u000f\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a<\u0010\u0011\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001ap\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0012*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\u0015\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0014\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\r\u0010\u0016\u001aj\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\u0017\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0014\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u00040\u0013H\u0080\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u000b\u0010\u0018\",\u0010\u0019\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0019\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/concurrent/atomic/AtomicLong;", "Larrow/atomic/Camera2StreamConfigurationMap;", "Lkotlin/Function1;", "", "", "action", "", "loop", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "function", "", "tryUpdate", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)Z", "update", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V", "getAndUpdate", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)J", "updateAndGet", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "transform", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "onUpdated", "(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "(Ljava/util/concurrent/atomic/AtomicLong;)J", "setValue", "(Ljava/util/concurrent/atomic/AtomicLong;J)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicLongKt {
    public static final long getValue(java.util.concurrent.atomic.AtomicLong atomicLong) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        return atomicLong.get();
    }

    public static final void setValue(java.util.concurrent.atomic.AtomicLong atomicLong, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        atomicLong.set(j);
    }

    public static final java.lang.Void loop(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke(java.lang.Long.valueOf(getValue(atomicLong)));
        }
    }

    public static final boolean tryUpdate(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        long value = getValue(atomicLong);
        long longValue = function1.invoke(java.lang.Long.valueOf(value)).longValue();
        boolean compareAndSet = atomicLong.compareAndSet(value, longValue);
        if (compareAndSet) {
            function2.invoke(java.lang.Long.valueOf(value), java.lang.Long.valueOf(longValue));
        }
        return compareAndSet;
    }

    public static final boolean tryUpdate(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        long value = getValue(atomicLong);
        return atomicLong.compareAndSet(value, function1.invoke(java.lang.Long.valueOf(value)).longValue());
    }

    public static final void update(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (!atomicLong.compareAndSet(getValue(atomicLong), function1.invoke(java.lang.Long.valueOf(getValue(atomicLong))).longValue())) {
        }
    }

    public static final long getAndUpdate(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = getValue(atomicLong);
        } while (!atomicLong.compareAndSet(value, function1.invoke(java.lang.Long.valueOf(getValue(atomicLong))).longValue()));
        return value;
    }

    public static final long updateAndGet(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long value;
        long longValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = getValue(atomicLong);
            longValue = function1.invoke(java.lang.Long.valueOf(getValue(atomicLong))).longValue();
        } while (!atomicLong.compareAndSet(value, longValue));
        return longValue;
    }

    public static final <R> R update(java.util.concurrent.atomic.AtomicLong atomicLong, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends R> function2) {
        long value;
        long longValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        do {
            value = getValue(atomicLong);
            longValue = function1.invoke(java.lang.Long.valueOf(getValue(atomicLong))).longValue();
        } while (!atomicLong.compareAndSet(value, longValue));
        return function2.invoke(java.lang.Long.valueOf(value), java.lang.Long.valueOf(longValue));
    }
}
