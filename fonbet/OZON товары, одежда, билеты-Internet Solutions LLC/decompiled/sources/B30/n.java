package B30;

import S0.InterfaceC3978p0;
import com.squareup.moshi.Moshi;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import java.security.KeyStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.base.adapters.EnumCaseInSensitiveAdapter;
import ru.ozon.fintech.settings.repository.adapters.SettingsJSONObjectAdapter;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2434a;

    public /* synthetic */ n(int i11) {
        this.f2434a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3978p0 GroupSubscriptionSheet$lambda$7$lambda$6;
        switch (this.f2434a) {
            case 0:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 1:
                Moshi.a aVar = new Moshi.a();
                aVar.c(S90.e.class, new EnumCaseInSensitiveAdapter(S90.e.class, S90.e.HARD));
                aVar.b(new SettingsJSONObjectAdapter());
                Moshi moshi = new Moshi(aVar);
                Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
                return moshi;
            default:
                GroupSubscriptionSheet$lambda$7$lambda$6 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$7$lambda$6();
                return GroupSubscriptionSheet$lambda$7$lambda$6;
        }
    }
}
