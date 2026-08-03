package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzetf implements com.google.android.gms.internal.ads.zzdfi {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zza, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
