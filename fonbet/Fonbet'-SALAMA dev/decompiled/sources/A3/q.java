package A3;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q extends k implements r {
    @Override // A3.k
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            Bundle bundle = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            e(bundle);
            return true;
        }
        if (i7 == 3) {
            Bundle bundle2 = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            c(bundle2);
            return true;
        }
        if (i7 == 4) {
            Bundle bundle3 = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            d(bundle3);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) l.a(parcel, Bundle.CREATOR);
        l.b(parcel);
        b(bundle4);
        return true;
    }
}
