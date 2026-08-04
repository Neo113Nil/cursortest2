package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends zzaxo implements Z {
    public static Z zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof Z ? (Z) iInterfaceQueryLocalInterface : new X(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        zzaxp.zzc(parcel);
        zzc(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
