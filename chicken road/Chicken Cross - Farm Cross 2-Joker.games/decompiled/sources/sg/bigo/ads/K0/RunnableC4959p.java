package sg.bigo.ads.K0;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.K0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4959p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12361a;
    public final /* synthetic */ Bitmap b;

    public RunnableC4959p(ValueCallback valueCallback, Bitmap bitmap) {
        this.f12361a = valueCallback;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12361a.onReceiveValue(this.b);
    }
}
