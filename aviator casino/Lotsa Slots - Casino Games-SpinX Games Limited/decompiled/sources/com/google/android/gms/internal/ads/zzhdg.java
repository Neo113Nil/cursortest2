package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdg extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhdg zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzhdd zzb;
    private com.google.android.gms.internal.ads.zzigr zzc;
    private com.google.android.gms.internal.ads.zzieq zzd = zzbM();
    private com.google.android.gms.internal.ads.zziep zze = zzbE();

    static {
        com.google.android.gms.internal.ads.zzhdg zzhdgVar = new com.google.android.gms.internal.ads.zzhdg();
        zzf = zzhdgVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhdg.class, zzhdgVar);
    }

    private zzhdg() {
    }

    public static com.google.android.gms.internal.ads.zzhdf zza() {
        return (com.google.android.gms.internal.ads.zzhdf) zzf.zzbn();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzhdd zzhddVar) {
        zzhddVar.getClass();
        this.zzb = zzhddVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzc(java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zziep zziepVar = this.zze;
        if (!zziepVar.zza()) {
            this.zze = com.google.android.gms.internal.ads.zziee.zzbF(zziepVar);
        }
        com.google.android.gms.internal.ads.zzicj.zzaW(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", com.google.android.gms.internal.ads.zzigr.class, "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhdg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhdf(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhdg.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
