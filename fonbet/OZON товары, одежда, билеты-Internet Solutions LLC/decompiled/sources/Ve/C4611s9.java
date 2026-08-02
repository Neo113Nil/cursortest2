package Ve;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ol0.C8751c;
import rl0.C9300k;
import rl0.C9313y;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.s9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4611s9 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4611s9(int i11, Object obj, Object obj2) {
        super(0);
        this.f32031b = i11;
        this.f32032c = obj;
        this.f32033d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32031b) {
            case 0:
                RedirectActivity redirectActivity = (RedirectActivity) this.f32032c;
                WebView webView = redirectActivity.f98837f;
                if (webView != null) {
                    webView.loadUrl(((C4406l6) ((Wj) this.f32033d)).f31511a);
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
            default:
                C9300k c9300k = (C9300k) this.f32032c;
                c9300k.getClass();
                C8751c.a(c9300k.f83689d, (C9313y) this.f32033d);
                return Unit.f71690a;
        }
    }
}
