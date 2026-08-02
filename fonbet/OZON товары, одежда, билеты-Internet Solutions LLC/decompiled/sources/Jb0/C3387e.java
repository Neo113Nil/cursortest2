package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.web.OzonIdWebView;

/* renamed from: Jb0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3387e implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14409a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14410b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final OzonIdWebView f14411c;

    private C3387e(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull OzonIdWebView ozonIdWebView) {
        this.f14409a = frameLayout;
        this.f14410b = appCompatImageView;
        this.f14411c = ozonIdWebView;
    }

    @NonNull
    public static C3387e b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_abt_captcha, viewGroup, false);
        int i11 = R.id.closeButtonImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.closeButtonImageView, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.webView;
            OzonIdWebView ozonIdWebView = (OzonIdWebView) C2548q.d(R.id.webView, inflate);
            if (ozonIdWebView != null) {
                return new C3387e((FrameLayout) inflate, appCompatImageView, ozonIdWebView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f14409a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14409a;
    }
}
