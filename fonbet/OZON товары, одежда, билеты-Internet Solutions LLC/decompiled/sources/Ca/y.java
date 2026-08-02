package Ca;

import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onAuthParamsChange$lambda$3;
        onAuthParamsChange$lambda$3 = OneTap.onAuthParamsChange$lambda$3((VKIDAuthUiParams) obj);
        return onAuthParamsChange$lambda$3;
    }
}
