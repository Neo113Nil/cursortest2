package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f219c;

    public a(String str, String str2) {
        this.f217a = str;
        this.f218b = null;
        this.f219c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f217a.equals(aVar.f217a)) {
            return this.f219c.equals(aVar.f219c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f219c.hashCode() + (this.f217a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f217a + ", function: " + this.f219c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f217a = str;
        this.f218b = str2;
        this.f219c = str3;
    }
}
