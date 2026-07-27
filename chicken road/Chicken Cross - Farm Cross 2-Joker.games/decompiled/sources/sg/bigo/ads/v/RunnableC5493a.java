package sg.bigo.ads.v;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import sg.bigo.ads.L0.z;
import sg.bigo.ads.common.view.AdImageView;

/* renamed from: sg.bigo.ads.v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5493a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13343a;
    public final /* synthetic */ d b;

    public RunnableC5493a(d dVar, Bitmap bitmap) {
        this.b = dVar;
        this.f13343a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.b;
        Bitmap bitmap = this.f13343a;
        dVar.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            ViewGroup.LayoutParams layoutParams = dVar.e.getLayoutParams();
            if (layoutParams instanceof z) {
                z zVar = (z) layoutParams;
                zVar.f12421a = width;
                zVar.b = height;
            }
            dVar.e.setLayoutParams(layoutParams);
            dVar.a(width, height);
        }
        dVar.a(bitmap);
        ((AdImageView) this.b.g).setImageBitmap(this.f13343a);
    }
}
