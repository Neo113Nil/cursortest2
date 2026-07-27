package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhub extends zzifm implements zzigx {
    private static final zzhub zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzhtt zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhub zzhubVar = new zzhub();
        zzf = zzhubVar;
        zzifm.zzbu(zzhub.class, zzhubVar);
    }

    private zzhub() {
    }

    public static zzhua zzd() {
        return (zzhua) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhtt zzb() {
        zzhtt zzhttVar = this.zzb;
        return zzhttVar == null ? zzhtt.zzd() : zzhttVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhub();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhua(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzhub.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zzhtt zzhttVar) {
        zzhttVar.getClass();
        this.zzb = zzhttVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzd = i;
    }

    public final int zzi() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzj() {
        int zzb = zzhup.zzb(this.zze);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzc = zzhtu.zza(i);
    }

    final /* synthetic */ void zzl(int i) {
        this.zze = zzhup.zza(i);
    }
}
