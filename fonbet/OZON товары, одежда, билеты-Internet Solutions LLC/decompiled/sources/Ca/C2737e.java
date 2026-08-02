package Ca;

import c9.InterfaceC5770b;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;

/* renamed from: Ca.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2737e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4598a;

    public /* synthetic */ C2737e(int i11) {
        this.f4598a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onSuccessSubscribingToGroup$lambda$10;
        InterfaceC5770b textRecognizer_delegate$lambda$5;
        switch (this.f4598a) {
            case 0:
                onSuccessSubscribingToGroup$lambda$10 = OneTap.onSuccessSubscribingToGroup$lambda$10();
                return onSuccessSubscribingToGroup$lambda$10;
            default:
                textRecognizer_delegate$lambda$5 = MlkitCameraScanner.textRecognizer_delegate$lambda$5();
                return textRecognizer_delegate$lambda$5;
        }
    }
}
