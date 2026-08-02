package J90;

import android.content.Context;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.refreshuser.VKIDUserRefresher;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14261b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f14260a = i11;
        this.f14261b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VKIDUserRefresher userRefresher$lambda$18;
        Object obj = this.f14261b;
        switch (this.f14260a) {
            case 0:
                int i11 = StatusResultView.f97006n;
                return Integer.valueOf(androidx.core.content.a.getColor((Context) obj, R.color.green_600));
            default:
                userRefresher$lambda$18 = VKIDDepsProd.userRefresher$lambda$18((VKIDDepsProd) obj);
                return userRefresher$lambda$18;
        }
    }
}
