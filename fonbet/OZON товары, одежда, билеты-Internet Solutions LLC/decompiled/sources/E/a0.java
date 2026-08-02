package E;

import android.app.Activity;
import io.sentry.android.core.C7102c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListCouponAnimationKt;
import w3.i;

/* loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6869c;

    public /* synthetic */ a0(int i11, Object obj, Object obj2) {
        this.f6867a = i11;
        this.f6868b = obj;
        this.f6869c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6867a) {
            case 0:
                ((d0) this.f6868b).e();
                Objects.requireNonNull(null);
                Objects.requireNonNull((androidx.camera.core.p) this.f6869c);
                break;
            case 1:
                J2.a this$0 = (J2.a) this.f6868b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                D2.o e11 = (D2.o) this.f6869c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.l().a(e11);
                break;
            case 2:
                StaticCouponListCouponAnimationKt.animateTear$lambda$7$lambda$6$lambda$5((androidx.dynamicanimation.animation.f) this.f6868b, (androidx.dynamicanimation.animation.f) this.f6869c);
                break;
            case 3:
                ((C7102c) this.f6868b).f67068a.a().a((Activity) this.f6869c);
                break;
            default:
                i.a aVar = (i.a) this.f6868b;
                ((w3.i) this.f6869c).F(aVar.f103476a, aVar.f103477b);
                break;
        }
    }
}
