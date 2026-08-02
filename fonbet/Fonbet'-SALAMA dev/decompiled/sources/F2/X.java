package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;

/* loaded from: classes.dex */
public final class X extends zzaxn implements Z {
    public X(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // F2.Z
    public final void zzc(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(1, zza);
    }
}
