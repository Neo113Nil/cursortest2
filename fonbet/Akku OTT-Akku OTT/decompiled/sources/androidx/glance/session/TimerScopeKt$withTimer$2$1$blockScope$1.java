package androidx.glance.session;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/glance/session/TimerScopeKt$withTimer$2$1$blockScope$1", "Landroidx/glance/session/TimerScope;", "Lkotlinx/coroutines/K;", "Lkotlin/time/Duration;", "time", "", "addTime-LRDsOJo", "(J)V", "addTime", "initialTimeout", "startTimer-LRDsOJo", "startTimer", "Ljava/util/concurrent/atomic/AtomicReference;", "", "deadline", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getTimeLeft-UwyO8pc", "()J", "timeLeft", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimerScopeKt$withTimer$2$1$blockScope$1 implements TimerScope, K {
    private final /* synthetic */ K $$delegate_0;
    final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ TimeSource $timeSource;
    final /* synthetic */ AtomicReference<InterfaceC1120x0> $timerJob;
    final /* synthetic */ K $timerScope;
    private final AtomicReference<Long> deadline = new AtomicReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    public TimerScopeKt$withTimer$2$1$blockScope$1(K k, TimeSource timeSource, K k2, Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, AtomicReference<InterfaceC1120x0> atomicReference) {
        this.$timeSource = timeSource;
        this.$timerScope = k2;
        this.$block = function2;
        this.$timerJob = atomicReference;
        this.$$delegate_0 = k;
    }

    @Override // androidx.glance.session.TimerScope
    /* renamed from: addTime-LRDsOJo */
    public void mo1451addTimeLRDsOJo(final long time) {
        TimerScopeKt.update(this.deadline, new Function1<Long, Long>() { // from class: androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$addTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(Long l) {
                if (l == null) {
                    throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                }
                if (!Duration.m3088isPositiveimpl(time)) {
                    throw new IllegalArgumentException("Cannot call addTime with a negative duration");
                }
                return Long.valueOf(Duration.m3072getInWholeMillisecondsimpl(time) + l.longValue());
            }
        });
    }

    @Override // androidx.glance.session.TimerScope, kotlinx.coroutines.K
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.glance.session.TimerScope
    /* renamed from: getTimeLeft-UwyO8pc */
    public long mo1452getTimeLeftUwyO8pc() {
        Long l = this.deadline.get();
        if (l == null) {
            return Duration.INSTANCE.m3153getINFINITEUwyO8pc();
        }
        long longValue = l.longValue() - this.$timeSource.markNow();
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(longValue, DurationUnit.MILLISECONDS);
    }

    @Override // androidx.glance.session.TimerScope
    /* renamed from: startTimer-LRDsOJo */
    public void mo1453startTimerLRDsOJo(long initialTimeout) {
        if (Duration.m3072getInWholeMillisecondsimpl(initialTimeout) <= 0) {
            L.b(this.$timerScope, new TimeoutCancellationException("Timed out immediately", this.$block.hashCode()));
            return;
        }
        if (Duration.m3060compareToLRDsOJo(mo1452getTimeLeftUwyO8pc(), initialTimeout) < 0) {
            return;
        }
        this.deadline.set(Long.valueOf(Duration.m3072getInWholeMillisecondsimpl(initialTimeout) + this.$timeSource.markNow()));
        AtomicReference<InterfaceC1120x0> atomicReference = this.$timerJob;
        K k = this.$timerScope;
        InterfaceC1120x0 andSet = atomicReference.getAndSet(C1082i.c(k, null, null, new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this, this.$timeSource, k, this.$block, null), 3));
        if (andSet != null) {
            andSet.cancel((CancellationException) null);
        }
    }
}
