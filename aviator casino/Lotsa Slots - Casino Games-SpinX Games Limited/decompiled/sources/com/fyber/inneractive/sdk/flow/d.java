package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f3678a;
    public final com.fyber.inneractive.sdk.interfaces.b b;
    public final com.fyber.inneractive.sdk.flow.b c = new com.fyber.inneractive.sdk.flow.b(this);
    public final com.fyber.inneractive.sdk.flow.c d = new com.fyber.inneractive.sdk.flow.c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.b = bVar;
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (this.f3678a != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", com.fyber.inneractive.sdk.util.IAlog.a(this));
            android.os.Handler handler = this.f3678a;
            if (handler != null) {
                handler.removeCallbacks(this.d);
            }
            this.f3678a.getLooper().quitSafely();
            this.f3678a = null;
        }
    }
}
