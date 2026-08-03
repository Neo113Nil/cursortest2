package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhll extends java.lang.Number {
    private final java.lang.String zza;

    public zzhll(java.lang.String str) {
        this.zza = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.zza);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhll) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzhll) obj).zza);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.zza);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.zza);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return new java.math.BigDecimal(this.zza).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.zza);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(this.zza).longValue();
        }
    }

    public final java.lang.String toString() {
        return this.zza;
    }
}
