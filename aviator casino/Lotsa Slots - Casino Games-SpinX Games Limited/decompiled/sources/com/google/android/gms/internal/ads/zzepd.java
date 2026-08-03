package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepd {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzepf zzb;
    private final com.google.android.gms.internal.ads.zzfsc zzc;
    private final java.util.LinkedHashMap zzd = new java.util.LinkedHashMap();
    private final boolean zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhN)).booleanValue();
    private final com.google.android.gms.internal.ads.zzelx zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzepd(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzepf zzepfVar, com.google.android.gms.internal.ads.zzelx zzelxVar, com.google.android.gms.internal.ads.zzfsc zzfscVar) {
        this.zza = clock;
        this.zzb = zzepfVar;
        this.zzf = zzelxVar;
        this.zzc = zzfscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzepc zzepcVar = (com.google.android.gms.internal.ads.zzepc) this.zzd.get(zzfkfVar);
        if (zzepcVar == null) {
            return false;
        }
        return zzepcVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(java.util.List list) {
        this.zzi = this.zza.elapsedRealtime();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = (com.google.android.gms.internal.ads.zzfkf) it.next();
            java.lang.String str = zzfkfVar.zzw;
            if (!android.text.TextUtils.isEmpty(str)) {
                this.zzd.put(zzfkfVar, new com.google.android.gms.internal.ads.zzepc(str, zzfkfVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfkfVar != null) {
            this.zzf.zzi(zzfkfVar);
        }
        this.zzg = true;
    }

    final synchronized com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfry zzfryVar) {
        com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        java.lang.String str = zzfkfVar.zzw;
        if (str != null) {
            this.zzd.put(zzfkfVar, new com.google.android.gms.internal.ads.zzepc(str, zzfkfVar.zzaf, 9, 0L, null));
            com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzepb(this, elapsedRealtime, zzfkiVar, zzfkfVar, str, zzfryVar, zzfkqVar), com.google.android.gms.internal.ads.zzcfr.zzh);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzepc zzepcVar = (com.google.android.gms.internal.ads.zzepc) this.zzd.get(zzfkfVar);
        if (zzepcVar == null || this.zzg) {
            return;
        }
        zzepcVar.zzc = 8;
    }

    public final synchronized java.lang.String zzg() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzepc zzepcVar = (com.google.android.gms.internal.ads.zzepc) ((java.util.Map.Entry) it.next()).getValue();
            if (zzepcVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzepcVar.toString());
            }
        }
        return android.text.TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.common.util.Clock zzj() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzepf zzk() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzl() {
        return this.zzc;
    }

    final /* synthetic */ java.util.LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzelx zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
