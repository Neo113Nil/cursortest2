package sg.bigo.ads.h;

import android.view.ViewGroup;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class W1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12860a;
    public final /* synthetic */ C5149b2 b;

    public W1(C5149b2 c5149b2, ViewGroup viewGroup) {
        this.b = c5149b2;
        this.f12860a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaView mediaView;
        C5149b2 c5149b2 = this.b;
        if (!c5149b2.v || c5149b2.t == null || sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) c5149b2.e)) {
            return;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(this.b.t.a("video_play_page.img_animation"));
        if ((a2 != null ? a2.intValue() : 0) == 1) {
            C5149b2 c5149b22 = this.b;
            ViewGroup viewGroup = this.f12860a;
            c5149b22.getClass();
            if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
                return;
            }
            AbstractC5446j.a(2, null, new X1(c5149b22, mediaView), 100L);
        }
    }
}
