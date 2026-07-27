package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzazt extends zzifm implements zzigx {
    private static final zzazt zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzify zzb = zzbM();
    private zziei zzc = zziei.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzazt zzaztVar = new zzazt();
        zzf = zzaztVar;
        zzifm.zzbu(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    public static zzazs zza() {
        return (zzazs) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zziei zzieiVar) {
        zzieiVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzieiVar);
    }

    final /* synthetic */ void zzc(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzc = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzazn.zza, "zze", zzazj.zza});
        }
        if (ordinal == 3) {
            return new zzazt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzazs(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzazt.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
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
