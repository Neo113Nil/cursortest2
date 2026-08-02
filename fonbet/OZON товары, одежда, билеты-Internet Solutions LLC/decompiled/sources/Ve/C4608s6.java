package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.s6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4608s6 extends C4221en {

    /* renamed from: j, reason: collision with root package name */
    public final int f32013j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32014k;

    /* renamed from: l, reason: collision with root package name */
    public final int f32015l;

    /* renamed from: m, reason: collision with root package name */
    public final int f32016m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f32017n;

    /* renamed from: o, reason: collision with root package name */
    public final String f32018o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f32019p;

    /* renamed from: q, reason: collision with root package name */
    public final Sr f32020q;

    /* renamed from: r, reason: collision with root package name */
    public final String f32021r;

    /* renamed from: s, reason: collision with root package name */
    public final String f32022s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f32023t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f32024u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4608s6(int i11, int i12, int i13, int i14, Integer num, String number, Integer num2, Sr title, String name, String str, boolean z11, Integer num3) {
        super(title, name, i14, num, number, num2, str, false, null, 384);
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32013j = i11;
        this.f32014k = i12;
        this.f32015l = i13;
        this.f32016m = i14;
        this.f32017n = num;
        this.f32018o = number;
        this.f32019p = num2;
        this.f32020q = title;
        this.f32021r = name;
        this.f32022s = str;
        this.f32023t = z11;
        this.f32024u = num3;
    }

    @Override // Ve.C4221en
    public final Integer a() {
        return this.f32019p;
    }

    @Override // Ve.C4221en
    public final String b() {
        return this.f32021r;
    }

    @Override // Ve.C4221en
    public final String c() {
        return this.f32018o;
    }

    @Override // Ve.C4221en
    public final int d() {
        return this.f32016m;
    }

    @Override // Ve.C4221en
    public final boolean e() {
        return this.f32023t;
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
        return this.f32013j == c4608s6.f32013j && this.f32016m == c4608s6.f32016m && Intrinsics.d(this.f32017n, c4608s6.f32017n) && Intrinsics.d(this.f32018o, c4608s6.f32018o) && Intrinsics.d(this.f32019p, c4608s6.f32019p) && Intrinsics.d(this.f32020q, c4608s6.f32020q) && Intrinsics.d(this.f32021r, c4608s6.f32021r) && Intrinsics.d(this.f32022s, c4608s6.f32022s) && Intrinsics.d(this.f32024u, c4608s6.f32024u);
    }

    @Override // Ve.C4221en
    public final Integer f() {
        return this.f32017n;
    }

    @Override // Ve.C4221en
    public final Integer g() {
        return this.f32024u;
    }

    @Override // Ve.C4221en
    public final Sr h() {
        return this.f32020q;
    }

    @Override // Ve.C4221en
    public final int hashCode() {
        int i11 = ((this.f32013j * 31) + this.f32016m) * 31;
        Integer num = this.f32017n;
        int b02 = Lf.a.b0((i11 + (num != null ? num.intValue() : 0)) * 31, this.f32018o);
        Integer num2 = this.f32019p;
        int b03 = Lf.a.b0((this.f32020q.hashCode() + ((b02 + (num2 != null ? num2.intValue() : 0)) * 31)) * 31, this.f32021r);
        String str = this.f32022s;
        int hashCode = (b03 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.f32024u;
        return hashCode + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // Ve.C4221en
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankCard(paymentId=");
        sb2.append(this.f32013j);
        sb2.append(", backgroundColor=");
        sb2.append(this.f32014k);
        sb2.append(", statusImage=");
        sb2.append(this.f32015l);
        sb2.append(", numberResId=");
        sb2.append(this.f32016m);
        sb2.append(", pluralsResId=");
        sb2.append(this.f32017n);
        sb2.append(", number='");
        sb2.append(this.f32018o);
        sb2.append("', cardsCount=");
        sb2.append(this.f32019p);
        sb2.append(", title=");
        sb2.append(this.f32020q);
        sb2.append(", name='");
        sb2.append(this.f32021r);
        sb2.append("', cardLogo=");
        sb2.append(this.f32022s);
        sb2.append(", precalculatedBonuses='");
        return Ep.a.c(sb2, this.f32024u, "')");
    }
}
