package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public abstract class zzs {
    public final com.google.android.play.core.splitinstall.internal.zzu zza;
    private final android.content.IntentFilter zzc;
    private final android.content.Context zzd;
    protected final java.util.Set zzb = new java.util.HashSet();
    private com.google.android.play.core.splitinstall.internal.zzr zze = null;
    private volatile boolean zzf = false;

    public zzs(com.google.android.play.core.splitinstall.internal.zzu zzuVar, android.content.IntentFilter intentFilter, android.content.Context context) {
        this.zza = zzuVar;
        this.zzc = intentFilter;
        this.zzd = com.google.android.play.core.splitinstall.internal.zzbr.zza(context);
    }

    private final void zzf() {
        com.google.android.play.core.splitinstall.internal.zzr zzrVar;
        if ((this.zzf || !this.zzb.isEmpty()) && this.zze == null) {
            this.zze = new com.google.android.play.core.splitinstall.internal.zzr(this, null);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                this.zzd.registerReceiver(this.zze, this.zzc, 2);
            } else {
                this.zzd.registerReceiver(this.zze, this.zzc);
            }
        }
        if (this.zzf || !this.zzb.isEmpty() || (zzrVar = this.zze) == null) {
            return;
        }
        this.zzd.unregisterReceiver(zzrVar);
        this.zze = null;
    }

    protected abstract void zza(android.content.Context context, android.content.Intent intent);

    public final void zzb(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.zzd("registerListener", new java.lang.Object[0]);
            com.google.android.play.core.splitinstall.internal.zzbv.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
            this.zzb.add(stateUpdatedListener);
            zzf();
        }
    }

    public final void zzc(boolean z) {
        synchronized (this) {
            this.zzf = true;
            zzf();
        }
    }

    public final void zzd(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.zzd("unregisterListener", new java.lang.Object[0]);
            com.google.android.play.core.splitinstall.internal.zzbv.zza(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
            this.zzb.remove(stateUpdatedListener);
            zzf();
        }
    }

    public final void zze(java.lang.Object obj) {
        synchronized (this) {
            java.util.Iterator it = new java.util.HashSet(this.zzb).iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.listener.StateUpdatedListener) it.next()).onStateUpdate(obj);
            }
        }
    }
}
