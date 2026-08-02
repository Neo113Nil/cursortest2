package B50;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import K30.a;
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
public final class i extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f2921a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2922b;

    /* renamed from: c, reason: collision with root package name */
    public A50.c f2923c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private C0 f2924d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f2925e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f2926f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f2927g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f2928h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private K30.a f2929i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private K30.a f2930j;

    /* renamed from: k, reason: collision with root package name */
    private int f2931k;

    /* renamed from: l, reason: collision with root package name */
    private int f2932l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2933m;

    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            i.d0((i) this.receiver);
            return Unit.f71690a;
        }
    }

    public i(@NotNull Application application, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f2921a = application;
        this.f2922b = fintechAnalyticInteractor;
        this.f2924d = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        this.f2925e = O0.a(null);
        this.f2926f = O0.a(null);
        this.f2927g = O0.a(null);
        this.f2928h = O0.a(null);
        a.b bVar = a.b.f15169a;
        this.f2929i = bVar;
        this.f2930j = bVar;
    }

    public static final void d0(i iVar) {
        iVar.f2924d.tryEmit(Boolean.TRUE);
    }

    private final void handleState() {
        boolean z11 = this.f2933m;
        x0<List<RecyclerItem>> x0Var = this.f2927g;
        x0<List<RecyclerItem>> x0Var2 = this.f2926f;
        x0<List<RecyclerItem>> x0Var3 = this.f2925e;
        ScreenState screenState = null;
        if (!z11) {
            x0Var3.setValue(null);
            x0Var.setValue(null);
            x0Var2.setValue(null);
            return;
        }
        C50.b j11 = i0().j(this.f2932l, this.f2931k);
        x0Var3.setValue(j11 != null ? j11.g() : null);
        x0Var2.setValue(j11 != null ? j11.c() : null);
        x0Var.setValue(j11 != null ? j11.d() : null);
        x0<ScreenState> x0Var4 = this.f2928h;
        K30.a aVar = this.f2929i;
        if (!(aVar instanceof a.b) || !(this.f2930j instanceof a.b)) {
            if (!(aVar instanceof a.c)) {
                K30.a aVar2 = this.f2930j;
                if (!(aVar2 instanceof a.c)) {
                    if ((aVar instanceof a.C0294a) || (aVar2 instanceof a.C0294a)) {
                        screenState = ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new a(0, this, i.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), this.f2921a, null, 4, null);
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
    public final x0<List<RecyclerItem>> e0() {
        return this.f2926f;
    }

    @NotNull
    public final x0<List<RecyclerItem>> f0() {
        return this.f2927g;
    }

    public final C50.b g0() {
        return i0().j(this.f2932l, this.f2931k);
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f2928h;
    }

    @NotNull
    public final C0 h0() {
        return this.f2924d;
    }

    @NotNull
    public final A50.c i0() {
        A50.c cVar = this.f2923c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("storiesInteractor");
        throw null;
    }

    @NotNull
    public final x0<List<RecyclerItem>> j0() {
        return this.f2925e;
    }

    public final void k0(int i11, int i12) {
        this.f2932l = i11;
        this.f2931k = i12;
    }

    public final void l0() {
        handleState();
    }

    public final void m0() {
        this.f2933m = true;
        handleState();
    }

    public final void n0(w wVar, @NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f2922b.a0(url, str);
        this.f2930j = new a.C0294a(wVar);
        handleState();
    }

    public final void p0() {
        this.f2930j = a.c.f15170a;
        handleState();
    }

    public final void q0() {
        this.f2930j = a.b.f15169a;
        handleState();
    }

    public final void r0(w wVar, @NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f2922b.a0(url, str);
        this.f2929i = new a.C0294a(wVar);
        handleState();
    }

    public final void s0() {
        this.f2929i = a.c.f15170a;
        handleState();
    }

    public final void t0() {
        this.f2929i = a.b.f15169a;
        handleState();
    }
}
