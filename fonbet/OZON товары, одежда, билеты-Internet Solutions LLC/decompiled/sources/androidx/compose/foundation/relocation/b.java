package androidx.compose.foundation.relocation;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7460f;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;
import z0.i;

/* loaded from: classes.dex */
final class b implements InterfaceC10969b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<d> f39741a = new U0.b<>(new d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:10:0x0061). Please report as a decompilation issue!!! */
    @Override // z0.InterfaceC10969b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C7460f c7460f, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        int m11;
        C7460f c7460f2;
        int i12;
        Object[] objArr;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i13 = aVar.f39740j;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f39740j = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f39738h;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f39740j;
                if (i11 != 0) {
                    s.b(obj);
                    U0.b<d> bVar = this.f39741a;
                    m11 = bVar.m();
                    if (m11 > 0) {
                        d[] l11 = bVar.l();
                        c7460f2 = c7460f;
                        i12 = 0;
                        objArr = l11;
                        d dVar = (d) objArr[i12];
                        aVar.f39734d = c7460f2;
                        aVar.f39735e = objArr;
                        aVar.f39736f = m11;
                        aVar.f39737g = i12;
                        aVar.f39740j = 1;
                        if (i.a(dVar, c7460f2, aVar) == aVar2) {
                            return aVar2;
                        }
                        i12++;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = aVar.f39737g;
                m11 = aVar.f39736f;
                objArr = aVar.f39735e;
                C7460f c7460f3 = aVar.f39734d;
                s.b(obj);
                c7460f2 = c7460f3;
                i12++;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f39738h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f39740j;
        if (i11 != 0) {
        }
    }

    @NotNull
    public final U0.b<d> b() {
        return this.f39741a;
    }
}
