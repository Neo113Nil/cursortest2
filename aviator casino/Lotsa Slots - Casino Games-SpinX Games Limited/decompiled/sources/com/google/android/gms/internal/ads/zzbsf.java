package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbsf extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbsh {
    zzbsf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }
}
