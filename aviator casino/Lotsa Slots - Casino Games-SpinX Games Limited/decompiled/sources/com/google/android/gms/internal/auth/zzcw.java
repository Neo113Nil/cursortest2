package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzcw extends com.google.android.gms.internal.auth.zzdc {
    zzcw(com.google.android.gms.internal.auth.zzcz zzczVar, java.lang.String str, java.lang.Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (com.google.android.gms.internal.auth.zzcb.zzc.matcher(obj).matches()) {
            return true;
        }
        if (com.google.android.gms.internal.auth.zzcb.zzd.matcher(obj).matches()) {
            return false;
        }
        android.util.Log.e("PhenotypeFlag", "Invalid boolean value for " + this.zzc + ": " + ((java.lang.String) obj));
        return null;
    }
}
