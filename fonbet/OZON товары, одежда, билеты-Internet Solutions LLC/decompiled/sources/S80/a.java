package S80;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import R80.g;
import T80.c;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l70.C7892a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T80.b f26027a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<String> f26028b;

    /* renamed from: c, reason: collision with root package name */
    private final x0<String> f26029c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26030d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0 f26031e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0 f26032f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f26033g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C0 f26034h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f26035i;

    /* renamed from: j, reason: collision with root package name */
    private x0<c.b> f26036j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26037k;

    /* renamed from: l, reason: collision with root package name */
    private w0<Boolean> f26038l;

    /* renamed from: m, reason: collision with root package name */
    private w0<Boolean> f26039m;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f26040n;

    /* renamed from: o, reason: collision with root package name */
    private c f26041o;

    /* renamed from: p, reason: collision with root package name */
    private c f26042p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26043q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final g f26044r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26045s;

    public a(@NotNull Application application, @NotNull T80.b externalFintechNavigation, @NotNull SharedPreferences sharedPreferences, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f26027a = externalFintechNavigation;
        this.f26028b = O0.a(null);
        this.f26029c = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f26031e = E0.a(0, 1, enumC11113a);
        this.f26032f = E0.a(0, 1, enumC11113a);
        this.f26033g = E0.a(0, 1, enumC11113a);
        this.f26034h = E0.a(0, 1, enumC11113a);
        this.f26035i = E0.a(0, 1, enumC11113a);
        this.f26036j = O0.a(c.b.UNDEFINED);
        this.f26038l = O0.a(null);
        this.f26039m = O0.a(null);
        this.f26044r = new g(settings, this, sharedPreferences);
    }

    @Override // T80.a
    @NotNull
    public final R80.b A(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f26044r.A(deeplink);
    }

    @Override // T80.c
    public final List<ComponentCallbacksC5392m> A0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.A0();
        }
        return null;
    }

    @Override // S80.b
    public final void B(boolean z11) {
        this.f26043q = z11;
    }

    @Override // T80.c
    public final void B0(String str, A40.a aVar, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.B0(str, aVar, i11, uuid);
        }
    }

    @Override // T80.c
    public final void C() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.C();
        }
    }

    @Override // T80.c
    public final void C0(@NotNull String label, @NotNull String textToCopy) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(textToCopy, "textToCopy");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.C0(label, textToCopy);
        }
    }

    @Override // T80.c
    public final void D(String str) {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.D(str);
        }
    }

    @Override // S80.b
    public final void D0() {
        this.f26037k = true;
    }

    @Override // T80.c
    public final void E() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.E();
        }
    }

    @Override // T80.c
    public final void E0(@NotNull String positiveButton, @NotNull String negativeButton) {
        Intrinsics.checkNotNullParameter("", SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
        Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.E0(positiveButton, negativeButton);
        }
    }

    @Override // T80.c
    public final void F(String str, A40.a aVar, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.F(str, aVar, i11, uuid);
        }
    }

    @Override // T80.c
    public final void F0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.F0(aVar, uuid);
        }
    }

    @Override // T80.c
    public final Integer G() {
        c cVar = this.f26042p;
        if (cVar != null) {
            return cVar.G();
        }
        return null;
    }

    @Override // T80.c
    public final void G0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.G0();
        }
    }

    @Override // T80.c
    public final void H(@NotNull Uri uri, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.H(uri, mimeType);
        }
    }

    @Override // T80.c
    public final boolean H0(@NotNull ComponentCallbacksC5392m toRemove) {
        Intrinsics.checkNotNullParameter(toRemove, "toRemove");
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.H0(toRemove);
        }
        return false;
    }

    @Override // T80.c
    public final void I(@NotNull String workingMode, @NotNull String confirmPhotoTitle, @NotNull String qrAction, boolean z11, String str, boolean z12, boolean z13, @NotNull String previewCameraTitle, String str2, String str3, String str4, List<String> list, String str5, boolean z14, Long l11, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        Intrinsics.checkNotNullParameter(confirmPhotoTitle, "confirmPhotoTitle");
        Intrinsics.checkNotNullParameter(qrAction, "qrAction");
        Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.I(workingMode, confirmPhotoTitle, qrAction, z11, str, z12, z13, previewCameraTitle, str2, str3, str4, list, str5, z14, l11, str6, bool);
        }
    }

    @Override // S80.b
    public final void I0(boolean z11) {
        this.f26045s = z11;
    }

    @Override // S80.b
    @NotNull
    public final C0 J() {
        return this.f26033g;
    }

    @Override // T80.c
    public final void J0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.J0(aVar, uuid);
        }
    }

    @Override // S80.b
    public final void K(@NotNull c gotoFintechNavigation) {
        Intrinsics.checkNotNullParameter(gotoFintechNavigation, "gotoFintechNavigation");
        this.f26041o = gotoFintechNavigation;
    }

    @Override // T80.c
    public final Integer K0() {
        c cVar = this.f26042p;
        if (cVar != null) {
            return cVar.K0();
        }
        return null;
    }

    @Override // S80.b
    @NotNull
    public final x0<String> L() {
        return this.f26028b;
    }

    @Override // T80.c
    public final ComponentCallbacksC5392m L0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.L0();
        }
        return null;
    }

    @Override // T80.c
    public final Boolean M() {
        return this.f26040n;
    }

    @Override // T80.a
    @NotNull
    public final R80.b M0(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f26044r.M0(deeplink);
    }

    @Override // T80.c
    public final void N(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.N(aVar, uuid);
        }
    }

    @Override // T80.c
    public final boolean N0() {
        c cVar = this.f26041o;
        return cVar != null && cVar.N0();
    }

    @Override // T80.a
    @NotNull
    public final R80.b O(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f26044r.O(deeplink);
    }

    @Override // T80.c
    public final void O0(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.O0(uri);
        }
    }

    @Override // T80.c
    public final void P(@NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.P(fintechLibType);
        }
    }

    @Override // T80.c
    public final void P0(Cbottom2ScreenDTO cbottom2ScreenDTO, boolean z11, boolean z12, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.P0(cbottom2ScreenDTO, z11, z12, uuid);
        }
    }

    @Override // S80.b
    public final boolean Q() {
        return this.f26030d;
    }

    @Override // T80.c
    public final void Q0(@NotNull String uuid, @NotNull String pinPadCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(pinPadCbottomType, "pinPadCbottomType");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.Q0(uuid, pinPadCbottomType, map);
        }
    }

    @Override // T80.c
    public final void R(@NotNull String textToShare) {
        Intrinsics.checkNotNullParameter(textToShare, "textToShare");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.R(textToShare);
        }
    }

    @Override // T80.c
    public final void R0() {
        c cVar = this.f26042p;
        if (cVar != null) {
            cVar.R0();
        }
    }

    @Override // T80.c
    public final void S() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.S();
        }
    }

    @Override // T80.c
    public final w0<Boolean> S0() {
        return this.f26039m;
    }

    @Override // T80.c
    public final void T() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.T();
        }
    }

    @Override // T80.c
    public final void T0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.T0(aVar, uuid);
        }
    }

    @Override // T80.c
    public final ComponentCallbacksC5392m U() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.U();
        }
        return null;
    }

    @Override // T80.c
    public final void U0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.U0(aVar, uuid);
        }
    }

    @Override // T80.c
    public final void V(G30.a aVar) {
        c cVar = this.f26042p;
        if (cVar != null) {
            cVar.V(aVar);
        }
    }

    @Override // T80.c
    public final void V0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.V0();
        }
    }

    @Override // S80.b
    @NotNull
    public final C0 W() {
        return this.f26034h;
    }

    @Override // T80.c
    public final w0<Boolean> X() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.X();
        }
        return null;
    }

    @Override // T80.c
    public final w0<Boolean> Y() {
        return this.f26038l;
    }

    @Override // T80.c
    public final Integer Z(String str) {
        c cVar = this.f26042p;
        if (cVar != null) {
            return cVar.Z(str);
        }
        return null;
    }

    @Override // T80.a
    @NotNull
    public final R80.b a(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f26044r.a(deeplink);
    }

    @Override // T80.c
    public final void a0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.a0();
        }
    }

    @Override // T80.c
    public final void b() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // T80.c
    public final void b0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        c cVar = this.f26042p;
        if (cVar != null) {
            cVar.b0(id2);
        }
    }

    @Override // T80.c
    public final Activity c() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // S80.b
    @NotNull
    public final C0 c0() {
        return this.f26032f;
    }

    @Override // T80.b
    public final boolean canStartOzonIdRecoveryFlow(Activity activity, String str) {
        return this.f26027a.canStartOzonIdRecoveryFlow(activity, str);
    }

    @Override // T80.c
    @NotNull
    public final Map<Integer, List<ComponentCallbacksC5392m>> d() {
        Map<Integer, List<ComponentCallbacksC5392m>> d11;
        c cVar = this.f26041o;
        return (cVar == null || (d11 = cVar.d()) == null) ? U.c() : d11;
    }

    @Override // T80.c
    public final void d0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.d0();
        }
    }

    @Override // T80.c
    public final w0<Boolean> e() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override // T80.c
    public final String e0() {
        c cVar = this.f26042p;
        if (cVar != null) {
            return cVar.e0();
        }
        return null;
    }

    @Override // T80.c
    public final void f() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // T80.c
    public final void f0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.f0();
        }
    }

    @Override // T80.c
    public final void g() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // S80.b
    public final void g0(@NotNull c gotoFintechNavigation) {
        Intrinsics.checkNotNullParameter(gotoFintechNavigation, "gotoFintechNavigation");
        this.f26042p = gotoFintechNavigation;
    }

    @Override // T80.b
    public final boolean gotoDeeplinkOnlyIntegration(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f26027a.gotoDeeplinkOnlyIntegration(deeplink);
    }

    @Override // T80.c
    public final void h(WeakReference<WebView> weakReference) {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.h(weakReference);
        }
    }

    @Override // T80.c
    public final ComponentCallbacksC5392m h0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.h0();
        }
        return null;
    }

    @Override // T80.b
    public final void hideBottomNavigation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26027a.hideBottomNavigation(activity);
    }

    @Override // T80.c
    public final void i(String str, String str2, String str3) {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.i(str, str2, str3);
        }
    }

    @Override // T80.c
    public final List<ComponentCallbacksC5392m> i0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.i0();
        }
        return null;
    }

    @Override // S80.b
    public final x0<c.b> j() {
        return this.f26036j;
    }

    @Override // T80.c
    public final void j0(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.j0(url, str, z11);
        }
    }

    @Override // T80.c
    public final void k() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // T80.c
    public final void k0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.k0();
        }
    }

    @Override // S80.b
    public final void l(boolean z11) {
        this.f26030d = z11;
    }

    @Override // T80.c
    public final void l0(int i11) {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.l0(i11);
        }
    }

    @Override // T80.c
    public final boolean m(@NotNull String deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.m(deepLink);
        }
        return false;
    }

    @Override // S80.b
    @NotNull
    public final C0 m0() {
        return this.f26035i;
    }

    @Override // T80.c
    public final void n(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.n(aVar, uuid);
        }
    }

    @Override // T80.c
    public final void n0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.n0();
        }
    }

    @Override // S80.b
    public final boolean o() {
        return this.f26045s;
    }

    @Override // T80.c
    public final void o0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.o0();
        }
    }

    @Override // S80.b
    public final x0<String> p() {
        return this.f26029c;
    }

    @Override // T80.c
    public final void p0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.p0();
        }
    }

    @Override // T80.c
    public final void pop() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.pop();
        }
    }

    @Override // T80.c
    public final void q(@NotNull String uuid, @NotNull String offlineCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.q(uuid, offlineCbottomType, map);
        }
    }

    @Override // T80.c
    public final String q0(int i11) {
        c cVar = this.f26042p;
        if (cVar != null) {
            return cVar.q0(i11);
        }
        return null;
    }

    @Override // T80.c
    public final void r() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.r();
        }
    }

    @Override // S80.b
    @NotNull
    public final C0 r0() {
        return this.f26031e;
    }

    @Override // T80.c
    public final void s() {
        Intrinsics.checkNotNullParameter("", "id");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.s();
        }
    }

    @Override // T80.c
    public final void s0(@NotNull String text, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(phone, "phone");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.s0(text, phone);
        }
    }

    @Override // T80.b
    public final void showBottomNavigation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26027a.showBottomNavigation(activity);
    }

    @Override // T80.b
    public final void startOzonIdSign(@NotNull Activity activity, String str, String str2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // T80.c
    public final void t() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.t();
        }
    }

    @Override // T80.c
    public final void t0(int i11, List list, List list2) {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.t0(i11, list, list2);
        }
    }

    @Override // T80.c
    public final boolean u(@NotNull String pack) {
        Intrinsics.checkNotNullParameter(pack, "pack");
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.u(pack);
        }
        return false;
    }

    @Override // S80.b
    public final boolean u0() {
        return this.f26037k;
    }

    @Override // T80.c
    public final void v(@NotNull String tel) {
        Intrinsics.checkNotNullParameter(tel, "tel");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.v(tel);
        }
    }

    @Override // T80.c
    public final void v0(String str, @NotNull String url, long j11, @NotNull String contentDeposition, String str2, boolean z11, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentDeposition, "contentDeposition");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.v0(str, url, j11, contentDeposition, str2, z11, str3);
        }
    }

    @Override // T80.c
    public final void w() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.w();
        }
    }

    @Override // T80.c
    public final void w0(@NotNull String id2, @NotNull String receiptText, int i11, @NotNull String time, @NotNull String amount, @NotNull String receiverBank, @NotNull String senderName, @NotNull String senderPhone, @NotNull String senderBank, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(receiptText, "receiptText");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiverBank, "receiverBank");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderBank, "senderBank");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.w0(id2, receiptText, i11, time, amount, receiverBank, senderName, senderPhone, senderBank, str);
        }
    }

    @Override // T80.c
    public final void x(int i11, boolean z11) {
        c cVar = this.f26042p;
        if (cVar != null) {
            cVar.x(i11, z11);
        }
    }

    @Override // T80.c
    public final void x0(@NotNull C7892a contact, @NotNull String bankId) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.x0(contact, bankId);
        }
    }

    @Override // S80.b
    public final boolean y() {
        return this.f26043q;
    }

    @Override // T80.c
    public final boolean y0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        c cVar = this.f26041o;
        if (cVar != null) {
            return cVar.y0(url);
        }
        return false;
    }

    @Override // T80.c
    public final void z(Boolean bool) {
        this.f26040n = bool;
    }

    @Override // T80.c
    public final void z0() {
        c cVar = this.f26041o;
        if (cVar != null) {
            cVar.z0();
        }
    }
}
