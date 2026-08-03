package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzazn implements java.lang.Runnable {
    private zzazn() {
        throw null;
    }

    /* synthetic */ zzazn(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CountDownLatch countDownLatch;
        try {
            com.google.android.gms.internal.ads.zzazo.zzd = java.security.MessageDigest.getInstance("MD5");
            countDownLatch = com.google.android.gms.internal.ads.zzazo.zzb;
        } catch (java.security.NoSuchAlgorithmException unused) {
            countDownLatch = com.google.android.gms.internal.ads.zzazo.zzb;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.ads.zzazo.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
