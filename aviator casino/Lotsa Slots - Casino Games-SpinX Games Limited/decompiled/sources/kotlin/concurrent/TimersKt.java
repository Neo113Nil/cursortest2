package kotlin.concurrent;

/* compiled from: Timer.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a;\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u001aO\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aO\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001aM\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a'\u0010\u0015\u001a\u00020\u00012\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"schedule", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "delay", "", "action", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "time", "Ljava/util/Date;", "period", "scheduleAtFixedRate", "timer", "name", "", "daemon", "", "initialDelay", "startAt", "fixedRateTimer", "timerTask", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimersKt {
    private static final java.util.TimerTask schedule(java.util.Timer timer, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j);
        return timersKt$timerTask$1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, java.util.Date time, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time);
        return timersKt$timerTask$1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, j, j2);
        return timersKt$timerTask$1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, java.util.Date time, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.schedule(timersKt$timerTask$1, time, j);
        return timersKt$timerTask$1;
    }

    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer timer, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, j, j2);
        return timersKt$timerTask$1;
    }

    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer timer, java.util.Date time, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt$timerTask$1 timersKt$timerTask$1 = new kotlin.concurrent.TimersKt$timerTask$1(action);
        timer.scheduleAtFixedRate(timersKt$timerTask$1, time, j);
        return timersKt$timerTask$1;
    }

    public static final java.util.Timer timer(java.lang.String str, boolean z) {
        return str == null ? new java.util.Timer(z) : new java.util.Timer(str, z);
    }

    static /* synthetic */ java.util.Timer timer$default(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt$timerTask$1(action), j, j2);
        return timer;
    }

    private static final java.util.Timer timer(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt$timerTask$1(action), j, j2);
        return timer;
    }

    static /* synthetic */ java.util.Timer timer$default(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    private static final java.util.Timer timer(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    static /* synthetic */ java.util.Timer fixedRateTimer$default(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt$timerTask$1(action), j, j2);
        return timer;
    }

    private static final java.util.Timer fixedRateTimer(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt$timerTask$1(action), j, j2);
        return timer;
    }

    static /* synthetic */ java.util.Timer fixedRateTimer$default(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    private static final java.util.Timer fixedRateTimer(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt$timerTask$1(action), startAt, j);
        return timer;
    }

    private static final java.util.TimerTask timerTask(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return new kotlin.concurrent.TimersKt$timerTask$1(action);
    }
}
