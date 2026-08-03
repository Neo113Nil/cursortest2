package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzos {
    private final java.lang.String zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.measurement.internal.zzlr zzc;
    private final com.google.android.gms.internal.measurement.zzis zzd;

    zzos(java.lang.String str, java.util.Map map, com.google.android.gms.measurement.internal.zzlr zzlrVar, com.google.android.gms.internal.measurement.zzis zzisVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzlrVar;
        this.zzd = zzisVar;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.util.Map zzb() {
        java.util.Map map = this.zzb;
        return map == null ? java.util.Collections.emptyMap() : map;
    }

    public final com.google.android.gms.measurement.internal.zzlr zzc() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.measurement.zzis zzd() {
        return this.zzd;
    }
}
