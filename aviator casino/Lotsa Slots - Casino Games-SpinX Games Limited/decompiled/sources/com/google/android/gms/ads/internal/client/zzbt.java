package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzbt extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static com.google.android.gms.ads.internal.client.zzbu zzZ(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = null;
        com.google.android.gms.ads.internal.client.zzcs zzcsVar = null;
        com.google.android.gms.ads.internal.client.zzbk zzbkVar = null;
        com.google.android.gms.ads.internal.client.zzdq zzdqVar = null;
        com.google.android.gms.ads.internal.client.zzby zzbyVar = null;
        com.google.android.gms.ads.internal.client.zzcp zzcpVar = null;
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = null;
        com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzd = zzd();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzd ? 1 : 0);
                return true;
            case 4:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbh ? (com.google.android.gms.ads.internal.client.zzbh) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbf(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzdS(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzclVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzcl ? (com.google.android.gms.ads.internal.client.zzcl) queryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzcj(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzr zzn = zzn();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzn);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzbzk zzb2 = com.google.android.gms.internal.ads.zzbzj.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(zzb2);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.internal.ads.zzbzn zzb3 = com.google.android.gms.internal.ads.zzbzm.zzb(parcel.readStrongBinder());
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzq(zzb3, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                java.lang.String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 19:
                com.google.android.gms.internal.ads.zzbjl zzb4 = com.google.android.gms.internal.ads.zzbjk.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzx(zzb4);
                parcel2.writeNoException();
                return true;
            case 20:
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof com.google.android.gms.ads.internal.client.zzbe ? (com.google.android.gms.ads.internal.client.zzbe) queryLocalInterface3 : new com.google.android.gms.ads.internal.client.zzbc(readStrongBinder3);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzy(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface4 instanceof com.google.android.gms.ads.internal.client.zzcp ? (com.google.android.gms.ads.internal.client.zzcp) queryLocalInterface4 : new com.google.android.gms.ads.internal.client.zzcp(readStrongBinder4);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzY(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzz(zza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzB = zzB();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzB ? 1 : 0);
                return true;
            case 24:
                com.google.android.gms.internal.ads.zzcbv zzb5 = com.google.android.gms.internal.ads.zzcbu.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzC(zzb5);
                parcel2.writeNoException();
                return true;
            case 25:
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzD(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzF = zzF();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzF);
                return true;
            case 29:
                com.google.android.gms.ads.internal.client.zzfw zzfwVar = (com.google.android.gms.ads.internal.client.zzfw) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzfw.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzG(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                com.google.android.gms.ads.internal.client.zzee zzeeVar = (com.google.android.gms.ads.internal.client.zzee) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzH(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                java.lang.String zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzu);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzcl zzv = zzv();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzv);
                return true;
            case 33:
                com.google.android.gms.ads.internal.client.zzbh zzw = zzw();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzw);
                return true;
            case 34:
                boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzK(zza2);
                parcel2.writeNoException();
                return true;
            case 35:
                java.lang.String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) queryLocalInterface5 : new com.google.android.gms.ads.internal.client.zzbw(readStrongBinder5);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                android.os.Bundle zzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzk);
                return true;
            case 38:
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzE(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.ads.internal.client.zzx zzxVar = (com.google.android.gms.ads.internal.client.zzx) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzx.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                com.google.android.gms.internal.ads.zzbgm zze2 = com.google.android.gms.internal.ads.zzbgl.zze(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzJ(zze2);
                parcel2.writeNoException();
                return true;
            case 41:
                com.google.android.gms.ads.internal.client.zzdx zzt = zzt();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzt);
                return true;
            case 42:
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdqVar = queryLocalInterface6 instanceof com.google.android.gms.ads.internal.client.zzdq ? (com.google.android.gms.ads.internal.client.zzdq) queryLocalInterface6 : new com.google.android.gms.ads.internal.client.zzdo(readStrongBinder6);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzP(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof com.google.android.gms.ads.internal.client.zzbk ? (com.google.android.gms.ads.internal.client.zzbk) queryLocalInterface7 : new com.google.android.gms.ads.internal.client.zzbi(readStrongBinder7);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzQ(zzmVar2, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzR(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcsVar = queryLocalInterface8 instanceof com.google.android.gms.ads.internal.client.zzcs ? (com.google.android.gms.ads.internal.client.zzcs) queryLocalInterface8 : new com.google.android.gms.ads.internal.client.zzcq(readStrongBinder8);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzS(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i5 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 47:
                long zzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(zzU);
                return true;
            case 48:
                long readLong = parcel.readLong();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzT(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
