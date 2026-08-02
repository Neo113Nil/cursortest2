package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes5.dex */
public final class N extends kotlinx.coroutines.flow.internal.d<L<?>> {

    @JvmField
    public long a = -1;

    @JvmField
    public C1100n b;

    @Override // kotlinx.coroutines.flow.internal.d
    public final boolean a(kotlinx.coroutines.flow.internal.b bVar) {
        L l = (L) bVar;
        if (this.a >= 0) {
            return false;
        }
        long j = l.i;
        if (j < l.j) {
            l.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Continuation[] b(kotlinx.coroutines.flow.internal.b bVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((L) bVar).r(j);
    }
}
