package Fy;

import dj.j;
import dj.k;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteRepository;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3ViewModel;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import yl0.InterfaceC10920e;

/* renamed from: Fy.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C3065c implements g, o, InterfaceC10920e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9585b;

    public /* synthetic */ C3065c(Function1 function1, int i11) {
        this.f9584a = i11;
        this.f9585b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9584a) {
            case 0:
                this.f9585b.invoke(obj);
                break;
            case 1:
                this.f9585b.invoke(obj);
                break;
            case 2:
                this.f9585b.invoke(obj);
                break;
            case 3:
                this.f9585b.invoke(obj);
                break;
            case 4:
            case 5:
            case 7:
            case 10:
            case 12:
            default:
                this.f9585b.invoke(obj);
                break;
            case 6:
                this.f9585b.invoke(obj);
                break;
            case 8:
                this.f9585b.invoke(obj);
                break;
            case 9:
                this.f9585b.invoke(obj);
                break;
            case 11:
                this.f9585b.invoke(obj);
                break;
            case 13:
                this.f9585b.invoke(obj);
                break;
            case 14:
                this.f9585b.invoke(obj);
                break;
            case 15:
                this.f9585b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        List autocompleteSuggest$lambda$2$lambda$0;
        Pair _init_$lambda$0;
        HotelMapInfoViewModel.Action.MoveToLocation requestLastLocation$lambda$0;
        ServicePackSelectionV3ViewModel.Action.Success performApiAction$lambda$0;
        switch (this.f9584a) {
            case 4:
                autocompleteSuggest$lambda$2$lambda$0 = MaskAutocompleteRepository.getAutocompleteSuggest$lambda$2$lambda$0(this.f9585b, obj);
                return autocompleteSuggest$lambda$2$lambda$0;
            case 5:
                _init_$lambda$0 = AllToCartViewModel._init_$lambda$0(this.f9585b, obj);
                return _init_$lambda$0;
            case 6:
            default:
                performApiAction$lambda$0 = ServicePackSelectionV3ViewModel.performApiAction$lambda$0(this.f9585b, obj);
                return performApiAction$lambda$0;
            case 7:
                requestLastLocation$lambda$0 = HotelMapInfoViewModel.requestLastLocation$lambda$0(this.f9585b, obj);
                return requestLastLocation$lambda$0;
        }
    }

    @Override // yl0.InterfaceC10920e
    public void onSuccess(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = this.f9585b;
        if (function1 != null) {
            function1.invoke(new j.c(k.RU_STORE));
        }
    }
}
