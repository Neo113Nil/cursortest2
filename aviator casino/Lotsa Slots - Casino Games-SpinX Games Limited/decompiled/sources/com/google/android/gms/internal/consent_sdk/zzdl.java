package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzdl extends com.google.android.gms.internal.consent_sdk.zzdn {
    zzdl(com.google.android.gms.internal.consent_sdk.zzdo zzdoVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.consent_sdk.zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzd(int i) {
        java.lang.CharSequence charSequence = this.zza;
        int length = charSequence.length();
        com.google.android.gms.internal.consent_sdk.zzdj.zzb(i, length, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (charSequence.charAt(i) == ',') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
