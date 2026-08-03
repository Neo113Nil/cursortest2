package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbaf implements com.google.android.gms.internal.ads.zzfyw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfxb zza;

    zzbaf(com.google.android.gms.internal.ads.zzbah zzbahVar, com.google.android.gms.internal.ads.zzfxb zzfxbVar) {
        this.zza = zzfxbVar;
        java.util.Objects.requireNonNull(zzbahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    public final boolean zza(java.io.File file) {
        try {
            return this.zza.zza(file);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }
}
