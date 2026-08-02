package Ca;

import com.vk.id.AccessToken;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.ui.action.ActionTextItemState;
import ru.ozon.fintech.ui.action.ActionTextItemView;

/* loaded from: classes9.dex */
public final /* synthetic */ class j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4608b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f4607a = i11;
        this.f4608b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit Content$lambda$68$lambda$67;
        Unit bindState$lambda$1$lambda$0;
        switch (this.f4607a) {
            case 0:
                Content$lambda$68$lambda$67 = OneTap.Content$lambda$68$lambda$67((OneTap) this.f4608b, (OneTapOAuth) obj, (AccessToken) obj2);
                return Content$lambda$68$lambda$67;
            default:
                bindState$lambda$1$lambda$0 = ActionTextItemView.bindState$lambda$1$lambda$0((ActionTextItemState) this.f4608b, (Function2) obj, (String) obj2);
                return bindState$lambda$1$lambda$0;
        }
    }
}
