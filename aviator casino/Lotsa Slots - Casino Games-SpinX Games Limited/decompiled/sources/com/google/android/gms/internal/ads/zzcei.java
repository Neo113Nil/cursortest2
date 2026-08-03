package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcei extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcej {
    public zzcei() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        } else if (i == 2) {
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzb(readString);
        } else {
            if (i != 3) {
                return false;
            }
            java.lang.String readString2 = parcel.readString();
            java.lang.String readString3 = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
