package Ve;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.t4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4635t4 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32084a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f32085b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f32086c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f32087d;

    /* renamed from: e, reason: collision with root package name */
    public final WebView f32088e;

    public C4635t4(ConstraintLayout constraintLayout, ProgressBar progressBar, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton, WebView webView) {
        this.f32084a = constraintLayout;
        this.f32085b = progressBar;
        this.f32086c = sPayTextView;
        this.f32087d = sPayMaterialButton;
        this.f32088e = webView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f32084a;
    }
}
