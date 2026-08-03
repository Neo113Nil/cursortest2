package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzew extends com.google.android.gms.ads.internal.client.zzdf {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzew(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final java.lang.String zzf() throws android.os.RemoteException {
        return this.zzb;
    }
}
