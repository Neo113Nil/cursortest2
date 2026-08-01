package sg.bigo.ads.n;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class X implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f13154a;

    public X(U0 u0) {
        this.f13154a = u0;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13154a.a(new W(this, (sg.bigo.ads.v.d) obj));
    }
}
