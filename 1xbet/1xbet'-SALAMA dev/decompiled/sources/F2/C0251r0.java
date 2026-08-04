package F2;

import android.os.RemoteException;

/* JADX INFO: renamed from: F2.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251r0 implements p167y2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0250q0 f2716b;

    public C0251r0(InterfaceC0250q0 interfaceC0250q0) {
        String strZze;
        this.f2716b = interfaceC0250q0;
        try {
            strZze = interfaceC0250q0.zze();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            strZze = null;
        }
        this.f2715a = strZze;
    }

    public final String toString() {
        return this.f2715a;
    }
}
