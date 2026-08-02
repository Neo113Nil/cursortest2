package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1211kk {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ void o(C0606Hd c0606Hd) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || c0606Hd != ForkJoinPool.commonPool()) && !(isTerminated = c0606Hd.isTerminated())) {
            c0606Hd.shutdown();
            boolean z3 = false;
            while (!isTerminated) {
                try {
                    isTerminated = c0606Hd.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        c0606Hd.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void p(Vw vw) {
        ExecutorService executorService;
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || vw != ForkJoinPool.commonPool()) && !(isTerminated = (executorService = (ExecutorService) vw.f9410l).isTerminated())) {
            vw.shutdown();
            boolean z3 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        vw.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
