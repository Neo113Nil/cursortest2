package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbvk extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbvl {
    public zzbvk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static com.google.android.gms.internal.ads.zzbvl zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvl ? (com.google.android.gms.internal.ads.zzbvl) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper zze = zze();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zze);
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
