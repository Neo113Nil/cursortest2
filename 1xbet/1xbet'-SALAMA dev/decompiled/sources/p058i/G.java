package p058i;

import P.U;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.common.internal.w;
import java.util.WeakHashMap;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I f13628h;

    public /* synthetic */ G(I i7, int i8) {
        this.f13627g = i8;
        this.f13628h = i7;
    }

    @Override // P.c0
    public final void c() {
        View view;
        I i7 = this.f13628h;
        switch (this.f13627g) {
            case 0:
                if (i7.f13649o && (view = i7.f13642g) != null) {
                    view.setTranslationY(0.0f);
                    i7.f13639d.setTranslationY(0.0f);
                }
                i7.f13639d.setVisibility(8);
                i7.f13639d.setTransitioning(false);
                i7.f13654t = null;
                w wVar = i7.f13645k;
                if (wVar != null) {
                    wVar.g(i7.j);
                    i7.j = null;
                    i7.f13645k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i7.f13638c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = U.f5037a;
                    P.G.c(actionBarOverlayLayout);
                }
                break;
            default:
                i7.f13654t = null;
                i7.f13639d.requestLayout();
                break;
        }
    }
}
