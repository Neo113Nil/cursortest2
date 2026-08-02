package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbw extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbw zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private com.google.android.libraries.places.internal.zzbea zzb = zzbG();
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzbbw zzbbwVar = new com.google.android.libraries.places.internal.zzbbw();
        zzi = zzbbwVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbw.class, zzbbwVar);
    }

    private zzbbw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ", new java.lang.Object[]{"zzb", com.google.android.libraries.places.internal.zzbai.class, "zze", com.google.android.libraries.places.internal.zzbbc.class, "zzf", com.google.android.libraries.places.internal.zzaxs.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbv(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbbw.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zze() {
        return this.zzh;
    }

    public final java.lang.String zzd() {
        return this.zzg;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzbbw zzf() {
        return zzi;
    }
}
