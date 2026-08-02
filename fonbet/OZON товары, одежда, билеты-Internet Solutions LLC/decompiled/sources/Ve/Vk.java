package Ve;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Vk implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30207a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f30208b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f30209c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f30210d;

    /* renamed from: e, reason: collision with root package name */
    public final CardView f30211e;

    /* renamed from: f, reason: collision with root package name */
    public final WebView f30212f;

    public Vk(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, SPayTextView sPayTextView, CardView cardView, WebView webView) {
        this.f30207a = constraintLayout;
        this.f30208b = appCompatImageView;
        this.f30209c = constraintLayout2;
        this.f30210d = sPayTextView;
        this.f30211e = cardView;
        this.f30212f = webView;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f30207a;
    }
}
