package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoe {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.Integer zzc;
    public final java.lang.Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaoe(java.lang.String str, int i, java.lang.Integer num, java.lang.Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static com.google.android.gms.internal.ads.zzaoe zza(java.lang.String str, com.google.android.gms.internal.ads.zzaoc zzaocVar) {
        int i;
        int parseInt;
        com.google.android.gms.internal.ads.zzgtj.zza(str.startsWith("Style:"));
        java.lang.String[] split = android.text.TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = zzaocVar.zzk;
        if (length != i2) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length), str};
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            com.google.android.gms.internal.ads.zzeg.zzc("SsaStyle", java.lang.String.format(java.util.Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            java.lang.String trim = split[zzaocVar.zza].trim();
            int i3 = zzaocVar.zzb;
            int zzd = i3 != -1 ? zzd(split[i3].trim()) : -1;
            int i4 = zzaocVar.zzc;
            java.lang.Integer zzb = i4 != -1 ? zzb(split[i4].trim()) : null;
            int i5 = zzaocVar.zzd;
            java.lang.Integer zzb2 = i5 != -1 ? zzb(split[i5].trim()) : null;
            int i6 = zzaocVar.zze;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                java.lang.String trim2 = split[i6].trim();
                try {
                    f = java.lang.Float.parseFloat(trim2);
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(trim2).length() + 29);
                    sb.append("Failed to parse font size: '");
                    sb.append(trim2);
                    sb.append("'");
                    com.google.android.gms.internal.ads.zzeg.zzd("SsaStyle", sb.toString(), e);
                }
            }
            int i7 = zzaocVar.zzf;
            boolean z = i7 != -1 && zze(split[i7].trim());
            int i8 = zzaocVar.zzg;
            boolean z2 = i8 != -1 && zze(split[i8].trim());
            int i9 = zzaocVar.zzh;
            boolean z3 = i9 != -1 && zze(split[i9].trim());
            int i10 = zzaocVar.zzi;
            boolean z4 = i10 != -1 && zze(split[i10].trim());
            int i11 = zzaocVar.zzj;
            if (i11 != -1) {
                java.lang.String trim3 = split[i11].trim();
                try {
                    parseInt = java.lang.Integer.parseInt(trim3.trim());
                } catch (java.lang.NumberFormatException unused) {
                }
                if (parseInt == 1 || parseInt == 3) {
                    i = parseInt;
                    return new com.google.android.gms.internal.ads.zzaoe(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i);
                }
                java.lang.String.valueOf(trim3);
                com.google.android.gms.internal.ads.zzeg.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(java.lang.String.valueOf(trim3)));
            }
            i = -1;
            return new com.google.android.gms.internal.ads.zzaoe(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i);
        } catch (java.lang.RuntimeException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            com.google.android.gms.internal.ads.zzeg.zzd("SsaStyle", sb2.toString(), e2);
            return null;
        }
    }

    public static java.lang.Integer zzb(java.lang.String str) {
        try {
            long parseLong = str.startsWith("&H") ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str);
            com.google.android.gms.internal.ads.zzgtj.zza(parseLong <= 4294967295L);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(com.google.android.gms.internal.ads.zzhah.zza(((parseLong >> 24) & 255) ^ 255), com.google.android.gms.internal.ads.zzhah.zza(parseLong & 255), com.google.android.gms.internal.ads.zzhah.zza((parseLong >> 8) & 255), com.google.android.gms.internal.ads.zzhah.zza((parseLong >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            com.google.android.gms.internal.ads.zzeg.zzd("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(java.lang.String str) {
        int parseInt;
        try {
            parseInt = java.lang.Integer.parseInt(str.trim());
        } catch (java.lang.NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                java.lang.String.valueOf(str);
                com.google.android.gms.internal.ads.zzeg.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(java.lang.String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(java.lang.String str) {
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (java.lang.NumberFormatException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            com.google.android.gms.internal.ads.zzeg.zzd("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
