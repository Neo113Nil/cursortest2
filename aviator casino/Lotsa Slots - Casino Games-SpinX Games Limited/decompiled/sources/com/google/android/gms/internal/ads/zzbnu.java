package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbnu extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbnv {
    public zzbnu() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbns zzbnqVar;
        switch (i) {
            case 2:
                java.lang.String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 3:
                java.util.List zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(zzf);
                return true;
            case 4:
                java.lang.String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 5:
                com.google.android.gms.internal.ads.zzbme zzh = zzh();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzh);
                return true;
            case 6:
                java.lang.String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 7:
                java.lang.String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(zzk);
                return true;
            case 9:
                java.lang.String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            case 10:
                java.lang.String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzn = zzn();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzn);
                return true;
            case 12:
                java.lang.String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzblx zzq = zzq();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzq);
                return true;
            case 15:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 17:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.gms.dynamic.IObjectWrapper zzu = zzu();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzu);
                return true;
            case 19:
                com.google.android.gms.dynamic.IObjectWrapper zzv = zzv();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzv);
                return true;
            case 20:
                android.os.Bundle zzw = zzw();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzw);
                return true;
            case 21:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbnqVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbnqVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbns ? (com.google.android.gms.internal.ads.zzbns) queryLocalInterface : new com.google.android.gms.internal.ads.zzbnq(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzx(zzbnqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                java.util.List zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(zzz);
                return true;
            case 24:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdg zzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzB(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdc zzb2 = com.google.android.gms.ads.internal.client.zzdb.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzC(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                com.google.android.gms.internal.ads.zzbmb zzF = zzF();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzF);
                return true;
            case 30:
                boolean zzG = zzG();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzG ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdx zzH = zzH();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzH);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdq zzb3 = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzI(zzb3);
                parcel2.writeNoException();
                return true;
            case 33:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long zzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(zzK);
                return true;
            case 35:
                long readLong = parcel.readLong();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzL(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
