package Q90;

import androidx.lifecycle.z0;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23102b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f23101a = i11;
        this.f23102b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VKIDApiService apiService$lambda$9;
        z0.b factory;
        Unit _init_$lambda$4;
        switch (this.f23101a) {
            case 0:
                return Boolean.valueOf(ru.ozon.fintech.settings.domain.a.a((ru.ozon.fintech.settings.domain.a) this.f23102b));
            case 1:
                return d70.k.m((d70.k) this.f23102b);
            case 2:
                apiService$lambda$9 = VKIDDepsProd.apiService$lambda$9((VKIDDepsProd) this.f23102b);
                return apiService$lambda$9;
            case 3:
                factory = ((QrScannerResultBottomSheet) this.f23102b).getFactory();
                return factory;
            case 4:
                _init_$lambda$4 = TextAreaWrapperView._init_$lambda$4((TextAreaWrapperView) this.f23102b);
                return _init_$lambda$4;
            default:
                return v50.j.e((v50.j) this.f23102b);
        }
    }
}
