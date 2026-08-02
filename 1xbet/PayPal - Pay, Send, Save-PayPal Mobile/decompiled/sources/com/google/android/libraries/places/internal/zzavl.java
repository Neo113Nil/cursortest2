package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzavl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzavl zzp;
    private static volatile com.google.android.libraries.places.internal.zzbff zzq;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";
    private com.google.android.libraries.places.internal.zzbea zzk = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzauz zzl;
    private com.google.android.libraries.places.internal.zzavg zzm;
    private com.google.android.libraries.places.internal.zzavk zzn;
    private com.google.android.libraries.places.internal.zzavd zzo;

    static {
        com.google.android.libraries.places.internal.zzavl zzavlVar = new com.google.android.libraries.places.internal.zzavl();
        zzp = zzavlVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzavl.class, zzavlVar);
        com.google.android.libraries.places.internal.zzbdq.zzbB(com.google.android.libraries.places.internal.zzbhn.zzc(), zzavlVar, zzavlVar, null, 525004180, com.google.android.libraries.places.internal.zzbgj.MESSAGE, com.google.android.libraries.places.internal.zzavl.class);
    }

    private zzavl() {
    }

    public static com.google.android.libraries.places.internal.zzava zzc() {
        return (com.google.android.libraries.places.internal.zzava) zzp.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzk;
        if (!zzbeaVar.zza()) {
            this.zzk = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzk);
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006\u001a\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n᠌\u0002\u000bဉ\t", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzavb.zza, "zzf", com.google.android.libraries.places.internal.zzave.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzg", com.google.android.libraries.places.internal.zzavh.zza, "zzo"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzavl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzava(bArr);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzq;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzavl.class) {
            zzbffVar = zzq;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzp);
                zzq = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.util.List zza() {
        return this.zzk;
    }
}
