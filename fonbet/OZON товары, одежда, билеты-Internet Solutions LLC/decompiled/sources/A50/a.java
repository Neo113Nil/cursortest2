package A50;

import com.vk.id.AuthOptionsCreator;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment;
import ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;
import v50.D;
import x30.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f452b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f451a = i11;
        this.f452b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AuthOptionsCreator authOptionsCreator_delegate$lambda$14;
        Unit alternatePressed$lambda$17;
        switch (this.f451a) {
            case 0:
                return c.b((c) this.f452b);
            case 1:
                return ((WalletManager) this.f452b).getMirPayWalletManager();
            case 2:
                authOptionsCreator_delegate$lambda$14 = VKIDDepsProd.authOptionsCreator_delegate$lambda$14((VKIDDepsProd) this.f452b);
                return authOptionsCreator_delegate$lambda$14;
            case 3:
                return D.e((D) this.f452b);
            case 4:
                return f.a((f) this.f452b);
            case 5:
                return AntifraudJsonFragment.u((AntifraudJsonFragment) this.f452b);
            case 6:
                return ((FintechCameraSettingsFragment) this.f452b).getFactory();
            default:
                alternatePressed$lambda$17 = OneTapAnalytics.alternatePressed$lambda$17((String) this.f452b);
                return alternatePressed$lambda$17;
        }
    }
}
