package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import com.google.android.gms.internal.ads.T9;
import com.google.android.gms.internal.ads.U9;
import java.util.List;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: Q2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0350b0 extends E5 implements InterfaceC0352c0 {
    public AbstractBinderC0350b0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        U9 u9 = null;
        InterfaceC0368k0 interfaceC0368k0 = null;
        switch (i) {
            case 1:
                k();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                F5.b(parcel);
                m0(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                F5.b(parcel);
                S1(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean f = F5.f(parcel);
                F5.b(parcel);
                o3(f);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                F5.b(parcel);
                k3(readString2, h1);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                E1(readString3, h12);
                parcel2.writeNoException();
                return true;
            case 7:
                float b3 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b3);
                return true;
            case 8:
                boolean y5 = y();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(y5 ? 1 : 0);
                return true;
            case 9:
                String c5 = c();
                parcel2.writeNoException();
                parcel2.writeString(c5);
                return true;
            case 10:
                String readString4 = parcel.readString();
                F5.b(parcel);
                A0(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0624Ka u32 = BinderC0610Ia.u3(parcel.readStrongBinder());
                F5.b(parcel);
                s0(u32);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    u9 = queryLocalInterface instanceof U9 ? (U9) queryLocalInterface : new T9(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 0);
                }
                F5.b(parcel);
                r2(u9);
                parcel2.writeNoException();
                return true;
            case 13:
                List f5 = f();
                parcel2.writeNoException();
                parcel2.writeTypedList(f5);
                return true;
            case 14:
                S0 s02 = (S0) F5.a(parcel, S0.CREATOR);
                F5.b(parcel);
                C0(s02);
                parcel2.writeNoException();
                return true;
            case 15:
                e();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    interfaceC0368k0 = queryLocalInterface2 instanceof InterfaceC0368k0 ? (InterfaceC0368k0) queryLocalInterface2 : new C0364i0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 0);
                }
                F5.b(parcel);
                f3(interfaceC0368k0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean f6 = F5.f(parcel);
                F5.b(parcel);
                S(f6);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                F5.b(parcel);
                p0(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
