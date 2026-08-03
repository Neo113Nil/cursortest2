package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbnl extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbnm {
    public zzbnl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbnm zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbnm ? (com.google.android.gms.internal.ads.zzbnm) queryLocalInterface : new com.google.android.gms.internal.ads.zzbnk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzbu zzZ = com.google.android.gms.ads.internal.client.zzbt.zzZ(parcel.readStrongBinder());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zze(zzZ, asInterface);
        parcel2.writeNoException();
        return true;
    }
}
