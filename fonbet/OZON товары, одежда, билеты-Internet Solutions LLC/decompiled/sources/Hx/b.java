package Hx;

import Jb0.j;
import ad0.e;
import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ld0.C7929D;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemVO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemViewHolder;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11244c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f11242a = i11;
        this.f11243b = obj;
        this.f11244c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11242a) {
            case 0:
                BotItemViewHolder.setItemQuantity$lambda$2((BotItemVO) this.f11243b, (BotItemViewHolder) this.f11244c, view);
                break;
            case 1:
                TravelSearchBarWidgetViewHolder.bind$lambda$3$lambda$1((TravelSearchBarVO) this.f11243b, (TravelSearchBarWidgetViewHolder) this.f11244c, view);
                break;
            case 2:
                e.t((e) this.f11243b, (EntryDTO.EntryButtonDTO) this.f11244c);
                break;
            case 3:
                FakeSearchViewController.bind$lambda$1((Function1) this.f11243b, (FakeSearchVO) this.f11244c, view);
                break;
            case 4:
                C7929D.t((C7929D) this.f11243b, (j) this.f11244c);
                break;
            case 5:
                TravelEditTextInputLayoutV2._init_$lambda$12((TravelEditTextInputLayoutV2) this.f11243b, (Context) this.f11244c, view);
                break;
            default:
                CouponPromoViewHolder.bind$lambda$5$lambda$2((CouponPromoViewHolder) this.f11243b, (String) this.f11244c, view);
                break;
        }
    }
}
