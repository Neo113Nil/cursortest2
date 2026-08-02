package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* loaded from: classes.dex */
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
        K0 j02;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            j02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            j02 = queryLocalInterface instanceof K0 ? (K0) queryLocalInterface : new J0(readStrongBinder);
        }
        zzcZ.recycle();
        return j02;
    }

    @Override // F2.I0
    public final void zzm(K0 k02) {
        Parcel zza = zza();
        zzaxp.zzf(zza, k02);
        zzda(8, zza);
    }
}
