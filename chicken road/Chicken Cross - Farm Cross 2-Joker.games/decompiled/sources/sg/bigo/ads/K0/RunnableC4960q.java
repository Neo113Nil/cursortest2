package sg.bigo.ads.K0;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.K0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4960q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12362a;
    public final /* synthetic */ r b;

    public RunnableC4960q(r rVar, Bitmap bitmap) {
        this.b = rVar;
        this.f12362a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.onReceiveValue(this.f12362a);
    }
}
