package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflr {
    private final java.util.regex.Pattern zza;

    public zzflr() {
        java.util.regex.Pattern pattern;
        try {
            pattern = java.util.regex.Pattern.compile((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhO));
        } catch (java.util.regex.PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    public final java.lang.String zza(java.lang.String str) {
        java.util.regex.Pattern pattern = this.zza;
        if (pattern == null || str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
