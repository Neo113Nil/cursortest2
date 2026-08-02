package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class G0<T> extends T<T> {
    public final Continuation<Unit> d;

    public G0(CoroutineContext coroutineContext, Function2<? super K, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.d = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.C0
    public final void S() {
        kotlinx.coroutines.intrinsics.a.b(this.d, this);
    }
}
