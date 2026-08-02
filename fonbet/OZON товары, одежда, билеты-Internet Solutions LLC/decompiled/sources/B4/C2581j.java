package B4;

import Sc.InterfaceC4008j;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import f3.C6412d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B4.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2581j implements androidx.lifecycle.J, B0, InterfaceC5431s, M4.e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2635a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private H f2636b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f2637c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC5434v.b f2638d;

    /* renamed from: e, reason: collision with root package name */
    private final X f2639e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f2640f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f2641g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.L f2642h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final M4.d f2643i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2644j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2645k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2646l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private AbstractC5434v.b f2647m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final n0 f2648n;

    /* renamed from: B4.j$a */
    public static final class a {
        public static C2581j a(Context context, H destination, Bundle bundle, AbstractC5434v.b hostLifecycleState, X x11) {
            String id2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(id2, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id2, "id");
            return new C2581j(context, destination, bundle, hostLifecycleState, x11, id2, null, 0);
        }
    }

    /* renamed from: B4.j$b */
    private static final class b extends AbstractC5405a {
        @Override // androidx.lifecycle.AbstractC5405a
        @NotNull
        protected final <T extends w0> T b(@NotNull String key, @NotNull Class<T> modelClass, @NotNull C5418g0 handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new c(handle);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LB4/j$c;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/g0;", "handle", "<init>", "(Landroidx/lifecycle/g0;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B4.j$c */
    private static final class c extends w0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C5418g0 f2649a;

        public c(@NotNull C5418g0 handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.f2649a = handle;
        }

        @NotNull
        /* renamed from: d0, reason: from getter */
        public final C5418g0 getF2649a() {
            return this.f2649a;
        }
    }

    /* renamed from: B4.j$d */
    static final class d extends AbstractC7737t implements Function0<n0> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n0 invoke() {
            C2581j c2581j = C2581j.this;
            Context context = c2581j.f2635a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            return new n0(applicationContext instanceof Application ? (Application) applicationContext : null, c2581j, c2581j.c());
        }
    }

    /* renamed from: B4.j$e */
    static final class e extends AbstractC7737t implements Function0<C5418g0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C5418g0 invoke() {
            C2581j owner = C2581j.this;
            if (!owner.f2644j) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (owner.getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
            Intrinsics.checkNotNullParameter(owner, "owner");
            return ((c) new z0(owner, new b(owner, null)).a(c.class)).getF2649a();
        }
    }

    public /* synthetic */ C2581j(Context context, H h11, Bundle bundle, AbstractC5434v.b bVar, X x11, String str, Bundle bundle2, int i11) {
        this(context, h11, bundle, bVar, x11, str, bundle2);
    }

    public final Bundle c() {
        Bundle bundle = this.f2637c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @NotNull
    public final H d() {
        return this.f2636b;
    }

    @NotNull
    public final String e() {
        return this.f2640f;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof C2581j)) {
            C2581j c2581j = (C2581j) obj;
            if (Intrinsics.d(this.f2640f, c2581j.f2640f) && Intrinsics.d(this.f2636b, c2581j.f2636b) && Intrinsics.d(this.f2642h, c2581j.f2642h) && Intrinsics.d(this.f2643i.a(), c2581j.f2643i.a())) {
                Bundle bundle = this.f2637c;
                Bundle bundle2 = c2581j.f2637c;
                if (Intrinsics.d(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.d(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final AbstractC5434v.b f() {
        return this.f2647m;
    }

    @NotNull
    public final C5418g0 g() {
        return (C5418g0) this.f2646l.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NotNull
    public final AbstractC6409a getDefaultViewModelCreationExtras() {
        C6412d c6412d = new C6412d(0);
        Context context = this.f2635a;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c6412d.c(z0.a.f43418c, application);
        }
        c6412d.c(j0.f43329a, this);
        c6412d.c(j0.f43330b, this);
        Bundle c11 = c();
        if (c11 != null) {
            c6412d.c(j0.f43331c, c11);
        }
        return c6412d;
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NotNull
    public final z0.b getDefaultViewModelProviderFactory() {
        return this.f2648n;
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f2642h;
    }

    @Override // M4.e
    @NotNull
    public final M4.c getSavedStateRegistry() {
        return this.f2643i.a();
    }

    @Override // androidx.lifecycle.B0
    @NotNull
    public final A0 getViewModelStore() {
        if (!this.f2644j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f2642h.b() == AbstractC5434v.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        X x11 = this.f2639e;
        if (x11 != null) {
            return x11.I(this.f2640f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void h(@NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f2638d = event.a();
        l();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f2636b.hashCode() + (this.f2640f.hashCode() * 31);
        Bundle bundle = this.f2637c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i11 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f2643i.a().hashCode() + ((this.f2642h.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f2643i.d(outBundle);
    }

    public final void j(@NotNull H h11) {
        Intrinsics.checkNotNullParameter(h11, "<set-?>");
        this.f2636b = h11;
    }

    public final void k(@NotNull AbstractC5434v.b maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f2647m = maxState;
        l();
    }

    public final void l() {
        if (!this.f2644j) {
            M4.d dVar = this.f2643i;
            dVar.b();
            this.f2644j = true;
            if (this.f2639e != null) {
                j0.b(this);
            }
            dVar.c(this.f2641g);
        }
        int ordinal = this.f2638d.ordinal();
        int ordinal2 = this.f2647m.ordinal();
        androidx.lifecycle.L l11 = this.f2642h;
        if (ordinal < ordinal2) {
            l11.j(this.f2638d);
        } else {
            l11.j(this.f2647m);
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2581j.class.getSimpleName());
        sb2.append("(" + this.f2640f + ')');
        sb2.append(" destination=");
        sb2.append(this.f2636b);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }

    private C2581j(Context context, H h11, Bundle bundle, AbstractC5434v.b bVar, X x11, String str, Bundle bundle2) {
        this.f2635a = context;
        this.f2636b = h11;
        this.f2637c = bundle;
        this.f2638d = bVar;
        this.f2639e = x11;
        this.f2640f = str;
        this.f2641g = bundle2;
        this.f2642h = new androidx.lifecycle.L(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f2643i = new M4.d(this);
        InterfaceC4008j b11 = Sc.k.b(new d());
        this.f2645k = b11;
        this.f2646l = Sc.k.b(new e());
        this.f2647m = AbstractC5434v.b.INITIALIZED;
        this.f2648n = (n0) b11.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2581j(@NotNull C2581j entry, Bundle bundle) {
        this(entry.f2635a, entry.f2636b, bundle, entry.f2638d, entry.f2639e, entry.f2640f, entry.f2641g);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2638d = entry.f2638d;
        k(entry.f2647m);
    }
}
