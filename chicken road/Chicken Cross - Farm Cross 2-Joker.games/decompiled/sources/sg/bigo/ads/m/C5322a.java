package sg.bigo.ads.m;

import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.m.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5322a implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5325d f13072a;

    public C5322a(AbstractC5325d abstractC5325d) {
        this.f13072a = abstractC5325d;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Double d = (Double) obj;
        if (d == null) {
            return;
        }
        this.f13072a.a(d.doubleValue());
    }
}
