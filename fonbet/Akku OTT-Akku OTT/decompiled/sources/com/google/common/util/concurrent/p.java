package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class p implements Callable<Void> {
    public final /* synthetic */ androidx.core.widget.c a;

    public p(androidx.core.widget.c cVar) {
        this.a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.a.run();
        return null;
    }
}
