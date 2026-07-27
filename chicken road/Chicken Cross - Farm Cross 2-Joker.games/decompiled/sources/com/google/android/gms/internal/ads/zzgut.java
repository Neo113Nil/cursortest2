package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgut implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzguz zzb;

    zzgut(zzguz zzguzVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzguzVar);
        this.zzb = zzguzVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzgue.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
