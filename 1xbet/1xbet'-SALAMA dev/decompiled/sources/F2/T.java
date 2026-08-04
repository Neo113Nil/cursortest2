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

/* JADX INFO: loaded from: classes.dex */
public final class T extends zzaxn implements V {
    public T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // F2.V
    public final zzazq zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzazq zzazqVarZzb = zzazp.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzazqVarZzb;
    }

    @Override // F2.V
    public final M zzf(String str) {
        M k7;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(7, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            k7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelZzcZ.recycle();
        return k7;
    }

    @Override // F2.V
    public final zzbvt zzg(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzbvt zzbvtVarZzq = zzbvs.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbvtVarZzq;
    }

    @Override // F2.V
    public final void zzh(zzboo zzbooVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbooVar);
        zzda(8, parcelZza);
    }

    @Override // F2.V
    public final boolean zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // F2.V
    public final boolean zzk(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // F2.V
    public final boolean zzl(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
