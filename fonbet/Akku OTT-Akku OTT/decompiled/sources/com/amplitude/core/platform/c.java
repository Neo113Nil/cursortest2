package com.amplitude.core.platform;

/* loaded from: classes3.dex */
public final class c extends Thread {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        bVar.h.cancel(null);
        bVar.g.cancel(null);
        bVar.i = false;
    }
}
