package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.C0685c;

/* renamed from: com.bumptech.glide.load.engine.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0684b implements Runnable {
    public final /* synthetic */ C0685c a;

    public RunnableC0684b(C0685c c0685c) {
        this.a = c0685c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0685c c0685c = this.a;
        c0685c.getClass();
        while (true) {
            try {
                c0685c.b((C0685c.a) c0685c.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
