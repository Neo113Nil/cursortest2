package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgtl implements java.io.Serializable, com.google.android.gms.internal.ads.zzgtk {
    private final java.util.List zza;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgtl) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgtl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.and(");
        boolean z = true;
        for (java.lang.Object obj : this.zza) {
            if (!z) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final boolean zza(java.lang.Object obj) {
        int i = 0;
        while (true) {
            java.util.List list = this.zza;
            if (i >= list.size()) {
                return true;
            }
            if (!((com.google.android.gms.internal.ads.zzgtk) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
