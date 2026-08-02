package B90;

import android.view.View;
import com.appsflyer.internal.AFe1xSDK;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListCouponAnimationKt;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListStubView;
import ru.ozon.app.android.messenger.databinding.MCouponDialogBinding;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBar$onAttachStateChangeListener$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3126b;

    public /* synthetic */ W(Object obj, int i11) {
        this.f3125a = i11;
        this.f3126b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3126b;
        switch (this.f3125a) {
            case 0:
                FintechPreferencesFragment.T((FintechPreferencesFragment) obj);
                break;
            case 1:
                NotificationBar$onAttachStateChangeListener$1.onViewDetachedFromWindow$lambda$0((NotificationBar) obj);
                break;
            case 2:
                N.F.b((N.F) obj);
                break;
            case 3:
                ((AFe1xSDK) obj).values();
                break;
            case 4:
                StaticCouponListCouponAnimationKt.animateTear$lambda$7$lambda$6((StaticCouponListStubView) obj);
                break;
            case 5:
                ((MCouponDialogBinding) obj).animationConfetti.playAnimation();
                break;
            default:
                ((View) obj).setVisibility(8);
                break;
        }
    }
}
