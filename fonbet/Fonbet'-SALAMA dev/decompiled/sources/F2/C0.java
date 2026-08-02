package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbok;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class C0 extends zzaxn {
    public final B0 Z(BinderC1507b binderC1507b, zzbok zzbokVar) {
        B0 c0267z0;
        Parcel zza = zza();
        zzaxp.zzf(zza, binderC1507b);
        zzaxp.zzf(zza, zzbokVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            c0267z0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0267z0 = queryLocalInterface instanceof B0 ? (B0) queryLocalInterface : new C0267z0(readStrongBinder);
        }
        zzcZ.recycle();
        return c0267z0;
    }
}
