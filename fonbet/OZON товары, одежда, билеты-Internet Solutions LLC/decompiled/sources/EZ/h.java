package EZ;

import AZ.a;
import EZ.e;
import NZ.i;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import tZ.C9786a;
import wZ.C10460b;
import wZ.C10461c;

/* loaded from: classes3.dex */
public final class h implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8475a f7736a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final L f7737b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f7738c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedList<g> f7739d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7740e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final e<?> f7741a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7742b;

        public a(@NotNull e<?> response, int i11) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f7741a = response;
            this.f7742b = i11;
        }

        public final int a() {
            return this.f7742b;
        }

        @NotNull
        public final e<?> b() {
            return this.f7741a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f7741a, aVar.f7741a) && this.f7742b == aVar.f7742b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7742b) + (this.f7741a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Command(response=" + this.f7741a + ", requestCode=" + this.f7742b + ")";
        }
    }

    public static final class b implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f7744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f7745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7746d;

        public b(h hVar, e eVar, int i11) {
            this.f7744b = hVar;
            this.f7745c = eVar;
            this.f7746d = i11;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            h.this.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            h hVar = this.f7744b;
            g e11 = hVar.e();
            int i11 = AZ.b.f679a;
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            AZ.b.b();
            AZ.a a11 = AZ.b.a();
            AZ.c a12 = AZ.d.a();
            e eVar = this.f7745c;
            if (a11 != a12) {
                cVar.getClass();
                a11.a(new a.C0019a("call navigate in " + e11.getClass().getSimpleName() + " with " + eVar.b()));
            }
            hVar.j(e11, eVar, this.f7746d);
            h.this.getLifecycle().e(this);
        }
    }

    public h(@NotNull C8475a compass) {
        Intrinsics.checkNotNullParameter(compass, "compass");
        this.f7736a = compass;
        L l11 = new L(this);
        this.f7737b = l11;
        this.f7738c = new ArrayList();
        this.f7739d = new LinkedList<>();
        l11.h(AbstractC5434v.a.ON_CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(g gVar, e<?> eVar, int i11) {
        C10460b a11;
        String f02;
        Uri parse;
        if (!eVar.d() && (eVar.b() instanceof C9786a)) {
            ComponentCallbacksC5392m w02 = gVar.getFragmentManager().w0();
            if (((w02 == null || (a11 = C10461c.a(w02)) == null || (f02 = a11.f0()) == null || (parse = Uri.parse(f02)) == null) ? null : parse.getQueryParameter("returnBackToMiniApp")) != null) {
                CZ.a destination = CZ.a.f4569b;
                Intrinsics.checkNotNullParameter(destination, "destination");
                e.a aVar = new e.a(destination, eVar);
                aVar.c(BZ.c.f3320a);
                eVar = aVar.a();
            }
        }
        if (gVar.getActivity().isFinishing()) {
            g(gVar, eVar, i11);
        } else {
            gVar.navigate(eVar, i11);
        }
    }

    public final void b(@NotNull g navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedList<g> linkedList = this.f7739d;
        if (linkedList.contains(navigator)) {
            return;
        }
        linkedList.add(navigator);
        int i11 = AZ.b.f679a;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        AZ.b.b();
        AZ.a a11 = AZ.b.a();
        if (a11 != AZ.d.a()) {
            cVar.getClass();
            a11.a(new a.C0019a("add navigator ".concat(navigator.getClass().getSimpleName())));
        }
        navigator.attachToHolder$compass_release(this);
        if (this.f7740e) {
            i();
        }
    }

    public final g c(@NotNull i.a predicate) {
        g gVar;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedList<g> linkedList = this.f7739d;
        ListIterator<g> listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                gVar = null;
                break;
            }
            gVar = listIterator.previous();
            if (((Boolean) predicate.invoke(gVar)).booleanValue()) {
                break;
            }
        }
        return gVar;
    }

    @NotNull
    public final C8475a d() {
        return this.f7736a;
    }

    @NotNull
    public final g e() {
        return (g) C7714v.X(this.f7739d);
    }

    public final void f(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        L l11 = this.f7737b;
        if (!l11.b().a(AbstractC5434v.b.STARTED)) {
            l11.a(new b(this, response, i11));
            return;
        }
        g e11 = e();
        int i12 = AZ.b.f679a;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        AZ.b.b();
        AZ.a a11 = AZ.b.a();
        if (a11 != AZ.d.a()) {
            cVar.getClass();
            a11.a(new a.C0019a("call navigate in " + e11.getClass().getSimpleName() + " with " + response.b()));
        }
        j(e11, response, i11);
    }

    public final void g(@NotNull g navigator, @NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        LinkedList<g> linkedList = this.f7739d;
        int indexOf = linkedList.indexOf(navigator);
        if (indexOf < 0) {
            g gVar = (g) C7714v.Z(linkedList);
            if (gVar == null) {
                throw new IllegalArgumentException("this navigator doesn't attach to holder: " + navigator);
            }
            int i12 = AZ.b.f679a;
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            AZ.b.b();
            AZ.a a11 = AZ.b.a();
            if (a11 != AZ.d.a()) {
                cVar.getClass();
                a11.a(new a.C0019a("call next in last " + gVar.getClass().getSimpleName() + " with " + response.b()));
            }
            j(gVar, response, i11);
            return;
        }
        if (indexOf == 0) {
            int i13 = AZ.b.f679a;
            ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
            AZ.b.b();
            AZ.a a12 = AZ.b.a();
            if (a12 != AZ.d.a()) {
                cVar2.getClass();
                a12.a(new a.C0019a("call next 0 in " + navigator.getClass().getSimpleName() + " with " + response.b()));
            }
            this.f7738c.add(new a(response, i11));
            return;
        }
        g gVar2 = linkedList.get(indexOf - 1);
        Intrinsics.checkNotNullExpressionValue(gVar2, "get(...)");
        g gVar3 = gVar2;
        int i14 = AZ.b.f679a;
        ru.ozon.android.ozonLogger.core.c cVar3 = ru.ozon.android.ozonLogger.core.c.DEBUG;
        AZ.b.b();
        AZ.a a13 = AZ.b.a();
        if (a13 != AZ.d.a()) {
            cVar3.getClass();
            a13.a(new a.C0019a("call next for " + gVar3.getClass().getSimpleName() + " with " + response.b()));
        }
        j(gVar3, response, i11);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f7737b;
    }

    public final void h(@NotNull g navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedList<g> linkedList = this.f7739d;
        if (linkedList.remove(navigator)) {
            int i11 = AZ.b.f679a;
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            AZ.b.b();
            AZ.a a11 = AZ.b.a();
            if (a11 != AZ.d.a()) {
                cVar.getClass();
                a11.a(new a.C0019a("remove navigator ".concat(navigator.getClass().getSimpleName())));
            }
        }
        if (linkedList.isEmpty()) {
            this.f7740e = false;
            this.f7737b.h(AbstractC5434v.a.ON_STOP);
        }
    }

    public final void i() {
        if (!this.f7739d.isEmpty()) {
            ArrayList arrayList = this.f7738c;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                int i11 = AZ.b.f679a;
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                AZ.b.b();
                AZ.a a11 = AZ.b.a();
                if (a11 != AZ.d.a()) {
                    cVar.getClass();
                    a11.a(new a.C0019a("call drain commands"));
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    f(aVar.b(), aVar.a());
                }
            }
            this.f7737b.h(AbstractC5434v.a.ON_START);
        }
        this.f7740e = true;
    }
}
