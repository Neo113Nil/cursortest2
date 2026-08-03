package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfve extends android.database.ContentObserver {
    private final android.os.Handler zza;
    private final android.content.Context zzb;
    private final android.media.AudioManager zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze;
    private final java.util.concurrent.ExecutorService zzf;
    private final com.google.android.gms.internal.ads.zzfvq zzg;

    public zzfve(android.os.Handler handler, android.content.Context context, com.google.android.gms.internal.ads.zzfva zzfvaVar, com.google.android.gms.internal.ads.zzfvq zzfvqVar) {
        super(handler);
        this.zzd = new java.util.concurrent.atomic.AtomicReference(java.lang.Float.valueOf(-1.0f));
        this.zze = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzf = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.zza = handler;
        this.zzb = context;
        this.zzc = (android.media.AudioManager) context.getSystemService("audio");
        this.zzg = zzfvqVar;
    }

    private final void zzh() {
        this.zzf.submit(new com.google.android.gms.internal.ads.zzfvd(this));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.zze.getAndSet(true)) {
            return;
        }
        zzh();
    }

    public final void zza() {
        zzh();
        this.zzb.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zzb.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float zzc() {
        android.media.AudioManager audioManager = this.zzc;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    final /* synthetic */ android.os.Handler zzd() {
        return this.zza;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zze() {
        return this.zzd;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzf() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfvq zzg() {
        return this.zzg;
    }
}
