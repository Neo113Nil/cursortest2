package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagr {
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(java.lang.String str) {
        java.util.regex.Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            java.lang.String group = matcher.group(1);
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            java.lang.String str3 = group;
            int parseInt = java.lang.Integer.parseInt(group, 16);
            java.lang.String group2 = matcher.group(2);
            java.lang.String str4 = group2;
            int parseInt2 = java.lang.Integer.parseInt(group2, 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzap zzapVar) {
        com.google.android.gms.internal.ads.zzgwm zze = zzapVar.zze(com.google.android.gms.internal.ads.zzaji.class, com.google.android.gms.internal.ads.zzagq.zza);
        int size = zze.size();
        int i = 0;
        while (i < size) {
            boolean zzc2 = zzc(((com.google.android.gms.internal.ads.zzaji) zze.get(i)).zzc);
            i++;
            if (zzc2) {
                return true;
            }
        }
        com.google.android.gms.internal.ads.zzgwm zze2 = zzapVar.zze(com.google.android.gms.internal.ads.zzajq.class, com.google.android.gms.internal.ads.zzagp.zza);
        int size2 = zze2.size();
        int i2 = 0;
        while (i2 < size2) {
            boolean zzc3 = zzc(((com.google.android.gms.internal.ads.zzajq) zze2.get(i2)).zzc);
            i2++;
            if (zzc3) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
