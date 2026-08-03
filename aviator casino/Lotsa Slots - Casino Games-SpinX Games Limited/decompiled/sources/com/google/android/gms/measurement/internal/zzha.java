package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzha extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzpf zza;
    private boolean zzb;
    private boolean zzc;

    zzha(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpfVar);
        this.zza = zzpfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        java.lang.String action = intent.getAction();
        zzpfVar.zzaV().zzk().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpfVar.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zzb = zzpfVar.zzi().zzb();
        if (this.zzc != zzb) {
            this.zzc = zzb;
            zzpfVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgz(this, zzb));
        }
    }

    public final void zza() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        zzpfVar.zzaW().zzg();
        if (this.zzb) {
            return;
        }
        zzpfVar.zzaY().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpfVar.zzi().zzb();
        zzpfVar.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    public final void zzb() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        zzpfVar.zzaW().zzg();
        zzpfVar.zzaW().zzg();
        if (this.zzb) {
            zzpfVar.zzaV().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpfVar.zzaY().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e) {
                this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zzc() {
        return this.zza;
    }
}
