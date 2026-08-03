package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgtr extends com.google.android.gms.internal.ads.zzgtw {
    zzgtr(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence, int i) {
        super(zzgtyVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzc(int i) {
        java.lang.CharSequence charSequence = this.zzb;
        int i2 = i + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzd(int i) {
        return i;
    }
}
