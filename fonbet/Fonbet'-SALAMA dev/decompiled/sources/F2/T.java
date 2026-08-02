package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvt;

/* loaded from: classes.dex */
public final class T extends zzaxn implements V {
    public T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // F2.V
    public final zzazq zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzazq zzb = zzazp.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // F2.V
    public final M zzf(String str) {
        M k7;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(7, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(readStrongBinder);
        }
        zzcZ.recycle();
        return k7;
    }

    @Override // F2.V
    public final zzbvt zzg(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbvt zzq = zzbvs.zzq(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzq;
    }

    @Override // F2.V
    public final void zzh(zzboo zzbooVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbooVar);
        zzda(8, zza);
    }

    @Override // F2.V
    public final boolean zzj(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // F2.V
    public final boolean zzk(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // F2.V
    public final boolean zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
