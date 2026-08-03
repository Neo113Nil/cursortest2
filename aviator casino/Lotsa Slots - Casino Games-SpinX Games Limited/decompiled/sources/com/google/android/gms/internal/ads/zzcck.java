package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcck extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzccl {
    public zzcck() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzccf zzccdVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzccdVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzccdVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzccf ? (com.google.android.gms.internal.ads.zzccf) queryLocalInterface : new com.google.android.gms.internal.ads.zzccd(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(zzccdVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(readInt);
                break;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(zzeVar);
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
