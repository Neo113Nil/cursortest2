package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbgi extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbgj {
    public zzbgi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static com.google.android.gms.internal.ads.zzbgj zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgj ? (com.google.android.gms.internal.ads.zzbgj) queryLocalInterface : new com.google.android.gms.internal.ads.zzbgh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbgq zzbgoVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zze);
                return true;
            case 3:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgn) {
                    }
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbgoVar = null;
                } else {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbgoVar = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbgq ? (com.google.android.gms.internal.ads.zzbgq) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzbgo(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(asInterface, zzbgoVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzg = zzg();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzg);
                return true;
            case 6:
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 8:
                java.lang.String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
