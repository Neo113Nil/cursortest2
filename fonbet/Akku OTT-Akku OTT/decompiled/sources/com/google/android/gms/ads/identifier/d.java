package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class d extends Thread {
    public final WeakReference<b> a;
    public final long b;
    public final CountDownLatch c = new CountDownLatch(1);
    public boolean d = false;

    public d(b bVar, long j) {
        this.a = new WeakReference<>(bVar);
        this.b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference<b> weakReference = this.a;
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS) || (bVar = weakReference.get()) == null) {
                return;
            }
            bVar.b();
            this.d = true;
        } catch (InterruptedException unused) {
            b bVar2 = weakReference.get();
            if (bVar2 != null) {
                bVar2.b();
                this.d = true;
            }
        }
    }
}
