package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcug implements com.google.android.gms.internal.ads.zzbeq, com.google.android.gms.internal.ads.zzddm, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzddl {
    private final com.google.android.gms.internal.ads.zzcub zza;
    private final com.google.android.gms.internal.ads.zzcuc zzb;
    private final com.google.android.gms.internal.ads.zzbuu zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.common.util.Clock zzf;
    private final java.util.Set zzc = new java.util.HashSet();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.internal.ads.zzcuf zzh = new com.google.android.gms.internal.ads.zzcuf();
    private boolean zzi = false;
    private java.lang.ref.WeakReference zzj = new java.lang.ref.WeakReference(this);

    public zzcug(com.google.android.gms.internal.ads.zzbur zzburVar, com.google.android.gms.internal.ads.zzcuc zzcucVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcub zzcubVar, com.google.android.gms.common.util.Clock clock) {
        this.zza = zzcubVar;
        com.google.android.gms.internal.ads.zzbuc zzbucVar = com.google.android.gms.internal.ads.zzbuf.zza;
        this.zzd = zzburVar.zza("google.afma.activeView.handleUpdate", zzbucVar, zzbucVar);
        this.zzb = zzcucVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((com.google.android.gms.internal.ads.zzcku) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zza(android.content.Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zzb(android.content.Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final synchronized void zzc(android.content.Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final synchronized void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        com.google.android.gms.internal.ads.zzcuf zzcufVar = this.zzh;
        zzcufVar.zza = zzbepVar.zzj;
        zzcufVar.zzf = zzbepVar;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        if (this.zzj.get() == null) {
            zzm();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.zzcuf zzcufVar = this.zzh;
            zzcufVar.zzd = this.zzf.elapsedRealtime();
            final org.json.JSONObject zzb = this.zzb.zzb(zzcufVar);
            for (final com.google.android.gms.internal.ads.zzcku zzckuVar : this.zzc) {
                this.zze.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        org.json.JSONObject jSONObject = zzb;
                        java.lang.String obj = jSONObject.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 31);
                        sb.append("Calling AFMA_updateActiveView(");
                        sb.append(obj);
                        sb.append(")");
                        java.lang.String sb2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
                        zzckuVar.zzb("AFMA_updateActiveView", jSONObject);
                    }
                });
            }
            com.google.android.gms.internal.ads.zzcfu.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zzc.add(zzckuVar);
        this.zza.zzb(zzckuVar);
    }

    public final void zzo(java.lang.Object obj) {
        this.zzj = new java.lang.ref.WeakReference(obj);
    }
}
