package Hb0;

import Hb0.f;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f10793a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<f<?>, Object> f10794b;

    public e(@NotNull b awaitRepository) {
        Intrinsics.checkNotNullParameter(awaitRepository, "awaitRepository");
        this.f10793a = awaitRepository;
        this.f10794b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Hb0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull f fVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        e eVar;
        Object obj;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f10792h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f10792h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = dVar.f10790f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f10792h;
                if (i11 != 0) {
                    s.b(obj2);
                    if (!Intrinsics.d(fVar, f.p.f10814a)) {
                        dVar.f10788d = this;
                        dVar.f10789e = fVar;
                        dVar.f10792h = 1;
                        if (this.f10793a.a(dVar) == aVar) {
                            return aVar;
                        }
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = dVar.f10789e;
                    eVar = dVar.f10788d;
                    s.b(obj2);
                }
                obj = eVar.f10794b.get(fVar);
                if (obj == null) {
                    obj = null;
                }
                return obj != null ? fVar.a() : obj;
            }
        }
        dVar = new d(this, cVar);
        Object obj22 = dVar.f10790f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f10792h;
        if (i11 != 0) {
        }
        obj = eVar.f10794b.get(fVar);
        if (obj == null) {
        }
        if (obj != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Hb0.c
    @NotNull
    public final <T> T b(@NotNull f<T> flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        if (!Intrinsics.d(flag, f.p.f10814a)) {
            b bVar = this.f10793a;
            bVar.getClass();
            C10727i.d(g.f71771a, new a(bVar, null));
        }
        Object obj = this.f10794b.get(flag);
        T t2 = obj != 0 ? obj : null;
        return t2 == null ? flag.a() : t2;
    }

    @Override // Hb0.c
    public final void c(@NotNull f flag, @NotNull Serializable value) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10794b.put(flag, value);
    }
}
