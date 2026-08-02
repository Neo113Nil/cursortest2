package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import dm0.InterfaceC6216a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pl0.n f20531a;

    public w(@NotNull Pl0.n ipcClientsInitializer) {
        Intrinsics.checkNotNullParameter(ipcClientsInitializer, "ipcClientsInitializer");
        this.f20531a = ipcClientsInitializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        v vVar;
        int i11;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i12 = vVar.f20530g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vVar.f20530g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vVar.f20528e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = vVar.f20530g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Pl0.n nVar = this.f20531a;
                    vVar.f20527d = str;
                    vVar.f20530g = 1;
                    obj = nVar.invoke(vVar);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return ((Sc.r) obj).getF26106a();
                    }
                    str = vVar.f20527d;
                    Sc.s.b(obj);
                }
                InterfaceC6216a interfaceC6216a = ((Rl0.b) obj).f25165b;
                vVar.f20527d = null;
                vVar.f20530g = 2;
                Object c11 = interfaceC6216a.c(str, vVar);
                return c11 != aVar ? aVar : c11;
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.f20528e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = vVar.f20530g;
        if (i11 != 0) {
        }
        InterfaceC6216a interfaceC6216a2 = ((Rl0.b) obj2).f25165b;
        vVar.f20527d = null;
        vVar.f20530g = 2;
        Object c112 = interfaceC6216a2.c(str, vVar);
        if (c112 != aVar2) {
        }
    }
}
