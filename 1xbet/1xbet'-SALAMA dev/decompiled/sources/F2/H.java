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

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends zzaxo implements I {
    public H() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC0266z c0262x = null;
        C0222c0 c0222c0 = null;
        switch (i7) {
            case 1:
                F fZze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, fZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c0262x = iInterfaceQueryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) iInterfaceQueryLocalInterface : new C0262x(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzl(c0262x);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgh zzbghVarZzb = zzbgg.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(zzbghVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgk zzbgkVarZzb = zzbgj.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzg(zzbgkVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbgq zzbgqVarZzb = zzbgp.zzb(parcel.readStrongBinder());
                zzbgn zzbgnVarZzb = zzbgm.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(string, zzbgqVarZzb, zzbgnVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                zzaxp.zzc(parcel);
                zzo(zzbeyVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0222c0 = iInterfaceQueryLocalInterface2 instanceof C0222c0 ? (C0222c0) iInterfaceQueryLocalInterface2 : new C0222c0(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzq(c0222c0);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbgu zzbguVarZzb = zzbgt.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                zzaxp.zzc(parcel);
                zzj(zzbguVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzaxp.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzaxp.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbgx zzbgxVarZzb = zzbgw.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzk(zzbgxVarZzb);
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
                zzbls zzblsVarZzb = zzblr.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(zzblsVarZzb);
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
