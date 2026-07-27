package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaty {
    public final Object zza;
    public final zzatb zzb;
    public final zzaub zzc;
    public boolean zzd;

    private zzaty(zzaub zzaubVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaubVar;
    }

    private zzaty(Object obj, zzatb zzatbVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzatbVar;
        this.zzc = null;
    }

    public static zzaty zza(Object obj, zzatb zzatbVar) {
        return new zzaty(obj, zzatbVar);
    }

    public static zzaty zzb(zzaub zzaubVar) {
        return new zzaty(zzaubVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
