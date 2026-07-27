package B0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150c;

    public g(String workSpecId, int i2, int i3) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f148a = workSpecId;
        this.f149b = i2;
        this.f150c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.i.a(this.f148a, gVar.f148a) && this.f149b == gVar.f149b && this.f150c == gVar.f150c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150c) + ((Integer.hashCode(this.f149b) + (this.f148a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f148a);
        sb.append(", generation=");
        sb.append(this.f149b);
        sb.append(", systemId=");
        return o.k(sb, this.f150c, ')');
    }
}
