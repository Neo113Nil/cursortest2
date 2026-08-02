package Hx;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.YandexSearchFieldVH;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.ActionButtonNotificationView;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemVO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryViewBinder;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* renamed from: Hx.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3169a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11241c;

    public /* synthetic */ ViewOnClickListenerC3169a(int i11, Object obj, Object obj2) {
        this.f11239a = i11;
        this.f11240b = obj;
        this.f11241c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11239a) {
            case 0:
                BotItemViewHolder.setCheckbox$lambda$0((BotItemViewHolder) this.f11240b, (BotItemVO) this.f11241c, view);
                break;
            case 1:
                ReviewGalleryViewBinder.bindShowMoreButton$lambda$5((ButtonV3Atom.LargeBorderlessButton) this.f11240b, (Function1) this.f11241c, view);
                break;
            case 2:
                YandexSearchFieldVH.lambda$3$lambda$2((YandexSearchFieldVH) this.f11240b, (Function1) this.f11241c, view);
                break;
            case 3:
                FakeSearchViewController.bind$lambda$0((Function1) this.f11240b, (FakeSearchVO) this.f11241c, view);
                break;
            default:
                ActionButtonNotificationView.bind$lambda$12((NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification) this.f11240b, (Function1) this.f11241c, view);
                break;
        }
    }
}
