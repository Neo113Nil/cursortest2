package com.inmobi.media;

import java.util.TimerTask;

/* loaded from: classes6.dex */
public final class Am extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bm f6461a;
    public final /* synthetic */ byte b;

    public Am(Bm bm, byte b) {
        this.f6461a = bm;
        this.b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f6461a.b(this.b);
    }
}
