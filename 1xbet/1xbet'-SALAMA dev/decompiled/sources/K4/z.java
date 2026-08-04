package K4;

import com.google.protobuf.AbstractC0867k;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0867k f4079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p075k4.e f4081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p075k4.e f4082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p075k4.e f4083e;

    public z(AbstractC0867k abstractC0867k, boolean z4, p075k4.e eVar, p075k4.e eVar2, p075k4.e eVar3) {
        this.f4079a = abstractC0867k;
        this.f4080b = z4;
        this.f4081c = eVar;
        this.f4082d = eVar2;
        this.f4083e = eVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f4080b == zVar.f4080b && this.f4079a.equals(zVar.f4079a) && this.f4081c.equals(zVar.f4081c) && this.f4082d.equals(zVar.f4082d)) {
            return this.f4083e.equals(zVar.f4083e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4083e.f14781a.hashCode() + ((this.f4082d.f14781a.hashCode() + ((this.f4081c.f14781a.hashCode() + (((this.f4079a.hashCode() * 31) + (this.f4080b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
