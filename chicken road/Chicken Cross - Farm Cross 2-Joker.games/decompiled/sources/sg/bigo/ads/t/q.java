package sg.bigo.ads.t;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public final class q implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13316a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ v d;

    public q(v vVar, View view, View view2, View view3) {
        this.d = vVar;
        this.f13316a = view;
        this.b = view2;
        this.c = view3;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.d.c;
        if (c5085c != null) {
            c5085c.a(this.f13316a, 1);
            this.d.c.a(this.b, 1);
            this.d.c.a(this.c, 1);
        }
    }
}
