package R80;

import H30.x;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.W2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes7.dex */
public final class g implements T80.a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile g f24803e;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Pattern f24805g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Pattern f24806h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Pattern f24807i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Pattern f24808j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final Pattern f24809k;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExternalFintechSettings f24810a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f24811b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24812c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f24802d = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f24804f = Pattern.compile("^$|/");

    public static final class a {
    }

    /* synthetic */ class b extends C7735q implements Function1<d, R80.b> {
        @Override // kotlin.jvm.functions.Function1
        public final R80.b invoke(d dVar) {
            d p02 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return g.h((g) this.receiver, p02);
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<d, R80.b> {
        @Override // kotlin.jvm.functions.Function1
        public final R80.b invoke(d dVar) {
            d p02 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return g.k((g) this.receiver, p02);
        }
    }

    static {
        Pattern compile = Pattern.compile(W2.DEFAULT_PROPAGATION_TARGETS);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        f24805g = compile;
        Pattern compile2 = Pattern.compile("^/agreement/?$");
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        f24806h = compile2;
        Pattern compile3 = Pattern.compile("^/confirmation/?$");
        Intrinsics.checkNotNullExpressionValue(compile3, "compile(...)");
        f24807i = compile3;
        Pattern compile4 = Pattern.compile("^/tokenIntent/.*$");
        Intrinsics.checkNotNullExpressionValue(compile4, "compile(...)");
        f24808j = compile4;
        Pattern compile5 = Pattern.compile("/links/mob/nspkcamera");
        Intrinsics.checkNotNullExpressionValue(compile5, "compile(...)");
        f24809k = compile5;
    }

    public g(@NotNull ExternalFintechSettings fintechSettings, S80.a aVar, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f24810a = fintechSettings;
        this.f24811b = sharedPreferences;
        this.f24812c = fintechSettings.isQa();
    }

    public static R80.b b(g gVar, R80.b doIfValid) {
        Intrinsics.checkNotNullParameter(doIfValid, "$this$doIfValid");
        String bankUrl = gVar.f24810a.getBankUrl(gVar.f24811b);
        String str = doIfValid.c().get("id");
        if (str == null) {
            str = "";
        }
        return R80.b.b(doIfValid, false, Uri.parse(bankUrl + "/me2me/" + str), null, null, 29);
    }

    public static R80.b c(g gVar, R80.b doIfValid) {
        Intrinsics.checkNotNullParameter(doIfValid, "$this$doIfValid");
        return R80.b.b(doIfValid, false, Uri.parse(gVar.f24810a.getBankUrl(gVar.f24811b) + "/sbpRules"), null, null, 29);
    }

    public static R80.b d(g gVar, R80.b doIfValid) {
        Intrinsics.checkNotNullParameter(doIfValid, "$this$doIfValid");
        String X9 = kotlin.text.h.X(kotlin.text.h.X(String.valueOf(doIfValid.d()), "tel:", "", false), "+", "", false);
        return R80.b.b(doIfValid, false, Uri.parse(gVar.f24810a.getBankUrl(gVar.f24811b) + "/m/lk/payments?pn=" + X9), null, null, 29);
    }

    public static final R80.b g(g gVar, d dVar) {
        gVar.getClass();
        R80.b e11 = R80.c.e(R80.c.d(R80.c.b(R80.c.g(R80.c.i(dVar.b()), "ozon"), "payment"), ImagesContract.URL), "cancelLink");
        if (!e11.e()) {
            return e11;
        }
        String str = e11.c().get(ImagesContract.URL);
        if (str == null) {
            str = "";
        }
        R80.b f7 = R80.c.f(R80.c.j(R80.c.h(R80.c.i(str), dVar.d()), dVar.c()), f24805g);
        Intrinsics.checkNotNullParameter(f7, "<this>");
        return f7;
    }

    public static final R80.b h(g gVar, d dVar) {
        gVar.getClass();
        R80.b d11 = R80.c.d(R80.c.b(R80.c.g(R80.c.i(dVar.b()), "ozon"), "web"), ImagesContract.URL);
        if (!d11.e()) {
            return d11;
        }
        String str = d11.c().get(ImagesContract.URL);
        if (str == null) {
            str = "";
        }
        d a11 = d.a(dVar, str);
        return R80.c.f(R80.c.j(R80.c.h(R80.c.i(a11.b()), a11.d()), a11.c()), f24805g);
    }

    public static final R80.b i(g gVar, d dVar) {
        String b11;
        gVar.getClass();
        R80.b z11 = z(dVar.b(), dVar.d());
        if (z11.e()) {
            b11 = z11.c().get(ImagesContract.URL);
            if (b11 == null) {
                b11 = "";
            }
        } else {
            b11 = dVar.b();
        }
        return R80.c.f(R80.c.j(R80.c.h(R80.c.i(b11), dVar.d()), dVar.c()), f24805g);
    }

    public static final R80.b k(g gVar, d dVar) {
        gVar.getClass();
        return R80.c.f(R80.c.j(R80.c.h(R80.c.i(dVar.b()), dVar.d()), dVar.c()), f24805g);
    }

    public static final R80.b m(final g gVar, d dVar) {
        gVar.getClass();
        return R80.c.a(R80.c.g(R80.c.i(dVar.b()), "tel"), new Function1() { // from class: R80.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.d(g.this, (b) obj);
            }
        });
    }

    public static final R80.b n(final g gVar, d dVar) {
        String b11;
        gVar.getClass();
        R80.b z11 = z(dVar.b(), dVar.d());
        if (z11.e()) {
            b11 = z11.c().get(ImagesContract.URL);
            if (b11 == null) {
                b11 = "";
            }
        } else {
            b11 = dVar.b();
        }
        return R80.c.a(R80.c.f(R80.c.b(R80.c.g(R80.c.i(b11), "bank100000000273"), "sbp.nspk.ru"), f24806h), new Function1() { // from class: R80.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.c(g.this, (b) obj);
            }
        });
    }

    public static final R80.b q(g gVar, d dVar) {
        String b11;
        gVar.getClass();
        R80.b z11 = z(dVar.b(), dVar.d());
        if (z11.e()) {
            b11 = z11.c().get(ImagesContract.URL);
            if (b11 == null) {
                b11 = "";
            }
        } else {
            b11 = dVar.b();
        }
        return R80.c.a(R80.c.d(R80.c.f(R80.c.b(R80.c.g(R80.c.i(b11), "bank100000000273"), "me2mepull.nspk.ru"), f24807i), "id"), new Fh0.j(gVar, 1));
    }

    private static R80.b s(Set set, d dVar) {
        R80.b bVar = new R80.b(x.e(dVar.b()), false);
        Iterator it = set.iterator();
        while (!bVar.e() && it.hasNext()) {
            R80.b bVar2 = (R80.b) ((Function1) it.next()).invoke(dVar);
            if (bVar2.e()) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static R80.b z(String str, Set set) {
        R80.b b11 = R80.c.b(R80.c.h(R80.c.i(str), e0.f(e0.h("ozon"), set != null ? set : M.f71699a)), "web");
        Pattern EMPTY_PATH = f24804f;
        Intrinsics.checkNotNullExpressionValue(EMPTY_PATH, "EMPTY_PATH");
        return R80.c.e(R80.c.d(R80.c.f(b11, EMPTY_PATH), ImagesContract.URL), "WITH_TOOLBAR");
    }

    @Override // T80.a
    @NotNull
    public final R80.b A(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        kotlin.reflect.h[] elements = {new h(this), new i(this)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        w wVar = w.APVZ;
        return s(j02, new d(deeplink, wVar.b(this.f24812c), wVar.d()));
    }

    @Override // T80.a
    @NotNull
    public final R80.b M0(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        kotlin.reflect.h[] elements = {new j(1, this, g.class, "handleOzonPaymentWebView", "handleOzonPaymentWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new k(1, this, g.class, "handleOzonWebWebView", "handleOzonWebWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new l(1, this, g.class, "handleSbpMe2MePullAgreementWebView", "handleSbpMe2MePullAgreementWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new m(1, this, g.class, "handlePhoneCallAction", "handlePhoneCallAction(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new n(1, this, g.class, "handleSbpayWebView", "handleSbpayWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new o(1, this, g.class, "handleNspkWebView", "handleNspkWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new p(1, this, g.class, "handleQrSber", "handleQrSber(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new q(1, this, g.class, "handleSbpAgreementWebView", "handleSbpAgreementWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new r(1, this, g.class, "handleC2cSbp", "handleC2cSbp(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        w wVar = w.BANK;
        return s(j02, new d(deeplink, wVar.b(this.f24812c), wVar.d()));
    }

    @Override // T80.a
    @NotNull
    public final R80.b O(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        kotlin.reflect.h[] elements = {new b(1, this, g.class, "handleOzonSchemePayActivityWithFintechWebView", "handleOzonSchemePayActivityWithFintechWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new c(1, this, g.class, "handlePayActivityWithFintechWebView", "handlePayActivityWithFintechWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        w wVar = w.CHECKOUT;
        return s(j02, new d(deeplink, wVar.b(this.f24812c), wVar.d()));
    }

    @Override // T80.a
    @NotNull
    public final R80.b a(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        kotlin.reflect.h[] elements = {new s(1, this, g.class, "handleOzonWebWebView", "handleOzonWebWebView(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new t(1, this, g.class, "handlePhoneCallAction", "handlePhoneCallAction(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0), new u(1, this, g.class, "handleB2bSbp", "handleB2bSbp(Lru/ozon/fintech/nav/domain/deeplink/DeeplinkValidatorParams;)Lru/ozon/fintech/nav/domain/deeplink/DeepResult;", 0)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        w wVar = w.RKO;
        return s(j02, new d(deeplink, wVar.b(this.f24812c), wVar.d()));
    }

    @NotNull
    public final R80.b t(@NotNull d params) {
        Uri build;
        Intrinsics.checkNotNullParameter(params, "params");
        R80.b b11 = R80.c.b(R80.c.g(R80.c.i(params.b()), "bankb2b100000000273"), "b2b.cbrpay.ru");
        return (!b11.e() || (build = Uri.parse(this.f24810a.getBankUrl(this.f24811b)).buildUpon().appendPath("business").appendPath("links").appendPath("payment-deeplink").appendQueryParameter("content", params.b()).build()) == null) ? b11 : R80.b.b(b11, false, build, null, null, 29);
    }

    @NotNull
    public final R80.b u(@NotNull d params) {
        Uri build;
        Intrinsics.checkNotNullParameter(params, "params");
        R80.b b11 = R80.c.b(R80.c.g(R80.c.i(params.b()), "bank100000000273"), "c2c.cbrpay.ru");
        return (!b11.e() || (build = Uri.parse(this.f24810a.getBankUrl(this.f24811b)).buildUpon().appendPath("promo").appendPath("payment-deeplink").appendQueryParameter("content", params.b()).build()) == null) ? b11 : R80.b.b(b11, false, build, null, null, 29);
    }

    @NotNull
    public final R80.b v(@NotNull d params) {
        Uri build;
        Intrinsics.checkNotNullParameter(params, "params");
        R80.b i11 = R80.c.i(params.b());
        String[] elements = {"bank100000000273", "https"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        R80.b h11 = R80.c.h(i11, C7705l.j0(elements));
        String[] elements2 = {"sub.nspk.ru", "qr.nspk.ru"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        R80.b c11 = R80.c.c(h11, C7705l.j0(elements2));
        return (!c11.e() || (build = Uri.parse(this.f24810a.getBankUrl(this.f24811b)).buildUpon().appendPath("promo").appendPath("payment-deeplink").appendQueryParameter("content", params.b()).build()) == null) ? c11 : R80.b.b(c11, false, build, null, null, 29);
    }

    @NotNull
    public final R80.b w(@NotNull d params) {
        Uri build;
        Intrinsics.checkNotNullParameter(params, "params");
        R80.b g10 = R80.c.g(R80.c.i(params.b()), "ozonplatiqr");
        return (!g10.e() || (build = Uri.parse(this.f24810a.getBankUrl(this.f24811b)).buildUpon().appendPath("promo").appendPath("payment-deeplink").appendQueryParameter("content", params.b()).build()) == null) ? g10 : R80.b.b(g10, false, build, null, null, 29);
    }

    @NotNull
    public final R80.b x(@NotNull d params) {
        String str;
        Uri build;
        Intrinsics.checkNotNullParameter(params, "params");
        R80.b c11 = R80.c.c(R80.c.h(R80.c.i(params.b()), e0.h("bank100000000273")), e0.h("sbpay"));
        Set patterns = e0.h(f24808j);
        Intrinsics.checkNotNullParameter(c11, "<this>");
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        if (c11.e()) {
            Set set = patterns;
            boolean z11 = false;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pattern pattern = (Pattern) it.next();
                    Uri d11 = c11.d();
                    if (d11 == null || (str = d11.getPath()) == null) {
                        str = "";
                    }
                    if (pattern.matcher(str).matches()) {
                        z11 = true;
                        break;
                    }
                }
            }
            c11 = R80.b.b(c11, z11, null, null, null, 30);
        }
        R80.b bVar = c11;
        return (!bVar.e() || (build = Uri.parse(this.f24810a.getBankUrl(this.f24811b)).buildUpon().appendPath("promo").appendPath("payment-deeplink").appendQueryParameter("content", params.b()).build()) == null) ? bVar : R80.b.b(bVar, false, build, null, null, 29);
    }
}
