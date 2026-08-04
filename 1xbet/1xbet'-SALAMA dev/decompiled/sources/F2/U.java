package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzfq;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbvt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends zzaxo implements V {
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        S q7;
        switch (i7) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzfq.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    q7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    q7 = iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new Q(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzaxp.zzc(parcel);
                zzi(arrayListCreateTypedArrayList, q7);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzbvt zzbvtVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbvtVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzazq zzazqVarZze = zze(string4);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzazqVarZze);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzaxp.zzc(parcel);
                M mZzf = zzf(string6);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mZzf);
                return true;
            case 8:
                zzboo zzbooVarZzf = zzbon.zzf(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(zzbooVarZzf);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
