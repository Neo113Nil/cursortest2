package Q4;

/* loaded from: classes.dex */
public final class s extends C {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2555a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.e f2556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2557c;

    public s(String body, boolean z) {
        kotlin.jvm.internal.i.e(body, "body");
        this.f2555a = z;
        this.f2556b = null;
        this.f2557c = body.toString();
    }

    @Override // Q4.C
    public final String c() {
        return this.f2557c;
    }

    @Override // Q4.C
    public final boolean d() {
        return this.f2555a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2555a == sVar.f2555a && kotlin.jvm.internal.i.a(this.f2557c, sVar.f2557c);
    }

    public final int hashCode() {
        return this.f2557c.hashCode() + (Boolean.hashCode(this.f2555a) * 31);
    }

    @Override // Q4.C
    public final String toString() {
        boolean z = this.f2555a;
        String str = this.f2557c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        R4.v.a(sb, str);
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }
}
