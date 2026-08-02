package HY;

import android.view.View;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.adapter.BoxCardsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.view.SearchBarView;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.SuggestionsAdapter;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioView;
import ru.ozon.app.android.web.WebBottomSheetFragment;
import ru.ozon.id.antibot.errorView.AntibotErrorView;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolder;
import ru.ozon.uni.atoms.v3.holders.controls.chip.IconChipHolder;
import vb0.C10294a;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10764b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f10763a = i11;
        this.f10764b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f10764b;
        switch (this.f10763a) {
            case 0:
                ((WebBottomSheetFragment) obj).closeFragment();
                break;
            case 1:
                SuggestionsAdapter.SuggestionViewHolder._init_$lambda$1((SuggestionsAdapter.SuggestionViewHolder) obj, view);
                break;
            case 2:
                HeaderAtom.onConfigureView$lambda$6((HeaderAtom) obj, view);
                break;
            case 3:
                AspectHolder._init_$lambda$1((AspectHolder) obj, view);
                break;
            case 4:
                IconChipHolder._init_$lambda$1((IconChipHolder) obj, view);
                break;
            case 5:
                BoxCardsAdapter.BoxListViewHolder._init_$lambda$0((BoxCardsAdapter.BoxListViewHolder) obj, view);
                break;
            case 6:
                SearchBarView._init_$lambda$9((SearchBarView) obj, view);
                break;
            case 7:
                ((ru.ozon.android.messenger.framework.presentation.chatdetail.report.a) obj).dismiss();
                break;
            case 8:
                ((CellWithSubtitle24IconCheckboxRadioView) obj).onCheckedChange();
                break;
            default:
                int i11 = AntibotErrorView.f97152e;
                ((C10294a) obj).d().invoke();
                break;
        }
    }
}
