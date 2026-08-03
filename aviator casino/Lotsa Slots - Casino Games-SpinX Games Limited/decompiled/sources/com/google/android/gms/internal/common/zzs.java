package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
final class zzs extends com.google.android.gms.internal.common.zzv {
    final /* synthetic */ com.google.android.gms.internal.common.zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(com.google.android.gms.internal.common.zzw zzwVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.common.zzp zzpVar) {
        super(zzwVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzc(int i) {
        java.lang.CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        com.google.android.gms.internal.common.zzr.zzc(i, length, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (this.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzd(int i) {
        return i + 1;
    }
}
