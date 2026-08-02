package GD;

import android.content.Context;
import android.view.View;
import be0.C5656a;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.notification.h;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.progressiveText.ProgressiveTextVHV2;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.SearchFieldVH;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel.CarouselAdapter;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionPickupViewHolder;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.crosslink.CrossLinkV4ViewHolder;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9813c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f9811a = i11;
        this.f9813c = obj;
        this.f9812b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9811a) {
            case 0:
                DeliveryV6SectionPickupViewHolder._init_$lambda$0((DeliveryV6SectionPickupViewHolder) this.f9813c, (Function1) this.f9812b, view);
                break;
            case 1:
                CrossLinkV4ViewHolder._init_$lambda$0((CrossLinkV4ViewHolder) this.f9813c, (Function1) this.f9812b, view);
                break;
            case 2:
                C5656a.a((C5656a) this.f9813c, (String) this.f9812b);
                break;
            case 3:
                ProgressiveTextVHV2._init_$lambda$0((ProgressiveTextVHV2) this.f9813c, (Function1) this.f9812b, view);
                break;
            case 4:
                SearchFieldVH.lambda$3$lambda$2((SearchFieldVH) this.f9813c, (Function1) this.f9812b, view);
                break;
            case 5:
                FakeSearchView.bind$lambda$10$lambda$8((Function1) this.f9812b, (FakeSearchVO) this.f9813c, view);
                break;
            case 6:
                h.b((h) this.f9813c, (AtomAction) this.f9812b);
                break;
            case 7:
                RelatedProductsBottomSheetView.createCloseButton$lambda$26$lambda$25((View) this.f9813c, (RelatedProductsBottomSheetView) this.f9812b, view);
                break;
            case 8:
                CarouselAdapter.CarouselItemVH._init_$lambda$0((CarouselAdapter) this.f9813c, (CarouselAdapter.CarouselItemVH) this.f9812b, view);
                break;
            default:
                MobilizationTextInputLayout._init_$lambda$4((MobilizationTextInputLayout) this.f9813c, (Context) this.f9812b, view);
                break;
        }
    }

    public /* synthetic */ b(FakeSearchVO fakeSearchVO, Function1 function1) {
        this.f9811a = 5;
        this.f9812b = function1;
        this.f9813c = fakeSearchVO;
    }
}
