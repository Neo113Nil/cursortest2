package t0;

import h0.C1988b;
import java.util.ArrayList;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f19516a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19518c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19519d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19520e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19521g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19522h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19523j;

    /* renamed from: k, reason: collision with root package name */
    public final long f19524k;

    public u(long j5, long j6, long j7, long j8, boolean z3, float f, int i, boolean z5, ArrayList arrayList, long j9, long j10) {
        this.f19516a = j5;
        this.f19517b = j6;
        this.f19518c = j7;
        this.f19519d = j8;
        this.f19520e = z3;
        this.f = f;
        this.f19521g = i;
        this.f19522h = z5;
        this.i = arrayList;
        this.f19523j = j9;
        this.f19524k = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r.a(this.f19516a, uVar.f19516a) && this.f19517b == uVar.f19517b && C1988b.b(this.f19518c, uVar.f19518c) && C1988b.b(this.f19519d, uVar.f19519d) && this.f19520e == uVar.f19520e && Float.compare(this.f, uVar.f) == 0 && this.f19521g == uVar.f19521g && this.f19522h == uVar.f19522h && this.i.equals(uVar.i) && C1988b.b(this.f19523j, uVar.f19523j) && C1988b.b(this.f19524k, uVar.f19524k);
    }

    public final int hashCode() {
        long j5 = this.f19516a;
        long j6 = this.f19517b;
        return C1988b.f(this.f19524k) + ((C1988b.f(this.f19523j) + ((this.i.hashCode() + ((((AbstractC2107A.n(this.f, (((C1988b.f(this.f19519d) + ((C1988b.f(this.f19518c) + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31)) * 31) + (this.f19520e ? 1231 : 1237)) * 31, 31) + this.f19521g) * 31) + (this.f19522h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) r.b(this.f19516a));
        sb.append(", uptime=");
        sb.append(this.f19517b);
        sb.append(", positionOnScreen=");
        sb.append((Object) C1988b.j(this.f19518c));
        sb.append(", position=");
        sb.append((Object) C1988b.j(this.f19519d));
        sb.append(", down=");
        sb.append(this.f19520e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.f19521g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f19522h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) C1988b.j(this.f19523j));
        sb.append(", originalEventPosition=");
        sb.append((Object) C1988b.j(this.f19524k));
        sb.append(')');
        return sb.toString();
    }
}
