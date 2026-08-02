package Ca;

import S0.InterfaceC3978p0;
import android.webkit.WebView;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4615b;

    public /* synthetic */ o(Object obj, int i11) {
        this.f4614a = i11;
        this.f4615b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Content$lambda$24$lambda$23;
        switch (this.f4614a) {
            case 0:
                Content$lambda$24$lambda$23 = OneTap.Content$lambda$24$lambda$23((InterfaceC3978p0) this.f4615b, ((Boolean) obj).booleanValue());
                return Content$lambda$24$lambda$23;
            case 1:
                return F90.e.i0((F90.e) this.f4615b);
            case 2:
                ((Boolean) obj).getClass();
                return y70.f.f0((y70.f) this.f4615b);
            default:
                WebView webview = (WebView) obj;
                Intrinsics.checkNotNullParameter(webview, "webview");
                ((FintechWebViewFragmentBase) this.f4615b).N().C1(webview);
                return Unit.f71690a;
        }
    }
}
