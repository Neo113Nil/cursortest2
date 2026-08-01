package sg.bigo.ads.k1;

import android.view.View;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.core.mraid.MraidVideoActivity;

/* loaded from: classes3.dex */
public final class S implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MraidVideoActivity f13023a;

    public S(MraidVideoActivity mraidVideoActivity) {
        this.f13023a = mraidVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoController videoController = this.f13023a.b;
        if (videoController != null) {
            if (videoController.isPlaying()) {
                this.f13023a.b.pause();
            } else {
                this.f13023a.b.play();
            }
        }
    }
}
