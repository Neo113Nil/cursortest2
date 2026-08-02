package Sq;

import TZ.b;
import TZ.e;
import java.util.concurrent.Callable;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.ApplySearchFiltersRequest;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFilterShortRequestInfo;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;

/* renamed from: Sq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class CallableC4012a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26351c;

    public /* synthetic */ CallableC4012a(int i11, Object obj, Object obj2) {
        this.f26349a = i11;
        this.f26350b = obj;
        this.f26351c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ApplySearchFiltersRequest executeApplySearchFilters$lambda$0;
        String appendUrl;
        switch (this.f26349a) {
            case 0:
                executeApplySearchFilters$lambda$0 = FilterValuesRepository.executeApplySearchFilters$lambda$0((FilterValuesRepository) this.f26350b, (ApplyFilterShortRequestInfo) this.f26351c);
                return executeApplySearchFilters$lambda$0;
            case 1:
                return e.e((e) this.f26350b, (b) this.f26351c);
            default:
                appendUrl = ((CouponActivationRepositoryImpl) this.f26350b).appendUrl((String) this.f26351c);
                return appendUrl;
        }
    }
}
