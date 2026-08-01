package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;

/* renamed from: sg.bigo.ads.h.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5224y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12945a;
    public final /* synthetic */ C5227z1 b;

    public RunnableC5224y1(C5227z1 c5227z1, Bitmap bitmap) {
        this.b = c5227z1;
        this.f12945a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12948a.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AbstractC4962t.a(this.b.f12948a.h, this.f12945a);
    }
}
