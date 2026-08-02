package EZ;

import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import sZ.AbstractC9644b;
import vZ.C10288c;

/* loaded from: classes3.dex */
public class g {

    @NotNull
    private final r activity;
    private final Integer containerId;

    @NotNull
    private final G fragmentManager;
    private h holder;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final C10288c transactionManager;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC9644b f7733c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<?> f7734d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7735e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC9644b abstractC9644b, e eVar, int i11) {
            super(0);
            this.f7733c = abstractC9644b;
            this.f7734d = eVar;
            this.f7735e = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            g.this.navigateInternal(this.f7733c, this.f7734d, this.f7735e);
            return Unit.f71690a;
        }
    }

    public g(@NotNull r activity, Integer num, @NotNull G fragmentManager, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.activity = activity;
        this.containerId = num;
        this.fragmentManager = fragmentManager;
        this.lifecycleOwner = lifecycleOwner;
        this.transactionManager = new C10288c(fragmentManager, lifecycleOwner);
    }

    private final EZ.a<pZ.f> getNavigationHandler(pZ.f fVar) {
        h hVar = this.holder;
        if (hVar == null) {
            throw new IllegalStateException("Navigator not attached to NavigatorHolder. need call method NavigatorHolder.addNavigator()");
        }
        C8475a d11 = hVar.d();
        EZ.a<pZ.f> b11 = d11.n().b(fVar);
        if (b11 instanceof i) {
            ((i) b11).attachTo$compass_release(d11);
        }
        return b11;
    }

    public static /* synthetic */ void navigate$default(g gVar, e eVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        gVar.navigate(eVar, i11);
    }

    public static /* synthetic */ void navigateInternal$default(g gVar, e eVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        gVar.navigateInternal(eVar, i11);
    }

    public static /* synthetic */ void redirect$default(g gVar, e eVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: redirect");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        gVar.redirect(eVar, i11);
    }

    protected void attachToHolder() {
    }

    public final void attachToHolder$compass_release(@NotNull h holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.holder == null) {
            this.holder = holder;
        }
        attachToHolder();
    }

    @NotNull
    public final r getActivity() {
        return this.activity;
    }

    public final Integer getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final G getFragmentManager() {
        return this.fragmentManager;
    }

    @NotNull
    public final J getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public void navigate(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        pZ.f b11 = response.b();
        pZ.f.Companion.getClass();
        if (b11 == pZ.f.NONE) {
            return;
        }
        EZ.a<pZ.f> navigationHandler = getNavigationHandler(b11);
        if (navigationHandler instanceof AbstractC9644b) {
            safeTransaction(new a((AbstractC9644b) navigationHandler, response, i11));
        } else {
            navigateInternal(navigationHandler, response, i11);
        }
    }

    protected final void navigateInternal(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        pZ.f b11 = response.b();
        pZ.f.Companion.getClass();
        if (b11 == pZ.f.NONE) {
            return;
        }
        navigateInternal(getNavigationHandler(b11), response, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void next(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        h hVar = this.holder;
        if (hVar != null) {
            hVar.g(this, response, i11);
        } else {
            Intrinsics.n("holder");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void redirect(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        h hVar = this.holder;
        if (hVar == null) {
            throw new IllegalStateException("Navigator not attached to NavigatorHolder. need call method NavigatorHolder.addNavigator()");
        }
        if (hVar != null) {
            hVar.f(response, i11);
        } else {
            Intrinsics.n("holder");
            throw null;
        }
    }

    public final int requireContainerId$compass_release() {
        Integer num = this.containerId;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("containerId not specified for ".concat(getClass().getSimpleName()).toString());
    }

    public final void safeTransaction(@NotNull Function0<Unit> transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.transactionManager.a(transaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void navigateInternal(EZ.a<pZ.f> aVar, e<?> eVar, int i11) {
        Intrinsics.g(eVar, "null cannot be cast to non-null type ru.ozon.compass.navigator.NavigationResponse<ru.ozon.compass.destination.Destination>");
        if (i11 == 0) {
            aVar.navigate(this, eVar);
        } else {
            aVar.navigateForResult(this, eVar, i11);
        }
    }

    public /* synthetic */ g(r rVar, Integer num, G g10, J j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? rVar.getSupportFragmentManager() : g10, (i11 & 8) != 0 ? rVar : j11);
    }
}
