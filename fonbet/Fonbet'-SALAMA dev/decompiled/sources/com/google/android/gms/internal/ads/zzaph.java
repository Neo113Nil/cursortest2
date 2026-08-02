package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaph {
    public final Object zza;
    public final zzaok zzb;
    public final zzapk zzc;
    public boolean zzd;

    private zzaph(zzapk zzapkVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapkVar;
    }

    public static zzaph zza(zzapk zzapkVar) {
        return new zzaph(zzapkVar);
    }

    public static zzaph zzb(Object obj, zzaok zzaokVar) {
        return new zzaph(obj, zzaokVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaph(Object obj, zzaok zzaokVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaokVar;
        this.zzc = null;
    }
}
