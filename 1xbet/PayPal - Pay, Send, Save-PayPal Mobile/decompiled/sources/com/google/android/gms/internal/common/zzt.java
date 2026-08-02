package com.google.android.gms.internal.common;

/* loaded from: classes8.dex */
final class zzt implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.common.zzw zzb;

    zzt(com.google.android.gms.internal.common.zzw zzwVar, java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        java.util.Objects.requireNonNull(zzwVar);
        this.zzb = zzwVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        java.util.Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) ", ");
                    sb.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                }
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zzb.zze(this.zza);
    }
}
