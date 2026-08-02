package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzamo extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzamo zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private int zze;
    private boolean zzi;
    private int zzk;
    private com.google.android.libraries.places.internal.zzbea zzf = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private com.google.android.libraries.places.internal.zzbea zzj = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzamo zzamoVar = new com.google.android.libraries.places.internal.zzamo();
        zzl = zzamoVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzamo.class, zzamoVar);
    }

    private zzamo() {
    }

    public static com.google.android.libraries.places.internal.zzamn zza() {
        return (com.google.android.libraries.places.internal.zzamn) zzl.zzbv();
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzf;
        if (!zzbeaVar.zza()) {
            this.zzf = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        this.zzf.add(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a\u0007င\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzamo();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzamn(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzamo.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb |= 16;
        this.zzk = i;
    }
}
