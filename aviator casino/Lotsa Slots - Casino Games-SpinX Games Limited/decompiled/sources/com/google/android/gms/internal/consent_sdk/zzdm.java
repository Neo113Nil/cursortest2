package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzdm implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzdo zzb;

    zzdm(com.google.android.gms.internal.consent_sdk.zzdo zzdoVar, java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        java.util.Objects.requireNonNull(zzdoVar);
        this.zzb = zzdoVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return com.google.android.gms.internal.consent_sdk.zzdo.zzc(this.zzb, this.zza);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        java.util.Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(com.google.android.gms.internal.consent_sdk.zzdi.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) ", ");
                    sb.append(com.google.android.gms.internal.consent_sdk.zzdi.zza(it.next(), ", "));
                }
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
