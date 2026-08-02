package WZ;

import Sc.InterfaceC3999a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UZ.b f33372a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sg.a f33373b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final XZ.a f33374c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final SZ.a f33375d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final k f33376e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final u f33377f;

    public r(@NotNull UZ.b eventController, @NotNull Sg.a analyticsScreenStorage, @NotNull XZ.a interactor, @NotNull SZ.a analyticsEventExecutor) {
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        this.f33372a = eventController;
        this.f33373b = analyticsScreenStorage;
        this.f33374c = interactor;
        this.f33375d = analyticsEventExecutor;
        this.f33376e = new k();
        this.f33377f = new u();
    }

    public static Unit i(r rVar, Map map) {
        rVar.f33376e.c(map);
        return Unit.f71690a;
    }

    public static Unit j(r rVar, Map map) {
        rVar.f33376e.a(map);
        return Unit.f71690a;
    }

    public static Unit k(r rVar, Map map) {
        rVar.f33376e.b(map);
        return Unit.f71690a;
    }

    public static Unit l(r rVar) {
        rVar.f33376e.g();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Unit m(Map map, r rVar, e eVar) {
        Rg.a b11;
        String a11;
        for (Map.Entry entry : map.entrySet()) {
            String b12 = ((YZ.a) entry.getKey()).b();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                UZ.d a12 = rVar.f33374c.a(b12, (s) it.next(), rVar.f33376e);
                if (a12 != null) {
                    if (eVar != null) {
                        XZ.d a13 = a12.a();
                        Map<String, Object> d11 = a13 != null ? a13.d() : null;
                        Rg.a b13 = a12.b();
                        g modifyParams = eVar.modifyParams(a12, new g(d11, b13 != null ? new f(b13.g()) : null));
                        if (modifyParams != null) {
                            f c11 = modifyParams.c();
                            if (c11 != null && (a11 = c11.a()) != null) {
                                Rg.a b14 = a12.b();
                                b11 = b14 != null ? Rg.a.a(b14, null, a11, 3071) : null;
                            }
                            b11 = a12.b();
                            XZ.d a14 = a12.a();
                            a12 = new UZ.d(b11, a14 != null ? XZ.d.a(a14, modifyParams.b()) : null);
                        }
                    }
                    rVar.f33372a.sendEvent(a12);
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // WZ.l
    public final void a() {
        this.f33377f.a();
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void b(@NotNull Map<Long, RZ.c> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f33375d.execute(new Kl.c(1, this, state));
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void c(@NotNull final Map<Long, RZ.b> pageState) {
        Intrinsics.checkNotNullParameter(pageState, "pageState");
        this.f33375d.execute(new Callable() { // from class: WZ.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.j(r.this, pageState);
            }
        });
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void d() {
        this.f33375d.execute(new Callable() { // from class: WZ.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.l(r.this);
            }
        });
        this.f33377f.a();
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void e(@NotNull Map<String, String> payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @Override // WZ.l
    public final void f(@NotNull t event, @NotNull i filter, final e eVar) {
        t tVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(filter, "filter");
        tVar = t.f33400b;
        if (event == tVar) {
            return;
        }
        final Map<YZ.a, List<s>> filterEvents = filter.filterEvents(event.b(), this.f33377f);
        this.f33375d.execute(new Callable() { // from class: WZ.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.m(filterEvents, this, eVar);
            }
        });
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void g(@NotNull final Map<Long, ? extends Map<String, String>> aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f33375d.execute(new Callable() { // from class: WZ.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.k(r.this, aliases);
            }
        });
    }

    @Override // WZ.l
    @InterfaceC3999a
    public final void h() {
        this.f33373b.c();
    }
}
