package D90;

import S0.A1;
import com.vk.id.onetap.compose.button.auth.VKIDButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6201b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f6200a = i11;
        this.f6201b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean attachWebViewClient$lambda$21$lambda$12;
        Unit RightIconBox$lambda$19$lambda$18;
        switch (this.f6200a) {
            case 0:
                String[] list = ((FintechNativeBridgeTestingFragment) this.f6201b).requireContext().getAssets().list((String) obj);
                return list == null ? new String[0] : list;
            case 1:
                attachWebViewClient$lambda$21$lambda$12 = FintechWebView.attachWebViewClient$lambda$21$lambda$12((FintechWebView) this.f6201b, (String) obj);
                return Boolean.valueOf(attachWebViewClient$lambda$21$lambda$12);
            default:
                RightIconBox$lambda$19$lambda$18 = VKIDButtonKt.RightIconBox$lambda$19$lambda$18((A1) this.f6201b, (InterfaceC7825i0) obj);
                return RightIconBox$lambda$19$lambda$18;
        }
    }
}
