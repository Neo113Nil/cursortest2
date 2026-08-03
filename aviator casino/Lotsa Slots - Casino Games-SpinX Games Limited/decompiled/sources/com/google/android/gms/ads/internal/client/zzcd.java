package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzcd extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdx zzdvVar;
        if (i == 1) {
            java.lang.String readString = parcel.readString();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzdvVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdx ? (com.google.android.gms.ads.internal.client.zzdx) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdv(readStrongBinder);
            }
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(readString, zzdvVar);
        } else if (i == 2) {
            java.lang.String readString2 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            java.lang.String readString3 = parcel.readString();
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzg(readString3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
