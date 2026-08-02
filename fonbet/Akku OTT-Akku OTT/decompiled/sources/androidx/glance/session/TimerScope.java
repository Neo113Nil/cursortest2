package androidx.glance.session;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/glance/session/TimerScope;", "Lkotlinx/coroutines/K;", "Lkotlin/time/Duration;", "initialTimeout", "", "startTimer-LRDsOJo", "(J)V", "startTimer", "time", "addTime-LRDsOJo", "addTime", "getTimeLeft-UwyO8pc", "()J", "timeLeft", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TimerScope extends K {
    /* renamed from: addTime-LRDsOJo, reason: not valid java name */
    void mo1451addTimeLRDsOJo(long time);

    @Override // kotlinx.coroutines.K
    /* synthetic */ CoroutineContext getCoroutineContext();

    /* renamed from: getTimeLeft-UwyO8pc, reason: not valid java name */
    long mo1452getTimeLeftUwyO8pc();

    /* renamed from: startTimer-LRDsOJo, reason: not valid java name */
    void mo1453startTimerLRDsOJo(long initialTimeout);
}
