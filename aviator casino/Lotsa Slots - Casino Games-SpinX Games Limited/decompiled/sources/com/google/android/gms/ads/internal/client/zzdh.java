package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzdh implements com.google.android.gms.ads.MuteThisAdReason {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.internal.client.zzdg zzb;

    public zzdh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        java.lang.String str;
        this.zzb = zzdgVar;
        try {
            str = zzdgVar.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final java.lang.String getDescription() {
        return this.zza;
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzdg zza() {
        return this.zzb;
    }
}
