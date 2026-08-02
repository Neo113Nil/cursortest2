package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzboo;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class N extends zzaxn {
    public N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder Z(BinderC1507b binderC1507b, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, binderC1507b);
        zzaxp.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        zza.writeInt(i7);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
