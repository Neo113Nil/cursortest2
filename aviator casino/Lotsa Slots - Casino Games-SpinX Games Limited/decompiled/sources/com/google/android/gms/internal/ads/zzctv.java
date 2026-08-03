package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzctv implements com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdkp, com.google.android.gms.internal.ads.zzdfm {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzfkq zze;
    private final com.google.android.gms.internal.ads.zzfkf zzf;
    private final com.google.android.gms.internal.ads.zzfry zzg;
    private final com.google.android.gms.internal.ads.zzfll zzh;
    private final com.google.android.gms.internal.ads.zzbap zzi;
    private final com.google.android.gms.internal.ads.zzbjx zzj;
    private final java.lang.ref.WeakReference zzk;
    private final java.lang.ref.WeakReference zzl;
    private final com.google.android.gms.internal.ads.zzdbu zzm;
    private final com.google.android.gms.internal.ads.zzdfg zzn;
    private final com.google.android.gms.internal.ads.zzdbn zzo;
    private final java.util.Set zzp;
    private boolean zzq;
    private final java.util.concurrent.atomic.AtomicBoolean zzr = new java.util.concurrent.atomic.AtomicBoolean();
    private com.google.android.gms.internal.ads.zzcfe zzs = null;

    zzctv(android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfry zzfryVar, com.google.android.gms.internal.ads.zzfll zzfllVar, android.view.View view, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzbjx zzbjxVar, com.google.android.gms.internal.ads.zzbjz zzbjzVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzdbu zzdbuVar, com.google.android.gms.internal.ads.zzdfg zzdfgVar, com.google.android.gms.internal.ads.zzdbn zzdbnVar, java.util.Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfkqVar;
        this.zzf = zzfkfVar;
        this.zzg = zzfryVar;
        this.zzh = zzfllVar;
        this.zzi = zzbapVar;
        this.zzk = new java.lang.ref.WeakReference(view);
        this.zzl = new java.lang.ref.WeakReference(zzckuVar);
        this.zzj = zzbjxVar;
        this.zzm = zzdbuVar;
        this.zzn = zzdfgVar;
        this.zzo = zzdbnVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final java.util.List zzp() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmO)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            android.content.Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                java.lang.Integer zzu = com.google.android.gms.ads.internal.util.zzs.zzu(context);
                if (zzu != null) {
                    int min = java.lang.Math.min(zzu.intValue(), 20);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(min);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        android.net.Uri.Builder buildUpon = android.net.Uri.parse((java.lang.String) it.next()).buildUpon();
                        valueOf.getClass();
                        arrayList.add(buildUpon.appendQueryParameter("dspct", java.lang.Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i, final int i2) {
        android.view.View view;
        if (i <= 0 || !((view = (android.view.View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzctv.this.zzm(i, i2);
                }
            }, i2, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        java.lang.String str;
        int i;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        java.util.List list = zzfkfVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpk)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzet)).booleanValue()) {
            str = this.zzi.zzb().zzj(this.zza, (android.view.View) this.zzk.get(), null);
        } else {
            str = null;
        }
        if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbd)).booleanValue() && this.zze.zzb.zzb.zzh) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfkfVar, false, str, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzg.zze()).booleanValue() && ((i = zzfkfVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        com.google.android.gms.internal.ads.zzhbw.zzr((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zza(null)), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbH)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd), new com.google.android.gms.internal.ads.zzctp(this, str), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbd)).booleanValue() && this.zze.zzb.zzb.zzh) && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(this.zzj.zzb()), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzctu.zza, com.google.android.gms.internal.ads.zzcfr.zzh), new com.google.android.gms.internal.ads.zzcto(this), this.zzb);
            return;
        }
        com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
        com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zze;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        zzfllVar.zzb(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
        com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        zzfllVar.zza(zzfryVar.zzc(zzfkfVar, zzfkfVar.zzh, zzcbpVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeC)).intValue();
            if (intValue > 0) {
                zzy(intValue, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeD)).intValue());
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeB)).booleanValue()) {
                this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzctv.this.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
        com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zze;
        com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        zzfllVar.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
        com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zze;
        com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        zzfllVar.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzg() {
        com.google.android.gms.internal.ads.zzdbu zzdbuVar;
        if (this.zzq) {
            java.util.ArrayList arrayList = new java.util.ArrayList(zzp());
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
            arrayList.addAll(zzfkfVar.zzf);
            this.zzh.zza(this.zzg.zzb(this.zze, zzfkfVar, true, null, null, arrayList, null, null), null);
        } else {
            com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
            com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
            com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zze;
            com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zzf;
            zzfllVar.zza(zzfryVar.zza(zzfkqVar, zzfkfVar2, zzfkfVar2.zzm), null);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzey)).booleanValue() && (zzdbuVar = this.zzm) != null) {
                java.util.List list = zzdbuVar.zzb().zzm;
                java.lang.String zzg = zzdbuVar.zzc().zzg();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.google.android.gms.internal.ads.zzfry.zzd((java.lang.String) it.next(), "@gw_adnetstatus@", zzg));
                }
                long zzh = zzdbuVar.zzc().zzh();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(com.google.android.gms.internal.ads.zzfry.zzd((java.lang.String) it2.next(), "@gw_ttr@", java.lang.Long.toString(zzh, 10)));
                }
                zzfllVar.zza(zzfryVar.zza(zzdbuVar.zza(), zzdbuVar.zzb(), arrayList3), null);
            }
            zzfllVar.zza(zzfryVar.zza(zzfkqVar, zzfkfVar2, zzfkfVar2.zzf), null);
        }
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zzi() {
        com.google.android.gms.internal.ads.zzfry zzfryVar = this.zzg;
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zze;
        com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzh;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        zzfllVar.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcg)).booleanValue()) {
            int i = zzeVar.zza;
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : zzfkfVar.zzo) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(com.google.android.gms.internal.ads.zzfry.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfkfVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzk() {
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzf;
        if (zzfkfVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfkfVar, zzfkfVar.zzaA), null);
        }
    }

    final /* synthetic */ void zzl() {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzctt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzctv.this.zzo();
            }
        });
    }

    final /* synthetic */ void zzm(final int i, final int i2) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcts
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzctv.this.zzn(i, i2);
            }
        });
    }

    final /* synthetic */ void zzn(int i, int i2) {
        zzy(i - 1, i2);
    }

    final /* synthetic */ android.content.Context zzq() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkq zzr() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzs() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfry zzt() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfll zzu() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfg zzv() {
        return this.zzn;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdbn zzw() {
        return this.zzo;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcfe zzx() {
        return this.zzs;
    }
}
