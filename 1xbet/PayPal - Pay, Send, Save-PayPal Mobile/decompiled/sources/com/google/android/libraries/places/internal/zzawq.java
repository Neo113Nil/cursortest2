package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzawq extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzawq zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private java.lang.String zzb = "";
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();

    static {
        com.google.android.libraries.places.internal.zzawq zzawqVar = new com.google.android.libraries.places.internal.zzawq();
        zzf = zzawqVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaww.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzawq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzawp(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzg;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzawq.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzawq zzd() {
        return zzf;
    }
}
