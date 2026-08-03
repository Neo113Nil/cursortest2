package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzca extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzfp.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(zzfpVar);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zzfp zzfpVar2 = (com.google.android.gms.ads.internal.client.zzfp) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzfp.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
