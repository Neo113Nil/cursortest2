package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* loaded from: classes.dex */
public abstract class B extends zzaxo implements C {
    public B() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc();
        } else {
            if (i7 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzaxp.zza(parcel, zze.CREATOR);
            zzaxp.zzc(parcel);
            zzb(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
