package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzav {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzat zzb;
    private com.google.android.gms.internal.mlkit_vision_barcode.zzat zzc;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        com.google.android.gms.internal.mlkit_vision_barcode.zzat zzatVar = this.zzb.zzb;
        java.lang.String str = "";
        while (zzatVar != null) {
            java.lang.Object obj = zzatVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzatVar = zzatVar.zzb;
            str = ", ";
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzav zza(@javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzat zzatVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzat();
        this.zzc.zzb = zzatVar;
        this.zzc = zzatVar;
        zzatVar.zza = obj;
        return this;
    }

    /* synthetic */ zzav(java.lang.String str, com.google.android.gms.internal.mlkit_vision_barcode.zzau zzauVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzat zzatVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzat();
        this.zzb = zzatVar;
        this.zzc = zzatVar;
        str.getClass();
        this.zza = str;
    }
}
