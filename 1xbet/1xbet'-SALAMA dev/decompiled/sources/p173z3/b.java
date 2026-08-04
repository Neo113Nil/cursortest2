package p173z3;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                zak zakVar = (zak) zac.zaa(parcel, zak.CREATOR);
                zac.zab(parcel);
                M m7 = (M) this;
                m7.f11133b.post(new X(2, m7, zakVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
