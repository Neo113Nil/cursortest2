package Q90;

import Q90.c;
import S0.InterfaceC3978p0;
import com.squareup.moshi.D;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.settings.models.FeatureFlag;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23052a;

    public /* synthetic */ b(int i11) {
        this.f23052a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3978p0 GroupSubscriptionSheet$lambda$9$lambda$8;
        switch (this.f23052a) {
            case 0:
                int i11 = c.f23057s;
                return c.a.a().d(D.e(List.class, FeatureFlag.class));
            case 1:
                GroupSubscriptionSheet$lambda$9$lambda$8 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$9$lambda$8();
                return GroupSubscriptionSheet$lambda$9$lambda$8;
            default:
                return Unit.f71690a;
        }
    }
}
