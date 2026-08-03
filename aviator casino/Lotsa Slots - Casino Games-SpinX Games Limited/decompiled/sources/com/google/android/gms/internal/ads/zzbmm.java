package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmm extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbmn {
    public zzbmm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzb(asInterface);
        } else if (i == 2) {
            zzc();
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzd(asInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
