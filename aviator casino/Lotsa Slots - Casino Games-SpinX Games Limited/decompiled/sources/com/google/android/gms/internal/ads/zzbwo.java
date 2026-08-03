package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbwo extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(asInterface);
        } else if (i == 2) {
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(readString);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.internal.ads.zzbvl zzb = com.google.android.gms.internal.ads.zzbvk.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
