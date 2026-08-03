package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzbp extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = null;
        com.google.android.gms.ads.internal.client.zzcp zzcpVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzbn zze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zze);
                return true;
            case 2:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbh ? (com.google.android.gms.ads.internal.client.zzbh) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbf(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.internal.ads.zzbmz zzb = com.google.android.gms.internal.ads.zzbmy.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.internal.ads.zzbnc zzb2 = com.google.android.gms.internal.ads.zzbnb.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbni zzb3 = com.google.android.gms.internal.ads.zzbnh.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbnf zzb4 = com.google.android.gms.internal.ads.zzbne.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.ads.zzblt zzbltVar = (com.google.android.gms.internal.ads.zzblt) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzblt.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(zzbltVar);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzcp ? (com.google.android.gms.ads.internal.client.zzcp) queryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzcp(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzbnm zzb5 = com.google.android.gms.internal.ads.zzbnl.zzb(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzk(zzb5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions = (com.google.android.gms.ads.formats.PublisherAdViewOptions) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.internal.ads.zzbnp zzb6 = com.google.android.gms.internal.ads.zzbno.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzm(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                com.google.android.gms.internal.ads.zzbsb zzbsbVar = (com.google.android.gms.internal.ads.zzbsb) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzbsb.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(zzbsbVar);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzbsk zzb7 = com.google.android.gms.internal.ads.zzbsj.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions = (com.google.android.gms.ads.formats.AdManagerAdViewOptions) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
