package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class i0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f13085a;

    public i0(h0 h0Var) {
        this.f13085a = h0Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13085a.onReceiveValue((Bitmap) obj);
    }
}
