package L60;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FintechWebView f16588a;

    public /* synthetic */ h(FintechWebView fintechWebView) {
        this.f16588a = fintechWebView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit attachWebViewClient$lambda$21$lambda$18;
        attachWebViewClient$lambda$21$lambda$18 = FintechWebView.attachWebViewClient$lambda$21$lambda$18(this.f16588a, (WebResourceRequest) obj, (WebResourceResponse) obj2);
        return attachWebViewClient$lambda$21$lambda$18;
    }
}
