package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzx extends com.google.android.play.core.splitinstall.internal.zzs {
    private static com.google.android.play.core.splitinstall.zzx zzc;
    private final android.os.Handler zzd;
    private final com.google.android.play.core.splitinstall.zzg zze;
    private final java.util.Set zzf;

    public zzx(android.content.Context context, com.google.android.play.core.splitinstall.zzg zzgVar) {
        super(new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallListenerRegistry"), new android.content.IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.zzd = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzf = new java.util.LinkedHashSet();
        this.zze = zzgVar;
    }

    public static com.google.android.play.core.splitinstall.zzx zzg(android.content.Context context) {
        com.google.android.play.core.splitinstall.zzx zzxVar;
        synchronized (com.google.android.play.core.splitinstall.zzx.class) {
            if (zzc == null) {
                zzc = new com.google.android.play.core.splitinstall.zzx(context, com.google.android.play.core.splitinstall.zzo.INSTANCE);
            }
            zzxVar = zzc;
        }
        return zzxVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzs
    public final void zza(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle bundleExtra = intent.getBundleExtra(com.datadog.android.rum.internal.domain.RumContext.SESSION_STATE);
        if (bundleExtra == null) {
            return;
        }
        com.google.android.play.core.splitinstall.SplitInstallSessionState zzd = com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(bundleExtra);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", zzd);
        com.google.android.play.core.splitinstall.zzh zza = this.zze.zza();
        if (zzd.status() != 3 || zza == null) {
            zzk(zzd);
        } else {
            zza.zzd(zzd.zzc(), new com.google.android.play.core.splitinstall.zzv(this, zzd, intent, context));
        }
    }

    final void zzi(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzf.add(splitInstallStateUpdatedListener);
        }
    }

    final void zzj(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzf.remove(splitInstallStateUpdatedListener);
        }
    }

    public final void zzk(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
        synchronized (this) {
            java.util.Iterator it = new java.util.LinkedHashSet(this.zzf).iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
            }
            super.zze(splitInstallSessionState);
        }
    }
}
