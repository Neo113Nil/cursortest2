package J50;

import Ae.O0;
import Ae.x0;
import J50.f.a;
import Sc.InterfaceC3999a;
import Sc.k;
import Sc.n;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.detmir.recycli.adapters.ScrollKeeper;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2WebViewDTO;
import ru.ozon.fintech.settings.models.FeatureValue;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import x40.C10656a;
import y40.C10837a;
import ya0.C10877b;

/* loaded from: classes3.dex */
public final class f extends G40.a<Cbottom2WebViewDTO> implements ScrollKeeper.a {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f14093d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f14094e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f14095f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C10656a f14096g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final S80.b f14097h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Q90.c f14098i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Application f14099j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f14100k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C10877b f14101l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final R30.a f14102m;

    /* renamed from: n, reason: collision with root package name */
    private Cbottom2WebViewDTO f14103n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f14104o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f14105p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Object f14106q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f14107r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final x0<I50.d> f14108s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull InterfaceC6083a exchanger, @NotNull ru.ozon.fintech.settings.domain.a settings, @NotNull C10656a cbottomMapper2, @NotNull S80.b fintechNavigation, @NotNull Q90.c featureToggles, @NotNull Application application, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C10877b fintechWebviewHeadersInfoProvider, @NotNull R30.a appCoroutineScopes) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechWebviewHeadersInfoProvider, "fintechWebviewHeadersInfoProvider");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f14093d = new ScrollKeeper.b();
        this.f14094e = exchanger;
        this.f14095f = settings;
        this.f14096g = cbottomMapper2;
        this.f14097h = fintechNavigation;
        this.f14098i = featureToggles;
        this.f14099j = application;
        this.f14100k = fintechAnalyticInteractor;
        this.f14101l = fintechWebviewHeadersInfoProvider;
        this.f14102m = appCoroutineScopes;
        n nVar = n.PUBLICATION;
        this.f14104o = k.a(nVar, new B50.e(this, 2));
        this.f14105p = new LinkedHashSet();
        this.f14106q = k.a(nVar, new Function0() { // from class: J50.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.this.new a();
            }
        });
        this.f14107r = O0.a(new ScreenState.Progress(100L, null, 2, null));
        this.f14108s = O0.a(new I50.d("about:blank", "", false));
    }

    public static FeatureValue k0(f fVar) {
        return fVar.f14098i.q(S90.c.MOB_WEBVIEW_WHITELIST).b();
    }

    public static final /* synthetic */ void l0(f fVar, LinkedHashSet linkedHashSet, String str) {
        fVar.getClass();
        q0(linkedHashSet, str);
    }

    private static void q0(LinkedHashSet linkedHashSet, String str) {
        Pattern[] elements = {Pattern.compile(".*\\.ozon\\.ru(.*|$)"), Pattern.compile(".*\\.ozonru\\.me(.*|$)")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        boolean z11 = true;
        if (!(j02 instanceof Collection) || !j02.isEmpty()) {
            Iterator it = j02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Pattern) it.next()).matcher(str).matches()) {
                    z11 = false;
                    break;
                }
            }
        }
        L80.a.a("CbottomWebViewDialogViewModel", "filtering: " + z11 + " url: " + str);
        if (z11) {
            linkedHashSet.add(str);
        }
    }

    public final void A0() {
        String str;
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String uuid = getUuid();
        companion.getClass();
        String a11 = ActionResult2.Companion.a(uuid);
        Cbottom2WebViewDTO cbottom2WebViewDTO = this.f14103n;
        if (cbottom2WebViewDTO == null || (str = cbottom2WebViewDTO.getId()) == null) {
            str = "";
        }
        this.f14094e.c(C10837a.a(new ActionResult2UI(str, null, ActionResult2UI.Type.SHARE_FIRE_ERROR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null)), a11);
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f14093d.L(id2);
    }

    @Override // G40.a
    public final Cbottom2WebViewDTO f0() {
        return this.f14103n;
    }

    @Override // G40.a
    public final void g0() {
        this.f14100k.a(i0());
        super.g0();
    }

    @NotNull
    public final x0<ScreenState> getScreenStateFlow() {
        return this.f14107r;
    }

    @Override // G40.a
    protected final void handleState() {
        Cbottom2WebViewDTO cbottom2WebViewDTO = this.f14103n;
        String url = cbottom2WebViewDTO != null ? cbottom2WebViewDTO.getUrl() : null;
        if (url == null) {
            url = "";
        }
        x0<I50.d> x0Var = this.f14108s;
        Cbottom2WebViewDTO cbottom2WebViewDTO2 = this.f14103n;
        String title = cbottom2WebViewDTO2 != null ? cbottom2WebViewDTO2.getTitle() : null;
        String str = title != null ? title : "";
        Cbottom2WebViewDTO cbottom2WebViewDTO3 = this.f14103n;
        x0Var.setValue(new I50.d(url, str, cbottom2WebViewDTO3 != null ? cbottom2WebViewDTO3.isClean() : false));
        q0(this.f14105p, url);
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String id2;
        Cbottom2WebViewDTO cbottom2WebViewDTO = this.f14103n;
        return (cbottom2WebViewDTO == null || (id2 = cbottom2WebViewDTO.getId()) == null) ? "" : id2;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2WebViewDTO)) {
            this.f14103n = (Cbottom2WebViewDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f14103n = (Cbottom2WebViewDTO) this.f14096g.d(str);
        }
        handleState();
    }

    public final void p0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f14103n != null) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String uuid = getUuid();
            companion.getClass();
            String a11 = ActionResult2.Companion.a(uuid);
            this.f14094e.c(C10837a.a(new ActionResult2UI(i0(), null, ActionResult2UI.Type.NAVIGATE, null, null, url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097112, null)), a11);
        }
    }

    public final void r0() {
        String str;
        if (this.f14103n != null) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String uuid = getUuid();
            companion.getClass();
            String a11 = ActionResult2.Companion.a(uuid);
            Cbottom2WebViewDTO cbottom2WebViewDTO = this.f14103n;
            if (cbottom2WebViewDTO == null || (str = cbottom2WebViewDTO.getId()) == null) {
                str = "";
            }
            this.f14094e.c(C10837a.a(new ActionResult2UI(str, null, ActionResult2UI.Type.BACK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null)), a11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final R80.b s0(@NotNull String url) {
        R80.b bVar;
        R80.b bVar2;
        int hashCode;
        Intrinsics.checkNotNullParameter(url, "url");
        ?? r02 = this.f14104o;
        if (!((FeatureValue) r02.getValue()).isEnabled()) {
            return new R80.b(Uri.EMPTY, true);
        }
        R80.b i11 = R80.c.i(url);
        Uri d11 = i11.d();
        String str = null;
        String scheme = d11 != null ? d11.getScheme() : null;
        if (scheme == null || ((hashCode = scheme.hashCode()) == 3213448 ? !scheme.equals("http") : !(hashCode == 99617003 && scheme.equals("https")))) {
            Uri d12 = i11.d();
            if (d12 != null) {
                str = d12.getAuthority();
            }
        } else {
            Uri d13 = i11.d();
            if (d13 != null) {
                str = d13.getHost();
            }
        }
        if (str == null) {
            bVar2 = R80.b.f24792e;
            return bVar2;
        }
        List<String> stringArrayData = ((FeatureValue) r02.getValue()).getStringArrayData();
        if (stringArrayData != null) {
            List<String> list = stringArrayData;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (h.t(str, (String) it.next(), false)) {
                        return i11;
                    }
                }
            }
        }
        bVar = R80.b.f24792e;
        return bVar;
    }

    @NotNull
    public final R30.a t0() {
        return this.f14102m;
    }

    @NotNull
    public final Map<String, String> u0(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        I50.d value = this.f14108s.getValue();
        if (value == null || (str = value.c()) == null) {
            str = "";
        }
        return this.f14101l.a(context, str, null).c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final WebViewClient v0() {
        return (WebViewClient) this.f14106q.getValue();
    }

    @NotNull
    public final x0<I50.d> w0() {
        return this.f14108s;
    }

    @NotNull
    public final LinkedHashSet x0() {
        return this.f14105p;
    }

    public final boolean y0() {
        return this.f14095f.isStandAloneIntegration();
    }

    public final void z0() {
        String id2;
        Cbottom2WebViewDTO cbottom2WebViewDTO = this.f14103n;
        if (cbottom2WebViewDTO == null || (id2 = cbottom2WebViewDTO.getId()) == null) {
            return;
        }
        h0(id2);
    }

    public static final class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14109a;

        a() {
        }

        private final boolean a(final String str) {
            boolean z11;
            final f fVar = f.this;
            fVar.p0(str);
            R80.b s02 = fVar.s0(str);
            boolean z12 = !s02.e();
            if (s02.e()) {
                String[] elements = {"http", "https"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (R80.c.k(s02, C7705l.j0(elements)).e()) {
                    Uri d11 = s02.d();
                    if (d11 != null) {
                        S80.b bVar = fVar.f14097h;
                        String uri = d11.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                        bVar.m(uri);
                    }
                    z11 = true;
                    z12 = true;
                    if (z12 && !z11) {
                        this.f14109a = true;
                        fVar.getScreenStateFlow().setValue(ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new Function0() { // from class: J50.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                f fVar2 = f.this;
                                fVar2.getScreenStateFlow().setValue(new ScreenState.Progress(100L, null, 2, null));
                                x0<I50.d> w02 = fVar2.w0();
                                I50.d value = fVar2.w0().getValue();
                                w02.setValue(value != null ? I50.d.a(value, str) : null);
                                return Unit.f71690a;
                            }
                        }, fVar.f14099j, null, 4, null));
                    }
                    L80.a.a("CbottomWebViewDialogViewModel", "isNotAllowedUrl: " + z12 + " checkUrl(" + str + ")");
                    return z12;
                }
            }
            z11 = false;
            if (z12) {
                this.f14109a = true;
                fVar.getScreenStateFlow().setValue(ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new Function0() { // from class: J50.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        f fVar2 = f.this;
                        fVar2.getScreenStateFlow().setValue(new ScreenState.Progress(100L, null, 2, null));
                        x0<I50.d> w02 = fVar2.w0();
                        I50.d value = fVar2.w0().getValue();
                        w02.setValue(value != null ? I50.d.a(value, str) : null);
                        return Unit.f71690a;
                    }
                }, fVar.f14099j, null, 4, null));
            }
            L80.a.a("CbottomWebViewDialogViewModel", "isNotAllowedUrl: " + z12 + " checkUrl(" + str + ")");
            return z12;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (this.f14109a) {
                return;
            }
            f.this.getScreenStateFlow().setValue(null);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            f fVar = f.this;
            f.l0(fVar, fVar.x0(), valueOf);
            return a(valueOf);
        }

        @Override // android.webkit.WebViewClient
        @InterfaceC3999a
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return false;
            }
            f fVar = f.this;
            f.l0(fVar, fVar.x0(), str);
            return a(str);
        }
    }
}
