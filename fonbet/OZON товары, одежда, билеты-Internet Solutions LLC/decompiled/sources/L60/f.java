package L60;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16586b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f16585a = i11;
        this.f16586b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit attachWebViewClient$lambda$21$lambda$16;
        switch (this.f16585a) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                attachWebViewClient$lambda$21$lambda$16 = FintechWebView.attachWebViewClient$lambda$21$lambda$16((FintechWebView) this.f16586b, (String) obj, booleanValue);
                return attachWebViewClient$lambda$21$lambda$16;
            default:
                ((FintechWebViewFragmentBase) this.f16586b).N().r1((WebResourceRequest) obj, (WebResourceResponse) obj2);
                return Unit.f71690a;
        }
    }
}
