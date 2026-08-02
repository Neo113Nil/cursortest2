package NV;

import Zc0.n;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.SellerCategoryListAdapter;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.SellerCategoryListItemHolder;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewHolder.ReturnCreationStepsView;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.Step;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.BlockV3VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3ViewHolder;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewWidgetVH;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import vd0.AbstractC10309b;
import wd0.C10540a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18847c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f18845a = i11;
        this.f18846b = obj;
        this.f18847c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18845a) {
            case 0:
                PinnedReviewWidgetVH.bind$lambda$0((PinnedReviewVO) this.f18846b, (PinnedReviewWidgetVH) this.f18847c, view);
                break;
            case 1:
                n.t((n) this.f18846b, (PageAgreementWithConditionsDTO) this.f18847c);
                break;
            case 2:
                SellerCategoryListAdapter.onCreateViewHolder$lambda$4$lambda$3((SellerCategoryListItemHolder) this.f18846b, (SellerCategoryListAdapter) this.f18847c, view);
                break;
            case 3:
                ImageViewHolder.lambda$2$lambda$1((ImageViewHolder) this.f18846b, (ItemImageBinding) this.f18847c, view);
                break;
            case 4:
                ReturnCreationStepsView.createTextView$lambda$9$lambda$8((Step) this.f18846b, (Function1) this.f18847c, view);
                break;
            case 5:
                DeliveryWidgetV4View.createText$lambda$37$lambda$36((AtomAction) this.f18846b, (DeliveryWidgetV4View) this.f18847c, view);
                break;
            case 6:
                NaviBlocksV3ViewHolder.bind$lambda$2$lambda$1$lambda$0((BlockV3VO) this.f18846b, (NaviBlocksV3ViewHolder) this.f18847c, view);
                break;
            default:
                ((AbstractC10309b.a) this.f18846b).a().invoke((C10540a) this.f18847c);
                break;
        }
    }
}
