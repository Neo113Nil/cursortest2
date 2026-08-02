package BM;

import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Pair;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.VideoItemViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f3263b;

    public /* synthetic */ a(J j11, int i11) {
        this.f3262a = i11;
        this.f3263b = j11;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f3262a) {
            case 0:
                AviaSearchResultFragment.updateVoObserver$lambda$0((AviaSearchResultFragment) this.f3263b, (AviaSearchResultViewModel.UpdateVoResult) obj);
                break;
            case 1:
                VideoItemViewHolder.swipeRefreshBusEventObserver$lambda$1((VideoItemViewHolder) this.f3263b, (A00.a) obj);
                break;
            default:
                ReviewFormCommentVH.openMediaPickerObserver$lambda$4((ReviewFormCommentVH) this.f3263b, (Pair) obj);
                break;
        }
    }
}
