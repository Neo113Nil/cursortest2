package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbrs extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbrt {
    public zzbrs() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static com.google.android.gms.internal.ads.zzbrt zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbrt ? (com.google.android.gms.internal.ads.zzbrt) queryLocalInterface : new com.google.android.gms.internal.ads.zzbrr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            zze();
        } else {
            if (i != 3) {
                return false;
            }
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
