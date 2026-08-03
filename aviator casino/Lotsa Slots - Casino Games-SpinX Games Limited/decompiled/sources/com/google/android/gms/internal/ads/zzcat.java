package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcat extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcau {
    public zzcat() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.zzcbd zzcbdVar = (com.google.android.gms.internal.ads.zzcbd) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcbd.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcbdVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
