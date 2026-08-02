package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: kotlinx.coroutines.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1117w<T> extends C0 implements InterfaceC1115v<T> {
    @Override // kotlinx.coroutines.S
    public final Object await(Continuation<? super T> continuation) {
        Object n = n(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return n;
    }

    @Override // kotlinx.coroutines.S
    public final kotlinx.coroutines.selects.c<T> getOnAwait() {
        D0 d0 = D0.a;
        Intrinsics.checkNotNull(d0, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(d0, 3);
        E0 e0 = E0.a;
        Intrinsics.checkNotNull(e0, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        kotlinx.coroutines.selects.d dVar = new kotlinx.coroutines.selects.d(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(e0, 3));
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return dVar;
    }

    @Override // kotlinx.coroutines.InterfaceC1115v
    public final boolean s(Throwable th) {
        return M(new A(th, false));
    }
}
