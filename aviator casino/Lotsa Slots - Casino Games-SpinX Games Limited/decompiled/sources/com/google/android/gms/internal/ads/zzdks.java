package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdks extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzbeq {
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfkf zzd;

    public zzdks(android.content.Context context, java.util.Set set, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        super(set);
        this.zzb = new java.util.WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfkfVar;
    }

    public final synchronized void zza(android.view.View view) {
        java.util.Map map = this.zzb;
        com.google.android.gms.internal.ads.zzbes zzbesVar = (com.google.android.gms.internal.ads.zzbes) map.get(view);
        if (zzbesVar == null) {
            com.google.android.gms.internal.ads.zzbes zzbesVar2 = new com.google.android.gms.internal.ads.zzbes(this.zzc, view);
            zzbesVar2.zza(this);
            map.put(view, zzbesVar2);
            zzbesVar = zzbesVar2;
        }
        if (this.zzd.zzX) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzca)).booleanValue()) {
                zzbesVar.zzd(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbZ)).longValue());
                return;
            }
        }
        zzbesVar.zze();
    }

    public final synchronized void zzb(android.view.View view) {
        java.util.Map map = this.zzb;
        if (map.containsKey(view)) {
            ((com.google.android.gms.internal.ads.zzbes) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final synchronized void zzdj(final com.google.android.gms.internal.ads.zzbep zzbepVar) {
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzbeq) obj).zzdj(com.google.android.gms.internal.ads.zzbep.this);
            }
        });
    }
}
