package androidx.compose.ui.platform;

import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class F0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wc.a a(@NotNull D1.x0 x0Var, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        A0 a02;
        int i11;
        Object c11;
        if (cVar instanceof A0) {
            a02 = (A0) cVar;
            int i12 = a02.f40493f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a02.f40493f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a02.f40491d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = a02.f40493f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    E0 e02 = new E0(function2, this, null);
                    a02.f40493f = 1;
                    c11 = C5278q1.c(x0Var, null, e02, a02);
                    if (c11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        a02 = new A0(this, cVar);
        Object obj2 = a02.f40491d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a02.f40493f;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
