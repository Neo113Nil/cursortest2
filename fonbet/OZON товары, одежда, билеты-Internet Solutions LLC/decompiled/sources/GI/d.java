package GI;

import L30.h;
import W.K;
import W.s0;
import android.view.Window;
import android.view.WindowManager;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.m;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation.SearchCategoryHeaderViewHolder;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9828c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f9826a = i11;
        this.f9827b = obj;
        this.f9828c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9826a) {
            case 0:
                ((SearchCategoryHeaderViewHolder) this.f9827b).bindOnboardingDelegate((OnboardingModel) this.f9828c);
                break;
            case 1:
                ((b.a) this.f9827b).c(null);
                ((m) this.f9828c).cancel(true);
                break;
            case 2:
                ((h) this.f9827b).getClass();
                Window window = (Window) this.f9828c;
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
                break;
            case 3:
                K.i((K) this.f9827b, (s0.a) this.f9828c);
                break;
            default:
                AddressEditPickUpDetailWidgetVH.prepareChips$lambda$25$lambda$22((AddressEditPickUpDetailWidgetVH) this.f9827b, (AddressEditPickUpDetailVO.AddressLabel) this.f9828c);
                break;
        }
    }
}
