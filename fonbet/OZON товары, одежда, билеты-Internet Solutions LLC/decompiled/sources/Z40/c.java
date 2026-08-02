package Z40;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import D3.h;
import K30.a;
import We.E;
import android.app.Application;
import com.detmir.recycli.adapters.RecyclerItem;
import g30.InterfaceC6618a;
import j3.w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class c extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f35462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f35463b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f35464c;

    /* renamed from: d, reason: collision with root package name */
    public V40.b f35465d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private C0 f35466e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f35467f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f35468g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f35469h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f35470i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private K30.a f35471j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private K30.a f35472k;

    /* renamed from: l, reason: collision with root package name */
    private int f35473l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35474m;

    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            c.d0((c) this.receiver);
            return Unit.f71690a;
        }
    }

    public c(@NotNull Application application, @NotNull InterfaceC6618a analyticInteractor, @NotNull E okHttpClient) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f35462a = application;
        this.f35463b = analyticInteractor;
        this.f35464c = okHttpClient;
        this.f35466e = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        this.f35467f = O0.a(null);
        this.f35468g = O0.a(null);
        this.f35469h = O0.a(null);
        this.f35470i = O0.a(null);
        a.b bVar = a.b.f15169a;
        this.f35471j = bVar;
        this.f35472k = bVar;
    }

    public static final void d0(c cVar) {
        cVar.f35466e.tryEmit(Boolean.TRUE);
    }

    private final void handleState() {
        boolean z11 = this.f35474m;
        x0<List<RecyclerItem>> x0Var = this.f35469h;
        x0<List<RecyclerItem>> x0Var2 = this.f35468g;
        x0<List<RecyclerItem>> x0Var3 = this.f35467f;
        ScreenState screenState = null;
        if (!z11) {
            x0Var3.setValue(null);
            x0Var.setValue(null);
            x0Var2.setValue(null);
            return;
        }
        Y40.b e11 = j0().e(this.f35473l);
        h.g(this.f35473l, "handleState framePos=", "OnboardingSlidesPageViewModel");
        x0Var3.setValue(e11 != null ? e11.i() : null);
        x0Var2.setValue(e11 != null ? e11.c() : null);
        x0Var.setValue(e11 != null ? e11.e() : null);
        x0<ScreenState> x0Var4 = this.f35470i;
        K30.a aVar = this.f35471j;
        if (!(aVar instanceof a.b) || !(this.f35472k instanceof a.b)) {
            if (!(aVar instanceof a.c)) {
                K30.a aVar2 = this.f35472k;
                if (!(aVar2 instanceof a.c)) {
                    if ((aVar instanceof a.C0294a) || (aVar2 instanceof a.C0294a)) {
                        screenState = ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new a(0, this, c.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), this.f35462a, null, 4, null);
                        x0Var4.setValue(screenState);
                    }
                }
            }
            screenState = new ScreenState.Progress(700L, null, 2, null);
            x0Var4.setValue(screenState);
        }
        x0Var4.setValue(screenState);
    }

    @NotNull
    public final InterfaceC6618a e0() {
        return this.f35463b;
    }

    @NotNull
    public final x0<List<RecyclerItem>> f0() {
        return this.f35468g;
    }

    @NotNull
    public final x0<List<RecyclerItem>> g0() {
        return this.f35469h;
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f35470i;
    }

    public final Y40.b h0() {
        return j0().e(this.f35473l);
    }

    @NotNull
    public final E i0() {
        return this.f35464c;
    }

    @NotNull
    public final V40.b j0() {
        V40.b bVar = this.f35465d;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("onboardingSlidesInteractor");
        throw null;
    }

    @NotNull
    public final C0 k0() {
        return this.f35466e;
    }

    @NotNull
    public final x0<List<RecyclerItem>> l0() {
        return this.f35467f;
    }

    public final void m0(int i11) {
        this.f35473l = i11;
    }

    public final void n0() {
        handleState();
    }

    public final void p0() {
        this.f35474m = true;
        handleState();
    }

    public final void q0(w wVar) {
        this.f35472k = new a.C0294a(wVar);
        handleState();
    }

    public final void r0() {
        this.f35472k = a.c.f15170a;
        handleState();
    }

    public final void s0() {
        this.f35472k = a.b.f15169a;
        handleState();
    }

    public final void t0(w wVar) {
        this.f35471j = new a.C0294a(wVar);
        handleState();
    }

    public final void u0() {
        this.f35471j = a.c.f15170a;
        handleState();
    }

    public final void v0() {
        this.f35471j = a.b.f15169a;
        handleState();
    }
}
