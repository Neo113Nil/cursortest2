package sg.bigo.ads.D;

import android.view.View;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12248a;

    public c(g gVar) {
        this.f12248a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f12248a;
        MediaView mediaView = gVar.c0;
        if (mediaView != null) {
            if (mediaView != null) {
                View findViewWithTag = mediaView.findViewWithTag("blur_image_view");
                gVar.c0.removeAllViews();
                if (findViewWithTag != null) {
                    X.a(findViewWithTag, gVar.c0, null, 0);
                }
            }
            g gVar2 = this.f12248a;
            gVar2.u0.a(gVar2.c0);
        }
    }
}
