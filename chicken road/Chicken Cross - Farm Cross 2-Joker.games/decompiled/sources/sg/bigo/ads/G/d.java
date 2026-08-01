package sg.bigo.ads.G;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class d implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f12305a;

    public d(h hVar) {
        this.f12305a = hVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        AbstractC5446j.b(new c(this, (Bitmap) obj));
    }
}
