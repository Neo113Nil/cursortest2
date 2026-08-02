package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1590t3 implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15630k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Handler f15631l;

    public /* synthetic */ ExecutorC1590t3(Handler handler, int i) {
        this.f15630k = i;
        this.f15631l = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15630k) {
            case 0:
                this.f15631l.post(runnable);
                break;
            case 1:
                this.f15631l.post(runnable);
                break;
            default:
                this.f15631l.post(runnable);
                break;
        }
    }
}
