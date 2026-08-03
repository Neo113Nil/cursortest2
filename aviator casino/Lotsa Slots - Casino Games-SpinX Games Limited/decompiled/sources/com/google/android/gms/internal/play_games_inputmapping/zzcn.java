package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzcn extends com.google.android.gms.internal.play_games_inputmapping.zzcg {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private static final java.util.concurrent.atomic.AtomicLong zzc = new java.util.concurrent.atomic.AtomicLong();
    private static final java.util.concurrent.ConcurrentLinkedQueue zzd = new java.util.concurrent.ConcurrentLinkedQueue();
    private volatile com.google.android.gms.internal.play_games_inputmapping.zzbc zzb;

    private zzcn(java.lang.String str) {
        super(str);
        boolean z = true;
        boolean z2 = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE);
        if (!"eng".equals(android.os.Build.TYPE) && !"userdebug".equals(android.os.Build.TYPE)) {
            z = false;
        }
        if (z2 || z3) {
            this.zzb = new com.google.android.gms.internal.play_games_inputmapping.zzch().zza(zza());
        } else if (z) {
            this.zzb = new com.google.android.gms.internal.play_games_inputmapping.zzcp().zzb(false).zza(zza());
        } else {
            this.zzb = null;
        }
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzbc zze(java.lang.String str) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((com.google.android.gms.internal.play_games_inputmapping.zzci) atomicReference.get()).zza(str);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzcn zzcnVar = new com.google.android.gms.internal.play_games_inputmapping.zzcn(str.replace(kotlin.text.Typography.dollar, '.'));
        com.google.android.gms.internal.play_games_inputmapping.zzcl.zza.offer(zzcnVar);
        if (atomicReference.get() != null) {
            while (true) {
                com.google.android.gms.internal.play_games_inputmapping.zzcn zzcnVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzcn) com.google.android.gms.internal.play_games_inputmapping.zzcl.zza.poll();
                if (zzcnVar2 == null) {
                    break;
                }
                zzcnVar2.zzb = ((com.google.android.gms.internal.play_games_inputmapping.zzci) zza.get()).zza(zzcnVar2.zza());
            }
            zzf();
        }
        return zzcnVar;
    }

    private static void zzf() {
        while (true) {
            com.google.android.gms.internal.play_games_inputmapping.zzcm zzcmVar = (com.google.android.gms.internal.play_games_inputmapping.zzcm) zzd.poll();
            if (zzcmVar == null) {
                return;
            }
            zzc.getAndDecrement();
            com.google.android.gms.internal.play_games_inputmapping.zzbc zza2 = zzcmVar.zza();
            com.google.android.gms.internal.play_games_inputmapping.zzba zzb = zzcmVar.zzb();
            if (zzb.zzk() || zza2.zzb(zzb.zze())) {
                zza2.zzc(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final boolean zzb(java.util.logging.Level level) {
        if (this.zzb != null) {
            return this.zzb.zzb(level);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzc(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        if (this.zzb != null) {
            this.zzb.zzc(zzbaVar);
            return;
        }
        if (zzc.incrementAndGet() > 20) {
            zzd.poll();
            android.util.Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        zzd.offer(new com.google.android.gms.internal.play_games_inputmapping.zzcm(this, zzbaVar));
        if (this.zzb != null) {
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcg, com.google.android.gms.internal.play_games_inputmapping.zzbc
    public final void zzd(java.lang.RuntimeException runtimeException, com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        if (this.zzb != null) {
            this.zzb.zzd(runtimeException, zzbaVar);
        } else {
            android.util.Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
