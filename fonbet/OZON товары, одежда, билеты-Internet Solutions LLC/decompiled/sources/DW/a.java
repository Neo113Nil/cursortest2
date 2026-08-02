package DW;

import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6280c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f6278a = i11;
        this.f6279b = obj;
        this.f6280c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6278a) {
            case 0:
                ReviewsFilterViewHolder.bind$lambda$0((ReviewsFilterVO) this.f6279b, (ReviewsFilterViewHolder) this.f6280c);
                break;
            default:
                ((SkuThinScrollViewHolder) this.f6279b).restoreScrollState((SkuThinScrollVO) this.f6280c);
                break;
        }
    }
}
