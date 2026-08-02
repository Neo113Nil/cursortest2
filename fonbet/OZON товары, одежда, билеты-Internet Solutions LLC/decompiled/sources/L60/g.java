package L60;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FintechWebView f16587a;

    public /* synthetic */ g(FintechWebView fintechWebView) {
        this.f16587a = fintechWebView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit attachWebViewClient$lambda$21$lambda$17;
        attachWebViewClient$lambda$21$lambda$17 = FintechWebView.attachWebViewClient$lambda$21$lambda$17(this.f16587a, (WebResourceRequest) obj, (WebResourceError) obj2);
        return attachWebViewClient$lambda$21$lambda$17;
    }
}
