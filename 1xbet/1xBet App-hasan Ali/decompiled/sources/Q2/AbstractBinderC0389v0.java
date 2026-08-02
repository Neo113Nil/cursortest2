package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0389v0 extends E5 implements InterfaceC0391w0 {
    public AbstractBinderC0389v0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC0391w0 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof InterfaceC0391w0 ? (InterfaceC0391w0) queryLocalInterface : new C0385t0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        C0393x0 c0393x0;
        switch (i) {
            case 1:
                o();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean f = F5.f(parcel);
                F5.b(parcel);
                S(f);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean s2 = s();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(s2 ? 1 : 0);
                return true;
            case 5:
                int g5 = g();
                parcel2.writeNoException();
                parcel2.writeInt(g5);
                return true;
            case 6:
                float f5 = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f5);
                return true;
            case 7:
                float c5 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c5);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0393x0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c0393x0 = queryLocalInterface instanceof C0393x0 ? (C0393x0) queryLocalInterface : new C0393x0(readStrongBinder);
                }
                F5.b(parcel);
                Y1(c0393x0);
                parcel2.writeNoException();
                return true;
            case 9:
                float b3 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b3);
                return true;
            case 10:
                boolean r5 = r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(r5 ? 1 : 0);
                return true;
            case 11:
                C0393x0 e3 = e();
                parcel2.writeNoException();
                F5.e(parcel2, e3);
                return true;
            case 12:
                boolean n5 = n();
                parcel2.writeNoException();
                ClassLoader classLoader3 = F5.f8654a;
                parcel2.writeInt(n5 ? 1 : 0);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
