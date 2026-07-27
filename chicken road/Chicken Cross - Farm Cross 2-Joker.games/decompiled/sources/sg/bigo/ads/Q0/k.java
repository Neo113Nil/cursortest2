package sg.bigo.ads.Q0;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class k implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.R0.m f12508a;
    public final /* synthetic */ ValueCallback b;
    public final /* synthetic */ n c;

    public k(n nVar, sg.bigo.ads.R0.m mVar, ValueCallback valueCallback) {
        this.c = nVar;
        this.f12508a = mVar;
        this.b = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        sg.bigo.ads.R0.m mVar = this.f12508a;
        mVar.getClass();
        mVar.f = System.currentTimeMillis();
        this.c.f12510a.a(0L);
        this.b.onReceiveValue((m) obj);
    }
}
