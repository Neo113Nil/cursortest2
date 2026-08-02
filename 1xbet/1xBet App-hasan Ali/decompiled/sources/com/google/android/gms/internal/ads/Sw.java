package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class Sw implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Executor f11601k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Gw f11602l;

    public Sw(Executor executor, Gw gw) {
        this.f11601k = executor;
        this.f11602l = gw;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f11601k.execute(runnable);
        } catch (RejectedExecutionException e3) {
            this.f11602l.g(e3);
        }
    }
}
