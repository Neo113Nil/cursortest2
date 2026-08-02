package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.E;
import kotlinx.coroutines.H;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;
import kotlinx.coroutines.internal.C;

/* loaded from: classes5.dex */
public abstract class j<S, T> extends g<T> {

    @JvmField
    public final InterfaceC1060e<S> d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(InterfaceC1060e<? extends S> interfaceC1060e, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        super(coroutineContext, i, aVar);
        this.d = interfaceC1060e;
    }

    @Override // kotlinx.coroutines.flow.internal.g
    public final Object b(kotlinx.coroutines.channels.t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object e = e(new y(tVar), continuation);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.g, kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        if (this.b == -3) {
            CoroutineContext coroutineContext = continuation.get$context();
            Boolean bool = Boolean.FALSE;
            E e = new E();
            CoroutineContext coroutineContext2 = this.a;
            CoroutineContext plus = !((Boolean) coroutineContext2.fold(bool, e)).booleanValue() ? coroutineContext.plus(coroutineContext2) : H.a(coroutineContext, coroutineContext2, false);
            if (Intrinsics.areEqual(plus, coroutineContext)) {
                Object e2 = e(interfaceC1061f, continuation);
                return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(plus.get(companion), coroutineContext.get(companion))) {
                CoroutineContext coroutineContext3 = continuation.get$context();
                if (!(interfaceC1061f instanceof y) && !(interfaceC1061f instanceof s)) {
                    interfaceC1061f = new A(interfaceC1061f, coroutineContext3);
                }
                Object a = h.a(plus, interfaceC1061f, C.b(plus), new i(this, null), continuation);
                return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
            }
        }
        Object collect = super.collect(interfaceC1061f, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public abstract Object e(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.internal.g
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
