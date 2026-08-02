package M8;

import java.io.Serializable;

/* loaded from: classes9.dex */
public final class j implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17708c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17710e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17712g;

    /* renamed from: a, reason: collision with root package name */
    private int f17706a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f17707b = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f17709d = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f17711f = false;

    /* renamed from: h, reason: collision with root package name */
    private int f17713h = 1;

    /* renamed from: i, reason: collision with root package name */
    private String f17714i = "";

    /* renamed from: k, reason: collision with root package name */
    private String f17716k = "";

    /* renamed from: j, reason: collision with root package name */
    private a f17715j = a.UNSPECIFIED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FROM_DEFAULT_COUNTRY;
        public static final a FROM_NUMBER_WITHOUT_PLUS_SIGN;
        public static final a FROM_NUMBER_WITH_IDD;
        public static final a FROM_NUMBER_WITH_PLUS_SIGN;
        public static final a UNSPECIFIED;

        static {
            a aVar = new a("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            FROM_NUMBER_WITH_PLUS_SIGN = aVar;
            a aVar2 = new a("FROM_NUMBER_WITH_IDD", 1);
            FROM_NUMBER_WITH_IDD = aVar2;
            a aVar3 = new a("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            FROM_NUMBER_WITHOUT_PLUS_SIGN = aVar3;
            a aVar4 = new a("FROM_DEFAULT_COUNTRY", 3);
            FROM_DEFAULT_COUNTRY = aVar4;
            a aVar5 = new a("UNSPECIFIED", 4);
            UNSPECIFIED = aVar5;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final int a() {
        return this.f17706a;
    }

    public final long b() {
        return this.f17707b;
    }

    public final int d() {
        return this.f17713h;
    }

    public final boolean e() {
        return this.f17711f;
    }

    public final boolean equals(Object obj) {
        j jVar;
        if (!(obj instanceof j) || (jVar = (j) obj) == null) {
            return false;
        }
        if (this == jVar) {
            return true;
        }
        return this.f17706a == jVar.f17706a && this.f17707b == jVar.f17707b && this.f17709d.equals(jVar.f17709d) && this.f17711f == jVar.f17711f && this.f17713h == jVar.f17713h && this.f17714i.equals(jVar.f17714i) && this.f17715j == jVar.f17715j && this.f17716k.equals(jVar.f17716k);
    }

    public final void f(int i11) {
        this.f17706a = i11;
    }

    public final void g(String str) {
        this.f17708c = true;
        this.f17709d = str;
    }

    public final void h() {
        this.f17710e = true;
        this.f17711f = true;
    }

    public final int hashCode() {
        return G.g.a((this.f17715j.hashCode() + G.g.a((((G.g.a((Long.valueOf(this.f17707b).hashCode() + ((2173 + this.f17706a) * 53)) * 53, 53, this.f17709d) + (this.f17711f ? 1231 : 1237)) * 53) + this.f17713h) * 53, 53, this.f17714i)) * 53, 53, this.f17716k) + 1237;
    }

    public final void i(long j11) {
        this.f17707b = j11;
    }

    public final void j(int i11) {
        this.f17712g = true;
        this.f17713h = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f17706a);
        sb2.append(" National Number: ");
        sb2.append(this.f17707b);
        if (this.f17710e && this.f17711f) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.f17712g) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.f17713h);
        }
        if (this.f17708c) {
            sb2.append(" Extension: ");
            sb2.append(this.f17709d);
        }
        return sb2.toString();
    }
}
