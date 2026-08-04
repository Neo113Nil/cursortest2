package F2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends zzaxn implements F0 {
    public D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // F2.F0
    public final Bundle zze() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzaxp.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // F2.F0
    public final zzv zzf() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        zzv zzvVar = (zzv) zzaxp.zza(parcelZzcZ, zzv.CREATOR);
        parcelZzcZ.recycle();
        return zzvVar;
    }

    @Override // F2.F0
    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // F2.F0
    public final String zzh() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // F2.F0
    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // F2.F0
    public final List zzj() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzv.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }
}
