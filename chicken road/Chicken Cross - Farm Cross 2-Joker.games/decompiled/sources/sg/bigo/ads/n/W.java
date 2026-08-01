package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class W implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f13153a;
    public final /* synthetic */ X b;

    public W(X x, sg.bigo.ads.v.d dVar) {
        this.b = x;
        this.f13153a = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            synchronized (this.b.f13154a.L) {
                this.b.f13154a.L.remove(this.f13153a);
            }
            this.f13153a.b(bitmap);
        }
    }
}
