package sg.bigo.ads.t;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class k implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13312a;

    public k(v vVar) {
        this.f13312a = vVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13312a.M0 = true;
    }
}
