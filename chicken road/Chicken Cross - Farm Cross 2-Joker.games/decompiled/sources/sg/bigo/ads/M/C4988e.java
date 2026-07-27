package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.M.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4988e implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12443a;

    public C4988e(ImageView imageView) {
        this.f12443a = imageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12443a.post(new RunnableC4987d(this, (Bitmap) obj));
    }
}
