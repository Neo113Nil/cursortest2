package Bf0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.c;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import vf0.C10315a;
import za0.InterfaceC11014a;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbToolLibsApi f3704a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC11014a f3705b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<C10315a> f3706c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<C10315a> f3707d;

    /* renamed from: Bf0.a$a, reason: collision with other inner class name */
    static final class C0098a extends AbstractC7737t implements Function0<Unit> {
        C0098a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.c();
            return Unit.f71690a;
        }
    }

    public a(@NotNull AbToolLibsApi abToolLibsApi, @NotNull InterfaceC11014a hostConfigBaseApi) {
        Intrinsics.checkNotNullParameter(abToolLibsApi, "abToolLibsApi");
        Intrinsics.checkNotNullParameter(hostConfigBaseApi, "hostConfigBaseApi");
        this.f3704a = abToolLibsApi;
        this.f3705b = hostConfigBaseApi;
        Intrinsics.checkNotNullParameter("", "whiteDomain");
        Intrinsics.checkNotNullParameter("google.com", "grayDomain");
        x0<C10315a> a11 = O0.a(new C10315a("", false, "google.com", 120, false, true, false, K.f71697a, c.b.f82072b, 0, false, false));
        this.f3706c = a11;
        this.f3707d = C2399j.b(a11);
        c();
        abToolLibsApi.addOnChangeFeaturesListener(AbToolNamespace.PLATFORM_MOBILE, new C0098a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        List list;
        AbToolNamespace abToolNamespace = AbToolNamespace.PLATFORM_MOBILE;
        AbToolLibsApi abToolLibsApi = this.f3704a;
        String string = abToolLibsApi.getString("on_whitelisting_white_domain", "ozon_network", abToolNamespace);
        if (string.length() == 0) {
            string = this.f3705b.a();
        }
        String whiteDomain = string;
        boolean z11 = abToolLibsApi.getBoolean("on_whitelisting_enabled_android", "ozon_network", abToolNamespace);
        String string2 = abToolLibsApi.getString("on_whitelisting_gray_domain", "ozon_network", abToolNamespace);
        if (string2.length() == 0) {
            string2 = "google.com";
        }
        String grayDomain = string2;
        int i11 = abToolLibsApi.getInt("on_whitelisting_ping_interval_sec", "ozon_network", abToolNamespace);
        Integer valueOf = Integer.valueOf(i11);
        if (i11 == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 120;
        boolean z12 = abToolLibsApi.getBoolean("on_whitelisting_analytics_enabled", "ozon_network", abToolNamespace);
        boolean z13 = abToolLibsApi.getBoolean("on_is_only_cellular_network_mode", "ozon_network", abToolNamespace);
        boolean z14 = abToolLibsApi.getBoolean("on_whitelisting_is_force_ping_enabled", "ozon_network", abToolNamespace);
        String string3 = abToolLibsApi.getString("on_whitelisting_ping_protocol", "ozon_network", abToolNamespace);
        Intrinsics.checkNotNullParameter(string3, "<this>");
        String lowerCase = string3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        qf0.c pingProtocol = Intrinsics.d(lowerCase, "https") ? c.b.f82072b : Intrinsics.d(lowerCase, "http") ? c.a.f82070b : c.AbstractC1391c.f82074b;
        String string4 = abToolLibsApi.getString("on_whitelisting_ping_extra_domains", "ozon_network", abToolNamespace);
        String str = kotlin.text.h.K(string4) ? null : string4;
        if (str == null || (list = kotlin.text.h.m(str, new String[]{","}, 0, 6)) == null) {
            list = K.f71697a;
        }
        List pingExtraDomains = list;
        int i12 = abToolLibsApi.getInt("on_whitelisting_ping_extra_domains_on_app_start_delay_ms", "ozon_network", abToolNamespace);
        boolean z15 = abToolLibsApi.getBoolean("on_whitelisting_gray_domain_analytic_enabled", "ozon_network", abToolNamespace);
        boolean z16 = abToolLibsApi.getBoolean("on_whitelisting_white_domain_analytic_enabled", "ozon_network", abToolNamespace);
        while (true) {
            x0<C10315a> x0Var = this.f3706c;
            C10315a value = x0Var.getValue();
            value.getClass();
            Intrinsics.checkNotNullParameter(whiteDomain, "whiteDomain");
            Intrinsics.checkNotNullParameter(grayDomain, "grayDomain");
            Intrinsics.checkNotNullParameter(pingExtraDomains, "pingExtraDomains");
            Intrinsics.checkNotNullParameter(pingProtocol, "pingProtocol");
            boolean z17 = z12;
            if (x0Var.b(value, new C10315a(whiteDomain, z11, grayDomain, intValue, z17, z13, z14, pingExtraDomains, pingProtocol, i12, z15, z16))) {
                return;
            } else {
                z12 = z17;
            }
        }
    }

    @NotNull
    public final M0<C10315a> b() {
        return this.f3707d;
    }
}
