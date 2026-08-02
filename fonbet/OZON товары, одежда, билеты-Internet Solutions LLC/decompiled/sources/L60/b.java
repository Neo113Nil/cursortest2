package L60;

import S0.A1;
import com.vk.id.onetap.compose.button.auth.VKIDButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import p40.l;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16581b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f16580a = i11;
        this.f16581b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit configure$lambda$6$lambda$4$lambda$2;
        Unit TextBox$lambda$14$lambda$13;
        switch (this.f16580a) {
            case 0:
                configure$lambda$6$lambda$4$lambda$2 = FintechWebView.configure$lambda$6$lambda$4$lambda$2((FintechWebView) this.f16581b, (String) obj);
                return configure$lambda$6$lambda$4$lambda$2;
            case 1:
                return NativeBridgeConfigurator.e((NativeBridgeConfigurator) this.f16581b, ((Boolean) obj).booleanValue());
            case 2:
                return l.d((l) this.f16581b, (ActionResult2) obj);
            default:
                TextBox$lambda$14$lambda$13 = VKIDButtonKt.TextBox$lambda$14$lambda$13((A1) this.f16581b, (InterfaceC7825i0) obj);
                return TextBox$lambda$14$lambda$13;
        }
    }
}
