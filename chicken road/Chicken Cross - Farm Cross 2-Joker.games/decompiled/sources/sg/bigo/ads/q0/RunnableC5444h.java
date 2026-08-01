package sg.bigo.ads.q0;

import android.os.Handler;
import android.os.Looper;
import sg.bigo.ads.z0.RunnableC5528c;

/* renamed from: sg.bigo.ads.q0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5444h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13255a;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ Looper c;
    public final /* synthetic */ Handler d;
    public final /* synthetic */ Runnable e;

    public RunnableC5444h(RunnableC5528c runnableC5528c, Looper looper, HandlerC5438b handlerC5438b, RunnableC5441e runnableC5441e) {
        this.f13255a = runnableC5528c;
        this.c = looper;
        this.d = handlerC5438b;
        this.e = runnableC5441e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13255a == null) {
            this.e.run();
        } else if (this.b || this.c == AbstractC5446j.g.getLooper()) {
            AbstractC5446j.g.post(new RunnableC5442f(this));
        } else {
            new Handler(this.c).post(new RunnableC5443g(this));
        }
    }
}
