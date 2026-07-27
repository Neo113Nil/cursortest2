package sg.bigo.ads.D1;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class i implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12260a;

    public i(d dVar) {
        this.f12260a = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12260a.onReceiveValue((String) obj);
    }
}
