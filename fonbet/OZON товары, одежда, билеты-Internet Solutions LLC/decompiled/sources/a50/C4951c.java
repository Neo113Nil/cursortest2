package a50;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import D3.h;
import E30.i;
import K30.a;
import We.E;
import android.app.Application;
import android.graphics.Rect;
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

/* renamed from: a50.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4951c extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f36334a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f36335b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f36336c;

    /* renamed from: d, reason: collision with root package name */
    public W40.a f36337d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private C0 f36338e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f36339f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<Y40.d> f36340g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private K30.a f36341h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private K30.a f36342i;

    /* renamed from: j, reason: collision with root package name */
    private int f36343j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36344k;

    /* renamed from: a50.c$a */
    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C4951c.d0((C4951c) this.receiver);
            return Unit.f71690a;
        }
    }

    public C4951c(@NotNull Application application, @NotNull InterfaceC6618a analyticInteractor, @NotNull E okHttpClient) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f36334a = application;
        this.f36335b = analyticInteractor;
        this.f36336c = okHttpClient;
        this.f36338e = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.f36339f = O0.a(null);
        this.f36340g = O0.a(null);
        a.b bVar = a.b.f15169a;
        this.f36341h = bVar;
        this.f36342i = bVar;
    }

    public static final void d0(C4951c c4951c) {
        c4951c.f36338e.tryEmit(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleState() {
        C4951c c4951c;
        ScreenState progress;
        if (this.f36344k) {
            Y40.b f7 = i0().f(this.f36343j);
            h.g(this.f36343j, "handleState framePos=", "OnboardingSlidesPageHeaderViewModel");
            x0<ScreenState> x0Var = this.f36339f;
            K30.a aVar = this.f36341h;
            Y40.d dVar = null;
            if (!(aVar instanceof a.b) || !(this.f36342i instanceof a.b)) {
                if (!(aVar instanceof a.c)) {
                    K30.a aVar2 = this.f36342i;
                    if (!(aVar2 instanceof a.c)) {
                        if ((aVar instanceof a.C0294a) || (aVar2 instanceof a.C0294a)) {
                            c4951c = this;
                            progress = ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new a(0, this, C4951c.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), c4951c.f36334a, null, 4, null);
                            x0Var.setValue(progress);
                            if (f7 != null) {
                                List<RecyclerItem> e11 = f7.e();
                                Rect f11 = f7.f();
                                if (f11 == null) {
                                    f11 = i.a();
                                }
                                dVar = new Y40.d(f11, e11);
                            }
                            c4951c.f36340g.setValue(dVar);
                        }
                    }
                }
                c4951c = this;
                progress = new ScreenState.Progress(700L, null, 2, null);
                x0Var.setValue(progress);
                if (f7 != null) {
                }
                c4951c.f36340g.setValue(dVar);
            }
            c4951c = this;
            progress = null;
            x0Var.setValue(progress);
            if (f7 != null) {
            }
            c4951c.f36340g.setValue(dVar);
        }
    }

    @NotNull
    public final InterfaceC6618a e0() {
        return this.f36335b;
    }

    public final Y40.b f0() {
        return i0().f(this.f36343j);
    }

    @NotNull
    public final x0<Y40.d> g0() {
        return this.f36340g;
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f36339f;
    }

    @NotNull
    public final E h0() {
        return this.f36336c;
    }

    @NotNull
    public final W40.a i0() {
        W40.a aVar = this.f36337d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("onboardingSlidesInteractor");
        throw null;
    }

    @NotNull
    public final C0 j0() {
        return this.f36338e;
    }

    public final void k0(int i11) {
        this.f36343j = i11;
    }

    public final void l0() {
        handleState();
    }

    public final void m0() {
        this.f36344k = true;
        handleState();
    }

    public final void n0(w wVar) {
        this.f36342i = new a.C0294a(wVar);
        handleState();
    }

    public final void p0() {
        this.f36342i = a.c.f15170a;
        handleState();
    }

    public final void q0() {
        this.f36342i = a.b.f15169a;
        handleState();
    }

    public final void r0(w wVar) {
        this.f36341h = new a.C0294a(wVar);
        handleState();
    }

    public final void s0() {
        this.f36341h = a.c.f15170a;
        handleState();
    }

    public final void t0() {
        this.f36341h = a.b.f15169a;
        handleState();
    }
}
