package aZ;

import hZ.C6894a;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* renamed from: aZ.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4986d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C6894a f36523a;

    static {
        Boolean bool = Boolean.TRUE;
        C6894a.C1059a c1059a = new C6894a.C1059a("cdn1.ozone.ru", "ir.ozone.ru", "io.ozone.ru", bool);
        C6894a.C1059a c1059a2 = new C6894a.C1059a("ir.ozone.ru", "ir.ozone.ru", "io.ozone.ru", bool);
        C6894a.C1059a c1059a3 = new C6894a.C1059a("dn1.ozone.ru", "ir.ozone.ru", "io.ozone.ru", bool);
        C6894a.C1059a c1059a4 = new C6894a.C1059a("cdn1.ozonusercontent.com", "cdn1.ozonusercontent.com", null, bool);
        C6894a.C1059a c1059a5 = new C6894a.C1059a("cdn-stg.ozonru.me", null, null, bool);
        Boolean bool2 = Boolean.FALSE;
        f36523a = new C6894a(C7714v.b0(c1059a, c1059a2, c1059a3, c1059a4, c1059a5, new C6894a.C1059a("api.ozon.ru", null, null, bool2), new C6894a.C1059a("st.ozone.ru", null, null, bool2), new C6894a.C1059a("content.24ttl.stream", null, null, bool2), new C6894a.C1059a("img.youtube.com", null, null, bool2), new C6894a.C1059a("uniapi.ozon.travel", null, null, bool2), new C6894a.C1059a("mmedia.ozone.ru", null, null, bool), new C6894a.C1059a("giphy.com", null, null, bool2), new C6894a.C1059a("finance.ozon.ru", null, null, bool2), new C6894a.C1059a("bank.ozon.ru", null, null, bool2), new C6894a.C1059a("*.ozone.ru", null, null, bool), new C6894a.C1059a("*.ozonusercontent.com", null, null, bool)), C7714v.b0(new C6894a.d("v.ozone.ru", "vp-1.ozone.ru", "pdp"), new C6894a.d("v.ozone.ru", "vr-1.ozone.ru", "review"), new C6894a.d("v.ozone.ru", "vt-1.ozone.ru", "tile"), new C6894a.d("v.ozone.ru", "v-1.ozone.ru", null), new C6894a.d("cdnvideo.v.ozone.ru", "v-1.ozone.ru", null)), C7714v.b0(new C6894a.b("https://ir.ozone.ru/warmupImage.png"), new C6894a.b("https://io.ozone.ru/warmupImage.png"), new C6894a.b("https://cdn1.ozonusercontent.com/warmupImage.png")), null);
    }

    @NotNull
    public static final C6894a a() {
        return f36523a;
    }
}
