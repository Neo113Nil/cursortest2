package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3548a;

    public cd(ld ldVar) {
        this.f3548a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f3548a.f3990c.a()).execute(this.f3548a.f4006t);
    }
}
