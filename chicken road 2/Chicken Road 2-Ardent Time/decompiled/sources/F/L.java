package F;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.j implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public static final F.L f363e = new F.L(2);

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        F.c0 msg = (F.c0) obj;
        java.lang.Throwable th = (java.lang.Throwable) obj2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (th == null) {
            th = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f429b.J(new z1.C1061n(th, false));
        return h1.C0177i.f3302a;
    }
}
