package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnr {

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbnp zza;
    private final java.lang.Object zzb;

    public static com.google.android.libraries.places.internal.zzbnr zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzbnr zzbnrVar = new com.google.android.libraries.places.internal.zzbnr((com.google.android.libraries.places.internal.zzbnp) com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status"), null);
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "cannot use OK status: %s", zzbnpVar);
        return zzbnrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbnr)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbnr zzbnrVar = (com.google.android.libraries.places.internal.zzbnr) obj;
        if (zzc() == zzbnrVar.zzc()) {
            return zzc() ? com.google.common.base.Objects.equal(this.zzb, zzbnrVar.zzb) : com.google.common.base.Objects.equal(this.zza, zzbnrVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zza;
        com.google.common.base.MoreObjects.ToStringHelper stringHelper = com.google.common.base.MoreObjects.toStringHelper(this);
        if (zzbnpVar == null) {
            stringHelper.add(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, this.zzb);
        } else {
            stringHelper.add("error", zzbnpVar);
        }
        return stringHelper.toString();
    }

    public final java.lang.Object zzd() {
        if (this.zza == null) {
            return this.zzb;
        }
        throw new java.lang.IllegalStateException("No value present.");
    }

    public final com.google.android.libraries.places.internal.zzbnp zze() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zza;
        return zzbnpVar == null ? com.google.android.libraries.places.internal.zzbnp.zza : zzbnpVar;
    }

    public final boolean zzc() {
        return this.zza == null;
    }

    public static com.google.android.libraries.places.internal.zzbnr zza(java.lang.Object obj) {
        return new com.google.android.libraries.places.internal.zzbnr(null, obj);
    }

    private zzbnr(com.google.android.libraries.places.internal.zzbnp zzbnpVar, java.lang.Object obj) {
        this.zza = zzbnpVar;
        this.zzb = obj;
    }
}
