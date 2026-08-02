package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C0;

@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
/* loaded from: classes5.dex */
public final class N0<T> extends B0 {
    public final C0.a e;

    public N0(C0.a aVar) {
        this.e = aVar;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return false;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        C0 h = h();
        h.getClass();
        Object obj = C0.a.get(h);
        boolean z = obj instanceof A;
        C0.a aVar = this.e;
        if (z) {
            Result.Companion companion = Result.INSTANCE;
            aVar.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(((A) obj).a)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            aVar.resumeWith(Result.m1716constructorimpl(F0.a(obj)));
        }
    }
}
