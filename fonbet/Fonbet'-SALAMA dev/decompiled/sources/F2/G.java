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

/* loaded from: classes.dex */
public final class G extends zzaxn implements I {
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // F2.I
    public final F zze() {
        F d7;
        Parcel zzcZ = zzcZ(1, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            d7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            d7 = queryLocalInterface instanceof F ? (F) queryLocalInterface : new D(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        zzcZ.recycle();
        return d7;
    }

    @Override // F2.I
    public final void zzh(String str, zzbgq zzbgqVar, zzbgn zzbgnVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzf(zza, zzbgqVar);
        zzaxp.zzf(zza, zzbgnVar);
        zzda(5, zza);
    }

    @Override // F2.I
    public final void zzk(zzbgx zzbgxVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbgxVar);
        zzda(10, zza);
    }

    @Override // F2.I
    public final void zzl(InterfaceC0266z interfaceC0266z) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0266z);
        zzda(2, zza);
    }

    @Override // F2.I
    public final void zzo(zzbey zzbeyVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbeyVar);
        zzda(6, zza);
    }
}
