package x0;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012b extends com.google.android.gms.common.internal.a {
    @Override // n0.InterfaceC0939c
    public final int m() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ android.os.IInterface n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof x0.c ? (x0.c) queryLocalInterface : new x0.c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final m0.d[] o() {
        return j0.c.f7942b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String s() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
