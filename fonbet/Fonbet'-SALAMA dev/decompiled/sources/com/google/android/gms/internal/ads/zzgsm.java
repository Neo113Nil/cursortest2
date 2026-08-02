package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgsm extends zzgxg implements zzgys {
    private static final zzgsm zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgxs zzd = zzgxg.zzbK();

    static {
        zzgsm zzgsmVar = new zzgsm();
        zza = zzgsmVar;
        zzgxg.zzbZ(zzgsm.class, zzgsmVar);
    }

    private zzgsm() {
    }

    public static zzgsi zzc() {
        return (zzgsi) zza.zzaZ();
    }

    public static zzgsm zzg(InputStream inputStream, zzgwq zzgwqVar) {
        return (zzgsm) zzgxg.zzbu(zza, inputStream, zzgwqVar);
    }

    public static /* synthetic */ void zzi(zzgsm zzgsmVar, zzgsk zzgskVar) {
        zzgskVar.getClass();
        zzgxs zzgxsVar = zzgsmVar.zzd;
        if (!zzgxsVar.zzc()) {
            zzgsmVar.zzd = zzgxg.zzbL(zzgxsVar);
        }
        zzgsmVar.zzd.add(zzgskVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgsk zzd(int i7) {
        return (zzgsk) this.zzd.get(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgsk.class});
        }
        if (ordinal == 3) {
            return new zzgsm();
        }
        zzgsl zzgslVar = null;
        if (ordinal == 4) {
            return new zzgsi(zzgslVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsm.class) {
                try {
                    zzgyzVar = zzb;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zza);
                        zzb = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }

    public final List zzh() {
        return this.zzd;
    }
}
