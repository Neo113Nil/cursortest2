package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgtf {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgte zzb;
    private com.google.android.gms.internal.ads.zzgte zzc;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        com.google.android.gms.internal.ads.zzgte zzgteVar = this.zzb.zzb;
        java.lang.String str = "";
        while (zzgteVar != null) {
            java.lang.Object obj = zzgteVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((java.lang.CharSequence) java.util.Arrays.deepToString(new java.lang.Object[]{obj}), 1, r3.length() - 1);
            }
            zzgteVar = zzgteVar.zzb;
            str = ", ";
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzgtf zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgte zzgteVar = new com.google.android.gms.internal.ads.zzgte();
        this.zzc.zzb = zzgteVar;
        this.zzc = zzgteVar;
        zzgteVar.zza = obj;
        return this;
    }

    /* synthetic */ zzgtf(java.lang.String str, byte[] bArr) {
        com.google.android.gms.internal.ads.zzgte zzgteVar = new com.google.android.gms.internal.ads.zzgte();
        this.zzb = zzgteVar;
        this.zzc = zzgteVar;
        str.getClass();
        this.zza = str;
    }
}
