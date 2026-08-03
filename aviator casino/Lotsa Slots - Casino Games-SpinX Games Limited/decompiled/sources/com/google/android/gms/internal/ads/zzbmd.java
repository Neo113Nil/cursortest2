package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmd extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static com.google.android.gms.internal.ads.zzbme zzh(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbme ? (com.google.android.gms.internal.ads.zzbme) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
                return true;
            case 2:
                android.net.Uri zzc = zzc();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzc);
                return true;
            case 3:
                double zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(zzd);
                return true;
            case 4:
                int zze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(zze);
                return true;
            case 5:
                int zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeInt(zzf);
                return true;
            case 6:
                java.util.Map zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(zzg);
                return true;
            default:
                return false;
        }
    }
}
