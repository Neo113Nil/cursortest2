package sg.bigo.ads.Q0;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class i implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12506a;

    public i(n nVar) {
        this.f12506a = nVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12506a.f.set(false);
        this.f12506a.g.set(false);
    }
}
