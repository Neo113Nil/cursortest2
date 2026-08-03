package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgts implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgty zzb;

    zzgts(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        java.util.Objects.requireNonNull(zzgtyVar);
        this.zzb = zzgtyVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        com.google.android.gms.internal.ads.zzgtd.zzb(sb, this, ", ");
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
