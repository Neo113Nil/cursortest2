package sg.bigo.ads.M;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.e0.C5085c;

/* renamed from: sg.bigo.ads.M.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4986c implements sg.bigo.ads.K0.W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdOptionsView f12441a;
    public final /* synthetic */ View b;
    public final /* synthetic */ C4989f c;

    public C4986c(C4989f c4989f, AdOptionsView adOptionsView, View view) {
        this.c = c4989f;
        this.f12441a = adOptionsView;
        this.b = view;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        C5085c c5085c = this.c.g;
        if (c5085c != null) {
            c5085c.a(this.f12441a, 0);
            this.c.g.a(this.b, 0);
        }
    }
}
