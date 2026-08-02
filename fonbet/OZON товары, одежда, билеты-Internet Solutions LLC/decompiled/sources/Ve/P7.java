package Ve;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;

/* loaded from: classes10.dex */
public final class P7 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29678a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f29679b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f29680c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f29681d;

    public P7(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView, SPayMaterialButton sPayMaterialButton) {
        this.f29678a = constraintLayout;
        this.f29679b = progressBar;
        this.f29680c = webView;
        this.f29681d = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29678a;
    }
}
