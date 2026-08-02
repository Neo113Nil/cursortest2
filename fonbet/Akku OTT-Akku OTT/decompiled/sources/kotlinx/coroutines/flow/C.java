package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.C1065a;

@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n121#2,2:131\n*E\n"})
/* loaded from: classes5.dex */
public final class C implements InterfaceC1061f<Object> {
    public final /* synthetic */ Ref.ObjectRef a;

    public C(Ref.ObjectRef objectRef) {
        this.a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        this.a.element = obj;
        throw new C1065a(this);
    }
}
