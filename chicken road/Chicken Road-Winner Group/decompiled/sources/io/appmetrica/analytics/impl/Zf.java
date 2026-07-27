package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes.dex */
public final class Zf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f6909a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f6910b;

    public Zf(File file, C0693n6 c0693n6) {
        this.f6909a = file;
        this.f6910b = c0693n6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f6909a.exists() || !this.f6909a.isDirectory() || (listFiles = this.f6909a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f6910b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
