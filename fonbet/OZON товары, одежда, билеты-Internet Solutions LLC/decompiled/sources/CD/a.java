package CD;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ld0.x;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter.ParcelPhotoAddItemViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.pdp.widgets.crosssale.presentation.CrossSaleViewHolder;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.MorkovskMenuAdapter;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders.ObjectScrollItemViewHolder;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4523b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4522a = i11;
        this.f4523b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4522a) {
            case 0:
                CrossSaleViewHolder._init_$lambda$9((CrossSaleViewHolder) this.f4523b, view);
                break;
            case 1:
                ((Function0) this.f4523b).invoke();
                break;
            case 2:
                ObjectScrollItemViewHolder.onClickListener$lambda$1((ObjectScrollItemViewHolder) this.f4523b, view);
                break;
            case 3:
                ParcelPhotoAddItemViewHolder.lambda$8$lambda$2((ParcelPhotoAddItemViewHolder) this.f4523b, view);
                break;
            case 4:
                ((SellerCarouselAdapter.SellerViewHolder) this.f4523b).onProductClick(3);
                break;
            case 5:
                OfflineMainFragment.u((OfflineMainFragment) this.f4523b);
                break;
            case 6:
                MorkovskMenuAdapter.MorkovskItemHolder._init_$lambda$0((MorkovskMenuAdapter.MorkovskItemHolder) this.f4523b, view);
                break;
            case 7:
                x.z((x) this.f4523b);
                break;
            case 8:
                ProductItemViewHolder.bind$lambda$7$lambda$5((ProductItemViewHolder) this.f4523b, view);
                break;
            case 9:
                CameraFragment.onViewCreated$lambda$27$lambda$11$lambda$10((CameraFragment) this.f4523b, view);
                break;
            case 10:
                CurtainNavBarViewHolder._init_$lambda$9((CurtainNavBarViewHolder) this.f4523b, view);
                break;
            default:
                NewCredentialsViewHolder.bind$lambda$4((NewCredentialsViewHolder) this.f4523b, view);
                break;
        }
    }
}
