package i;

import P.U;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import n3.AbstractC1464a;

/* renamed from: i.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220G extends AbstractC1464a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1222I f13622h;

    public /* synthetic */ C1220G(C1222I c1222i, int i7) {
        this.f13621g = i7;
        this.f13622h = c1222i;
    }

    @Override // P.c0
    public final void c() {
        View view;
        C1222I c1222i = this.f13622h;
        switch (this.f13621g) {
            case 0:
                if (c1222i.f13643o && (view = c1222i.f13636g) != null) {
                    view.setTranslationY(0.0f);
                    c1222i.f13633d.setTranslationY(0.0f);
                }
                c1222i.f13633d.setVisibility(8);
                c1222i.f13633d.setTransitioning(false);
                c1222i.f13648t = null;
                com.google.android.gms.common.internal.w wVar = c1222i.f13639k;
                if (wVar != null) {
                    wVar.g(c1222i.j);
                    c1222i.j = null;
                    c1222i.f13639k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c1222i.f13632c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = U.f5037a;
                    P.G.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c1222i.f13648t = null;
                c1222i.f13633d.requestLayout();
                break;
        }
    }
}
