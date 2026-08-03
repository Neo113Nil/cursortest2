package o0;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f8176a;

    public r(int i2) {
        this.f8176a = i2;
    }

    public static com.google.android.gms.common.api.Status g(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(o0.m mVar);

    public abstract m0.d[] b(o0.m mVar);

    public abstract void c(com.google.android.gms.common.api.Status status);

    public abstract void d(java.lang.RuntimeException runtimeException);

    public abstract void e(o0.m mVar);

    public abstract void f(o0.i iVar, boolean z2);
}
