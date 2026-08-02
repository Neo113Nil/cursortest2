package Ca;

import com.vk.id.AccessToken;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final /* synthetic */ class z implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit onAuth$lambda$4;
        onAuth$lambda$4 = OneTap.onAuth$lambda$4((OneTapOAuth) obj, (AccessToken) obj2);
        return onAuth$lambda$4;
    }
}
