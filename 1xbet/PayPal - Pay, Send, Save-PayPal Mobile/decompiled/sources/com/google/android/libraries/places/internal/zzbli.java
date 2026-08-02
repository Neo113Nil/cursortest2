package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbli {
    private static final com.google.android.libraries.places.internal.zzbli zza = new com.google.android.libraries.places.internal.zzbli(null, null, com.google.android.libraries.places.internal.zzbnp.zza, false);

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzblm zzb;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbjb zzc = null;
    private final com.google.android.libraries.places.internal.zzbnp zzd;
    private final boolean zze;

    private zzbli(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzblm zzblmVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbjb zzbjbVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z) {
        this.zzb = zzblmVar;
        this.zzd = (com.google.android.libraries.places.internal.zzbnp) com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        this.zze = z;
    }

    public static com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblm zzblmVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbjb zzbjbVar) {
        return new com.google.android.libraries.places.internal.zzbli((com.google.android.libraries.places.internal.zzblm) com.google.common.base.Preconditions.checkNotNull(zzblmVar, "subchannel"), null, com.google.android.libraries.places.internal.zzbnp.zza, false);
    }

    public static com.google.android.libraries.places.internal.zzbli zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "error status shouldn't be OK");
        return new com.google.android.libraries.places.internal.zzbli(null, null, zzbnpVar, false);
    }

    public static com.google.android.libraries.places.internal.zzbli zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "drop status shouldn't be OK");
        return new com.google.android.libraries.places.internal.zzbli(null, null, zzbnpVar, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbli)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbli zzbliVar = (com.google.android.libraries.places.internal.zzbli) obj;
        if (com.google.common.base.Objects.equal(this.zzb, zzbliVar.zzb) && com.google.common.base.Objects.equal(this.zzd, zzbliVar.zzd)) {
            com.google.android.libraries.places.internal.zzbjb zzbjbVar = zzbliVar.zzc;
            if (com.google.common.base.Objects.equal(null, null) && this.zze == zzbliVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zzb, this.zzd, null, java.lang.Boolean.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("subchannel", this.zzb).add("streamTracerFactory", (java.lang.Object) null).add("status", this.zzd).add(com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, this.zze).add("authority-override", (java.lang.Object) null).toString();
    }

    public final boolean zzh() {
        return (this.zzb == null && this.zzd.zzj()) ? false : true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final com.google.android.libraries.places.internal.zzbnp zzf() {
        return this.zzd;
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzblm zze() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzbli zzd() {
        return zza;
    }
}
