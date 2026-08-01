package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzguq extends zzgux {
    final /* synthetic */ zzgty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguq(zzguz zzguzVar, CharSequence charSequence, zzgty zzgtyVar) {
        super(zzguzVar, charSequence);
        this.zza = zzgtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzguk.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    final int zzd(int i) {
        return i + 1;
    }
}
