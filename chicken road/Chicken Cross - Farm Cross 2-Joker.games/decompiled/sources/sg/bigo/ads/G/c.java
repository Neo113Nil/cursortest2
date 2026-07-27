package sg.bigo.ads.G;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.r;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12304a;
    public final /* synthetic */ d b;

    public c(d dVar, Bitmap bitmap) {
        this.b = dVar;
        this.f12304a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.b.f12305a;
        if (hVar.c == null) {
            return;
        }
        MediaView mediaView = hVar.d;
        View findViewWithTag = mediaView != null ? mediaView.findViewWithTag("blur_image_view") : null;
        if (findViewWithTag instanceof g) {
            this.b.f12305a.f = (g) findViewWithTag;
        } else {
            this.b.f12305a.f = new g(this.b.f12305a.c);
            this.b.f12305a.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            h hVar2 = this.b.f12305a;
            X.a(hVar2.f, hVar2.d, null, 0);
            this.b.f12305a.f.setTag("blur_image_view");
        }
        g gVar = this.b.f12305a.f;
        if (gVar != null) {
            gVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap bitmap = this.f12304a;
            Bitmap a2 = (bitmap == null || bitmap.getWidth() <= 0 || this.f12304a.getHeight() <= 0) ? this.b.f12305a.a() : this.f12304a;
            Context context = this.b.f12305a.f.getContext();
            b bVar = new b(this);
            if (context == null || a2 == null) {
                return;
            }
            AbstractC5446j.a(1, null, new r(context, a2, bVar), 0L);
        }
    }
}
