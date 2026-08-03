package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbnd extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbnf {
    zzbnd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(com.google.android.gms.internal.ads.zzbmv zzbmvVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbmvVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}
