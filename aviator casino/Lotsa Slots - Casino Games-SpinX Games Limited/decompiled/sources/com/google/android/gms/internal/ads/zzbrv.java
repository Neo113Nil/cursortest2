package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbrv extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbrw {
    public zzbrv() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static com.google.android.gms.internal.ads.zzbrw zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbrw ? (com.google.android.gms.internal.ads.zzbrw) queryLocalInterface : new com.google.android.gms.internal.ads.zzbru(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.zzbrp.CREATOR);
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
