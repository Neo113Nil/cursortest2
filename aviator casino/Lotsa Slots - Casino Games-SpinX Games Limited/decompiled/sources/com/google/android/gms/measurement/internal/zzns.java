package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzns {
    private final android.content.Context zza;

    public zzns(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zza = context;
    }

    public static final void zzi(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onRebind called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        java.lang.String.valueOf(action);
        android.util.Log.v("FA", "onRebind called. action: ".concat(java.lang.String.valueOf(action)));
    }

    public static final boolean zzj(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        java.lang.String action = intent.getAction();
        java.lang.String.valueOf(action);
        android.util.Log.v("FA", "onUnbind called for intent. action: ".concat(java.lang.String.valueOf(action)));
        return true;
    }

    private final void zzk(com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.Runnable runnable) {
        zzpfVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zznn(this, zzpfVar, runnable));
    }

    public final void zza() {
        java.lang.String simpleName = this.zza.getClass().getSimpleName();
        java.lang.String.valueOf(simpleName);
        android.util.Log.v("FA", java.lang.String.valueOf(simpleName).concat(" is starting up."));
    }

    public final void zzb() {
        java.lang.String simpleName = this.zza.getClass().getSimpleName();
        java.lang.String.valueOf(simpleName);
        android.util.Log.v("FA", java.lang.String.valueOf(simpleName).concat(" is shutting down."));
    }

    public final int zzc(final android.content.Intent intent, int i, final int i2) {
        if (intent == null) {
            android.util.Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        android.content.Context context = this.zza;
        com.google.android.gms.measurement.internal.zzib zzy = com.google.android.gms.measurement.internal.zzib.zzy(context, null, null);
        final com.google.android.gms.measurement.internal.zzgt zzaV = zzy.zzaV();
        java.lang.String action = intent.getAction();
        zzy.zzaU();
        zzaV.zzk().zzc("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(com.google.android.gms.measurement.internal.zzpf.zza(context), new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzns.this.zzf(i2, zzaV, intent);
                }
            });
        }
        return 2;
    }

    public final android.os.IBinder zzd(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.google.android.gms.measurement.internal.zzjc(com.google.android.gms.measurement.internal.zzpf.zza(this.zza), null);
        }
        java.lang.String.valueOf(action);
        android.util.Log.w("FA", "onBind received unknown action: ".concat(java.lang.String.valueOf(action)));
        return null;
    }

    public final boolean zze(final android.app.job.JobParameters jobParameters) {
        java.lang.String string = jobParameters.getExtras().getString("action");
        java.lang.String.valueOf(string);
        android.util.Log.v("FA", "onStartJob received action: ".concat(java.lang.String.valueOf(string)));
        if (java.util.Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(string);
            com.google.android.gms.measurement.internal.zzpf zza = com.google.android.gms.measurement.internal.zzpf.zza(this.zza);
            final com.google.android.gms.measurement.internal.zzgt zzaV = zza.zzaV();
            zza.zzaU();
            zzaV.zzk().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zza, new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzns.this.zzg(zzaV, jobParameters);
                }
            });
        }
        if (!java.util.Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzfb.zza(this.zza, null).zzw(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzns.this.zzh(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzf(int i, com.google.android.gms.measurement.internal.zzgt zzgtVar, android.content.Intent intent) {
        android.content.Context context = this.zza;
        com.google.android.gms.measurement.internal.zzno zznoVar = (com.google.android.gms.measurement.internal.zzno) context;
        if (zznoVar.zza(i)) {
            zzgtVar.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i));
            com.google.android.gms.measurement.internal.zzib.zzy(context, null, null).zzaV().zzk().zza("Completed wakeful intent.");
            zznoVar.zzc(intent);
        }
    }

    final /* synthetic */ void zzg(com.google.android.gms.measurement.internal.zzgt zzgtVar, android.app.job.JobParameters jobParameters) {
        zzgtVar.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((com.google.android.gms.measurement.internal.zzno) this.zza).zzb(jobParameters, false);
    }

    final /* synthetic */ void zzh(android.app.job.JobParameters jobParameters) {
        android.util.Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((com.google.android.gms.measurement.internal.zzno) this.zza).zzb(jobParameters, false);
    }
}
