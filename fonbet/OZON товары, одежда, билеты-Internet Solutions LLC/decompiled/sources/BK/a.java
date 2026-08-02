package BK;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3252b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3251a = i11;
        this.f3252b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean badgeView$lambda$6$lambda$5;
        switch (this.f3251a) {
            case 0:
                z11 = CatalogScrollTileView.touchListener$lambda$3((CatalogScrollTileView) this.f3252b, view, motionEvent);
                return z11;
            case 1:
                return Qe0.b.d((Qe0.b) this.f3252b, motionEvent);
            default:
                badgeView$lambda$6$lambda$5 = NavLikezoneCaruselBanner.View.badgeView$lambda$6$lambda$5((NavLikezoneCaruselBanner.View) this.f3252b, view, motionEvent);
                return badgeView$lambda$6$lambda$5;
        }
    }
}
