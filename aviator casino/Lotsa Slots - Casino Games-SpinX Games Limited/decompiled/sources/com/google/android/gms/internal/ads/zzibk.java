package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibk extends com.google.android.gms.internal.ads.zzibg {
    private final java.lang.Object zza;

    public zzibk(java.lang.Boolean bool) {
        this.zza = java.util.Objects.requireNonNull(bool);
    }

    private static boolean zzl(com.google.android.gms.internal.ads.zzibk zzibkVar) {
        java.lang.Object obj = zzibkVar.zza;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzibk zzibkVar = (com.google.android.gms.internal.ads.zzibk) obj;
            java.lang.Object obj2 = this.zza;
            if (obj2 == null) {
                return zzibkVar.zza == null;
            }
            if (!zzl(this) || !zzl(zzibkVar)) {
                if (obj2 instanceof java.lang.Number) {
                    java.lang.Object obj3 = zzibkVar.zza;
                    if (obj3 instanceof java.lang.Number) {
                        if ((obj2 instanceof java.math.BigDecimal) && (obj3 instanceof java.math.BigDecimal)) {
                            return zzj().compareTo(zzibkVar.zzj()) == 0;
                        }
                        double zzi = zzi();
                        double zzi2 = zzibkVar.zzi();
                        if (zzi == zzi2) {
                            return true;
                        }
                        if (java.lang.Double.isNaN(zzi) && java.lang.Double.isNaN(zzi2)) {
                            return true;
                        }
                    }
                }
                return obj2.equals(zzibkVar.zza);
            }
            if ((obj2 instanceof java.math.BigInteger) || (zzibkVar.zza instanceof java.math.BigInteger)) {
                return zzk().equals(zzibkVar.zzk());
            }
            if (zzh().longValue() == zzibkVar.zzh().longValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits;
        java.lang.Object obj = this.zza;
        if (obj == null) {
            return 31;
        }
        if (zzl(this)) {
            doubleToLongBits = zzh().longValue();
        } else {
            if (!(obj instanceof java.lang.Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = java.lang.Double.doubleToLongBits(zzh().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean zza() {
        return this.zza instanceof java.lang.Boolean;
    }

    public final boolean zzb() {
        java.lang.Object obj = this.zza;
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : java.lang.Boolean.parseBoolean(zzd());
    }

    public final boolean zzc() {
        return this.zza instanceof java.lang.Number;
    }

    @Override // com.google.android.gms.internal.ads.zzibg
    public final java.lang.String zzd() {
        java.lang.Object obj = this.zza;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof java.lang.Number) {
            return zzh().toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).toString();
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
        java.lang.String.valueOf(valueOf);
        throw new java.lang.AssertionError("Unexpected value type: ".concat(java.lang.String.valueOf(valueOf)));
    }

    public final java.lang.Number zzh() {
        java.lang.Object obj = this.zza;
        if (obj instanceof java.lang.Number) {
            return (java.lang.Number) obj;
        }
        if (obj instanceof java.lang.String) {
            return new com.google.android.gms.internal.ads.zzibo((java.lang.String) obj);
        }
        throw new java.lang.UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double zzi() {
        return this.zza instanceof java.lang.Number ? zzh().doubleValue() : java.lang.Double.parseDouble(zzd());
    }

    public final java.math.BigDecimal zzj() {
        java.lang.Object obj = this.zza;
        return obj instanceof java.math.BigDecimal ? (java.math.BigDecimal) obj : com.google.android.gms.internal.ads.zzibx.zza(zzd());
    }

    public final java.math.BigInteger zzk() {
        java.lang.Object obj = this.zza;
        return obj instanceof java.math.BigInteger ? (java.math.BigInteger) obj : zzl(this) ? java.math.BigInteger.valueOf(zzh().longValue()) : com.google.android.gms.internal.ads.zzibx.zzb(zzd());
    }

    public zzibk(java.lang.Number number) {
        this.zza = java.util.Objects.requireNonNull(number);
    }

    public zzibk(java.lang.String str) {
        this.zza = java.util.Objects.requireNonNull(str);
    }
}
