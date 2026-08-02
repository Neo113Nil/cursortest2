package Hh;

import C.C2702w;
import Qj0.A0;
import Qj0.B;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.F;
import Qj0.L;
import Qj0.U;
import Qj0.t0;
import Qj0.x0;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

/* renamed from: Hh.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3140a {

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final Tc.d f10960s;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Choreographer f10961a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sg.a f10962b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final PerformanceTrackerDelegate f10963c;

    /* renamed from: d, reason: collision with root package name */
    private final Hh.d f10964d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10965e;

    /* renamed from: f, reason: collision with root package name */
    private long f10966f;

    /* renamed from: g, reason: collision with root package name */
    private long f10967g;

    /* renamed from: h, reason: collision with root package name */
    private long f10968h;

    /* renamed from: i, reason: collision with root package name */
    private long f10969i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10970j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f10971k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final HashSet<f> f10972l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10973m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ChoreographerFrameCallbackC3141b f10974n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private b f10975o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final StringBuilder f10976p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final TreeSet<String> f10977q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, e> f10978r;

    /* renamed from: Hh.a$a, reason: collision with other inner class name */
    public static final class C0222a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sg.a f10979a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final PerformanceTrackerDelegate f10980b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer f10981c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10982d;

        public C0222a(@NotNull PerformanceTrackerDelegate performanceTracker, @NotNull Sg.a analyticsScreenStorage) {
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
            this.f10979a = analyticsScreenStorage;
            this.f10980b = performanceTracker;
            this.f10981c = Choreographer.getInstance();
        }

        @NotNull
        public final C3140a a() {
            Choreographer choreographer = this.f10981c;
            Intrinsics.checkNotNullExpressionValue(choreographer, "choreographer");
            return new C3140a(choreographer, this.f10979a, this.f10980b, this.f10982d ? new Hh.d() : null);
        }

        @NotNull
        public final void b(boolean z11) {
            this.f10982d = z11;
        }
    }

    /* renamed from: Hh.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f10983a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f10984b = 0;

        public final long a() {
            return this.f10983a;
        }

        public final long b() {
            return this.f10984b;
        }

        public final void c(long j11) {
            this.f10983a = j11;
        }

        public final void d(long j11) {
            this.f10984b = j11;
        }
    }

    /* renamed from: Hh.a$c */
    /* loaded from: classes10.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long f10985a;

        /* renamed from: b, reason: collision with root package name */
        private long f10986b;

        public c() {
            this(0);
        }

        public final void a(long j11) {
            this.f10986b += j11;
        }

        public final void b() {
            this.f10985a++;
        }

        public final long c() {
            return this.f10986b;
        }

        public final long d() {
            return this.f10985a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10985a == cVar.f10985a && this.f10986b == cVar.f10986b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f10986b) + (Long.hashCode(this.f10985a) * 31);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f10986b, ")", C2702w.d(this.f10985a, "WidgetGroupAnalytics(views=", ", hitchTimeTotal="));
        }

        public c(int i11) {
            this.f10985a = 0L;
            this.f10986b = 0L;
        }
    }

    /* renamed from: Hh.a$d */
    public static final class d implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Display f10987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3140a f10988b;

        d(Display display, C3140a c3140a) {
            this.f10987a = display;
            this.f10988b = c3140a;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i11) {
            Display display = this.f10987a;
            if (i11 == display.getDisplayId()) {
                long b11 = Ig0.a.b(display);
                C3140a c3140a = this.f10988b;
                c3140a.f10966f = Math.max(b11, c3140a.f10968h);
                c3140a.f10967g = Ig0.a.b(display);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i11) {
        }
    }

    static {
        Tc.d builder = new Tc.d();
        builder.put("WIDGET_HITCH", Unit.f71690a);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f10960s = builder.u();
    }

    public C3140a(@NotNull Choreographer choreographer, @NotNull Sg.a analyticsScreenStorage, @NotNull PerformanceTrackerDelegate performanceTracker, Hh.d dVar) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        this.f10961a = choreographer;
        this.f10962b = analyticsScreenStorage;
        this.f10963c = performanceTracker;
        this.f10964d = dVar;
        this.f10966f = -1L;
        this.f10967g = -1L;
        this.f10968h = -1L;
        this.f10971k = k.a(n.NONE, new C3142c(this));
        this.f10972l = new HashSet<>();
        this.f10973m = new LinkedHashMap();
        this.f10974n = new ChoreographerFrameCallbackC3141b(this);
        this.f10975o = new b();
        this.f10976p = new StringBuilder();
        this.f10977q = new TreeSet<>();
        this.f10978r = new HashMap<>();
    }

    public static final void f(C3140a c3140a, long j11) {
        long j12 = c3140a.f10969i;
        HashSet<f> hashSet = c3140a.f10972l;
        if (j12 > 0 && c3140a.f10966f != -1) {
            long j13 = j11 - j12;
            b bVar = c3140a.f10975o;
            bVar.d(bVar.b() + j13);
            long j14 = j13 - c3140a.f10966f;
            if (j14 < c3140a.f10967g) {
                j14 = 0;
            }
            if (j14 > 0) {
                b bVar2 = c3140a.f10975o;
                bVar2.c(bVar2.a() + j14);
            }
            if (!hashSet.isEmpty()) {
                LinkedHashMap linkedHashMap = c3140a.f10973m;
                c cVar = (c) linkedHashMap.get(hashSet);
                if (cVar == null) {
                    Set Y02 = C7714v.Y0(hashSet);
                    c cVar2 = new c(0);
                    linkedHashMap.put(Y02, cVar2);
                    cVar = cVar2;
                }
                cVar.b();
                if (j14 > 0) {
                    c cVar3 = (c) linkedHashMap.get(hashSet);
                    if (cVar3 != null) {
                        cVar3.a(j14);
                    }
                    Hh.d dVar = c3140a.f10964d;
                    if (dVar != null) {
                        dVar.a(hashSet, (long) (j14 * 1.0E-6d));
                    }
                }
            }
        }
        hashSet.clear();
    }

    static String l(C3140a c3140a, TreeSet treeSet) {
        c3140a.getClass();
        int size = treeSet.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return String.valueOf(treeSet.iterator().next());
        }
        c3140a.f10976p.setLength(0);
        StringBuilder sb2 = c3140a.f10976p;
        C7714v.U(treeSet, sb2, ", ", null, null, null, 124);
        String sb3 = sb2.toString();
        Intrinsics.f(sb3);
        return sb3;
    }

    private static void p(U u11, Rg.a aVar) {
        if (aVar == null) {
            return;
        }
        F f7 = new F(aVar.g());
        int i11 = U.f23535i;
        u11.n(f7, true);
        String f11 = aVar.f();
        if (f11 != null) {
            u11.n(new C3884d(f11), true);
        }
        String c11 = aVar.c();
        if (c11 != null) {
            u11.n(new C3885e(c11), true);
        }
        String l11 = aVar.l();
        if (l11 != null) {
            u11.n(new x0(l11), true);
        }
        String i12 = aVar.i();
        if (i12 != null) {
            u11.n(new L(i12), true);
        }
    }

    public final Long j(@NotNull String holderName) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Hh.d dVar = this.f10964d;
        if (dVar != null) {
            return dVar.b(holderName);
        }
        return null;
    }

    public final void k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10965e = true;
        Display a11 = Ig0.a.a(context);
        if (a11 == null) {
            return;
        }
        this.f10966f = Math.max(Ig0.a.b(a11), this.f10968h);
        this.f10967g = Ig0.a.b(a11);
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            displayManager.registerDisplayListener(new d(a11, this), null);
        }
    }

    public final void m() {
        this.f10978r.clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    public final void n(int i11, @NotNull String name, @NotNull String widgetName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        if (((Boolean) this.f10971k.getValue()).booleanValue()) {
            HashMap<Integer, e> hashMap = this.f10978r;
            if (hashMap.containsKey(Integer.valueOf(i11))) {
                return;
            }
            hashMap.put(Integer.valueOf(i11), new e(widgetName, name, new LinkedHashSet()));
            this.f10972l.add(new f(widgetName, name));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public final void o(int i11, @NotNull String eventName) {
        e eVar;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (!((Boolean) this.f10971k.getValue()).booleanValue() || (eVar = this.f10978r.get(Integer.valueOf(i11))) == null || eVar.a().contains(eventName)) {
            return;
        }
        eVar.a().add(eventName);
        this.f10972l.add(new f(eVar.c(), eVar.b()));
    }

    public final void q() {
        String c11;
        Sg.a aVar = this.f10962b;
        Rg.a a11 = aVar.a();
        String b11 = Nk.a.b("fps_page_", a11 != null ? a11.c() : null);
        PerformanceTrackerDelegate performanceTrackerDelegate = this.f10963c;
        U beginTrace = performanceTrackerDelegate.beginTrace(b11);
        B b12 = new B(ObjectTypes.PAGE_SCROLL);
        int i11 = U.f23535i;
        beginTrace.n(b12, true);
        U.p(beginTrace, MetricType.HITCH_TIME, (long) (this.f10975o.a() * 1.0E-6d), false, 4);
        U.p(beginTrace, MetricType.SCROLL_TIME, (long) (this.f10975o.b() * 1.0E-6d), false, 4);
        if (a11 != null && (c11 = a11.c()) != null) {
            beginTrace.n(new t0(c11), true);
        }
        p(beginTrace, a11);
        performanceTrackerDelegate.endTrace(b11, kotlin.collections.U.c());
        LinkedHashMap linkedHashMap = this.f10973m;
        for (Set set : linkedHashMap.keySet()) {
            Object obj = linkedHashMap.get(set);
            Intrinsics.f(obj);
            c cVar = (c) obj;
            Set set2 = set;
            TreeSet<String> treeSet = this.f10977q;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                treeSet.add(((f) it.next()).b());
            }
            String l11 = l(this, treeSet);
            treeSet.clear();
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                treeSet.add(((f) it2.next()).a());
            }
            String l12 = l(this, treeSet);
            treeSet.clear();
            String concat = "fps_widget_".concat(l11);
            U beginTrace2 = performanceTrackerDelegate.beginTrace(concat);
            beginTrace2.n(new B(ObjectTypes.WIDGET), true);
            beginTrace2.n(new A0(l11), true);
            U.p(beginTrace2, MetricType.HITCH_TIME, (long) (cVar.c() * 1.0E-6d), false, 4);
            U.p(beginTrace2, MetricType.WIDGET_VIEWS, cVar.d(), false, 4);
            beginTrace2.n(new t0(l12), true);
            p(beginTrace2, aVar.a());
            performanceTrackerDelegate.endTrace(concat, f10960s);
        }
        linkedHashMap.clear();
        this.f10975o = new b();
        u();
    }

    public final void r() {
        this.f10970j = true;
    }

    public final void s(int i11) {
        this.f10968h = i11 <= 0 ? -1L : (long) (1.0E9d / i11);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    public final void t() {
        if (!this.f10965e) {
            throw new IllegalStateException("Call init() before start() method call.");
        }
        if (((Boolean) this.f10971k.getValue()).booleanValue() && this.f10966f != -1) {
            Choreographer choreographer = this.f10961a;
            ChoreographerFrameCallbackC3141b choreographerFrameCallbackC3141b = this.f10974n;
            choreographer.removeFrameCallback(choreographerFrameCallbackC3141b);
            choreographer.postFrameCallback(choreographerFrameCallbackC3141b);
        }
    }

    public final void u() {
        this.f10969i = 0L;
        this.f10961a.removeFrameCallback(this.f10974n);
    }
}
