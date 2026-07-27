package sg.bigo.ads.D1;

import android.webkit.ValueCallback;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class h implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f12259a;
    public final /* synthetic */ String[] b;

    public h(CountDownLatch countDownLatch, String[] strArr) {
        this.f12259a = countDownLatch;
        this.b = strArr;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12259a.countDown();
        this.b[0] = (String) obj;
    }
}
