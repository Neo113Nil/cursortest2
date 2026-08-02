package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* loaded from: classes.dex */
public abstract class C extends E5 implements D {
    public C() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            X0 x02 = (X0) F5.a(parcel, X0.CREATOR);
            F5.b(parcel);
            Z0(x02);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String b3 = b();
            parcel2.writeNoException();
            parcel2.writeString(b3);
            return true;
        }
        if (i == 3) {
            boolean e3 = e();
            parcel2.writeNoException();
            ClassLoader classLoader = F5.f8654a;
            parcel2.writeInt(e3 ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String c5 = c();
            parcel2.writeNoException();
            parcel2.writeString(c5);
            return true;
        }
        if (i != 5) {
            return false;
        }
        X0 x03 = (X0) F5.a(parcel, X0.CREATOR);
        int readInt = parcel.readInt();
        F5.b(parcel);
        F0(x03, readInt);
        parcel2.writeNoException();
        return true;
    }
}
