package AK;

import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewHolderFF;
import ru.ozon.app.android.storefront.widgets.cms.databinding.ItemRichPromoScrollBinding;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoScrollViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f642c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f640a = i11;
        this.f641b = obj;
        this.f642c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f640a) {
            case 0:
                RichPromoScrollViewHolder.bind$lambda$2$lambda$1$lambda$0((RichPromoScrollViewHolder) this.f641b, (ItemRichPromoScrollBinding) this.f642c);
                break;
            default:
                NotificationCarouselV2ViewHolderFF.bind$lambda$1((NotificationCarouselV2VO) this.f641b, (NotificationCarouselV2ViewHolderFF) this.f642c);
                break;
        }
    }
}
