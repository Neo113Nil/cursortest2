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

/* JADX INFO: renamed from: F2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
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
                float f7 = parcel.readFloat();
                zzaxp.zzc(parcel);
                zzq(f7);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzaxp.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzn(aVarZ, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(string3, aVarZ2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzboo zzbooVarZzf = zzbon.zzf(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzo(zzbooVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzble zzbleVarZzc = zzbld.zzc(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzs(zzbleVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
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
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0253s0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c0253s0 = iInterfaceQueryLocalInterface instanceof InterfaceC0257u0 ? (InterfaceC0257u0) iInterfaceQueryLocalInterface : new C0253s0(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzaxp.zzc(parcel);
                zzm(c0253s0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzaxp.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
