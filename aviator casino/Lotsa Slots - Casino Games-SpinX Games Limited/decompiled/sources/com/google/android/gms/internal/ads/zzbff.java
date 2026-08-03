package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbff extends com.google.android.gms.ads.internal.client.zzck {
    private final com.google.android.gms.ads.admanager.AppEventListener zza;

    public zzbff(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zzb(java.lang.String str, java.lang.String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzc() {
        return this.zza;
    }
}
