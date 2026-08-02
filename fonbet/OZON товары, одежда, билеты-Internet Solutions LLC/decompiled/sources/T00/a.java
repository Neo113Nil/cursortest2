package T00;

import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final a f26425n = new a(null, null, null, null, null, null, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    private final String f26426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26427b;

    /* renamed from: c, reason: collision with root package name */
    private final e f26428c;

    /* renamed from: d, reason: collision with root package name */
    private final k f26429d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26430e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26431f;

    /* renamed from: g, reason: collision with root package name */
    private final b f26432g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f26433h;

    /* renamed from: i, reason: collision with root package name */
    private final c f26434i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, l> f26435j;

    /* renamed from: k, reason: collision with root package name */
    private final String f26436k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final RZ.b f26437l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f26438m;

    public a(String str, String str2, e eVar, k kVar, String str3, String str4, b bVar, Map<String, String> map, c cVar, Map<String, l> map2) {
        this.f26426a = str;
        this.f26427b = str2;
        this.f26428c = eVar;
        this.f26429d = kVar;
        this.f26430e = str3;
        this.f26431f = str4;
        this.f26432g = bVar;
        this.f26433h = map;
        this.f26434i = cVar;
        this.f26435j = map2;
        this.f26436k = (eVar == null || !eVar.k()) ? eVar != null ? eVar.j() : null : eVar.h();
        this.f26437l = new RZ.b(str3, str4, System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(a aVar, e eVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i11) {
        String str = aVar.f26426a;
        String str2 = aVar.f26427b;
        if ((i11 & 4) != 0) {
            eVar = aVar.f26428c;
        }
        e eVar2 = eVar;
        k kVar = aVar.f26429d;
        String str3 = aVar.f26430e;
        String str4 = aVar.f26431f;
        b bVar = aVar.f26432g;
        Map map = linkedHashMap;
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = aVar.f26433h;
        }
        Map map2 = map;
        c cVar = aVar.f26434i;
        Map map3 = linkedHashMap2;
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map3 = aVar.f26435j;
        }
        aVar.getClass();
        return new a(str, str2, eVar2, kVar, str3, str4, bVar, map2, cVar, map3);
    }

    public final String c() {
        return this.f26436k;
    }

    public final Integer d() {
        return this.f26438m;
    }

    public final c e() {
        return this.f26434i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.decode.model.ComposerState");
        a aVar = (a) obj;
        return Intrinsics.d(this.f26426a, aVar.f26426a) && Intrinsics.d(this.f26427b, aVar.f26427b) && Intrinsics.d(this.f26428c, aVar.f26428c) && Intrinsics.d(this.f26430e, aVar.f26430e) && Intrinsics.d(this.f26431f, aVar.f26431f) && Intrinsics.d(this.f26434i, aVar.f26434i) && Intrinsics.d(this.f26429d, aVar.f26429d) && Intrinsics.d(this.f26435j, aVar.f26435j);
    }

    public final String f() {
        return this.f26427b;
    }

    @NotNull
    public final RZ.b g() {
        return this.f26437l;
    }

    public final e h() {
        return this.f26428c;
    }

    public final int hashCode() {
        String str = this.f26426a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26427b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        e eVar = this.f26428c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str3 = this.f26430e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26431f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        c cVar = this.f26434i;
        int hashCode6 = (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        k kVar = this.f26429d;
        int hashCode7 = (hashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Map<String, l> map = this.f26435j;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final Integer i() {
        if (this.f26438m != null) {
            return Integer.valueOf(r0.intValue() - 1);
        }
        return null;
    }

    public final String j() {
        return this.f26430e;
    }

    public final k k() {
        return this.f26429d;
    }

    public final Map<String, String> l() {
        return this.f26433h;
    }

    public final Map<String, l> m() {
        return this.f26435j;
    }

    public final String n() {
        return this.f26431f;
    }

    public final void o(Integer num) {
        this.f26438m = num;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerState(prevPage=");
        sb2.append(this.f26426a);
        sb2.append(", nextPage=");
        sb2.append(this.f26427b);
        sb2.append(", pageInfo=");
        sb2.append(this.f26428c);
        sb2.append(", shared=");
        sb2.append(this.f26429d);
        sb2.append(", pageToken=");
        sb2.append(this.f26430e);
        sb2.append(", userToken=");
        sb2.append(this.f26431f);
        sb2.append(", experiments=");
        sb2.append(this.f26432g);
        sb2.append(", trackingPayloads=");
        sb2.append(this.f26433h);
        sb2.append(", layoutTrackingInfo=");
        sb2.append(this.f26434i);
        sb2.append(", trackingTokenAliases=");
        return P.f(sb2, this.f26435j, ")");
    }
}
