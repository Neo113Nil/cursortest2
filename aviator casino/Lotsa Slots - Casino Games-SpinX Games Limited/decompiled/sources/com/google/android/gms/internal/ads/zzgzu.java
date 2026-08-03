package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgzu implements java.io.FilenameFilter {
    private final java.util.regex.Pattern zza;

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return this.zza.matcher(str).matches();
    }

    public zzgzu(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
