package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhuk extends zzifm implements zzigx {
    private static final zzhuk zzb;
    private static volatile zzihe zzc;
    private String zza = "";

    static {
        zzhuk zzhukVar = new zzhuk();
        zzb = zzhukVar;
        zzifm.zzbu(zzhuk.class, zzhukVar);
    }

    private zzhuk() {
    }

    public static zzhuk zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhuk) zzifm.zzbT(zzb, zzieiVar, zziewVar);
    }

    public static zzhuj zzc() {
        return (zzhuj) zzb.zzbn();
    }

    public static zzhuk zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhuk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuj(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhuk.class) {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
