package Lc0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.cart.ui.thermometer.presentation.view.ThermometerMoleculeView;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicType;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicViewHolder;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoNoImageViewHolder;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation.FullTextSearchHeaderV3ViewHolder;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewViewHolder;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.buttons.ButtonViewHolder;
import ru.ozon.app.android.travel.molecules.fragment.selector.adapter.SelectorItemViewHolder;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.id.nativeauth.main.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16736c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f16734a = i11;
        this.f16735b = obj;
        this.f16736c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16734a) {
            case 0:
                ErrorView.b((ErrorView) this.f16735b, (b.c) this.f16736c);
                break;
            case 1:
                CategoryLogoNoImageViewHolder._init_$lambda$0((CategoryLogoNoImageViewHolder) this.f16735b, (Function1) this.f16736c, view);
                break;
            case 2:
                FullTextSearchHeaderV3ViewHolder.lambda$4$lambda$1((FullTextSearchHeaderV3ViewHolder) this.f16735b, (View) this.f16736c, view);
                break;
            case 3:
                ThermometerMoleculeView.bindOrGone$lambda$7((ThermometerMoleculeVO) this.f16735b, (Function1) this.f16736c, view);
                break;
            case 4:
                SellerCarouselAdapter.SellerViewHolder._init_$lambda$0((SellerCarouselAdapter) this.f16735b, (SellerCarouselAdapter.SellerViewHolder) this.f16736c, view);
                break;
            case 5:
                ButtonViewHolder.bind$lambda$0((ButtonViewHolder) this.f16735b, (HotelsGalleryVO.VideoButton) this.f16736c, view);
                break;
            case 6:
                SelectorItemViewHolder._init_$lambda$0((SelectorItemViewHolder) this.f16735b, (Function1) this.f16736c, view);
                break;
            case 7:
                CharacteristicViewHolder.setupColumn$lambda$9$lambda$6$lambda$5((CharacteristicViewHolder) this.f16735b, (CharacteristicType.Rating) this.f16736c, view);
                break;
            default:
                PreviewsAdapter.onCreateViewHolder$lambda$2$lambda$1((PreviewViewHolder) this.f16735b, (PreviewsAdapter) this.f16736c, view);
                break;
        }
    }
}
