package Ca;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.vk.id.VKIDAuthFail;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes9.dex */
public final /* synthetic */ class g implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4602b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f4601a = i11;
        this.f4602b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit Content$lambda$61$lambda$60;
        switch (this.f4601a) {
            case 0:
                Content$lambda$61$lambda$60 = OneTap.Content$lambda$61$lambda$60((OneTap) this.f4602b, (OneTapOAuth) obj, (VKIDAuthFail) obj2);
                return Content$lambda$61$lambda$60;
            default:
                return FintechWebViewFragmentBase.x((FintechWebViewFragmentBase) this.f4602b, (ValueCallback) obj, (WebChromeClient.FileChooserParams) obj2);
        }
    }
}
