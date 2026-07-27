package c4;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f4926a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4927b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4928c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4929d;

    public C0313c() {
        EnumC0312b enumC0312b = EnumC0312b.f4924a;
        this.f4926a = enumC0312b;
        EnumC0311a enumC0311a = EnumC0311a.f4922a;
        this.f4927b = enumC0311a;
        this.f4928c = enumC0312b;
        this.f4929d = enumC0311a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0313c)) {
            return false;
        }
        C0313c c0313c = (C0313c) obj;
        c0313c.getClass();
        Object obj2 = EnumC0312b.f4924a;
        return obj2.equals(obj2) && this.f4926a.equals(c0313c.f4926a) && this.f4927b.equals(c0313c.f4927b) && this.f4928c.equals(c0313c.f4928c) && this.f4929d.equals(c0313c.f4929d);
    }

    @Override // c4.d
    public final String getDescription() {
        return "ParentBased{root:AlwaysOnSampler,remoteParentSampled:" + this.f4926a.getDescription() + ",remoteParentNotSampled:" + this.f4927b.getDescription() + ",localParentSampled:" + this.f4928c.getDescription() + ",localParentNotSampled:" + this.f4929d.getDescription() + "}";
    }

    public final int hashCode() {
        return this.f4929d.hashCode() + ((this.f4928c.hashCode() + ((this.f4927b.hashCode() + ((this.f4926a.hashCode() + (EnumC0312b.f4924a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
