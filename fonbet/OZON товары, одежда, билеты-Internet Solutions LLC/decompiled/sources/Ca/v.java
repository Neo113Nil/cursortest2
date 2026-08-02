package Ca;

import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class v implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onSnackbarHostChange$lambda$12;
        onSnackbarHostChange$lambda$12 = OneTap.onSnackbarHostChange$lambda$12((GroupSubscriptionSnackbarHost) obj);
        return onSnackbarHostChange$lambda$12;
    }
}
