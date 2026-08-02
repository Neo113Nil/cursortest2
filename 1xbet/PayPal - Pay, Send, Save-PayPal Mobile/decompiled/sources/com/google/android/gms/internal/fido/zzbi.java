package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzbi {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fido.zzbg zzb;
    private com.google.android.gms.internal.fido.zzbg zzc;

    /* synthetic */ zzbi(java.lang.String str, com.google.android.gms.internal.fido.zzbh zzbhVar) {
        com.google.android.gms.internal.fido.zzbg zzbgVar = new com.google.android.gms.internal.fido.zzbg();
        this.zzb = zzbgVar;
        this.zzc = zzbgVar;
        str.getClass();
        this.zza = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        com.google.android.gms.internal.fido.zzbg zzbgVar = this.zzb.zzc;
        java.lang.String str = "";
        while (zzbgVar != null) {
            java.lang.Object obj = zzbgVar.zzb;
            sb.append(str);
            java.lang.String str2 = zzbgVar.zza;
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
            zzbgVar = zzbgVar.zzc;
            str = ", ";
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final com.google.android.gms.internal.fido.zzbi zza(java.lang.String str, int i) {
        com.google.android.gms.internal.fido.zzbf zzbfVar = new com.google.android.gms.internal.fido.zzbf(null);
        this.zzc.zzc = zzbfVar;
        this.zzc = zzbfVar;
        zzbfVar.zzb = java.lang.String.valueOf(i);
        zzbfVar.zza = "errorCode";
        return this;
    }

    public final com.google.android.gms.internal.fido.zzbi zzb(java.lang.String str, @javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzbg zzbgVar = new com.google.android.gms.internal.fido.zzbg();
        this.zzc.zzc = zzbgVar;
        this.zzc = zzbgVar;
        zzbgVar.zzb = obj;
        zzbgVar.zza = str;
        return this;
    }
}
