package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbab implements Runnable {
    private zzbab() {
        throw null;
    }

    /* synthetic */ zzbab(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzbac.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzbac.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzbac.zzb;
        } catch (Throwable th) {
            zzbac.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
