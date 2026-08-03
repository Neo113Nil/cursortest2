package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzab {
    final java.lang.String zzb;
    final int zzc;
    java.lang.Boolean zzd;
    java.lang.Boolean zze;
    java.lang.Long zzf;
    java.lang.Long zzg;

    zzab(java.lang.String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static java.lang.Boolean zzd(java.lang.String str, int i, boolean z, java.lang.String str2, java.util.List list, java.lang.String str3, com.google.android.gms.measurement.internal.zzgt zzgtVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (java.util.regex.PatternSyntaxException unused) {
                        if (zzgtVar != null) {
                            zzgtVar.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static java.lang.Boolean zze(java.lang.Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(bool.booleanValue() != z);
    }

    static java.lang.Boolean zzf(java.lang.String str, com.google.android.gms.internal.measurement.zzfr zzfrVar, com.google.android.gms.measurement.internal.zzgt zzgtVar) {
        java.util.List list;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfrVar);
        if (str == null || !zzfrVar.zza() || zzfrVar.zzj() == 1 || (zzfrVar.zzj() != 7 ? !zzfrVar.zzb() : zzfrVar.zzg() == 0)) {
            return null;
        }
        int zzj = zzfrVar.zzj();
        boolean zze = zzfrVar.zze();
        java.lang.String zzc = (zze || zzj == 2 || zzj == 7) ? zzfrVar.zzc() : zzfrVar.zzc().toUpperCase(java.util.Locale.ENGLISH);
        if (zzfrVar.zzg() == 0) {
            list = null;
        } else {
            java.util.List zzf = zzfrVar.zzf();
            if (!zze) {
                java.util.ArrayList arrayList = new java.util.ArrayList(zzf.size());
                java.util.Iterator it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((java.lang.String) it.next()).toUpperCase(java.util.Locale.ENGLISH));
                }
                zzf = java.util.Collections.unmodifiableList(arrayList);
            }
            list = zzf;
        }
        return zzd(str, zzj, zze, zzc, list, zzj == 2 ? zzc : null, zzgtVar);
    }

    static java.lang.Boolean zzg(long j, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new java.math.BigDecimal(j), zzflVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzh(double d, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new java.math.BigDecimal(d), zzflVar, java.lang.Math.ulp(d));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzi(java.lang.String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        if (!com.google.android.gms.measurement.internal.zzpj.zzm(str)) {
            return null;
        }
        try {
            return zzj(new java.math.BigDecimal(str), zzflVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zzj(java.math.BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzfl zzflVar, double d) {
        java.math.BigDecimal bigDecimal2;
        java.math.BigDecimal bigDecimal3;
        java.math.BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzflVar);
        if (zzflVar.zza()) {
            if (zzflVar.zzm() != 1) {
                if (zzflVar.zzm() == 5) {
                    if (!zzflVar.zzf() || !zzflVar.zzh()) {
                        return null;
                    }
                } else if (!zzflVar.zzd()) {
                    return null;
                }
                int zzm = zzflVar.zzm();
                if (zzflVar.zzm() == 5) {
                    if (com.google.android.gms.measurement.internal.zzpj.zzm(zzflVar.zzg()) && com.google.android.gms.measurement.internal.zzpj.zzm(zzflVar.zzi())) {
                        try {
                            java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(zzflVar.zzg());
                            bigDecimal4 = new java.math.BigDecimal(zzflVar.zzi());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!com.google.android.gms.measurement.internal.zzpj.zzm(zzflVar.zze())) {
                    return null;
                }
                try {
                    bigDecimal2 = new java.math.BigDecimal(zzflVar.zze());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (java.lang.NumberFormatException unused2) {
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = zzm - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) < 0);
                }
                return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}
