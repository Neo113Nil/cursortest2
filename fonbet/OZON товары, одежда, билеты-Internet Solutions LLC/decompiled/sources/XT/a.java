package XT;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.c;
import ru.ozon.android.messenger.blocks.recommendations.presentation.e;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2VO;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2WidgetViewHolder;
import ru.ozon.app.android.cart.common.dynamicElement.progressiveText.ProgressiveTextVH;
import ru.ozon.app.android.marketing.ui.trustfactors.presentation.TrustFactorItemVO;
import ru.ozon.app.android.marketing.ui.trustfactors.presentation.TrustFactorsViewHolder;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultOptionView;
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.presentation.UsersFinalRatingV2ViewHolder;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34199c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f34197a = i11;
        this.f34198b = obj;
        this.f34199c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34197a) {
            case 0:
                ToursSearchResultOptionView.bind$lambda$4$lambda$3((Function1) this.f34198b, (ToursSearchResultVO.TourOptionVO) this.f34199c, view);
                break;
            case 1:
                CellHolder.lambda$6$lambda$5((CellHolder) this.f34198b, (CellView) this.f34199c, view);
                break;
            case 2:
                UsersFinalRatingV2ViewHolder._init_$lambda$0((UsersFinalRatingV2ViewHolder) this.f34199c, (Function1) this.f34198b, view);
                break;
            case 3:
                TrustFactorsViewHolder.bindItem$lambda$4((TrustFactorItemVO) this.f34198b, (TrustFactorsViewHolder) this.f34199c, view);
                break;
            case 4:
                ActionButtonV2WidgetViewHolder.bind$lambda$1$lambda$0((ActionButtonV2VO) this.f34198b, (ActionButtonV2WidgetViewHolder) this.f34199c, view);
                break;
            case 5:
                c.f((c) this.f34198b, (ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c) this.f34199c);
                break;
            case 6:
                ru.ozon.android.messenger.blocks.messageimage.presentation.a.u((ru.ozon.android.messenger.blocks.messageimage.presentation.a) this.f34198b, (ru.ozon.android.messenger.blocks.messageimage.c) this.f34199c);
                break;
            case 7:
                e.b((e) this.f34198b, (AtomActionDTO) this.f34199c);
                break;
            default:
                ProgressiveTextVH._init_$lambda$0((ProgressiveTextVH) this.f34199c, (Function1) this.f34198b, view);
                break;
        }
    }

    public /* synthetic */ a(RecyclerView.C c11, Function1 function1, int i11) {
        this.f34197a = i11;
        this.f34199c = c11;
        this.f34198b = function1;
    }
}
