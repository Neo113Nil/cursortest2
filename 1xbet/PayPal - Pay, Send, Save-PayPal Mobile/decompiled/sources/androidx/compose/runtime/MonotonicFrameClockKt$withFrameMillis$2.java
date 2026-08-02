package androidx.compose.runtime;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2<R> implements kotlin.jvm.functions.Function1<java.lang.Long, R> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Long, R> getHighSpeedVideoFpsRangesFor;

    public final R invoke(long j) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Long.valueOf(j / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Long l) {
        return invoke(l.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MonotonicFrameClockKt$withFrameMillis$2(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
