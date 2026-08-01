package sg.bigo.ads.H;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class l implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12316a;

    public l(m mVar) {
        this.f12316a = mVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f12316a.b.r.setImageBitmap(bitmap);
        }
    }
}
