package BO;

import dj.h;
import dj.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentState;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder$onAttach$1;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewModel;
import yl0.InterfaceC10919d;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements g, InterfaceC10919d, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3270b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f3269a = i11;
        this.f3270b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3269a) {
            case 0:
                this.f3270b.invoke(obj);
                break;
            case 1:
                this.f3270b.invoke(obj);
                break;
            case 2:
                this.f3270b.invoke(obj);
                break;
            case 3:
                this.f3270b.invoke(obj);
                break;
            case 4:
                this.f3270b.invoke(obj);
                break;
            case 5:
                this.f3270b.invoke(obj);
                break;
            case 6:
            case 7:
            case 8:
            case 11:
            default:
                this.f3270b.invoke(obj);
                break;
            case 9:
                this.f3270b.invoke(obj);
                break;
            case 10:
                this.f3270b.invoke(obj);
                break;
            case 12:
                this.f3270b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        TravelFlightCheckTariffV2ViewModel.Result.Success performAction$lambda$0;
        FavoriteChangeResponse processFavoriteDefaultChange$lambda$12;
        UserQASegmentState addUserToQASegment$lambda$0;
        switch (this.f3269a) {
            case 7:
                performAction$lambda$0 = TravelFlightCheckTariffV2ViewModel.performAction$lambda$0(this.f3270b, obj);
                return performAction$lambda$0;
            case 8:
                processFavoriteDefaultChange$lambda$12 = FavoriteProductMoleculeInteractor.processFavoriteDefaultChange$lambda$12(this.f3270b, obj);
                return processFavoriteDefaultChange$lambda$12;
            default:
                addUserToQASegment$lambda$0 = UserQASegmentInteractor.addUserToQASegment$lambda$0(this.f3270b, obj);
                return addUserToQASegment$lambda$0;
        }
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f3270b.invoke(new j.b(new h(it)));
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean onStart$lambda$2$lambda$1;
        onStart$lambda$2$lambda$1 = CouponBlockViewHolder$onAttach$1.onStart$lambda$2$lambda$1(this.f3270b, obj);
        return onStart$lambda$2$lambda$1;
    }
}
