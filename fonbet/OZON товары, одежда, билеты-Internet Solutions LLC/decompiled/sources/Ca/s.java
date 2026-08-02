package Ca;

import S0.InterfaceC3978p0;
import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.exchanger.datapass.CbottomLifecycle2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes9.dex */
public final /* synthetic */ class s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4623b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f4622a = i11;
        this.f4623b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$49$lambda$48;
        Unit attachWebViewClient$lambda$21$lambda$20;
        switch (this.f4622a) {
            case 0:
                Content$lambda$49$lambda$48 = OneTap.Content$lambda$49$lambda$48((InterfaceC3978p0) this.f4623b, (GroupSubscriptionSnackbarHost) obj);
                return Content$lambda$49$lambda$48;
            case 1:
                attachWebViewClient$lambda$21$lambda$20 = FintechWebView.attachWebViewClient$lambda$21$lambda$20((FintechWebView) this.f4623b, ((Boolean) obj).booleanValue());
                return attachWebViewClient$lambda$21$lambda$20;
            case 2:
                return NativeBridgeConfigurator.d((NativeBridgeConfigurator) this.f4623b, (CbottomLifecycle2) obj);
            default:
                return ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.d0((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.f4623b, (e40.d) obj);
        }
    }
}
