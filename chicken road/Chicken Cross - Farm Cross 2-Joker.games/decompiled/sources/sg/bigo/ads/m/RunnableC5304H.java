package sg.bigo.ads.m;

import sg.bigo.ads.h.AbstractC5140Q;

/* renamed from: sg.bigo.ads.m.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5304H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13065a;
    public final /* synthetic */ C5305I b;

    public RunnableC5304H(C5305I c5305i, RunnableC5324c runnableC5324c) {
        this.b = c5305i;
        this.f13065a = runnableC5324c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5305I c5305i = this.b;
        if (c5305i.u != null && c5305i.g()) {
            AbstractC5140Q.a(c5305i.u);
        }
        Runnable runnable = this.f13065a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
