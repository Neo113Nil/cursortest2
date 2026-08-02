package Jb0;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.R;
import ru.ozon.id.antibot.errorView.AntibotErrorView;

/* renamed from: Jb0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3388f implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final SwipeRefreshLayout f14412a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AntibotErrorView f14413b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f14414c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f14415d;

    private C3388f(@NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull AntibotErrorView antibotErrorView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.f14412a = swipeRefreshLayout;
        this.f14413b = antibotErrorView;
        this.f14414c = frameLayout;
        this.f14415d = linearLayout;
    }

    @NonNull
    public static C3388f b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_antibot_error, viewGroup, false);
        int i11 = R.id.antibotErrorView;
        AntibotErrorView antibotErrorView = (AntibotErrorView) C2548q.d(R.id.antibotErrorView, inflate);
        if (antibotErrorView != null) {
            i11 = R.id.hostContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.hostContainer, inflate);
            if (frameLayout != null) {
                i11 = R.id.screenContainer;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.screenContainer, inflate);
                if (linearLayout != null) {
                    return new C3388f((SwipeRefreshLayout) inflate, antibotErrorView, frameLayout, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final SwipeRefreshLayout a() {
        return this.f14412a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f14412a;
    }
}
