package Ca;

import com.vk.id.auth.AuthCodeData;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.ui.qrcode.QrCodeView;

/* renamed from: Ca.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2732A implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4589a;

    public /* synthetic */ C2732A(int i11) {
        this.f4589a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit onAuthCode$lambda$5;
        Unit lambda$1$lambda$0;
        switch (this.f4589a) {
            case 0:
                onAuthCode$lambda$5 = OneTap.onAuthCode$lambda$5((AuthCodeData) obj, ((Boolean) obj2).booleanValue());
                return onAuthCode$lambda$5;
            default:
                lambda$1$lambda$0 = QrCodeView.lambda$1$lambda$0((Function2) obj, (String) obj2);
                return lambda$1$lambda$0;
        }
    }
}
