package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: renamed from: F2.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267z0 extends zzaxn implements B0 {
    public C0267z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // F2.B0
    public final void zze(String str, p105o3.a aVar, p105o3.a aVar2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        zzda(1, parcelZza);
    }
}
