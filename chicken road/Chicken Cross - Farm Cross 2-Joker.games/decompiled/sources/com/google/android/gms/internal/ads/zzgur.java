package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgur extends zzgux {
    final /* synthetic */ zzgtz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgur(zzguz zzguzVar, CharSequence charSequence, zzgtz zzgtzVar) {
        super(zzguzVar, charSequence);
        this.zza = zzgtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzc(int i) {
        Matcher matcher = ((zzguc) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzd(int i) {
        return ((zzguc) this.zza).zza.end();
    }
}
