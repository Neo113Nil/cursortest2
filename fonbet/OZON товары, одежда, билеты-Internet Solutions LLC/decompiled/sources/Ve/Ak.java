package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ak extends C4221en {

    /* renamed from: j, reason: collision with root package name */
    public final int f28617j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28618k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28619l;

    /* renamed from: m, reason: collision with root package name */
    public final int f28620m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f28621n;

    /* renamed from: o, reason: collision with root package name */
    public final String f28622o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f28623p;

    /* renamed from: q, reason: collision with root package name */
    public final Sr f28624q;

    /* renamed from: r, reason: collision with root package name */
    public final String f28625r;

    /* renamed from: s, reason: collision with root package name */
    public final String f28626s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f28627t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f28628u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ak(int i11, int i12, int i13, int i14, Integer num, String number, Integer num2, Sr title, String name, String str, boolean z11, Integer num3) {
        super(title, name, i14, num, number, num2, str, false, null, 384);
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f28617j = i11;
        this.f28618k = i12;
        this.f28619l = i13;
        this.f28620m = i14;
        this.f28621n = num;
        this.f28622o = number;
        this.f28623p = num2;
        this.f28624q = title;
        this.f28625r = name;
        this.f28626s = str;
        this.f28627t = z11;
        this.f28628u = num3;
    }

    @Override // Ve.C4221en
    public final Integer a() {
        return this.f28623p;
    }

    @Override // Ve.C4221en
    public final String b() {
        return this.f28625r;
    }

    @Override // Ve.C4221en
    public final String c() {
        return this.f28622o;
    }

    @Override // Ve.C4221en
    public final int d() {
        return this.f28620m;
    }

    @Override // Ve.C4221en
    public final boolean e() {
        return this.f28627t;
    }

    @Override // Ve.C4221en
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4608s6)) {
            return false;
        }
        C4608s6 c4608s6 = (C4608s6) obj;
        return this.f28617j == c4608s6.f32013j && this.f28620m == c4608s6.f32016m && Intrinsics.d(this.f28621n, c4608s6.f32017n) && Intrinsics.d(this.f28622o, c4608s6.f32018o) && Intrinsics.d(this.f28623p, c4608s6.f32019p) && Intrinsics.d(this.f28624q, c4608s6.f32020q) && Intrinsics.d(this.f28625r, c4608s6.f32021r) && Intrinsics.d(this.f28626s, c4608s6.f32022s) && Intrinsics.d(this.f28628u, c4608s6.f32024u);
    }

    @Override // Ve.C4221en
    public final Integer f() {
        return this.f28621n;
    }

    @Override // Ve.C4221en
    public final Integer g() {
        return this.f28628u;
    }

    @Override // Ve.C4221en
    public final Sr h() {
        return this.f28624q;
    }

    @Override // Ve.C4221en
    public final int hashCode() {
        int i11 = ((this.f28617j * 31) + this.f28620m) * 31;
        Integer num = this.f28621n;
        int b02 = Lf.a.b0((i11 + (num != null ? num.intValue() : 0)) * 31, this.f28622o);
        Integer num2 = this.f28623p;
        int b03 = Lf.a.b0((this.f28624q.hashCode() + ((b02 + (num2 != null ? num2.intValue() : 0)) * 31)) * 31, this.f28625r);
        String str = this.f28626s;
        int hashCode = (b03 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.f28628u;
        return hashCode + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // Ve.C4221en
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisabledBankCard(paymentId=");
        sb2.append(this.f28617j);
        sb2.append(", backgroundColor=");
        sb2.append(this.f28618k);
        sb2.append(", statusImage=");
        sb2.append(this.f28619l);
        sb2.append(", numberResId=");
        sb2.append(this.f28620m);
        sb2.append(", pluralsResId=");
        sb2.append(this.f28621n);
        sb2.append(", number='");
        sb2.append(this.f28622o);
        sb2.append("', cardsCount=");
        sb2.append(this.f28623p);
        sb2.append(", title=");
        sb2.append(this.f28624q);
        sb2.append(", name='");
        sb2.append(this.f28625r);
        sb2.append("', cardLogo=");
        sb2.append(this.f28626s);
        sb2.append(", precalculatedBonuses='");
        return Ep.a.c(sb2, this.f28628u, "')");
    }
}
