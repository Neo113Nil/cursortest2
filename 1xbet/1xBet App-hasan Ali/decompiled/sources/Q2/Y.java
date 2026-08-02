package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;

/* loaded from: classes.dex */
public abstract class Y extends E5 implements Z {
    public static Z asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof Z ? (Z) queryLocalInterface : new X(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            I0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            F5.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        InterfaceC0624Ka adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        F5.e(parcel2, adapterCreator);
        return true;
    }
}
