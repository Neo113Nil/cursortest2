package g0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, j0.a, W.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f541h;

    /* renamed from: i, reason: collision with root package name */
    public final int f542i;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f541h = i2;
        this.f542i = 0;
    }

    public final j0.a c() {
        l.f547a.getClass();
        return this;
    }

    @Override // g0.f
    public final int d() {
        return this.f541h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f536e.equals(gVar.f536e) && this.f537f.equals(gVar.f537f) && this.f542i == gVar.f542i && this.f541h == gVar.f541h && this.f534c.equals(gVar.f534c) && b().equals(gVar.b());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        j0.a aVar = this.f533b;
        if (aVar == null) {
            c();
            this.f533b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        b();
        return this.f537f.hashCode() + ((this.f536e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        j0.a aVar = this.f533b;
        if (aVar == null) {
            c();
            this.f533b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f536e;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
