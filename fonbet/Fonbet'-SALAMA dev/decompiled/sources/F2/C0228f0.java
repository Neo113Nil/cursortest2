package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzboo;

/* renamed from: F2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228f0 extends zzaxn implements InterfaceC0232h0 {
    @Override // F2.InterfaceC0232h0
    public final zzboo getAdapterCreator() {
        Parcel zzcZ = zzcZ(2, zza());
        zzboo zzf = zzbon.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    @Override // F2.InterfaceC0232h0
    public final zzey getLiteSdkVersion() {
        Parcel zzcZ = zzcZ(1, zza());
        zzey zzeyVar = (zzey) zzaxp.zza(zzcZ, zzey.CREATOR);
        zzcZ.recycle();
        return zzeyVar;
    }
}
