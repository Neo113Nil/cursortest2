package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class zzbfs {
    private static java.security.MessageDigest zzb;
    protected final java.lang.Object zza = new java.lang.Object();

    abstract byte[] zza(java.lang.String str);

    protected final java.security.MessageDigest zzb() {
        synchronized (this.zza) {
            java.security.MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = java.security.MessageDigest.getInstance("MD5");
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }
}
