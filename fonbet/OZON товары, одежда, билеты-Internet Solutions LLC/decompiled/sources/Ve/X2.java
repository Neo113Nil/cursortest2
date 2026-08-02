package Ve;

import android.net.Uri;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class X2 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bc f30318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X2(Bc bc2, int i11) {
        super(1);
        this.f30317b = i11;
        this.f30318c = bc2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30317b) {
            case 0:
                Zi it = (Zi) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((N9) ((J4) this.f30318c).u()).e0(new Ai(it));
                return Unit.f71690a;
            default:
                Uri uri = (Uri) obj;
                H3 h32 = (H3) this.f30318c;
                if (uri == null) {
                    X4.a aVar = h32.f28693b;
                    if (aVar == null) {
                        throw M7.f29463a;
                    }
                    C4635t4 c4635t4 = (C4635t4) aVar;
                    c4635t4.f32088e.setVisibility(8);
                    c4635t4.f32086c.setVisibility(0);
                    C10727i.c(androidx.lifecycle.K.a(h32), null, null, new A2(h32, null, 0), 3);
                } else {
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
                    h32.f29114d = uri2;
                    X4.a aVar2 = h32.f28693b;
                    if (aVar2 == null) {
                        throw M7.f29463a;
                    }
                    C4635t4 c4635t42 = (C4635t4) aVar2;
                    c4635t42.f32086c.setVisibility(8);
                    WebView webView = c4635t42.f32088e;
                    webView.setVisibility(0);
                    webView.setWebViewClient(new C4201e3(h32, h32.requireContext()));
                    webView.loadUrl(uri2);
                }
                return Unit.f71690a;
        }
    }
}
