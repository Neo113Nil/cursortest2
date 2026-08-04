package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzboo;

/* JADX INFO: renamed from: F2.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228f0 extends zzaxn implements InterfaceC0232h0 {
    @Override // F2.InterfaceC0232h0
    public final zzboo getAdapterCreator() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzboo zzbooVarZzf = zzbon.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbooVarZzf;
    }

    @Override // F2.InterfaceC0232h0
    public final zzey getLiteSdkVersion() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzey zzeyVar = (zzey) zzaxp.zza(parcelZzcZ, zzey.CREATOR);
        parcelZzcZ.recycle();
        return zzeyVar;
    }
}
