package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziaa implements com.google.android.gms.internal.ads.zziah {
    @Override // com.google.android.gms.internal.ads.zziah
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.String str, java.security.Provider provider) throws java.security.GeneralSecurityException {
        return provider == null ? javax.crypto.Cipher.getInstance(str) : javax.crypto.Cipher.getInstance(str, provider);
    }
}
