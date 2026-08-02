package G4;

import com.google.protobuf.AbstractC0911k;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final E4.I f2953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2954b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2955c;

    /* renamed from: d, reason: collision with root package name */
    public final B f2956d;

    /* renamed from: e, reason: collision with root package name */
    public final H4.n f2957e;

    /* renamed from: f, reason: collision with root package name */
    public final H4.n f2958f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0911k f2959g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f2960h;

    public Z(E4.I i7, int i8, long j, B b7, H4.n nVar, H4.n nVar2, AbstractC0911k abstractC0911k, Integer num) {
        i7.getClass();
        this.f2953a = i7;
        this.f2954b = i8;
        this.f2955c = j;
        this.f2958f = nVar2;
        this.f2956d = b7;
        nVar.getClass();
        this.f2957e = nVar;
        abstractC0911k.getClass();
        this.f2959g = abstractC0911k;
        this.f2960h = num;
    }

    public final Z a(AbstractC0911k abstractC0911k, H4.n nVar) {
        return new Z(this.f2953a, this.f2954b, this.f2955c, this.f2956d, nVar, this.f2958f, abstractC0911k, null);
    }

    public final Z b(long j) {
        return new Z(this.f2953a, this.f2954b, j, this.f2956d, this.f2957e, this.f2958f, this.f2959g, this.f2960h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z4 = (Z) obj;
        return this.f2953a.equals(z4.f2953a) && this.f2954b == z4.f2954b && this.f2955c == z4.f2955c && this.f2956d.equals(z4.f2956d) && this.f2957e.equals(z4.f2957e) && this.f2958f.equals(z4.f2958f) && this.f2959g.equals(z4.f2959g) && Objects.equals(this.f2960h, z4.f2960h);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2960h) + ((this.f2959g.hashCode() + ((this.f2958f.f3333a.hashCode() + ((this.f2957e.f3333a.hashCode() + ((this.f2956d.hashCode() + (((((this.f2953a.hashCode() * 31) + this.f2954b) * 31) + ((int) this.f2955c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f2953a + ", targetId=" + this.f2954b + ", sequenceNumber=" + this.f2955c + ", purpose=" + this.f2956d + ", snapshotVersion=" + this.f2957e + ", lastLimboFreeSnapshotVersion=" + this.f2958f + ", resumeToken=" + this.f2959g + ", expectedCount=" + this.f2960h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z(E4.I i7, int i8, long j, B b7) {
        this(i7, i8, j, b7, r7, r7, K4.G.f3983s, null);
        H4.n nVar = H4.n.f3332b;
    }
}
