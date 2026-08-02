package s5;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1599a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16183c;

    public C1599a(String str, String str2) {
        this.f16181a = str;
        this.f16182b = null;
        this.f16183c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1599a.class != obj.getClass()) {
            return false;
        }
        C1599a c1599a = (C1599a) obj;
        if (this.f16181a.equals(c1599a.f16181a)) {
            return this.f16183c.equals(c1599a.f16183c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16183c.hashCode() + (this.f16181a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f16181a);
        sb.append(", function: ");
        return e1.k.i(sb, this.f16183c, " )");
    }

    public C1599a(String str, String str2, String str3) {
        this.f16181a = str;
        this.f16182b = str2;
        this.f16183c = str3;
    }
}
