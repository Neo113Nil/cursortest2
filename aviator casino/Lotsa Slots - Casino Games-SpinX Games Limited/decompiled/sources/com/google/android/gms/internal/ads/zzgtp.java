package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgtp extends com.google.android.gms.internal.ads.zzgtw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgsx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtp(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.zzgsx zzgsxVar) {
        super(zzgtyVar, charSequence);
        this.zza = zzgsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    final int zzc(int i) {
        java.lang.CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        com.google.android.gms.internal.ads.zzgtj.zzn(i, length, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    final int zzd(int i) {
        return i + 1;
    }
}
