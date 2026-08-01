package sg.bigo.ads.w;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public final class f implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13365a;

    public f(i iVar) {
        this.f13365a = iVar;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.f13365a.c;
        if (c5085c != null) {
            c5085c.a(view, 1);
        }
    }
}
