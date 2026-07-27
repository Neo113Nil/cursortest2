package sg.bigo.ads.M;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.M.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4998o implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f12451a;

    public C4998o(ImageView imageView) {
        this.f12451a = imageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12451a.post(new RunnableC4997n(this, (Bitmap) obj));
    }
}
