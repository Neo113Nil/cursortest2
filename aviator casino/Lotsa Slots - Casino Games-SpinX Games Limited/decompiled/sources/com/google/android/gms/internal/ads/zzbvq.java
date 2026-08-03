package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbvq extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbvr {
    public zzbvq() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static com.google.android.gms.internal.ads.zzbvr zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvr ? (com.google.android.gms.internal.ads.zzbvr) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
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
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper zzp = zzp();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzp);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper zzq = zzq();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzq);
                return true;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper zzr = zzr();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzr);
                return true;
            case 16:
                android.os.Bundle zzs = zzs();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzs);
                return true;
            case 17:
                boolean zzt = zzt();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            case 18:
                boolean zzu = zzu();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzw(asInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzx(asInterface2, asInterface3, asInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzy(asInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(zzz);
                return true;
            case 24:
                float zzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(zzA);
                return true;
            case 25:
                float zzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(zzB);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
