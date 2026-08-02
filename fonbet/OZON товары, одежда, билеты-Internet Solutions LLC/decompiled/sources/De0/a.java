package De0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f6656a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6657b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6658c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6659d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f6660e;

    /* renamed from: f, reason: collision with root package name */
    private final Double f6661f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f6662g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6663h;

    /* renamed from: i, reason: collision with root package name */
    private final String f6664i;

    /* renamed from: j, reason: collision with root package name */
    private final String f6665j;

    /* renamed from: k, reason: collision with root package name */
    private final String f6666k;

    /* renamed from: l, reason: collision with root package name */
    private final String f6667l;

    /* renamed from: m, reason: collision with root package name */
    private final String f6668m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6669n;

    /* renamed from: o, reason: collision with root package name */
    private final String f6670o;

    /* renamed from: p, reason: collision with root package name */
    private final String f6671p;

    /* renamed from: q, reason: collision with root package name */
    private final GeoProviderConfig.ProviderSuggest f6672q;

    /* renamed from: r, reason: collision with root package name */
    private final String f6673r;

    /* renamed from: s, reason: collision with root package name */
    private final String f6674s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final String f6675t;

    public a(int i11, String str, String str2, String str3, Double d11, Double d12, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, GeoProviderConfig.ProviderSuggest providerSuggest, String str13, String str14, @NotNull String sdkType) {
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.f6656a = i11;
        this.f6657b = str;
        this.f6658c = str2;
        this.f6659d = str3;
        this.f6660e = d11;
        this.f6661f = d12;
        this.f6662g = num;
        this.f6663h = str4;
        this.f6664i = str5;
        this.f6665j = str6;
        this.f6666k = str7;
        this.f6667l = str8;
        this.f6668m = str9;
        this.f6669n = str10;
        this.f6670o = str11;
        this.f6671p = str12;
        this.f6672q = providerSuggest;
        this.f6673r = str13;
        this.f6674s = str14;
        this.f6675t = sdkType;
    }

    public final String a() {
        return this.f6669n;
    }

    public final String b() {
        return this.f6670o;
    }

    public final String c() {
        return this.f6671p;
    }

    public final String d() {
        return this.f6667l;
    }

    public final int e() {
        return this.f6656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6656a == aVar.f6656a && Intrinsics.d(this.f6657b, aVar.f6657b) && Intrinsics.d(this.f6658c, aVar.f6658c) && Intrinsics.d(this.f6659d, aVar.f6659d) && Intrinsics.d(this.f6660e, aVar.f6660e) && Intrinsics.d(this.f6661f, aVar.f6661f) && Intrinsics.d(this.f6662g, aVar.f6662g) && Intrinsics.d(this.f6663h, aVar.f6663h) && Intrinsics.d(this.f6664i, aVar.f6664i) && Intrinsics.d(this.f6665j, aVar.f6665j) && Intrinsics.d(this.f6666k, aVar.f6666k) && Intrinsics.d(this.f6667l, aVar.f6667l) && Intrinsics.d(this.f6668m, aVar.f6668m) && Intrinsics.d(this.f6669n, aVar.f6669n) && Intrinsics.d(this.f6670o, aVar.f6670o) && Intrinsics.d(this.f6671p, aVar.f6671p) && this.f6672q == aVar.f6672q && Intrinsics.d(this.f6673r, aVar.f6673r) && Intrinsics.d(this.f6674s, aVar.f6674s) && Intrinsics.d(this.f6675t, aVar.f6675t);
    }

    public final String f() {
        return this.f6664i;
    }

    public final String g() {
        return this.f6674s;
    }

    public final String h() {
        return this.f6658c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f6656a) * 31;
        String str = this.f6657b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6658c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6659d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d11 = this.f6660e;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f6661f;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num = this.f6662g;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f6663h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f6664i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f6665j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f6666k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f6667l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f6668m;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f6669n;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f6670o;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f6671p;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        GeoProviderConfig.ProviderSuggest providerSuggest = this.f6672q;
        int hashCode17 = (hashCode16 + (providerSuggest == null ? 0 : providerSuggest.hashCode())) * 31;
        String str13 = this.f6673r;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f6674s;
        return this.f6675t.hashCode() + ((hashCode18 + (str14 != null ? str14.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f6659d;
    }

    public final Double j() {
        return this.f6660e;
    }

    public final Double k() {
        return this.f6661f;
    }

    public final String l() {
        return this.f6665j;
    }

    public final String m() {
        return this.f6657b;
    }

    public final String n() {
        return this.f6668m;
    }

    @NotNull
    public final String o() {
        return this.f6675t;
    }

    public final GeoProviderConfig.ProviderSuggest p() {
        return this.f6672q;
    }

    public final String q() {
        return this.f6666k;
    }

    public final String r() {
        return this.f6673r;
    }

    public final Integer s() {
        return this.f6662g;
    }

    public final String t() {
        return this.f6663h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CachedProvider(id=");
        sb2.append(this.f6656a);
        sb2.append(", name=");
        sb2.append(this.f6657b);
        sb2.append(", logo=");
        sb2.append(this.f6658c);
        sb2.append(", logoMobile=");
        sb2.append(this.f6659d);
        sb2.append(", maxZoom=");
        sb2.append(this.f6660e);
        sb2.append(", minZoom=");
        sb2.append(this.f6661f);
        sb2.append(", tileSize=");
        sb2.append(this.f6662g);
        sb2.append(", tileUrl=");
        sb2.append(this.f6663h);
        sb2.append(", key=");
        sb2.append(this.f6664i);
        sb2.append(", mode=");
        sb2.append(this.f6665j);
        sb2.append(", suggestPreferredProvider=");
        sb2.append(this.f6666k);
        sb2.append(", geocodePreferredProvider=");
        sb2.append(this.f6667l);
        sb2.append(", revGeocodePreferredProvider=");
        sb2.append(this.f6668m);
        sb2.append(", allowedLocations=");
        sb2.append(this.f6669n);
        sb2.append(", copyrights=");
        sb2.append(this.f6670o);
        sb2.append(", features=");
        sb2.append(this.f6671p);
        sb2.append(", suggest=");
        sb2.append(this.f6672q);
        sb2.append(", suggestProvider=");
        sb2.append(this.f6673r);
        sb2.append(", locale=");
        sb2.append(this.f6674s);
        sb2.append(", sdkType=");
        return o0.c(sb2, this.f6675t, ")");
    }
}
