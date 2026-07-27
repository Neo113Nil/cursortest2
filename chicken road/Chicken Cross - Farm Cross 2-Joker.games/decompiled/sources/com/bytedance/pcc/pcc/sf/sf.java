package com.bytedance.pcc.pcc.sf;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public abstract class sf implements Runnable {
    private final long pcc = SystemClock.elapsedRealtime();

    protected abstract void pcc(long j);

    @Override // java.lang.Runnable
    public void run() {
        pcc(SystemClock.elapsedRealtime() - this.pcc);
    }
}
