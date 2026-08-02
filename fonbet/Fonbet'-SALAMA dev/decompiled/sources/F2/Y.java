package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* loaded from: classes.dex */
public abstract class Y extends zzaxo implements Z {
    public static Z zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof Z ? (Z) queryLocalInterface : new X(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzaxp.zzc(parcel);
        zzc(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
