package I1;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f684a;

    /* renamed from: b, reason: collision with root package name */
    public int f685b;

    /* renamed from: c, reason: collision with root package name */
    public Object f686c;

    /* renamed from: d, reason: collision with root package name */
    public Object f687d;

    public y a() {
        if (((R0.h) this.f686c) == null) {
            throw new IllegalArgumentException("execute parameter required");
        }
        P0.d[] dVarArr = (P0.d[]) this.f687d;
        boolean z3 = this.f684a;
        int i3 = this.f685b;
        y yVar = new y();
        yVar.f687d = this;
        yVar.f686c = dVarArr;
        boolean z4 = false;
        if (dVarArr != null && z3) {
            z4 = true;
        }
        yVar.f684a = z4;
        yVar.f685b = i3;
        return yVar;
    }
}
