package sg.bigo.ads.L;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class u implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12398a;

    public u(ImageView imageView) {
        this.f12398a = imageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f12398a.setImageBitmap(bitmap);
        }
    }
}
