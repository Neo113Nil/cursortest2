package Cw;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.af.holders.CellDefaultAtom;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactItemViewHolder;
import ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollProductViewHolder;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterViewHolder;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionViewHolder;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.uikit.dialog.sort.SortsAdapter;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolder;

/* renamed from: Cw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2787a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5172b;

    public /* synthetic */ ViewOnClickListenerC2787a(Object obj, int i11) {
        this.f5171a = i11;
        this.f5172b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5171a) {
            case 0:
                ScrollProductViewHolder._init_$lambda$2((ScrollProductViewHolder) this.f5172b, view);
                break;
            case 1:
                FintechNativeBridgeTestingFragment.w((FintechNativeBridgeTestingFragment) this.f5172b);
                break;
            case 2:
                CellDefaultAtom._init_$lambda$2((CellDefaultAtom) this.f5172b, view);
                break;
            case 3:
                Rc0.c.t((Rc0.c) this.f5172b);
                break;
            case 4:
                PromoStickyBubbleView.bindRootView$lambda$9((Function1) this.f5172b, view);
                break;
            case 5:
                SuggestionViewHolder.setSuggestItemClickListener$lambda$15((SuggestionViewHolder) this.f5172b, view);
                break;
            case 6:
                ProfileGenderBottomSheet.onViewCreated$lambda$4$lambda$2((ProfileGenderBottomSheet) this.f5172b, view);
                break;
            case 7:
                CourierOnMapBinder._init_$lambda$1((CourierOnMapBinder) this.f5172b, view);
                break;
            case 8:
                TagButtonHolder._init_$lambda$4((TagButtonHolder) this.f5172b, view);
                break;
            case 9:
                ((TravelDateSelectorDialogFragment) this.f5172b).dismiss();
                break;
            case 10:
                ((DialogSearchTopFiltersFragment) this.f5172b).navigateBack();
                break;
            case 11:
                ContactItemViewHolder._init_$lambda$0((ContactItemViewHolder) this.f5172b, view);
                break;
            case 12:
                ((ProductPickerSearchFragment) this.f5172b).onFinish();
                break;
            case 13:
                NotificationBarView.setupListeners$lambda$6((NotificationBarView) this.f5172b, view);
                break;
            case 14:
                SortsAdapter.onCreateViewHolder$lambda$1$lambda$0((SortsAdapter) this.f5172b, view);
                break;
            case 15:
                ((Function0) this.f5172b).invoke();
                break;
            default:
                BlackFridayCounterViewHolder.onClickListener$lambda$1((BlackFridayCounterViewHolder) this.f5172b, view);
                break;
        }
    }
}
