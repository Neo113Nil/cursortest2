package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzavn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzavn zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private java.lang.Object zze;
    private int zzb = 0;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private com.google.android.libraries.places.internal.zzbea zzh = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbdy zzi = zzbD();

    static {
        com.google.android.libraries.places.internal.zzavn zzavnVar = new com.google.android.libraries.places.internal.zzavn();
        zzj = zzavnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzavn.class, zzavnVar);
    }

    private zzavn() {
    }

    public static com.google.android.libraries.places.internal.zzavm zza() {
        return (com.google.android.libraries.places.internal.zzavm) zzj.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005Ț\u0006,", new java.lang.Object[]{"zze", "zzb", com.google.android.libraries.places.internal.zzbht.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzavn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzavm(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzk;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzavn.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb = 1;
        this.zze = str;
    }

    public static com.google.android.libraries.places.internal.zzavn zzc() {
        return zzj;
    }
}
