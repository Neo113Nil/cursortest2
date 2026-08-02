package o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import e3.C1018c;
import java.util.concurrent.CountDownLatch;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1490d extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        C1489c c1489c = (C1489c) message.obj;
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            c1489c.f15541a.getClass();
            return;
        }
        RunnableC1487a runnableC1487a = c1489c.f15541a;
        Object obj = c1489c.f15542b[0];
        if (runnableC1487a.f15536d.get()) {
            countDownLatch = runnableC1487a.f15538f;
            try {
                C1018c c1018c = runnableC1487a.f15539x;
                if (c1018c.f12659h == runnableC1487a) {
                    SystemClock.uptimeMillis();
                    c1018c.f12659h = null;
                    c1018c.b();
                }
                countDownLatch.countDown();
            } finally {
                countDownLatch.countDown();
            }
        } else {
            try {
                C1018c c1018c2 = runnableC1487a.f15539x;
                if (c1018c2.f12658g != runnableC1487a) {
                    if (c1018c2.f12659h == runnableC1487a) {
                        SystemClock.uptimeMillis();
                        c1018c2.f12659h = null;
                        c1018c2.b();
                    }
                } else if (!c1018c2.f12654c) {
                    SystemClock.uptimeMillis();
                    c1018c2.f12658g = null;
                    n0.b bVar = c1018c2.f12652a;
                    if (bVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.i(obj);
                        } else {
                            bVar.g(obj);
                        }
                    }
                }
            } finally {
                countDownLatch = runnableC1487a.f15538f;
            }
        }
        runnableC1487a.f15535c = 3;
    }
}
