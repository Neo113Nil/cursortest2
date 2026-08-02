package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzeo extends com.google.android.gms.internal.fido.zzei {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final java.util.concurrent.atomic.AtomicReference zzd;
    private static final java.util.concurrent.atomic.AtomicLong zze;
    private static final java.util.concurrent.ConcurrentLinkedQueue zzf;
    private volatile com.google.android.gms.internal.fido.zzdp zzg;

    static {
        boolean z = true;
        zza = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        zzb = "goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE);
        if (!"eng".equals(android.os.Build.TYPE) && !"userdebug".equals(android.os.Build.TYPE)) {
            z = false;
        }
        zzc = z;
        zzd = new java.util.concurrent.atomic.AtomicReference();
        zze = new java.util.concurrent.atomic.AtomicLong();
        zzf = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    private zzeo(java.lang.String str) {
        super(str);
        if (zza || zzb) {
            this.zzg = new com.google.android.gms.internal.fido.zzej().zza(zza());
        } else if (zzc) {
            this.zzg = com.google.android.gms.internal.fido.zzeu.zzc().zzb(false).zza(zza());
        } else {
            this.zzg = null;
        }
    }

    public static com.google.android.gms.internal.fido.zzdp zzb(java.lang.String str) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((com.google.android.gms.internal.fido.zzek) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    break;
                }
            } else {
                break;
            }
        }
        com.google.android.gms.internal.fido.zzeo zzeoVar = new com.google.android.gms.internal.fido.zzeo(str);
        com.google.android.gms.internal.fido.zzem.zza.offer(zzeoVar);
        if (zzd.get() != null) {
            while (true) {
                com.google.android.gms.internal.fido.zzeo zzeoVar2 = (com.google.android.gms.internal.fido.zzeo) com.google.android.gms.internal.fido.zzem.zza.poll();
                if (zzeoVar2 == null) {
                    break;
                }
                zzeoVar2.zzg = ((com.google.android.gms.internal.fido.zzek) zzd.get()).zza(zzeoVar2.zza());
            }
            if (((com.google.android.gms.internal.fido.zzen) zzf.poll()) != null) {
                zze.getAndDecrement();
                throw null;
            }
        }
        return zzeoVar;
    }
}
