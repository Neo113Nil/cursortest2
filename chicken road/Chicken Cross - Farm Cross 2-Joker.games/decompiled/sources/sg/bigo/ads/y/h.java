package sg.bigo.ads.y;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class h implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13414a;

    public h(i iVar) {
        this.f13414a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        this.f13414a.n.post(new g(this, bitmap));
    }
}
