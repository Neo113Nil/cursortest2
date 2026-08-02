package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0390w extends E5 implements InterfaceC0392x {
    public AbstractBinderC0390w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                int readInt = parcel.readInt();
                F5.b(parcel);
                x(readInt);
                break;
            case 3:
                break;
            case 4:
                e();
                break;
            case 5:
                h();
                break;
            case 6:
                p();
                break;
            case 7:
                f();
                break;
            case 8:
                C0387u0 c0387u0 = (C0387u0) F5.a(parcel, C0387u0.CREATOR);
                F5.b(parcel);
                q(c0387u0);
                break;
            case 9:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
