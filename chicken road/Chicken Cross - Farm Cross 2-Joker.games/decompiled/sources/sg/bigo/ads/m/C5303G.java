package sg.bigo.ads.m;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.h.AbstractC5144a1;

/* renamed from: sg.bigo.ads.m.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5303G implements sg.bigo.ads.K0.W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5144a1 f13064a;
    public final /* synthetic */ C5305I b;

    public C5303G(C5305I c5305i, AbstractC5144a1 abstractC5144a1) {
        this.b = c5305i;
        this.f13064a = abstractC5144a1;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        this.b.a(this.f13064a, rect);
    }
}
