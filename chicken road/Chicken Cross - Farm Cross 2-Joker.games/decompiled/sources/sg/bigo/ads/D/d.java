package sg.bigo.ads.D;

import android.view.View;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12249a;

    public d(g gVar) {
        this.f12249a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaView mediaView;
        g gVar = this.f12249a;
        MediaView mediaView2 = gVar.c0;
        if (mediaView2 != null) {
            View findViewWithTag = mediaView2.findViewWithTag("blur_image_view");
            gVar.c0.removeAllViews();
            if (findViewWithTag != null) {
                X.a(findViewWithTag, gVar.c0, null, 0);
            }
        }
        g gVar2 = this.f12249a;
        if (gVar2.l0 == null || (mediaView = gVar2.c0) == null) {
            return;
        }
        super/*sg.bigo.ads.C.t*/.a(mediaView);
    }
}
