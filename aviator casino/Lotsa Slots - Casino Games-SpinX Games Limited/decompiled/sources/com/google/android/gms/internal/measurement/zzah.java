package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzah implements com.google.android.gms.internal.measurement.zzao {
    private final java.lang.Double zza;

    public zzah(java.lang.Double d) {
        if (d == null) {
            this.zza = java.lang.Double.valueOf(Double.NaN);
        } else {
            this.zza = d;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzah) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        java.lang.Double d = this.zza;
        if (java.lang.Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (java.lang.Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        java.math.BigDecimal m = com.fyber.inneractive.sdk.network.q0$$ExternalSyntheticBackportWithForwarding0.m(java.math.BigDecimal.valueOf(d.doubleValue()));
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0E0");
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((m.scale() > 0 ? m.precision() : m.scale()) - 1);
        java.lang.String format = decimalFormat.format(m);
        int indexOf = format.indexOf(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = java.lang.Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "e+") : m.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if ("toString".equals(str)) {
            return new com.google.android.gms.internal.measurement.zzas(zzc());
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s.%s is not a function.", zzc(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        java.lang.Double d = this.zza;
        boolean z = false;
        if (!java.lang.Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return new com.google.android.gms.internal.measurement.zzah(this.zza);
    }
}
