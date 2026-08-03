package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhzv implements com.google.android.gms.internal.ads.zzhzy {
    private final com.google.android.gms.internal.ads.zziah zza;

    @Override // com.google.android.gms.internal.ads.zzhzy
    public final java.lang.Object zza(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzhzz.zza(com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (java.security.Provider) it.next());
            } catch (java.lang.Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
