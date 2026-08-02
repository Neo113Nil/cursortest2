package GI;

import Ve.C4756xb;
import Ve.Ec;
import Ve.Hk;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentWidgetViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewHolder;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation.SearchCategoryHeaderViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;
import ru.ozon.fintech.ui.imageV2.FinImageV2View;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.uni.atoms.v3.holders.buttons.ResizableSmallButtonHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9825b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f9824a = i11;
        this.f9825b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9824a) {
            case 0:
                SearchCategoryHeaderViewHolder._init_$lambda$1((SearchCategoryHeaderViewHolder) this.f9825b, view);
                break;
            case 1:
                ((Function1) this.f9825b).invoke(view);
                break;
            case 2:
                ((Function0) this.f9825b).invoke();
                break;
            case 3:
                Hk this$0 = (Hk) this.f9825b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4756xb) this$0.u()).e0(Ec.f28922a);
                break;
            case 4:
                ResizableSmallButtonHolder.onBind$lambda$2$lambda$1((ResizableSmallButtonHolder) this.f9825b, view);
                break;
            case 5:
                SelectPaymentWidgetViewHolder._init_$lambda$0((SelectPaymentWidgetViewHolder) this.f9825b, view);
                break;
            case 6:
                ReviewGalleryBaseWidgetVH.lambda$16$lambda$15((ReviewGalleryBaseWidgetVH) this.f9825b, view);
                break;
            case 7:
                ((AbstractC7737t) this.f9825b).invoke();
                break;
            case 8:
                ru.ozon.android.inAppUpdate.internal.ui.blocking.b.b((ru.ozon.android.inAppUpdate.internal.ui.blocking.b) this.f9825b);
                break;
            case 9:
                VideoMoleculeViewHolder._init_$lambda$18((VideoMoleculeViewHolder) this.f9825b, view);
                break;
            case 10:
                FinImageV2View.clickListener$lambda$1((FinImageV2View) this.f9825b, view);
                break;
            case 11:
                FinToolbarView._init_$lambda$8((FinToolbarView) this.f9825b, view);
                break;
            case 12:
                StatusEdoViewHolder.lambda$2$lambda$1((StatusEdoViewHolder) this.f9825b, view);
                break;
            default:
                ((AddressEditPickUpDetailWidgetVH) this.f9825b).expand();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(Function0 function0) {
        this.f9824a = 7;
        this.f9825b = (AbstractC7737t) function0;
    }
}
