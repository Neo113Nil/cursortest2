package DM;

import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepositoryImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements qc.g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6258b;

    public /* synthetic */ i(Function1 function1, int i11) {
        this.f6257a = i11;
        this.f6258b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6257a) {
            case 0:
                this.f6258b.invoke(obj);
                break;
            case 1:
                this.f6258b.invoke(obj);
                break;
            case 2:
                this.f6258b.invoke(obj);
                break;
            case 3:
                this.f6258b.invoke(obj);
                break;
            case 4:
                this.f6258b.invoke(obj);
                break;
            case 5:
                this.f6258b.invoke(obj);
                break;
            case 6:
            case 11:
            default:
                this.f6258b.invoke(obj);
                break;
            case 7:
                this.f6258b.invoke(obj);
                break;
            case 8:
                this.f6258b.invoke(obj);
                break;
            case 9:
                this.f6258b.invoke(obj);
                break;
            case 10:
                this.f6258b.invoke(obj);
                break;
            case 12:
                this.f6258b.invoke(obj);
                break;
            case 13:
                this.f6258b.invoke(obj);
                break;
            case 14:
                this.f6258b.invoke(obj);
                break;
            case 15:
                this.f6258b.invoke(obj);
                break;
            case 16:
                this.f6258b.invoke(obj);
                break;
            case 17:
                this.f6258b.invoke(obj);
                break;
            case 18:
                this.f6258b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AddProductsWithTokenizedAnalytics addAllSkuAction$lambda$3;
        String minifyLink$lambda$0;
        switch (this.f6257a) {
            case 6:
                addAllSkuAction$lambda$3 = AllToCartViewModel.addAllSkuAction$lambda$3(this.f6258b, obj);
                return addAllSkuAction$lambda$3;
            default:
                minifyLink$lambda$0 = MinifyLinkRepositoryImpl.minifyLink$lambda$0(this.f6258b, obj);
                return minifyLink$lambda$0;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeActivatedCoupons$lambda$0;
        observeActivatedCoupons$lambda$0 = CouponStorage.observeActivatedCoupons$lambda$0(this.f6258b, obj);
        return observeActivatedCoupons$lambda$0;
    }
}
