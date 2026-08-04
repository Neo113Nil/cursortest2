package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbok;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends zzaxn {
    public final B0 Z(p105o3.b bVar, zzbok zzbokVar) {
        B0 c0267z0;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, bVar);
        zzaxp.zzf(parcelZza, zzbokVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0267z0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0267z0 = iInterfaceQueryLocalInterface instanceof B0 ? (B0) iInterfaceQueryLocalInterface : new C0267z0(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0267z0;
    }
}
