package AJ;

import hg.InterfaceC6948a;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation.PreOrderSubscriptionViewModel;
import ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f637b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f636a = i11;
        this.f637b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f636a) {
            case 0:
                this.f637b.invoke(obj);
                break;
            case 1:
                this.f637b.invoke(obj);
                break;
            case 2:
            case 6:
            case 8:
            default:
                this.f637b.invoke(obj);
                break;
            case 3:
                this.f637b.invoke(obj);
                break;
            case 4:
                this.f637b.invoke(obj);
                break;
            case 5:
                this.f637b.invoke(obj);
                break;
            case 7:
                this.f637b.invoke(obj);
                break;
            case 9:
                this.f637b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        InterfaceC6948a socketFlowable$lambda$5;
        CouponResult activate$lambda$7;
        Pair pageSource$lambda$4;
        AtomAction submitForm$lambda$0;
        switch (this.f636a) {
            case 2:
                socketFlowable$lambda$5 = OzonWebSocketImpl.getSocketFlowable$lambda$5(this.f637b, obj);
                return socketFlowable$lambda$5;
            case 6:
                activate$lambda$7 = CouponViewModelImpl.activate$lambda$7(this.f637b, obj);
                return activate$lambda$7;
            case 8:
                pageSource$lambda$4 = AuthViewModel.pageSource$lambda$4(this.f637b, obj);
                return pageSource$lambda$4;
            default:
                submitForm$lambda$0 = OrderToursChangeFormViewModel.submitForm$lambda$0(this.f637b, obj);
                return submitForm$lambda$0;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$0;
        _init_$lambda$0 = PreOrderSubscriptionViewModel._init_$lambda$0(this.f637b, obj);
        return _init_$lambda$0;
    }
}
