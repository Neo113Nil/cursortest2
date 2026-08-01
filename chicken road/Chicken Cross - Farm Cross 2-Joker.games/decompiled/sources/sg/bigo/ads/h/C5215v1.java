package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.h.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5215v1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12935a;

    public C5215v1(ImageView imageView) {
        this.f12935a = imageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12935a.post(new RunnableC5212u1(this, (Bitmap) obj));
    }
}
