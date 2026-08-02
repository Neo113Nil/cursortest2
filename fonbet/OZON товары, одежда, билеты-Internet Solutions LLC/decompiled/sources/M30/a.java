package M30;

import ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListTitleViewHolder;
import ru.ozon.app.android.favorites.feature.databinding.WidgetCreateShoppingListTitleBinding;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17369b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f17368a = i11;
        this.f17369b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17368a) {
            case 0:
                b.b((b) this.f17369b);
                break;
            case 1:
                CreateShoppingListTitleViewHolder.onViewInVisibleBounds$lambda$4$lambda$3((WidgetCreateShoppingListTitleBinding) this.f17369b);
                break;
            case 2:
                SearchSuggestionsFragment.navigateBack$lambda$13((SearchSuggestionsFragment) this.f17369b);
                break;
            default:
                BaseDotsIndicator.refreshDots$lambda$1((BaseDotsIndicator) this.f17369b);
                break;
        }
    }
}
