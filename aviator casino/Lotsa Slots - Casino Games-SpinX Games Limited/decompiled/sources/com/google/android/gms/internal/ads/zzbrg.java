package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbrg extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbrh {
    public zzbrg() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.ParcelFileDescriptor.CREATOR);
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
