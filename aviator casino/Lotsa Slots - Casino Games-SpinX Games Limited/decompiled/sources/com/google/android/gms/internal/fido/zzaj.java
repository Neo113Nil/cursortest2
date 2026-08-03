package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public final class zzaj {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fido.zzah zzb;
    private com.google.android.gms.internal.fido.zzah zzc;

    /* synthetic */ zzaj(java.lang.String str, com.google.android.gms.internal.fido.zzai zzaiVar) {
        com.google.android.gms.internal.fido.zzah zzahVar = new com.google.android.gms.internal.fido.zzah(null);
        this.zzb = zzahVar;
        this.zzc = zzahVar;
        str.getClass();
        this.zza = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        com.google.android.gms.internal.fido.zzah zzahVar = this.zzb.zzc;
        java.lang.String str = "";
        while (zzahVar != null) {
            java.lang.Object obj = zzahVar.zzb;
            boolean z = zzahVar instanceof com.google.android.gms.internal.fido.zzaf;
            sb.append(str);
            java.lang.String str2 = zzahVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append(com.ironsource.B5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((java.lang.CharSequence) java.util.Arrays.deepToString(new java.lang.Object[]{obj}), 1, r3.length() - 1);
            }
            zzahVar = zzahVar.zzc;
            str = ", ";
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final com.google.android.gms.internal.fido.zzaj zza(java.lang.String str, int i) {
        java.lang.String valueOf = java.lang.String.valueOf(i);
        com.google.android.gms.internal.fido.zzaf zzafVar = new com.google.android.gms.internal.fido.zzaf(null);
        this.zzc.zzc = zzafVar;
        this.zzc = zzafVar;
        zzafVar.zzb = valueOf;
        zzafVar.zza = "errorCode";
        return this;
    }

    public final com.google.android.gms.internal.fido.zzaj zzb(java.lang.String str, @javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.fido.zzah zzahVar = new com.google.android.gms.internal.fido.zzah(null);
        this.zzc.zzc = zzahVar;
        this.zzc = zzahVar;
        zzahVar.zzb = obj;
        zzahVar.zza = str;
        return this;
    }
}
