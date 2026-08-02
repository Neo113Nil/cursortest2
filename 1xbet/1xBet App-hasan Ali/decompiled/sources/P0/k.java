package P0;

import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final k f4657g = new k(false, 0, true, 1, 1, R0.b.f5121m);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4660c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4661d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4662e;
    public final R0.b f;

    public k(boolean z3, int i, boolean z5, int i5, int i6, R0.b bVar) {
        this.f4658a = z3;
        this.f4659b = i;
        this.f4660c = z5;
        this.f4661d = i5;
        this.f4662e = i6;
        this.f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f4658a == kVar.f4658a && this.f4659b == kVar.f4659b && this.f4660c == kVar.f4660c && this.f4661d == kVar.f4661d && this.f4662e == kVar.f4662e && kotlin.jvm.internal.l.a(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.f5122k.hashCode() + ((((((((((this.f4658a ? 1231 : 1237) * 31) + this.f4659b) * 31) + (this.f4660c ? 1231 : 1237)) * 31) + this.f4661d) * 31) + this.f4662e) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f4658a);
        sb.append(", capitalization=");
        int i = this.f4659b;
        sb.append((Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f4660c);
        sb.append(", keyboardType=");
        sb.append((Object) AbstractC2425d.L(this.f4661d));
        sb.append(", imeAction=");
        sb.append((Object) j.a(this.f4662e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
