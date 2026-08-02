package L5;

import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0344x f4514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4515b;

    /* renamed from: c, reason: collision with root package name */
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
        return this.f4516c.hashCode() + AbstractC1663a.d(this.f4514a.hashCode() * 31, 31, this.f4515b);
    }

    public y(D2.b bVar) {
        int ordinal = bVar.getInitializationState().ordinal();
        if (ordinal == 0) {
            this.f4514a = EnumC0344x.f4511a;
        } else if (ordinal == 1) {
            this.f4514a = EnumC0344x.f4512b;
        } else {
            throw new IllegalArgumentException("Unable to handle state: " + bVar.getInitializationState());
        }
        this.f4515b = bVar.getDescription();
        this.f4516c = Integer.valueOf(bVar.getLatency());
    }
}
