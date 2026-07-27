package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ed implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3636a;

    public ed(ld ldVar) {
        this.f3636a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f3636a.f3990c.a()).execute(this.f3636a.f4008v);
    }
}
