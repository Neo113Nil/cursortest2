package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0007\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\t\u001a:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000e\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "block", "Lkotlin/time/Duration;", "measureTime", "(Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "T", "Lkotlin/time/TimedValue;", "measureTimedValue", "(Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MeasureTimeKt {
    public static final long measureTime(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        function0.invoke();
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto);
    }

    public static final long measureTime(kotlin.time.TimeSource timeSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.time.TimeMark markNow = timeSource.markNow();
        function0.invoke();
        return markNow.mo23933elapsedNowUwyO8pc();
    }

    public static final long measureTime(kotlin.time.TimeSource.Monotonic monotonic, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monotonic, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        long m24028markNowz9LOYto = monotonic.m24028markNowz9LOYto();
        function0.invoke();
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto);
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.time.TimedValue<>(function0.invoke(), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto()), null);
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.time.TimeSource timeSource, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.time.TimedValue<>(function0.invoke(), timeSource.markNow().mo23933elapsedNowUwyO8pc(), null);
    }

    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(kotlin.time.TimeSource.Monotonic monotonic, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monotonic, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.time.TimedValue<>(function0.invoke(), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(monotonic.m24028markNowz9LOYto()), null);
    }
}
