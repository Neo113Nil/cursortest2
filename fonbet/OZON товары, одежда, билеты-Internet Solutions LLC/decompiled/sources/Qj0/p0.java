package Qj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki0.InterfaceC7684a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.PerfEventEntity;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;
import ru.ozon.tracker.performance.model.TraceEntity;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class p0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Mj0.h> f23695a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ib.a<InterfaceC7684a> f23696b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ib.a<Sj0.a> f23697c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fi0.x f23698d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe.I f23699e;

    public p0(@NotNull Ib.a<Mj0.h> apiLazy, @NotNull Ib.a<InterfaceC7684a> perfEventsDaoLazy, @NotNull Ib.a<Sj0.a> traceMapperLazy, @NotNull fi0.x trackerSettings, @NotNull xe.I ioDispatcher) {
        Intrinsics.checkNotNullParameter(apiLazy, "apiLazy");
        Intrinsics.checkNotNullParameter(perfEventsDaoLazy, "perfEventsDaoLazy");
        Intrinsics.checkNotNullParameter(traceMapperLazy, "traceMapperLazy");
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f23695a = apiLazy;
        this.f23696b = perfEventsDaoLazy;
        this.f23697c = traceMapperLazy;
        this.f23698d = trackerSettings;
        this.f23699e = ioDispatcher;
    }

    @Override // Qj0.l0
    public final Object a(@NotNull List<Long> list, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = this.f23696b.get().a(list, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // Qj0.l0
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object e11 = this.f23696b.get().e(cVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    @Override // Qj0.l0
    public final Object c(@NotNull SendPerfEventsTraceEntity sendPerfEventsTraceEntity, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7 = C10727i.f(this.f23699e, new o0(this, sendPerfEventsTraceEntity, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // Qj0.l0
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7;
        fi0.m C11 = this.f23698d.C();
        return (C11.b() == 0 || (f7 = this.f23696b.get().f(C11.a(), cVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : f7;
    }

    @Override // Qj0.l0
    public final Object e(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        List list2 = list;
        Sj0.a aVar = this.f23697c.get();
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((TraceEntity) it.next()));
        }
        return this.f23696b.get().c(arrayList, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Qj0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n0 n0Var;
        int i11;
        p0 p0Var;
        Iterator it;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i12 = n0Var.f23690g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                n0Var.f23690g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = n0Var.f23688e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = n0Var.f23690g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC7684a interfaceC7684a = this.f23696b.get();
                    n0Var.f23687d = this;
                    n0Var.f23690g = 1;
                    obj = interfaceC7684a.b(list, n0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p0Var = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var = n0Var.f23687d;
                    Sc.s.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                Sj0.a aVar2 = p0Var.f23697c.get();
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(aVar2.b((PerfEventEntity) it.next()));
                }
                return arrayList;
            }
        }
        n0Var = new n0(this, cVar);
        Object obj2 = n0Var.f23688e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = n0Var.f23690g;
        if (i11 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        Sj0.a aVar22 = p0Var.f23697c.get();
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Qj0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m0 m0Var;
        int i11;
        p0 p0Var;
        Iterator it;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i12 = m0Var.f23685g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m0Var.f23685g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = m0Var.f23683e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = m0Var.f23685g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC7684a interfaceC7684a = this.f23696b.get();
                    m0Var.f23682d = this;
                    m0Var.f23685g = 1;
                    obj = interfaceC7684a.getAllEvents(m0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p0Var = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var = m0Var.f23682d;
                    Sc.s.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                Sj0.a aVar2 = p0Var.f23697c.get();
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(aVar2.b((PerfEventEntity) it.next()));
                }
                return arrayList;
            }
        }
        m0Var = new m0(this, cVar);
        Object obj2 = m0Var.f23683e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = m0Var.f23685g;
        if (i11 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        Sj0.a aVar22 = p0Var.f23697c.get();
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
