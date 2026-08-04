package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends zzaxn implements I0 {
    public G0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // F2.I0
    public final float zze() {
        throw null;
    }

    @Override // F2.I0
    public final float zzf() {
        throw null;
    }

    @Override // F2.I0
    public final float zzg() {
        throw null;
    }

    @Override // F2.I0
    public final K0 zzi() {
        K0 j3;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j3 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            j3 = iInterfaceQueryLocalInterface instanceof K0 ? (K0) iInterfaceQueryLocalInterface : new J0(strongBinder);
        }
        parcelZzcZ.recycle();
        return j3;
    }

    @Override // F2.I0
    public final void zzm(K0 k7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, k7);
        zzda(8, parcelZza);
    }
}
