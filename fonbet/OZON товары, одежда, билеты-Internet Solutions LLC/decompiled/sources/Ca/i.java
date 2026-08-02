package Ca;

import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.VkAuthProviderInfo;
import com.vk.id.onetap.xml.OneTap;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;

/* loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4606b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f4605a = i11;
        this.f4606b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$65$lambda$64;
        boolean excludeCurrentApp$lambda$4;
        switch (this.f4605a) {
            case 0:
                Content$lambda$65$lambda$64 = OneTap.Content$lambda$65$lambda$64((OneTap) this.f4606b, (VKIDGroupSubscriptionFail) obj);
                return Content$lambda$65$lambda$64;
            case 1:
                InputStream open = ((FintechNativeBridgeTestingFragment) this.f4606b).requireContext().getAssets().open((String) obj);
                Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                return open;
            case 2:
                return NativeBridgeConfigurator.j((NativeBridgeConfigurator) this.f4606b, ((Boolean) obj).booleanValue());
            default:
                excludeCurrentApp$lambda$4 = SilentAuthServicesProvider.excludeCurrentApp$lambda$4((SilentAuthServicesProvider) this.f4606b, (VkAuthProviderInfo) obj);
                return Boolean.valueOf(excludeCurrentApp$lambda$4);
        }
    }
}
