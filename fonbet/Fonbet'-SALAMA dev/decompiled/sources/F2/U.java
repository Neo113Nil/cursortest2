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

/* loaded from: classes.dex */
public abstract class U extends zzaxo implements V {
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        S q7;
        switch (i7) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzfq.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    q7 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    q7 = queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzaxp.zzc(parcel);
                zzi(createTypedArrayList, q7);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zzl = zzl(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzbvt zzg = zzg(readString2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zzj = zzj(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzazq zze = zze(readString4);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaxp.zzc(parcel);
                boolean zzk = zzk(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzaxp.zzc(parcel);
                M zzf = zzf(readString6);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzf);
                return true;
            case 8:
                zzboo zzf2 = zzbon.zzf(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(zzf2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
