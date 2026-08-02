package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class zzcar implements Runnable {
    public zzcar(zzcat zzcatVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
