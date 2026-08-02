package Fb0;

import B0.A0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final e OZONRUCN_ME;
    public static final e OZONRU_CN;
    public static final e OZONRU_ME;
    public static final e OZON_RU;

    @NotNull
    private static final e defaultProd;

    @NotNull
    private static final e defaultStage;

    @NotNull
    private final String apiDomain;

    @NotNull
    private final String apiUrl;
    private final boolean isStaging;

    @NotNull
    private final String ssoDomain;

    @NotNull
    private final String ssoUrl;

    @NotNull
    private final String ssoUrlApi;

    @NotNull
    private final String url;

    @NotNull
    private final String value;

    @NotNull
    private final String webDomain;

    @NotNull
    private final String xapiDomain;

    public static final class a {
    }

    static {
        e eVar = new e("OZON_RU", 0, "ozon.ru", false);
        OZON_RU = eVar;
        e eVar2 = new e("OZONRU_CN", 1, "ozonru.cn", false);
        OZONRU_CN = eVar2;
        e eVar3 = new e("OZONRU_ME", 2, "ozonru.me", true);
        OZONRU_ME = eVar3;
        e eVar4 = new e("OZONRUCN_ME", 3, "ozonrucn.me", true);
        OZONRUCN_ME = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
        Companion = new a();
        defaultProd = eVar;
        defaultStage = eVar3;
    }

    private e(String str, int i11, String str2, boolean z11) {
        this.value = str2;
        this.isStaging = z11;
        String concat = (z11 ? "api.stg." : "api.").concat(str2);
        this.apiDomain = concat;
        this.xapiDomain = (z11 ? "xapi-stg." : "xapi.").concat(str2);
        this.webDomain = (z11 ? "ozon-stg." : "www.").concat(str2);
        String concat2 = (z11 ? "sso.stg." : "sso.").concat(str2);
        this.ssoDomain = concat2;
        this.apiUrl = Nk.a.b("https://", concat);
        this.ssoUrlApi = A0.b("https://", concat2, "/api/");
        this.ssoUrl = Nk.a.b("https://", concat2);
        this.url = "https://".concat(str2);
    }

    @NotNull
    public static Xc.a<e> f() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final String d() {
        return this.apiDomain;
    }

    @NotNull
    public final String e() {
        return this.apiUrl;
    }

    @NotNull
    public final String g() {
        return this.ssoUrl;
    }

    @NotNull
    public final String h() {
        return this.ssoUrlApi;
    }

    @NotNull
    public final String i() {
        return this.url;
    }

    @NotNull
    public final String j() {
        return this.value;
    }

    @NotNull
    public final String l() {
        return this.webDomain;
    }

    @NotNull
    public final String m() {
        return this.xapiDomain;
    }

    public final boolean n() {
        return this.isStaging;
    }
}
