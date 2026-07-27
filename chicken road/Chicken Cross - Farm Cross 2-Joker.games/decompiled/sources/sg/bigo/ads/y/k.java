package sg.bigo.ads.y;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5204s;

/* loaded from: classes3.dex */
public final class k implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5144a1 f13415a;
    public final /* synthetic */ l b;

    public k(l lVar, AbstractC5204s abstractC5204s) {
        this.b = lVar;
        this.f13415a = abstractC5204s;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        this.b.a(this.f13415a, rect);
    }
}
