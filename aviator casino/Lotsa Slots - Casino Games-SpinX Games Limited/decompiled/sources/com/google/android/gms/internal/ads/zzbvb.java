package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbvb extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static com.google.android.gms.internal.ads.zzbvc zzf(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvc ? (com.google.android.gms.internal.ads.zzbvc) queryLocalInterface : new com.google.android.gms.internal.ads.zzbva(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            com.google.android.gms.internal.ads.zzbvf zzb = zzb(readString);
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
        } else if (i == 2) {
            java.lang.String readString2 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            boolean zzc = zzc(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzc ? 1 : 0);
        } else if (i == 3) {
            java.lang.String readString3 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            com.google.android.gms.internal.ads.zzbxb zze = zze(readString3);
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zze);
        } else {
            if (i != 4) {
                return false;
            }
            java.lang.String readString4 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
