package sg.bigo.ads.h;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12803a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C0 c;

    public B0(C0 c0, int i, int i2) {
        this.c = c0;
        this.f12803a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int width = this.c.f12807a.getWidth();
        int height = this.c.f12807a.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.b.getLayoutParams();
        if (width <= 0 || height <= 0 || (i = this.f12803a) <= 0 || (i2 = this.b) <= 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            return;
        }
        if ((i * 1.0f) / i2 > (width * 1.0f) / height) {
            layoutParams.width = width;
            layoutParams.height = (width * i2) / i;
        } else {
            layoutParams.width = (i * height) / i2;
            layoutParams.height = height;
        }
        this.c.b.requestLayout();
    }
}
