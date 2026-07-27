package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbee extends zzifm implements zzigx {
    private static final zzbee zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzaxe zzb;

    static {
        zzbee zzbeeVar = new zzbee();
        zzc = zzbeeVar;
        zzifm.zzbu(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbed zza() {
        return (zzbed) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzaxe zzaxeVar) {
        zzaxeVar.getClass();
        this.zzb = zzaxeVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzbee();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbed(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzbee.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
