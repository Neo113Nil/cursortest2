package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class A0 extends zzaxo implements B0 {
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String readString = parcel.readString();
        InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
        InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
        zzaxp.zzc(parcel);
        zze(readString, Z6, Z7);
        parcel2.writeNoException();
        return true;
    }
}
