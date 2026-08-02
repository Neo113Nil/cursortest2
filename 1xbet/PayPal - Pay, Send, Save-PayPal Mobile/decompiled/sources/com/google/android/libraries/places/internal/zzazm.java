package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazm extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazm zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private java.lang.String zzb = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzazm zzazmVar = new com.google.android.libraries.places.internal.zzazm();
        zzi = zzazmVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazl(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzj;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzazm.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zzf() {
        return this.zzh;
    }

    public final java.lang.String zze() {
        return this.zzg;
    }

    public final java.lang.String zzd() {
        return this.zzf;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzazm zzg() {
        return zzi;
    }
}
