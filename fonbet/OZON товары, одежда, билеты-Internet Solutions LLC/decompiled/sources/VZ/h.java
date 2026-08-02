package VZ;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UZ.b f28477a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f28478b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sg.a f28479c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sg.a f28480d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final SZ.a f28481e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28482f;

    /* renamed from: g, reason: collision with root package name */
    private Rg.a f28483g;

    /* renamed from: h, reason: collision with root package name */
    private Rg.a f28484h;

    public h(@NotNull UZ.b eventController, @NotNull a analyticsScreenFactory, @NotNull Sg.a currentScreenAnalyticsScreenStorage, @NotNull Sg.a applicationAnalyticsScreenStorage, @NotNull SZ.a analyticsEventExecutor) {
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(analyticsScreenFactory, "analyticsScreenFactory");
        Intrinsics.checkNotNullParameter(currentScreenAnalyticsScreenStorage, "currentScreenAnalyticsScreenStorage");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        this.f28477a = eventController;
        this.f28478b = analyticsScreenFactory;
        this.f28479c = currentScreenAnalyticsScreenStorage;
        this.f28480d = applicationAnalyticsScreenStorage;
        this.f28481e = analyticsEventExecutor;
        this.f28482f = true;
    }

    public static Unit g(h hVar, T00.a aVar, String str, boolean z11) {
        Rg.a aVar2;
        hVar.f28483g = hVar.f28478b.a(aVar, str);
        Sg.a aVar3 = hVar.f28480d;
        if (z11) {
            if (hVar.f28484h == null) {
                hVar.f28484h = aVar3.a();
            }
            aVar2 = hVar.f28484h;
        } else {
            Rg.a a11 = aVar3.a();
            hVar.f28484h = aVar3.a();
            aVar2 = a11;
        }
        Rg.a aVar4 = hVar.f28483g;
        Rg.a aVar5 = null;
        if (aVar4 != null) {
            aVar5 = Rg.a.a(aVar4, aVar2 != null ? Rg.a.a(aVar2, null, null, 3583) : null, null, 3583);
        }
        hVar.f28483g = aVar5;
        hVar.f28479c.e(aVar5);
        return Unit.f71690a;
    }

    public static Unit h(h hVar, Rg.a aVar) {
        hVar.f28479c.e(aVar);
        return Unit.f71690a;
    }

    public static Unit i(h hVar) {
        hVar.f28477a.sendEvent(new UZ.c(hVar.f28479c.a()));
        return Unit.f71690a;
    }

    public static Unit j(h hVar) {
        if (!Intrinsics.d(hVar.f28480d.a(), hVar.f28483g)) {
            hVar.f28484h = hVar.f28480d.a();
            hVar.f28479c.e(hVar.f28483g);
        }
        return Unit.f71690a;
    }

    @Override // VZ.c
    public final void a() {
        if (this.f28482f) {
            this.f28481e.execute(new Callable() { // from class: VZ.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.i(h.this);
                }
            });
        }
    }

    @Override // VZ.c
    public final void b() {
        final Rg.a aVar = this.f28483g;
        if (aVar != null) {
            this.f28481e.execute(new Callable() { // from class: VZ.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.h(h.this, aVar);
                }
            });
        }
    }

    @Override // VZ.c
    public final void c(boolean z11) {
        this.f28482f = z11;
    }

    @Override // VZ.c
    public final void d() {
        if (this.f28483g == null) {
            return;
        }
        this.f28481e.execute(new Callable() { // from class: VZ.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.j(h.this);
            }
        });
    }

    @Override // VZ.c
    public final void e(@NotNull final T00.a state, final String str, final boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.f28482f) {
            this.f28479c.c();
            return;
        }
        String c11 = state.c();
        if (c11 == null || c11.length() == 0) {
            return;
        }
        this.f28481e.execute(new Callable() { // from class: VZ.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.g(h.this, state, str, z11);
            }
        });
    }

    @Override // VZ.c
    public final boolean f() {
        return this.f28482f;
    }
}
