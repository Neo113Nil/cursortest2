package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbgl extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbgm {
    public zzbgl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static com.google.android.gms.internal.ads.zzbgm zze(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgm ? (com.google.android.gms.internal.ads.zzbgm) queryLocalInterface : new com.google.android.gms.internal.ads.zzbgk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbgj zzbghVar;
        if (i == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbghVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbghVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgj ? (com.google.android.gms.internal.ads.zzbgj) queryLocalInterface : new com.google.android.gms.internal.ads.zzbgh(readStrongBinder);
            }
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzb(zzbghVar);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzc(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
