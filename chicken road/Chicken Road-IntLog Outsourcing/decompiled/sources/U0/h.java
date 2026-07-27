package U0;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3116c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3117d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3118e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3119f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3120g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3121h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3122i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3123j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3124k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3125l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3114a = num;
        this.f3115b = str;
        this.f3116c = str2;
        this.f3117d = str3;
        this.f3118e = str4;
        this.f3119f = str5;
        this.f3120g = str6;
        this.f3121h = str7;
        this.f3122i = str8;
        this.f3123j = str9;
        this.f3124k = str10;
        this.f3125l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f3114a;
        if (num != null ? num.equals(((h) aVar).f3114a) : ((h) aVar).f3114a == null) {
            String str = this.f3115b;
            if (str != null ? str.equals(((h) aVar).f3115b) : ((h) aVar).f3115b == null) {
                String str2 = this.f3116c;
                if (str2 != null ? str2.equals(((h) aVar).f3116c) : ((h) aVar).f3116c == null) {
                    String str3 = this.f3117d;
                    if (str3 != null ? str3.equals(((h) aVar).f3117d) : ((h) aVar).f3117d == null) {
                        String str4 = this.f3118e;
                        if (str4 != null ? str4.equals(((h) aVar).f3118e) : ((h) aVar).f3118e == null) {
                            String str5 = this.f3119f;
                            if (str5 != null ? str5.equals(((h) aVar).f3119f) : ((h) aVar).f3119f == null) {
                                String str6 = this.f3120g;
                                if (str6 != null ? str6.equals(((h) aVar).f3120g) : ((h) aVar).f3120g == null) {
                                    String str7 = this.f3121h;
                                    if (str7 != null ? str7.equals(((h) aVar).f3121h) : ((h) aVar).f3121h == null) {
                                        String str8 = this.f3122i;
                                        if (str8 != null ? str8.equals(((h) aVar).f3122i) : ((h) aVar).f3122i == null) {
                                            String str9 = this.f3123j;
                                            if (str9 != null ? str9.equals(((h) aVar).f3123j) : ((h) aVar).f3123j == null) {
                                                String str10 = this.f3124k;
                                                if (str10 != null ? str10.equals(((h) aVar).f3124k) : ((h) aVar).f3124k == null) {
                                                    String str11 = this.f3125l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f3125l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f3125l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f3114a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3115b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3116c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3117d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3118e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3119f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3120g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3121h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f3122i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3123j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3124k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3125l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f3114a);
        sb.append(", model=");
        sb.append(this.f3115b);
        sb.append(", hardware=");
        sb.append(this.f3116c);
        sb.append(", device=");
        sb.append(this.f3117d);
        sb.append(", product=");
        sb.append(this.f3118e);
        sb.append(", osBuild=");
        sb.append(this.f3119f);
        sb.append(", manufacturer=");
        sb.append(this.f3120g);
        sb.append(", fingerprint=");
        sb.append(this.f3121h);
        sb.append(", locale=");
        sb.append(this.f3122i);
        sb.append(", country=");
        sb.append(this.f3123j);
        sb.append(", mccMnc=");
        sb.append(this.f3124k);
        sb.append(", applicationBuild=");
        return AbstractC0279e.h(sb, this.f3125l, "}");
    }
}
