package sg.bigo.ads.s0;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13295a;
    public final /* synthetic */ o b;

    public n(o oVar, Bitmap bitmap) {
        this.b = oVar;
        this.f13295a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = (ImageView) this.b.c.get();
        if (imageView != null) {
            imageView.setImageBitmap(this.f13295a);
        }
    }
}
