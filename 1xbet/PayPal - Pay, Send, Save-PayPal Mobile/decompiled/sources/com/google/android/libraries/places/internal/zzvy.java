package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvy extends com.google.android.libraries.places.internal.zzvq {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final java.util.concurrent.atomic.AtomicReference zzd;
    private static final java.util.concurrent.atomic.AtomicLong zzf;
    private static final java.util.concurrent.ConcurrentLinkedQueue zzg;
    private volatile com.google.android.libraries.places.internal.zzup zze;

    static {
        zza = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        zzb = "goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE);
        zzc = "eng".equals(android.os.Build.TYPE) || "userdebug".equals(android.os.Build.TYPE);
        zzd = new java.util.concurrent.atomic.AtomicReference();
        zzf = new java.util.concurrent.atomic.AtomicLong();
        zzg = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    private zzvy(java.lang.String str) {
        super(str);
        if (zza || zzb) {
            this.zze = new com.google.android.libraries.places.internal.zzvr().zza(zza());
        } else if (zzc) {
            this.zze = com.google.android.libraries.places.internal.zzwc.zze().zzb(false).zza(zza());
        } else {
            this.zze = null;
        }
    }

    public static com.google.android.libraries.places.internal.zzup zze(java.lang.String str) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((com.google.android.libraries.places.internal.zzvs) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (charAt == '$') {
                str = str.replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                break;
            }
            if (charAt == '.') {
                break;
            }
        }
        com.google.android.libraries.places.internal.zzvy zzvyVar = new com.google.android.libraries.places.internal.zzvy(str);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.google.android.libraries.places.internal.zzvw.zza;
        concurrentLinkedQueue.offer(zzvyVar);
        if (atomicReference.get() != null) {
            while (true) {
                com.google.android.libraries.places.internal.zzvy zzvyVar2 = (com.google.android.libraries.places.internal.zzvy) concurrentLinkedQueue.poll();
                if (zzvyVar2 == null) {
                    break;
                }
                zzvyVar2.zze = ((com.google.android.libraries.places.internal.zzvs) atomicReference.get()).zza(zzvyVar2.zza());
            }
            zzf();
        }
        return zzvyVar;
    }

    private static void zzf() {
        while (true) {
            com.google.android.libraries.places.internal.zzvx zzvxVar = (com.google.android.libraries.places.internal.zzvx) zzg.poll();
            if (zzvxVar == null) {
                return;
            }
            zzf.getAndDecrement();
            com.google.android.libraries.places.internal.zzup zza2 = zzvxVar.zza();
            com.google.android.libraries.places.internal.zzun zzb2 = zzvxVar.zzb();
            if (zzb2.zzk() || zza2.zzb(zzb2.zze())) {
                zza2.zzc(zzb2);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final boolean zzb(java.util.logging.Level level) {
        return this.zze == null || this.zze.zzb(level);
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final void zzc(com.google.android.libraries.places.internal.zzun zzunVar) {
        if (this.zze != null) {
            this.zze.zzc(zzunVar);
            return;
        }
        if (zzf.incrementAndGet() > 20) {
            zzg.poll();
        }
        zzg.offer(new com.google.android.libraries.places.internal.zzvx(this, zzunVar));
        if (this.zze != null) {
            zzf();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzvq, com.google.android.libraries.places.internal.zzup
    public final void zzd(java.lang.RuntimeException runtimeException, com.google.android.libraries.places.internal.zzun zzunVar) {
        if (this.zze != null) {
            this.zze.zzd(runtimeException, zzunVar);
        }
    }
}
