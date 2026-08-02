package H30;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteInteractor;
import ru.ozon.fintech.features.camera.scanners.service.SaluteQrService;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10567a;

    public /* synthetic */ v(int i11) {
        this.f10567a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SaluteInteractor saluteInteractor_delegate$lambda$2;
        switch (this.f10567a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                saluteInteractor_delegate$lambda$2 = SaluteQrService.saluteInteractor_delegate$lambda$2();
                return saluteInteractor_delegate$lambda$2;
        }
    }
}
