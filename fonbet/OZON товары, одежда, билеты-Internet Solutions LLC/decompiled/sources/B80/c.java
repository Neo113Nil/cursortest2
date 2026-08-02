package B80;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.refresh.VKIDTokenRefresher;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3071b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f3070a = i11;
        this.f3071b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VKIDTokenRefresher vKIDTokenRefresher;
        switch (this.f3070a) {
            case 0:
                return ((FintechBankCardsPaymentWebViewFragment) this.f3071b).getFactory();
            default:
                vKIDTokenRefresher = VKIDDepsProd.tokenRefresher$lambda$16((VKIDDepsProd) this.f3071b);
                return vKIDTokenRefresher;
        }
    }
}
