package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 extends zzaxo implements B0 {
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String string = parcel.readString();
        p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
        p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
        zzaxp.zzc(parcel);
        zze(string, aVarZ, aVarZ2);
        parcel2.writeNoException();
        return true;
    }
}
