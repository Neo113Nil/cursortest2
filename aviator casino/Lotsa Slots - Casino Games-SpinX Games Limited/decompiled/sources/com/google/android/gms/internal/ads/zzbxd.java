package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbxd extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbxe {
    public zzbxd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(readString);
        } else if (i == 2) {
            java.lang.String readString2 = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
