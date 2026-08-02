package Cd0;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessResponse;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f4806a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zd0.b f4807b;

    public f(@NotNull a inAppPushApi, @NotNull zd0.b config) {
        Intrinsics.checkNotNullParameter(inAppPushApi, "inAppPushApi");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4806a = inAppPushApi;
        this.f4807b = config;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f4796f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f4796f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f4794d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f4796f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                c cVar2 = new c(this, str, null);
                bVar.f4796f = 1;
                Object a11 = Jd0.c.a(cVar2, bVar);
                return a11 == aVar ? aVar : a11;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f4794d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f4796f;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        Object a11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f4802f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f4802f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f4800d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f4802f;
                if (i11 != 0) {
                    s.b(obj);
                    e eVar = new e(this, str, null);
                    dVar.f4802f = 1;
                    a11 = Jd0.c.a(eVar, dVar);
                    if (a11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    a11 = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                return a11 instanceof r.b ? h.a((ActionProcessResponse) a11) : a11;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f4800d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f4802f;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }
}
