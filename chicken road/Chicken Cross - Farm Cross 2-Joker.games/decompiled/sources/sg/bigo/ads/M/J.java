package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class J implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f12429a;

    public J(sg.bigo.ads.v.d dVar) {
        this.f12429a = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f12429a.b(bitmap);
        }
    }
}
