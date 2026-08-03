package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzdb extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzdc {
    public zzdb() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static com.google.android.gms.ads.internal.client.zzdc zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdc ? (com.google.android.gms.ads.internal.client.zzdc) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzda(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
