package A0;

import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import com.google.android.gms.internal.ads.C0592Fd;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class V {
    public static /* bridge */ /* synthetic */ Class C() {
        return Optional.class;
    }

    public static /* synthetic */ LocaleList d(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan e(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return CompletableFuture.class;
    }

    public static /* synthetic */ void u(C0592Fd c0592Fd) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || c0592Fd != ForkJoinPool.commonPool()) && !(isTerminated = c0592Fd.isTerminated())) {
            c0592Fd.shutdown();
            boolean z3 = false;
            while (!isTerminated) {
                try {
                    isTerminated = c0592Fd.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        c0592Fd.shutdownNow();
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void v(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z3 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z3) {
                        executorService.shutdownNow();
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
