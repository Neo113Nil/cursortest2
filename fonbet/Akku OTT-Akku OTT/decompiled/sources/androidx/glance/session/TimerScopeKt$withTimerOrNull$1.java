package androidx.glance.session;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.TimerScopeKt", f = "TimerScope.kt", i = {0}, l = {137}, m = "withTimerOrNull", n = {"block"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TimerScopeKt$withTimerOrNull$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TimerScopeKt$withTimerOrNull$1(Continuation<? super TimerScopeKt$withTimerOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimerScopeKt.withTimerOrNull(null, null, this);
    }
}
