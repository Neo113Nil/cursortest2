package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends zzaxo implements F {
    public E() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzm zzmVar = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
            zzaxp.zzc(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i7 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i9 = zzaxp.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i7 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i7 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
            int i10 = parcel.readInt();
            zzaxp.zzc(parcel);
            zzh(zzmVar2, i10);
            parcel2.writeNoException();
        }
        return true;
    }
}
