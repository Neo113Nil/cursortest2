package z0;

/* loaded from: classes.dex */
public final class h extends AbstractC1258a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10666b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10667c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10668d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10669e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10670g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10671h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10672i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10673j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10674k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10675l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f10665a = num;
        this.f10666b = str;
        this.f10667c = str2;
        this.f10668d = str3;
        this.f10669e = str4;
        this.f = str5;
        this.f10670g = str6;
        this.f10671h = str7;
        this.f10672i = str8;
        this.f10673j = str9;
        this.f10674k = str10;
        this.f10675l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1258a) {
            AbstractC1258a abstractC1258a = (AbstractC1258a) obj;
            Integer num = this.f10665a;
            if (num != null ? num.equals(((h) abstractC1258a).f10665a) : ((h) abstractC1258a).f10665a == null) {
                String str = this.f10666b;
                if (str != null ? str.equals(((h) abstractC1258a).f10666b) : ((h) abstractC1258a).f10666b == null) {
                    String str2 = this.f10667c;
                    if (str2 != null ? str2.equals(((h) abstractC1258a).f10667c) : ((h) abstractC1258a).f10667c == null) {
                        String str3 = this.f10668d;
                        if (str3 != null ? str3.equals(((h) abstractC1258a).f10668d) : ((h) abstractC1258a).f10668d == null) {
                            String str4 = this.f10669e;
                            if (str4 != null ? str4.equals(((h) abstractC1258a).f10669e) : ((h) abstractC1258a).f10669e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((h) abstractC1258a).f) : ((h) abstractC1258a).f == null) {
                                    String str6 = this.f10670g;
                                    if (str6 != null ? str6.equals(((h) abstractC1258a).f10670g) : ((h) abstractC1258a).f10670g == null) {
                                        String str7 = this.f10671h;
                                        if (str7 != null ? str7.equals(((h) abstractC1258a).f10671h) : ((h) abstractC1258a).f10671h == null) {
                                            String str8 = this.f10672i;
                                            if (str8 != null ? str8.equals(((h) abstractC1258a).f10672i) : ((h) abstractC1258a).f10672i == null) {
                                                String str9 = this.f10673j;
                                                if (str9 != null ? str9.equals(((h) abstractC1258a).f10673j) : ((h) abstractC1258a).f10673j == null) {
                                                    String str10 = this.f10674k;
                                                    if (str10 != null ? str10.equals(((h) abstractC1258a).f10674k) : ((h) abstractC1258a).f10674k == null) {
                                                        String str11 = this.f10675l;
                                                        if (str11 != null ? str11.equals(((h) abstractC1258a).f10675l) : ((h) abstractC1258a).f10675l == null) {
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
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f10665a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f10666b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10667c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10668d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f10669e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f10670g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f10671h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f10672i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f10673j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f10674k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f10675l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f10665a);
        sb.append(", model=");
        sb.append(this.f10666b);
        sb.append(", hardware=");
        sb.append(this.f10667c);
        sb.append(", device=");
        sb.append(this.f10668d);
        sb.append(", product=");
        sb.append(this.f10669e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.f10670g);
        sb.append(", fingerprint=");
        sb.append(this.f10671h);
        sb.append(", locale=");
        sb.append(this.f10672i);
        sb.append(", country=");
        sb.append(this.f10673j);
        sb.append(", mccMnc=");
        sb.append(this.f10674k);
        sb.append(", applicationBuild=");
        return B0.c.l(sb, this.f10675l, "}");
    }
}
