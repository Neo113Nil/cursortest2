package p102o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import p033e3.c;
import p095n0.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = (c) message.obj;
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            cVar.f15547a.getClass();
            return;
        }
        a aVar = cVar.f15547a;
        Object obj = cVar.f15548b[0];
        if (aVar.f15542d.get()) {
            CountDownLatch countDownLatch = aVar.f15544f;
            try {
                c cVar2 = aVar.f15545x;
                if (cVar2.f12665h == aVar) {
                    SystemClock.uptimeMillis();
                    cVar2.f12665h = null;
                    cVar2.b();
                }
                countDownLatch.countDown();
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        } else {
            try {
                c cVar3 = aVar.f15545x;
                if (cVar3.f12664g != aVar) {
                    if (cVar3.f12665h == aVar) {
                        SystemClock.uptimeMillis();
                        cVar3.f12665h = null;
                        cVar3.b();
                    }
                } else if (!cVar3.f12660c) {
                    SystemClock.uptimeMillis();
                    cVar3.f12664g = null;
                    b bVar = cVar3.f12658a;
                    if (bVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.i(obj);
                        } else {
                            bVar.g(obj);
                        }
                    }
                }
                aVar.f15544f.countDown();
            } catch (Throwable th2) {
                aVar.f15544f.countDown();
                throw th2;
            }
        }
        aVar.f15541c = 3;
    }
}
