package G4;

import com.google.protobuf.AbstractC0867k;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.I f2953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f2956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H4.n f2957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H4.n f2958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0867k f2959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f2960h;

    public Z(E4.I i7, int i8, long j, B b7, H4.n nVar, H4.n nVar2, AbstractC0867k abstractC0867k, Integer num) {
        i7.getClass();
        this.f2953a = i7;
        this.f2954b = i8;
        this.f2955c = j;
        this.f2958f = nVar2;
        this.f2956d = b7;
        nVar.getClass();
        this.f2957e = nVar;
        abstractC0867k.getClass();
        this.f2959g = abstractC0867k;
        this.f2960h = num;
    }

    public final Z a(AbstractC0867k abstractC0867k, H4.n nVar) {
        return new Z(this.f2953a, this.f2954b, this.f2955c, this.f2956d, nVar, this.f2958f, abstractC0867k, null);
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
    public Z(E4.I i7, int i8, long j, B b7) {
        H4.n nVar = H4.n.f3332b;
        this(i7, i8, j, b7, nVar, nVar, K4.G.f3983s, null);
    }
}
