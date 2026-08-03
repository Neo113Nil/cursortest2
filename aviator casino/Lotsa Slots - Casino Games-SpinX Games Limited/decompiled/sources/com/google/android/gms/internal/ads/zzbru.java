package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbru extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbrw {
    zzbru(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzb(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzda(1, zza);
    }
}
