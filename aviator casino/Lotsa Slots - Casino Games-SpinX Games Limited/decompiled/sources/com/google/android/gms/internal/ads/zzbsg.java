package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbsg extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbsh {
    public zzbsg() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
