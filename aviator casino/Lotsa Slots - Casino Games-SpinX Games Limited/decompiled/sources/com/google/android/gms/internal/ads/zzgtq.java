package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgtq extends com.google.android.gms.internal.ads.zzgtw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgsy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtq(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.zzgsy zzgsyVar) {
        super(zzgtyVar, charSequence);
        this.zza = zzgsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzc(int i) {
        java.util.regex.Matcher matcher = ((com.google.android.gms.internal.ads.zzgtb) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzd(int i) {
        return ((com.google.android.gms.internal.ads.zzgtb) this.zza).zza.end();
    }
}
