package F2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class D0 extends zzaxn implements F0 {
    public D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // F2.F0
    public final Bundle zze() {
        Parcel zzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzaxp.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // F2.F0
    public final zzv zzf() {
        Parcel zzcZ = zzcZ(4, zza());
        zzv zzvVar = (zzv) zzaxp.zza(zzcZ, zzv.CREATOR);
        zzcZ.recycle();
        return zzvVar;
    }

    @Override // F2.F0
    public final String zzg() {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // F2.F0
    public final String zzh() {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // F2.F0
    public final String zzi() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // F2.F0
    public final List zzj() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzv.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }
}
