package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1072p<T> extends ContinuationImpl {
    public Ref.ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    public C1072p() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return C1062g.c(null, null, this);
    }
}
