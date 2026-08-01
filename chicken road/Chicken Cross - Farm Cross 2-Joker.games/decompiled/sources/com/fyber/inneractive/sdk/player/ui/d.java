package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5816a;
    public final /* synthetic */ e b;

    public d(e eVar, boolean z) {
        this.b = eVar;
        this.f5816a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5816a == this.b.hasWindowFocus()) {
            this.b.f();
        }
    }
}
