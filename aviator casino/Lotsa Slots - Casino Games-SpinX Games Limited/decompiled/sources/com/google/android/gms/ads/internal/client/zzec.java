package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzec extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zzh();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzi(zza);
        }
        parcel2.writeNoException();
        return true;
    }
}
