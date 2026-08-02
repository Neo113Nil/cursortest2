package R90;

import com.vk.id.internal.auth.app.SilentAuthProviderData;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.VkAuthProviderInfo;
import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.models.Pin;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.columnV20.ColumnV20State;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24829a;

    public /* synthetic */ d(int i11) {
        this.f24829a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit create$lambda$0;
        SilentAuthProviderData silentAuthServices$lambda$3;
        Unit OAuthShown$lambda$8$lambda$7$lambda$5$lambda$3;
        switch (this.f24829a) {
            case 0:
                Pin it = (Pin) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getHash();
            case 1:
                create$lambda$0 = ColumnV20State.Companion.create$lambda$0((ActionResult2UI) obj);
                return create$lambda$0;
            case 2:
                silentAuthServices$lambda$3 = SilentAuthServicesProvider.getSilentAuthServices$lambda$3((VkAuthProviderInfo) obj);
                return silentAuthServices$lambda$3;
            default:
                OAuthShown$lambda$8$lambda$7$lambda$5$lambda$3 = OAuthListWidgetAnalytics.OAuthShown$lambda$8$lambda$7$lambda$5$lambda$3((Throwable) obj);
                return OAuthShown$lambda$8$lambda$7$lambda$5$lambda$3;
        }
    }
}
