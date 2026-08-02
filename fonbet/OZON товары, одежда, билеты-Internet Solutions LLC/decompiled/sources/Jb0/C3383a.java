package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* renamed from: Jb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3383a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14393a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f14394b;

    private C3383a(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.f14393a = frameLayout;
        this.f14394b = progressBar;
    }

    @NonNull
    public static C3383a b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_cross_app, (ViewGroup) null, false);
        ProgressBar progressBar = (ProgressBar) C2548q.d(R.id.crossAppLoaderView, inflate);
        if (progressBar != null) {
            return new C3383a((FrameLayout) inflate, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.crossAppLoaderView)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f14393a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f14393a;
    }
}
