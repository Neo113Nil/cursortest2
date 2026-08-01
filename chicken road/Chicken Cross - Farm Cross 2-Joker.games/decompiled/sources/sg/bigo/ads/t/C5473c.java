package sg.bigo.ads.t;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.e0.C5085c;

/* renamed from: sg.bigo.ads.t.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5473c implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13308a;
    public final /* synthetic */ C5474d b;

    public C5473c(C5474d c5474d, View view) {
        this.b = c5474d;
        this.f13308a = view;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.b.c;
        if (c5085c != null) {
            c5085c.a(this.f13308a, 1);
        }
    }
}
