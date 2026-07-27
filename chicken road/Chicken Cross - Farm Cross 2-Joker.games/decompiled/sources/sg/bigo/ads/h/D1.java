package sg.bigo.ads.h;

import android.net.Uri;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;

/* loaded from: classes3.dex */
public final class D1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12812a;
    public final /* synthetic */ ValueCallback b;
    public final /* synthetic */ F1 c;

    public D1(F1 f1, String str, B1 b1) {
        this.c = f1;
        this.f12812a = str;
        this.b = b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.onReceiveValue(AbstractC4962t.b(Uri.parse(this.f12812a).getPath(), this.c.d.k.e));
    }
}
