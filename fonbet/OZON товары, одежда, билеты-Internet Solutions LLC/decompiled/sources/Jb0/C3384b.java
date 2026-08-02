package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.R;

/* renamed from: Jb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3384b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f14395a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f14396b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f14397c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f14398d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f14399e;

    private C3384b(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.f14395a = frameLayout;
        this.f14396b = appCompatImageView;
        this.f14397c = frameLayout2;
        this.f14398d = swipeRefreshLayout;
        this.f14399e = appCompatTextView;
    }

    @NonNull
    public static C3384b b(@NonNull LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_ozon_id_debug, (ViewGroup) null, false);
        int i11 = R.id.backButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.backButton, inflate);
        if (appCompatImageView != null) {
            i11 = R.id.ozonIdDebugFragmentContainerView;
            if (((FrameLayout) C2548q.d(R.id.ozonIdDebugFragmentContainerView, inflate)) != null) {
                i11 = R.id.ozonIdDebugNotifierContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.ozonIdDebugNotifierContainer, inflate);
                if (frameLayout != null) {
                    FrameLayout frameLayout2 = (FrameLayout) inflate;
                    i11 = R.id.ozonIdDebugSwipeRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C2548q.d(R.id.ozonIdDebugSwipeRefreshLayout, inflate);
                    if (swipeRefreshLayout != null) {
                        i11 = R.id.ozonIdDebugTitleTextView;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.ozonIdDebugTitleTextView, inflate);
                        if (appCompatTextView != null) {
                            i11 = R.id.ozonIdDebugToolbar;
                            if (((FrameLayout) C2548q.d(R.id.ozonIdDebugToolbar, inflate)) != null) {
                                return new C3384b(frameLayout2, appCompatImageView, frameLayout, swipeRefreshLayout, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f14395a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14395a;
    }
}
