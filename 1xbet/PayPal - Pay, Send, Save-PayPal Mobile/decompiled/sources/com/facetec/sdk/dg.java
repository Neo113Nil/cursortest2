package com.facetec.sdk;

/* loaded from: classes8.dex */
final class dg extends java.util.TimerTask {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f3508a;

    dg(java.lang.Runnable runnable) {
        this.f3508a = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f3508a.run();
    }
}
