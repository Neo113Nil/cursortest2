package Hy;

import Z.w;
import com.airbnb.lottie.LottieAnimationView;
import eg.c;
import ru.ozon.app.android.geo.map.presentation.views.AddressEditMapView;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.RatingTextView;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH;

/* renamed from: Hy.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC3170a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11246b;

    public /* synthetic */ RunnableC3170a(Object obj, int i11) {
        this.f11245a = i11;
        this.f11246b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11245a) {
            case 0:
                AddressEditMapView.applyInsets$lambda$1((AddressEditMapView) this.f11246b);
                break;
            case 1:
                ((GalleryFullViewPinchToZoomTouchListener) this.f11246b).canShowShadowAnimation = true;
                break;
            case 2:
                StickyScrollViewHolder.lambda$14$lambda$13$lambda$12((StickyScrollViewHolder) this.f11246b);
                break;
            case 3:
                NavBarOverlayViewHolder.bind$lambda$0((NavBarOverlayViewHolder) this.f11246b);
                break;
            case 4:
                w.b((w) this.f11246b);
                break;
            case 5:
                c.a((c) this.f11246b);
                break;
            case 6:
                ((ShellNavBarCornersManagerImpl) this.f11246b).setStickyAppearance();
                break;
            case 7:
                RatingTextView.checkEllipsis$lambda$11((RatingTextView) this.f11246b);
                break;
            case 8:
                ((LottieAnimationView) this.f11246b).playAnimation();
                break;
            default:
                ReviewFormCommentVH.restoreKeyboard$lambda$1((ReviewFormCommentVH) this.f11246b);
                break;
        }
    }
}
