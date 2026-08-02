package B4;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B4.C2581j;
import B4.C2596z;
import B4.H;
import B4.S;
import Sc.InterfaceC4008j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.z0;
import g.C6594f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C7445a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.G;
import kotlin.sequences.Sequence;
import l80.C7895b;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* renamed from: B4.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C2584m {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2657A;

    /* renamed from: B, reason: collision with root package name */
    private int f2658B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final ArrayList f2659C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2660D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final C0 f2661E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<C2581j> f2662F;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f2663a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f2664b;

    /* renamed from: c, reason: collision with root package name */
    private L f2665c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f2666d;

    /* renamed from: e, reason: collision with root package name */
    private Parcelable[] f2667e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2668f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C7704k<C2581j> f2669g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<List<C2581j>> f2670h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final M0<List<C2581j>> f2671i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<List<C2581j>> f2672j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final M0<List<C2581j>> f2673k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2674l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2675m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2676n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2677o;

    /* renamed from: p, reason: collision with root package name */
    private androidx.lifecycle.J f2678p;

    /* renamed from: q, reason: collision with root package name */
    private C2596z f2679q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<b> f2680r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private AbstractC5434v.b f2681s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C2583l f2682t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final f f2683u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2684v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private d0 f2685w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2686x;

    /* renamed from: y, reason: collision with root package name */
    private AbstractC7737t f2687y;

    /* renamed from: z, reason: collision with root package name */
    private Function1<? super C2581j, Unit> f2688z;

    /* renamed from: B4.m$a */
    private final class a extends e0 {

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final b0<? extends H> f2689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2584m f2690h;

        /* renamed from: B4.m$a$a, reason: collision with other inner class name */
        static final class C0064a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2581j f2692c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f2693d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0064a(C2581j c2581j, boolean z11) {
                super(0);
                this.f2692c = c2581j;
                this.f2693d = z11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                a.super.h(this.f2692c, this.f2693d);
                return Unit.f71690a;
            }
        }

        public a(@NotNull C2584m c2584m, b0<? extends H> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f2690h = c2584m;
            this.f2689g = navigator;
        }

        @Override // B4.e0
        @NotNull
        public final C2581j a(@NotNull H destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            C2584m c2584m = this.f2690h;
            return C2581j.a.a(c2584m.u(), destination, bundle, c2584m.B(), c2584m.f2679q);
        }

        @Override // B4.e0
        public final void e(@NotNull C2581j entry) {
            C2596z c2596z;
            Intrinsics.checkNotNullParameter(entry, "entry");
            C2584m c2584m = this.f2690h;
            boolean d11 = Intrinsics.d(c2584m.f2657A.get(entry), Boolean.TRUE);
            super.e(entry);
            c2584m.f2657A.remove(entry);
            if (c2584m.f2669g.contains(entry)) {
                if (d()) {
                    return;
                }
                c2584m.b0();
                c2584m.f2670h.tryEmit(C7714v.W0(c2584m.f2669g));
                c2584m.f2672j.tryEmit(c2584m.T());
                return;
            }
            c2584m.a0(entry);
            if (entry.getLifecycle().b().a(AbstractC5434v.b.CREATED)) {
                entry.k(AbstractC5434v.b.DESTROYED);
            }
            C7704k c7704k = c2584m.f2669g;
            if (c7704k == null || !c7704k.isEmpty()) {
                Iterator<E> it = c7704k.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((C2581j) it.next()).e(), entry.e())) {
                        break;
                    }
                }
            }
            if (!d11 && (c2596z = c2584m.f2679q) != null) {
                c2596z.e0(entry.e());
            }
            c2584m.b0();
            c2584m.f2672j.tryEmit(c2584m.T());
        }

        @Override // B4.e0
        public final void h(@NotNull C2581j popUpTo, boolean z11) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            C2584m c2584m = this.f2690h;
            b0 c11 = c2584m.f2685w.c(popUpTo.d().n());
            c2584m.f2657A.put(popUpTo, Boolean.valueOf(z11));
            if (!c11.equals(this.f2689g)) {
                Object obj = c2584m.f2686x.get(c11);
                Intrinsics.f(obj);
                ((a) obj).h(popUpTo, z11);
            } else {
                Function1 function1 = c2584m.f2688z;
                if (function1 == null) {
                    c2584m.P(popUpTo, new C0064a(popUpTo, z11));
                } else {
                    function1.invoke(popUpTo);
                    super.h(popUpTo, z11);
                }
            }
        }

        @Override // B4.e0
        public final void i(@NotNull C2581j popUpTo, boolean z11) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.i(popUpTo, z11);
        }

        @Override // B4.e0
        public final void j(@NotNull C2581j entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.j(entry);
            if (!this.f2690h.f2669g.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.k(AbstractC5434v.b.STARTED);
        }

        @Override // B4.e0
        public final void k(@NotNull C2581j backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            C2584m c2584m = this.f2690h;
            b0 c11 = c2584m.f2685w.c(backStackEntry.d().n());
            if (!c11.equals(this.f2689g)) {
                Object obj = c2584m.f2686x.get(c11);
                if (obj != null) {
                    ((a) obj).k(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.d().n() + " should already be created").toString());
            }
            Function1 function1 = c2584m.f2687y;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                super.k(backStackEntry);
            } else {
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.d() + " outside of the call to navigate(). ");
            }
        }

        public final void o(@NotNull C2581j backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.k(backStackEntry);
        }
    }

    /* renamed from: B4.m$b */
    public interface b {
        void a(@NotNull C2584m c2584m, @NotNull H h11, Bundle bundle);
    }

    /* renamed from: B4.m$c */
    static final class c extends AbstractC7737t implements Function1<Context, Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2694b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    /* renamed from: B4.m$d */
    static final class d extends AbstractC7737t implements Function1<T, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f2695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2584m f2696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H h11, C2584m c2584m) {
            super(1);
            this.f2695b = h11;
            this.f2696c = c2584m;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(T t2) {
            T navOptions = t2;
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.a(C2591u.f2714b);
            H h11 = this.f2695b;
            if (h11 instanceof L) {
                int i11 = H.f2506k;
                Iterator it = H.a.b(h11).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C2584m c2584m = this.f2696c;
                    if (!hasNext) {
                        int i12 = L.f2535p;
                        L A11 = c2584m.A();
                        Intrinsics.checkNotNullParameter(A11, "<this>");
                        Intrinsics.checkNotNullParameter(A11, "<this>");
                        navOptions.c(((H) kotlin.sequences.l.u(kotlin.sequences.l.q(A11, K.f2534b))).m(), C2592v.f2715b);
                        break;
                    }
                    H h12 = (H) it.next();
                    H y11 = c2584m.y();
                    if (Intrinsics.d(h12, y11 != null ? y11.o() : null)) {
                        break;
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B4.m$e */
    static final class e extends AbstractC7737t implements Function0<Q> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Q invoke() {
            C2584m c2584m = C2584m.this;
            c2584m.getClass();
            return new Q(c2584m.u(), c2584m.f2685w);
        }
    }

    /* renamed from: B4.m$f */
    public static final class f extends androidx.activity.C {
        f() {
            super(false);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            C2584m.this.N();
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [B4.l] */
    public C2584m(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2663a = context;
        Iterator it = kotlin.sequences.l.q(context, c.f2694b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2664b = (Activity) obj;
        this.f2669g = new C7704k<>();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        x0<List<C2581j>> a11 = O0.a(k11);
        this.f2670h = a11;
        this.f2671i = C2399j.b(a11);
        x0<List<C2581j>> a12 = O0.a(k11);
        this.f2672j = a12;
        this.f2673k = C2399j.b(a12);
        this.f2674l = new LinkedHashMap();
        this.f2675m = new LinkedHashMap();
        this.f2676n = new LinkedHashMap();
        this.f2677o = new LinkedHashMap();
        this.f2680r = new CopyOnWriteArrayList<>();
        this.f2681s = AbstractC5434v.b.INITIALIZED;
        this.f2682t = new androidx.lifecycle.G() { // from class: B4.l
            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                C2584m.a(C2584m.this, j11, aVar);
            }
        };
        this.f2683u = new f();
        this.f2684v = true;
        d0 d0Var = new d0();
        this.f2685w = d0Var;
        this.f2686x = new LinkedHashMap();
        this.f2657A = new LinkedHashMap();
        d0Var.b(new O(d0Var));
        d0Var.b(new C2572a(this.f2663a));
        this.f2659C = new ArrayList();
        this.f2660D = Sc.k.b(new e());
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        this.f2661E = b11;
        this.f2662F = C2399j.a(b11);
    }

    private final L E(C7704k<C2581j> c7704k) {
        H h11;
        C2581j m11 = c7704k.m();
        if (m11 == null || (h11 = m11.d()) == null) {
            h11 = this.f2665c;
            Intrinsics.f(h11);
        }
        if (h11 instanceof L) {
            return (L) h11;
        }
        L o11 = h11.o();
        Intrinsics.f(o11);
        return o11;
    }

    private final void H(C2581j c2581j, C2581j c2581j2) {
        this.f2674l.put(c2581j, c2581j2);
        LinkedHashMap linkedHashMap = this.f2675m;
        if (linkedHashMap.get(c2581j2) == null) {
            linkedHashMap.put(c2581j2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c2581j2);
        Intrinsics.f(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r14.equals(r5) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
    
        r5 = new kotlin.collections.C7704k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        if (kotlin.collections.C7714v.P(r12) < r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        r11 = (B4.C2581j) kotlin.collections.C7714v.w0(r12);
        a0(r11);
        r5.addFirst(new B4.C2581j(r11, r11.d().e(r18)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r6 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        if (r6.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        r11 = (B4.C2581j) r6.next();
        r13 = r11.d().o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        if (r13 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015d, code lost:
    
        H(r11, t(r13.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        r12.addLast(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0174, code lost:
    
        if (r5.hasNext() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        r6 = (B4.C2581j) r5.next();
        r10.c(r6.d().n()).g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0119, code lost:
    
        if (r17.m() == r5.m()) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void J(H h11, Bundle bundle, S s11) {
        boolean z11;
        int i11;
        LinkedHashMap linkedHashMap = this.f2686x;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).m(true);
        }
        kotlin.jvm.internal.I i12 = new kotlin.jvm.internal.I();
        boolean Q11 = (s11 == null || s11.e() == -1) ? false : Q(s11.e(), s11.f(), s11.h());
        Bundle e11 = h11.e(bundle);
        if (s11 != null && s11.i() && this.f2676n.containsKey(Integer.valueOf(h11.m()))) {
            i12.f71783a = V(h11.m(), e11, s11);
            z11 = false;
        } else {
            d0 d0Var = this.f2685w;
            if (s11 != null && s11.g()) {
                C2581j w11 = w();
                C7704k<C2581j> c7704k = this.f2669g;
                ListIterator<C2581j> listIterator = c7704k.listIterator(c7704k.getF26995b());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i11 = -1;
                        break;
                    } else if (listIterator.previous().d() == h11) {
                        i11 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i11 != -1) {
                    if (h11 instanceof L) {
                        int i13 = L.f2535p;
                        L l11 = (L) h11;
                        Intrinsics.checkNotNullParameter(l11, "<this>");
                        List C11 = kotlin.sequences.l.C(kotlin.sequences.l.v(kotlin.sequences.l.q(l11, K.f2534b), C2593w.f2716b));
                        if (c7704k.getF26995b() - i11 == C11.size()) {
                            List<C2581j> subList = c7704k.subList(i11, c7704k.getF26995b());
                            ArrayList arrayList = new ArrayList(C7714v.z(subList, 10));
                            Iterator<T> it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((C2581j) it2.next()).d().m()));
                            }
                        }
                    } else if (w11 != null) {
                        H d11 = w11.d();
                        if (d11 != null) {
                        }
                    }
                    if (!z11) {
                        C2581j a11 = C2581j.a.a(this.f2663a, h11, e11, B(), this.f2679q);
                        b0 c11 = d0Var.c(h11.n());
                        List a02 = C7714v.a0(a11);
                        this.f2687y = new C2594x(i12, this, h11, e11);
                        c11.e(a02, s11);
                        this.f2687y = null;
                    }
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        c0();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((a) it3.next()).m(false);
        }
        if (Q11 || i12.f71783a || z11) {
            q();
        } else {
            b0();
        }
    }

    public static void L(C2584m c2584m, String route, S s11, int i11) {
        if ((i11 & 2) != 0) {
            s11 = null;
        }
        c2584m.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        if (c2584m.f2665c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + c2584m + '.').toString());
        }
        L E11 = c2584m.E(c2584m.f2669g);
        H.b I11 = E11.I(route, true, E11);
        if (I11 == null) {
            StringBuilder b11 = C6594f.b("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            b11.append(c2584m.f2665c);
            throw new IllegalArgumentException(b11.toString());
        }
        H b12 = I11.b();
        Bundle e11 = b12.e(I11.c());
        if (e11 == null) {
            e11 = new Bundle();
        }
        H b13 = I11.b();
        Intent intent = new Intent();
        int i12 = H.f2506k;
        String q11 = b12.q();
        Uri parse = Uri.parse(q11 != null ? "android-app://androidx.navigation/".concat(q11) : "");
        Intrinsics.e(parse, "Uri.parse(this)");
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        e11.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        c2584m.J(b13, e11, s11);
    }

    private final boolean Q(int i11, boolean z11, boolean z12) {
        H h11;
        C2584m c2584m;
        boolean z13;
        C7704k<C2581j> c7704k = this.f2669g;
        if (c7704k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C7714v.z0(c7704k).iterator();
        while (true) {
            if (!it.hasNext()) {
                h11 = null;
                break;
            }
            h11 = ((C2581j) it.next()).d();
            b0 c11 = this.f2685w.c(h11.n());
            if (z11 || h11.m() != i11) {
                arrayList.add(c11);
            }
            if (h11.m() == i11) {
                break;
            }
        }
        if (h11 == null) {
            int i12 = H.f2506k;
            Log.i("NavController", "Ignoring popBackStack to destination " + H.a.a(i11, this.f2663a) + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.I i13 = new kotlin.jvm.internal.I();
        C7704k c7704k2 = new C7704k();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                c2584m = this;
                z13 = z12;
                break;
            }
            b0 b0Var = (b0) it2.next();
            kotlin.jvm.internal.I i14 = new kotlin.jvm.internal.I();
            C2581j last = c7704k.last();
            c2584m = this;
            z13 = z12;
            c2584m.f2688z = new C2586o(i14, i13, c2584m, z13, c7704k2);
            b0Var.j(last, z13);
            c2584m.f2688z = null;
            if (!i14.f71783a) {
                break;
            }
            z12 = z13;
        }
        if (z13) {
            LinkedHashMap linkedHashMap = c2584m.f2676n;
            if (!z11) {
                Sequence q11 = kotlin.sequences.l.q(h11, C2587p.f2705b);
                C2588q predicate = new C2588q(this);
                Intrinsics.checkNotNullParameter(q11, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                Iterator it3 = new kotlin.sequences.G(q11, predicate).iterator();
                while (true) {
                    G.a aVar = (G.a) it3;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Integer valueOf = Integer.valueOf(((H) aVar.next()).m());
                    C2582k c2582k = (C2582k) c7704k2.i();
                    linkedHashMap.put(valueOf, c2582k != null ? c2582k.getId() : null);
                }
            }
            if (!c7704k2.isEmpty()) {
                C2582k c2582k2 = (C2582k) c7704k2.first();
                Sequence q12 = kotlin.sequences.l.q(r(c2582k2.a()), r.f2707b);
                C2589s predicate2 = new C2589s(this);
                Intrinsics.checkNotNullParameter(q12, "<this>");
                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                Iterator it4 = new kotlin.sequences.G(q12, predicate2).iterator();
                while (true) {
                    G.a aVar2 = (G.a) it4;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((H) aVar2.next()).m()), c2582k2.getId());
                }
                if (linkedHashMap.values().contains(c2582k2.getId())) {
                    c2584m.f2677o.put(c2582k2.getId(), c7704k2);
                }
            }
        }
        c0();
        return i13.f71783a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(C2581j c2581j, boolean z11, C7704k<C2582k> c7704k) {
        C2596z c2596z;
        M0<Set<C2581j>> c11;
        Set<C2581j> value;
        C7704k<C2581j> c7704k2 = this.f2669g;
        C2581j last = c7704k2.last();
        if (!Intrinsics.d(last, c2581j)) {
            throw new IllegalStateException(("Attempted to pop " + c2581j.d() + ", which is not the top of the back stack (" + last.d() + ')').toString());
        }
        C7714v.w0(c7704k2);
        a aVar = (a) this.f2686x.get(this.f2685w.c(last.d().n()));
        boolean z12 = true;
        if ((aVar == null || (c11 = aVar.c()) == null || (value = c11.getValue()) == null || !value.contains(last)) && !this.f2675m.containsKey(last)) {
            z12 = false;
        }
        AbstractC5434v.b b11 = last.getLifecycle().b();
        AbstractC5434v.b bVar = AbstractC5434v.b.CREATED;
        if (b11.a(bVar)) {
            if (z11) {
                last.k(bVar);
                c7704k.addFirst(new C2582k(last));
            }
            if (z12) {
                last.k(bVar);
            } else {
                last.k(AbstractC5434v.b.DESTROYED);
                a0(last);
            }
        }
        if (z11 || z12 || (c2596z = this.f2679q) == null) {
            return;
        }
        c2596z.e0(last.e());
    }

    static /* synthetic */ void S(C2584m c2584m, C2581j c2581j) {
        c2584m.R(c2581j, false, new C7704k<>());
    }

    private final boolean V(int i11, Bundle bundle, S s11) {
        H A11;
        C2581j c2581j;
        H d11;
        LinkedHashMap linkedHashMap = this.f2676n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i11));
        kotlin.collections.C.g(linkedHashMap.values(), new C2595y(str));
        C7704k c7704k = (C7704k) kotlin.jvm.internal.U.d(this.f2677o).remove(str);
        ArrayList arrayList = new ArrayList();
        C2581j m11 = this.f2669g.m();
        if (m11 == null || (A11 = m11.d()) == null) {
            A11 = A();
        }
        if (c7704k != null) {
            Iterator<E> it = c7704k.iterator();
            while (it.hasNext()) {
                C2582k c2582k = (C2582k) it.next();
                H s12 = s(c2582k.a(), A11, true);
                Context context = this.f2663a;
                if (s12 == null) {
                    int i12 = H.f2506k;
                    throw new IllegalStateException(("Restore State failed: destination " + H.a.a(c2582k.a(), context) + " cannot be found from the current destination " + A11).toString());
                }
                arrayList.add(c2582k.b(context, s12, B(), this.f2679q));
                A11 = s12;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((C2581j) next).d() instanceof L)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            C2581j c2581j2 = (C2581j) it3.next();
            List list = (List) C7714v.Z(arrayList2);
            if (list != null && (c2581j = (C2581j) C7714v.X(list)) != null && (d11 = c2581j.d()) != null) {
                str2 = d11.n();
            }
            if (Intrinsics.d(str2, c2581j2.d().n())) {
                list.add(c2581j2);
            } else {
                arrayList2.add(C7714v.m0(c2581j2));
            }
        }
        kotlin.jvm.internal.I i13 = new kotlin.jvm.internal.I();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            b0 c11 = this.f2685w.c(((C2581j) C7714v.K(list2)).d().n());
            Bundle bundle2 = bundle;
            this.f2687y = new C2590t(i13, arrayList, new kotlin.jvm.internal.K(), this, bundle2);
            c11.e(list2, s11);
            this.f2687y = null;
            bundle = bundle2;
        }
        return i13.f71783a;
    }

    public static void a(C2584m this$0, androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.f2681s = event.a();
        if (this$0.f2665c != null) {
            Iterator<C2581j> it = this$0.f2669g.iterator();
            while (it.hasNext()) {
                it.next().h(event);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (z() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c0() {
        boolean z11 = this.f2684v;
        this.f2683u.setEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(H h11, Bundle bundle, C2581j c2581j, List<C2581j> list) {
        C2581j c2581j2;
        C2581j c2581j3;
        H d11 = c2581j.d();
        boolean z11 = d11 instanceof InterfaceC2575d;
        C7704k<C2581j> c7704k = this.f2669g;
        if (!z11) {
            while (!c7704k.isEmpty() && (c7704k.last().d() instanceof InterfaceC2575d) && Q(c7704k.last().d().m(), true, false)) {
            }
        }
        C7704k c7704k2 = new C7704k();
        boolean z12 = h11 instanceof L;
        Context context = this.f2663a;
        C2581j c2581j4 = null;
        if (z12) {
            H h12 = d11;
            do {
                Intrinsics.f(h12);
                h12 = h12.o();
                if (h12 != null) {
                    ListIterator<C2581j> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            c2581j3 = null;
                            break;
                        } else {
                            c2581j3 = listIterator.previous();
                            if (Intrinsics.d(c2581j3.d(), h12)) {
                                break;
                            }
                        }
                    }
                    C2581j c2581j5 = c2581j3;
                    if (c2581j5 == null) {
                        c2581j5 = C2581j.a.a(context, h12, bundle, B(), this.f2679q);
                    }
                    c7704k2.addFirst(c2581j5);
                    if (!c7704k.isEmpty() && c7704k.last().d() == h12) {
                        S(this, c7704k.last());
                    }
                }
                if (h12 == null) {
                    break;
                }
            } while (h12 != h11);
        }
        H d12 = c7704k2.isEmpty() ? d11 : ((C2581j) c7704k2.first()).d();
        while (d12 != null && r(d12.m()) != d12) {
            d12 = d12.o();
            if (d12 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<C2581j> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        c2581j2 = null;
                        break;
                    } else {
                        c2581j2 = listIterator2.previous();
                        if (Intrinsics.d(c2581j2.d(), d12)) {
                            break;
                        }
                    }
                }
                C2581j c2581j6 = c2581j2;
                if (c2581j6 == null) {
                    c2581j6 = C2581j.a.a(context, d12, d12.e(bundle2), B(), this.f2679q);
                }
                c7704k2.addFirst(c2581j6);
            }
        }
        if (!c7704k2.isEmpty()) {
            d11 = ((C2581j) c7704k2.first()).d();
        }
        while (!c7704k.isEmpty() && (c7704k.last().d() instanceof L)) {
            H d13 = c7704k.last().d();
            Intrinsics.g(d13, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            androidx.collection.a0<H> D11 = ((L) d13).D();
            int m11 = d11.m();
            D11.getClass();
            if (androidx.collection.b0.c(D11, m11) != null) {
                break;
            } else {
                S(this, c7704k.last());
            }
        }
        C2581j i11 = c7704k.i();
        if (i11 == null) {
            i11 = (C2581j) c7704k2.i();
        }
        if (!Intrinsics.d(i11 != null ? i11.d() : null, this.f2665c)) {
            ListIterator<C2581j> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C2581j previous = listIterator3.previous();
                H d14 = previous.d();
                L l11 = this.f2665c;
                Intrinsics.f(l11);
                if (Intrinsics.d(d14, l11)) {
                    c2581j4 = previous;
                    break;
                }
            }
            C2581j c2581j7 = c2581j4;
            if (c2581j7 == null) {
                L l12 = this.f2665c;
                Intrinsics.f(l12);
                L l13 = this.f2665c;
                Intrinsics.f(l13);
                c2581j7 = C2581j.a.a(context, l12, l13.e(bundle), B(), this.f2679q);
            }
            c7704k2.addFirst(c2581j7);
        }
        Iterator<E> it = c7704k2.iterator();
        while (it.hasNext()) {
            C2581j c2581j8 = (C2581j) it.next();
            Object obj = this.f2686x.get(this.f2685w.c(c2581j8.d().n()));
            if (obj == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + h11.n() + " should already be created").toString());
            }
            ((a) obj).o(c2581j8);
        }
        c7704k.addAll(c7704k2);
        c7704k.addLast(c2581j);
        Iterator it2 = C7714v.q0(c2581j, c7704k2).iterator();
        while (it2.hasNext()) {
            C2581j c2581j9 = (C2581j) it2.next();
            L o11 = c2581j9.d().o();
            if (o11 != null) {
                H(c2581j9, t(o11.m()));
            }
        }
    }

    static void o(C2584m c2584m, H h11, Bundle bundle, C2581j c2581j) {
        c2584m.n(h11, bundle, c2581j, kotlin.collections.K.f71697a);
    }

    private final boolean q() {
        C7704k<C2581j> c7704k;
        while (true) {
            c7704k = this.f2669g;
            if (c7704k.isEmpty() || !(c7704k.last().d() instanceof L)) {
                break;
            }
            S(this, c7704k.last());
        }
        C2581j m11 = c7704k.m();
        ArrayList arrayList = this.f2659C;
        if (m11 != null) {
            arrayList.add(m11);
        }
        this.f2658B++;
        b0();
        int i11 = this.f2658B - 1;
        this.f2658B = i11;
        if (i11 == 0) {
            ArrayList W02 = C7714v.W0(arrayList);
            arrayList.clear();
            Iterator it = W02.iterator();
            while (it.hasNext()) {
                C2581j c2581j = (C2581j) it.next();
                Iterator<b> it2 = this.f2680r.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, c2581j.d(), c2581j.c());
                }
                this.f2661E.tryEmit(c2581j);
            }
            this.f2670h.tryEmit(C7714v.W0(c7704k));
            this.f2672j.tryEmit(T());
        }
        return m11 != null;
    }

    public static H s(int i11, @NotNull H h11, boolean z11) {
        L l11;
        Intrinsics.checkNotNullParameter(h11, "<this>");
        if (h11.m() == i11) {
            return h11;
        }
        if (h11 instanceof L) {
            l11 = (L) h11;
        } else {
            L o11 = h11.o();
            Intrinsics.f(o11);
            l11 = o11;
        }
        return l11.C(i11, l11, z11);
    }

    private final int z() {
        int i11 = 0;
        C7704k<C2581j> c7704k = this.f2669g;
        if (c7704k != null && c7704k.isEmpty()) {
            return 0;
        }
        Iterator<C2581j> it = c7704k.iterator();
        while (it.hasNext()) {
            if (!(it.next().d() instanceof L) && (i11 = i11 + 1) < 0) {
                C7714v.N0();
                throw null;
            }
        }
        return i11;
    }

    @NotNull
    public final L A() {
        L l11 = this.f2665c;
        if (l11 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.g(l11, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return l11;
    }

    @NotNull
    public final AbstractC5434v.b B() {
        return this.f2678p == null ? AbstractC5434v.b.CREATED : this.f2681s;
    }

    @NotNull
    public final Q C() {
        return (Q) this.f2660D.getValue();
    }

    @NotNull
    public final d0 D() {
        return this.f2685w;
    }

    @NotNull
    public final M0<List<C2581j>> F() {
        return this.f2673k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cf A[EDGE_INSN: B:114:0x00cf->B:44:0x00cf BREAK  A[LOOP:0: B:21:0x007f->B:39:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Type inference failed for: r13v3, types: [B4.H, B4.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v5, types: [B4.H, B4.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v5, types: [B4.H, B4.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [B4.H, B4.L, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(Intent intent) {
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle bundle;
        L E11;
        H.b H11;
        Bundle e11;
        int length;
        int i11;
        ?? r82;
        Context context;
        H C11;
        ?? r92;
        Bundle bundle2;
        H C12;
        ?? r13;
        int i12 = 0;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            String str = null;
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e12) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e12);
                }
                parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                Bundle bundle3 = new Bundle();
                bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle != null) {
                    bundle3.putAll(bundle);
                }
                C7704k<C2581j> c7704k = this.f2669g;
                if ((intArray != null || intArray.length == 0) && (H11 = (E11 = E(c7704k)).H(new G(intent), true, E11)) != null) {
                    H b11 = H11.b();
                    int[] h11 = b11.h(null);
                    e11 = b11.e(H11.c());
                    if (e11 != null) {
                        bundle3.putAll(e11);
                    }
                    intArray = h11;
                    parcelableArrayList = null;
                }
                if (intArray != null && intArray.length != 0) {
                    L l11 = this.f2665c;
                    length = intArray.length;
                    i11 = 0;
                    r82 = l11;
                    while (true) {
                        context = this.f2663a;
                        if (i11 < length) {
                            break;
                        }
                        int i13 = intArray[i11];
                        if (i11 == 0) {
                            L l12 = this.f2665c;
                            Intrinsics.f(l12);
                            C12 = l12.m() == i13 ? this.f2665c : null;
                        } else {
                            Intrinsics.f(r82);
                            C12 = r82.C(i13, r82, false);
                        }
                        if (C12 == null) {
                            int i14 = H.f2506k;
                            str = H.a.a(i13, context);
                            break;
                        }
                        if (i11 != intArray.length - 1 && (C12 instanceof L)) {
                            while (true) {
                                r13 = (L) C12;
                                Intrinsics.f(r13);
                                if (!(r13.C(r13.F(), r13, false) instanceof L)) {
                                    break;
                                }
                                C12 = r13.C(r13.F(), r13, false);
                            }
                            r82 = r13;
                        }
                        i11++;
                        r82 = r82;
                    }
                    if (str == null) {
                        Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                        return false;
                    }
                    bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length2 = intArray.length;
                    Bundle[] bundleArr = new Bundle[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putAll(bundle3);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i15)) != null) {
                            bundle4.putAll(bundle2);
                        }
                        bundleArr[i15] = bundle4;
                    }
                    int flags = intent.getFlags();
                    int i16 = 268435456 & flags;
                    if (i16 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        androidx.core.app.v e13 = androidx.core.app.v.e(context);
                        e13.a(intent);
                        Intrinsics.checkNotNullExpressionValue(e13, "create(context).addNextI…ntWithParentStack(intent)");
                        e13.h();
                        Activity activity = this.f2664b;
                        if (activity != null) {
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                        }
                        return true;
                    }
                    if (i16 != 0) {
                        if (!c7704k.isEmpty()) {
                            L l13 = this.f2665c;
                            Intrinsics.f(l13);
                            Q(l13.m(), true, false);
                        }
                        while (i12 < intArray.length) {
                            int i17 = intArray[i12];
                            int i18 = i12 + 1;
                            Bundle bundle5 = bundleArr[i12];
                            H r11 = r(i17);
                            if (r11 == null) {
                                int i19 = H.f2506k;
                                StringBuilder b12 = C6594f.b("Deep Linking failed: destination ", H.a.a(i17, context), " cannot be found from the current destination ");
                                b12.append(y());
                                throw new IllegalStateException(b12.toString());
                            }
                            J(r11, bundle5, U.a(new d(r11, this)));
                            i12 = i18;
                        }
                        this.f2668f = true;
                        return true;
                    }
                    L l14 = this.f2665c;
                    int length3 = intArray.length;
                    int i21 = 0;
                    ?? r22 = l14;
                    while (i21 < length3) {
                        int i22 = intArray[i21];
                        Bundle bundle6 = bundleArr[i21];
                        if (i21 == 0) {
                            C11 = this.f2665c;
                        } else {
                            Intrinsics.f(r22);
                            C11 = r22.C(i22, r22, false);
                        }
                        if (C11 == null) {
                            int i23 = H.f2506k;
                            throw new IllegalStateException("Deep Linking failed: destination " + H.a.a(i22, context) + " cannot be found in graph " + r22);
                        }
                        if (i21 == intArray.length - 1) {
                            S.a aVar = new S.a();
                            L l15 = this.f2665c;
                            Intrinsics.f(l15);
                            aVar.g(l15.m(), true, false);
                            aVar.b(0);
                            aVar.c(0);
                            J(C11, bundle6, aVar.a());
                        } else if (C11 instanceof L) {
                            while (true) {
                                r92 = (L) C11;
                                Intrinsics.f(r92);
                                if (!(r92.C(r92.F(), r92, false) instanceof L)) {
                                    break;
                                }
                                C11 = r92.C(r92.F(), r92, false);
                            }
                            r22 = r92;
                        }
                        i21++;
                        r22 = r22;
                    }
                    this.f2668f = true;
                    return true;
                }
            }
            intArray = null;
            if (extras == null) {
            }
            Bundle bundle32 = new Bundle();
            if (extras == null) {
            }
            if (bundle != null) {
            }
            C7704k<C2581j> c7704k2 = this.f2669g;
            if (intArray != null) {
            }
            H b112 = H11.b();
            int[] h112 = b112.h(null);
            e11 = b112.e(H11.c());
            if (e11 != null) {
            }
            intArray = h112;
            parcelableArrayList = null;
            if (intArray != null) {
                L l112 = this.f2665c;
                length = intArray.length;
                i11 = 0;
                r82 = l112;
                while (true) {
                    context = this.f2663a;
                    if (i11 < length) {
                    }
                    i11++;
                    r82 = r82;
                }
                if (str == null) {
                }
            }
        }
        return false;
    }

    public final void I(int i11, Bundle bundle) {
        int i12;
        S s11;
        C7704k<C2581j> c7704k = this.f2669g;
        H d11 = c7704k.isEmpty() ? this.f2665c : c7704k.last().d();
        if (d11 == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C2577f i13 = d11.i(i11);
        Bundle bundle2 = null;
        if (i13 != null) {
            s11 = i13.c();
            i12 = i13.b();
            Bundle a11 = i13.a();
            if (a11 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(a11);
            }
        } else {
            i12 = i11;
            s11 = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i12 == 0 && s11 != null && s11.e() != -1) {
            if (s11.e() != -1) {
                O(s11.e(), s11.f());
                return;
            }
            return;
        }
        if (i12 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        H r11 = r(i12);
        if (r11 != null) {
            J(r11, bundle2, s11);
            return;
        }
        int i14 = H.f2506k;
        Context context = this.f2663a;
        String a12 = H.a.a(i12, context);
        if (i13 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + a12 + " cannot be found from the current destination " + d11);
        }
        StringBuilder b11 = C6594f.b("Navigation destination ", a12, " referenced from action ");
        b11.append(H.a.a(i11, context));
        b11.append(" cannot be found from the current destination ");
        b11.append(d11);
        throw new IllegalArgumentException(b11.toString().toString());
    }

    public final void K(@NotNull Uri deepLink, S s11) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        G request = new G(deepLink, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f2665c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        L E11 = E(this.f2669g);
        H.b H11 = E11.H(request, true, E11);
        if (H11 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f2665c);
        }
        Bundle e11 = H11.b().e(H11.c());
        if (e11 == null) {
            e11 = new Bundle();
        }
        H b11 = H11.b();
        Intent intent = new Intent();
        intent.setDataAndType(request.c(), request.b());
        intent.setAction(request.a());
        e11.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        J(b11, e11, s11);
    }

    public final boolean M() {
        Intent intent;
        if (z() != 1) {
            return N();
        }
        Activity activity = this.f2664b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int i11 = 0;
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            H y11 = y();
            Intrinsics.f(y11);
            int m11 = y11.m();
            for (L o11 = y11.o(); o11 != null; o11 = o11.o()) {
                if (o11.F() != m11) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        L E11 = E(this.f2669g);
                        Intent intent2 = activity.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "activity!!.intent");
                        H.b H11 = E11.H(new G(intent2), true, E11);
                        if ((H11 != null ? H11.c() : null) != null) {
                            bundle.putAll(H11.b().e(H11.c()));
                        }
                    }
                    C c11 = new C(this);
                    C.e(c11, o11.m());
                    c11.d(bundle);
                    c11.b().h();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                m11 = o11.m();
            }
        } else if (this.f2668f) {
            Intrinsics.f(activity);
            Intent intent3 = activity.getIntent();
            Bundle extras2 = intent3.getExtras();
            Intrinsics.f(extras2);
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            Intrinsics.f(intArray);
            ArrayList h02 = C7705l.h0(intArray);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int intValue = ((Number) C7714v.w0(h02)).intValue();
            if (parcelableArrayList != null) {
            }
            if (!h02.isEmpty()) {
                H s11 = s(intValue, A(), false);
                if (s11 instanceof L) {
                    int i12 = L.f2535p;
                    L l11 = (L) s11;
                    Intrinsics.checkNotNullParameter(l11, "<this>");
                    Intrinsics.checkNotNullParameter(l11, "<this>");
                    intValue = ((H) kotlin.sequences.l.u(kotlin.sequences.l.q(l11, K.f2534b))).m();
                }
                H y12 = y();
                if (y12 != null && intValue == y12.m()) {
                    C c12 = new C(this);
                    Bundle b11 = androidx.core.os.d.b(new Pair("android-support-nav:controller:deepLinkIntent", intent3));
                    Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle2 != null) {
                        b11.putAll(bundle2);
                    }
                    c12.d(b11);
                    Iterator it = h02.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        c12.a(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i11) : null);
                        i11 = i13;
                    }
                    c12.b().h();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean N() {
        if (this.f2669g.isEmpty()) {
            return false;
        }
        H y11 = y();
        Intrinsics.f(y11);
        return O(y11.m(), true);
    }

    public final boolean O(int i11, boolean z11) {
        return Q(i11, z11, false) && q();
    }

    public final void P(@NotNull C2581j popUpTo, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        C7704k<C2581j> c7704k = this.f2669g;
        int indexOf = c7704k.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i11 = indexOf + 1;
        if (i11 != c7704k.getF26995b()) {
            Q(c7704k.get(i11).d().m(), true, false);
        }
        S(this, popUpTo);
        ((a.C0064a) onComplete).invoke();
        c0();
        q();
    }

    @NotNull
    public final ArrayList T() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2686x.values().iterator();
        while (it.hasNext()) {
            Set<C2581j> value = ((a) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                C2581j c2581j = (C2581j) obj;
                if (!arrayList.contains(c2581j) && !c2581j.f().a(AbstractC5434v.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            C7714v.p(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<C2581j> it2 = this.f2669g.iterator();
        while (it2.hasNext()) {
            C2581j next = it2.next();
            C2581j c2581j2 = next;
            if (!arrayList.contains(c2581j2) && c2581j2.f().a(AbstractC5434v.b.STARTED)) {
                arrayList3.add(next);
            }
        }
        C7714v.p(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C2581j) next2).d() instanceof L)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final void U(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f2663a.getClassLoader());
        this.f2666d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f2667e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.f2677o;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                this.f2676n.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                i11++;
                i12++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    C7704k c7704k = new C7704k(parcelableArray.length);
                    Iterator a11 = C7721c.a(parcelableArray);
                    while (a11.hasNext()) {
                        Parcelable parcelable = (Parcelable) a11.next();
                        Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        c7704k.addLast((C2582k) parcelable);
                    }
                    linkedHashMap.put(id2, c7704k);
                }
            }
        }
        this.f2668f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final Bundle W() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, b0<? extends H>> entry : this.f2685w.d().entrySet()) {
            String key = entry.getKey();
            Bundle i11 = entry.getValue().i();
            if (i11 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i11);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C7704k<C2581j> c7704k = this.f2669g;
        if (!c7704k.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c7704k.getF26995b()];
            Iterator<C2581j> it = c7704k.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                parcelableArr[i12] = new C2582k(it.next());
                i12++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.f2676n;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i13 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i13] = intValue;
                arrayList2.add(str);
                i13++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.f2677o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                C7704k c7704k2 = (C7704k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c7704k2.getF26995b()];
                Iterator<E> it2 = c7704k2.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    parcelableArr2[i14] = (C2582k) next;
                    i14 = i15;
                }
                bundle.putParcelableArray(Nk.a.b("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f2668f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f2668f);
        }
        return bundle;
    }

    public final void X(@NotNull L graph, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        C7704k<C2581j> c7704k = this.f2669g;
        if (!c7704k.isEmpty() && B() == AbstractC5434v.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (Intrinsics.d(this.f2665c, graph)) {
            int e11 = graph.D().e();
            for (int i11 = 0; i11 < e11; i11++) {
                H f7 = graph.D().f(i11);
                L l11 = this.f2665c;
                Intrinsics.f(l11);
                int c11 = l11.D().c(i11);
                L l12 = this.f2665c;
                Intrinsics.f(l12);
                androidx.collection.a0<H> D11 = l12.D();
                if (D11.f38684a) {
                    androidx.collection.b0.a(D11);
                }
                int a11 = C7445a.a(D11.f38687d, c11, D11.f38685b);
                if (a11 >= 0) {
                    Object[] objArr = D11.f38686c;
                    Object obj = objArr[a11];
                    objArr[a11] = f7;
                }
            }
            Iterator<C2581j> it = c7704k.iterator();
            while (it.hasNext()) {
                C2581j next = it.next();
                int i12 = H.f2506k;
                List<H> u11 = C7714v.u(kotlin.sequences.l.C(H.a.b(next.d())));
                H h11 = this.f2665c;
                Intrinsics.f(h11);
                for (H h12 : u11) {
                    if (!Intrinsics.d(h12, this.f2665c) || !Intrinsics.d(h11, graph)) {
                        if (h11 instanceof L) {
                            L l13 = (L) h11;
                            h11 = l13.C(h12.m(), l13, false);
                            Intrinsics.f(h11);
                        }
                    }
                }
                next.j(h11);
            }
            return;
        }
        L l14 = this.f2665c;
        LinkedHashMap linkedHashMap = this.f2686x;
        if (l14 != null) {
            Iterator it2 = new ArrayList(this.f2676n.keySet()).iterator();
            while (it2.hasNext()) {
                Integer id2 = (Integer) it2.next();
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                int intValue = id2.intValue();
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((a) it3.next()).m(true);
                }
                boolean V11 = V(intValue, null, U.a(C2585n.f2699b));
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((a) it4.next()).m(false);
                }
                if (V11) {
                    Q(intValue, true, false);
                }
            }
            Q(l14.m(), true, false);
        }
        this.f2665c = graph;
        Bundle bundle2 = this.f2666d;
        d0 d0Var = this.f2685w;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it5 = stringArrayList.iterator();
            while (it5.hasNext()) {
                String name = it5.next();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                b0 c12 = d0Var.c(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    c12.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f2667e;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C2582k c2582k = (C2582k) parcelable;
                H r11 = r(c2582k.a());
                Context context = this.f2663a;
                if (r11 == null) {
                    int i13 = H.f2506k;
                    StringBuilder b11 = C6594f.b("Restoring the Navigation back stack failed: destination ", H.a.a(c2582k.a(), context), " cannot be found from the current destination ");
                    b11.append(y());
                    throw new IllegalStateException(b11.toString());
                }
                C2581j b12 = c2582k.b(context, r11, B(), this.f2679q);
                b0 c13 = d0Var.c(r11.n());
                Object obj2 = linkedHashMap.get(c13);
                if (obj2 == null) {
                    obj2 = new a(this, c13);
                    linkedHashMap.put(c13, obj2);
                }
                c7704k.addLast(b12);
                ((a) obj2).o(b12);
                L o11 = b12.d().o();
                if (o11 != null) {
                    H(b12, t(o11.m()));
                }
            }
            c0();
            this.f2667e = null;
        }
        Collection<b0<? extends H>> values = d0Var.d().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((b0) obj3).c()) {
                arrayList.add(obj3);
            }
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            b0 b0Var = (b0) it6.next();
            Object obj4 = linkedHashMap.get(b0Var);
            if (obj4 == null) {
                obj4 = new a(this, b0Var);
                linkedHashMap.put(b0Var, obj4);
            }
            b0Var.f((a) obj4);
        }
        if (this.f2665c == null || !c7704k.isEmpty()) {
            q();
            return;
        }
        if (this.f2668f || (activity = this.f2664b) == null || !G(activity.getIntent())) {
            L l15 = this.f2665c;
            Intrinsics.f(l15);
            J(l15, bundle, null);
        }
    }

    public void Y(@NotNull androidx.lifecycle.J owner) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.d(owner, this.f2678p)) {
            return;
        }
        androidx.lifecycle.J j11 = this.f2678p;
        C2583l c2583l = this.f2682t;
        if (j11 != null && (lifecycle = j11.getLifecycle()) != null) {
            lifecycle.e(c2583l);
        }
        this.f2678p = owner;
        owner.getLifecycle().a(c2583l);
    }

    public void Z(@NotNull A0 viewModelStore) {
        C2596z.a aVar;
        C2596z.a aVar2;
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        C2596z c2596z = this.f2679q;
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        aVar = C2596z.f2722b;
        int i11 = 0;
        if (Intrinsics.d(c2596z, (C2596z) new z0(viewModelStore, aVar, i11).a(C2596z.class))) {
            return;
        }
        if (!this.f2669g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        aVar2 = C2596z.f2722b;
        this.f2679q = (C2596z) new z0(viewModelStore, aVar2, i11).a(C2596z.class);
    }

    public final void a0(@NotNull C2581j child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C2581j c2581j = (C2581j) this.f2674l.remove(child);
        if (c2581j == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f2675m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c2581j);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            a aVar = (a) this.f2686x.get(this.f2685w.c(c2581j.d().n()));
            if (aVar != null) {
                aVar.e(c2581j);
            }
            linkedHashMap.remove(c2581j);
        }
    }

    public final void b0() {
        AtomicInteger atomicInteger;
        M0<Set<C2581j>> c11;
        Set<C2581j> value;
        ArrayList W02 = C7714v.W0(this.f2669g);
        if (W02.isEmpty()) {
            return;
        }
        H d11 = ((C2581j) C7714v.X(W02)).d();
        ArrayList arrayList = new ArrayList();
        if (d11 instanceof InterfaceC2575d) {
            Iterator it = C7714v.z0(W02).iterator();
            while (it.hasNext()) {
                H d12 = ((C2581j) it.next()).d();
                arrayList.add(d12);
                if (!(d12 instanceof InterfaceC2575d) && !(d12 instanceof L)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C2581j c2581j : C7714v.z0(W02)) {
            AbstractC5434v.b f7 = c2581j.f();
            H d13 = c2581j.d();
            if (d11 != null && d13.m() == d11.m()) {
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                if (f7 != bVar) {
                    a aVar = (a) this.f2686x.get(this.f2685w.c(c2581j.d().n()));
                    if (Intrinsics.d((aVar == null || (c11 = aVar.c()) == null || (value = c11.getValue()) == null) ? null : Boolean.valueOf(value.contains(c2581j)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f2675m.get(c2581j)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c2581j, AbstractC5434v.b.STARTED);
                    } else {
                        hashMap.put(c2581j, bVar);
                    }
                }
                H h11 = (H) C7714v.M(arrayList);
                if (h11 != null && h11.m() == d13.m()) {
                    C7714v.u0(arrayList);
                }
                d11 = d11.o();
            } else if (arrayList.isEmpty() || d13.m() != ((H) C7714v.K(arrayList)).m()) {
                c2581j.k(AbstractC5434v.b.CREATED);
            } else {
                H h12 = (H) C7714v.u0(arrayList);
                if (f7 == AbstractC5434v.b.RESUMED) {
                    c2581j.k(AbstractC5434v.b.STARTED);
                } else {
                    AbstractC5434v.b bVar2 = AbstractC5434v.b.STARTED;
                    if (f7 != bVar2) {
                        hashMap.put(c2581j, bVar2);
                    }
                }
                L o11 = h12.o();
                if (o11 != null && !arrayList.contains(o11)) {
                    arrayList.add(o11);
                }
            }
        }
        Iterator it2 = W02.iterator();
        while (it2.hasNext()) {
            C2581j c2581j2 = (C2581j) it2.next();
            AbstractC5434v.b bVar3 = (AbstractC5434v.b) hashMap.get(c2581j2);
            if (bVar3 != null) {
                c2581j2.k(bVar3);
            } else {
                c2581j2.l();
            }
        }
    }

    public final void p(@NotNull C7895b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f2680r.add(listener);
        C7704k<C2581j> c7704k = this.f2669g;
        if (c7704k.isEmpty()) {
            return;
        }
        C2581j last = c7704k.last();
        l80.f.P(listener.f72965a, this, last.d(), last.c());
    }

    public final H r(int i11) {
        H h11;
        L l11 = this.f2665c;
        if (l11 == null) {
            return null;
        }
        if (l11.m() == i11) {
            return this.f2665c;
        }
        C2581j m11 = this.f2669g.m();
        if (m11 == null || (h11 = m11.d()) == null) {
            h11 = this.f2665c;
            Intrinsics.f(h11);
        }
        return s(i11, h11, false);
    }

    @NotNull
    public final C2581j t(int i11) {
        C2581j c2581j;
        C7704k<C2581j> c7704k = this.f2669g;
        ListIterator<C2581j> listIterator = c7704k.listIterator(c7704k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c2581j = null;
                break;
            }
            c2581j = listIterator.previous();
            if (c2581j.d().m() == i11) {
                break;
            }
        }
        C2581j c2581j2 = c2581j;
        if (c2581j2 != null) {
            return c2581j2;
        }
        StringBuilder f7 = P4.f.f(i11, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        f7.append(y());
        throw new IllegalArgumentException(f7.toString().toString());
    }

    @NotNull
    public final Context u() {
        return this.f2663a;
    }

    @NotNull
    public final M0<List<C2581j>> v() {
        return this.f2671i;
    }

    public final C2581j w() {
        return this.f2669g.m();
    }

    @NotNull
    public final InterfaceC2395h<C2581j> x() {
        return this.f2662F;
    }

    public final H y() {
        C2581j w11 = w();
        if (w11 != null) {
            return w11.d();
        }
        return null;
    }
}
