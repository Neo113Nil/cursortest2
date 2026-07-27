package sg.bigo.ads.j1;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public final class d implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13008a;
    public final /* synthetic */ h b;

    public d(h hVar, View view) {
        this.b = hVar;
        this.f13008a = view;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.b.c;
        if (c5085c != null) {
            c5085c.a(this.f13008a, 1);
        }
    }
}
