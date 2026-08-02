package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzboo;
import java.util.List;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* renamed from: F2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0236j0 extends zzaxo implements InterfaceC0238k0 {
    public AbstractBinderC0236j0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC0257u0 c0253s0;
        switch (i7) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzaxp.zzc(parcel);
                zzq(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzaxp.zzc(parcel);
                zzr(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzp(zzg);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzn(Z6, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(readString3, Z7);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzv ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzboo zzf2 = zzbon.zzf(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzo(zzf2);
                parcel2.writeNoException();
                return true;
            case 12:
                zzble zzc = zzbld.zzc(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzs(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg2);
                return true;
            case 14:
                zzfs zzfsVar = (zzfs) zzaxp.zza(parcel, zzfs.CREATOR);
                zzaxp.zzc(parcel);
                zzu(zzfsVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0253s0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c0253s0 = queryLocalInterface instanceof InterfaceC0257u0 ? (InterfaceC0257u0) queryLocalInterface : new C0253s0(readStrongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzaxp.zzc(parcel);
                zzm(c0253s0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zzg3 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzj(zzg3);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzaxp.zzc(parcel);
                zzt(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
