package K4;

import com.google.protobuf.AbstractC0911k;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0911k f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4080b;

    /* renamed from: c, reason: collision with root package name */
    public final C1343e f4081c;

    /* renamed from: d, reason: collision with root package name */
    public final C1343e f4082d;

    /* renamed from: e, reason: collision with root package name */
    public final C1343e f4083e;

    public z(AbstractC0911k abstractC0911k, boolean z4, C1343e c1343e, C1343e c1343e2, C1343e c1343e3) {
        this.f4079a = abstractC0911k;
        this.f4080b = z4;
        this.f4081c = c1343e;
        this.f4082d = c1343e2;
        this.f4083e = c1343e3;
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
        return this.f4083e.f14775a.hashCode() + ((this.f4082d.f14775a.hashCode() + ((this.f4081c.f14775a.hashCode() + (((this.f4079a.hashCode() * 31) + (this.f4080b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
