package A3;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends k implements y {
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
