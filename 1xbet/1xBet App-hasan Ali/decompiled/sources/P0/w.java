package P0;

import K0.C0203h;
import K0.F;
import K0.N;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4680b;

    /* renamed from: c, reason: collision with root package name */
    public final N f4681c;

    public w(C0203h c0203h, long j5, N n5) {
        this.f4679a = c0203h;
        this.f4680b = F.c(c0203h.f2829l.length(), j5);
        this.f4681c = n5 != null ? new N(F.c(c0203h.f2829l.length(), n5.f2803a)) : null;
    }

    public static w a(w wVar, C0203h c0203h, long j5, int i) {
        if ((i & 1) != 0) {
            c0203h = wVar.f4679a;
        }
        if ((i & 2) != 0) {
            j5 = wVar.f4680b;
        }
        N n5 = (i & 4) != 0 ? wVar.f4681c : null;
        wVar.getClass();
        return new w(c0203h, j5, n5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return N.a(this.f4680b, wVar.f4680b) && kotlin.jvm.internal.l.a(this.f4681c, wVar.f4681c) && kotlin.jvm.internal.l.a(this.f4679a, wVar.f4679a);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4679a.hashCode() * 31;
        int i5 = N.f2802c;
        long j5 = this.f4680b;
        int i6 = (((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31;
        N n5 = this.f4681c;
        if (n5 != null) {
            long j6 = n5.f2803a;
            i = (int) ((j6 >>> 32) ^ j6);
        } else {
            i = 0;
        }
        return i6 + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f4679a) + "', selection=" + ((Object) N.g(this.f4680b)) + ", composition=" + this.f4681c + ')';
    }

    public w(int i, long j5, String str) {
        this(new C0203h((i & 1) != 0 ? "" : str), (i & 2) != 0 ? N.f2801b : j5, (N) null);
    }
}
