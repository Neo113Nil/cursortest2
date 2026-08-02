package B90;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4ViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersScrollStateSynchronizer;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2610l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3168b;

    public /* synthetic */ RunnableC2610l(Object obj, int i11) {
        this.f3167a = i11;
        this.f3168b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3167a) {
            case 0:
                FintechPreferencesFragment.J((FintechPreferencesFragment) this.f3168b);
                break;
            case 1:
                v0.d0((v0) this.f3168b);
                break;
            case 2:
                VideoMoleculeVisibilityDelegate.hideCallback$lambda$3((VideoMoleculeVisibilityDelegate) this.f3168b);
                break;
            case 3:
                FullTextSearchHeaderV4ViewHolder.showOrGoneContent$lambda$7$lambda$6((AppCompatTextView) this.f3168b);
                break;
            case 4:
                ((RecyclerView) this.f3168b).invalidateItemDecorations();
                break;
            case 5:
                ((HotelsGalleryFiltersScrollStateSynchronizer) this.f3168b).isUpdatingFromViewModel = false;
                break;
            default:
                DelayedVisibilityHandler.delayedHide$lambda$0((DelayedVisibilityHandler) this.f3168b);
                break;
        }
    }
}
