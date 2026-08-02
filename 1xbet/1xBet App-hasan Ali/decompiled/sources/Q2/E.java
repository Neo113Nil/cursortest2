package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0746a9;
import com.google.android.gms.internal.ads.InterfaceC0924e9;
import com.google.android.gms.internal.ads.Y8;

/* loaded from: classes.dex */
public final class E extends D5 implements G {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 0);
    }

    @Override // Q2.G
    public final void L1(B8 b8) {
        Parcel N5 = N();
        F5.c(N5, b8);
        d1(N5, 6);
    }

    @Override // Q2.G
    public final void Y2(InterfaceC0924e9 interfaceC0924e9) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0924e9);
        d1(N5, 10);
    }

    @Override // Q2.G
    public final D b() {
        D b3;
        Parcel Y4 = Y(N(), 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            b3 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            b3 = queryLocalInterface instanceof D ? (D) queryLocalInterface : new B(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 0);
        }
        Y4.recycle();
        return b3;
    }

    @Override // Q2.G
    public final void i3(String str, InterfaceC0746a9 interfaceC0746a9, Y8 y8) {
        Parcel N5 = N();
        N5.writeString(str);
        F5.e(N5, interfaceC0746a9);
        F5.e(N5, y8);
        d1(N5, 5);
    }

    @Override // Q2.G
    public final void j2(InterfaceC0392x interfaceC0392x) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0392x);
        d1(N5, 2);
    }
}
