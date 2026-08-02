package I;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5VideoItemsVisibilityHandler;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleViewHolder;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView$bindState$5;

/* loaded from: classes8.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11263b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f11262a = i11;
        this.f11263b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11262a) {
            case 0:
                ((ScheduledFuture) this.f11263b).cancel(true);
                break;
            case 1:
                StickyBubbleViewHolder.showSelectedBubble$lambda$4((StickyBubbleViewHolder) this.f11263b);
                break;
            case 2:
                ((GalleryV5VideoItemsVisibilityHandler) this.f11263b).updateItems(false);
                break;
            case 3:
                View view = (View) this.f11263b;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.requestFocus();
                Object systemService = view.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(view, 0);
                    break;
                }
                break;
            case 4:
                ru.ozon.android.messenger.framework.presentation.chatdetail.k.b((ru.ozon.android.messenger.framework.presentation.chatdetail.k) this.f11263b);
                break;
            case 5:
                FinToolbarView$bindState$5.onLoadFailed$lambda$1((FinToolbarView) this.f11263b);
                break;
            case 6:
                ((RecyclerViewItemsAppearanceTracker) this.f11263b).updateMostVisibleHolder();
                break;
            default:
                ((androidx.media3.ui.b) this.f11263b).l(false);
                break;
        }
    }
}
