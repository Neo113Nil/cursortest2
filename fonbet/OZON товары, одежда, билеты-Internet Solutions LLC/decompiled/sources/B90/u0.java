package B90;

import android.view.ViewGroup;
import android.view.ViewParent;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.LongTapDetector;

/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3198b;

    public /* synthetic */ u0(Object obj, int i11) {
        this.f3197a = i11;
        this.f3198b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3197a) {
            case 0:
                v0.x0((v0) this.f3198b);
                break;
            case 1:
                GalleryV3ViewHolder.videoButtonsRunnable$lambda$0((GalleryV3ViewHolder) this.f3198b);
                break;
            case 2:
                LongTapDetector.Default.onActionDownRunnable$lambda$0((LongTapDetector.Default) this.f3198b);
                break;
            case 3:
                ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b bVar = (ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b) this.f3198b;
                ViewParent parent = bVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(bVar);
                    break;
                }
                break;
            default:
                VideoMoleculeVisibilityDelegate.inActivityCallback$lambda$5((VideoMoleculeVisibilityDelegate) this.f3198b);
                break;
        }
    }
}
