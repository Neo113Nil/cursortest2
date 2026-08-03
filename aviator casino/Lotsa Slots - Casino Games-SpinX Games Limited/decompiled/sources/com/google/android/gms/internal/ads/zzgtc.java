package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgtc extends com.google.android.gms.internal.ads.zzgsz implements java.io.Serializable {
    private final java.util.regex.Pattern zza;

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final com.google.android.gms.internal.ads.zzgsy zza(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.ads.zzgtb(this.zza.matcher(charSequence));
    }

    zzgtc(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
