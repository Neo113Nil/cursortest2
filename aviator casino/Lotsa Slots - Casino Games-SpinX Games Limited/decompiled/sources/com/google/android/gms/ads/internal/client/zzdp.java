package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzdp extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static com.google.android.gms.ads.internal.client.zzdq zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdq ? (com.google.android.gms.ads.internal.client.zzdq) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzt zztVar = (com.google.android.gms.ads.internal.client.zzt) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzt.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(zztVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
