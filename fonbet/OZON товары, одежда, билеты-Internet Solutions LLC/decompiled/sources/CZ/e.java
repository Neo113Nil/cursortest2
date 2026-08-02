package CZ;

import EZ.i;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import sZ.c;
import xZ.j;

/* loaded from: classes3.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f4574b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ComponentCallbacksC5392m> f4575c;

    /* renamed from: d, reason: collision with root package name */
    private final pZ.f f4576d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4577e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4578f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f4579g;

    public static final class a extends i<e> {

        /* renamed from: CZ.e$a$a, reason: collision with other inner class name */
        static final class C0113a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ EZ.e<e> f4581c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ pZ.f f4582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0113a(EZ.e<e> eVar, pZ.f fVar) {
                super(0);
                this.f4581c = eVar;
                this.f4582d = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                i.redirect$default(a.this, this.f4581c.e(this.f4582d), 0, 2, null);
                return Unit.f71690a;
            }
        }

        private final void navigateInternal(EZ.g gVar, EZ.e<e> eVar, int i11) {
            if (!(gVar instanceof j)) {
                next(gVar, eVar, i11);
                return;
            }
            ((j) gVar).navigate(eVar.e(eVar.b().e()), i11);
            pZ.f c11 = eVar.b().c();
            if (c11 != null) {
                gVar.safeTransaction(new C0113a(eVar, c11));
            }
        }

        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<e> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<e> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, i11);
        }
    }

    static final class b extends AbstractC7737t implements Function0<sZ.c<ComponentCallbacksC5392m>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final sZ.c<ComponentCallbacksC5392m> invoke() {
            e eVar = e.this;
            return new sZ.c<>(eVar.a(), eVar.b().getValue(), null, false, false, new c.b(R.anim.enter_mini_app_animation, R.anim.exit_mini_app_animation, R.anim.pop_enter_mini_app_animation, R.anim.pop_exit_mini_app_animation), true, false, false, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String miniApp, @NotNull InterfaceC4008j<? extends ComponentCallbacksC5392m> miniAppRoot, pZ.f fVar, boolean z11) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        Intrinsics.checkNotNullParameter(miniAppRoot, "miniAppRoot");
        this.f4574b = miniApp;
        this.f4575c = miniAppRoot;
        this.f4576d = fVar;
        this.f4577e = z11;
        this.f4578f = k.b(new b());
        this.f4579g = N.b(a.class);
    }

    @NotNull
    public final String a() {
        return this.f4574b;
    }

    @NotNull
    public final InterfaceC4008j<ComponentCallbacksC5392m> b() {
        return this.f4575c;
    }

    public final pZ.f c() {
        return this.f4576d;
    }

    public final boolean d() {
        return this.f4577e;
    }

    @NotNull
    public final sZ.c<ComponentCallbacksC5392m> e() {
        return (sZ.c) this.f4578f.getValue();
    }

    @Override // CZ.c, pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f4579g;
    }

    @NotNull
    public final String toString() {
        return "OpenMiniAppDestination(miniApp='" + this.f4574b + "', fragment=" + this.f4575c + ", redirect=" + this.f4576d + ", restoreState=" + this.f4577e + ")";
    }
}
