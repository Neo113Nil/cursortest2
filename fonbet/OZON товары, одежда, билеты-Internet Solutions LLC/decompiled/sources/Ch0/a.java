package Ch0;

import Fh0.i;
import Ih0.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fh0.d f5042a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f5043b;

    public a(@NotNull Fh0.d pushStatusDao, @NotNull i pushStatusWithStatsDao) {
        Intrinsics.checkNotNullParameter(pushStatusDao, "pushStatusDao");
        Intrinsics.checkNotNullParameter(pushStatusWithStatsDao, "pushStatusWithStatsDao");
        this.f5042a = pushStatusDao;
        this.f5043b = pushStatusWithStatsDao;
    }

    public final void a(@NotNull Ih0.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5043b.c(event);
    }

    @NotNull
    public final ArrayList b() {
        ArrayList b11 = this.f5043b.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        Iterator it = b11.iterator();
        while (it.hasNext()) {
            arrayList.add(c.g((Gh0.c) it.next()));
        }
        return arrayList;
    }

    public final void c(@NotNull List<Ih0.c> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        List<Ih0.c> list = events;
        ArrayList events2 = new ArrayList(C7714v.z(list, 10));
        for (Ih0.c cVar : list) {
            Integer j11 = cVar.j();
            events2.add(Ih0.c.a(cVar, j11 != null ? Integer.valueOf(j11.intValue() + 1) : null));
        }
        Intrinsics.checkNotNullParameter(events2, "events");
        ArrayList arrayList = new ArrayList(C7714v.z(events2, 10));
        Iterator it = events2.iterator();
        while (it.hasNext()) {
            arrayList.add(c.k((Ih0.c) it.next()));
        }
        this.f5042a.a(arrayList);
    }

    public final void d(@NotNull List<Ih0.c> events) {
        Gh0.b b11;
        Intrinsics.checkNotNullParameter(events, "events");
        List<Ih0.c> list = events;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b11 = c.b((Ih0.c) it.next(), null);
            arrayList.add(b11);
        }
        this.f5043b.a(arrayList);
    }

    public abstract int e(@NotNull List list, String str, @NotNull n nVar, boolean z11);
}
