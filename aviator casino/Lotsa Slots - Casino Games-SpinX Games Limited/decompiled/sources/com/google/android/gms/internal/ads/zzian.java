package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzian extends java.lang.ThreadLocal {
    final /* synthetic */ com.google.android.gms.internal.ads.zziao zza;

    zzian(com.google.android.gms.internal.ads.zziao zziaoVar) {
        java.util.Objects.requireNonNull(zziaoVar);
        this.zza = zziaoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final javax.crypto.Mac initialValue() {
        try {
            com.google.android.gms.internal.ads.zzhzz zzhzzVar = com.google.android.gms.internal.ads.zzhzz.zzb;
            com.google.android.gms.internal.ads.zziao zziaoVar = this.zza;
            javax.crypto.Mac mac = (javax.crypto.Mac) zzhzzVar.zzb(zziaoVar.zzb());
            mac.init(zziaoVar.zzc());
            return mac;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
