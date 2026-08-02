package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbls;

/* loaded from: classes.dex */
public abstract class H extends zzaxo implements I {
    public H() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC0266z interfaceC0266z = null;
        C0222c0 c0222c0 = null;
        switch (i7) {
            case 1:
                F zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0266z = queryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) queryLocalInterface : new C0262x(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzl(interfaceC0266z);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgh zzb = zzbgg.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgk zzb2 = zzbgj.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbgq zzb3 = zzbgp.zzb(parcel.readStrongBinder());
                zzbgn zzb4 = zzbgm.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                zzaxp.zzc(parcel);
                zzo(zzbeyVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0222c0 = queryLocalInterface2 instanceof C0222c0 ? (C0222c0) queryLocalInterface2 : new C0222c0(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzq(c0222c0);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbgu zzb5 = zzbgt.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                zzaxp.zzc(parcel);
                zzj(zzb5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzaxp.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzaxp.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbgx zzb6 = zzbgw.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblj zzbljVar = (zzblj) zzaxp.zza(parcel, zzblj.CREATOR);
                zzaxp.zzc(parcel);
                zzn(zzbljVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbls zzb7 = zzblr.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzaxp.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzaxp.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
