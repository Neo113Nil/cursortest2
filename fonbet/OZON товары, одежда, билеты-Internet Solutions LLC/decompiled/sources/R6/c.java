package R6;

import C.o0;
import R6.a;

/* loaded from: classes9.dex */
final class c extends R6.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f24683a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24684b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24685c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24686d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24687e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24688f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24689g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24690h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24691i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24692j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24693k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24694l;

    static final class a extends a.AbstractC0490a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f24695a;

        /* renamed from: b, reason: collision with root package name */
        private String f24696b;

        /* renamed from: c, reason: collision with root package name */
        private String f24697c;

        /* renamed from: d, reason: collision with root package name */
        private String f24698d;

        /* renamed from: e, reason: collision with root package name */
        private String f24699e;

        /* renamed from: f, reason: collision with root package name */
        private String f24700f;

        /* renamed from: g, reason: collision with root package name */
        private String f24701g;

        /* renamed from: h, reason: collision with root package name */
        private String f24702h;

        /* renamed from: i, reason: collision with root package name */
        private String f24703i;

        /* renamed from: j, reason: collision with root package name */
        private String f24704j;

        /* renamed from: k, reason: collision with root package name */
        private String f24705k;

        /* renamed from: l, reason: collision with root package name */
        private String f24706l;

        @Override // R6.a.AbstractC0490a
        public final R6.a a() {
            return new c(this.f24695a, this.f24696b, this.f24697c, this.f24698d, this.f24699e, this.f24700f, this.f24701g, this.f24702h, this.f24703i, this.f24704j, this.f24705k, this.f24706l);
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a b(String str) {
            this.f24706l = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a c(String str) {
            this.f24704j = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a d(String str) {
            this.f24698d = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a e(String str) {
            this.f24702h = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a f(String str) {
            this.f24697c = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a g(String str) {
            this.f24703i = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a h(String str) {
            this.f24701g = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a i(String str) {
            this.f24705k = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a j(String str) {
            this.f24696b = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a k(String str) {
            this.f24700f = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a l(String str) {
            this.f24699e = str;
            return this;
        }

        @Override // R6.a.AbstractC0490a
        public final a.AbstractC0490a m(Integer num) {
            this.f24695a = num;
            return this;
        }
    }

    c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f24683a = num;
        this.f24684b = str;
        this.f24685c = str2;
        this.f24686d = str3;
        this.f24687e = str4;
        this.f24688f = str5;
        this.f24689g = str6;
        this.f24690h = str7;
        this.f24691i = str8;
        this.f24692j = str9;
        this.f24693k = str10;
        this.f24694l = str11;
    }

    @Override // R6.a
    public final String b() {
        return this.f24694l;
    }

    @Override // R6.a
    public final String c() {
        return this.f24692j;
    }

    @Override // R6.a
    public final String d() {
        return this.f24686d;
    }

    @Override // R6.a
    public final String e() {
        return this.f24690h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof R6.a)) {
            return false;
        }
        R6.a aVar = (R6.a) obj;
        Integer num = this.f24683a;
        if (num == null) {
            if (aVar.m() != null) {
                return false;
            }
        } else if (!num.equals(aVar.m())) {
            return false;
        }
        String str = this.f24684b;
        if (str == null) {
            if (aVar.j() != null) {
                return false;
            }
        } else if (!str.equals(aVar.j())) {
            return false;
        }
        String str2 = this.f24685c;
        if (str2 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f())) {
            return false;
        }
        String str3 = this.f24686d;
        if (str3 == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.d())) {
            return false;
        }
        String str4 = this.f24687e;
        if (str4 == null) {
            if (aVar.l() != null) {
                return false;
            }
        } else if (!str4.equals(aVar.l())) {
            return false;
        }
        String str5 = this.f24688f;
        if (str5 == null) {
            if (aVar.k() != null) {
                return false;
            }
        } else if (!str5.equals(aVar.k())) {
            return false;
        }
        String str6 = this.f24689g;
        if (str6 == null) {
            if (aVar.h() != null) {
                return false;
            }
        } else if (!str6.equals(aVar.h())) {
            return false;
        }
        String str7 = this.f24690h;
        if (str7 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str7.equals(aVar.e())) {
            return false;
        }
        String str8 = this.f24691i;
        if (str8 == null) {
            if (aVar.g() != null) {
                return false;
            }
        } else if (!str8.equals(aVar.g())) {
            return false;
        }
        String str9 = this.f24692j;
        if (str9 == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str9.equals(aVar.c())) {
            return false;
        }
        String str10 = this.f24693k;
        if (str10 == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str10.equals(aVar.i())) {
            return false;
        }
        String str11 = this.f24694l;
        return str11 == null ? aVar.b() == null : str11.equals(aVar.b());
    }

    @Override // R6.a
    public final String f() {
        return this.f24685c;
    }

    @Override // R6.a
    public final String g() {
        return this.f24691i;
    }

    @Override // R6.a
    public final String h() {
        return this.f24689g;
    }

    public final int hashCode() {
        Integer num = this.f24683a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f24684b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f24685c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24686d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f24687e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f24688f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f24689g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f24690h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f24691i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f24692j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f24693k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f24694l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    @Override // R6.a
    public final String i() {
        return this.f24693k;
    }

    @Override // R6.a
    public final String j() {
        return this.f24684b;
    }

    @Override // R6.a
    public final String k() {
        return this.f24688f;
    }

    @Override // R6.a
    public final String l() {
        return this.f24687e;
    }

    @Override // R6.a
    public final Integer m() {
        return this.f24683a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f24683a);
        sb2.append(", model=");
        sb2.append(this.f24684b);
        sb2.append(", hardware=");
        sb2.append(this.f24685c);
        sb2.append(", device=");
        sb2.append(this.f24686d);
        sb2.append(", product=");
        sb2.append(this.f24687e);
        sb2.append(", osBuild=");
        sb2.append(this.f24688f);
        sb2.append(", manufacturer=");
        sb2.append(this.f24689g);
        sb2.append(", fingerprint=");
        sb2.append(this.f24690h);
        sb2.append(", locale=");
        sb2.append(this.f24691i);
        sb2.append(", country=");
        sb2.append(this.f24692j);
        sb2.append(", mccMnc=");
        sb2.append(this.f24693k);
        sb2.append(", applicationBuild=");
        return o0.c(sb2, this.f24694l, "}");
    }
}
