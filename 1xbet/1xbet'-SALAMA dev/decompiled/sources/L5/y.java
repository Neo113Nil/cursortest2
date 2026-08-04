package L5;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0344x f4514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Number f4516c;

    public y(EnumC0344x enumC0344x, String str, Number number) {
        this.f4514a = enumC0344x;
        this.f4515b = str;
        this.f4516c = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f4514a == yVar.f4514a && this.f4515b.equals(yVar.f4515b)) {
            return this.f4516c.equals(yVar.f4516c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4516c.hashCode() + p150v0.a.d(this.f4514a.hashCode() * 31, 31, this.f4515b);
    }

    public y(D2.b bVar) {
        int iOrdinal = bVar.getInitializationState().ordinal();
        if (iOrdinal == 0) {
            this.f4514a = EnumC0344x.f4511a;
        } else if (iOrdinal == 1) {
            this.f4514a = EnumC0344x.f4512b;
        } else {
            throw new IllegalArgumentException("Unable to handle state: " + bVar.getInitializationState());
        }
        this.f4515b = bVar.getDescription();
        this.f4516c = Integer.valueOf(bVar.getLatency());
    }
}
