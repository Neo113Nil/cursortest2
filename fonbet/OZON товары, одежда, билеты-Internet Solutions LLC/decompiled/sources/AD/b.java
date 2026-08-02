package AD;

import android.view.View;
import ru.ozon.app.android.atoms.af.holders.ImageAtom;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargeIconButtonHolder;
import ru.ozon.app.android.atoms.v3.holders.tags.WrappedSmallLinkTagHolder;
import ru.ozon.app.android.payment.feature.webpage.PaymentActivity;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsViewHolder;
import ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewHolder;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch.SetSwitchButtonViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.view.TravelImageView;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view.AdditionalReturnServiceCellView;
import ru.ozon.app.android.travel.molecules.view.copyInput.CopyInputView;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.fintech.features.offline.ui.itemcard.IconTextCardView;
import ru.ozon.uni.android.textArea.TextAreaView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f603b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f602a = i11;
        this.f603b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f602a) {
            case 0:
                CharacteristicsViewHolder._init_$lambda$1((CharacteristicsViewHolder) this.f603b, view);
                break;
            case 1:
                TextAreaView.createActionIcon$lambda$15$lambda$14((TextAreaView) this.f603b, view);
                break;
            case 2:
                TravelImageView._init_$lambda$2((TravelImageView) this.f603b, view);
                break;
            case 3:
                AdultConfirmationViewHolder._init_$lambda$1((AdultConfirmationViewHolder) this.f603b, view);
                break;
            case 4:
                ImageAtom._init_$lambda$1((ImageAtom) this.f603b, view);
                break;
            case 5:
                BaseTextDescriptionViewHolder.initClickListener$lambda$0((BaseTextDescriptionViewHolder) this.f603b, view);
                break;
            case 6:
                LargeIconButtonHolder._init_$lambda$1((LargeIconButtonHolder) this.f603b, view);
                break;
            case 7:
                WrappedSmallLinkTagHolder._init_$lambda$1((WrappedSmallLinkTagHolder) this.f603b, view);
                break;
            case 8:
                ((PaymentActivity) this.f603b).onBackPressed();
                break;
            case 9:
                CopyInputView._init_$lambda$3((CopyInputView) this.f603b, view);
                break;
            case 10:
                SetSwitchButtonViewHolder._init_$lambda$1((SetSwitchButtonViewHolder) this.f603b, view);
                break;
            case 11:
                AdditionalReturnServiceCellView._init_$lambda$4((AdditionalReturnServiceCellView) this.f603b, view);
                break;
            case 12:
                IconTextCardView.b((IconTextCardView) this.f603b);
                break;
            case 13:
                PriceCardView._init_$lambda$6((PriceCardView) this.f603b, view);
                break;
            default:
                CellWithSubtitle24IconCounterView._init_$lambda$0((CellWithSubtitle24IconCounterView) this.f603b, view);
                break;
        }
    }
}
