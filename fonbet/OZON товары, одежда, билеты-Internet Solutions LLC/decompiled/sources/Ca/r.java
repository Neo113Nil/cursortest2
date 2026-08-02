package Ca;

import S0.InterfaceC3978p0;
import coil.compose.AsyncImagePainter;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.compose.button.auth.VKIDSmallButtonState;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.xml.OneTap;
import e40.C6293a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes9.dex */
public final /* synthetic */ class r implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4621b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f4620a = i11;
        this.f4621b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$39$lambda$38;
        Unit SmallButtonContent$lambda$22$lambda$19$lambda$18;
        switch (this.f4620a) {
            case 0:
                Content$lambda$39$lambda$38 = OneTap.Content$lambda$39$lambda$38((InterfaceC3978p0) this.f4621b, (OneTapTitleScenario) obj);
                return Content$lambda$39$lambda$38;
            case 1:
                return F90.e.j0((F90.e) this.f4621b, (e40.c) obj);
            case 2:
                return NativeBridgeConfigurator.l((NativeBridgeConfigurator) this.f4621b, (C6293a) obj);
            case 3:
                SmallButtonContent$lambda$22$lambda$19$lambda$18 = VKIDButtonSmallKt.SmallButtonContent$lambda$22$lambda$19$lambda$18((VKIDSmallButtonState) this.f4621b, (AsyncImagePainter.State.Loading) obj);
                return SmallButtonContent$lambda$22$lambda$19$lambda$18;
            default:
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(url, "url");
                return Boolean.valueOf(((FintechWebViewFragmentBase) this.f4621b).N().w1(url));
        }
    }
}
