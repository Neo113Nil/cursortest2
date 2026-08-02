package A3;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class v extends k implements w {
    @Override // A3.k
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) l.a(parcel, Bundle.CREATOR);
        l.b(parcel);
        b(bundle);
        return true;
    }
}
