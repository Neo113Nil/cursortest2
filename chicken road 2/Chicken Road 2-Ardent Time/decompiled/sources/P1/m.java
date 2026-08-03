package P1;

/* loaded from: classes.dex */
public final class m implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final P1.v f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P1.r f1497b;

    public m(P1.r this$0, P1.v vVar) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1497b = this$0;
        this.f1496a = vVar;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        P1.EnumC0054b enumC0054b;
        P1.r rVar = this.f1497b;
        P1.v vVar = this.f1496a;
        P1.EnumC0054b enumC0054b2 = P1.EnumC0054b.INTERNAL_ERROR;
        java.io.IOException e2 = null;
        try {
            vVar.b(this);
            while (vVar.a(false, this)) {
            }
            enumC0054b = P1.EnumC0054b.NO_ERROR;
            try {
                try {
                    rVar.a(enumC0054b, P1.EnumC0054b.CANCEL, null);
                } catch (java.io.IOException e3) {
                    e2 = e3;
                    P1.EnumC0054b enumC0054b3 = P1.EnumC0054b.PROTOCOL_ERROR;
                    rVar.a(enumC0054b3, enumC0054b3, e2);
                    J1.b.d(vVar);
                    return h1.C0177i.f3302a;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                rVar.a(enumC0054b, enumC0054b2, e2);
                J1.b.d(vVar);
                throw th;
            }
        } catch (java.io.IOException e4) {
            e2 = e4;
            enumC0054b = enumC0054b2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            enumC0054b = enumC0054b2;
            rVar.a(enumC0054b, enumC0054b2, e2);
            J1.b.d(vVar);
            throw th;
        }
        J1.b.d(vVar);
        return h1.C0177i.f3302a;
    }
}
