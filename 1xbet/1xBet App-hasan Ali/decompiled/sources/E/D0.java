package E;

/* loaded from: classes.dex */
public final class D0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1017l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.Z f1018m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(x0.Z z3, int i) {
        super(1);
        this.f1017l = i;
        this.f1018m = z3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1017l) {
            case 0:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 1:
                x0.Y.g((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 2:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 3:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 4:
                x0.Y.g((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 5:
                x0.Y.g((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 6:
                x0.Y.k((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 7:
                x0.Y.g((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 8:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
            case 9:
                x0.Y y5 = (x0.Y) obj;
                W0.m e3 = y5.e();
                W0.m mVar = W0.m.f6016k;
                x0.Z z3 = this.f1018m;
                if (e3 == mVar || y5.f() == 0) {
                    x0.Y.a(y5, z3);
                    z3.Z(W0.j.c(0L, z3.f20977o), 0.0f, null);
                } else {
                    long f = ((y5.f() - z3.f20973k) - r1) << 32;
                    x0.Y.a(y5, z3);
                    z3.Z(W0.j.c((((int) 0) & 4294967295L) | f, z3.f20977o), 0.0f, null);
                }
                break;
            case 10:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
            default:
                x0.Y.j((x0.Y) obj, this.f1018m, 0, 0);
                break;
        }
        return W3.o.f6046a;
    }
}
