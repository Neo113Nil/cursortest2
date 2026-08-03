package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzcy extends com.google.android.gms.internal.auth.zzdc {
    final /* synthetic */ com.google.android.gms.internal.auth.zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(com.google.android.gms.internal.auth.zzcz zzczVar, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.auth.zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final java.lang.Object zza(java.lang.Object obj) {
        try {
            return com.google.android.gms.internal.auth.zzhs.zzp(android.util.Base64.decode((java.lang.String) obj, 3));
        } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            android.util.Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.zzc + ": " + ((java.lang.String) obj));
            return null;
        }
    }
}
