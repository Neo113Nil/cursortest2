package F2;

import android.os.RemoteException;

/* renamed from: F2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251r0 implements y2.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2715a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0250q0 f2716b;

    public C0251r0(InterfaceC0250q0 interfaceC0250q0) {
        String str;
        this.f2716b = interfaceC0250q0;
        try {
            str = interfaceC0250q0.zze();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            str = null;
        }
        this.f2715a = str;
    }

    public final String toString() {
        return this.f2715a;
    }
}
