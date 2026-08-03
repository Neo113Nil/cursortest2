package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmp extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbmq {
    public zzbmp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
                return true;
            case 3:
                java.lang.String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 4:
                java.util.List zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(zzd);
                return true;
            case 5:
                java.lang.String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 6:
                com.google.android.gms.internal.ads.zzbme zzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzf);
                return true;
            case 7:
                java.lang.String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 8:
                double zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(zzh);
                return true;
            case 9:
                java.lang.String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 10:
                java.lang.String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 11:
                android.os.Bundle zzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzea zzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzm);
                return true;
            case 14:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzo = zzo(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 16:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                com.google.android.gms.internal.ads.zzblx zzq = zzq();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzq);
                return true;
            case 18:
                com.google.android.gms.dynamic.IObjectWrapper zzr = zzr();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzr);
                return true;
            case 19:
                java.lang.String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            default:
                return false;
        }
    }
}
