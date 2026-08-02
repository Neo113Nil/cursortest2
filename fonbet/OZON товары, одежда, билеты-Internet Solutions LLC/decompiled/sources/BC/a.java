package BC;

import Ve.A2;
import Ve.A7;
import Ve.C4238fb;
import Ve.C4409l9;
import Ve.C4612sa;
import Ve.C4825zo;
import Ve.I8;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.app.android.abtool.presentation.features.recycler.BooleanAbToggleHolder;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2View;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewV4;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarIconButton;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.recyclerview.EntryBannerRvViewHolder;
import ru.ozon.app.android.search.views.galleryswipeview.VideoTileViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeViewV2;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.view.HotTicketsItemView;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.card.CardView;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolder;
import tj.e;
import xe.C10727i;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3238b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3237a = i11;
        this.f3238b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3237a) {
            case 0:
                ((Function0) this.f3238b).invoke();
                break;
            case 1:
                GeotrackingMapV2View.lambda$4$lambda$3((GeotrackingMapV2View) this.f3238b, view);
                break;
            case 2:
                PinPadFragment.y((PinPadFragment) this.f3238b);
                break;
            case 3:
                AirplaneSeatTypeViewV2._init_$lambda$4((AirplaneSeatTypeViewV2) this.f3238b, view);
                break;
            case 4:
                C4612sa this$0 = (C4612sa) this.f3238b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                A7 a72 = (A7) this$0.u();
                Object event = I8.f29221a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (!event.equals(event)) {
                    if (event.equals(C4409l9.f31516a)) {
                        C10727i.c(x0.a(a72), null, null, new A2(a72, null, 1), 3);
                        break;
                    }
                } else {
                    ((C4238fb) a72.f28585d).b(C4825zo.f32678a);
                    break;
                }
                break;
            case 5:
                EntryBannerRvViewHolder._init_$lambda$0((EntryBannerRvViewHolder) this.f3238b, view);
                break;
            case 6:
                ((BooleanAbToggleHolder) this.f3238b).resetLocal();
                break;
            case 7:
                ProductMediaHolder._init_$lambda$1((ProductMediaHolder) this.f3238b, view);
                break;
            case 8:
                ((Function1) this.f3238b).invoke(view);
                break;
            case 9:
                HotTicketsItemView.setupRoot$lambda$16((HotTicketsItemView) this.f3238b, view);
                break;
            case 10:
                VideoTileViewHolder._init_$lambda$0((VideoTileViewHolder) this.f3238b, view);
                break;
            case 11:
                CartViewV4.bindMinusPlus$lambda$3((CartViewV4) this.f3238b, view);
                break;
            case 12:
                AddressBookAddressDetailVH._init_$lambda$2((AddressBookAddressDetailVH) this.f3238b, view);
                break;
            case 13:
                NavBarIconButton._init_$lambda$2((NavBarIconButton) this.f3238b, view);
                break;
            case 14:
                BankAccountStatusWidgetVH._init_$lambda$3((BankAccountStatusWidgetVH) this.f3238b, view);
                break;
            case 15:
                CardView._init_$lambda$1((CardView) this.f3238b, view);
                break;
            case 16:
                e eVar = (e) this.f3238b;
                sj.e.f98817f.a();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String string = eVar.getString(R.string.ozon_logger_android_debug_clear_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Toast.makeText(context, string, 0).show();
                break;
            default:
                ComplexRouteItemView.setUpLocationView$lambda$17$lambda$13((ComplexRouteItemView) this.f3238b, view);
                break;
        }
    }
}
