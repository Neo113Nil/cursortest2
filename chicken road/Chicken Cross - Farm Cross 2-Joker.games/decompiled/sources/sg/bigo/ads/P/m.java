package sg.bigo.ads.P;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.h.AbstractC5151c0;

/* loaded from: classes3.dex */
public final class m implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAdActivityImpl f12485a;

    public m(AbstractC5151c0 abstractC5151c0) {
        this.f12485a = abstractC5151c0;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.f12485a.c;
        if (c5085c != null) {
            c5085c.a(view, 0);
        }
    }
}
