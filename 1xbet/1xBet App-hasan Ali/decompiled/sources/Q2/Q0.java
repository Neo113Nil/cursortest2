package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* loaded from: classes.dex */
public final class Q0 extends E5 implements InterfaceC0374n0 {
    public Q0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static InterfaceC0374n0 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC0374n0 ? (InterfaceC0374n0) queryLocalInterface : new C0372m0(iBinder);
    }

    @Override // Q2.InterfaceC0374n0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            F5.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = F5.f8654a;
        parcel2.writeInt(1);
        return true;
    }

    @Override // Q2.InterfaceC0374n0
    public final void X2(b1 b1Var) {
    }
}
