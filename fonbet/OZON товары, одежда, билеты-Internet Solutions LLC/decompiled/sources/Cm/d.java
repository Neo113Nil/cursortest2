package Cm;

import Z.m;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$setUpKeyboardAnimationCallback$1;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5WidgetViewHolder;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5157b;

    public /* synthetic */ d(m.a aVar, boolean z11) {
        this.f5156a = 3;
        this.f5157b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5156a) {
            case 0:
                ProductStarsTileView.updateUserStars$lambda$4$lambda$3$lambda$2((ProductStarsTileView) this.f5157b);
                break;
            case 1:
                M30.b.a((M30.b) this.f5157b);
                break;
            case 2:
                AddHotelGuestsV5WidgetViewHolder.bindVisibleForms$lambda$8((AddHotelGuestsV5WidgetViewHolder) this.f5157b);
                break;
            case 3:
                ((m.a) this.f5157b).getClass();
                break;
            case 4:
                SearchBarViewDelegate$setUpKeyboardAnimationCallback$1.onEnd$lambda$1((SearchBarViewDelegate) this.f5157b);
                break;
            default:
                ((BaseDotsIndicator) this.f5157b).refreshDots();
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f5156a = i11;
        this.f5157b = obj;
    }
}
