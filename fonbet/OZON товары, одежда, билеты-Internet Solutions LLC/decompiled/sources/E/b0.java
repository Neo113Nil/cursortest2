package E;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain.TimeSlotsVO;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.TimeSlotsViewHolder;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListCouponAnimationKt;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListStubView;
import w3.i;

/* loaded from: classes8.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6881c;

    public /* synthetic */ b0(int i11, Object obj, Object obj2) {
        this.f6879a = i11;
        this.f6880b = obj;
        this.f6881c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6879a) {
            case 0:
                d0 d0Var = (d0) this.f6880b;
                if (d0Var.g() == null) {
                    d0Var.e();
                    break;
                } else {
                    d0Var.g().onPostviewBitmapAvailable((Bitmap) this.f6881c);
                    break;
                }
            case 1:
                J2.a this$0 = (J2.a) this.f6880b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                D2.r e11 = (D2.r) this.f6881c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.l().a(e11);
                break;
            case 2:
                O9.e.c((O9.e) this.f6880b, (O9.n) this.f6881c);
                break;
            case 3:
                StaticCouponListCouponAnimationKt.animateTear$lambda$7((StaticCouponListStubView) this.f6880b, (Function0) this.f6881c);
                break;
            case 4:
                TimeSlotsViewHolder.bind$lambda$1((TimeSlotsVO) this.f6880b, (TimeSlotsViewHolder) this.f6881c);
                break;
            default:
                i.a aVar = (i.a) this.f6880b;
                ((w3.i) this.f6881c).P(aVar.f103476a, aVar.f103477b);
                break;
        }
    }
}
