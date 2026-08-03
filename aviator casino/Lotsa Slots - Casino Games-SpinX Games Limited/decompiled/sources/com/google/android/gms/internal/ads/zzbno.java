package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbno extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbnp {
    public zzbno() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbnp zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbnp ? (com.google.android.gms.internal.ads.zzbnp) queryLocalInterface : new com.google.android.gms.internal.ads.zzbnn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbnv zzbntVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbntVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzbntVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbnv ? (com.google.android.gms.internal.ads.zzbnv) queryLocalInterface : new com.google.android.gms.internal.ads.zzbnt(readStrongBinder);
        }
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zze(zzbntVar);
        parcel2.writeNoException();
        return true;
    }
}
