package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
final class zza extends java.lang.Thread {
    zza(java.lang.ThreadGroup threadGroup, java.lang.String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
