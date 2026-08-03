package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcce extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzccf {
    public zzcce() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static com.google.android.gms.internal.ads.zzccf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzccf ? (com.google.android.gms.internal.ads.zzccf) queryLocalInterface : new com.google.android.gms.internal.ads.zzccd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else {
            if (i != 2) {
                return false;
            }
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }
}
