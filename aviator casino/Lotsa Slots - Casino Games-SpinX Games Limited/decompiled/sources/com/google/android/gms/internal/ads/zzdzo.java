package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzo implements com.google.android.gms.internal.ads.zzfpl {
    private final com.google.android.gms.internal.ads.zzdzg zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();

    public zzdzo(com.google.android.gms.internal.ads.zzdzg zzdzgVar, java.util.Set set, com.google.android.gms.common.util.Clock clock) {
        this.zzb = zzdzgVar;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzdzn zzdznVar = (com.google.android.gms.internal.ads.zzdzn) it.next();
            this.zzd.put(zzdznVar.zzc(), zzdznVar);
        }
        this.zzc = clock;
    }

    private final void zze(com.google.android.gms.internal.ads.zzfpe zzfpeVar, boolean z) {
        com.google.android.gms.internal.ads.zzdzn zzdznVar = (com.google.android.gms.internal.ads.zzdzn) this.zzd.get(zzfpeVar);
        if (zzdznVar == null) {
            return;
        }
        java.lang.String str = true != z ? "f." : "s.";
        java.util.Map map = this.zza;
        com.google.android.gms.internal.ads.zzfpe zzb = zzdznVar.zzb();
        if (map.containsKey(zzb)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) map.get(zzb)).longValue();
            com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zzb;
            java.lang.String zza = zzdznVar.zza();
            java.util.Map zzc = zzdzgVar.zzc();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdL(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdM(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        this.zza.put(zzfpeVar, java.lang.Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdN(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str, java.lang.Throwable th) {
        java.util.Map map = this.zza;
        if (map.containsKey(zzfpeVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) map.get(zzfpeVar)).longValue();
            java.util.Map zzc = this.zzb.zzc();
            java.lang.String.valueOf(str);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            java.lang.String l = java.lang.Long.toString(elapsedRealtime);
            java.lang.String.valueOf(l);
            zzc.put("task.".concat(valueOf), "f.".concat(java.lang.String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfpeVar)) {
            zze(zzfpeVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdO(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        java.util.Map map = this.zza;
        if (map.containsKey(zzfpeVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((java.lang.Long) map.get(zzfpeVar)).longValue();
            java.util.Map zzc = this.zzb.zzc();
            java.lang.String.valueOf(str);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            java.lang.String l = java.lang.Long.toString(elapsedRealtime);
            java.lang.String.valueOf(l);
            zzc.put("task.".concat(valueOf), "s.".concat(java.lang.String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfpeVar)) {
            zze(zzfpeVar, true);
        }
    }
}
