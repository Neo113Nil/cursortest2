package Ol0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Ml0.g f20469a;

    public e(@NotNull Ml0.g arbiterIPCClientFactory) {
        Intrinsics.checkNotNullParameter(arbiterIPCClientFactory, "arbiterIPCClientFactory");
        this.f20469a = arbiterIPCClientFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Za.a host, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f20468f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f20468f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f20466d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f20468f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return ((Sc.r) obj).getF26106a();
                }
                Sc.s.b(obj);
                Ml0.g gVar = this.f20469a;
                Intrinsics.checkNotNullParameter(host, "host");
                Ml0.f fVar = new Ml0.f(gVar.f18168a, C7714v.a0(host), gVar.f18169b);
                dVar.f20468f = 1;
                Object a11 = fVar.a(dVar);
                return a11 == aVar ? aVar : a11;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f20466d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f20468f;
        if (i11 == 0) {
        }
    }
}
