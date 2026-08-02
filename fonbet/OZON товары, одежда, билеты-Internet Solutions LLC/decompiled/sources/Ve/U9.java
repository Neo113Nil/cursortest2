package Ve;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class U9 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f30107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f30108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(RedirectActivity redirectActivity, Wj wj2) {
        super(0);
        this.f30107b = redirectActivity;
        this.f30108c = wj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RedirectActivity redirectActivity = this.f30107b;
        WebView webView = redirectActivity.f98837f;
        if (webView != null) {
            webView.loadUrl(((C4406l6) this.f30108c).f31511a);
        }
        C4744x c4744x = redirectActivity.f98833b;
        if (c4744x == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        CountDownTimerC4352ja countDownTimerC4352ja = new CountDownTimerC4352ja(c4744x.f32405J, c4744x.f32406K, c4744x.f32407L, c4744x.f32408M);
        c4744x.f32404I = countDownTimerC4352ja;
        countDownTimerC4352ja.start();
        return Unit.f71690a;
    }
}
