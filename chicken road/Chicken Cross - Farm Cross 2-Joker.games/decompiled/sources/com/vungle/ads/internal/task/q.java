package com.vungle.ads.internal.task;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f12140a;

    public q(WeakReference runner) {
        Intrinsics.checkNotNullParameter(runner, "runner");
        this.f12140a = runner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = (r) this.f12140a.get();
        if (rVar != null) {
            rVar.a();
        }
    }
}
