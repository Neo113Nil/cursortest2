package BY;

import kotlin.jvm.functions.Function1;
import qc.q;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements qc.g, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3314b;

    public /* synthetic */ g(Function1 function1, int i11) {
        this.f3313a = i11;
        this.f3314b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3313a) {
            case 0:
                this.f3314b.invoke(obj);
                break;
            case 1:
                this.f3314b.invoke(obj);
                break;
            case 2:
                this.f3314b.invoke(obj);
                break;
            case 3:
            default:
                this.f3314b.invoke(obj);
                break;
            case 4:
                this.f3314b.invoke(obj);
                break;
            case 5:
                this.f3314b.invoke(obj);
                break;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$1;
        _init_$lambda$1 = CouponViewModelImpl._init_$lambda$1(this.f3314b, obj);
        return _init_$lambda$1;
    }
}
