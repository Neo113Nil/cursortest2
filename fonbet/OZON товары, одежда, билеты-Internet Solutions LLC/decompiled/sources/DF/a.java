package DF;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.q;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements g, OnSuccessListener, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6227b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f6226a = i11;
        this.f6227b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6226a) {
            case 0:
                this.f6227b.invoke(obj);
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            default:
                this.f6227b.invoke(obj);
                break;
            case 2:
                this.f6227b.invoke(obj);
                break;
            case 6:
                this.f6227b.invoke(obj);
                break;
            case 7:
                this.f6227b.invoke(obj);
                break;
            case 8:
                this.f6227b.invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i11 = HiddenActivity.f42443c;
        Function1 tmp0 = this.f6227b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$1;
        boolean _init_$lambda$0;
        boolean _init_$lambda$02;
        switch (this.f6226a) {
            case 3:
                _init_$lambda$1 = SellerCarouselAdapter._init_$lambda$1(this.f6227b, obj);
                return _init_$lambda$1;
            case 4:
                _init_$lambda$0 = CouponViewModelImpl._init_$lambda$0(this.f6227b, obj);
                return _init_$lambda$0;
            default:
                _init_$lambda$02 = TotalStickyV3ViewModel._init_$lambda$0(this.f6227b, obj);
                return _init_$lambda$02;
        }
    }
}
