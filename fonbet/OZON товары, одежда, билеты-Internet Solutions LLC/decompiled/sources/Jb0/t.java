package Jb0;

import B1.C2548q;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.web.OzonIdWebView;

/* loaded from: classes3.dex */
public final class t implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14546a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14547b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14548c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final OzonIdWebView f14549d;

    private t(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull OzonIdWebView ozonIdWebView) {
        this.f14546a = frameLayout;
        this.f14547b = appCompatImageView;
        this.f14548c = appCompatImageView2;
        this.f14549d = ozonIdWebView;
    }

    @NonNull
    public static t a(@NonNull View view) {
        int i11 = R.id.backButtonImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.backButtonImageView, view);
        if (appCompatImageView != null) {
            i11 = R.id.closeButtonImageView;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(R.id.closeButtonImageView, view);
            if (appCompatImageView2 != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                OzonIdWebView ozonIdWebView = (OzonIdWebView) C2548q.d(R.id.webView, view);
                if (ozonIdWebView != null) {
                    return new t(frameLayout, appCompatImageView, appCompatImageView2, ozonIdWebView);
                }
                i11 = R.id.webView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14546a;
    }
}
