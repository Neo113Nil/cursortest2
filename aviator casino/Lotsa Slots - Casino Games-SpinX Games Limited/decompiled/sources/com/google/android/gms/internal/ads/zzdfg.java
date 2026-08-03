package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdfg extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzddl, com.google.android.gms.internal.ads.zzdeq {
    private final com.google.android.gms.internal.ads.zzfkf zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;
    private final com.google.android.gms.internal.ads.zzfkq zzd;

    public zzdfg(java.util.Set set, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        super(set);
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzb = zzfkfVar;
        this.zzd = zzfkqVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziX)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdff
                @Override // com.google.android.gms.internal.ads.zzdio
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzdfi) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdfe
                @Override // com.google.android.gms.internal.ads.zzdio
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzdfi) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
