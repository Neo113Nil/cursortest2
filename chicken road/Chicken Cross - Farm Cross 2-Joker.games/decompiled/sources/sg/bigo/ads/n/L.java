package sg.bigo.ads.n;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class L implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f13141a;

    public L(N n) {
        this.f13141a = n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13141a.T.setAlpha((((Integer) obj).intValue() * 1.0f) / 100.0f);
    }
}
