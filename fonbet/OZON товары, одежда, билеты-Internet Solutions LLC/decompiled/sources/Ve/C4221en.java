package Ve;

import B0.C2454a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.en, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4221en {

    /* renamed from: a, reason: collision with root package name */
    public final Sr f30940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30941b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30942c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30943d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30944e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f30945f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30946g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30947h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f30948i;

    public C4221en(Sr title, String name, int i11, Integer num, String number, Integer num2, String str, boolean z11, Integer num3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f30940a = title;
        this.f30941b = name;
        this.f30942c = i11;
        this.f30943d = num;
        this.f30944e = number;
        this.f30945f = num2;
        this.f30946g = str;
        this.f30947h = z11;
        this.f30948i = num3;
    }

    public Integer a() {
        return this.f30945f;
    }

    public String b() {
        return this.f30941b;
    }

    public String c() {
        return this.f30944e;
    }

    public int d() {
        return this.f30942c;
    }

    public boolean e() {
        return this.f30947h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4221en)) {
            return false;
        }
        C4221en c4221en = (C4221en) obj;
        return Intrinsics.d(h(), c4221en.h()) && Intrinsics.d(b(), c4221en.b()) && d() == c4221en.d() && Intrinsics.d(f(), c4221en.f()) && Intrinsics.d(c(), c4221en.c()) && Intrinsics.d(a(), c4221en.a()) && Intrinsics.d(this.f30946g, c4221en.f30946g) && Intrinsics.d(g(), c4221en.g());
    }

    public Integer f() {
        return this.f30943d;
    }

    public Integer g() {
        return this.f30948i;
    }

    public Sr h() {
        return this.f30940a;
    }

    public int hashCode() {
        int d11 = (d() + ((b().hashCode() + (h().hashCode() * 31)) * 31)) * 31;
        Integer f7 = f();
        int hashCode = (c().hashCode() + ((d11 + (f7 != null ? f7.intValue() : 0)) * 31)) * 31;
        Integer a11 = a();
        int intValue = (hashCode + (a11 != null ? a11.intValue() : 0)) * 31;
        String str = this.f30946g;
        int hashCode2 = (intValue + (str != null ? str.hashCode() : 0)) * 31;
        Integer g10 = g();
        return hashCode2 + (g10 != null ? g10.hashCode() : 0);
    }

    public String toString() {
        Sr h11 = h();
        String b11 = b();
        int d11 = d();
        Integer f7 = f();
        String c11 = c();
        Integer a11 = a();
        Integer g10 = g();
        StringBuilder sb2 = new StringBuilder("CardPresentationData(title=");
        sb2.append(h11);
        sb2.append(", name='");
        sb2.append(b11);
        sb2.append("', numberResId=");
        sb2.append(d11);
        sb2.append(", pluralsResId=");
        sb2.append(f7);
        sb2.append(", number='");
        C2454a.f(a11, c11, "', cardsCount=", ", image=", sb2);
        sb2.append(this.f30946g);
        sb2.append(", precalculateBonuses=");
        sb2.append(g10);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C4221en(Sr sr, String str, int i11, Integer num, String str2, Integer num2, String str3, boolean z11, Integer num3, int i12) {
        this(sr, str, i11, (i12 & 8) != 0 ? null : num, str2, (i12 & 32) != 0 ? null : num2, str3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i12 & 256) != 0 ? null : num3);
    }
}
