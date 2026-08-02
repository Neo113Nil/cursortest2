package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385t0 extends D5 implements InterfaceC0391w0 {
    public C0385t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 0);
    }

    @Override // Q2.InterfaceC0391w0
    public final void Y1(C0393x0 c0393x0) {
        Parcel N5 = N();
        F5.e(N5, c0393x0);
        d1(N5, 8);
    }

    @Override // Q2.InterfaceC0391w0
    public final float b() {
        throw null;
    }

    @Override // Q2.InterfaceC0391w0
    public final float c() {
        throw null;
    }

    @Override // Q2.InterfaceC0391w0
    public final C0393x0 e() {
        C0393x0 c0393x0;
        Parcel Y4 = Y(N(), 11);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0393x0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c0393x0 = queryLocalInterface instanceof C0393x0 ? (C0393x0) queryLocalInterface : new C0393x0(readStrongBinder);
        }
        Y4.recycle();
        return c0393x0;
    }

    @Override // Q2.InterfaceC0391w0
    public final float f() {
        throw null;
    }
}
