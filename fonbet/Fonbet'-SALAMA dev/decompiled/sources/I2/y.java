package I2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class y extends zzaxn implements z {
    @Override // I2.z
    public final void zze(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(2, zza);
    }

    @Override // I2.z
    public final boolean zzf(InterfaceC1506a interfaceC1506a, String str, String str2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzcZ = zzcZ(1, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // I2.z
    public final boolean zzg(InterfaceC1506a interfaceC1506a, zza zzaVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzaVar);
        Parcel zzcZ = zzcZ(3, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
