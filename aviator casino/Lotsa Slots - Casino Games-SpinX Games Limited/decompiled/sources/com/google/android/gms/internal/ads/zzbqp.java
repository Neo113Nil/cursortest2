package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbqp extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbqq {
    public zzbqp() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static com.google.android.gms.internal.ads.zzbqq zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbqq ? (com.google.android.gms.internal.ads.zzbqq) queryLocalInterface : new com.google.android.gms.internal.ads.zzbqo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.lang.String readString = parcel.readString();
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zzb(readString);
        parcel2.writeNoException();
        return true;
    }
}
