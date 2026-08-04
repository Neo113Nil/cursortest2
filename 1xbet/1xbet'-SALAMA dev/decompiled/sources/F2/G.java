package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgx;

/* JADX INFO: loaded from: classes.dex */
public final class G extends zzaxn implements I {
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // F2.I
    public final F zze() {
        F d7;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            d7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            d7 = iInterfaceQueryLocalInterface instanceof F ? (F) iInterfaceQueryLocalInterface : new D(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // F2.I
    public final void zzh(String str, zzbgq zzbgqVar, zzbgn zzbgnVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbgqVar);
        zzaxp.zzf(parcelZza, zzbgnVar);
        zzda(5, parcelZza);
    }

    @Override // F2.I
    public final void zzk(zzbgx zzbgxVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbgxVar);
        zzda(10, parcelZza);
    }

    @Override // F2.I
    public final void zzl(InterfaceC0266z interfaceC0266z) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0266z);
        zzda(2, parcelZza);
    }

    @Override // F2.I
    public final void zzo(zzbey zzbeyVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbeyVar);
        zzda(6, parcelZza);
    }
}
