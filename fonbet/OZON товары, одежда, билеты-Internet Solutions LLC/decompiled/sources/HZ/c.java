package HZ;

import GZ.j;
import androidx.collection.C5155y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashSet<IZ.a> f10768a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5155y<String, Set<IZ.a>> f10769b;

    public c(@NotNull Set handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f10768a = new HashSet<>(handlers);
        this.f10769b = new C5155y<>(50);
    }

    @Override // HZ.a
    public final void a(@NotNull Set<? extends IZ.a> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f10768a.addAll(handlers);
    }

    @Override // HZ.a
    public final IZ.a b(@NotNull j route) {
        IZ.a aVar;
        IZ.a aVar2;
        Object obj;
        Intrinsics.checkNotNullParameter(route, "route");
        String authority = route.b().getAuthority();
        IZ.a aVar3 = null;
        if (authority == null) {
            return null;
        }
        synchronized (this.f10769b) {
            try {
                C5155y<String, Set<IZ.a>> c5155y = this.f10769b;
                Set<IZ.a> set = c5155y.get(authority);
                if (set == null) {
                    set = new HashSet<>();
                    c5155y.put(authority, set);
                }
                Set<IZ.a> set2 = set;
                Set<IZ.a> set3 = !set2.isEmpty() ? set2 : null;
                if (set3 != null) {
                    Iterator<T> it = set3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((IZ.a) obj).canHandle(route)) {
                            break;
                        }
                    }
                    aVar2 = (IZ.a) obj;
                    if (aVar2 == null) {
                    }
                    aVar3 = aVar2;
                }
                Iterator<IZ.a> it2 = this.f10768a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it2.next();
                    if (aVar.canHandle(route)) {
                        break;
                    }
                }
                aVar2 = aVar;
                if (aVar2 != null) {
                    set2.add(aVar2);
                    aVar3 = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar3;
    }

    @Override // HZ.a
    public final boolean c(@NotNull j route, @NotNull IZ.a handler) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(handler, "handler");
        HashSet<IZ.a> hashSet = this.f10768a;
        if (hashSet != null && hashSet.isEmpty()) {
            return false;
        }
        Iterator<IZ.a> it = hashSet.iterator();
        while (it.hasNext()) {
            IZ.a next = it.next();
            if (next != handler && next.canHandle(route)) {
                return true;
            }
        }
        return false;
    }
}
