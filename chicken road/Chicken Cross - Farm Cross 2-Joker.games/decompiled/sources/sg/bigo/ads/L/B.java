package sg.bigo.ads.L;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class B implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12368a;
    public final /* synthetic */ N b;

    public B(N n, ViewGroup viewGroup) {
        this.b = n;
        this.f12368a = viewGroup;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        ViewGroup viewGroup;
        if (this.b.i0 == null || (viewGroup = this.f12368a) == null) {
            return;
        }
        this.b.i0.a(viewGroup.findViewById(R.id.bigo_ad_splash_options), 1);
        this.b.i0.a(this.f12368a.findViewById(R.id.inter_layout_ad_tag), 1);
    }
}
