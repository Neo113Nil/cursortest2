package sg.bigo.ads.h;

import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.h.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5218w1 implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12938a;
    public final /* synthetic */ F1 b;

    public C5218w1(F1 f1, C5215v1 c5215v1) {
        this.b = f1;
        this.f12938a = c5215v1;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        this.f12938a.onReceiveValue(this.b.j);
    }
}
