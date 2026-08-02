package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import o3.InterfaceC1506a;

/* renamed from: F2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267z0 extends zzaxn implements B0 {
    public C0267z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // F2.B0
    public final void zze(String str, InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zzda(1, zza);
    }
}
