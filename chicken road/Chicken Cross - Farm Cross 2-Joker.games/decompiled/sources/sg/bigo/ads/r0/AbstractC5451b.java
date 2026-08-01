package sg.bigo.ads.r0;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.r0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5451b {
    public static sg.bigo.ads.U.a a(Context context, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        sg.bigo.ads.U.a[] aVarArr = new sg.bigo.ads.U.a[1];
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AbstractC5446j.a(0, new RunnableC5450a(context, aVarArr, atomicBoolean, countDownLatch));
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        if (atomicBoolean.get()) {
            return aVarArr[0];
        }
        throw new C5452c();
    }
}
