package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n30#2,10:109\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1074s implements InterfaceC1060e<Object> {
    public final /* synthetic */ C1076u a;
    public final /* synthetic */ Function2 b;

    public C1074s(C1076u c1076u, Function2 function2) {
        this.a = c1076u;
        this.b = function2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super Object> interfaceC1061f, Continuation<? super Unit> continuation) {
        Object collect = this.a.collect(new C1075t(new Ref.BooleanRef(), interfaceC1061f, this.b), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
