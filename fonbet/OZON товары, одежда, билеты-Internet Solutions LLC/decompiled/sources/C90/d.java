package C90;

import S0.InterfaceC3978p0;
import android.view.MenuItem;
import coil.compose.AsyncImagePainter;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.compose.button.auth.VKIDSmallButtonState;
import com.vk.id.onetap.xml.OneTap;
import e40.C6293a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4511b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f4510a = i11;
        this.f4511b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$44$lambda$43;
        Unit attachWebViewClient$lambda$21$lambda$19;
        Unit SmallButtonContent$lambda$22$lambda$21$lambda$20;
        switch (this.f4510a) {
            case 0:
                return FintechLogCatFragment.t((FintechLogCatFragment) this.f4511b, (MenuItem) obj);
            case 1:
                Content$lambda$44$lambda$43 = OneTap.Content$lambda$44$lambda$43((InterfaceC3978p0) this.f4511b, (String) obj);
                return Content$lambda$44$lambda$43;
            case 2:
                return F90.e.l0((F90.e) this.f4511b, (C6293a) obj);
            case 3:
                attachWebViewClient$lambda$21$lambda$19 = FintechWebView.attachWebViewClient$lambda$21$lambda$19((FintechWebView) this.f4511b, (String) obj);
                return attachWebViewClient$lambda$21$lambda$19;
            case 4:
                return NativeBridgeConfigurator.h((NativeBridgeConfigurator) this.f4511b, (ActionResult2) obj);
            default:
                SmallButtonContent$lambda$22$lambda$21$lambda$20 = VKIDButtonSmallKt.SmallButtonContent$lambda$22$lambda$21$lambda$20((VKIDSmallButtonState) this.f4511b, (AsyncImagePainter.State.Success) obj);
                return SmallButtonContent$lambda$22$lambda$21$lambda$20;
        }
    }
}
