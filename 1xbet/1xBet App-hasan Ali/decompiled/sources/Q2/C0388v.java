package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388v extends D5 implements InterfaceC0392x {
    public C0388v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 0);
    }

    @Override // Q2.InterfaceC0392x
    public final void e() {
        d1(N(), 4);
    }

    @Override // Q2.InterfaceC0392x
    public final void f() {
        d1(N(), 7);
    }

    @Override // Q2.InterfaceC0392x
    public final void g() {
        d1(N(), 3);
    }

    @Override // Q2.InterfaceC0392x
    public final void h() {
        d1(N(), 5);
    }

    @Override // Q2.InterfaceC0392x
    public final void j() {
        d1(N(), 1);
    }

    @Override // Q2.InterfaceC0392x
    public final void k() {
        d1(N(), 9);
    }

    @Override // Q2.InterfaceC0392x
    public final void p() {
        d1(N(), 6);
    }

    @Override // Q2.InterfaceC0392x
    public final void q(C0387u0 c0387u0) {
        Parcel N5 = N();
        F5.c(N5, c0387u0);
        d1(N5, 8);
    }

    @Override // Q2.InterfaceC0392x
    public final void x(int i) {
        Parcel N5 = N();
        N5.writeInt(i);
        d1(N5, 2);
    }
}
