package androidx.glance.session;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.L;

@Metadata(d1 = {"\u00002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aL\u0010\u000b\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a,\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0010H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"withTimer", ExifInterface.GPS_DIRECTION_TRUE, "timeSource", "Landroidx/glance/session/TimeSource;", "block", "Lkotlin/Function2;", "Landroidx/glance/session/TimerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/glance/session/TimeSource;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimerOrNull", "update", "", "Ljava/util/concurrent/atomic/AtomicReference;", "updater", "Lkotlin/Function1;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimerScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        while (true) {
            Object obj = atomicReference.get();
            T invoke = function1.invoke(obj);
            while (!atomicReference.compareAndSet(obj, invoke)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    public static final <T> Object withTimer(TimeSource timeSource, Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return L.c(new TimerScopeKt$withTimer$2(function2, timeSource, null), continuation);
    }

    public static /* synthetic */ Object withTimer$default(TimeSource timeSource, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            timeSource = TimeSource.INSTANCE.getMonotonic();
        }
        return withTimer(timeSource, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withTimerOrNull(TimeSource timeSource, Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        TimerScopeKt$withTimerOrNull$1 timerScopeKt$withTimerOrNull$1;
        int i;
        try {
            if (continuation instanceof TimerScopeKt$withTimerOrNull$1) {
                timerScopeKt$withTimerOrNull$1 = (TimerScopeKt$withTimerOrNull$1) continuation;
                int i2 = timerScopeKt$withTimerOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    timerScopeKt$withTimerOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = timerScopeKt$withTimerOrNull$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = timerScopeKt$withTimerOrNull$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    timerScopeKt$withTimerOrNull$1.L$0 = function2;
                    timerScopeKt$withTimerOrNull$1.label = 1;
                    Object withTimer = withTimer(timeSource, function2, timerScopeKt$withTimerOrNull$1);
                    return withTimer == coroutine_suspended ? coroutine_suspended : withTimer;
                }
            }
            if (i == 0) {
            }
        } catch (TimeoutCancellationException e) {
            if (e.getBlock() == function2.hashCode()) {
                return null;
            }
            throw e;
        }
        timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(continuation);
        Object obj2 = timerScopeKt$withTimerOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timerScopeKt$withTimerOrNull$1.label;
    }

    public static /* synthetic */ Object withTimerOrNull$default(TimeSource timeSource, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            timeSource = TimeSource.INSTANCE.getMonotonic();
        }
        return withTimerOrNull(timeSource, function2, continuation);
    }
}
