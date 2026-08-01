package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgca extends zzifm implements zzigx {
    private static final zzgca zzb;
    private static volatile zzihe zzc;
    private zzigq zza = zzigq.zza();

    static {
        zzgca zzgcaVar = new zzgca();
        zzb = zzgcaVar;
        zzifm.zzbu(zzgca.class, zzgcaVar);
    }

    private zzgca() {
    }

    public static zzgca zzc(InputStream inputStream) throws IOException {
        return (zzgca) zzifm.zzbW(zzb, inputStream);
    }

    public static zzgca zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgbz.zza});
        }
        if (ordinal == 3) {
            return new zzgca();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgby(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzgca.class) {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
