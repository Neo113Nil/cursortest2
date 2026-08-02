package t0;

import h0.C1988b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f19500a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19501b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19502c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19503d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19504e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19505g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19506h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19507j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f19508k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19509l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19510m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19511n;

    /* renamed from: o, reason: collision with root package name */
    public s f19512o;

    public s(long j5, long j6, long j7, boolean z3, float f, long j8, long j9, boolean z5, boolean z6, int i, long j10) {
        this.f19500a = j5;
        this.f19501b = j6;
        this.f19502c = j7;
        this.f19503d = z3;
        this.f19504e = f;
        this.f = j8;
        this.f19505g = j9;
        this.f19506h = z5;
        this.i = i;
        this.f19507j = j10;
        this.f19509l = 0L;
        this.f19510m = z6;
        this.f19511n = z6;
    }

    public final void a() {
        s sVar = this.f19512o;
        if (sVar == null) {
            this.f19510m = true;
            this.f19511n = true;
        } else if (sVar != null) {
            sVar.a();
        }
    }

    public final boolean b() {
        s sVar = this.f19512o;
        return sVar != null ? sVar.b() : this.f19510m || this.f19511n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) r.b(this.f19500a));
        sb.append(", uptimeMillis=");
        sb.append(this.f19501b);
        sb.append(", position=");
        sb.append((Object) C1988b.j(this.f19502c));
        sb.append(", pressed=");
        sb.append(this.f19503d);
        sb.append(", pressure=");
        sb.append(this.f19504e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) C1988b.j(this.f19505g));
        sb.append(", previousPressed=");
        sb.append(this.f19506h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f19508k;
        if (obj == null) {
            obj = X3.v.f6090k;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C1988b.j(this.f19507j));
        sb.append(')');
        return sb.toString();
    }

    public s(long j5, long j6, long j7, boolean z3, float f, long j8, long j9, boolean z5, int i, ArrayList arrayList, long j10, long j11) {
        this(j5, j6, j7, z3, f, j8, j9, z5, false, i, j10);
        this.f19508k = arrayList;
        this.f19509l = j11;
    }
}
