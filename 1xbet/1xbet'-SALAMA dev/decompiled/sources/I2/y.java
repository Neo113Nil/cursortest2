package I2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public final class y extends zzaxn implements z {
    @Override // I2.z
    public final void zze(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(2, parcelZza);
    }

    @Override // I2.z
    public final boolean zzf(p105o3.a aVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // I2.z
    public final boolean zzg(p105o3.a aVar, zza zzaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzaVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
