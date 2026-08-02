package Gy;

import dj.h;
import dj.j;
import io.reactivex.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteRepository;
import yl0.InterfaceC10919d;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements g, q, o, InterfaceC10919d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10323b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f10322a = i11;
        this.f10323b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f10322a) {
            case 0:
                this.f10323b.invoke(obj);
                break;
            case 1:
            case 2:
            case 6:
            default:
                this.f10323b.invoke(obj);
                break;
            case 3:
                this.f10323b.invoke(obj);
                break;
            case 4:
                this.f10323b.invoke(obj);
                break;
            case 5:
                this.f10323b.invoke(obj);
                break;
            case 7:
                this.f10323b.invoke(obj);
                break;
            case 8:
                this.f10323b.invoke(obj);
                break;
            case 9:
                this.f10323b.invoke(obj);
                break;
            case 10:
                this.f10323b.invoke(obj);
                break;
            case 11:
                this.f10323b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        u _init_$lambda$1;
        _init_$lambda$1 = AllToCartViewModel._init_$lambda$1(this.f10323b, obj);
        return _init_$lambda$1;
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10323b.invoke(new j.b(new h(it)));
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean autocompleteSuggest$lambda$2$lambda$1;
        boolean observeActivateResult$lambda$4;
        switch (this.f10322a) {
            case 1:
                autocompleteSuggest$lambda$2$lambda$1 = MaskAutocompleteRepository.getAutocompleteSuggest$lambda$2$lambda$1(this.f10323b, obj);
                return autocompleteSuggest$lambda$2$lambda$1;
            default:
                observeActivateResult$lambda$4 = CouponBlockViewHolder.observeActivateResult$lambda$4(this.f10323b, obj);
                return observeActivateResult$lambda$4;
        }
    }
}
