package sg.bigo.ads.h;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class C1 implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12808a;
    public final /* synthetic */ F1 b;

    public C1(F1 f1, ValueCallback valueCallback) {
        this.b = f1;
        this.f12808a = valueCallback;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        this.f12808a.onReceiveValue(this.b.j);
    }
}
