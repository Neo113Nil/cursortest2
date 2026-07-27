package sg.bigo.ads.i;

import android.content.Context;

/* renamed from: sg.bigo.ads.i.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5237i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12984a;
    public final /* synthetic */ C5241m b;

    public RunnableC5237i(C5241m c5241m, Context context) {
        this.b = c5241m;
        this.f12984a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.p.a(this.f12984a);
    }
}
