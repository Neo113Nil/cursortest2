package Ab0;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    public static final C0020a Companion;
    public static final a OZONRUCN_ME;
    public static final a OZONRU_CN;
    public static final a OZONRU_ME;
    public static final a OZON_RU;

    @NotNull
    private static final a defaultProd;

    @NotNull
    private static final a defaultStage;

    @NotNull
    private final String apiDomain;

    @NotNull
    private final String apiUrl;
    private final boolean isStaging;

    @NotNull
    private final String url;

    @NotNull
    private final String value;

    @NotNull
    private final String webDomain;

    @NotNull
    private final String xapiDomain;

    /* renamed from: Ab0.a$a, reason: collision with other inner class name */
    public static final class C0020a {
    }

    static {
        a aVar = new a("OZON_RU", 0, "ozon.ru", false);
        OZON_RU = aVar;
        a aVar2 = new a("OZONRU_CN", 1, "ozonru.cn", false);
        OZONRU_CN = aVar2;
        a aVar3 = new a("OZONRU_ME", 2, "ozonru.me", true);
        OZONRU_ME = aVar3;
        a aVar4 = new a("OZONRUCN_ME", 3, "ozonrucn.me", true);
        OZONRUCN_ME = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = b.a(aVarArr);
        Companion = new C0020a();
        defaultProd = aVar;
        defaultStage = aVar3;
    }

    private a(String str, int i11, String str2, boolean z11) {
        this.value = str2;
        this.isStaging = z11;
        String concat = (z11 ? "api-stg." : "api.").concat(str2);
        this.apiDomain = concat;
        this.xapiDomain = (z11 ? "xapi-stg." : "xapi.").concat(str2);
        this.webDomain = (z11 ? "ozon-stg." : "www.").concat(str2);
        this.apiUrl = Nk.a.b("https://", concat);
        this.url = "https://".concat(str2);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.isStaging;
    }
}
