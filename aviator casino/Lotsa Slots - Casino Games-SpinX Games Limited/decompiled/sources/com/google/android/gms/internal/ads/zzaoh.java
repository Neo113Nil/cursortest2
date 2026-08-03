package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoh {
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("\\s+");
    private static final com.google.android.gms.internal.ads.zzgww zze = com.google.android.gms.internal.ads.zzgww.zzj("auto", "none");
    private static final com.google.android.gms.internal.ads.zzgww zzf = com.google.android.gms.internal.ads.zzgww.zzk("dot", "sesame", "circle");
    private static final com.google.android.gms.internal.ads.zzgww zzg = com.google.android.gms.internal.ads.zzgww.zzj("filled", "open");
    private static final com.google.android.gms.internal.ads.zzgww zzh = com.google.android.gms.internal.ads.zzgww.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoh(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static com.google.android.gms.internal.ads.zzaoh zza(java.lang.String str) {
        char c;
        if (str == null) {
            return null;
        }
        java.lang.String zza = com.google.android.gms.internal.ads.zzgss.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzgww zzq = com.google.android.gms.internal.ads.zzgww.zzq(android.text.TextUtils.split(zza, zzd));
        java.lang.String str2 = (java.lang.String) com.google.android.gms.internal.ads.zzgxa.zzb(com.google.android.gms.internal.ads.zzgyw.zza(zzh, zzq), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str2.equals("outside")) {
                c = 1;
            }
            c = 65535;
        }
        int i3 = c != 0 ? c != 1 ? 1 : -2 : 2;
        com.google.android.gms.internal.ads.zzgyv zza2 = com.google.android.gms.internal.ads.zzgyw.zza(zze, zzq);
        if (zza2.isEmpty()) {
            com.google.android.gms.internal.ads.zzgyv zza3 = com.google.android.gms.internal.ads.zzgyw.zza(zzg, zzq);
            com.google.android.gms.internal.ads.zzgyv zza4 = com.google.android.gms.internal.ads.zzgyw.zza(zzf, zzq);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                java.lang.String str3 = (java.lang.String) com.google.android.gms.internal.ads.zzgxa.zzb(zza3, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                java.lang.String str4 = (java.lang.String) com.google.android.gms.internal.ads.zzgxa.zzb(zza4, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i2 = i4;
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                    i2 = i4;
                }
            }
        } else {
            java.lang.String str5 = (java.lang.String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i = 0;
            }
        }
        return new com.google.android.gms.internal.ads.zzaoh(i, i2, i3);
    }
}
