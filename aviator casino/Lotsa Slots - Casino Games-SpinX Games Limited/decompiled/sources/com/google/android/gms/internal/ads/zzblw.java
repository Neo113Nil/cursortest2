package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzblw extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzblx {
    public zzblw() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static com.google.android.gms.internal.ads.zzblx zzj(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzblx ? (com.google.android.gms.internal.ads.zzblx) queryLocalInterface : new com.google.android.gms.internal.ads.zzblv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            java.lang.String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
            return true;
        }
        if (i != 3) {
            return false;
        }
        java.util.List zzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(zzc);
        return true;
    }
}
