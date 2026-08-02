package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* renamed from: F2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0255t0 extends zzaxo implements InterfaceC0257u0 {
    public AbstractBinderC0255t0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zze zzeVar = (zze) zzaxp.zza(parcel, zze.CREATOR);
        zzaxp.zzc(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
