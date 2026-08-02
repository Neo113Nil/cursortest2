package IC;

import android.view.View;
import ru.ozon.app.android.pdfviewer.presentation.BitmapCacheHandler;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpWidgetView;
import ru.ozon.app.android.storefront.databinding.WidgetStickyScrollBinding;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesWidgetViewHolder;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12092b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f12091a = i11;
        this.f12092b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12091a) {
            case 0:
                ViewExtKt.forceClearFocus$lambda$8((OzonTextInput) this.f12092b);
                break;
            case 1:
                StickyScrollViewHolder.bindDynamicParameters$lambda$18$lambda$17((WidgetStickyScrollBinding) this.f12092b);
                break;
            case 2:
                HotelsHorizontalShelvesWidgetViewHolder.onAttach$lambda$1((HotelsHorizontalShelvesWidgetViewHolder) this.f12092b);
                break;
            case 3:
                BitmapCacheHandler.clear$lambda$4((BitmapCacheHandler) this.f12092b);
                break;
            case 4:
                ((BaseDotsIndicator) this.f12092b).refreshDots();
                break;
            default:
                ConfirmDeleteOtpWidgetView.keyboardUp$lambda$8((View) this.f12092b);
                break;
        }
    }
}
