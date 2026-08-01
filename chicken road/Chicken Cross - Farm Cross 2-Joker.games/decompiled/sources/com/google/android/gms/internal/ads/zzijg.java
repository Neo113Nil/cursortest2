package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzijg extends zzifm implements zzigx {
    private static final zzijg zzb;
    private static volatile zzihe zzc;
    private zzify zza = zzbM();

    static {
        zzijg zzijgVar = new zzijg();
        zzb = zzijgVar;
        zzifm.zzbu(zzijg.class, zzijgVar);
    }

    private zzijg() {
    }

    public static zzijf zzc() {
        return (zzijf) zzb.zzbn();
    }

    final /* synthetic */ void zzd(zzije zzijeVar) {
        zzijeVar.getClass();
        zzify zzifyVar = this.zza;
        if (!zzifyVar.zza()) {
            this.zza = zzifm.zzbN(zzifyVar);
        }
        this.zza.add(zzijeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzije.class});
        }
        if (ordinal == 3) {
            return new zzijg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijf(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzijg.class) {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
