package Ca;

import com.vk.id.VKIDAuthFail;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final /* synthetic */ class B implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit onFail$lambda$6;
        onFail$lambda$6 = OneTap.onFail$lambda$6((OneTapOAuth) obj, (VKIDAuthFail) obj2);
        return onFail$lambda$6;
    }
}
