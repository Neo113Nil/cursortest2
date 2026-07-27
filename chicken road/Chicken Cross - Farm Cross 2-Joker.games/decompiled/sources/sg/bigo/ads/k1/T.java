package sg.bigo.ads.k1;

import android.view.View;
import sg.bigo.ads.core.mraid.MraidVideoActivity;

/* loaded from: classes3.dex */
public final class T implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MraidVideoActivity f13024a;

    public T(MraidVideoActivity mraidVideoActivity) {
        this.f13024a = mraidVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f13024a.finish();
    }
}
