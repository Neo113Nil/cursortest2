package K1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f920c;

    public a(String str, String str2) {
        this.f918a = str;
        this.f919b = null;
        this.f920c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f918a.equals(aVar.f918a)) {
            return this.f920c.equals(aVar.f920c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f920c.hashCode() + (this.f918a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f918a);
        sb.append(", function: ");
        return B0.c.l(sb, this.f920c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f918a = str;
        this.f919b = str2;
        this.f920c = str3;
    }
}
