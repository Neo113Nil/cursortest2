package androidx.glance.session;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.W;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1", f = "TimerScope.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ TimeSource $timeSource;
    final /* synthetic */ K $timerScope;
    int label;
    final /* synthetic */ TimerScopeKt$withTimer$2$1$blockScope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, TimeSource timeSource, K k, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = timerScopeKt$withTimer$2$1$blockScope$1;
        this.$timeSource = timeSource;
        this.$timerScope = k;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this.this$0, this.$timeSource, this.$timerScope, this.$block, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        long j;
        Object b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            atomicReference = this.this$0.deadline;
            Object obj2 = atomicReference.get();
            Intrinsics.checkNotNull(obj2);
            if (((Number) obj2).longValue() <= this.$timeSource.markNow()) {
                L.b(this.$timerScope, new TimeoutCancellationException("Timed out of executing block.", this.$block.hashCode()));
                return Unit.INSTANCE;
            }
            long mo1452getTimeLeftUwyO8pc = this.this$0.mo1452getTimeLeftUwyO8pc();
            this.label = 1;
            boolean m3088isPositiveimpl = Duration.m3088isPositiveimpl(mo1452getTimeLeftUwyO8pc);
            if (m3088isPositiveimpl) {
                j = Duration.m3072getInWholeMillisecondsimpl(Duration.m3090plusLRDsOJo(mo1452getTimeLeftUwyO8pc, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
            } else {
                if (m3088isPositiveimpl) {
                    throw new NoWhenBranchMatchedException();
                }
                j = 0;
            }
            b = W.b(j, this);
            if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                b = Unit.INSTANCE;
            }
        } while (b != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
