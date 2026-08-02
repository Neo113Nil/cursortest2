package Ca;

import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class l implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onFailSubscribingToGroup$lambda$11;
        onFailSubscribingToGroup$lambda$11 = OneTap.onFailSubscribingToGroup$lambda$11((VKIDGroupSubscriptionFail) obj);
        return onFailSubscribingToGroup$lambda$11;
    }
}
