package sg.bigo.ads.K0;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.K0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4957n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12359a;
    public final /* synthetic */ RunnableC4958o b;

    public RunnableC4957n(RunnableC4958o runnableC4958o, Bitmap bitmap) {
        this.b = runnableC4958o;
        this.f12359a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.onReceiveValue(this.f12359a);
    }
}
