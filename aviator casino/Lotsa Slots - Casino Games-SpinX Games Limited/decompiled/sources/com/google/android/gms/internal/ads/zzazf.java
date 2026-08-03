package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzazf extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzazf zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzieq zzb = zzbM();
    private com.google.android.gms.internal.ads.zzida zzc = com.google.android.gms.internal.ads.zzida.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        com.google.android.gms.internal.ads.zzazf zzazfVar = new com.google.android.gms.internal.ads.zzazf();
        zzf = zzazfVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzazf.class, zzazfVar);
    }

    private zzazf() {
    }

    public static com.google.android.gms.internal.ads.zzaze zza() {
        return (com.google.android.gms.internal.ads.zzaze) zzf.zzbn();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzidaVar);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 1;
        this.zzc = zzidaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", com.google.android.gms.internal.ads.zzayz.zza, "zze", com.google.android.gms.internal.ads.zzayv.zza});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzazf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzaze(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzazf.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}
