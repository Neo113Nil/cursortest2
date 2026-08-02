package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes5.dex */
public final class M {

    @JvmField
    public static final kotlinx.coroutines.internal.x a = new kotlinx.coroutines.internal.x("NO_VALUE");

    public static final void a(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> InterfaceC1060e<T> b(K<? extends T> k, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return ((i == 0 || i == -3) && aVar == kotlinx.coroutines.channels.a.a) ? k : new kotlinx.coroutines.flow.internal.k(k, coroutineContext, i, aVar);
    }
}
