package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzw extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzib zza;

    public zzw(com.google.android.gms.measurement.internal.zzib zzibVar) {
        this.zza = zzibVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        char c;
        if (intent == null) {
            this.zza.zzaV().zze().zza("App receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        if (action == null) {
            this.zza.zzaV().zze().zza("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                this.zza.zzaV().zze().zza("App receiver called with unknown action");
                return;
            }
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
            zzibVar.zzaV().zzk().zza("[sgtm] App Receiver notified batches are available");
            zzibVar.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzw.this.zza();
                }
            });
            return;
        }
        final com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zza;
        com.google.android.gms.internal.measurement.zzql.zza();
        if (zzibVar2.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
            zzibVar2.zzaV().zzk().zza("App receiver notified triggers are available");
            zzibVar2.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzib zzibVar3 = com.google.android.gms.measurement.internal.zzib.this;
                    if (!zzibVar3.zzk().zzS()) {
                        zzibVar3.zzaV().zze().zza("registerTrigger called but app not eligible");
                        return;
                    }
                    zzibVar3.zzj().zzv();
                    final com.google.android.gms.measurement.internal.zzli zzj = zzibVar3.zzj();
                    java.util.Objects.requireNonNull(zzj);
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.measurement.internal.zzli.this.zzw();
                        }
                    }).start();
                }
            });
        }
    }

    final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzC.zzb(null)).longValue());
    }
}
