package B80;

import A30.m;
import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import H30.x;
import K30.a;
import Sc.o;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import d40.InterfaceC6083a;
import e40.d;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l30.InterfaceC7863a;
import m30.InterfaceC8075b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import w80.C10448a;
import y80.C10863b;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f3039a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f3040b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f3041c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f3042d;

    /* renamed from: e, reason: collision with root package name */
    private String f3043e;

    /* renamed from: f, reason: collision with root package name */
    private String f3044f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private K30.a f3045g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C0 f3046h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<FinToolbarState> f3047i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<ScreenStateV20> f3048j;

    /* renamed from: B80.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0076a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).i0();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<MenuItem, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItem menuItem) {
            MenuItem p02 = menuItem;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    public a(@NotNull InterfaceC6083a exchanger, @NotNull Application application, @NotNull S60.a fintechMetrixInteractor, @NotNull m fintechAuthInteractor, @NotNull K40.a cbottomDisplay, @NotNull Context context, @NotNull r90.f permissionsDelegate, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC8075b webPerfAnalyticInteractor, @NotNull C10863b interceptorsFabric, @NotNull C10448a webBankInteractor, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull NativeBridgeConfigurator nativeBridgeConfigurator, @NotNull h90.f notificationInteractor, @NotNull v30.d fintechAntiFraudInteractor, @NotNull InterfaceC7863a pageLoadDelayAnalyticInteractor, @NotNull Z30.a digRoubleApi, @NotNull d70.d offlineManager, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(webPerfAnalyticInteractor, "webPerfAnalyticInteractor");
        Intrinsics.checkNotNullParameter(interceptorsFabric, "interceptorsFabric");
        Intrinsics.checkNotNullParameter(webBankInteractor, "webBankInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(nativeBridgeConfigurator, "nativeBridgeConfigurator");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(pageLoadDelayAnalyticInteractor, "pageLoadDelayAnalyticInteractor");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        this.f3039a = exchanger;
        this.f3040b = application;
        this.f3041c = fintechNavigation;
        this.f3042d = fintechSettings;
        this.f3045g = a.c.f15170a;
        this.f3046h = E0.a(1, 1, EnumC11113a.DROP_OLDEST);
        this.f3047i = O0.a(null);
        this.f3048j = O0.a(ScreenStateV20.Companion.getProgress$default(ScreenStateV20.INSTANCE, 0L, false, 1, null));
    }

    public final void d0(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        this.f3041c.pop();
    }

    @NotNull
    public final x0<FinToolbarState> e0() {
        return this.f3047i;
    }

    @NotNull
    public final C0 f0() {
        return this.f3046h;
    }

    public final boolean g0(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (Intrinsics.d(parse.getScheme(), "ozon") && Intrinsics.d(parse.getAuthority(), "web")) {
                str = Uri.decode(x.c(parse, ImagesContract.URL));
            }
            String D02 = h.D0(h.z0(str).toString(), '/', '#', ':', '&', '?');
            String f7 = this.f3042d.f();
            if (D02.length() > 0 && f7.length() > 0 && h.e0(D02, f7, false)) {
                this.f3039a.push(new e40.d(D02, d.a.REGULAR));
                this.f3041c.pop();
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final x0<ScreenStateV20> getScreenStateFlow() {
        return this.f3048j;
    }

    public final void h0(String str, ArrayList arrayList) {
        this.f3043e = str;
        L80.a.a("BANK_CARDS", "viewModel.onCreate url=" + str + " cancelUrls=" + arrayList);
        this.f3046h.tryEmit(str);
        handleState();
    }

    public final void handleState() {
        ScreenStateV20 screenStateV20;
        x0<ScreenStateV20> x0Var = this.f3048j;
        K30.a aVar = this.f3045g;
        if (aVar instanceof a.C0294a) {
            screenStateV20 = ScreenStateV20.INSTANCE.getNetworkError(new C0076a(0, this, a.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), this.f3040b);
        } else if (aVar instanceof a.c) {
            screenStateV20 = ScreenStateV20.Companion.getProgress$default(ScreenStateV20.INSTANCE, 0L, false, 1, null);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new o();
            }
            screenStateV20 = null;
        }
        x0Var.setValue(screenStateV20);
        x0<FinToolbarState> x0Var2 = this.f3047i;
        String str = this.f3044f;
        if (str == null) {
            str = "";
        }
        int close_menu_res = FinToolbarState.INSTANCE.getCLOSE_MENU_RES();
        x0Var2.tryEmit(new FinToolbarState(str, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(close_menu_res), null, null, new b(1, this, a.class, "back", "back(Landroid/view/MenuItem;)V", 0), 17, 28670, null));
    }

    public final void i0() {
        this.f3045g = a.c.f15170a;
        handleState();
        this.f3046h.tryEmit(this.f3043e);
    }

    public final void j0(String str) {
        this.f3045g = new a.C0294a(null);
        handleState();
    }

    public final void k0() {
        if (this.f3045g instanceof a.C0294a) {
            return;
        }
        this.f3045g = a.b.f15169a;
        handleState();
    }

    public final void l0(String str) {
        this.f3044f = str;
        handleState();
    }
}
