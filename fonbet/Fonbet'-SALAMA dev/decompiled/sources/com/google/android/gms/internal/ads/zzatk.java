package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class zzatk implements Runnable {
    private zzatk() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzatm.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzatm.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzatm.zzb;
        } catch (Throwable th) {
            zzatm.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzatk(zzatl zzatlVar) {
    }
}
