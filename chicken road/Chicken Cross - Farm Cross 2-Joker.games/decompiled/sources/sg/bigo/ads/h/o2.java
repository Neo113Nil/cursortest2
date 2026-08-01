package sg.bigo.ads.h;

import android.view.View;
import sg.bigo.ads.api.VideoController;

/* loaded from: classes3.dex */
public final class o2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoController f12912a;

    public o2(VideoController videoController) {
        this.f12912a = videoController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12912a.mute(!r2.isMuted());
    }
}
