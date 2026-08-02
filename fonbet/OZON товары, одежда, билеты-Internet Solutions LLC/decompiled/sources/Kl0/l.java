package Kl0;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.os.IBinder;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jb.InterfaceC7332a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ub.AbstractC9996c;

/* loaded from: classes8.dex */
public final class l extends AbstractC9996c<InterfaceC7332a> implements a {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f16022m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Za.d logger, @NotNull Context context, @NotNull List preferredHosts, @NotNull Function1 onNoHostToBind) {
        super(logger, context, preferredHosts, onNoHostToBind);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(onNoHostToBind, "onNoHostToBind");
        this.f16022m = "AuthIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // Kl0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f16017f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f16017f = i12 - LinearLayoutManager.INVALID_OFFSET;
                g gVar2 = gVar;
                Object obj = gVar2.f16015d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar2.f16017f;
                if (i11 != 0) {
                    s.b(obj);
                    h hVar = h.f16018b;
                    i iVar = i.f16019b;
                    j jVar = j.f16020b;
                    k kVar = k.f16021b;
                    gVar2.f16017f = 1;
                    obj = t(hVar, "isUserAuthorized", iVar, jVar, kVar, TimeUnit.MINUTES.toMillis(3L), gVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        gVar = new g(this, cVar);
        g gVar22 = gVar;
        Object obj2 = gVar22.f16015d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar22.f16017f;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // Kl0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f16010f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f16010f = i12 - LinearLayoutManager.INVALID_OFFSET;
                b bVar2 = bVar;
                Object obj = bVar2.f16008d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar2.f16010f;
                if (i11 != 0) {
                    s.b(obj);
                    c cVar2 = c.f16011b;
                    d dVar = d.f16012b;
                    e eVar = e.f16013b;
                    f fVar = f.f16014b;
                    bVar2.f16010f = 1;
                    obj = t(cVar2, "getIntermediateToken", dVar, eVar, fVar, TimeUnit.MINUTES.toMillis(3L), bVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        bVar = new b(this, cVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.f16008d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar22.f16010f;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    @Override // ub.AbstractC9996c
    public final InterfaceC7332a o(IBinder service) {
        Intrinsics.checkNotNullParameter(service, "service");
        InterfaceC7332a H11 = InterfaceC7332a.AbstractBinderC1134a.H(service);
        Intrinsics.checkNotNullExpressionValue(H11, "asInterface(service)");
        return H11;
    }

    @Override // ub.AbstractC9996c
    @NotNull
    public final String r() {
        return this.f16022m;
    }
}
