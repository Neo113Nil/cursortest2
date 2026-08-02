package Ue0;

import com.yandex.mapkit.map.Map;
import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModelImpl;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDO;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceRepository;

/* renamed from: Ue0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4066a implements Map.CameraCallback, qc.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27643b;

    public /* synthetic */ C4066a(Function1 function1, int i11) {
        this.f27642a = i11;
        this.f27643b = function1;
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Boolean _init_$lambda$0;
        C bindInitial$lambda$1;
        CreateServiceDO createService$lambda$1$lambda$0;
        switch (this.f27642a) {
            case 1:
                _init_$lambda$0 = SellerCarouselAdapter._init_$lambda$0(this.f27643b, obj);
                return _init_$lambda$0;
            case 2:
                bindInitial$lambda$1 = SearchSheetViewModelImpl.bindInitial$lambda$1(this.f27643b, obj);
                return bindInitial$lambda$1;
            default:
                createService$lambda$1$lambda$0 = CreateServiceRepository.createService$lambda$1$lambda$0(this.f27643b, obj);
                return createService$lambda$1$lambda$0;
        }
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public void onMoveFinished(boolean z11) {
        Function1 function1 = this.f27643b;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }
}
