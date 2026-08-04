package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzboo;

/* JADX INFO: loaded from: classes.dex */
public final class N extends zzaxn {
    public N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder Z(p105o3.b bVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, bVar);
        zzaxp.zzd(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        parcelZza.writeInt(i7);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
