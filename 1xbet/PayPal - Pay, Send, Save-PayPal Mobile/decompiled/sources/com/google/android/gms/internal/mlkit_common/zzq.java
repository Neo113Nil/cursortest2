package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzq {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.mlkit_common.zzo zzb;
    private com.google.android.gms.internal.mlkit_common.zzo zzc;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        com.google.android.gms.internal.mlkit_common.zzo zzoVar = this.zzb.zzc;
        java.lang.String str = "";
        while (zzoVar != null) {
            java.lang.Object obj = zzoVar.zzb;
            sb.append(str);
            java.lang.String str2 = zzoVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzoVar = zzoVar.zzc;
            str = ", ";
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final com.google.android.gms.internal.mlkit_common.zzq zza(java.lang.String str, @javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.mlkit_common.zzo zzoVar = new com.google.android.gms.internal.mlkit_common.zzo();
        this.zzc.zzc = zzoVar;
        this.zzc = zzoVar;
        zzoVar.zzb = obj;
        zzoVar.zza = str;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzq zzb(java.lang.String str, boolean z) {
        com.google.android.gms.internal.mlkit_common.zzn zznVar = new com.google.android.gms.internal.mlkit_common.zzn(null);
        this.zzc.zzc = zznVar;
        this.zzc = zznVar;
        zznVar.zzb = java.lang.String.valueOf(z);
        zznVar.zza = "isManifestFile";
        return this;
    }

    /* synthetic */ zzq(java.lang.String str, com.google.android.gms.internal.mlkit_common.zzp zzpVar) {
        com.google.android.gms.internal.mlkit_common.zzo zzoVar = new com.google.android.gms.internal.mlkit_common.zzo();
        this.zzb = zzoVar;
        this.zzc = zzoVar;
        str.getClass();
        this.zza = str;
    }
}
