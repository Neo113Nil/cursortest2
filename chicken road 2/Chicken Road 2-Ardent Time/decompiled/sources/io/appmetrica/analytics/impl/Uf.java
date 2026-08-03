package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Uf implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f5075a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Consumer f5076b;

    public Uf(java.io.File file, io.appmetrica.analytics.impl.C0375g6 c0375g6) {
        this.f5075a = file;
        this.f5076b = c0375g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] listFiles;
        if (!this.f5075a.exists() || !this.f5075a.isDirectory() || (listFiles = this.f5075a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (java.io.File file : listFiles) {
            try {
                this.f5076b.consume(file);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
