package sg.bigo.ads.G;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class b implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12303a;

    public b(c cVar) {
        this.f12303a = cVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        g gVar = this.f12303a.b.f12305a.f;
        if (gVar != null) {
            gVar.setImageBitmap(bitmap);
        }
    }
}
