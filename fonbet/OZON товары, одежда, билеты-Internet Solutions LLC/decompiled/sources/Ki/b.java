package Ki;

import B90.A;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6762h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A f15980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String[]> f15981b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f15982c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC6592d<String[]> f15983a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final A f15984b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C0306b f15985c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private c f15986d;

        public a(@NotNull GalleryActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f15986d = new c(0);
            A a11 = new A(activity);
            this.f15984b = a11;
            C0306b c0306b = new C0306b(a11);
            this.f15985c = c0306b;
            this.f15983a = activity.registerForActivityResult(new C6762h(), c0306b);
        }

        @NotNull
        public final b a() {
            c cVar = this.f15986d;
            C0306b c0306b = this.f15985c;
            c0306b.getClass();
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            c0306b.f15988b = cVar;
            b bVar = new b(this.f15984b, this.f15983a, this.f15986d);
            this.f15986d = new c(0);
            return bVar;
        }

        @NotNull
        public final void b(@NotNull Function0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f15986d.e(action);
        }

        @NotNull
        public final void c(@NotNull Function0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f15986d.f(action);
        }

        @NotNull
        public final void d(@NotNull String... permissions) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f15986d.g(C7705l.j0(permissions));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final void e(boolean z11, @NotNull Function0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            c cVar = this.f15986d;
            if (!z11) {
                action = null;
            }
            cVar.h(action);
        }
    }

    /* renamed from: Ki.b$b, reason: collision with other inner class name */
    private static final class C0306b implements InterfaceC6590b<Map<String, ? extends Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final A f15987a;

        /* renamed from: b, reason: collision with root package name */
        public c f15988b;

        public C0306b(@NotNull A activityProvider) {
            Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
            this.f15987a = activityProvider;
        }

        @NotNull
        public final c a() {
            c cVar = this.f15988b;
            if (cVar != null) {
                return cVar;
            }
            Intrinsics.n("state");
            throw null;
        }

        @Override // g.InterfaceC6590b
        public final void onActivityResult(Map<String, ? extends Boolean> map) {
            Map<String, ? extends Boolean> grantedMap = map;
            Intrinsics.checkNotNullParameter(grantedMap, "grantedMap");
            GalleryActivity galleryActivity = (GalleryActivity) this.f15987a.f3097a;
            Collection<? extends Boolean> values = grantedMap.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        if (Gf.c.b(galleryActivity, a().d(), a().b())) {
                            Function0<Unit> b11 = a().b();
                            if (b11 != null) {
                                b11.invoke();
                                return;
                            }
                            return;
                        }
                        Function0<Unit> a11 = a().a();
                        if (a11 != null) {
                            a11.invoke();
                            return;
                        }
                        return;
                    }
                }
            }
            a().c().invoke();
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private Set<String> f15989a = null;

        /* renamed from: b, reason: collision with root package name */
        private Function0<Unit> f15990b = null;

        /* renamed from: c, reason: collision with root package name */
        private Function0<Unit> f15991c = null;

        /* renamed from: d, reason: collision with root package name */
        private Function0<Unit> f15992d = null;

        public c(int i11) {
        }

        public final Function0<Unit> a() {
            return this.f15992d;
        }

        public final Function0<Unit> b() {
            return this.f15991c;
        }

        @NotNull
        public final Function0<Unit> c() {
            Function0<Unit> function0 = this.f15990b;
            if (function0 != null) {
                return function0;
            }
            throw new IllegalStateException("`onPermissionGranted` callback should be set ");
        }

        @NotNull
        public final Set<String> d() {
            Set<String> set = this.f15989a;
            if (set != null) {
                return set;
            }
            throw new IllegalStateException("`permissions` should be set ");
        }

        public final void e(Function0<Unit> function0) {
            this.f15992d = function0;
        }

        public final void f(Function0<Unit> function0) {
            this.f15990b = function0;
        }

        public final void g(Set<String> set) {
            this.f15989a = set;
        }

        public final void h(Function0<Unit> function0) {
            this.f15991c = function0;
        }
    }

    public b(A a11, AbstractC6592d abstractC6592d, c cVar) {
        this.f15980a = a11;
        this.f15981b = abstractC6592d;
        this.f15982c = cVar;
    }

    public final void a() {
        GalleryActivity galleryActivity = (GalleryActivity) this.f15980a.f3097a;
        c cVar = this.f15982c;
        Set<String> d11 = cVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d11) {
            if (androidx.core.content.a.checkSelfPermission(galleryActivity, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        Set Y02 = C7714v.Y0(arrayList);
        if (Y02.isEmpty()) {
            cVar.c().invoke();
            return;
        }
        if (!Gf.c.b(galleryActivity, Y02, cVar.b())) {
            this.f15981b.a(Y02.toArray(new String[0]));
        } else {
            Function0<Unit> b11 = cVar.b();
            if (b11 != null) {
                b11.invoke();
            }
        }
    }
}
