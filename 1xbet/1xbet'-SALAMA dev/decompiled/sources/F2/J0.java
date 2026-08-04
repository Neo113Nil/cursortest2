package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends zzaxn implements K0 {
    public J0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // F2.K0
    public final void zze() {
        zzda(4, zza());
    }

    @Override // F2.K0
    public final void zzf(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(5, parcelZza);
    }

    @Override // F2.K0
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // F2.K0
    public final void zzh() {
        zzda(2, zza());
    }

    @Override // F2.K0
    public final void zzi() {
        zzda(1, zza());
    }
}
