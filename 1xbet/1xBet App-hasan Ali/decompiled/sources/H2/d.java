package H2;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.c f2283a = new E2.c();

    public static final boolean a(E2.i iVar) {
        int ordinal = iVar.f1441e.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            return iVar.f1459y.f1414a == null && (iVar.f1456v instanceof F2.c);
        }
        throw new D2.e();
    }
}
