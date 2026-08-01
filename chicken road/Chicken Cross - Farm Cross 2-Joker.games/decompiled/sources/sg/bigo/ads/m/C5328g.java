package sg.bigo.ads.m;

import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.m.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5328g implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f13080a;

    public C5328g(e0 e0Var) {
        this.f13080a = e0Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Double d = (Double) obj;
        if (d == null) {
            return;
        }
        this.f13080a.b(d.doubleValue());
    }
}
