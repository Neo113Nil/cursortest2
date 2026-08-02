package a50;

import android.content.pm.PackageInfo;
import androidx.lifecycle.z0;
import com.vk.id.network.useragent.UserAgentProvider;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import ru.ozon.fintech.features.onboarding.presentation.RequestNotificationsFragment;

/* renamed from: a50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4949a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36267b;

    public /* synthetic */ C4949a(Object obj, int i11) {
        this.f36266a = i11;
        this.f36267b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        PackageInfo packageInfo_delegate$lambda$1;
        switch (this.f36266a) {
            case 0:
                factory = ((OnboardingSlidesV2Fragment) this.f36267b).getFactory();
                return factory;
            case 1:
                packageInfo_delegate$lambda$1 = UserAgentProvider.packageInfo_delegate$lambda$1((UserAgentProvider) this.f36267b);
                return packageInfo_delegate$lambda$1;
            default:
                return ((RequestNotificationsFragment) this.f36267b).getFactory();
        }
    }
}
