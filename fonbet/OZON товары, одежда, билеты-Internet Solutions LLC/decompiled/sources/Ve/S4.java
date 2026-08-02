package Ve;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class S4 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f29945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(RedirectActivity redirectActivity) {
        super(1);
        this.f29945b = redirectActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Wj wj2 = (Wj) obj;
        boolean z11 = wj2 instanceof C4358jg;
        RedirectActivity redirectActivity = this.f29945b;
        if (z11) {
            C10727i.c(androidx.lifecycle.K.a(redirectActivity), null, null, new K2(redirectActivity, null), 3);
        } else if (wj2 instanceof C4406l6) {
            WebView webView = redirectActivity.f98837f;
            if (webView != null) {
                webView.setWebViewClient(new P8(redirectActivity, wj2));
            }
            Intrinsics.checkNotNullParameter(new C4611s9(0, redirectActivity, wj2), "block");
            U9 block = new U9(redirectActivity, wj2);
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke();
        }
        return Unit.f71690a;
    }
}
