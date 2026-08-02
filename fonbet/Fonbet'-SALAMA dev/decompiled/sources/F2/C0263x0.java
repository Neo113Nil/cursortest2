package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* renamed from: F2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263x0 extends zzaxn implements InterfaceC0265y0 {
    public C0263x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // F2.InterfaceC0265y0
    public final void c0(zzt zztVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zztVar);
        zzda(1, zza);
    }

    @Override // F2.InterfaceC0265y0
    public final boolean zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
