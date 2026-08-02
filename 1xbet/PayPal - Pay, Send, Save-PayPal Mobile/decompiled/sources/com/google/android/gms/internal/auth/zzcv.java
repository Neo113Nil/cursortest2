package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzcv extends com.google.android.gms.internal.auth.zzdc {
    zzcv(com.google.android.gms.internal.auth.zzcz zzczVar, java.lang.String str, java.lang.Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.e("PhenotypeFlag", "Invalid long value for " + this.zzc + ": " + ((java.lang.String) obj));
            return null;
        }
    }
}
